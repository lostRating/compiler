package compiler.ClassDef;

import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.main.main;

public class jump_statement extends root
{
	public jump_statement(){}
	public int checkSon() throws Exception
	{
		if (vec.size() == 1)
		{
			if (main.loop == 0) return WA;
		}
		else
		{
			son = (root)vec.get(1);
			if (son.checkSon() == WA) return WA;
			Type type = (Type)son.returnVec.get(2);
			if (main.func == null || !typeToType(main.func.returnType, type)) return WA;
		}
		return AC;
	}
}
