package compiler.ClassDef;

public class __BinOp extends __Quad {

	public __Oprand left;
	public __Oprand right;
	public __Oprand dst;
	public String op;
	@Override
	public String print() throws Exception{
		if (!(left instanceof __TempOprand))
		{
			if (left instanceof __Const && op.equals("-"))
				return "neg " + dst.print() + ", " + right.print();
			if (left instanceof __Const && op.equals("~"))
				return "not " + dst.print() + ", " + right.print();
			if (left instanceof __Const && op.equals("!"))
				return "seq " + dst.print() + ", " + right.print() + ", $0";
			throw new Exception("__BinOp");
		}
		if (op.equals("+"))
			return "add " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("-"))
			return "sub " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("*"))
			return "mul " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("/"))
			return "div " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("|"))
			return "or " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("&"))
			return "and " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("^"))
			return "xor " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("%"))
			return "rem " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("<<"))
			return "sll " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals(">>"))
			return "srl " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("=="))
			return "seq " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("!="))
			return "sne " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals(">"))
			return "sgt " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals(">="))
			return "sge " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("<"))
			return "slt " + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("<="))
			return "sle " + dst.print() + ", " + left.print() + ", " + right.print();
		throw new Exception("__BinOp 2");
	}

	public __BinOp(__Oprand d, __Oprand l, __Oprand r, String o) {
		dst = d;
		left = l;
		right = r;
		op = o;
	}
}
