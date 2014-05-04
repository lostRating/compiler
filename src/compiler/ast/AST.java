package compiler.ast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplate;

public class AST
{
	static public String getTreeString(File file) throws RecognitionException, IOException
	{
		File f = file;
		InputStream in = new FileInputStream(f);
		ANTLRInputStream input = new ANTLRInputStream(in);   
		ELexer lexer = new ELexer(input);
	
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		EParser parser = new EParser(tokens);
		try
		{
			EParser.program_return r = parser.program();
			String s = ((BaseTree)r.getTree()).toStringTree();
			return s;
		}
		catch (RecognitionException a)
		{
			throw a;
		}
	}
}