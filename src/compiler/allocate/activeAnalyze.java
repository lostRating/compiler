package compiler.allocate;

import java.util.Vector;

import compiler.ClassDef.__Quad;
import compiler.main.main;
import compiler.ClassDef.*;

public class activeAnalyze
{
	static public void work(Vector<__Quad> quad) throws Exception
	{
		for (int left = 0; left < quad.size();)
		{
			int right = left;
			while (true)
			{
				if (quad.get(right) instanceof __Void && quad.get(right).print().equals(""))
					break;
				++right;
			}
			
			functionAnalyze(quad, left, right);
			
			left = right + 1;
		}
	}
	
	static public void functionAnalyze(Vector<__Quad> quad, int left, int right)
	{
		//init
		
		//Label
		for (int i = left; i < right; ++i)
		{
			if (quad.get(i) instanceof __LabelQuad)
			{
				
			}
		}
		//Jump & Branch
		for (int i = left; i < right; ++i)
		{
			if (quad.get(i) instanceof __Jump)
			{
				
			}
			else if (quad.get(i) instanceof __Branch)
			{
				
			}
		}
	}
}