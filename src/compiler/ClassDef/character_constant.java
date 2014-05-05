package compiler.ClassDef;

import compiler.Semantic.Table;

public class character_constant extends root
{
	public character_constant(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		s = son.s.substring(1, son.s.length() - 1);
		if (s.length() == 1)
			returnVec.add((int)s.charAt(0));
		else if (s.equals("\\b"))
			returnVec.add((int)'\b');
		else if (s.equals("\\t"))
			returnVec.add((int)'\t');
		else if (s.equals("\\n"))
			returnVec.add((int)'\n');
		else if (s.equals("\\f"))
			returnVec.add((int)'\f');
		else if (s.equals("\\r"))
			returnVec.add((int)'\r');
		else if (s.equals("\\\""))
			returnVec.add((int)'\"');
		else if (s.equals("\\\'"))
			returnVec.add((int)'\'');
		else if (s.equals("\\\\"))
			returnVec.add((int)'\\');
		else
		{
			s = s.substring(1, s.length());
			if (s.length() == 3)
				returnVec.add(Integer.parseInt(s, 8));
			else if (s.length() == 4)
			{
				s.substring(2, s.length());
				returnVec.add(Integer.parseInt(s, 16));
			}
			else throw new Exception("character_constant");
		}
		//returnVec.add(0);
	}
}
