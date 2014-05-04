package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
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
		
		Type type = (Type)new Pointer(main.GXX_CHAR, son.s);
		
		returnVec.add(type);
		returnVec.add(0);
		__TempOprand __t = new __TempOprand(new __Temp(""));
		quad.add(new __Move(__t, new __Const((int)returnVec.get(1))));
		returnVec.add(__t);
	}
}
