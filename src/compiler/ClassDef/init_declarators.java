package compiler.ClassDef;

import compiler.Semantic.*;
import compiler.Type.Type;

public class init_declarators extends root
{
	public init_declarators(){}
	public void checkSon(Type type) throws Exception
	{
		for (int i = 0; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			son.checkSon(type);
			returnVec.add(son.returnVec.get(0));
			returnVec.add(son.returnVec.get(1));
 		}
	}
}
