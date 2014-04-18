package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.main.main;
import compiler.Type.*;

public class type_specifier extends root
{
	public type_specifier(){}
	public int checkSon() throws Exception
	{

		son = (root)vec.get(0);
		
		if (vec.size() == 1)
		{
			son = (root)vec.get(0);
			if (son.checkSon() == WA) return WA;
			Super sup = (Super)main.S.get(Symbol.symbol("GXX_" + son.s.toUpperCase()));
			returnVec.add(sup.type);
		}
		else if (son.s.equals("ONE"))
		{
			String s = "";
			son = (root)vec.get(1);
			if (son.checkSon() == WA) return WA;
			
			if (vec.size() == 4)
			{
				son = (root)vec.get(2);
				if (son.checkSon() == WA) return WA;
				s += (String)son.returnVec.get(1);
			}
			else
				s += "GXX_" + String.valueOf(main.noName++);
			
			beginScope();
			
			son = (root)vec.get(vec.size() - 1);
			if (son.checkSon() == WA) return WA;
			for (int i = 0; i < son.returnVec.size(); ++i)
				returnVec.add(son.returnVec.get(i));
			
			endScope();
			
			/*Type tmp = (Type)main.S.get(Symbol.symbol(s));
			if (tmp != null && tmp.scope == main.scope) return WA;
			main.S.put(Symbol.symbol(s), struct);*/
			Type struct = new Struct(returnVec, s);
			if (!addSymbol(main.S, struct, s, true)) return WA;
			
			returnVec.removeAllElements();
			returnVec.add(struct);
		}
		else
		{
			String s = "";
			son = (root)vec.get(1);
			if (son.checkSon() == WA) return WA;
			s = (String)son.returnVec.get(1);
			
			Super sup = (Super)main.S.get(Symbol.symbol(s));
			Type struct;
			if (sup == null) struct = null;
			else struct = sup.type;
			if (struct == null)
				struct = new Name(s);
			
			returnVec.add(struct);
		}
		return AC;
	}
}
