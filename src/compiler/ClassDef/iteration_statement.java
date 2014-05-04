package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Type;
import compiler.main.main;

public class iteration_statement extends root
{
	public iteration_statement(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		
		if (son.s.equals("while"))
		{
			__Label l1 = new __Label();
			__Label l2 = new __Label();
			
			quad.add(new __LabelQuad(l1));
			
			son = (root)vec.get(1);
			son.checkSon();
			
			addquad(son);
			
			Type type = (Type)son.returnVec.get(2);
			
			__TempOprand __t = (__TempOprand)son.returnVec.get(4);
			
			quad.add(new __Branch(__t, l2));
			
			if (!typeToType(main.GXX_INT, type)) throw new Exception("iteration_statement");
			
			beginLoop(l1, l2);
			
			son = (root)vec.get(2);
			son.checkSon();
			
			addquad(son);
			
			endLoop();
			
			quad.add(new __Jump(l1));
			quad.add(new __LabelQuad(l2));
 		}
		else
		{
			Vector<__Quad> a1 = new Vector<__Quad>();
			Vector<__Quad> a2 = new Vector<__Quad>();
			Vector<__Quad> a3 = new Vector<__Quad>();
			Vector<__Quad> a4 = new Vector<__Quad>();
			
			__TempOprand __t = null;
			
			__Label l1 = new __Label();
			__Label l2 = new __Label();
			
			for (int i = 1; i < vec.size() - 2; i += 2)
			{
				son = (root)vec.get(i + 1);
				son.checkSon();
				Type type = (Type)son.returnVec.get(2);
				if (((root)vec.get(i)).s.equals("TWO") && !typeToType(main.GXX_INT, type)) throw new Exception("iteration_statement");
				if (((root)vec.get(i)).s.equals("ONE")) addquad(a1, son.quad);
				if (((root)vec.get(i)).s.equals("TWO"))
				{
					addquad(a2, son.quad);
					__t = (__TempOprand)son.returnVec.get(4);
				}
				if (((root)vec.get(i)).s.equals("THREE")) addquad(a3, son.quad);
			}
			
			beginLoop(l1, l2);
			
			son = (root)vec.get(vec.size() - 1);
			son.checkSon();
			
			addquad(a4, son.quad);
			
			addquad(quad, a1);
			quad.add(new __LabelQuad(l1));
			addquad(quad, a2);
			if (__t != null)
				quad.add(new __Branch(__t, l2));
			addquad(quad, a4);
			addquad(quad, a3);
			quad.add(new __Jump(l1));
			quad.add(new __LabelQuad(l2));
			
			endLoop();
 		}
	}
}
