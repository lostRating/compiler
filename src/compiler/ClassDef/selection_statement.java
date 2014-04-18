package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Type;
import compiler.main.main;

public class selection_statement extends root
{
	public selection_statement(){}
	public int checkSon() throws Exception
	{
		son = (root)vec.get(0);
		
		if (son.checkSon() == WA) return WA;
		Type type = (Type)son.returnVec.get(2);
		if (!typeToType(main.GXX_INT, type)) return WA;
		
		for (int i = 1; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			if (son.checkSon() == WA) return WA;
		}
		
		return AC;
	}
}
