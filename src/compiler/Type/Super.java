package compiler.Type;

import compiler.ClassDef.*;

public class Super
{
	public Super(Type type2, int scope2, Object tmp2)
	{
		type = type2;
		scope = scope2;
		tmp = tmp2;
	}
	public Type type;
	public int scope;
	public Object tmp;
}