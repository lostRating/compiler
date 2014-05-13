package compiler.ClassDef;

public class __Jump extends __Quad {

	public __Label label;
	public __Jump(__Label l) {
		label = l;
	}
	@Override
	public String print() {
		return "  b " + label.print();
	}
	@Override
	public void pr()
	{
		System.out.println(print());
	}
}
