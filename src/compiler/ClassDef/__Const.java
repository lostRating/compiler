package compiler.ClassDef;

public class __Const extends __Oprand {

	public int value;
	public __Const(int v) {
		value = v;
	}

	@Override
	public String toString() {
		return value + "";
	}

}
