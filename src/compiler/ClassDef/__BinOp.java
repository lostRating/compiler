package compiler.ClassDef;

public class __BinOp extends __Quad {

	public __Oprand left;
	public __Oprand right;
	public __Oprand dst;
	public String op;
	@Override
	public String print() throws Exception{
		String s = "";
		if (!(left instanceof __TempOprand))
		{
			if (left instanceof __Const && op.equals("-"))
				s += "  neg " + dst.print() + ", " + right.print();
			else if (left instanceof __Const && op.equals("~"))
				s += "  not " + dst.print() + ", " + right.print();
			else if (left instanceof __Const && op.equals("!"))
				s += "  seq " + dst.print() + ", " + right.print() + ", $0";
			else throw new Exception("__BinOp");
			
			return s;
		}
		if (op.equals("+"))
			s += "  add ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("-"))
			s += "  sub ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("*"))
			s += "  mul ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("/"))
			s += "  div ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("|"))
			s += "  or ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("&"))
			s += "  and ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("^"))
			s += "  xor ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("%"))
			s += "  rem ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("<<"))
			s += "  sll ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals(">>"))
			s += "  srl ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("=="))
			s += "  seq ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("!="))
			s += "  sne ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals(">"))
			s += "  sgt ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals(">="))
			s += "  sge ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("<"))
			s += "  slt ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("<="))
			s += "  sle ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else throw new Exception("__BinOp 2");
		
		s += dst.print() + ", " + left.print() + ", " + right.print();
		
		return s;
	}
	@Override
	public void pr() throws Exception
	{
		if (!(left instanceof __TempOprand))
		{
			String s = "";
			int tmp = 0;
			
			tmp = dst.load(tmp);
			tmp = right.load(tmp);
			
			if (left instanceof __Const && op.equals("-"))
				s += "  neg " + dst.pr() + ", " + right.pr();
			else if (left instanceof __Const && op.equals("~"))
				s += "  not " + dst.pr() + ", " + right.pr();
			else if (left instanceof __Const && op.equals("!"))
				s += "  seq " + dst.pr() + ", " + right.pr() + ", $0";
			else throw new Exception("__BinOp");
			
			dst.store();
			right.store();
		}
		
		int tmp = 0;
		
		tmp = dst.load(tmp);
		tmp = left.load(tmp);
		tmp = right.load(tmp);
		
		String s = "";
		if (op.equals("+"))
			s += "  add ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("-"))
			s += "  sub ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("*"))
			s += "  mul ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("/"))
			s += "  div ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("|"))
			s += "  or ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("&"))
			s += "  and ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("^"))
			s += "  xor ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("%"))
			s += "  rem ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("<<"))
			s += "  sll ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals(">>"))
			s += "  srl ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("=="))
			s += "  seq ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("!="))
			s += "  sne ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals(">"))
			s += "  sgt ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals(">="))
			s += "  sge ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("<"))
			s += "  slt ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else if (op.equals("<="))
			s += "  sle ";// + dst.print() + ", " + left.print() + ", " + right.print();
		else throw new Exception("__BinOp 2");
		
		s += dst.pr() + ", " + left.pr() + ", " + right.pr();
		
		System.out.println(s);
		
		dst.store();
		left.store();
		right.store();
	}

	public __BinOp(__Oprand d, __Oprand l, __Oprand r, String o) {
		dst = d;
		left = l;
		right = r;
		op = o;
	}
}
