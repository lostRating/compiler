package compiler.ClassDef;

public class __Jump extends __Quad {

	public __Label label;
	public __Jump(__Label l) {
		label = l;
	}
	@Override
	public String print() {
		if (label.name.equals("$ra"))
			return "  jr $ra";
		return "  b " + label.print();
	}

}
