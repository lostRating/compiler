package compiler.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.antlr.runtime.RecognitionException;

//import com.sun.org.apache.xml.internal.security.Init;

import compiler.ClassDef.*;
import compiler.Semantic.Table;
import compiler.Semantic.makeTree;
import compiler.ast.AST;
import compiler.Semantic.*;
import compiler.Type.*;
import compiler.Type.Void;
import compiler.init.*;

public class main {
	static public Table S = new Table();
	static public Table F = new Table();
	static public int scope = 0;
	static public int noName = 0;
	static public Function func = null;
	static public Type GXX_INT = new Int();
	static public Type GXX_CHAR = new Char();
	static public Type GXX_VOID = new Void();
	static public Type GXX_VOID_STAR = new Pointer(GXX_VOID, "GXX_VOID_STAR");
	
	static public boolean mips = true;
	static public boolean test = false;
	
	static public Stack<Integer> Offset = new Stack<Integer>();
	static public Stack<__Label> l1 = new Stack<__Label>();
	static public Stack<__Label> l2 = new Stack<__Label>();
	
	static public int work(File file) throws RecognitionException, IOException, Exception {
		try	{
			String s = AST.getTreeString(file);
			root a = makeTree.getRoot(s);
			try
			{
				init.init();
				a.checkSon();
				a.showMips();
				if (mips)
					init.printfs();
				if (test)
					System.exit(0);
				//System.out.println("-------------------------ok-------------------------------");
			}
			catch (Exception t)
			{
				if (test)
					System.exit(1);
				else
				{
					System.out.println("CE");
					System.out.println(t.getMessage());
				}
			}
		}
		catch(RecognitionException a) {
			if (test)
				System.exit(1);
			else
				System.out.println("antlr error");
		}
		return 0;
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
		if (!test)
		{
			if (mips)
			{
				PrintStream myout = new PrintStream(new FileOutputStream(new File("D:\\class\\bianyi\\compiler2014\\hehe.s")));       
				System.setOut(myout);
			}
			String s = "D:\\hehe\\compiler2014-testcases\\my";
			List<File> files = getFiles(s);
			for(File f : files){
				System.out.println("# " + f.getName());
			work(f);
			}
		}
		else
			System.exit( work(new File(args[0])));
	}
}