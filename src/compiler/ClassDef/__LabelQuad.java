package compiler.ClassDef;

public class __LabelQuad extends __Quad {

	public __LabelQuad(__Label l){
		label = l;
	}
			
	public __Label label;
	@Override
	public String print() {
		return label.print() + ":";
	}
}
