package compiler.ClassDef;

import compiler.Semantic.Table;

public class integer_constant extends root
{
	public integer_constant(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		returnVec.add(0);
	}
}
