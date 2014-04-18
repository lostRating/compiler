package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Pointer;
import compiler.Type.Type;
import compiler.main.main;

public class plain_declarator extends root
{
	public plain_declarator(){}
	public int checkSon(Type type) throws Exception
	{
		son = (root)vec.get(0);
		if (son.s.equals("*"))
		{
			son = (root)vec.get(1);
			Type newType = new Pointer(type, "GXX_" + String.valueOf(main.noName++));
			if (son.checkSon(newType) == WA) return WA;
			returnVec.add(son.returnVec.get(0));
			returnVec.add(son.returnVec.get(1));
		}
		else
		{
			if (son.checkSon() == WA) return WA;
			returnVec.add(type);
			returnVec.add(son.returnVec.get(1));
		}
		return AC;
	}
}
