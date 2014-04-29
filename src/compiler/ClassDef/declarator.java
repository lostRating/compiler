package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Array;
import compiler.Type.Int;
import compiler.Type.Type;
import compiler.main.main;

public class declarator extends root
{
	public declarator(){}
	public void checkSon(Type type) throws Exception
	{
		son = (root)vec.get(0);
		if (son.s.equals("ONE"))
		{
			throw new Exception("declarator error");
		}
		else
		{
			son.checkSon(type);
			Type newType = (Type)son.returnVec.get(0);
			String Name = (String)son.returnVec.get(1);
			for (int i = vec.size() - 1; i > 0; --i)
			{
				son = (root)vec.get(i);
				son.checkSon();
				newType = new Array(newType, (int)son.returnVec.get(3), "GXX_" + String.valueOf(main.noName++));
			}
			returnVec.add(newType);
			returnVec.add(Name);
		}
	}
}
