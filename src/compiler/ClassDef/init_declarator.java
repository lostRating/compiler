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
	public void checkSon(Type type) throws Exception
	{

		son = (root)vec.get(0);
		son.checkSon(type);
		
		addquad(son);
		
		Type newType = (Type)son.returnVec.get(0);
		String name = (String)son.returnVec.get(1);
		
		addSymbol(main.F, newType, name, true);
		
		returnVec.add(son.returnVec.get(0));
		returnVec.add(son.returnVec.get(1));
		
		if (vec.size() == 1)
		{
			if (main.scope == 0)
				data.add("  " + new __Label(name).print() + ": .space " + newType.size);
			return;
		}
		
		son = (root)vec.get(1);
		son.checkSon();
		Type type2 = (Type)son.returnVec.get(0);
		
		if (!typeToType(newType, type2)) throw new Exception("init_declarator");
	}
}
