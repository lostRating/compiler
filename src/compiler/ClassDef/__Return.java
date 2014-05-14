package compiler.ClassDef;

import java.util.Vector;

import compiler.Type.Function;
import compiler.Type.Int;
import compiler.allocate.activeAnalyze;

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
		System.out.println("  lw $ra, " + (func.size - 48) + "($sp)");
		if (activeAnalyze.useReg[0] == 1) System.out.println("  lw $t0, " + (func.size - 44) + "($sp)");
		if (activeAnalyze.useReg[1] == 1) System.out.println("  lw $t1, " + (func.size - 40) + "($sp)");
		if (activeAnalyze.useReg[2] == 1) System.out.println("  lw $t2, " + (func.size - 36) + "($sp)");
		if (activeAnalyze.useReg[3] == 1) System.out.println("  lw $t3, " + (func.size - 32) + "($sp)");
		if (activeAnalyze.useReg[4] == 1) System.out.println("  lw $t4, " + (func.size - 28) + "($sp)");
		if (activeAnalyze.useReg[5] == 1) System.out.println("  lw $t5, " + (func.size - 24) + "($sp)");
		if (activeAnalyze.useReg[6] == 1) System.out.println("  lw $t6, " + (func.size - 20) + "($sp)");
		if (activeAnalyze.useReg[7] == 1) System.out.println("  lw $t7, " + (func.size - 16) + "($sp)");
		if (activeAnalyze.useReg[8] == 1) System.out.println("  lw $t8, " + (func.size - 12) + "($sp)");
		if (activeAnalyze.useReg[9] == 1) System.out.println("  lw $t9, " + (func.size - 8) + "($sp)");
		if (activeAnalyze.useReg[10] == 1) System.out.println("  lw $s4, " + (func.size - 4) + "($sp)");
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
