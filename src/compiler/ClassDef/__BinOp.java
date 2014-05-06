package compiler.ClassDef;

public class __BinOp extends __Quad {

	public __Oprand left;
	public __Oprand right;
	public __Oprand dst;
	public String op;
	@Override
	public String toString() {
		return dst.toString() + " <- " + left.toString() + " " + op + " " + right.toString();
	}

	public __BinOp(__Oprand d, __Oprand l, __Oprand r, String o) {
		dst = d;
		left = l;
		right = r;
		op = o;
	}
}
