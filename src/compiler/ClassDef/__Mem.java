package compiler.ClassDef;

import compiler.Type.*;

public class __Mem extends __Oprand {

	public int offset;
	public int length = 4;
	public __TempOprand base;
	
	public __Mem(__TempOprand t, int o, Type type) {
		base = t;
		offset = o;
		//if (type instanceof Char)
		//	length = 1;
	}
	
	@Override
	public String print() {
		return offset + "(" + base.print() + ")";
	}

	@Override
	public String pr() {
		return offset + "(" + base.pr() + ")";
	}

	@Override
	public int init(int x) {
		return base.init(x);
	}
	@Override
	public void load()
	{
		base.load();
	}

	@Override
	public void store() {
		base.store();
	}

	@Override
	__TempOprand use() {
		return base.use();
	}
	
	@Override
	__TempOprand def() throws Exception {
		throw new Exception("__Mem use");
	}
}
