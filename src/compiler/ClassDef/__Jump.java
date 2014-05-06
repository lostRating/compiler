package compiler.ClassDef;

public class __Jump extends __Quad {

	public __Label label;
	public __Jump(__Label l) {
		label = l;
	}
	@Override
	public String toString() {
		return "jump " + label.toString();
	}

}
