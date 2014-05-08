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
		{
			if (((__Mem)dst).length == 4)
				return "  sw " + src.print() + ", " + dst.print();
			else
				return "  sb " + src.print() + ", " + dst.print();
		}
		if (src instanceof __TempOprand && ((__TempOprand)src).temp.Static)
			return "  la " + dst.print() + ", " + src.print();
		if (src instanceof __LabelAddress)
			return "  la " + dst.print() + ", " + src.print();
		if (src instanceof __Const)
			return "  li " + dst.print() + ", " + src.print();
		if (src instanceof __Mem)
			return "  lw " + dst.print() + ", " + src.print();
		return "  move " + dst.print() + ", " + src.print();
	}
}
