package compiler.ClassDef;

import compiler.Semantic.Table;
import compiler.Type.Type;

public class cast_expression extends root
{
	public cast_expression(){}
	public int checkSon() throws Exception
	{
		if (vec.size() == 1)
		{
			son = (root)vec.get(0);
			if (son.checkSon() == WA) return WA;
			for (int i = 0; i < 4; ++i)
				returnVec.add(son.returnVec.get(i));
		}
		else
		{
			son = (root)vec.get(0);
			if (son.checkSon() == WA) return WA;
			Type type = (Type)son.returnVec.get(0);
			
			son = (root)vec.get(1);
			if (son.checkSon() == WA) return WA;
			for (int i = 0; i < 4; ++i)
				returnVec.add(son.returnVec.get(i));
			if (!typeToType(type, (Type)returnVec.get(2))) return WA;
			returnVec.set(3, type);
 		}
		return AC;
	}
}
