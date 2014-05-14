package compiler.allocate;

import java.util.Vector;

import compiler.ClassDef.*;

public class optimize
{
	public static Vector<__Quad> deadCodeDel(Vector<__Quad> quad, int left, int right) throws Exception
	{
		Vector<__Quad> q = new Vector<__Quad>();
		
		for (int i = left; i <= right; ++i)
		{
			__TempOprand __t = quad.get(i).def();
			if (__t != null && activeAnalyze.out[i].get(__t.temp.copy) == null && !__t.temp.danger)
			{
				continue;
			}
			q.add(quad.get(i));
		}
		
		return q;
	}
	
	public static Vector<__Quad> work(Vector<__Quad> quad, int left, int right) throws Exception
	{
		return deadCodeDel(quad, left, right);
	}
}