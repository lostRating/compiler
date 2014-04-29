package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Type;

public class plain_declaration extends root
{
	public plain_declaration(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		son.checkSon();
		Type type = (Type)son.returnVec.get(0);
		
		son = (root)vec.get(1);
		son.checkSon(type);
		returnVec.add(son.returnVec.get(0));
		returnVec.add(son.returnVec.get(1));
	}
}
