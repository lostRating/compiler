package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Type;
import compiler.main.main;

public class iteration_statement extends root
{
	public iteration_statement(){}
	public int checkSon() throws Exception
	{
		son = (root)vec.get(0);
		
		if (son.s.equals("while"))
		{
			son = (root)vec.get(1);
			if (son.checkSon() == WA) return WA;
			Type type = (Type)son.returnVec.get(2);
			if (!typeToType(main.GXX_INT, type)) return WA;
			
			beginLoop();
			
			son = (root)vec.get(2);
			if (son.checkSon() == WA) return WA;
			
			endLoop();
 		}
		else
		{
			for (int i = 1; i < vec.size() - 2; i += 2)
			{
				son = (root)vec.get(i + 1);
				if (son.checkSon() == WA) return WA;
				Type type = (Type)son.returnVec.get(2);
				if (!typeToType(main.GXX_INT, type)) return WA;
				//skip useless token
			}
			
			beginLoop();
			
			son = (root)vec.get(vec.size() - 1);
			if (son.checkSon() == WA) return WA;
			
			endLoop();
 		}
		
		return AC;
	}
}
