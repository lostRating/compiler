package compiler.ClassDef;

public class __Const extends __Oprand {

	public int value;
	public __Const(int v) {
		value = v;
	}
	@Override
	public String print() {
		return value + "";
	}
	@Override
	public String pr() {
		return print();
	}
	@Override
	public int load(int x) {
		return x;
	}
	@Override
	public void store() {
		return;
	}
}
