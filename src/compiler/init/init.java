package compiler.init;

import java.util.Stack;

import java.util.Vector;

import compiler.Semantic.*;
import compiler.main.*;
import compiler.Type.*;
import compiler.ClassDef.*;

public class init
{
	static public void init()
	{
		main.S = new Table();
		main.F = new Table();
		main.scope = 0;
		main.noName = 0;
		main.func = null;
				
		main.S.put(Symbol.symbol("GXX_INT"), new Super(main.GXX_INT, main.scope, null));
		main.S.put(Symbol.symbol("GXX_CHAR"), new Super(main.GXX_CHAR, main.scope, null));
		main.S.put(Symbol.symbol("GXX_VOID"), new Super(main.GXX_VOID, main.scope, null));

		Type type = new Function(main.GXX_INT, new Vector(), "printf");
		main.F.put(Symbol.symbol("printf"), new Super(type, main.scope, null));
		
		type = new Function(main.GXX_VOID_STAR, new Vector(), "malloc");
		main.F.put(Symbol.symbol("malloc"), new Super(type, main.scope, null));
		
		main.Offset = new Stack<Integer>();
		main.Offset.push(0);
		
		main.l1 = new Stack<__Label>();
		main.l2 = new Stack<__Label>();
		
		__Label.count = 0;
		__Temp.count = 0;
	}
}