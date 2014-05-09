package compiler.ClassDef;

public class __Void extends __Quad{
	public __Void(String s2) {
		s = s2;
	}
	String s;
	@Override
	public String print() {
		return s;
	}
	@Override
	public void pr()
	{
		System.out.println(print());
	}
}
