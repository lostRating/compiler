package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Array;
import compiler.Type.Int;
import compiler.Type.Type;
import compiler.main.main;

public class declarator extends root
{
	public declarator(){}
	public int checkSon(Type type) throws Exception
	{
		son = (root)vec.get(0);
		if (son.s.equals("ONE"))
		{
/*			son = (root)vec.get(1);
			if (son.checkSon() == WA) return WA;
			
			if (vec.size() == 2) return AC;
			
			son = (root)vec.get(2);
			if (son.checkSon() == WA) return WA;*/
			
			//function hou zhi ding yi
			throw new Exception("Error: No code about it");
//			System.out.println("declarator miss !!!");
		}
		else
		{
			if (son.checkSon(type) == WA) return WA;
			Type newType = (Type)son.returnVec.get(0);
			String Name = (String)son.returnVec.get(1);
			
			//Type tmp = (Type)main.F.get(Symbol.symbol(Name));
			//if (tmp != null && tmp.scope == main.scope) return WA;
			
			for (int i = vec.size() - 1; i > 0; --i)
			{
				son = (root)vec.get(i);
				if (son.checkSon() == WA) return WA;
				boolean constant = (boolean)son.returnVec.get(0);
				if (!constant) return WA;
				newType = new Array(newType, -1, "GXX_" + String.valueOf(main.noName++));
				//hehe
			}
			//main.F.put(Symbol.symbol(Name), newType);
			
			returnVec.add(newType);
			returnVec.add(Name);
		}
		return AC;
	}
}
