package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.main.main;

public class postfix extends root
{
	public postfix(){}
	
	public boolean typeVectorMatch(Vector a, Vector b)
	{
		if (a.size() != b.size()) return false;
		for (int i = 0; i < a.size(); ++i)
			if (!typeToType((Type)a.get(i), (Type)b.get(i)))
				return false;
		return true;
	}
	
	public void checkSon() throws Exception
	{
		Vector tmpVec = new Vector();
		for (int i = 0; i < 5; ++i)
			tmpVec.add(returnVec.get(i));
		returnVec.removeAllElements();
		Type type = (Type)tmpVec.get(2);
		
		son = (root)vec.get(0);
		if (son.s.equals("ONE"))
		{
			son = (root)vec.get(1);
			son.checkSon();
			
			addquad(son);
			
			Type tmp = (Type)son.returnVec.get(2);
			if (!typeToType(main.GXX_INT, tmp)) throw new Exception("postfix 1");
			if (!(type instanceof Pointer)) throw new Exception("postfix 2");
			Pointer pointer = (Pointer)type;
			
			returnVec.removeAllElements();
			for (int i = 0; i < 5; ++i)
				returnVec.add(i, tmpVec.get(i));
			returnVec.set(0, false);
			returnVec.set(2, pointer.elementType);	
			
			__TempOprand __t = new __TempOprand(new __Temp(""), 1);
			quad.add(new __BinOp(__t, ((__TempOprand)son.returnVec.get(4)).Val(quad, new Int()), new __Const(pointer.elementType.size), "*"));
			quad.add(new __BinOp(__t, __t, (__TempOprand)tmpVec.get(4), "+"));
			//if (!(pointer.elementType instanceof Struct) && !(pointer.elementType instanceof Array))
			//	quad.add(new __Move(__t, new __Mem(__t, 0, pointer.elementType)));
			
			returnVec.set(4, __t);
		}
		else if (son.s.equals("TWO"))
		{
			Vector<__TempOprand> tt = new Vector<__TempOprand>();
			
			if (vec.size() == 2)
			{
				son = (root)vec.get(1);
				son.checkSon();
				
				addquad(son);
				
				for (int i = 0; i < son.returnVec.size(); i += 2)
				{
					returnVec.add(son.returnVec.get(i));
					tt.add((__TempOprand)son.returnVec.get(i + 1));
				}
			}
			if (!(type instanceof Function)) throw new Exception("postfix 3");
			Function function = (Function)type;
			/*
			 * printf
			 * malloc
			 * 
			 * to be continued
			 * 
			 */
			if (!function.Name.equals("printf") && !function.Name.equals("malloc"))
			{
				if (!typeVectorMatch(function.argumentType, returnVec)) throw new Exception("postfix 4");
			}
			
			quad.add(new __Void("#call begin"));
			
			if (function.Name.equals("printf"))
			{
				for (int i = 0; i < returnVec.size(); ++i)
				{
					Type type2 = (Type)returnVec.get(i);
					if (i == 0)
					{
						quad.add(new __Move(new __TempOprand(new __Temp("$a0")), tt.get(i)));
					}
					else
					{
						quad.add(new __Move(new __TempOprand(new __Temp("$a" + Integer.toString(i))), tt.get(i).Val(quad, type2)));
					}
				}
			}
			else if (function.Name.equals("malloc"))
			{
				throw new Exception("postfix malloc");
			}
			else
			{
				for (int i = 0; i < returnVec.size(); ++i)
					pushArg(tt.get(i), (Type)returnVec.get(i), function.argOffset.get(i) - function.size);
			}
			
			returnVec.removeAllElements();
			for (int i = 0; i < 5; ++i)
				returnVec.add(i, tmpVec.get(i));
			returnVec.set(0, false);
			returnVec.set(1, false);
			returnVec.set(2, function.returnType);
			
			__TempOprand __t = new __TempOprand(new __Temp(""));
			quad.add(new __Call(new __Label(function.Name)));
			
			quad.add(new __Move(__t, new __TempOprand(new __Temp("$v0"))));
			
			quad.add(new __Void("#call end"));
			returnVec.set(4, __t);
		}
		else if (son.s.equals("THREE"))
		{
			son = (root)vec.get(1);
			son.checkSon();
			String name = (String)son.returnVec.get(1);
			if (!(type instanceof Struct)) throw new Exception("postfix 5");
			Struct struct = (Struct)type;
			for (int i = 0, offset = 0; i < struct.names.size(); ++i)
				if (name.equals((String) struct.names.get(i)))
				{
					returnVec.removeAllElements();
					for (int k = 0; k < 5; ++k)
						returnVec.add(k, tmpVec.get(k));
					returnVec.set(2, struct.types.get(i));
					
					__TempOprand __t = new __TempOprand(new __Temp(""));
					__TempOprand __t2 = (__TempOprand)tmpVec.get(4);
					
					Type tt = (Type)struct.types.get(i);
					if (!(tt instanceof Array) && !(tt instanceof Struct))
						quad.add(new __Move(__t, new __Mem(__t2, offset, tt)));
					else
						quad.add(new __BinOp(__t, __t2, new __Const(offset), "+"));
					
					returnVec.set(4, __t);
					
					return;
				}
				else
					offset += ((Type)struct.types.get(i)).size;
			
			throw new Exception("postfix 6");
		}
		else if (son.s.equals("FOUR"))
		{
			son = (root)vec.get(1);
			son.checkSon();
			String name = (String)son.returnVec.get(1);
			if (!(type instanceof Pointer)) throw new Exception("postfix 7");
			Pointer pointer = (Pointer)type;
			Type tmp = (Type)pointer.elementType;
			Struct struct;
			if (tmp instanceof Name)
			{
				Super tmp2 = (Super)main.S.get(Symbol.symbol(tmp.Name));
				if (tmp2 == null) throw new Exception("postfix 7.5");
				struct = (Struct)tmp2.type;
			}
			else
				struct = (Struct)pointer.elementType;
			if (!(struct instanceof Struct)) throw new Exception("postfix 8");
			for (int i = 0, offset = 0; i < struct.names.size(); ++i)
				if (name.equals((String) struct.names.get(i)))
				{
					returnVec.removeAllElements();
					for (int k = 0; k < 5; ++k)
						returnVec.add(k, tmpVec.get(k));
					returnVec.set(2, struct.types.get(i));
					
					__TempOprand __t = new __TempOprand(new __Temp(""));
					__TempOprand __t2 = (__TempOprand)tmpVec.get(4);
					
					Type tt = (Type)struct.types.get(2);
					if (!(tt instanceof Array) && !(tt instanceof Struct))
						quad.add(new __Move(__t, new __Mem(__t2, offset, tt)));
					else
						quad.add(new __BinOp(__t, __t2, new __Const(offset), "+"));
					
					returnVec.set(4, __t);
					
					return;
				}
				else
					offset += ((Type)struct.types.get(i)).size;
			
			throw new Exception("postfix");
		}
		else
		{
			if (!(typeToType(main.GXX_INT, (Type)type))) throw new Exception("postfix 9");
			returnVec.removeAllElements();
			for (int k = 0; k < 5; ++k)
				returnVec.add(k, tmpVec.get(k));
			returnVec.set(0, false);
			returnVec.set(1, false);
			returnVec.set(2, type);
			
			__TempOprand __t = new __TempOprand(new __Temp(""));
			__TempOprand __t2 = (__TempOprand)returnVec.get(4);
			quad.add(new __Move(__t, __t2));
			__t = initBinOp(__t2.Mem(type), __t2.Val(quad, type), new __Const(1), son.s.substring(0, 1));
			
			returnVec.set(4, __t);
			
			return;
		}
	}
}
