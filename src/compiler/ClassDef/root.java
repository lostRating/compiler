package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.Type.Void;
import compiler.main.main;

public class root
{
	public String s;
	public Vector vec = new Vector(), returnVec = new Vector();
	public root son;
	
	public root(){s = "";}
	public root(String ss){s = ss;}
	public void addChild(root a){vec.add(a);}
	public void checkSon() throws Exception{}
	public void checkSon(Type type) throws Exception{}
	
	//----------------------------------------------------------------
	
	public void beginScope(boolean struct)
	{
		if (!struct)
			main.S.beginScope();
		main.F.beginScope();
		++main.scope;
	}
	
	public void endScope(boolean struct)
	{
		if (!struct)
			main.S.endScope();
		main.F.endScope();
		--main.scope;
	}
	
	public void beginLoop(){++main.loop;}
	
	public void endLoop(){--main.loop;}
	
	public void addSymbol(Table T, Type type, String name, boolean VOID) throws Exception
	{
		Super tmp1 = (Super)T.get(Symbol.symbol(name));
		if (tmp1 != null && tmp1.scope == main.scope) throw new Exception("addSymbol");
		if (type instanceof Name) throw new Exception("addSymbol");
		if (VOID && (type instanceof Void)) throw new Exception("addSymbol");
		T.put(Symbol.symbol(name), new Super(type, main.scope));
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
		if (a instanceof Pointer && b instanceof Function)
			if (((Pointer)a).elementType instanceof Int) return true;
		if (a instanceof Name)
		{
			Super tmp = (Super)main.S.get(Symbol.symbol(a.Name));
			if (tmp == null) return false;
			return typeToType(tmp.type, b);
		}
		if (b instanceof Name)
		{
			Super tmp = (Super)main.S.get(Symbol.symbol(b.Name));
			if (tmp == null) return false;
			return typeToType(a, tmp.type);
		}
		return false;
	}
	
	public boolean typeVectorMatch(Vector a, Vector b)
	{
		if (a.size() != b.size()) return false;
		for (int i = 0; i < a.size(); ++i)
			if (!typeToType((Type)a.get(i), (Type)b.get(i)))
				return false;
		return true;
	}
	
	public Vector calTwo(String op, Vector aInf, Vector bInf) throws Exception
	{
		// 0 boolean const
		// 1 boolean leftValue
		// 2 Type type
		// 3 int value
		
		Vector vector = new Vector();
		vector.add((boolean)aInf.get(0) && (boolean)bInf.get(0));
		vector.add(aInf.get(1));
		vector.add(aInf.get(2));
		vector.add(aInf.get(3));
		
		Type a = (Type)aInf.get(2);
		Type b = (Type)bInf.get(2);
		
		if (main.opLeft.get(Symbol.symbol(op)) != null)
		{
			if (!(boolean)aInf.get(1)) throw new Exception("calTwo 1");
			if (op.equals("="))
			{
				if (a instanceof Array && b instanceof Array) throw new Exception("calTwo 2");
				if (!typeToType(a, b)) throw new Exception("calTwo 3");
				return vector;
			}
		}
		else
		{
			vector.set(1, false);
		}
		
		/*if (op.equals("-") && a instanceof Pointer && b instanceof Int)
		{
			vector.set(4, false);
			return vector;
		}*/

		
		if (op.equals("-") && a instanceof Pointer && b instanceof Pointer && sameType(a, b))
		{
			vector.set(2, main.GXX_INT);
			return vector;
		}
		
		if ((op.equals("+") || op.equals("-")) && a instanceof Pointer && typeToType(main.GXX_INT, b))
		{
			vector.set(2, a);
			return vector;
		}
		if (typeToType(main.GXX_INT, a) && typeToType(main.GXX_INT, b))
		{
			vector.set(2, main.GXX_INT);
			return vector;
		}
		
		throw new Exception("calTwo 4");
	}
	
	public Vector calOne(String op, Vector inf) throws Exception
	{
		// 0 boolean const
		// 1 boolean leftValue
		// 2 Type type
		// 3 int value
		
		Vector vector = new Vector();
		vector.add(inf.get(0));
		vector.add(inf.get(1));
		vector.add(inf.get(2));
		vector.add(inf.get(3));
		
		boolean left = (boolean)inf.get(1);
		Type type = (Type)inf.get(2);
		
		if (op.equals("&") && !left) throw new Exception("calOne 1");
		
		if (op.equals("*"))
		{
			if (!(type instanceof Pointer)) throw new Exception("calOne 2");
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