package compiler.ClassDef;

import compiler.Semantic.Table;

public class constant_expression extends root
{
	public constant_expression(){}
	public int checkSon() throws Exception
	{
		
		son = (root)vec.get(0);
		if (son.checkSon() == WA) return WA;
		for (int i = 0; i < 4; ++i)
			returnVec.add(son.returnVec.get(i));
		if (!(boolean)returnVec.get(0)) return WA;
		return AC;
	}
}
