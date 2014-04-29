package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.main.main;
import compiler.Type.*;

public class unary_expression extends root
{
	public unary_expression(){}
	public void checkSon() throws Exception
	{
		if (vec.size() == 1)
		{
			son = (root)vec.get(0);
			son.checkSon();
			for (int i = 0; i < 4; ++i)
				returnVec.add(son.returnVec.get(i));
		}
		else
		{
			son = (root)vec.get(0);
			if (son.s.equals("++") || son.s.equals("--"))
			{
				son = (root)vec.get(1);
				son.checkSon();
				for (int i = 0; i < 4; ++i)
					returnVec.add(son.returnVec.get(i));
				returnVec.set(1, false);
			}
			else if (!son.s.equals("ONE") && !son.s.equals("TWO"))
			{
				String s = son.s;
				son = (root)vec.get(1);
				son.checkSon();
				for (int i = 0; i < 4; ++i)
					returnVec.add(son.returnVec.get(i));
				Vector vec = calOne(s, returnVec);
				
				for (int i = 0; i < 4; ++i)
					returnVec.set(i, vec.get(i));
			}
			else if (son.s.equals("ONE"))
			{
				son = (root)vec.get(1);
				son.checkSon();
				for (int i = 0; i < 4; ++i)
					returnVec.add(son.returnVec.get(i));
				returnVec.set(0, true);
				returnVec.set(1, false);
				returnVec.set(2, main.GXX_INT);
			}
			else
			{
				son = (root)vec.get(1);
				son.checkSon();
				returnVec.add(true);
				returnVec.add(false);
				returnVec.add(main.GXX_INT);
				returnVec.add(0);
			}
		}
	}
}
