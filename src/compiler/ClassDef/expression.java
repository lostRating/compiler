package compiler.ClassDef;

import compiler.Semantic.Table;

public class expression extends root
{
	public expression(){}
	public void checkSon() throws Exception
	{
		for (int i = 0; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			son.checkSon();
			
			addquad(son);
			
//			if (i == 0)
//			{
			returnVec.removeAllElements();
			for (int j = 0; j < 5; ++j)
				returnVec.add(son.returnVec.get(j));
//			}
		}
	}
}
