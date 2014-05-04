package compiler.ClassDef;

import compiler.Semantic.Table;

public class expression_statement extends root
{
	public expression_statement(){}
	public void checkSon() throws Exception
	{
		if (vec.size() == 0) return;
		
		son = (root)vec.get(0);
		son.checkSon();
		
		addquad(son);
	}
}
