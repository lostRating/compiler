package compiler.ClassDef;

import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.main.main;

public class jump_statement extends root
{
	public jump_statement(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		if (!son.s.equals("return"))
		{
			if (main.loop == 0) throw new Exception("jump_statement 1");
		}
		else
		{
			Type type = main.GXX_VOID;
			if (vec.size() == 2)
			{
				son = (root)vec.get(1);
				son.checkSon();
				type = (Type)son.returnVec.get(2);
			}
			if (main.func == null || !typeToType(main.func.returnType, type))
				throw new Exception("jump_statement 2");
		}
	}
}
