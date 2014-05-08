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
	
	static public boolean compAfterFunction = false;
	static public int constant_expression = 0;
	static public int Inner = 0;
	static public int structOrArray = 0;
	
	public Vector<__Quad> quad = new Vector<__Quad>();
	
	static public Vector<String> data = new Vector<String>();
	
	static public __TempOprand __tosp = new __TempOprand(new __Temp("$sp"));
	
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
	public void showMips() throws Exception
	{
		System.out.println(".data");
		for (int i = 0; i < data.size(); ++i)
			System.out.println(data.get(i));
		System.out.println();
		System.out.println(".text");
		for (int i = 0; i < quad.size(); ++i)
			System.out.println(quad.get(i).print());
	}
	
	public void pullArg(__TempOprand tmp, Type type) throws Exception
	{
		if (!(type instanceof Struct))
		{
			quad.add(new __Move(tmp, new __Mem(__tosp, tmp.temp.offset, type)));
		}
		else
		{
			throw new Exception("pullArg");
		}
	}
	
	public void pushArg(__TempOprand tmp, Type type, int offset) throws Exception
	{
		if (!(type instanceof Struct))
		{
			if (type instanceof Array)
				quad.add(new __Move(new __Mem(__tosp, offset, type), tmp));
			else
				quad.add(new __Move(new __Mem(__tosp, offset, type), tmp.Val(quad, type)));
		}
		else
		{
			throw new Exception("pushArg");
		}
	}
	
	public void init(__TempOprand a, __TempOprand b, Type aa, Type bb) throws Exception
	{
		if (!(aa instanceof Struct))
		{
			quad.add(new __Move(a.Mem(aa), b.Val(quad, bb)));
		}
		else if (aa instanceof Struct)
		{
			for (int i = 0; i < aa.size; i += 4)
			{
				__TempOprand __t = new __TempOprand(new __Temp(""));
				quad.add(new __Move(__t, new __Mem(b, b.temp.offset + i, new Int())));
				quad.add(new __Move(new __Mem(a, a.temp.offset + i, new Int()), __t));
			}
		}
		else throw new Exception("root init Array");
	}
	
	public __TempOprand initBinOp(__Oprand a, __Oprand b, __Oprand c, String op)
	{
		if (a instanceof __Mem)
		{
			__TempOprand __t = new __TempOprand(new __Temp(""));
			quad.add(new __BinOp(__t, b, c, op));
			quad.add(new __Move(a, __t));
			return __t;
		}
		else
		{
			quad.add(new __BinOp(a, b, c, op));
			return (__TempOprand)a;
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
	
	public int fixOffset(Type type, int i)
	{
		while (!(type instanceof Char) && i % 4 != 0) ++i;
		return i;
	}
	
	public __TempOprand addSymbol(Table T, Type type, String name, boolean VOID) throws Exception
	{
		Super tmp1 = (Super)T.get(Symbol.symbol(name));
		if (tmp1 != null && tmp1.scope == main.scope) throw new Exception("addSymbol");
		if (type instanceof Name) throw new Exception("addSymbol");
		if (VOID && (type instanceof Void)) throw new Exception("addSymbol");
		if (T == main.S || type instanceof Function)
		{
			while (T == main.S && type.size % 4 != 0) ++type.size;
			T.put(Symbol.symbol(name), new Super(type, main.scope, null));
			return null;
		}
		else
		{
			main.Offset.push(fixOffset(type, main.Offset.pop()));
			if (type instanceof Struct || type instanceof Array) structOrArray++;
			__Temp tmp = new __Temp(name);
			T.put(Symbol.symbol(name), new Super(type, main.scope, tmp));
			int tt = main.Offset.pop();
			main.Offset.push(tt + type.size);
			if (type instanceof Struct || type instanceof Array) structOrArray--;
			return new __TempOprand(tmp);
		}
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
				init(__t1, __t2, a, b);
				return vector;
			}
			else
			{
				if (!typeToType(main.GXX_INT, a) || !typeToType(main.GXX_INT, b)) throw new Exception("calTwo 3.5");
				__TempOprand __t3;
				__t3 = initBinOp(__t1.Mem(a), __t1.Val(quad, a), __t2.Val(quad, b), op.substring(0, op.length() - 1));
				vector.set(4, __t3);
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
			if (a instanceof Char && b instanceof Char)
				vector.set(2, main.GXX_CHAR);
			else
				vector.set(2, main.GXX_INT);
		}
		else throw new Exception("calTwo 4");
		__TempOprand __t3 = new __TempOprand(new __Temp(""));
		quad.add(new __BinOp(__t3, __t1.Val(quad, a), __t2.Val(quad, b), op));
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
			
			vector.set(0, true);
			vector.set(1, false);
			
			if (type instanceof Array || type instanceof Struct)
			{
				quad.add(new __Move(__t, __tt));
				vector.set(4, __t);
				return vector;
			}
			if (__tt.temp.Static)
				quad.add(new __Move(__t, __tt));
			else
				quad.add(new __BinOp(__t, __tosp, new __Const(__tt.temp.offset), "+"));
			vector.set(4, __t);
			return vector;
		}
		else if (op.equals("*"))
		{
			if (!(type instanceof Pointer)) throw new Exception("calOne 2");
			vector.set(1, true);
			Type tt = ((Pointer)type).elementType;
			vector.set(2, tt);
			quad.add(new __Move(__t, new __Mem(__tt, 0, tt)));
			vector.set(4, __t);
			return vector;
		}
		else
		{
			vector.set(1, false);
			//vector.set(2, main.GXX_INT);
			quad.add(new __BinOp(__t, new __Const(0), __tt, op));
			vector.set(4, __t);
			return vector;
		}
	}
}