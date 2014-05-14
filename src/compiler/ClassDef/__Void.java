package compiler.ClassDef;

import java.util.Vector;

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
	@Override
	public __TempOprand def() throws Exception {
		return null;
	}
	@Override
	public Vector<__TempOprand> use() throws Exception {
		return new Vector<__TempOprand>();
	}
}
