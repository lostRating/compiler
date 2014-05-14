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
	public int init(int x) {
		return x;
	}
	@Override
	public void load()
	{
		return;
	}
	@Override
	public void store() {
		return;
	}
	@Override
	__TempOprand use(){
		return null;
	}
	@Override
	__TempOprand def() {
		return null;
	}
}
