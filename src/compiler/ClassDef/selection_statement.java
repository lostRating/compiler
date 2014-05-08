package compiler.ClassDef;

import compiler.Semantic.Symbol;
import compiler.Semantic.Table;
import compiler.Type.Type;
import compiler.main.main;

public class selection_statement extends root
{
	public selection_statement(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		son.checkSon();
		
		addquad(son);
		
		Type type = (Type)son.returnVec.get(2);
		if (!typeToType(main.GXX_INT, type)) throw new Exception("selcetion_statement");
		
		__Label label1 = new __Label();
		__Label label2 = null;
		
		quad.add(new __Branch((__TempOprand)son.returnVec.get(4), label1, 0));
		
		for (int i = 1; i < vec.size(); ++i)
		{
			son = (root)vec.get(i);
			son.checkSon();
			
			addquad(son);
			
			if (i  == 1)
			{
				if (vec.size() == 3)
				{
					label2 = new __Label();
					quad.add(new __Jump(label2));
				}
				quad.add(new __LabelQuad(label1));
			}
			if (i == 2)
			{
				quad.add(new __LabelQuad(label2));
			}
		}
	}
}
