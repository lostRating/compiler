package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Type;
import compiler.main.main;

public class selection_statement extends root
{
	public selection_statement(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		son.checkSon();
		Type type = (Type)son.returnVec.get(2);
		if (!typeToType(main.GXX_INT, type)) throw new Exception("selcetion_statement");
		
		for (int i = 1; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			son.checkSon();
		}
	}
}
