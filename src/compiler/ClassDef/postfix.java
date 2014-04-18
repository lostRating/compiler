package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.main.main;

public class postfix extends root
{
	public postfix(){}
	public int checkSon() throws Exception
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
			if (son.checkSon() == WA) return WA;
			Type tmp = (Type)son.returnVec.get(2);
			if (!typeToType(main.GXX_INT, tmp)) return WA;
			if (!(type instanceof Pointer)) return WA;
//			System.out.println("GXX");
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
				if (son.checkSon() == WA) return WA;
				for (int i = 0; i < son.returnVec.size(); ++i)
					returnVec.add(son.returnVec.get(i));
			}
			//System.out.println(type);
			if (!(type instanceof Function)) return WA;
			Function function = (Function)type;
			
			//System.out.println(function.Name);
			
			/*
			 * printf
			 * malloc
			 * 
			 * to be continued
			 * 
			 */
			if (!function.Name.equals("printf") && !function.Name.equals("malloc"))
			{
				if (!typeVectorMatch(function.argumentType, returnVec)) return WA;
			}
			else
			{
//				System.out.println("GXX");
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
			if (son.checkSon() == WA) return WA;
			String name = (String)son.returnVec.get(1);
			if (!(type instanceof Struct)) return WA;
			Struct struct = (Struct)type;
			for (int i = 0; i < struct.names.size(); ++i)
				if (name.equals((String) struct.names.get(i)))
				{
					returnVec.removeAllElements();
					for (int k = 0; k < 4; ++k)
						returnVec.add(k, tmpVec.get(k));
					returnVec.set(0, false);
					returnVec.set(2, struct.types.get(i));
					return AC;
				}
			return WA;
		}
		else if (son.s.equals("FOUR"))
		{
			son = (root)vec.get(1);
			if (son.checkSon() == WA) return WA;
			String name = (String)son.returnVec.get(1);
			if (!(type instanceof Pointer)) return WA;
			Pointer pointer = (Pointer)type;
			if (!(pointer.elementType instanceof Struct)) return WA;
			Struct struct = (Struct)pointer.elementType;
			for (int i = 0; i < struct.names.size(); ++i)
				if (name.equals((String) struct.names.get(i)))
				{
					returnVec.removeAllElements();
					for (int k = 0; k < 4; ++k)
						returnVec.add(k, tmpVec.get(k));
					returnVec.set(0, false);
					returnVec.set(2, struct.types.get(i));
					return AC;
				}
			return WA;
		}
		else
		{
			if (!(typeToType(main.GXX_INT, (Type)type))) return WA;
			returnVec.removeAllElements();
			for (int k = 0; k < 4; ++k)
				returnVec.add(k, tmpVec.get(k));
			returnVec.set(0, false);
			returnVec.set(1, false);
			returnVec.set(2, type);
			return AC;
		}
		return AC;
	}
}
