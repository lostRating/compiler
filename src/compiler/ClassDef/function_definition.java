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
		
		if (functionName.equals("main"))
			quad.add(new __Void("  la $gp GXX_initGP"));
		
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
		
		type.size = ttt + 48;
		
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 44, new Int()), new __TempOprand(new __Temp("$s4"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 40, new Int()), new __TempOprand(new __Temp("$t9"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 36, new Int()), new __TempOprand(new __Temp("$t8"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 32, new Int()), new __TempOprand(new __Temp("$t7"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 28, new Int()), new __TempOprand(new __Temp("$t6"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 24, new Int()), new __TempOprand(new __Temp("$t5"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 20, new Int()), new __TempOprand(new __Temp("$t4"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 16, new Int()), new __TempOprand(new __Temp("$t3"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 12, new Int()), new __TempOprand(new __Temp("$t2"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 8, new Int()), new __TempOprand(new __Temp("$t1"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 4, new Int()), new __TempOprand(new __Temp("$t0"))),  1);
		quad.insertElementAt(new __Move(new __Mem(__tosp, ttt + 0, new Int()), new __TempOprand(new __Temp("$ra"))),  1);
		quad.insertElementAt(new __BinOp(__tosp, __tosp, new __Const(-type.size), "+"), 1);
		
		quad.add(new __Move(new __TempOprand(new __Temp("$ra")), new __Mem(__tosp, ttt + 0, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$t0")), new __Mem(__tosp, ttt + 4, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$t1")), new __Mem(__tosp, ttt + 8, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$t2")), new __Mem(__tosp, ttt + 12, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$t3")), new __Mem(__tosp, ttt + 16, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$t4")), new __Mem(__tosp, ttt + 20, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$t5")), new __Mem(__tosp, ttt + 24, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$t6")), new __Mem(__tosp, ttt + 28, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$t7")), new __Mem(__tosp, ttt + 32, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$t8")), new __Mem(__tosp, ttt + 36, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$t9")), new __Mem(__tosp, ttt + 40, new Int())));
		quad.add(new __Move(new __TempOprand(new __Temp("$s4")), new __Mem(__tosp, ttt + 44, new Int())));
		quad.add(new __BinOp(__tosp, __tosp, new __Const(type.size), "+"));
		
		endScope("function");
		
		quad.add(new __Void("  jr $ra"));
		quad.add(new __Void(""));
		
		main.func = null;
	}
}
