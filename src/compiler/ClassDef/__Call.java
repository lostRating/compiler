package compiler.ClassDef;

import java.util.Vector;

import compiler.Type.Function;
import compiler.Type.Struct;
import compiler.Type.Type;

public class __Call extends __Quad {

	public __Call(__Label name) {
		function = name;
	}
	public __Label function;
	@Override
	public String print() {
		String s = "  call " + function.print();
		return s;
	}
	@Override
	public void pr() throws Exception {
		//System.out.println(function.name);
		System.out.println("  jal " + function.print());
	}
}
