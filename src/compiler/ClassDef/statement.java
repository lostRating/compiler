package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;

public class statement extends root
{
	public statement(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		son.checkSon();
		
		addquad(son);
	}
}
