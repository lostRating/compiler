package compiler.ClassDef;

import compiler.Semantic.Table;
import compiler.Type.Pointer;
import compiler.Type.Type;
import compiler.main.main;

public class type_name extends root
{
	public type_name(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		son.checkSon();
		
		addquad(son);
		
		Type type = (Type)son.returnVec.get(0);
		
		for (int i = 1; i < vec.size(); ++i)
			type = new Pointer(type, "GXX_" + String.valueOf(main.noName++));
		
		returnVec.add(type);
	}
}
