package compiler.init;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
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

		Function type = new Function(main.GXX_INT, new Vector(), "printf");
		type.size = 36;
		main.F.put(Symbol.symbol("printf"), new Super(type, main.scope, null));
		
		type = new Function(main.GXX_VOID_STAR, new Vector(), "malloc");
		main.F.put(Symbol.symbol("malloc"), new Super(type, main.scope, null));
		
		main.Offset = new Stack<Integer>();
		main.Offset.push(0);
		
		main.l1 = new Stack<__Label>();
		main.l2 = new Stack<__Label>();
		
		__Label.count = 0;
		__Temp.count = 0;
		
		root.data = new Vector<String>();
	}
	
	static public void printfs() throws IOException
	{
		 BufferedReader br = new BufferedReader(new FileReader("D:\\class\\bianyi\\compiler2014\\printf.s"));
		 String s = null;
         while((s = br.readLine())!=null){
             System.out.println(s);
         }
         br.close();
	}
}