package compiler.ClassDef;

import compiler.Type.*;

public class __Mem extends __Oprand {

	public int offset;
	public int length = 4;
	public __TempOprand base;
	
	public __Mem(__TempOprand t, int o, Type type) {
		base = t;
		offset = o;
		if (type instanceof Char)
			length = 1;
	}
	
	@Override
	public String print() {
		return offset + "(" + base.print() + ")";
	}

}
