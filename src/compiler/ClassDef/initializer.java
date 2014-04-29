package compiler.ClassDef;

import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.main.main;

public class initializer extends root
{
	public initializer(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		if (son.s.equals("ONE"))
		{
			son = (root)vec.get(1);
			son.checkSon();
			returnVec.add(son.returnVec.get(2));
		}
		else
		{
			for (int i = 0; i < vec.size(); ++i)
			{
				son = (root)vec.get(i);
				son.checkSon();
				returnVec.add(son.returnVec.get(0));
			}
			for (int i = 1; i < returnVec.size(); ++i)
				if (!sameType((Type) returnVec.get(i), (Type) returnVec.get(i - 1))) throw new Exception("initializer");
			Array array = new Array((Type) returnVec.get(0), returnVec.size(), "GXX_" + String.valueOf(main.noName++));
			returnVec.add(array);
		}
	}
}
