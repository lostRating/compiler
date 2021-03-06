package compiler.ClassDef;

import java.util.Vector;

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
		{
			s += "  seq ";// + dst.print() + ", " + left.print() + ", " + right.print();
		}
		else if (op.equals("!="))
		{
			s += "  sne ";// + dst.print() + ", " + left.print() + ", " + right.print();
		}
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
			
			tmp = dst.init(tmp);
			tmp = right.init(tmp);
			
			right.load();
			dst.load();
			
			if (left instanceof __Const && op.equals("-"))
				s += "  neg " + dst.pr() + ", " + right.pr();
			else if (left instanceof __Const && op.equals("~"))
				s += "  not " + dst.pr() + ", " + right.pr();
			else if (left instanceof __Const && op.equals("!"))
				s += "  seq " + dst.pr() + ", " + right.pr() + ", $0";
			else throw new Exception("__BinOp " + op);
			
			System.out.println(s);
			
			dst.store();
			right.store();
			
			return;
		}
		
		int tmp = 0;
		
		tmp = dst.init(tmp);
		tmp = left.init(tmp);
		tmp = right.init(tmp);
		
		left.load();
		right.load();
		
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
		else throw new Exception("__BinOp 2 " + op);
		
		s += dst.pr() + ", " + left.pr() + ", " + right.pr();
		
		System.out.println(s);
		
		dst.store();
	}

	public __BinOp(__Oprand d, __Oprand l, __Oprand r, String o) {
		dst = d;
		left = l;
		right = r;
		op = o;
	}
	@Override
	public __TempOprand def() throws Exception {
		return dst.def();
	}
	@Override
	public Vector<__TempOprand> use() throws Exception {
		Vector<__TempOprand> tmp = new Vector<__TempOprand>();
		tmp.add(left.use());
		tmp.add(right.use());
		return tmp;
	}
}
