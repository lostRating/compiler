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
			
			addquad(son);
			
			for (int i = 0; i < 5; ++i)
				returnVec.add(son.returnVec.get(i));
		}
		else
		{
			son = (root)vec.get(0);
			if (son.s.equals("++") || son.s.equals("--"))
			{
				son = (root)vec.get(1);
				son.checkSon();
				
				addquad(son);
				
				for (int i = 0; i < 5; ++i)
					returnVec.add(son.returnVec.get(i));
				Type type = (Type)son.returnVec.get(2);
				if (!typeToType(main.GXX_INT, type)) throw new Exception("unary_expression 1");
				
				__TempOprand __t = (__TempOprand)returnVec.get(4);
				__t = initBinOp(__t.Mem(type), __t.Val(quad, type), new __Const(1), "+");
				
				returnVec.set(1, false);
				returnVec.set(4, __t);
			}
			else if (!son.s.equals("ONE") && !son.s.equals("TWO"))
			{
				String s = son.s;
				son = (root)vec.get(1);
				son.checkSon();
				
				addquad(son);
				
				for (int i = 0; i < 5; ++i)
					returnVec.add(son.returnVec.get(i));
				Vector vec = calOne(s, returnVec);
				
				for (int i = 0; i < 5; ++i)
					returnVec.set(i, vec.get(i));
			}
			else if (son.s.equals("ONE"))
			{
				son = (root)vec.get(1);
				son.checkSon();
				
				addquad(son);
				
				returnVec.add(true);
				returnVec.add(false);
				returnVec.add(main.GXX_INT);
				returnVec.add(((Type)son.returnVec.get(2)).size);
				
				__TempOprand __t = new __TempOprand(new __Temp(""));
				quad.add(new __Move(__t, new __Const((int)returnVec.get(3))));
				returnVec.add(__t);
			}
			else
			{
				son = (root)vec.get(1);
				son.checkSon();
				
				returnVec.add(true);
				returnVec.add(false);
				returnVec.add(main.GXX_INT);
				returnVec.add(((Type)son.returnVec.get(0)).size);
				
				__TempOprand __t = new __TempOprand(new __Temp(""));
				quad.add(new __Move(__t, new __Const((int)returnVec.get(3))));
				returnVec.add(__t);
			}
		}
	}
}
