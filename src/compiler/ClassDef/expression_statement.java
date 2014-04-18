package compiler.ClassDef;

import compiler.Semantic.Table;

public class expression_statement extends root
{
	public expression_statement(){}
	public int checkSon() throws Exception
	{
		if (vec.size() == 0) return AC;
		
		son = (root)vec.get(0);
		if (son.checkSon() == WA) return WA;
		
		return AC;
	}
}
