package compiler.ClassDef;

import java.util.Vector;

public class __LabelQuad extends __Quad {

	public __LabelQuad(__Label l){
		label = l;
	}
			
	public __Label label;
	@Override
	public String print() {
		return label.print() + ":";
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
