package compiler.ClassDef;

import compiler.Semantic.*;
import compiler.Type.Type;

public class init_declarators extends root
{
	public init_declarators(){}
	public int checkSon(Type type) throws Exception
	{
		for (int i = 0; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			if (son.checkSon(type) == WA) return WA;
			returnVec.add(son.returnVec.get(0));
			returnVec.add(son.returnVec.get(1));
 		}
		return AC;
	}
}
