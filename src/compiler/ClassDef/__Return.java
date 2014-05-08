package compiler.ClassDef;

public class __Return extends __Quad {

	public __Oprand value;
	public __Return(__Oprand v){
		value = v;
	}

	@Override
	public String print() {
		return "  return " + value.print();
	}
}
