package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Pointer;
import compiler.Type.Type;
import compiler.main.main;

public class plain_declarator extends root
{
	public plain_declarator(){}
	public void checkSon(Type type) throws Exception
	{
		son = (root)vec.get(0);
		if (son.s.equals("*"))
		{
			son = (root)vec.get(1);
			Type newType = new Pointer(type, "GXX_" + String.valueOf(main.noName++));
			son.checkSon(newType);
			returnVec.add(son.returnVec.get(0));
			returnVec.add(son.returnVec.get(1));
		}
		else
		{
			son.checkSon();
			returnVec.add(type);
			returnVec.add(son.returnVec.get(1));
		}
	}
}
