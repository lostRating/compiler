package compiler.ClassDef;

import java.util.Vector;

import compiler.Type.Function;
import compiler.Type.Struct;
import compiler.Type.Type;

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
		//System.out.println(function.name);
		for (int i = 0; i < arg.size(); ++i)
		{
			arg.get(i).init(0);
			arg.get(i).load();
			if (func.argumentType.get(i) instanceof Struct)
			{
				for (int j = 0; j < ((Type) (func.argumentType.get(i))).size; j += 4)
				{
					System.out.println("  lw $v0, " + j + "(" + arg.get(i).pr() + ")");
					System.out.println("  sw $v0, " + (func.argOffset.get(i) + j) + "($gp)");
				}
			}
			else
				System.out.println("  sw " + arg.get(i).pr() + ", " + func.argOffset.get(i) + "($gp)");
			//arg.get(i).store();
		}
		System.out.println("  jal " + function.print());
	}
}
