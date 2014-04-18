package compiler.ClassDef;

import compiler.Semantic.Table;

public class character_constant extends root
{
	public character_constant(){}
	public int checkSon() throws Exception
	{
		son = (root)vec.get(0);
		if (son.checkSon() == WA) return WA;
		
		//value of char
		returnVec.add(0);
		
		return AC;
	}
}
