package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.main.main;
import compiler.Type.*;

public class type_specifier extends root
{
	public type_specifier(){}
	public void checkSon() throws Exception
	{

		son = (root)vec.get(0);
		
		if (vec.size() == 1)
		{
			son = (root)vec.get(0);
			son.checkSon();
			Super sup = (Super)main.S.get(Symbol.symbol("GXX_" + son.s.toUpperCase()));
			returnVec.add(sup.type);
		}
		else if (son.s.equals("ONE"))
		{
			String s = "";
			son = (root)vec.get(1);
			son.checkSon();
			
			String sss = son.s;
			
			if (vec.size() == 4)
			{
				son = (root)vec.get(2);
				son.checkSon();
				s += (String)son.returnVec.get(1);
			}
			else
				s += "GXX_" + String.valueOf(main.noName++);
			
			beginScope("struct");
			
			Inner ++;
			
			son = (root)vec.get(vec.size() - 1);
			son.checkSon();
			for (int i = 0; i < son.returnVec.size(); ++i)
				returnVec.add(son.returnVec.get(i));
			
			int tmp = main.Offset.peek();
			
			Inner --;
			
			endScope("struct");
			
			Type struct = new Struct(returnVec, s);
			struct.size = tmp;
			
			if (sss.equals("union"))
				((Struct)struct).union = true;
			
			addSymbol(main.S, struct, s, true);
			
			returnVec.removeAllElements();
			returnVec.add(struct);
		}
		else
		{
			String s = "";
			son = (root)vec.get(1);
			son.checkSon();
			s = (String)son.returnVec.get(1);
			
			Super sup = (Super)main.S.get(Symbol.symbol(s));
			Type struct;
			if (sup == null) struct = null;
			else struct = sup.type;
			if (struct == null)
				struct = new Name(s);
			
			returnVec.add(struct);
		}
	}
}
