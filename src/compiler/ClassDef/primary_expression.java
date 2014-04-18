package compiler.ClassDef;

import compiler.Semantic.Table;
import compiler.Type.Type;

public class primary_expression extends root
{
	public primary_expression(){}
	public int checkSon() throws Exception
	{
		
		son = (root)vec.get(0);
		if (son.s.equals("ONE"))
		{
			son = (root)vec.get(1);
			if (son.checkSon() == WA) return WA;
			if (son.returnVec.get(0) == null) return WA;
			
			returnVec.add(false);
			returnVec.add(true);
			returnVec.add(son.returnVec.get(0));
			returnVec.add(0);
		}
		else if (son.s.equals("TWO"))
		{
			son = (root)vec.get(1);
			if (son.checkSon() == WA) return WA;
			returnVec.add(true);
			returnVec.add(false);
			returnVec.add(son.returnVec.get(0));
			returnVec.add(son.returnVec.get(1));
		}
		else if (son.s.equals("THREE"))
		{
			son = (root)vec.get(1);
			if (son.checkSon() == WA) return WA;
			returnVec.add(true);
			returnVec.add(false);
			returnVec.add(son.returnVec.get(0));
			returnVec.add(son.returnVec.get(1));
		}
		else
		{
			son = (root)vec.get(1);
			if (son.checkSon() == WA) return WA;
			for (int i = 0; i < 4; ++i)
				returnVec.add(son.returnVec.get(i));
		}
		return AC;
	}
}
