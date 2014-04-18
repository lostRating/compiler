package compiler.ClassDef;

import compiler.Semantic.Table;

public class integer_constant extends root
{
	public integer_constant(){}
	public int checkSon() throws Exception
	{
		son = (root)vec.get(0);
		
		if (son.checkSon() == WA) return WA;
		
		//value of integer
		returnVec.add(0);
		
		return AC;
	}
}
