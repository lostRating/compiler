package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.main.main;
import compiler.Semantic.*;

public class function_definition extends root
{
	public function_definition(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		son.checkSon();
		Type returnType = (Type)son.returnVec.get(0);

		son = (root)vec.get(1);
		son.checkSon(returnType);
		returnType = (Type)son.returnVec.get(0);
		String functionName = (String)son.returnVec.get(1);
		
		Vector argumentType = new Vector();
		if (vec.size() == 4)
		{
			son = (root)vec.get(2);
			son.checkSon();
			argumentType = son.returnVec;
		}
		if (returnType instanceof Name) throw new Exception("function_definition");
		Type type = new Function(returnType, argumentType, functionName);
		addSymbol(main.F, type, functionName, false);
		
		main.func = (Function)type;
		
		beginScope(false);
		
		for (int i = 0; i < argumentType.size(); i += 2)
		{
			String name = (String)argumentType.get(i + 1);
			Type type2 = (Type)argumentType.get(i);
			addSymbol(main.F, type2, name, true);
		}
		
		son = (root)vec.get(vec.size() - 1);
		son.checkSon();
		
		endScope(false);
		
		main.func = null;
	}
}
