package compiler.ClassDef;

import compiler.Semantic.*;
import compiler.Type.*;
import compiler.main.main;

public class declaration extends root
{
	public declaration(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		son.checkSon();
		
		addquad(son);
		
		Type type = (Type)son.returnVec.get(0);
		
		if (vec.size() == 1) return;
		
		son = (root)vec.get(1);
		son.checkSon(type);
		
		addquad(son);
	}
}
