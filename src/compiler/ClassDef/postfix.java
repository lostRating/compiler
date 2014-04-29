package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.main.main;

public class postfix extends root
{
	public postfix(){}
	public void checkSon() throws Exception
	{
		Vector tmpVec = new Vector();
		for (int i = 0; i < 4; ++i)
			tmpVec.add(returnVec.get(i));
		returnVec.removeAllElements();
		Type type = (Type)tmpVec.get(2);
		
		son = (root)vec.get(0);
		if (son.s.equals("ONE"))
		{
			son = (root)vec.get(1);
			son.checkSon();
			Type tmp = (Type)son.returnVec.get(2);
			if (!typeToType(main.GXX_INT, tmp)) throw new Exception("postfix 1");
			if (!(type instanceof Pointer)) throw new Exception("postfix 2");
			Pointer pointer = (Pointer)type;
			
			returnVec.removeAllElements();
			for (int i = 0; i < 4; ++i)
				returnVec.add(i, tmpVec.get(i));
			returnVec.set(0, false);
			returnVec.set(2, pointer.elementType);
		}
		else if (son.s.equals("TWO"))
		{
			if (vec.size() == 2)
			{
				son = (root)vec.get(1);
				son.checkSon();
				for (int i = 0; i < son.returnVec.size(); ++i)
					returnVec.add(son.returnVec.get(i));
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
			
			returnVec.removeAllElements();
			for (int i = 0; i < 4; ++i)
				returnVec.add(i, tmpVec.get(i));
			returnVec.set(0, false);
			returnVec.set(1, false);
			returnVec.set(2, function.returnType);
		}
		else if (son.s.equals("THREE"))
		{
			son = (root)vec.get(1);
			son.checkSon();
			String name = (String)son.returnVec.get(1);
			if (!(type instanceof Struct)) throw new Exception("postfix 5");
			Struct struct = (Struct)type;
			for (int i = 0; i < struct.names.size(); ++i)
				if (name.equals((String) struct.names.get(i)))
				{
					returnVec.removeAllElements();
					for (int k = 0; k < 4; ++k)
						returnVec.add(k, tmpVec.get(k));
					returnVec.set(0, false);
					returnVec.set(2, struct.types.get(i));
					return;
				}
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
			for (int i = 0; i < struct.names.size(); ++i)
				if (name.equals((String) struct.names.get(i)))
				{
					returnVec.removeAllElements();
					for (int k = 0; k < 4; ++k)
						returnVec.add(k, tmpVec.get(k));
					returnVec.set(0, false);
					returnVec.set(2, struct.types.get(i));
					return;
				}
			throw new Exception("postfix");
		}
		else
		{
			if (!(typeToType(main.GXX_INT, (Type)type))) throw new Exception("postfix 9");
			returnVec.removeAllElements();
			for (int k = 0; k < 4; ++k)
				returnVec.add(k, tmpVec.get(k));
			returnVec.set(0, false);
			returnVec.set(1, false);
			returnVec.set(2, type);
			return;
		}
	}
}
