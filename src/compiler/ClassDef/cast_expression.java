package compiler.ClassDef;

import compiler.Semantic.Table;
import compiler.Type.Type;

public class cast_expression extends root
{
	public cast_expression(){}
	public void checkSon() throws Exception
	{
		if (vec.size() == 1)
		{
			son = (root)vec.get(0);
			son.checkSon();
			
			addquad(son);
			
			for (int i = 0; i < 5; ++i)
				returnVec.add(son.returnVec.get(i));
		}
		else
		{
			son = (root)vec.get(0);
			son.checkSon();
			
			Type type = (Type)son.returnVec.get(0);
			
			son = (root)vec.get(1);
			son.checkSon();
			
			addquad(son);
			
			for (int i = 0; i < 5; ++i)
				returnVec.add(son.returnVec.get(i));
			if (!typeToType(type, (Type)returnVec.get(2))) throw new Exception("cast_expression");
			returnVec.set(3, type);
 		}
	}
}
