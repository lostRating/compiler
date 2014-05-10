package compiler.ClassDef;

import java.util.Vector;

import compiler.Semantic.Table;
import compiler.Type.*;
import compiler.main.main;
import compiler.Semantic.*;

public class function_definition extends root
{
	public function_definition(){}
	public void checkSon() throws Exception
	{
		son = (root)vec.get(0);
		son.checkSon();
		Type returnType = (Type)son.returnVec.get(0);

		son = (root)vec.get(1);
		son.checkSon(returnType);
		returnType = (Type)son.returnVec.get(0);
		String functionName = (String)son.returnVec.get(1);
		
		Vector argumentType = new Vector();
		if (vec.size() == 4)
		{
			son = (root)vec.get(2);
			son.checkSon();
			argumentType = son.returnVec;
		}
		if (returnType instanceof Name) throw new Exception("function_definition");
		Type type = new Function(returnType, argumentType, functionName);
		addSymbol(main.F, type, functionName, false);
		
		main.func = (Function)type;
		
		quad.add(new __LabelQuad(new __Label(functionName)));
		
		beginScope("function");
		
		main.Offset.push(main.Offset.pop());
		
		for (int i = 0; i < argumentType.size(); i += 2)
		{
			String name = (String)argumentType.get(i + 1);
			Type type2 = (Type)argumentType.get(i);
			
			if (type2 instanceof Array)
				type2 = new Pointer(((Array)type2).elementType, "GXX_" + String.valueOf(main.noName++));
			
			main.func.argOffset.add(main.Offset.peek());
			
			__TempOprand tmp = addSymbol(main.F, type2, name, true);
			
			pullArg(tmp, type2);
		}
		
		//System.out.println(functionName);
		
		compAfterFunction = true;
		
		son = (root)vec.get(vec.size() - 1);
		son.checkSon();
		
		addquad(son);
		
		int ttt = main.Offset.peek();
		
		type.size = ttt + 16;
		
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 12, new Int()), new __TempOprand(new __Temp("$s2"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 8, new Int()), new __TempOprand(new __Temp("$s1"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 4, new Int()), new __TempOprand(new __Temp("$s0"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 0, new Int()), new __TempOprand(new __Temp("$ra"))),  1);
		quad.insertElementAt(new __BinOp(__tosp, __tosp, new __Const(-type.size), "+"), 1);
		
		quad.add(new __Move(new __TempOprand(new __Temp("$ra")), new __Mem(__tosp, ttt + 0, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$s0")),  new __Mem(__tosp, ttt + 4, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$s1")), new __Mem(__tosp, ttt + 8, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$s2")),  new __Mem(__tosp, ttt + 12, new Int())));
		quad.add(new __BinOp(__tosp, __tosp, new __Const(type.size), "+"));
		
		endScope("function");
		
		quad.add(new __Jump(new __Label("$ra")));
		quad.add(new __Void(""));
		
		main.func = null;
	}
}
