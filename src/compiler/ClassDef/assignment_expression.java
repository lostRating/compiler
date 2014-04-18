package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.main.main;

public class assignment_expression extends root
{
	public assignment_expression(){}
	public int checkSon() throws Exception
	{
		if (vec.size() != 1)
		{
			/*son = (root)vec.get(0);
			if (son.checkSon() == WA) return WA; 
			
			for (int i = 0; i < 4; ++i)
				returnVec.add(son.returnVec.get(i));
			if (!(boolean)son.returnVec.get(1)) return WA;
			
			son =(root)vec.get(1);
			String s = (String)son.s;
			
			son = (root)vec.get(2);
			if (son.checkSon() == WA) return WA;
			if (s.equals("="))
			{
				if (!typeToType((Type)returnVec.get(2), (Type)son.returnVec.get(2))) return WA;
			}
			else
			{
				if (!typeToType(main.GXX_INT, (Type)returnVec.get(2))) return WA;
				if (!typeToType(main.GXX_INT, (Type)son.returnVec.get(2))) return WA;
			}
			*/
			for (int i = 0; i < vec.size(); i += 2)
			{
				son = (root)vec.get(i);
				if (son.checkSon() == WA) return WA;
				if (i == 0)
					for (int j = 0; j < 4; ++j)
						returnVec.add(son.returnVec.get(j));
				else
				{
					String op = (String)(((root)vec.get(i - 1)).s);
					Vector vector = calTwo(op, returnVec, son.returnVec);

					if (!(boolean)vector.get(4)) return WA;
					
					for (int j = 0; j < 4; ++j)
						returnVec.set(j, vector.get(j));
				}
			}
			return AC;
		}
		else
		{
			son = (root)vec.get(0);
			if (son.checkSon() == WA) return WA;
			for (int i = 0; i < 4; ++i)
				returnVec.add(son.returnVec.get(i));
		}
		return AC;
	}
}
