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
			if (main.l1.empty()) throw new Exception("jump_statement 1");
			if (son.s.equals("continue")) quad.add(new __Jump(main.l1.peek()));
			else quad.add(new __Jump(main.l2.peek()));
		}
		else
		{
			Type type = main.GXX_VOID;
			if (vec.size() == 2)
			{
				son = (root)vec.get(1);
				son.checkSon();
				
				addquad(son);
				__TempOprand __t = (__TempOprand)son.returnVec.get(4);
				type = (Type)son.returnVec.get(2);
				
				if (!(type instanceof Struct))
					quad.add(new __Move(new __TempOprand(new __Temp("$v0")), __t.Val(quad, type)));
				else
					quad.add(new __Move(new __TempOprand(new __Temp("$v0")), __t));
				quad.add(new __Return(main.func));
				quad.add(new __Jump(new __Label("$ra")));
			}
			if (main.func == null || !typeToType(main.func.returnType, type))
				throw new Exception("jump_statement 2");
		}
	}
}
