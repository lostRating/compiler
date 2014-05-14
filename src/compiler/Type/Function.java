package compiler.Type;

import java.util.Vector;

import compiler.allocate.activeAnalyze;

public final class Function extends Type{
	public Function(Type returnType2, Vector argumentType2, String Name2) {
		returnType = returnType2;
		for (int i = 0; i < argumentType2.size(); i += 2)
			argumentType.add(argumentType2.get(i));
		Name = Name2;
		
		size = 0;
		
		for (int i = 0; i < activeAnalyze.regNum; ++i)
			use[i] = 0;
	}
	public Vector argumentType = new Vector();
	public Type returnType;
	public Vector<Integer> argOffset = new Vector<Integer>();
	public int use[] = new int[activeAnalyze.regNum];
}