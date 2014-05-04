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
		
		addquad(son);
		
		for (int i = 0; i < 5; ++i)
			returnVec.add(son.returnVec.get(i));

		for (int i = 1; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			for (int j = 0; j < 5; ++j)
				son.returnVec.add(returnVec.get(j));
			son.checkSon();
			
			addquad(son);
			
			for (int j = 0; j < 5; ++j)
				returnVec.set(j, son.returnVec.get(j));
		}
	}
}
