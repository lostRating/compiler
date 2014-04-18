package compiler.Type;

import java.util.Vector;

public final class Struct extends Record{
	public Struct(Vector returnVec, String s) {
		for (int i = 0; i < returnVec.size(); i += 2)
		{
			types.add((Type) returnVec.get(i));
			names.add((String) returnVec.get(i + 1));
		}
		Name = s;
	}
}