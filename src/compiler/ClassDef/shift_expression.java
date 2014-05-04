package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Type;
import compiler.main.main;

public class shift_expression extends root
{
	public shift_expression(){}
	public void checkSon() throws Exception
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
}
