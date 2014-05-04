package compiler.ClassDef;

import compiler.Semantic.Table;

public class program extends root
{
	public program(){}
	public void checkSon() throws Exception
	{
		for (int i = 0; i < vec.size(); ++i)
		{
			root son = (root)vec.get(i);
			son.checkSon();
			addquad(son);
		}
	}
}
