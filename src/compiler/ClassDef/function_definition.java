package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.main.main;
import compiler.Semantic.*;

public class function_definition extends root
{
	public function_definition(){}
	public int checkSon() throws Exception
	{
		son = (root)vec.get(0);
		if (son.checkSon() == WA) return WA;
		Type returnType = (Type)son.returnVec.get(0);

		son = (root)vec.get(1);
		if (son.checkSon(returnType) == WA) return WA;
		returnType = (Type)son.returnVec.get(0);
		String functionName = (String)son.returnVec.get(1);
		
		Vector argumentType = new Vector();
		if (vec.size() == 4)
		{
			son = (root)vec.get(2);
			if (son.checkSon() == WA) return WA;
			argumentType = son.returnVec;
		}
		/*Type tmp = (Type)main.F.get(Symbol.symbol(functionName));
		if (tmp != null && tmp.scope == main.scope) return WA;
		main.F.put(Symbol.symbol(functionName), type);*/
		if (returnType instanceof Name) return WA;
		Type type = new Function(returnType, argumentType, functionName);
		if (!addSymbol(main.F, type, functionName, false)) return WA;
		
		main.func = (Function)type;
		
		beginScope();
		
		for (int i = 0; i < argumentType.size(); i += 2)
		{
			String name = (String)argumentType.get(i + 1);
			Type type2 = (Type)argumentType.get(i);
			/*Type tmp2 = (Type)main.F.get(Symbol.symbol(name));
			if (tmp2 != null && tmp2.scope == main.scope) return WA;
			if (type2 instanceof Name) return WA;
			main.F.put(Symbol.symbol(name), type2);*/
			if (!addSymbol(main.F, type2, name, true)) return WA;
		}
		
		son = (root)vec.get(vec.size() - 1);
		if (son.checkSon() == WA) return WA;
		
		endScope();
		
		main.func = null;
		
		return AC;
	}
}
