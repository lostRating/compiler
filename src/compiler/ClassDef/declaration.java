package compiler.ClassDef;

import compiler.Semantic.*;
import compiler.Type.*;
import compiler.main.main;

public class declaration extends root
{
	public declaration(){}
	public int checkSon() throws Exception
	{
		son = (root)vec.get(0);
		if (son.checkSon() == WA) return WA;
		Type type = (Type)son.returnVec.get(0);
		
		if (vec.size() == 1) return AC;
		
		son = (root)vec.get(1);
		if (son.checkSon(type) == WA) return WA;
		
		for (int i = 0; i < son.returnVec.size(); i += 2)
		{
			String name = (String)son.returnVec.get(i + 1);
			Type type2 = (Type)son.returnVec.get(i);
//			Type tmp2 = (Type)main.F.get(Symbol.symbol(name));
//			if (tmp2 != null && tmp2.scope == main.scope) return WA;
//			main.F.put(Symbol.symbol(name), type2);
		}
		
		return AC;
	}
}
