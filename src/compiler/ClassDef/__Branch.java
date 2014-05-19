package compiler.ClassDef;

import java.util.Vector;

public class __Branch extends __Quad {
	public __Branch(){
		
	}
	public __Branch(__Oprand opa, __Label la, int num2) {
		op = opa;
		label = la;
		num = num2;
	}
	public __Oprand op, op2 = null;
	public __Label label;
	public int num;
	@Override
	public String print() {
		if (num == 0)
			return "  beq "+ op.print() + ", $0, " + label.print();
		else
			return "  bneq "+ op.print() + ", $0, " + label.print();
	}
	@Override
	public void pr() throws Exception {
		int tmp = 0;
		tmp = op.init(tmp);
		op.load();
		if (num == 0)
			System.out.println("  beq " + op.pr() + ", $0, " + label.print());
		else if (num == 1)
			System.out.println("  bne " + op.pr() + ", $0, " + label.print());
		else if (num == 2)
		{
			op2.load();
			System.out.println("  bne " + op.pr() + ", " + op2.pr() + ", " + label.print());
		}
		else if (num == 3)
		{
			op2.load();
			System.out.println("  beq " + op.pr() + ", " + op2.pr() + ", " + label.print());
		}
	}
	@Override
	public __TempOprand def() throws Exception {
		return null;
	}
	@Override
	public Vector<__TempOprand> use() throws Exception {
		Vector<__TempOprand> tmp = new Vector<__TempOprand>();
		tmp.add(op.use());
		if (op2 != null) tmp.add(op2.use());
		return tmp;
	}
}
