package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Pointer;
import compiler.Type.Type;
import compiler.main.main;

public class string extends root
{
	public string(){}
	public int checkSon() throws Exception
	{
		son = (root)vec.get(0);
		if (son.checkSon() == WA) return WA;
		
		Type type = (Type)new Pointer(main.GXX_CHAR, son.s);
		
		returnVec.add(type);
		returnVec.add(0);
		
		return AC;
	}
}
