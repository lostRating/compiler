package compiler.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.antlr.runtime.RecognitionException;

import compiler.ClassDef.root;
import compiler.Semantic.Table;
import compiler.Semantic.makeTree;
import compiler.ast.AST;
import compiler.Semantic.*;
import compiler.Type.*;
import compiler.Type.Void;

public class main {
	static int AC = 0;
	static int WA = 1;
	
	static public Table S = new Table();
	static public Table F = new Table();
	static public int loop = 0;
	static public int scope = 0;
	static public int noName = 0;
	static public Function func = null;
	static public Type GXX_INT = new Int();
	static public Type GXX_CHAR = new Char();
	static public Type GXX_VOID = new Void();
	static public Type GXX_VOID_STAR = new Pointer(GXX_VOID, "GXX_VOID_STAR");
	
	static public Table opLeft = new Table();
	
	public static void init_op()
	{
		opLeft.put(Symbol.symbol("="), "");
//		op1.put(Symbol.symbol("*"), "");
//		op1.put(Symbol.symbol("/"), "");
//		op1.put(Symbol.symbol("%"), "");
		
	}
	
	public static void init()
	{
		S = new Table();
		F = new Table();
		loop = 0;
		scope = 0;
		noName = 0;
		func = null;
				
		S.put(Symbol.symbol("GXX_INT"), new Super(GXX_INT, 0));
		S.put(Symbol.symbol("GXX_CHAR"), new Super(GXX_CHAR, 0));
		S.put(Symbol.symbol("GXX_VOID"), new Super(GXX_VOID, 0));

		Type type = new Function(GXX_INT, new Vector(), "printf");
		F.put(Symbol.symbol("printf"), new Super(type, 0));
		
		type = new Function(GXX_VOID_STAR, new Vector(), "malloc");
		F.put(Symbol.symbol("malloc"), new Super(type, 0));
	}
	
	static public int work(File file) throws RecognitionException, IOException, Exception {
		try	{
			String s = AST.getTreeString(file);
			root a = makeTree.getRoot(s);
			try
			{
				init();
				init_op();
				return a.checkSon();
				//System.out.println(" ! 1");
			}
			catch (Exception t)
			{
				return WA;
				//System.out.println(" ! 2");
			}
		}
		catch(RecognitionException a) {
			return WA;
			//System.out.println(" ! 3");
		}
	}
	
	public static List<File> getFiles(String path){
	    File root = new File(path);
	    List<File> files = new ArrayList<File>();
	    if(!root.isDirectory())
	    {
	        files.add(root);
	    }
	    else
	    {
	        File[] subFiles = root.listFiles();
	        for(File f : subFiles){
	            files.addAll(getFiles(f.getAbsolutePath()));
	        }    
	    }
	    return files;
	}
	
	static public void main(String[] args) throws RecognitionException, IOException, Exception 
	{
//		String s = "D:\\hehe\\compiler2014-testcases\\bonus\\Syntactic&Semantic";
//	    List<File> files = getFiles(s);
//	    for(File f : files){
//	    	System.out.println(f.getName());
//	        work(s + "\\" + f.getName());
//	    }
		System.exit( work(new File(args[0])));
	}
}