package compiler.Semantic;

import compiler.ClassDef.*;
import java.util.Vector;

public class Run
{
	static public void main(String[] args)
	{
		System.out.println("GXX1234");
		/*Root a = new Root();
		Hehe b = new Hehe();
		System.out.println(a.check_son());
		System.out.println(b.check_son());
		additive_expression a = new additive_expression();
		System.out.println(a.check_son());*/
		Vector a = new Vector();
		a.add(3);
		a.add("123");
		for (int i = 0; i < a.size(); ++i)
				System.out.println(a.get(i));
	}
}