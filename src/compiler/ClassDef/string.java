package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Array;
import compiler.Type.Pointer;
import compiler.Type.Type;
import compiler.main.main;

public class string extends root
{
	public string(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		son.checkSon();
		
		Type type = (Type)new Array(main.GXX_CHAR, son.s.length() + 1, son.s);
		
		returnVec.add(type);
		returnVec.add(0);
		__Label l1 = new __Label();
		
		secret = l1;
		
		__TempOprand __t = new __TempOprand(new __Temp(""), 1);
		
		data.add("  " + l1.print() + ": " + ".asciiz " + son.s + "\n\t" + ".align 2");

		quad.add(new __Move(__t, new __LabelAddress(l1)));
		returnVec.add(__t);
	}
}
