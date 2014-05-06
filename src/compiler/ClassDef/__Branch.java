package compiler.ClassDef;

public class __Branch extends __Quad {
	public __Branch(){
		
	}
	public __Branch(__Oprand opa, __Label la) {
		op = opa;
		label = la;
	}
	public __Oprand op;
	public __Label label;
	@Override
	public String toString() {
		return "if (" + op.toString() + " == zero) goto " + label.toString();
	}
}
