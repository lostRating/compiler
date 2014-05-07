package compiler.ClassDef;

public class __Label {
	String name;
	public __Label() {
		name = "_L" + count++;
	}
	
	public __Label(String s) {
		name = s;
	}

	public String print() {
		return name;
	}
	
	public static int count = 0;
}
