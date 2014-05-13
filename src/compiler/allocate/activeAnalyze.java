package compiler.allocate;

import java.util.HashMap;
import java.util.Vector;

import compiler.ClassDef.__Quad;
import compiler.main.main;
import compiler.ClassDef.*;

public class activeAnalyze
{
	static public Vector<Integer> pre[] = new Vector[5500];
	
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
	
	static public void addEdge(Vector<__Quad> quad, int left, int right) throws Exception
	{
		//init begin
		HashMap<String, Integer> label = new HashMap<String, Integer>();
		for (int i = left; i <= right; ++i)
			pre[i] = new Vector<Integer>();
		//init end
		
		//Label begin
		for (int i = left; i < right; ++i)
		{
			if (quad.get(i) instanceof __LabelQuad)
			{
				String tmp = ((__LabelQuad)quad.get(i)).label.print();
				label.put(tmp, i);
			}
		}
		//Label end
		
		//Jump & Branch begin
		/*for (int i = left; i < right; ++i)
		{
			//System.out.println(quad.get(i));
			if (quad.get(i) instanceof __Jump)
			{
				String tmp = ((__Jump)quad.get(i)).label.print();
				pre[label.get(tmp)].add(i);
			}
			else if (quad.get(i) instanceof __Branch)
			{
				String tmp = ((__Branch)quad.get(i)).label.print();
				pre[label.get(tmp)].add(i);
				pre[i + 1].add(i);
			}
			else if (quad.get(i) instanceof __Return) {}
			else if (quad.get(i) instanceof __Void && ((__Void)quad.get(i)).print().equals("  jr $ra")) {}
			else
			{
				pre[i + 1].add(i);
			}
		}*/
		//Jump & Branch end
	}
	
	static public void functionAnalyze(Vector<__Quad> quad, int left, int right) throws Exception
	{
		addEdge(quad, left, right);
		
	}
}