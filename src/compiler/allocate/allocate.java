package compiler.allocate;

import java.util.Vector;

import compiler.ClassDef.__Quad;

public class allocate
{
	static String register[] = {"$t0", "$t1", "$t2", "$t3", "$t4", "$t5", "$t6", "$t7", "$t8", "$t9"};
	static public void registerAnalyze()
	{
		
	}
	static public void toMips(Vector<__Quad> quad)
	{
		registerAnalyze();
		System.out.println("hello");
	}
}