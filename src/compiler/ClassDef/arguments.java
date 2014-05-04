package compiler.ClassDef;

import compiler.Semantic.Table;

public class arguments extends root
{
	public arguments(){}
	public void checkSon() throws Exception
	{
		for (int i = 0; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			son.checkSon();
			
			addquad(son);
			
			returnVec.add(son.returnVec.get(2));
			returnVec.add(son.returnVec.get(4));
		}
	}
}
