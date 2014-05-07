package compiler.ClassDef;

import java.util.Vector;

import compiler.Type.Type;

public class __TempOprand extends __Oprand{
	public __Temp temp;
	public boolean pointer = false;
	public __TempOprand(__Temp t) {
		temp = t;
	}
	public __TempOprand(__Temp t, int hehe)
	{
		temp = t;
		pointer = true;
	}
	public __Oprand Mem(Type type)
	{
		if (pointer) return new __Mem(this, 0, type);
		return this;
	}
	public __Oprand Val(Vector<__Quad> quad, Type type)
	{
		if (pointer)
		{
			__TempOprand __t = new __TempOprand(new __Temp(""));
			quad.add(new __Move(__t, new __Mem(this, 0, type)));
			return __t;
		}
		return this;
	}
	public String print() {
		return temp.print();
	}
}
