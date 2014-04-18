package compiler.ClassDef;

import compiler.Semantic.Table;

public class compound_statement extends root
{
	public compound_statement(){}
	public int checkSon() throws Exception
	{
		beginScope();
		
		for (int i = 0; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			if (son.checkSon() == WA) return WA;
		}
		
		endScope();
		
		return AC;
	}
}
