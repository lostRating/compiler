package compiler.ClassDef;

public class __Move extends __Quad {
	
	public __Oprand src;
	public __Oprand dst;
	public __Move(__Oprand d, __Oprand s) {
		dst = d;
		src = s;
	}
	@Override
	public String toString() {
		//System.out.println(dst);
		//System.out.println(src);
		//System.out.println();
		return dst.toString() + " <- " + src.toString();
	}
}
