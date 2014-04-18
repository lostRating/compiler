package compiler.Type;

public final class Array extends Pointer{
	public Array(Type newType, int i, String name) {
		elementType = newType;
		capacity = i;
		Name = name;
	}
	int capacity;
}