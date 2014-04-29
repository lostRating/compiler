package compiler.ClassDef;

import compiler.Semantic.Table;

public class compound_statement extends root
{
	public compound_statement(){}
	public void checkSon() throws Exception
	{
		beginScope(false);
		
		for (int i = 0; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			son.checkSon();
		}
		
		endScope(false);
	}
}
