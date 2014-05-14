package compiler.ClassDef;

import java.util.Vector;

import compiler.Type.Function;
import compiler.Type.Int;

public class __Return extends __Quad {

	public Function func;
	public __Return(Function v){
		func = v;
	}

	@Override
	public String print() {
		return "  return " + func.Name;
	}
	@Override
	public void pr() {
		System.out.println("  lw $ra, " + (func.size - 16) + "($sp)");
		System.out.println("  lw $s0, " + (func.size - 12) + "($sp)");
		System.out.println("  lw $s1, " + (func.size - 8) + "($sp)");
		System.out.println("  lw $s2, " + (func.size - 4) + "($sp)");
		System.out.println("  add $sp, $sp, " + func.size);
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
