package compiler.ClassDef;

import compiler.Semantic.Table;

public class parameters extends root
{
	//return SymbolList Type
	public parameters(){}
	public int checkSon() throws Exception
	{
		for (int i = 0; i < vec.size(); ++i)
		{
			root son = (root)vec.get(i);
			if (son.checkSon() == WA) return WA;
			returnVec.add(son.returnVec.get(0));
			returnVec.add(son.returnVec.get(1));
		}
		return AC;
	}
}
