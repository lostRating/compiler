package compiler.ClassDef;

import java.util.Vector;

public class __Move extends __Quad {
	
	public __Oprand src;
	public __Oprand dst;
	public int special = 0;
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
		tmp = dst.init(tmp);
		tmp = src.init(tmp);
		
		src.load();
		
		if (special == 1)
		{
			System.out.println("  lw " + dst.pr() + ", " + src.pr() + "($0)");
		}
		else if (special == 2)
		{
			System.out.println("  sw " + src.pr() + ", " + dst.pr() + "($0)");
		}
		else if (dst instanceof __Mem)
		{
			dst.load();
			System.out.println("  sw " + src.pr() + ", " + dst.pr());
			return;
		}
		else if (src instanceof __LabelAddress)
			System.out.println("  la " + dst.pr() + ", " + src.pr());
		else if (src instanceof __Const)
			System.out.println("  li " + dst.pr() + ", " + src.pr());
		else if (src instanceof __Mem)
			System.out.println("  lw " + dst.pr() + ", " + src.pr());
		else
			System.out.println("  move " + dst.pr() + ", " + src.pr());
		
		dst.store();
	}
	@Override
	public __TempOprand def() throws Exception {
		if (!(dst instanceof __Mem))
			return dst.def();
		return null;
	}
	@Override
	public Vector<__TempOprand> use() throws Exception {
		Vector<__TempOprand> tmp = new Vector<__TempOprand>();
		tmp.add(src.use());
		if (dst instanceof __Mem)
			tmp.add(dst.use());
		return tmp;
	}
}
