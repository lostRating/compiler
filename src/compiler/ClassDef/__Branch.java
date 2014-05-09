package compiler.ClassDef;

public class __Branch extends __Quad {
	public __Branch(){
		
	}
	public __Branch(__Oprand opa, __Label la, int num2) {
		op = opa;
		label = la;
		num = num2;
	}
	public __Oprand op;
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
			System.out.println("  beq "+ op.pr() + ", $0, " + label.print());
		else
			System.out.println("  bne "+ op.pr() + ", $0, " + label.print());
	}
}
