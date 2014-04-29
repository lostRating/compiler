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
		if (sup == null) type = null;
		else type = sup.type;
		
		returnVec.add(type);
		returnVec.add(s);
	}
}
