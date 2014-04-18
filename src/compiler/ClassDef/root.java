package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.Type.Void;
import compiler.main.main;

public class root
{
	static int AC = 0;
	static int WA = 1;
	public String s;
	public Vector vec = new Vector(), returnVec = new Vector();
	public root son;
	public root(){
		s = "";
	}
	public root(String ss){
		s = ss;
	}
	public void addChild(root a){
		vec.add(a);
	}
	public int checkSon() throws Exception{
		return AC;
	}
	public int checkSon(Type type) throws Exception
	{
		return AC;
	}
	
	//----------------------------------------------------------------
		
	public void beginScope()
	{
		main.S.beginScope();
		main.F.beginScope();
		++main.scope;
	}
	public void endScope()
	{
		main.S.endScope();
		main.F.endScope();
		--main.scope;
	}
	public void beginLoop()
	{
		++main.loop;
	}
	public void endLoop()
	{
		--main.loop;
	}
	public boolean addSymbol(Table T, Type type, String name, boolean VOID)
	{
		Super tmp1 = (Super)T.get(Symbol.symbol(name));
		if (tmp1 != null && tmp1.scope == main.scope) return false;
		if (type instanceof Name) return false;
		if (VOID && (type instanceof Void)) return false;
		T.put(Symbol.symbol(name), new Super(type, main.scope));
		return true;
	}
	public boolean sameType(Type a, Type b)
	{
		if (a instanceof Pointer && b instanceof Pointer)
		{
			a = ((Pointer) a).elementType;
			b = ((Pointer) b).elementType;
			return sameType(a, b);
		}
		else
			return a == b;
	}
	public boolean typeToType(Type a, Type b)
	{
		if (sameType(a, b)) return true;
		if (a instanceof Int && b instanceof Char) return true;
		if (a instanceof Char && b instanceof Int) return true;
		if (sameType(b, main.GXX_VOID_STAR)) return true;
		if (a instanceof Int && b instanceof Pointer) return true;
		if (a instanceof Char && b instanceof Pointer) return true;
		if (a instanceof Pointer && b instanceof Int) return true;
		if (a instanceof Pointer && b instanceof Char) return true;
		if (a instanceof Pointer && b instanceof Pointer)
			return typeToType(((Pointer)a).elementType, ((Pointer)b).elementType);
		return false;
	}
	public boolean typeVectorMatch(Vector a, Vector b)
	{
		//System.out.println(a.size());
		if (a.size() != b.size()) return false;
		for (int i = 0; i < a.size(); ++i)
			if (!typeToType((Type)a.get(i), (Type)b.get(i)))
				return false;
		return true;
	}
	public Vector calTwo(String op, Vector aInf, Vector bInf)
	{
		// 0 boolean const
		// 1 boolean leftValue
		// 2 Type type
		// 3 int value
		
		// 4 boolean
		Vector vector = new Vector();
		vector.add((boolean)aInf.get(0) && (boolean)bInf.get(0));
		vector.add(aInf.get(1));
		vector.add(aInf.get(2));
		vector.add(aInf.get(3));
		vector.add(true);
		
		Type a = (Type)aInf.get(2);
		Type b = (Type)bInf.get(2);
		
		if (main.opLeft.get(Symbol.symbol(op)) != null)
		{
			if (!(boolean)aInf.get(1))
			{
				vector.set(4, false);
				return vector;
			}
			if (op.equals("="))
			{
				if (a instanceof Array && b instanceof Array)
				{
					vector.set(4, false);
					return vector;
				}
				vector.set(4, typeToType(a, b));
				return vector;
			}
		}
		else
		{
			vector.set(1, false);
		}
		
		if (op.equals("-") && a instanceof Pointer && b instanceof Int)
		{
			vector.set(4, false);
			return vector;
		}
		
		if (typeToType(main.GXX_INT, a) && typeToType(main.GXX_INT, b))
		{
			vector.set(3, main.GXX_INT);
			return vector;
		}
		
		if (op.equals("-") && a instanceof Pointer && b instanceof Pointer && sameType(a, b))
		{
			vector.set(3, main.GXX_INT);
			return vector;
		}
		
		if ((op.equals("+") || op.equals("-")) && a instanceof Pointer && typeToType(main.GXX_INT, b))
		{
			vector.set(3, a);
			return vector;
		}
		
		vector.set(4, false);
		return vector;
	}
	public Vector calOne(String op, Vector inf)
	{
		// 0 boolean const
		// 1 boolean leftValue
		// 2 Type type
		// 3 int value
		
		// 4 boolean
		
		Vector vector = new Vector();
		vector.add(inf.get(0));
		vector.add(inf.get(1));
		vector.add(inf.get(2));
		vector.add(inf.get(3));
		vector.add(true);
		
		boolean left = (boolean)inf.get(1);
		Type type = (Type)inf.get(2);
		
		if (op.equals("&") && !left)
		{
			vector.set(4, false);
			return vector;
		}
		
		if (op.equals("*"))
		{
			if (!(type instanceof Pointer))
			{
				vector.set(4, false);
				return vector;
			}
			vector.set(1, true);
//			vector.set(2, new Pointer(type, "GXX_" + String.valueOf(main.noName++)));
			vector.set(2, ((Pointer)type).elementType);
		}
		else
		{
			vector.set(1, false);
			vector.set(2, main.GXX_INT);
		}
		
		return vector;
	}
}