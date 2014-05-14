package compiler.ClassDef;

import java.util.Vector;

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
	@Override
	public __TempOprand def() throws Exception {
		return null;
	}
	@Override
	public Vector<__TempOprand> use() throws Exception {
		return new Vector<__TempOprand>();
	}
}
