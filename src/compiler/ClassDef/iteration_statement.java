package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Type;
import compiler.main.main;

public class iteration_statement extends root
{
	public iteration_statement(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		
		if (son.s.equals("while"))
		{
			son = (root)vec.get(1);
			son.checkSon();
			Type type = (Type)son.returnVec.get(2);
			if (!typeToType(main.GXX_INT, type)) throw new Exception("iteration_statement");
			
			beginLoop();
			
			son = (root)vec.get(2);
			son.checkSon();
			
			endLoop();
 		}
		else
		{
			for (int i = 1; i < vec.size() - 2; i += 2)
			{
				son = (root)vec.get(i + 1);
				son.checkSon();
				Type type = (Type)son.returnVec.get(2);
				if (((root)vec.get(i)).s.equals("TWO") && !typeToType(main.GXX_INT, type)) throw new Exception("iteration_statement");
			}
			
			beginLoop();
			
			son = (root)vec.get(vec.size() - 1);
			son.checkSon();
			
			endLoop();
 		}
	}
}
