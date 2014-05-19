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
	
	public static Vector<__Quad> peepHole(Vector<__Quad> quad, int left, int right) throws Exception
	{
		Vector<__Quad> q = new Vector<__Quad>();
		
		for (int i = left; i <= right; ++i)
		{
			if ((quad.get(i) instanceof __BinOp) && (quad.get(i + 1) instanceof __Branch))
			{
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
			
			if (quad.get(i) instanceof __Move && quad.get(i).def() != null)
			{
				__Move __a = (__Move) quad.get(i);
				boolean flag = false;
				if (__a.special != 0) flag = true;
				
				for (int j = i + 1; j <= i + 10 && j <= right; ++j)
				{
					if (quad.get(j) instanceof __Branch) break;
					if (quad.get(j) instanceof __Jump) break;
					if (quad.get(j) instanceof __Return) break;
					if (quad.get(j).def() != null && quad.get(j).def().temp.copy == __a.def().temp.copy) break;
					if (quad.get(j).def() != null && quad.get(j).def().temp.danger) break;
					if (flag) break;
					
					if (quad.get(j) instanceof __Move)
					{
						__Move __b = (__Move) quad.get(j);
						
						if (__a.src instanceof __LabelAddress && __b.src instanceof __Mem &&
							__a.def().temp.copy == ((__Mem) __b.src).base.temp.copy && __b.special == 0)
						{
							__b.special = 1;
							__b.src = __a.src;
						}
						
						if (__a.src instanceof __LabelAddress && __b.dst instanceof __Mem &&
							__a.def().temp.copy == ((__Mem) __b.dst).base.temp.copy && __b.special == 0)
						{
							__b.special = 2;
							__b.dst = __a.src;
						}
						
						if (__a.src instanceof __Const && __b.src instanceof __TempOprand &&
							__a.def().temp.copy == ((__TempOprand) __b.src).temp.copy && __b.special == 0)
						{
							if (__b.def() != null)
							{
								__b.src = __a.src;
							}
						}
					}
					
					if (quad.get(j) instanceof __BinOp)
					{
						__BinOp __b = (__BinOp) quad.get(j);
						
						if (__a.src instanceof __Const && __b.right instanceof __TempOprand &&
							__a.def().temp.copy == ((__TempOprand) __b.right).temp.copy)
						{
							if (__b.left instanceof __TempOprand)
							{
								__b.right = __a.src;
							}
						}
					}
				}
			}
			
			if (quad.get(i) instanceof __BinOp && quad.get(i).def() != null)
			{
				__BinOp __a = (__BinOp) quad.get(i);
				Vector<__TempOprand> tmp = __a.use();
				boolean flag = false;
				for (int j = 0; j < tmp.size(); ++j)
				{
					__TempOprand __t  = tmp.get(j);
					if (__t == null) continue;
					if (__a.def().temp.copy == __t.temp.copy) flag = true;
				}
				
				for (int j = i + 1; j <= i + 10 && j <= right; ++j)
				{
					if (quad.get(j) instanceof __Branch) break;
					if (quad.get(j) instanceof __Jump) break;
					if (quad.get(j) instanceof __Return) break;
					if (quad.get(j).def() != null && quad.get(j).def().temp.copy == __a.def().temp.copy) break;
					if (flag) break;
					
					if (quad.get(j) instanceof __Move)
					{
						__Move __b = (__Move) quad.get(j);
						
						if (__b.src instanceof __TempOprand && __a.def().temp.copy == ((__TempOprand) __b.src).temp.copy)
						{
							if (__b.def() != null)
							{
								//System.out.println("!!!");
								quad.set(j, new __BinOp(__b.def(), __a.left, __a.right, __a.op));
							}
						}
					}
				}
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