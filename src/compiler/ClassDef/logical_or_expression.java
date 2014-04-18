package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.main.main;
import compiler.Type.*;

public class logical_or_expression extends root
{
	public logical_or_expression(){}
	public int checkSon() throws Exception
	{

		for (int i = 0; i < vec.size(); i += 2)
		{
			son = (root)vec.get(i);
			if (son.checkSon() == WA) return WA;
			if (i == 0)
				for (int j = 0; j < 4; ++j)
					returnVec.add(son.returnVec.get(j));
			else
			{
				String op = (String)(((root)vec.get(i - 1)).s);
				Vector vector = calTwo(op, returnVec, son.returnVec);
				
				if (!(boolean)vector.get(4)) return WA;
				
				for (int j = 0; j < 4; ++j)
					returnVec.set(j, vector.get(j));
			}
		}
		return AC;
	}
}
