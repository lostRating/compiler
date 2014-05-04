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
	
	public Vector<__Quad> quad = new Vector<__Quad>();
//	public __TempOprand __t = null;
	
	static public __Temp __tsp = new __Temp("$sp");
	static public __TempOprand __tosp = new __TempOprand(__tsp);
	static public __Temp __tgp = new __Temp("$gp");
	static public __TempOprand __togp = new __TempOprand(__tgp);
	
	public root(){s = "";}
	public root(String ss){s = ss;}
	public void addChild(root a){vec.add(a);}
	public void checkSon() throws Exception{}
	public void checkSon(Type type) throws Exception{}
	
	//----------------------------------------------------------------
	
	public void addquad(root son)
	{
		for (int i = 0; i < son.quad.size(); ++i)
			quad.add(son.quad.get(i));
	}
	public void addquad(Vector<__Quad> a, Vector<__Quad> b)
	{
		for (int i = 0; i < b.size(); ++i)
			a.add(b.get(i));
	}
	public void showquad()
	{
		for (int i = 0; i < quad.size(); ++i)
			System.out.println(quad.get(i).toString());
	}
	public void Move(Vector<__Quad> quad, __Temp tmp, int offset2) throws Exception
	{
		Type type = getSymbolType(tmp.name);
		if (!(type instanceof Struct))
			quad.add(new __Move(new __TempOprand(tmp), new __Mem(new __Temp("$sp"), tmp.offset + offset2)));
		else
		{
			quad.add(new __BinOp(new __TempOprand(tmp), new __TempOprand(new __Temp("$sp")), new __Const(tmp.offset), "+"));
			//throw new Exception("root_Move");
		}
	}
	
	public void beginScope(String s)
	{
		if (!s.equals("struct")) main.S.beginScope();
		if (!s.equals("other")) main.Offset.push(0);
		main.F.beginScope();
		++main.scope;
	}
	
	public void endScope(String s)
	{
		if (!s.equals("struct")) main.S.endScope();
		if (!s.equals("other")) main.Offset.pop();
		main.F.endScope();
		--main.scope;
	}
	
	public void beginLoop(__Label l1, __Label l2){main.l1.push(l1); main.l2.push(l2);}
	
	public void endLoop(){main.l1.pop(); main.l2.pop();}
	
	public __Temp addSymbol(Table T, Type type, String name, boolean VOID) throws Exception
	{
		Super tmp1 = (Super)T.get(Symbol.symbol(name));
		if (tmp1 != null && tmp1.scope == main.scope) throw new Exception("addSymbol");
		if (type instanceof Name) throw new Exception("addSymbol");
		if (VOID && (type instanceof Void)) throw new Exception("addSymbol");
		if (T == main.S || type instanceof Function)
		{
			T.put(Symbol.symbol(name), new Super(type, main.scope, null));
		}
		else
		{
			__Temp tmp = new __Temp(name);
			T.put(Symbol.symbol(name), new Super(type, main.scope, tmp));
			int tt = main.Offset.pop();
			main.Offset.push(tt + type.size);
			return tmp;
		}
		return null;
	}
	
	public __Quad init(__TempOprand a, __TempOprand b)
	{
		return new __Move(a, b);
		//return new __Void("!!!!!!!!!!  root_init");
	}
	
	public Type getSymbolType(String name) throws Exception
	{
		Super tmp1 = (Super)main.F.get(Symbol.symbol(name));
		if (tmp1 == null) throw new Exception("getSymbolType");
		return tmp1.type;
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
		{
			return a == b;
		}
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
		// 4 __TempOprand

		Vector vector = new Vector();
		vector.add((boolean)aInf.get(0) && (boolean)bInf.get(0));
		vector.add(aInf.get(1));
		vector.add(aInf.get(2));
		vector.add(aInf.get(3));
		vector.add(aInf.get(4));
		
		Type a = (Type)aInf.get(2);
		Type b = (Type)bInf.get(2);
		
		__TempOprand __t1 = (__TempOprand)aInf.get(4);
		__TempOprand __t2 = (__TempOprand)bInf.get(4);
		
		if (op.charAt(op.length() - 1) == '=' && !op.equals("==") && !op.equals("!=") && !op.equals("<=") && !op.equals(">="))
		{
			if (!(boolean)aInf.get(1)) throw new Exception("calTwo 1");
			if (op.equals("="))
			{
				if (a instanceof Array && b instanceof Array) throw new Exception("calTwo 2");
				if (!typeToType(a, b)) throw new Exception("calTwo 3");
				quad.add(init(__t1, __t2));
				return vector;
			}
			else
			{
				if (!typeToType(main.GXX_INT, a) || !typeToType(main.GXX_INT, b)) throw new Exception("calTwo 3.5");
				quad.add(new __BinOp(__t1, __t1, __t2, op.substring(0, op.length() - 1)));
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
		}
		else if ((op.equals("+") || op.equals("-")) && a instanceof Pointer && typeToType(main.GXX_INT, b))
		{
			vector.set(2, a);
		}
		else if (typeToType(main.GXX_INT, a) && typeToType(main.GXX_INT, b))
		{
			vector.set(2, main.GXX_INT);
		}
		else throw new Exception("calTwo 4");
		__TempOprand __t3 = new __TempOprand(new __Temp(""));
		vector.set(4, __t3);
		
		return vector;
	}
	
	public Vector calOne(String op, Vector inf) throws Exception
	{
		// 0 boolean const
		// 1 boolean leftValue
		// 2 Type type
		// 3 int value
		// 4 __TempOprand
		
		Vector vector = new Vector();
		vector.add(inf.get(0));
		vector.add(inf.get(1));
		vector.add(inf.get(2));
		vector.add(inf.get(3));
		vector.add(inf.get(4));
		
		boolean left = (boolean)inf.get(1);
		Type type = (Type)inf.get(2);
		
		__TempOprand __tt = (__TempOprand)inf.get(4);
		__TempOprand __t = new __TempOprand(new __Temp(""));
		
		if (op.equals("&"))
		{
			if (!left) throw new Exception("calOne 1");
			
			vector.set(2, new Pointer(type, "GXX_" + String.valueOf(main.noName++)));
			
			if (type instanceof Array || type instanceof Struct)
			{
				quad.add(new __Move(__t, __tt));
				vector.set(4, __t);
				return vector;
			}
			if (__tt.temp.Static)
				quad.add(new __BinOp(__t, __togp, new __Const(__tt.temp.offset), "+"));
			else
				quad.add(new __BinOp(__t, __tosp, new __Const(__tt.temp.offset), "+"));
			vector.set(4, __t);
			return vector;
		}
		else if (op.equals("*"))
		{
			if (!(type instanceof Pointer)) throw new Exception("calOne 2");
			vector.set(1, true);
			vector.set(2, ((Pointer)type).elementType);
			if (__tt.temp.Static)
				quad.add(new __Move(__t, new __Mem(__tgp, __tt.temp.offset)));
			else
				quad.add(new __Move(__t, new __Mem(__tsp, __tt.temp.offset)));
			vector.set(4, __t);
			return vector;
		}
		else
		{
			vector.set(1, false);
			vector.set(2, main.GXX_INT);
			quad.add(new __BinOp(__t, new __Const(0), __tt, op));
			vector.set(4, __t);
			return vector;
		}
	}
}