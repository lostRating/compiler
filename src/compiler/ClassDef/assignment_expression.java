package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.main.main;

public class assignment_expression extends root
{
	public assignment_expression(){}
	public void checkSon() throws Exception
	{
		if (vec.size() != 1)
		{
			for (int i = 0; i < vec.size(); i += 2)
			{
				son = (root)vec.get(i);
				son.checkSon();
				
				addquad(son);
				
				if (i == 0)
				{
					for (int j = 0; j < 5; ++j)
						returnVec.add(son.returnVec.get(j));
				}
				else
				{
					String op = (String)(((root)vec.get(i - 1)).s);
					Vector vector = calTwo(op, returnVec, son.returnVec);
					
					for (int j = 0; j < 5; ++j)
						returnVec.set(j, vector.get(j));
				}
			}
		}
		else
		{
			son = (root)vec.get(0);
			son.checkSon();
			
			addquad(son);
			
			for (int i = 0; i < 5; ++i)
				returnVec.add(son.returnVec.get(i));
		}
	}
}
