package compiler.ClassDef;

import java.util.Vector;

public class __Call extends __Quad {

	public __Call(__Label name) {
		function = name;
	}
	public __Label function;
	@Override
	public String print() {
		return "  jal " + function.print();
	}
}
