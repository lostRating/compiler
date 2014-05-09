package compiler.ClassDef;

public class __LabelAddress extends __Oprand {

	public __LabelAddress(__Label l){
		label = l;
	}
			
	public __Label label;
	@Override
	public String print() {
		return label.print();
	}
	@Override
	public String pr() {
		return print();
	}
	@Override
	public int load(int x) {
		return x;
	}
	@Override
	public void store() {
		return; 
	}
}
