package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Int;
import compiler.Type.Type;
import compiler.main.main;

public class logical_and_expression extends root
{
	public logical_and_expression(){}
	public void checkSon() throws Exception
	{
		boolean jump = (vec.size() > 1);
		__TempOprand __t = null;
		__Label l1 = null;
		__Label l2 = null;
		if (jump)
		{
//			quad.add(new __Void("                              #  && begin"));
			__t = new __TempOprand(new __Temp(""));
			quad.add(new __Move(__t, new __Const(1)));
			l1 = new __Label();
			l2 = new __Label();
		}
		for (int i = 0; i < vec.size(); i += 2)
		{
			son = (root)vec.get(i);
			son.checkSon();
			
			addquad(son);
			
			if (i == 0)
			{
				for (int j = 0; j < 5; ++j)
					returnVec.add(son.returnVec.get(j));
				if (jump)
				{
					quad.add(new __Branch(((__TempOprand)son.returnVec.get(4)).Val(quad, new Int()), l1, 0));
				}
			}
			else
			{
				//String op = (String)(((root)vec.get(i - 1)).s);
				//Vector vector = calTwo(op, returnVec, son.returnVec);
				
				returnVec.set(1, false);
				
				if (jump)
				{
					quad.add(new __Branch(((__TempOprand)son.returnVec.get(4)).Val(quad, new Int()), l1, 0));
				}
			}
		}
		if (jump)
		{
			quad.add(new __Jump(l2));
			quad.add(new __LabelQuad(l1));
			quad.add(new __Move(__t, new __Const(0)));
			quad.add(new __LabelQuad(l2));
			returnVec.set(4, __t);
//			quad.add(new __Void("                                 #  && end"));
		}
	}
}
