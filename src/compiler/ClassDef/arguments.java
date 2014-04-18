package compiler.ClassDef;

import compiler.Semantic.Table;

public class arguments extends root
{
	public arguments(){}
	public int checkSon() throws Exception
	{
		for (int i = 0; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			if (son.checkSon() == WA) return WA;
			returnVec.add(son.returnVec.get(2));
		}
		return AC;
	}
}
