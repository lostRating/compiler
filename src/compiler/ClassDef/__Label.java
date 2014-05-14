package compiler.ClassDef;

public class __Label {
	public String name;
	public String copy;
	public __Label() {
		name = "_L" + count++;
	}
	
	public __Label(String s) {
		copy = s;
		if (s.equals("main") || s.equals("printf") || s.equals("$ra") || s.equals("malloc"))
			name = s;
		else
			name = "GXX_" + s;
	}

	public String print() {
		return name;
	}
	
	public static int count = 0;
}
