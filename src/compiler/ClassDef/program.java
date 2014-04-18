package compiler.ClassDef;

import compiler.Semantic.Table;

public class program extends root
{
	public program(){}
	public int checkSon() throws Exception
	{
		for (int i = 0; i < vec.size(); ++i)
		{
			root son = (root)vec.get(i);
			if (son.checkSon() == WA) return WA;
		}
		return AC;
	}
}
