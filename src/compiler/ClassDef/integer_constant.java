package compiler.ClassDef;

import compiler.Semantic.Table;

public class integer_constant extends root
{
	public integer_constant(){}
	public void checkSon() throws Exception
	{
		String s = ((root)vec.get(0)).s;
		son = (root)vec.get(1);
		if (s.equals("ONE"))
			returnVec.add(Integer.parseInt(son.s, 10));
		else if (s.equals("TWO"))
			returnVec.add(Integer.parseInt(son.s, 8));
		else
			returnVec.add(Integer.parseInt(son.s.substring(2, son.s.length()), 16));
	}
}
