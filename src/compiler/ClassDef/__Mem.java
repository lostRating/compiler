package compiler.ClassDef;

public class __Mem extends __Oprand {

	public int offset;
	public int length = 4;
	public __Temp base;
	public __Mem(__Temp t) {
		base = t;
	}
	
	public __Mem(__Temp t, int o) {
		base = t;
		offset = o;
	}
	
	public __Mem(int o) {
		this(null, o);
	}
	
	@Override
	public String toString() {
		if (base == null) {
			return offset + "($zero)";
		}
		else return offset + "(" + base.toString() + ")";
	}

}
