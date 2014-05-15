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
	
	public static Vector<__Quad> seq_sne(Vector<__Quad> quad) throws Exception
	{
		Vector<__Quad> q = new Vector<__Quad>();
		
		for (int i = 0; i < quad.size(); ++i)
		{
			if ((quad.get(i) instanceof __BinOp) && (quad.get(i + 1) instanceof __Branch))
			{
				q.add(quad.get(i));
				
				__BinOp __b = (__BinOp) quad.get(i);
				__Branch __bb = (__Branch) quad.get(i + 1);
				if (__b.op.equals("==") && __b.def().temp.copy == ((__TempOprand)__bb.op).temp.copy)
				{
					if (__bb.num == 0)
					{
						__bb.num = 2;
						__bb.op = __b.left;
						__bb.op2 = __b.right;
					}
				}
				if (__b.op.equals("!=") && __b.def().temp.copy == ((__TempOprand)__bb.op).temp.copy)
				{
					if (__bb.num == 0)
					{
						__bb.num = 3;
						__bb.op = __b.left;
						__bb.op2 = __b.right;
					}
				}
			}
			else
				q.add(quad.get(i));
		}
		return q;
	}
	
	public static Vector<__Quad> work(Vector<__Quad> quad, int left, int right) throws Exception
	{
		return deadCodeDel(quad, left, right);
	}
}