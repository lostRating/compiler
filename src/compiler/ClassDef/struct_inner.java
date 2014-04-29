package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Name;
import compiler.Type.Type;
import compiler.main.main;

public class struct_inner extends root
{
	public struct_inner(){}
	public void checkSon() throws Exception
	{
		for (int i = 0; i < vec.size(); i += 2)
		{
			son = (root)vec.get(i);
			son.checkSon();
			Type type = (Type)son.returnVec.get(0);
			
			son = (root)vec.get(i + 1);
			son.checkSon(type);
			for (int j = 0; j < son.returnVec.size(); ++j)
				returnVec.add(son.returnVec.get(j));
		}
		
		for (int i = 0; i < returnVec.size(); i += 2)
		{
			String name = (String)returnVec.get(i + 1);
			Type type2 = (Type)returnVec.get(i);
			addSymbol(main.F, type2, name, true);
		}
	}
}
