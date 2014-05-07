package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.main.main;

public class identifier extends root
{
	public identifier(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		son.checkSon();
		
		String s = son.s;
		
		//System.out.println(s);
		
		Super sup = (Super)main.F.get(Symbol.symbol(s));
		Type type;
		__TempOprand __t = null;
		if (sup == null)
		{
			type = null;
			__t = null;
		}
		else if (sup.tmp == null)
		{
			type = sup.type;
			__t = null;
		}
		else
		{
			type = sup.type;
			if ((type instanceof Array || type instanceof Struct) && !sup.tmp.Static)
			{
				__t = new __TempOprand(new __Temp(""), 1);
				quad.add(new __BinOp(__t, __tosp, new __Const(sup.tmp.offset), "+"));
			}
			else if (!sup.tmp.Static)
				__t = new __TempOprand(sup.tmp);
			else
			{
				__t = new __TempOprand(new __Temp(""), 1);
				quad.add(new __Move(__t, new __TempOprand(sup.tmp, 1)));
			}
		}
		
		returnVec.add(type);
		returnVec.add(s);
		returnVec.add(__t);
	}
}
