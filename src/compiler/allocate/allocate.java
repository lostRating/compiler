package compiler.allocate;

import java.util.Vector;

import compiler.ClassDef.__Quad;
import compiler.main.main;
import compiler.ClassDef.*;

public class allocate
{
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