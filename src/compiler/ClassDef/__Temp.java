package compiler.ClassDef;

import compiler.main.*;

public class __Temp {

	public __Temp(String s) {
		if (root.constant_expression > 0) return;
		name = s;
		if (!s.equals("$gp") && !s.equals("$sp"))
		{
			Static = main.Offset.size() == 1;
			if (!Static) num = ++count;
			offset = main.Offset.peek();
			if (s.equals(""))
			{
				main.Offset.pop();
				main.Offset.push(offset + 4);
			}
		}
	}
	
	public String print() {
		//if (name.equals("$gp") || name.equals("sp") || name.equals("fp"))
		if (!name.equals("")) return name;
		return "t" + num;
	}
	int num = 0, offset;
	boolean Static;
	String name = "";
	public static int count = 0;
}
