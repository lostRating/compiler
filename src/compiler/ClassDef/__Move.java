package compiler.ClassDef;

public class __Move extends __Quad {
	
	public __Oprand src;
	public __Oprand dst;
	public __Move(__Oprand d, __Oprand s) {
		dst = d;
		src = s;
	}
	@Override
	public String print() {
		if (dst instanceof __Mem)
			return "  sw " + src.print() + ", " + dst.print();
		if (src instanceof __LabelAddress)
			return "  la " + dst.print() + ", " + src.print();
		if (src instanceof __Const)
			return "  li " + dst.print() + ", " + src.print();
		if (src instanceof __Mem)
			return "  lw " + dst.print() + ", " + src.print();
		return "  move " + dst.print() + ", " + src.print();
	}
	@Override
	public void pr()
	{
		int tmp = 0;
		tmp = dst.load(tmp);
		tmp = src.load(tmp);
		
		if (dst instanceof __Mem)
			System.out.println("  sw " + src.pr() + ", " + dst.pr());
		else if (src instanceof __LabelAddress)
			System.out.println("  la " + dst.pr() + ", " + src.pr());
		else if (src instanceof __Const)
			System.out.println("  li " + dst.pr() + ", " + src.pr());
		else if (src instanceof __Mem)
			System.out.println("  lw " + dst.pr() + ", " + src.pr());
		else
			System.out.println("  move " + dst.pr() + ", " + src.pr());
		
		dst.store();
		src.store();
	}
}
