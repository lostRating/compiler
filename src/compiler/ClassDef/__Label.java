package compiler.ClassDef;

public class __Label {
	String name;
	public __Label() {
		name = "_L" + count++;
	}
	
	public __Label(String s) {
		if (s.equals("main") || s.equals("printf") || s.equals("$ra"))
			name = s;
		else
			name = "GXX_" + s;
	}

	public String print() {
		return name;
	}
	
	public static int count = 0;
}
