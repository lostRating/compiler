package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Type;

public class plain_declaration extends root
{
	public plain_declaration(){}
	public int checkSon() throws Exception
	{
		son = (root)vec.get(0);
		if (son.checkSon() == WA) return WA;
		Type type = (Type)son.returnVec.get(0);
		
		son = (root)vec.get(1);
		if (son.checkSon(type) == WA) return WA;
		returnVec.add(son.returnVec.get(0));
		returnVec.add(son.returnVec.get(1));
		
		return AC;
	}
}
