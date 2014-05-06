package compiler.ClassDef;

import compiler.main.*;

public class __Temp {

	public __Temp(String s) {
		if (root.constant_expression > 0) return;
		name = s;
		if (!s.equals("$gp") && !s.equals("$sp") && !s.equals("fp"))
		{
			Static = main.Offset.size() == 1;
			if (!(Static || root.structOrArray > 0)) num = count++;
			offset = main.Offset.peek();
			if (s.equals(""))
			{
				main.Offset.pop();
				main.Offset.push(offset + 4);
			}
		}
	}
	
	@Override
	public String toString() {
		//if (name.equals("$gp") || name.equals("sp") || name.equals("fp"))
		if (!name.equals("")) return name;
		return "t" + num;
	}
	int num, offset;
	boolean Static;
	String name = "";
	public static int count = 0;
}
