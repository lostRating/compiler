package compiler.Semantic;

import java.util.Vector;
import compiler.ClassDef.*;

public class makeTree {
	static void print(int cnt, String t)
	{
		for (int j = 0; j < cnt; ++j)
			System.out.print("  ");
		String tt = "";
		if (t.length() > 4 && t.charAt(0) == 'G' && t.charAt(3) == '_')
		{
			for (int i = 4; i < t.length(); ++i)
				tt += t.charAt(i);
		}
		else
			tt = t;
		System.out.println(tt);
	}
	
	static public root getRoot(String s) {
		Vector vec = new Vector(10000);
		int n = s.length(), cnt = 0, flag = 0, FLAG = 0;
        String t = "";
        for (int i = 0; i < n; ++i) {
        	if (i + 1 == n || s.charAt(i) == ' ') {
        		if (t.length() != 0) {
        			
        			//print(cnt, t);
        			
        			root tmp;
        		         if (t.equals("GXX_program")) tmp = new program();
     				else if (t.equals("GXX_declaration")) tmp = new declaration();
     				else if (t.equals("GXX_function_definition")) tmp = new function_definition();
     				else if (t.equals("GXX_parameters")) tmp = new parameters();
     				else if (t.equals("GXX_declarators")) tmp = new declarators();
     				else if (t.equals("GXX_init_declarators")) tmp = new init_declarators();
     				else if (t.equals("GXX_init_declarator")) tmp = new init_declarator();
     				else if (t.equals("GXX_initializer")) tmp = new initializer();
     				else if (t.equals("GXX_type_specifier")) tmp = new type_specifier();
     				else if (t.equals("GXX_plain_declaration")) tmp = new plain_declaration();
     				else if (t.equals("GXX_declarator")) tmp = new declarator();
     				else if (t.equals("GXX_plain_declarator")) tmp = new plain_declarator();
     				else if (t.equals("GXX_statement")) tmp = new statement();
     				else if (t.equals("GXX_expression_statement")) tmp = new expression_statement();
     				else if (t.equals("GXX_compound_statement")) tmp = new compound_statement();
     				else if (t.equals("GXX_selection_statement")) tmp = new selection_statement();
     				else if (t.equals("GXX_iteration_statement")) tmp = new iteration_statement();
     				else if (t.equals("GXX_struct_inner")) tmp = new struct_inner();
     				else if (t.equals("GXX_jump_statement")) tmp = new jump_statement();
     				else if (t.equals("GXX_expression")) tmp = new expression();
     				else if (t.equals("GXX_assignment_expression")) tmp = new assignment_expression();
     				else if (t.equals("GXX_constant_expression")) tmp = new constant_expression();
     				else if (t.equals("GXX_logical_or_expression")) tmp = new logical_or_expression();
     				else if (t.equals("GXX_logical_and_expression")) tmp = new logical_and_expression();
     				else if (t.equals("GXX_inclusive_or_expression")) tmp = new inclusive_or_expression();
     				else if (t.equals("GXX_exclusive_or_expression")) tmp = new exclusive_or_expression();
     				else if (t.equals("GXX_and_expression")) tmp = new and_expression();
     				else if (t.equals("GXX_equality_expression")) tmp = new equality_expression();
     				else if (t.equals("GXX_relational_expression")) tmp = new relational_expression();
     				else if (t.equals("GXX_shift_expression")) tmp = new shift_expression();
     				else if (t.equals("GXX_additive_expression")) tmp = new additive_expression();
     				else if (t.equals("GXX_multiplicative_expression")) tmp = new multiplicative_expression();
     				else if (t.equals("GXX_cast_expression")) tmp = new cast_expression();
     				else if (t.equals("GXX_type_name")) tmp = new type_name();
     				else if (t.equals("GXX_unary_expression")) tmp = new unary_expression();
     				else if (t.equals("GXX_postfix_expression")) tmp = new postfix_expression();
     				else if (t.equals("GXX_postfix")) tmp = new postfix();
     				else if (t.equals("GXX_arguments")) tmp = new arguments();
     				else if (t.equals("GXX_primary_expression")) tmp = new primary_expression();
     				else if (t.equals("GXX_constant")) tmp = new constant();
     				else if (t.equals("GXX_identifier")) tmp = new identifier();
     				else if (t.equals("GXX_character_constant")) tmp = new character_constant();
     				else if (t.equals("GXX_string")) tmp = new string();
     				else if (t.equals("GXX_integer_constant")) tmp = new integer_constant();
     				else tmp = new root(t);
        		    if (cnt > 0)
        		    {
        		 //   	System.out.prinln()
        		 //   	vec.get(0);
        		    	root tmp2 = (root)vec.get(cnt - 1);
        		    	tmp2.addChild(tmp);
        		    }
        		    if (cnt == vec.size())
        		    	vec.add(tmp);
        		    else
        		    	vec.set(cnt, tmp);
        		}
        		t = "";
        		cnt += flag;
        		flag = 0;
        		cnt -= FLAG;
        		FLAG = 0;
        	}
        	if (s.charAt(i) == '(')
        		++flag;
        	else if (s.charAt(i) == ')')
        		++FLAG;
        	else if (s.charAt(i) != ' ')
        		t = t + s.charAt(i);
        }
        return (root)vec.get(0);
	}
}