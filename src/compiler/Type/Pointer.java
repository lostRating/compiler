package compiler.Type;

import compiler.Semantic.Symbol;

public class Pointer extends Type{
	public Pointer(){}
	public Pointer(Type type, String string) {
		elementType = type;
		Name = string;
		
		size = 4;
	}

	public Type elementType;
}