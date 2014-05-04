package compiler.ClassDef;

import compiler.Semantic.Table;
import compiler.Type.Type;

public class primary_expression extends root
{
	public primary_expression(){}
	public void checkSon() throws Exception
	{
		
		son = (root)vec.get(0);
		if (son.s.equals("ONE"))
		{
			son = (root)vec.get(1);
			son.checkSon();
			
			addquad(son);
			
			if (son.returnVec.get(0) == null) throw new Exception("primary_expression ???");
			
			returnVec.add(false);
			returnVec.add(true);
			returnVec.add(son.returnVec.get(0));
			returnVec.add(0);
			returnVec.add(son.returnVec.get(2));
		}
		else if (son.s.equals("TWO"))
		{
			son = (root)vec.get(1);
			son.checkSon();
			
			addquad(son);
			
			returnVec.add(true);
			returnVec.add(false);
			returnVec.add(son.returnVec.get(0));
			returnVec.add(son.returnVec.get(1));
			returnVec.add(son.returnVec.get(2));
		}
		else if (son.s.equals("THREE"))
		{
			son = (root)vec.get(1);
			son.checkSon();
			
			addquad(son);
			
			returnVec.add(true);
			returnVec.add(false);
			returnVec.add(son.returnVec.get(0));
			returnVec.add(son.returnVec.get(1));
			returnVec.add(son.returnVec.get(2));
		}
		else
		{
			son = (root)vec.get(1);
			son.checkSon();
			
			addquad(son);
			
			for (int i = 0; i < 5; ++i)
				returnVec.add(son.returnVec.get(i));
		}
	}
}
