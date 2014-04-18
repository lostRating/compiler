package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;

public class statement extends root
{
	public statement(){}
	public int checkSon() throws Exception
	{
		son = (root)vec.get(0);
		if (son.checkSon() == WA) return WA;
		
		return AC;
	}
}
