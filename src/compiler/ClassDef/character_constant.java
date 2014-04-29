package compiler.ClassDef;

import compiler.Semantic.Table;

public class character_constant extends root
{
	public character_constant(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		returnVec.add(0);
	}
}
