package compiler.ClassDef;

import compiler.Semantic.Table;

public class expression extends root
{
	public expression(){}
	public int checkSon() throws Exception
	{
		for (int i = 0; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			if (son.checkSon() == WA) return WA;
			if (i == 0)
				for (int j = 0; j < 4; ++j)
					returnVec.add(son.returnVec.get(j));
		}
		return AC;
	}
}
