package compiler.ClassDef;

import compiler.Semantic.Table;
import compiler.Type.*;

public class postfix_expression extends root
{
	public postfix_expression(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		son.checkSon();
		for (int i = 0; i < 4; ++i)
			returnVec.add(son.returnVec.get(i));

		for (int i = 1; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			for (int j = 0; j < 4; ++j)
				son.returnVec.add(returnVec.get(j));
			son.checkSon();
			for (int j = 0; j < 4; ++j)
				returnVec.set(j, son.returnVec.get(j));
		}
	}
}
