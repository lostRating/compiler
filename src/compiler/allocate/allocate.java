package compiler.allocate;

import java.util.Vector;

import compiler.ClassDef.__Quad;
import compiler.main.main;
import compiler.ClassDef.*;

public class allocate
{
	static String register[] = {"$t0", "$t1", "$t2", "$t3", "$t4", "$t5", "$t6", "$t7", "$t8", "$t9"};
	
	static public void toMips(Vector<__Quad> quad) throws Exception
	{
		activeAnalyze.work(quad);
		
		for (int i = 0; i < quad.size(); ++i)
		{
			if (!main.mips)
				System.out.println(quad.get(i).print());
			if (main.mips)
				quad.get(i).pr();
		}
	}
}