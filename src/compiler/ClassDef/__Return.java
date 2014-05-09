package compiler.ClassDef;

import compiler.Type.Function;

public class __Return extends __Quad {

	public Function func;
	public __Return(Function v){
		func = v;
	}

	@Override
	public String print() {
		return "  add $sp, $sp, " + func.size;
	}
	@Override
	public void pr() {
		System.out.println(print());
	}
}
