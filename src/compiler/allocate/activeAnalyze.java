package compiler.allocate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
	
	static public Vector<Integer> pre[] = new Vector[5500];
	static public HashMap<Integer, __TempOprand> in[] = new HashMap[5500];
	static public HashMap<Integer, __TempOprand> out[] = new HashMap[5500];
	static public int inNum[] = new int[5500];
	static public int outNum[] = new int[5500];
	static public HashMap<Integer, Integer> LL, RR;
	static public HashMap<Integer, __TempOprand> register;
	
	static public void init(Vector<__Quad> quad, int left, int right) throws Exception
	{
		HashMap<String, Integer> label = new HashMap<String, Integer>();
		LL = new HashMap<Integer, Integer>();
		RR = new HashMap<Integer, Integer>();
		register = new HashMap<Integer, __TempOprand>();
		
		for (int i = left; i <= right; ++i)
		{
			pre[i] = new Vector<Integer>();
			in[i] = new HashMap<Integer, __TempOprand>();
			out[i] = new HashMap<Integer, __TempOprand>();
		}
		
		for (int i = left; i < right; ++i)
		{
			if (quad.get(i) instanceof __LabelQuad)
			{
				String tmp = ((__LabelQuad)quad.get(i)).label.print();
				label.put(tmp, i);
			}
		}
		
		for (int i = left; i < right; ++i)
		{
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

			//init in[i]
			Vector<__TempOprand> tmp = quad.get(i).use();
			for (int j = 0; j < tmp.size(); ++j)
			{
				__TempOprand b = tmp.get(j);
				if (b == null) continue;
				in[i].put(b.temp.num, b);
				
				if (b.temp.num == 0) throw new Exception("active Analyze 1");
				
				register.put(b.temp.num, b);
				LL.put(b.temp.num, 1000000000);
				RR.put(b.temp.num, -1000000000);
			}
			__TempOprand b = quad.get(i).def();
			
			if (b == null) continue;
			if (b.temp.num == 0) throw new Exception("active Analyze 1");
			
			register.put(b.temp.num, b);
			LL.put(b.temp.num, 1000000000);
			RR.put(b.temp.num, -1000000000);
		}
	}
	
	static public void iteration(Vector<__Quad> quad, int left, int right) throws Exception
	{
		while (true)
		{
			for (int i = left; i < right; ++i)
			{
				inNum[i] = in[i].size();
				outNum[i] = out[i].size();
			}
			
			for (int i = right - 1; i >= left; --i)
			{
				Iterator iter = out[i].keySet().iterator();
				while (iter.hasNext())
				{
					int a = (int) iter.next();
					__TempOprand b = out[i].get(a);
					__TempOprand c = quad.get(i).def();
					if (c == null || (b.temp.num != c.temp.num))
						in[i].put(a, b);
				}
				
				iter = in[i].keySet().iterator();
				while (iter.hasNext())
				{
					int a = (int) iter.next();
					__TempOprand b = in[i].get(a);
					for (int j = 0; j < pre[i].size(); ++j)
						out[pre[i].get(j)].put(a, b);
				}
			}
			
			boolean flag = true;
			for (int i = left; i < right; ++i)
			{
				if (inNum[i] != in[i].size()) flag = false;
				if (outNum[i] != out[i].size()) flag = false;
			}
			if (flag) return;
		}
	}
	
	static public Vector<Integer> before[] = new Vector[5500];
	static public Vector<Integer> after[] = new Vector[5500];
	static String reg[] = {"$t0", "$t1", "$t2", "$t3", "$t4", "$t5", "$t6", "$t7", "$t8", "$t9", "$s4"};
	static int regNum = 11;
	static int use[] = new int[regNum];
	
	static public void interval(Vector<__Quad> quad, int left, int right) throws Exception
	{
		for (int i = left; i <= right; ++i)
		{
			before[i] = new Vector<Integer>();
			after[i] = new Vector<Integer>();
		}
		for (int i = 0; i < regNum; ++i)
			use[i] = -1;
		
		for (int i = left; i < right; ++i)
		{
			Iterator iter = in[i].keySet().iterator();
			while (iter.hasNext())
			{
				int a = (int) iter.next();
				if (i < LL.get(a)) LL.put(a, i);
				if (i > RR.get(a)) RR.put(a, i);
			}
			
			iter = out[i].keySet().iterator();
			while (iter.hasNext())
			{
				int a = (int) iter.next();
				if (i < LL.get(a)) LL.put(a, i);
				if (i > RR.get(a)) RR.put(a, i);
			}
		}
		
		Iterator iter = register.keySet().iterator();
		while (iter.hasNext())
		{
			int a = (int) iter.next();
			int ll = LL.get(a);
			int rr = RR.get(a);
			
			if (ll == 1000000000) continue;
			if (register.get(a).temp.danger)
			{
				continue;
			}
			
			before[ll].add(a);
			after[rr].add(a);
		}
		
		for (int i = left; i < right; ++i)
		{
			for (int j = 0; j < before[i].size(); ++j)
			{
				int num = before[i].get(j);
				allocate(num);
			}
			
			for (int j = 0; j < after[i].size(); ++j)
			{
				int num = after[i].get(j);
				for (int k = 0; k < regNum; ++k)
					if  (use[k] == num)
					{
						use[k] = -1;
						break;
					}
			}
		}
	}
	
	static public void allocate(int num)
	{
		int j = -1;
		for (int i = 0; i < regNum; ++i)
		{
			if (use[i] == -1)
			{
				gxxIn(i, num);
				return;
			}
			if (j == -1 || RR.get(use[i]) > RR.get(use[j]))
				j = i;
		}
		if (j == -1) return;
		if (RR.get(num) >= RR.get(use[j])) return;

		gxxOut(use[j]);
		gxxIn(j, num);
	}
	
	static public void gxxIn(int i, int num)
	{
		use[i] = num;
		register.get(num).temp.num = 0;
		register.get(num).temp.name = reg[i];
	}
	
	static public void gxxOut(int num)
	{
		for (int k = 0; k < regNum; ++k)
			if  (use[k] == num)
			{
				use[k] = -1;
				break;
			}
		register.get(num).temp.num = num;
		register.get(num).temp.name = "";
	}
	
	static public void functionAnalyze(Vector<__Quad> quad, int left, int right) throws Exception
	{
		init(quad, left, right);
		iteration(quad, left, right);
		interval(quad, left, right);
	}
}