package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Name;
import compiler.Type.Type;
import compiler.main.main;

public class struct_inner extends root
{
	public struct_inner(){}
	public int checkSon() throws Exception
	{
		for (int i = 0; i < vec.size(); i += 2)
		{
			son = (root)vec.get(i);
			if (son.checkSon() == WA) return WA;
			Type type = (Type)son.returnVec.get(0);
			
			son = (root)vec.get(i + 1);
			if (son.checkSon(type) == WA) return WA;
			for (int j = 0; j < son.returnVec.size(); ++j)
				returnVec.add(son.returnVec.get(j));
		}
		
		for (int i = 0; i < returnVec.size(); i += 2)
		{
			String name = (String)returnVec.get(i + 1);
			Type type2 = (Type)returnVec.get(i);
/*			Type tmp2 = (Type)main.F.get(Symbol.symbol(name));
			if (tmp2 != null && tmp2.scope == main.scope) return WA;
			if (type2 instanceof Name) return WA;
			main.F.put(Symbol.symbol(name), type2);*/
			if (!addSymbol(main.F, type2, name, true)) return WA;
		}
		
		return AC;
	}
}
