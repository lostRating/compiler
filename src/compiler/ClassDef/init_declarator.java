package compiler.ClassDef;

import compiler.Semantic.*;
import compiler.Type.Array;
import compiler.Type.Int;
import compiler.Type.Name;
import compiler.Type.Pointer;
import compiler.Type.Type;
import compiler.main.main;

public class init_declarator extends root
{
	public init_declarator(){}
	public int checkSon(Type type) throws Exception
	{

		son = (root)vec.get(0);
		if (son.checkSon(type) == WA) return WA;
		Type newType = (Type)son.returnVec.get(0);
		String name = (String)son.returnVec.get(1);
		
/*		Type tmp2 = (Type)main.F.get(Symbol.symbol(name));
		if (tmp2 != null && tmp2.scope == main.scope) return WA;
		if (newType instanceof Name) return WA;
		main.F.put(Symbol.symbol(name), newType);*/
		if (!addSymbol(main.F, newType, name, true)) return WA;
		
		returnVec.add(son.returnVec.get(0));
		returnVec.add(son.returnVec.get(1));
		
		if (vec.size() == 1) return AC;
		
		son = (root)vec.get(1);
		if (son.checkSon() == WA) return WA;
		Type type2 = (Type)son.returnVec.get(0);
		
		if (!typeToType(type, type2)) return WA;
		
		return AC;
	}
}
