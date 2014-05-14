package compiler.allocate;

import java.util.Vector;
import compiler.ClassDef.*;

public class optimize
{
	public static Vector<__Quad> deadCodeDel(Vector<__Quad> quad, int left, int right)
	{
		Vector<__Quad> q = new Vector<__Quad>();
		
		for (int i = left; i <= right; ++i)
			q.add(quad.get(i));
		
		return q;
	}
	
	public static Vector<__Quad> work(Vector<__Quad> quad, int left, int right)
	{
		return deadCodeDel(quad, left, right);
	}
}