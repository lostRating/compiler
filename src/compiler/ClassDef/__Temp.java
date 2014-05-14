package compiler.ClassDef;

import compiler.main.*;

public class __Temp {

	public __Temp(String s) {
		if (root.constant_expression > 0) return;
		if (root.Inner > 0) return;
		name = s;
		if (s.length() == 0 || s.charAt(0) != '$')
		{
			offset = main.Offset.peek();
			//if (s.equals(""))
			//{
				num = ++count;
				main.Offset.pop();
				main.Offset.push(offset + 4);
			//}
		}
	}
	
	public String print() {
		if (name.length() != 0 && name.charAt(0) == '$') return name;
		return "t" + num;
	}
	public int num = 0, offset, nowNum;
	public String name = "";
	public static int count = 0;
	public boolean danger = false;
	
	public String pr()
	{
		if (num == 0) return name;
		return "$s" + nowNum;
	}
}
