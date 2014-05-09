package compiler.ClassDef;

import java.util.Vector;

import compiler.Type.Function;
import compiler.Type.Struct;

public class __Call extends __Quad {

	public __Call(__Label name, Function func2, Vector<__TempOprand> arg2) {
		function = name;
		func = func2;
		for (int i = 0; i < arg2.size(); ++i)
			arg.add(arg2.get(i));
	}
	public __Label function;
	public Function func;
	public Vector<__TempOprand> arg = new Vector<__TempOprand>();
	@Override
	public String print() {
		String s = "  call " + function.print() + " ( ";
		for (int i = 0; i < arg.size(); ++i)
		{
			if (i != 0) s += " , ";
			s += arg.get(i).print();
		}
		s += " )";
		return s;
	}
	@Override
	public void pr() throws Exception {
		for (int i = 0; i < arg.size(); ++i)
		{
			if (func.argumentType.get(i) instanceof Struct)	throw new Exception("__Call");
			arg.get(i).load(0);
			System.out.println("  sw " + arg.get(i).pr() + ", " + (func.argOffset.get(i) - func.size) + "($sp)");
			arg.get(i).store();
		}
		System.out.println("  jal " + function.print());
	}
}
