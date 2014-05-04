package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Int;
import compiler.Type.Type;
import compiler.main.main;

public class constant extends root
{
	public constant(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		String s = son.s;
		son = (root)vec.get(1);
		son.checkSon();	//addquad(son);
		if (s.equals("ONE"))
		{
			returnVec.add(main.GXX_INT);
			returnVec.add(son.returnVec.get(0));
			__TempOprand __t = new __TempOprand(new __Temp(""));
			quad.add(new __Move(__t, new __Const((int)returnVec.get(1))));
			returnVec.add(__t);
		}
		else
		{
			returnVec.add(main.GXX_CHAR);
			returnVec.add(son.returnVec.get(0));
			__TempOprand __t = new __TempOprand(new __Temp(""));
			quad.add(new __Move(__t, new __Const((int)returnVec.get(1))));
			returnVec.add(__t);
		}
	}
}
