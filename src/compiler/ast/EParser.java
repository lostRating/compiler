package compiler.ast;

// $ANTLR 3.5-rc-2 D:\\antlr\\E.g 2014-04-17 22:35:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class EParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Character_constant", "Comments", 
		"Dec", "Digit", "DigitHex", "FOUR", "GXX_additive_expression", "GXX_and_expression", 
		"GXX_arguments", "GXX_assignment_expression", "GXX_assignment_operator", 
		"GXX_cast_expression", "GXX_character_constant", "GXX_compound_statement", 
		"GXX_constant", "GXX_constant_expression", "GXX_declaration", "GXX_declarator", 
		"GXX_declarators", "GXX_equality_expression", "GXX_exclusive_or_expression", 
		"GXX_expression", "GXX_expression_statement", "GXX_function_definition", 
		"GXX_identifier", "GXX_inclusive_or_expression", "GXX_init_declarator", 
		"GXX_init_declarators", "GXX_initializer", "GXX_integer_constant", "GXX_iteration_statement", 
		"GXX_jump_statement", "GXX_logical_and_expression", "GXX_logical_or_expression", 
		"GXX_multiplicative_expression", "GXX_parameters", "GXX_plain_declaration", 
		"GXX_plain_declarator", "GXX_postfix", "GXX_postfix_expression", "GXX_primary_expression", 
		"GXX_program", "GXX_relational_expression", "GXX_selection_statement", 
		"GXX_shift_expression", "GXX_statement", "GXX_string", "GXX_struct_inner", 
		"GXX_type_name", "GXX_type_specifier", "GXX_unary_expression", "Hex", 
		"ID", "INCLUDE", "Letter", "ONE", "Oct", "String", "THREE", "TWO", "WS", 
		"'!'", "'!='", "'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", 
		"'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'->'", "'.'", 
		"'/'", "'/='", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", 
		"'>='", "'>>'", "'>>='", "'['", "']'", "'^'", "'^='", "'break'", "'char'", 
		"'continue'", "'else'", "'for'", "'if'", "'int'", "'return'", "'sizeof'", 
		"'struct'", "'union'", "'void'", "'while'", "'{'", "'|'", "'|='", "'||'", 
		"'}'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int Character_constant=4;
	public static final int Comments=5;
	public static final int Dec=6;
	public static final int Digit=7;
	public static final int DigitHex=8;
	public static final int FOUR=9;
	public static final int GXX_additive_expression=10;
	public static final int GXX_and_expression=11;
	public static final int GXX_arguments=12;
	public static final int GXX_assignment_expression=13;
	public static final int GXX_assignment_operator=14;
	public static final int GXX_cast_expression=15;
	public static final int GXX_character_constant=16;
	public static final int GXX_compound_statement=17;
	public static final int GXX_constant=18;
	public static final int GXX_constant_expression=19;
	public static final int GXX_declaration=20;
	public static final int GXX_declarator=21;
	public static final int GXX_declarators=22;
	public static final int GXX_equality_expression=23;
	public static final int GXX_exclusive_or_expression=24;
	public static final int GXX_expression=25;
	public static final int GXX_expression_statement=26;
	public static final int GXX_function_definition=27;
	public static final int GXX_identifier=28;
	public static final int GXX_inclusive_or_expression=29;
	public static final int GXX_init_declarator=30;
	public static final int GXX_init_declarators=31;
	public static final int GXX_initializer=32;
	public static final int GXX_integer_constant=33;
	public static final int GXX_iteration_statement=34;
	public static final int GXX_jump_statement=35;
	public static final int GXX_logical_and_expression=36;
	public static final int GXX_logical_or_expression=37;
	public static final int GXX_multiplicative_expression=38;
	public static final int GXX_parameters=39;
	public static final int GXX_plain_declaration=40;
	public static final int GXX_plain_declarator=41;
	public static final int GXX_postfix=42;
	public static final int GXX_postfix_expression=43;
	public static final int GXX_primary_expression=44;
	public static final int GXX_program=45;
	public static final int GXX_relational_expression=46;
	public static final int GXX_selection_statement=47;
	public static final int GXX_shift_expression=48;
	public static final int GXX_statement=49;
	public static final int GXX_string=50;
	public static final int GXX_struct_inner=51;
	public static final int GXX_type_name=52;
	public static final int GXX_type_specifier=53;
	public static final int GXX_unary_expression=54;
	public static final int Hex=55;
	public static final int ID=56;
	public static final int INCLUDE=57;
	public static final int Letter=58;
	public static final int ONE=59;
	public static final int Oct=60;
	public static final int String=61;
	public static final int THREE=62;
	public static final int TWO=63;
	public static final int WS=64;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public EParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public EParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return EParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\antlr\\E.g"; }


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\antlr\\E.g:62:1: program : a1= program_tmp -> ^( GXX_program $a1) ;
	public final EParser.program_return program() throws RecognitionException {
		EParser.program_return retval = new EParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope a1 =null;

		RewriteRuleSubtreeStream stream_program_tmp=new RewriteRuleSubtreeStream(adaptor,"rule program_tmp");

		try {
			// D:\\antlr\\E.g:62:9: (a1= program_tmp -> ^( GXX_program $a1) )
			// D:\\antlr\\E.g:63:2: a1= program_tmp
			{
			pushFollow(FOLLOW_program_tmp_in_program248);
			a1=program_tmp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_program_tmp.add(a1.getTree());
			// AST REWRITE
			// elements: a1
			// token labels: 
			// rule labels: retval, a1
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 63:18: -> ^( GXX_program $a1)
			{
				// D:\\antlr\\E.g:63:22: ^( GXX_program $a1)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_program, "GXX_program"), root_1);
				adaptor.addChild(root_1, stream_a1.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class program_tmp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program_tmp"
	// D:\\antlr\\E.g:66:1: program_tmp : ( declaration | function_definition )+ ;
	public final EParser.program_tmp_return program_tmp() throws RecognitionException {
		EParser.program_tmp_return retval = new EParser.program_tmp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declaration1 =null;
		ParserRuleReturnScope function_definition2 =null;


		try {
			// D:\\antlr\\E.g:66:13: ( ( declaration | function_definition )+ )
			// D:\\antlr\\E.g:67:2: ( declaration | function_definition )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\antlr\\E.g:67:2: ( declaration | function_definition )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=3;
				switch ( input.LA(1) ) {
				case 113:
					{
					int LA1_2 = input.LA(2);
					if ( (synpred1_E()) ) {
						alt1=1;
					}
					else if ( (synpred2_E()) ) {
						alt1=2;
					}

					}
					break;
				case 103:
					{
					int LA1_3 = input.LA(2);
					if ( (synpred1_E()) ) {
						alt1=1;
					}
					else if ( (synpred2_E()) ) {
						alt1=2;
					}

					}
					break;
				case 108:
					{
					int LA1_4 = input.LA(2);
					if ( (synpred1_E()) ) {
						alt1=1;
					}
					else if ( (synpred2_E()) ) {
						alt1=2;
					}

					}
					break;
				case 111:
				case 112:
					{
					int LA1_5 = input.LA(2);
					if ( (synpred1_E()) ) {
						alt1=1;
					}
					else if ( (synpred2_E()) ) {
						alt1=2;
					}

					}
					break;
				}
				switch (alt1) {
				case 1 :
					// D:\\antlr\\E.g:67:3: declaration
					{
					pushFollow(FOLLOW_declaration_in_program_tmp277);
					declaration1=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration1.getTree());

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:67:17: function_definition
					{
					pushFollow(FOLLOW_function_definition_in_program_tmp281);
					function_definition2=function_definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_definition2.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program_tmp"


	public static class declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// D:\\antlr\\E.g:70:1: declaration : a1= type_specifier (a2= init_declarators )? ';' -> ^( GXX_declaration $a1 ( $a2)? ) ;
	public final EParser.declaration_return declaration() throws RecognitionException {
		EParser.declaration_return retval = new EParser.declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal3=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;

		CommonTree char_literal3_tree=null;
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_init_declarators=new RewriteRuleSubtreeStream(adaptor,"rule init_declarators");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");

		try {
			// D:\\antlr\\E.g:70:13: (a1= type_specifier (a2= init_declarators )? ';' -> ^( GXX_declaration $a1 ( $a2)? ) )
			// D:\\antlr\\E.g:71:2: a1= type_specifier (a2= init_declarators )? ';'
			{
			pushFollow(FOLLOW_type_specifier_in_declaration303);
			a1=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(a1.getTree());
			// D:\\antlr\\E.g:71:22: (a2= init_declarators )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ID||LA2_0==74) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\antlr\\E.g:71:22: a2= init_declarators
					{
					pushFollow(FOLLOW_init_declarators_in_declaration307);
					a2=init_declarators();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_init_declarators.add(a2.getTree());
					}
					break;

			}

			char_literal3=(Token)match(input,87,FOLLOW_87_in_declaration310); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_87.add(char_literal3);

			// AST REWRITE
			// elements: a2, a1
			// token labels: 
			// rule labels: retval, a1, a2
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
			RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 71:46: -> ^( GXX_declaration $a1 ( $a2)? )
			{
				// D:\\antlr\\E.g:71:50: ^( GXX_declaration $a1 ( $a2)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_declaration, "GXX_declaration"), root_1);
				adaptor.addChild(root_1, stream_a1.nextTree());
				// D:\\antlr\\E.g:71:73: ( $a2)?
				if ( stream_a2.hasNext() ) {
					adaptor.addChild(root_1, stream_a2.nextTree());
				}
				stream_a2.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class function_definition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function_definition"
	// D:\\antlr\\E.g:74:1: function_definition : a1= type_specifier a2= plain_declarator '(' (a3= parameters )? ')' a4= compound_statement -> ^( GXX_function_definition $a1 $a2 ( $a3)? $a4) ;
	public final EParser.function_definition_return function_definition() throws RecognitionException {
		EParser.function_definition_return retval = new EParser.function_definition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal4=null;
		Token char_literal5=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;
		ParserRuleReturnScope a3 =null;
		ParserRuleReturnScope a4 =null;

		CommonTree char_literal4_tree=null;
		CommonTree char_literal5_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_plain_declarator=new RewriteRuleSubtreeStream(adaptor,"rule plain_declarator");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
		RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
		RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");

		try {
			// D:\\antlr\\E.g:74:21: (a1= type_specifier a2= plain_declarator '(' (a3= parameters )? ')' a4= compound_statement -> ^( GXX_function_definition $a1 $a2 ( $a3)? $a4) )
			// D:\\antlr\\E.g:75:2: a1= type_specifier a2= plain_declarator '(' (a3= parameters )? ')' a4= compound_statement
			{
			pushFollow(FOLLOW_type_specifier_in_function_definition345);
			a1=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(a1.getTree());
			pushFollow(FOLLOW_plain_declarator_in_function_definition349);
			a2=plain_declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plain_declarator.add(a2.getTree());
			char_literal4=(Token)match(input,72,FOLLOW_72_in_function_definition351); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_72.add(char_literal4);

			// D:\\antlr\\E.g:75:46: (a3= parameters )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==103||LA3_0==108||(LA3_0 >= 111 && LA3_0 <= 113)) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\antlr\\E.g:75:46: a3= parameters
					{
					pushFollow(FOLLOW_parameters_in_function_definition355);
					a3=parameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameters.add(a3.getTree());
					}
					break;

			}

			char_literal5=(Token)match(input,73,FOLLOW_73_in_function_definition358); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_73.add(char_literal5);

			pushFollow(FOLLOW_compound_statement_in_function_definition362);
			a4=compound_statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_compound_statement.add(a4.getTree());
			// AST REWRITE
			// elements: a2, a3, a1, a4
			// token labels: 
			// rule labels: retval, a1, a2, a3, a4
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
			RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.getTree():null);
			RewriteRuleSubtreeStream stream_a3=new RewriteRuleSubtreeStream(adaptor,"rule a3",a3!=null?a3.getTree():null);
			RewriteRuleSubtreeStream stream_a4=new RewriteRuleSubtreeStream(adaptor,"rule a4",a4!=null?a4.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 75:86: -> ^( GXX_function_definition $a1 $a2 ( $a3)? $a4)
			{
				// D:\\antlr\\E.g:75:90: ^( GXX_function_definition $a1 $a2 ( $a3)? $a4)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_function_definition, "GXX_function_definition"), root_1);
				adaptor.addChild(root_1, stream_a1.nextTree());
				adaptor.addChild(root_1, stream_a2.nextTree());
				// D:\\antlr\\E.g:75:125: ( $a3)?
				if ( stream_a3.hasNext() ) {
					adaptor.addChild(root_1, stream_a3.nextTree());
				}
				stream_a3.reset();

				adaptor.addChild(root_1, stream_a4.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_definition"


	public static class parameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameters"
	// D:\\antlr\\E.g:78:1: parameters : plain_declaration ( ',' plain_declaration )* -> ^( GXX_parameters ( plain_declaration )+ ) ;
	public final EParser.parameters_return parameters() throws RecognitionException {
		EParser.parameters_return retval = new EParser.parameters_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal7=null;
		ParserRuleReturnScope plain_declaration6 =null;
		ParserRuleReturnScope plain_declaration8 =null;

		CommonTree char_literal7_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleSubtreeStream stream_plain_declaration=new RewriteRuleSubtreeStream(adaptor,"rule plain_declaration");

		try {
			// D:\\antlr\\E.g:78:12: ( plain_declaration ( ',' plain_declaration )* -> ^( GXX_parameters ( plain_declaration )+ ) )
			// D:\\antlr\\E.g:79:2: plain_declaration ( ',' plain_declaration )*
			{
			pushFollow(FOLLOW_plain_declaration_in_parameters401);
			plain_declaration6=plain_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plain_declaration.add(plain_declaration6.getTree());
			// D:\\antlr\\E.g:79:20: ( ',' plain_declaration )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==79) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\antlr\\E.g:79:21: ',' plain_declaration
					{
					char_literal7=(Token)match(input,79,FOLLOW_79_in_parameters404); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal7);

					pushFollow(FOLLOW_plain_declaration_in_parameters406);
					plain_declaration8=plain_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_plain_declaration.add(plain_declaration8.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			// AST REWRITE
			// elements: plain_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 79:46: -> ^( GXX_parameters ( plain_declaration )+ )
			{
				// D:\\antlr\\E.g:79:50: ^( GXX_parameters ( plain_declaration )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_parameters, "GXX_parameters"), root_1);
				if ( !(stream_plain_declaration.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_plain_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_plain_declaration.nextTree());
				}
				stream_plain_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameters"


	public static class declarators_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarators"
	// D:\\antlr\\E.g:82:1: declarators : declarator ( ',' declarator )* -> ^( GXX_declarators ( declarator )+ ) ;
	public final EParser.declarators_return declarators() throws RecognitionException {
		EParser.declarators_return retval = new EParser.declarators_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal10=null;
		ParserRuleReturnScope declarator9 =null;
		ParserRuleReturnScope declarator11 =null;

		CommonTree char_literal10_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");

		try {
			// D:\\antlr\\E.g:82:13: ( declarator ( ',' declarator )* -> ^( GXX_declarators ( declarator )+ ) )
			// D:\\antlr\\E.g:83:2: declarator ( ',' declarator )*
			{
			pushFollow(FOLLOW_declarator_in_declarators437);
			declarator9=declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarator.add(declarator9.getTree());
			// D:\\antlr\\E.g:83:13: ( ',' declarator )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==79) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\antlr\\E.g:83:14: ',' declarator
					{
					char_literal10=(Token)match(input,79,FOLLOW_79_in_declarators440); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal10);

					pushFollow(FOLLOW_declarator_in_declarators442);
					declarator11=declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declarator.add(declarator11.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: declarator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 83:32: -> ^( GXX_declarators ( declarator )+ )
			{
				// D:\\antlr\\E.g:83:36: ^( GXX_declarators ( declarator )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_declarators, "GXX_declarators"), root_1);
				if ( !(stream_declarator.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_declarator.hasNext() ) {
					adaptor.addChild(root_1, stream_declarator.nextTree());
				}
				stream_declarator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarators"


	public static class init_declarators_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "init_declarators"
	// D:\\antlr\\E.g:86:1: init_declarators : init_declarator ( ',' init_declarator )* -> ^( GXX_init_declarators ( init_declarator )+ ) ;
	public final EParser.init_declarators_return init_declarators() throws RecognitionException {
		EParser.init_declarators_return retval = new EParser.init_declarators_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal13=null;
		ParserRuleReturnScope init_declarator12 =null;
		ParserRuleReturnScope init_declarator14 =null;

		CommonTree char_literal13_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleSubtreeStream stream_init_declarator=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator");

		try {
			// D:\\antlr\\E.g:86:18: ( init_declarator ( ',' init_declarator )* -> ^( GXX_init_declarators ( init_declarator )+ ) )
			// D:\\antlr\\E.g:87:2: init_declarator ( ',' init_declarator )*
			{
			pushFollow(FOLLOW_init_declarator_in_init_declarators473);
			init_declarator12=init_declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator12.getTree());
			// D:\\antlr\\E.g:87:18: ( ',' init_declarator )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==79) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\antlr\\E.g:87:19: ',' init_declarator
					{
					char_literal13=(Token)match(input,79,FOLLOW_79_in_init_declarators476); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal13);

					pushFollow(FOLLOW_init_declarator_in_init_declarators478);
					init_declarator14=init_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator14.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			// AST REWRITE
			// elements: init_declarator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 87:42: -> ^( GXX_init_declarators ( init_declarator )+ )
			{
				// D:\\antlr\\E.g:87:46: ^( GXX_init_declarators ( init_declarator )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_init_declarators, "GXX_init_declarators"), root_1);
				if ( !(stream_init_declarator.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_init_declarator.hasNext() ) {
					adaptor.addChild(root_1, stream_init_declarator.nextTree());
				}
				stream_init_declarator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "init_declarators"


	public static class init_declarator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "init_declarator"
	// D:\\antlr\\E.g:90:1: init_declarator : a1= declarator ( '=' a2= initializer )? -> ^( GXX_init_declarator $a1 ( $a2)? ) ;
	public final EParser.init_declarator_return init_declarator() throws RecognitionException {
		EParser.init_declarator_return retval = new EParser.init_declarator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal15=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;

		CommonTree char_literal15_tree=null;
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
		RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");

		try {
			// D:\\antlr\\E.g:90:17: (a1= declarator ( '=' a2= initializer )? -> ^( GXX_init_declarator $a1 ( $a2)? ) )
			// D:\\antlr\\E.g:91:2: a1= declarator ( '=' a2= initializer )?
			{
			pushFollow(FOLLOW_declarator_in_init_declarator511);
			a1=declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarator.add(a1.getTree());
			// D:\\antlr\\E.g:91:16: ( '=' a2= initializer )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==92) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\antlr\\E.g:91:17: '=' a2= initializer
					{
					char_literal15=(Token)match(input,92,FOLLOW_92_in_init_declarator514); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_92.add(char_literal15);

					pushFollow(FOLLOW_initializer_in_init_declarator518);
					a2=initializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_initializer.add(a2.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: a2, a1
			// token labels: 
			// rule labels: retval, a1, a2
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
			RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 91:39: -> ^( GXX_init_declarator $a1 ( $a2)? )
			{
				// D:\\antlr\\E.g:91:43: ^( GXX_init_declarator $a1 ( $a2)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_init_declarator, "GXX_init_declarator"), root_1);
				adaptor.addChild(root_1, stream_a1.nextTree());
				// D:\\antlr\\E.g:91:70: ( $a2)?
				if ( stream_a2.hasNext() ) {
					adaptor.addChild(root_1, stream_a2.nextTree());
				}
				stream_a2.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "init_declarator"


	public static class initializer_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "initializer"
	// D:\\antlr\\E.g:94:1: initializer : (a1= assignment_expression -> ^( GXX_initializer ONE $a1) | '{' initializer ( ',' initializer )* '}' -> ^( GXX_initializer ( initializer )+ ) );
	public final EParser.initializer_return initializer() throws RecognitionException {
		EParser.initializer_return retval = new EParser.initializer_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal16=null;
		Token char_literal18=null;
		Token char_literal20=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope initializer17 =null;
		ParserRuleReturnScope initializer19 =null;

		CommonTree char_literal16_tree=null;
		CommonTree char_literal18_tree=null;
		CommonTree char_literal20_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
		RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");
		RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");

		try {
			// D:\\antlr\\E.g:94:13: (a1= assignment_expression -> ^( GXX_initializer ONE $a1) | '{' initializer ( ',' initializer )* '}' -> ^( GXX_initializer ( initializer )+ ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Character_constant||LA9_0==Dec||(LA9_0 >= Hex && LA9_0 <= ID)||(LA9_0 >= Oct && LA9_0 <= String)||LA9_0==65||LA9_0==70||LA9_0==72||LA9_0==74||(LA9_0 >= 76 && LA9_0 <= 77)||(LA9_0 >= 80 && LA9_0 <= 81)||LA9_0==110||LA9_0==120) ) {
				alt9=1;
			}
			else if ( (LA9_0==115) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// D:\\antlr\\E.g:95:2: a1= assignment_expression
					{
					pushFollow(FOLLOW_assignment_expression_in_initializer555);
					a1=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_expression.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 95:28: -> ^( GXX_initializer ONE $a1)
					{
						// D:\\antlr\\E.g:95:32: ^( GXX_initializer ONE $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_initializer, "GXX_initializer"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(ONE, "ONE"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:96:2: '{' initializer ( ',' initializer )* '}'
					{
					char_literal16=(Token)match(input,115,FOLLOW_115_in_initializer574); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_115.add(char_literal16);

					pushFollow(FOLLOW_initializer_in_initializer576);
					initializer17=initializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_initializer.add(initializer17.getTree());
					// D:\\antlr\\E.g:96:18: ( ',' initializer )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==79) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\antlr\\E.g:96:19: ',' initializer
							{
							char_literal18=(Token)match(input,79,FOLLOW_79_in_initializer579); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_79.add(char_literal18);

							pushFollow(FOLLOW_initializer_in_initializer581);
							initializer19=initializer();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_initializer.add(initializer19.getTree());
							}
							break;

						default :
							break loop8;
						}
					}

					char_literal20=(Token)match(input,119,FOLLOW_119_in_initializer585); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_119.add(char_literal20);

					// AST REWRITE
					// elements: initializer
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 96:43: -> ^( GXX_initializer ( initializer )+ )
					{
						// D:\\antlr\\E.g:96:47: ^( GXX_initializer ( initializer )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_initializer, "GXX_initializer"), root_1);
						if ( !(stream_initializer.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_initializer.hasNext() ) {
							adaptor.addChild(root_1, stream_initializer.nextTree());
						}
						stream_initializer.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "initializer"


	public static class type_specifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_specifier"
	// D:\\antlr\\E.g:99:1: type_specifier : ( 'void' -> ^( GXX_type_specifier 'void' ) | 'char' -> ^( GXX_type_specifier 'char' ) | 'int' -> ^( GXX_type_specifier 'int' ) |a1= struct_or_union (a2= identifier )? '{' ( type_specifier declarators ';' )+ '}' -> ^( GXX_type_specifier ONE $a1 ( $a2)? ^( GXX_struct_inner ( type_specifier declarators )+ ) ) |a1= struct_or_union a2= identifier -> ^( GXX_type_specifier $a1 $a2) );
	public final EParser.type_specifier_return type_specifier() throws RecognitionException {
		EParser.type_specifier_return retval = new EParser.type_specifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal21=null;
		Token string_literal22=null;
		Token string_literal23=null;
		Token char_literal24=null;
		Token char_literal27=null;
		Token char_literal28=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;
		ParserRuleReturnScope type_specifier25 =null;
		ParserRuleReturnScope declarators26 =null;

		CommonTree string_literal21_tree=null;
		CommonTree string_literal22_tree=null;
		CommonTree string_literal23_tree=null;
		CommonTree char_literal24_tree=null;
		CommonTree char_literal27_tree=null;
		CommonTree char_literal28_tree=null;
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
		RewriteRuleSubtreeStream stream_declarators=new RewriteRuleSubtreeStream(adaptor,"rule declarators");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_struct_or_union=new RewriteRuleSubtreeStream(adaptor,"rule struct_or_union");

		try {
			// D:\\antlr\\E.g:99:16: ( 'void' -> ^( GXX_type_specifier 'void' ) | 'char' -> ^( GXX_type_specifier 'char' ) | 'int' -> ^( GXX_type_specifier 'int' ) |a1= struct_or_union (a2= identifier )? '{' ( type_specifier declarators ';' )+ '}' -> ^( GXX_type_specifier ONE $a1 ( $a2)? ^( GXX_struct_inner ( type_specifier declarators )+ ) ) |a1= struct_or_union a2= identifier -> ^( GXX_type_specifier $a1 $a2) )
			int alt12=5;
			switch ( input.LA(1) ) {
			case 113:
				{
				alt12=1;
				}
				break;
			case 103:
				{
				alt12=2;
				}
				break;
			case 108:
				{
				alt12=3;
				}
				break;
			case 111:
			case 112:
				{
				int LA12_4 = input.LA(2);
				if ( (LA12_4==ID) ) {
					int LA12_5 = input.LA(3);
					if ( (LA12_5==115) ) {
						alt12=4;
					}
					else if ( (LA12_5==ID||(LA12_5 >= 73 && LA12_5 <= 74)||LA12_5==87) ) {
						alt12=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA12_4==115) ) {
					alt12=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// D:\\antlr\\E.g:100:2: 'void'
					{
					string_literal21=(Token)match(input,113,FOLLOW_113_in_type_specifier615); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_113.add(string_literal21);

					// AST REWRITE
					// elements: 113
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 100:10: -> ^( GXX_type_specifier 'void' )
					{
						// D:\\antlr\\E.g:100:14: ^( GXX_type_specifier 'void' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_type_specifier, "GXX_type_specifier"), root_1);
						adaptor.addChild(root_1, stream_113.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:101:2: 'char'
					{
					string_literal22=(Token)match(input,103,FOLLOW_103_in_type_specifier631); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_103.add(string_literal22);

					// AST REWRITE
					// elements: 103
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 101:10: -> ^( GXX_type_specifier 'char' )
					{
						// D:\\antlr\\E.g:101:14: ^( GXX_type_specifier 'char' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_type_specifier, "GXX_type_specifier"), root_1);
						adaptor.addChild(root_1, stream_103.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\antlr\\E.g:102:2: 'int'
					{
					string_literal23=(Token)match(input,108,FOLLOW_108_in_type_specifier647); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_108.add(string_literal23);

					// AST REWRITE
					// elements: 108
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 102:9: -> ^( GXX_type_specifier 'int' )
					{
						// D:\\antlr\\E.g:102:13: ^( GXX_type_specifier 'int' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_type_specifier, "GXX_type_specifier"), root_1);
						adaptor.addChild(root_1, stream_108.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\antlr\\E.g:103:2: a1= struct_or_union (a2= identifier )? '{' ( type_specifier declarators ';' )+ '}'
					{
					pushFollow(FOLLOW_struct_or_union_in_type_specifier665);
					a1=struct_or_union();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_struct_or_union.add(a1.getTree());
					// D:\\antlr\\E.g:103:23: (a2= identifier )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ID) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// D:\\antlr\\E.g:103:23: a2= identifier
							{
							pushFollow(FOLLOW_identifier_in_type_specifier669);
							a2=identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(a2.getTree());
							}
							break;

					}

					char_literal24=(Token)match(input,115,FOLLOW_115_in_type_specifier672); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_115.add(char_literal24);

					// D:\\antlr\\E.g:103:40: ( type_specifier declarators ';' )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==103||LA11_0==108||(LA11_0 >= 111 && LA11_0 <= 113)) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// D:\\antlr\\E.g:103:41: type_specifier declarators ';'
							{
							pushFollow(FOLLOW_type_specifier_in_type_specifier675);
							type_specifier25=type_specifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier25.getTree());
							pushFollow(FOLLOW_declarators_in_type_specifier677);
							declarators26=declarators();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_declarators.add(declarators26.getTree());
							char_literal27=(Token)match(input,87,FOLLOW_87_in_type_specifier679); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_87.add(char_literal27);

							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					char_literal28=(Token)match(input,119,FOLLOW_119_in_type_specifier683); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_119.add(char_literal28);

					// AST REWRITE
					// elements: declarators, type_specifier, a2, a1
					// token labels: 
					// rule labels: retval, a1, a2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
					RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 103:79: -> ^( GXX_type_specifier ONE $a1 ( $a2)? ^( GXX_struct_inner ( type_specifier declarators )+ ) )
					{
						// D:\\antlr\\E.g:103:83: ^( GXX_type_specifier ONE $a1 ( $a2)? ^( GXX_struct_inner ( type_specifier declarators )+ ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_type_specifier, "GXX_type_specifier"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(ONE, "ONE"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						// D:\\antlr\\E.g:103:113: ( $a2)?
						if ( stream_a2.hasNext() ) {
							adaptor.addChild(root_1, stream_a2.nextTree());
						}
						stream_a2.reset();

						// D:\\antlr\\E.g:103:117: ^( GXX_struct_inner ( type_specifier declarators )+ )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_struct_inner, "GXX_struct_inner"), root_2);
						if ( !(stream_declarators.hasNext()||stream_type_specifier.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_declarators.hasNext()||stream_type_specifier.hasNext() ) {
							adaptor.addChild(root_2, stream_type_specifier.nextTree());
							adaptor.addChild(root_2, stream_declarators.nextTree());
						}
						stream_declarators.reset();
						stream_type_specifier.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// D:\\antlr\\E.g:104:2: a1= struct_or_union a2= identifier
					{
					pushFollow(FOLLOW_struct_or_union_in_type_specifier719);
					a1=struct_or_union();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_struct_or_union.add(a1.getTree());
					pushFollow(FOLLOW_identifier_in_type_specifier723);
					a2=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(a2.getTree());
					// AST REWRITE
					// elements: a2, a1
					// token labels: 
					// rule labels: retval, a1, a2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
					RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 104:36: -> ^( GXX_type_specifier $a1 $a2)
					{
						// D:\\antlr\\E.g:104:40: ^( GXX_type_specifier $a1 $a2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_type_specifier, "GXX_type_specifier"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_1, stream_a2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_specifier"


	public static class struct_or_union_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "struct_or_union"
	// D:\\antlr\\E.g:107:1: struct_or_union : ( 'struct' | 'union' );
	public final EParser.struct_or_union_return struct_or_union() throws RecognitionException {
		EParser.struct_or_union_return retval = new EParser.struct_or_union_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set29=null;

		CommonTree set29_tree=null;

		try {
			// D:\\antlr\\E.g:107:17: ( 'struct' | 'union' )
			// D:\\antlr\\E.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set29=input.LT(1);
			if ( (input.LA(1) >= 111 && input.LA(1) <= 112) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set29));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "struct_or_union"


	public static class plain_declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "plain_declaration"
	// D:\\antlr\\E.g:112:1: plain_declaration : a1= type_specifier a2= declarator -> ^( GXX_plain_declaration $a1 $a2) ;
	public final EParser.plain_declaration_return plain_declaration() throws RecognitionException {
		EParser.plain_declaration_return retval = new EParser.plain_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;

		RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");

		try {
			// D:\\antlr\\E.g:112:19: (a1= type_specifier a2= declarator -> ^( GXX_plain_declaration $a1 $a2) )
			// D:\\antlr\\E.g:113:2: a1= type_specifier a2= declarator
			{
			pushFollow(FOLLOW_type_specifier_in_plain_declaration781);
			a1=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(a1.getTree());
			pushFollow(FOLLOW_declarator_in_plain_declaration785);
			a2=declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarator.add(a2.getTree());
			// AST REWRITE
			// elements: a1, a2
			// token labels: 
			// rule labels: retval, a1, a2
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
			RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 113:35: -> ^( GXX_plain_declaration $a1 $a2)
			{
				// D:\\antlr\\E.g:113:39: ^( GXX_plain_declaration $a1 $a2)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_plain_declaration, "GXX_plain_declaration"), root_1);
				adaptor.addChild(root_1, stream_a1.nextTree());
				adaptor.addChild(root_1, stream_a2.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plain_declaration"


	public static class declarator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarator"
	// D:\\antlr\\E.g:116:1: declarator : (a1= plain_declarator '(' (a2= parameters )? ')' -> ^( GXX_declarator ONE $a1 ( $a2)? ) |a1= plain_declarator ( '[' constant_expression ']' )* -> ^( GXX_declarator $a1 ( constant_expression )* ) );
	public final EParser.declarator_return declarator() throws RecognitionException {
		EParser.declarator_return retval = new EParser.declarator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal30=null;
		Token char_literal31=null;
		Token char_literal32=null;
		Token char_literal34=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;
		ParserRuleReturnScope constant_expression33 =null;

		CommonTree char_literal30_tree=null;
		CommonTree char_literal31_tree=null;
		CommonTree char_literal32_tree=null;
		CommonTree char_literal34_tree=null;
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_plain_declarator=new RewriteRuleSubtreeStream(adaptor,"rule plain_declarator");
		RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
		RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");

		try {
			// D:\\antlr\\E.g:116:12: (a1= plain_declarator '(' (a2= parameters )? ')' -> ^( GXX_declarator ONE $a1 ( $a2)? ) |a1= plain_declarator ( '[' constant_expression ']' )* -> ^( GXX_declarator $a1 ( constant_expression )* ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==74) ) {
				int LA15_1 = input.LA(2);
				if ( (synpred19_E()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

			}
			else if ( (LA15_0==ID) ) {
				int LA15_2 = input.LA(2);
				if ( (synpred19_E()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// D:\\antlr\\E.g:117:2: a1= plain_declarator '(' (a2= parameters )? ')'
					{
					pushFollow(FOLLOW_plain_declarator_in_declarator817);
					a1=plain_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_plain_declarator.add(a1.getTree());
					char_literal30=(Token)match(input,72,FOLLOW_72_in_declarator819); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal30);

					// D:\\antlr\\E.g:117:28: (a2= parameters )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==103||LA13_0==108||(LA13_0 >= 111 && LA13_0 <= 113)) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// D:\\antlr\\E.g:117:28: a2= parameters
							{
							pushFollow(FOLLOW_parameters_in_declarator823);
							a2=parameters();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_parameters.add(a2.getTree());
							}
							break;

					}

					char_literal31=(Token)match(input,73,FOLLOW_73_in_declarator826); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal31);

					// AST REWRITE
					// elements: a2, a1
					// token labels: 
					// rule labels: retval, a1, a2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
					RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 117:46: -> ^( GXX_declarator ONE $a1 ( $a2)? )
					{
						// D:\\antlr\\E.g:117:50: ^( GXX_declarator ONE $a1 ( $a2)? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_declarator, "GXX_declarator"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(ONE, "ONE"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						// D:\\antlr\\E.g:117:76: ( $a2)?
						if ( stream_a2.hasNext() ) {
							adaptor.addChild(root_1, stream_a2.nextTree());
						}
						stream_a2.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:118:2: a1= plain_declarator ( '[' constant_expression ']' )*
					{
					pushFollow(FOLLOW_plain_declarator_in_declarator851);
					a1=plain_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_plain_declarator.add(a1.getTree());
					// D:\\antlr\\E.g:118:22: ( '[' constant_expression ']' )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==98) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// D:\\antlr\\E.g:118:23: '[' constant_expression ']'
							{
							char_literal32=(Token)match(input,98,FOLLOW_98_in_declarator854); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_98.add(char_literal32);

							pushFollow(FOLLOW_constant_expression_in_declarator856);
							constant_expression33=constant_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression33.getTree());
							char_literal34=(Token)match(input,99,FOLLOW_99_in_declarator858); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_99.add(char_literal34);

							}
							break;

						default :
							break loop14;
						}
					}

					// AST REWRITE
					// elements: constant_expression, a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 118:54: -> ^( GXX_declarator $a1 ( constant_expression )* )
					{
						// D:\\antlr\\E.g:118:58: ^( GXX_declarator $a1 ( constant_expression )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_declarator, "GXX_declarator"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						// D:\\antlr\\E.g:118:79: ( constant_expression )*
						while ( stream_constant_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_constant_expression.nextTree());
						}
						stream_constant_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarator"


	public static class plain_declarator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "plain_declarator"
	// D:\\antlr\\E.g:121:1: plain_declarator : ( '*' a1= plain_declarator -> ^( GXX_plain_declarator '*' $a1) |a1= identifier -> ^( GXX_plain_declarator $a1) );
	public final EParser.plain_declarator_return plain_declarator() throws RecognitionException {
		EParser.plain_declarator_return retval = new EParser.plain_declarator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal35=null;
		ParserRuleReturnScope a1 =null;

		CommonTree char_literal35_tree=null;
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_plain_declarator=new RewriteRuleSubtreeStream(adaptor,"rule plain_declarator");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// D:\\antlr\\E.g:121:18: ( '*' a1= plain_declarator -> ^( GXX_plain_declarator '*' $a1) |a1= identifier -> ^( GXX_plain_declarator $a1) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==74) ) {
				alt16=1;
			}
			else if ( (LA16_0==ID) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// D:\\antlr\\E.g:122:2: '*' a1= plain_declarator
					{
					char_literal35=(Token)match(input,74,FOLLOW_74_in_plain_declarator892); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_74.add(char_literal35);

					pushFollow(FOLLOW_plain_declarator_in_plain_declarator896);
					a1=plain_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_plain_declarator.add(a1.getTree());
					// AST REWRITE
					// elements: 74, a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 122:27: -> ^( GXX_plain_declarator '*' $a1)
					{
						// D:\\antlr\\E.g:122:31: ^( GXX_plain_declarator '*' $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_plain_declarator, "GXX_plain_declarator"), root_1);
						adaptor.addChild(root_1, stream_74.nextNode());
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:123:2: a1= identifier
					{
					pushFollow(FOLLOW_identifier_in_plain_declarator917);
					a1=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 123:17: -> ^( GXX_plain_declarator $a1)
					{
						// D:\\antlr\\E.g:123:21: ^( GXX_plain_declarator $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_plain_declarator, "GXX_plain_declarator"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plain_declarator"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\antlr\\E.g:126:1: statement : (a1= expression_statement -> ^( GXX_statement $a1) |a1= compound_statement -> ^( GXX_statement $a1) |a1= selection_statement -> ^( GXX_statement $a1) |a1= iteration_statement -> ^( GXX_statement $a1) |a1= jump_statement -> ^( GXX_statement $a1) );
	public final EParser.statement_return statement() throws RecognitionException {
		EParser.statement_return retval = new EParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope a1 =null;

		RewriteRuleSubtreeStream stream_selection_statement=new RewriteRuleSubtreeStream(adaptor,"rule selection_statement");
		RewriteRuleSubtreeStream stream_expression_statement=new RewriteRuleSubtreeStream(adaptor,"rule expression_statement");
		RewriteRuleSubtreeStream stream_iteration_statement=new RewriteRuleSubtreeStream(adaptor,"rule iteration_statement");
		RewriteRuleSubtreeStream stream_jump_statement=new RewriteRuleSubtreeStream(adaptor,"rule jump_statement");
		RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");

		try {
			// D:\\antlr\\E.g:126:11: (a1= expression_statement -> ^( GXX_statement $a1) |a1= compound_statement -> ^( GXX_statement $a1) |a1= selection_statement -> ^( GXX_statement $a1) |a1= iteration_statement -> ^( GXX_statement $a1) |a1= jump_statement -> ^( GXX_statement $a1) )
			int alt17=5;
			switch ( input.LA(1) ) {
			case Character_constant:
			case Dec:
			case Hex:
			case ID:
			case Oct:
			case String:
			case 65:
			case 70:
			case 72:
			case 74:
			case 76:
			case 77:
			case 80:
			case 81:
			case 87:
			case 110:
			case 120:
				{
				alt17=1;
				}
				break;
			case 115:
				{
				alt17=2;
				}
				break;
			case 107:
				{
				alt17=3;
				}
				break;
			case 106:
			case 114:
				{
				alt17=4;
				}
				break;
			case 102:
			case 104:
			case 109:
				{
				alt17=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// D:\\antlr\\E.g:127:2: a1= expression_statement
					{
					pushFollow(FOLLOW_expression_statement_in_statement947);
					a1=expression_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression_statement.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 127:27: -> ^( GXX_statement $a1)
					{
						// D:\\antlr\\E.g:127:31: ^( GXX_statement $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_statement, "GXX_statement"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:128:2: a1= compound_statement
					{
					pushFollow(FOLLOW_compound_statement_in_statement966);
					a1=compound_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_compound_statement.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 128:25: -> ^( GXX_statement $a1)
					{
						// D:\\antlr\\E.g:128:29: ^( GXX_statement $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_statement, "GXX_statement"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\antlr\\E.g:129:2: a1= selection_statement
					{
					pushFollow(FOLLOW_selection_statement_in_statement985);
					a1=selection_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_selection_statement.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 129:26: -> ^( GXX_statement $a1)
					{
						// D:\\antlr\\E.g:129:30: ^( GXX_statement $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_statement, "GXX_statement"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\antlr\\E.g:130:2: a1= iteration_statement
					{
					pushFollow(FOLLOW_iteration_statement_in_statement1004);
					a1=iteration_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_iteration_statement.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 130:26: -> ^( GXX_statement $a1)
					{
						// D:\\antlr\\E.g:130:30: ^( GXX_statement $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_statement, "GXX_statement"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// D:\\antlr\\E.g:131:2: a1= jump_statement
					{
					pushFollow(FOLLOW_jump_statement_in_statement1023);
					a1=jump_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_jump_statement.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 131:21: -> ^( GXX_statement $a1)
					{
						// D:\\antlr\\E.g:131:25: ^( GXX_statement $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_statement, "GXX_statement"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class expression_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression_statement"
	// D:\\antlr\\E.g:134:1: expression_statement : (a1= expression )? ';' -> ^( GXX_expression_statement ( $a1)? ) ;
	public final EParser.expression_statement_return expression_statement() throws RecognitionException {
		EParser.expression_statement_return retval = new EParser.expression_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal36=null;
		ParserRuleReturnScope a1 =null;

		CommonTree char_literal36_tree=null;
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\antlr\\E.g:134:22: ( (a1= expression )? ';' -> ^( GXX_expression_statement ( $a1)? ) )
			// D:\\antlr\\E.g:135:2: (a1= expression )? ';'
			{
			// D:\\antlr\\E.g:135:4: (a1= expression )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==Character_constant||LA18_0==Dec||(LA18_0 >= Hex && LA18_0 <= ID)||(LA18_0 >= Oct && LA18_0 <= String)||LA18_0==65||LA18_0==70||LA18_0==72||LA18_0==74||(LA18_0 >= 76 && LA18_0 <= 77)||(LA18_0 >= 80 && LA18_0 <= 81)||LA18_0==110||LA18_0==120) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\antlr\\E.g:135:4: a1= expression
					{
					pushFollow(FOLLOW_expression_in_expression_statement1053);
					a1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(a1.getTree());
					}
					break;

			}

			char_literal36=(Token)match(input,87,FOLLOW_87_in_expression_statement1056); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_87.add(char_literal36);

			// AST REWRITE
			// elements: a1
			// token labels: 
			// rule labels: retval, a1
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 135:22: -> ^( GXX_expression_statement ( $a1)? )
			{
				// D:\\antlr\\E.g:135:26: ^( GXX_expression_statement ( $a1)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_expression_statement, "GXX_expression_statement"), root_1);
				// D:\\antlr\\E.g:135:54: ( $a1)?
				if ( stream_a1.hasNext() ) {
					adaptor.addChild(root_1, stream_a1.nextTree());
				}
				stream_a1.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_statement"


	public static class compound_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "compound_statement"
	// D:\\antlr\\E.g:138:1: compound_statement : '{' ( declaration )* ( statement )* '}' -> ^( GXX_compound_statement ( declaration )* ( statement )* ) ;
	public final EParser.compound_statement_return compound_statement() throws RecognitionException {
		EParser.compound_statement_return retval = new EParser.compound_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal37=null;
		Token char_literal40=null;
		ParserRuleReturnScope declaration38 =null;
		ParserRuleReturnScope statement39 =null;

		CommonTree char_literal37_tree=null;
		CommonTree char_literal40_tree=null;
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// D:\\antlr\\E.g:138:20: ( '{' ( declaration )* ( statement )* '}' -> ^( GXX_compound_statement ( declaration )* ( statement )* ) )
			// D:\\antlr\\E.g:139:2: '{' ( declaration )* ( statement )* '}'
			{
			char_literal37=(Token)match(input,115,FOLLOW_115_in_compound_statement1086); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_115.add(char_literal37);

			// D:\\antlr\\E.g:139:6: ( declaration )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==103||LA19_0==108||(LA19_0 >= 111 && LA19_0 <= 113)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\antlr\\E.g:139:6: declaration
					{
					pushFollow(FOLLOW_declaration_in_compound_statement1088);
					declaration38=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declaration.add(declaration38.getTree());
					}
					break;

				default :
					break loop19;
				}
			}

			// D:\\antlr\\E.g:139:19: ( statement )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Character_constant||LA20_0==Dec||(LA20_0 >= Hex && LA20_0 <= ID)||(LA20_0 >= Oct && LA20_0 <= String)||LA20_0==65||LA20_0==70||LA20_0==72||LA20_0==74||(LA20_0 >= 76 && LA20_0 <= 77)||(LA20_0 >= 80 && LA20_0 <= 81)||LA20_0==87||LA20_0==102||LA20_0==104||(LA20_0 >= 106 && LA20_0 <= 107)||(LA20_0 >= 109 && LA20_0 <= 110)||(LA20_0 >= 114 && LA20_0 <= 115)||LA20_0==120) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\antlr\\E.g:139:19: statement
					{
					pushFollow(FOLLOW_statement_in_compound_statement1091);
					statement39=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement39.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			char_literal40=(Token)match(input,119,FOLLOW_119_in_compound_statement1094); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_119.add(char_literal40);

			// AST REWRITE
			// elements: declaration, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 139:35: -> ^( GXX_compound_statement ( declaration )* ( statement )* )
			{
				// D:\\antlr\\E.g:139:39: ^( GXX_compound_statement ( declaration )* ( statement )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_compound_statement, "GXX_compound_statement"), root_1);
				// D:\\antlr\\E.g:139:64: ( declaration )*
				while ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				// D:\\antlr\\E.g:139:77: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_statement"


	public static class selection_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selection_statement"
	// D:\\antlr\\E.g:142:1: selection_statement : 'if' '(' a1= expression ')' a2= statement ( 'else' a3= statement )? -> ^( GXX_selection_statement $a1 $a2 ( $a3)? ) ;
	public final EParser.selection_statement_return selection_statement() throws RecognitionException {
		EParser.selection_statement_return retval = new EParser.selection_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal41=null;
		Token char_literal42=null;
		Token char_literal43=null;
		Token string_literal44=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;
		ParserRuleReturnScope a3 =null;

		CommonTree string_literal41_tree=null;
		CommonTree char_literal42_tree=null;
		CommonTree char_literal43_tree=null;
		CommonTree string_literal44_tree=null;
		RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// D:\\antlr\\E.g:142:21: ( 'if' '(' a1= expression ')' a2= statement ( 'else' a3= statement )? -> ^( GXX_selection_statement $a1 $a2 ( $a3)? ) )
			// D:\\antlr\\E.g:143:2: 'if' '(' a1= expression ')' a2= statement ( 'else' a3= statement )?
			{
			string_literal41=(Token)match(input,107,FOLLOW_107_in_selection_statement1126); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_107.add(string_literal41);

			char_literal42=(Token)match(input,72,FOLLOW_72_in_selection_statement1128); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_72.add(char_literal42);

			pushFollow(FOLLOW_expression_in_selection_statement1132);
			a1=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(a1.getTree());
			char_literal43=(Token)match(input,73,FOLLOW_73_in_selection_statement1134); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_73.add(char_literal43);

			pushFollow(FOLLOW_statement_in_selection_statement1138);
			a2=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statement.add(a2.getTree());
			// D:\\antlr\\E.g:143:42: ( 'else' a3= statement )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==105) ) {
				int LA21_1 = input.LA(2);
				if ( (synpred29_E()) ) {
					alt21=1;
				}
			}
			switch (alt21) {
				case 1 :
					// D:\\antlr\\E.g:143:43: 'else' a3= statement
					{
					string_literal44=(Token)match(input,105,FOLLOW_105_in_selection_statement1141); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_105.add(string_literal44);

					pushFollow(FOLLOW_statement_in_selection_statement1145);
					a3=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(a3.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: a2, a1, a3
			// token labels: 
			// rule labels: retval, a1, a2, a3
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
			RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.getTree():null);
			RewriteRuleSubtreeStream stream_a3=new RewriteRuleSubtreeStream(adaptor,"rule a3",a3!=null?a3.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 143:66: -> ^( GXX_selection_statement $a1 $a2 ( $a3)? )
			{
				// D:\\antlr\\E.g:143:70: ^( GXX_selection_statement $a1 $a2 ( $a3)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_selection_statement, "GXX_selection_statement"), root_1);
				adaptor.addChild(root_1, stream_a1.nextTree());
				adaptor.addChild(root_1, stream_a2.nextTree());
				// D:\\antlr\\E.g:143:105: ( $a3)?
				if ( stream_a3.hasNext() ) {
					adaptor.addChild(root_1, stream_a3.nextTree());
				}
				stream_a3.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selection_statement"


	public static class iteration_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "iteration_statement"
	// D:\\antlr\\E.g:146:1: iteration_statement : ( 'while' '(' a1= expression ')' a2= statement -> ^( GXX_iteration_statement 'while' $a1 $a2) | 'for' '(' (e1= expression )? ';' (e2= expression )? ';' (e3= expression )? ')' a1= statement -> ^( GXX_iteration_statement 'for' ( ONE $e1)? ( TWO $e2)? ( THREE $e3)? $a1) );
	public final EParser.iteration_statement_return iteration_statement() throws RecognitionException {
		EParser.iteration_statement_return retval = new EParser.iteration_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal45=null;
		Token char_literal46=null;
		Token char_literal47=null;
		Token string_literal48=null;
		Token char_literal49=null;
		Token char_literal50=null;
		Token char_literal51=null;
		Token char_literal52=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope e3 =null;

		CommonTree string_literal45_tree=null;
		CommonTree char_literal46_tree=null;
		CommonTree char_literal47_tree=null;
		CommonTree string_literal48_tree=null;
		CommonTree char_literal49_tree=null;
		CommonTree char_literal50_tree=null;
		CommonTree char_literal51_tree=null;
		CommonTree char_literal52_tree=null;
		RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
		RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// D:\\antlr\\E.g:146:21: ( 'while' '(' a1= expression ')' a2= statement -> ^( GXX_iteration_statement 'while' $a1 $a2) | 'for' '(' (e1= expression )? ';' (e2= expression )? ';' (e3= expression )? ')' a1= statement -> ^( GXX_iteration_statement 'for' ( ONE $e1)? ( TWO $e2)? ( THREE $e3)? $a1) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==114) ) {
				alt25=1;
			}
			else if ( (LA25_0==106) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// D:\\antlr\\E.g:147:2: 'while' '(' a1= expression ')' a2= statement
					{
					string_literal45=(Token)match(input,114,FOLLOW_114_in_iteration_statement1183); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_114.add(string_literal45);

					char_literal46=(Token)match(input,72,FOLLOW_72_in_iteration_statement1185); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal46);

					pushFollow(FOLLOW_expression_in_iteration_statement1189);
					a1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(a1.getTree());
					char_literal47=(Token)match(input,73,FOLLOW_73_in_iteration_statement1191); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal47);

					pushFollow(FOLLOW_statement_in_iteration_statement1195);
					a2=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(a2.getTree());
					// AST REWRITE
					// elements: a1, a2, 114
					// token labels: 
					// rule labels: retval, a1, a2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
					RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 147:46: -> ^( GXX_iteration_statement 'while' $a1 $a2)
					{
						// D:\\antlr\\E.g:147:50: ^( GXX_iteration_statement 'while' $a1 $a2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_iteration_statement, "GXX_iteration_statement"), root_1);
						adaptor.addChild(root_1, stream_114.nextNode());
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_1, stream_a2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:148:2: 'for' '(' (e1= expression )? ';' (e2= expression )? ';' (e3= expression )? ')' a1= statement
					{
					string_literal48=(Token)match(input,106,FOLLOW_106_in_iteration_statement1216); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_106.add(string_literal48);

					char_literal49=(Token)match(input,72,FOLLOW_72_in_iteration_statement1218); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal49);

					// D:\\antlr\\E.g:148:15: (e1= expression )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==Character_constant||LA22_0==Dec||(LA22_0 >= Hex && LA22_0 <= ID)||(LA22_0 >= Oct && LA22_0 <= String)||LA22_0==65||LA22_0==70||LA22_0==72||LA22_0==74||(LA22_0 >= 76 && LA22_0 <= 77)||(LA22_0 >= 80 && LA22_0 <= 81)||LA22_0==110||LA22_0==120) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// D:\\antlr\\E.g:148:15: e1= expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement1224);
							e1=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
							}
							break;

					}

					char_literal50=(Token)match(input,87,FOLLOW_87_in_iteration_statement1227); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_87.add(char_literal50);

					// D:\\antlr\\E.g:148:36: (e2= expression )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==Character_constant||LA23_0==Dec||(LA23_0 >= Hex && LA23_0 <= ID)||(LA23_0 >= Oct && LA23_0 <= String)||LA23_0==65||LA23_0==70||LA23_0==72||LA23_0==74||(LA23_0 >= 76 && LA23_0 <= 77)||(LA23_0 >= 80 && LA23_0 <= 81)||LA23_0==110||LA23_0==120) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// D:\\antlr\\E.g:148:36: e2= expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement1233);
							e2=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(e2.getTree());
							}
							break;

					}

					char_literal51=(Token)match(input,87,FOLLOW_87_in_iteration_statement1236); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_87.add(char_literal51);

					// D:\\antlr\\E.g:148:57: (e3= expression )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==Character_constant||LA24_0==Dec||(LA24_0 >= Hex && LA24_0 <= ID)||(LA24_0 >= Oct && LA24_0 <= String)||LA24_0==65||LA24_0==70||LA24_0==72||LA24_0==74||(LA24_0 >= 76 && LA24_0 <= 77)||(LA24_0 >= 80 && LA24_0 <= 81)||LA24_0==110||LA24_0==120) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// D:\\antlr\\E.g:148:57: e3= expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement1242);
							e3=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(e3.getTree());
							}
							break;

					}

					char_literal52=(Token)match(input,73,FOLLOW_73_in_iteration_statement1245); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal52);

					pushFollow(FOLLOW_statement_in_iteration_statement1249);
					a1=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(a1.getTree());
					// AST REWRITE
					// elements: e1, e3, e2, a1, 106
					// token labels: 
					// rule labels: e3, retval, e1, e2, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
					RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 148:89: -> ^( GXX_iteration_statement 'for' ( ONE $e1)? ( TWO $e2)? ( THREE $e3)? $a1)
					{
						// D:\\antlr\\E.g:148:93: ^( GXX_iteration_statement 'for' ( ONE $e1)? ( TWO $e2)? ( THREE $e3)? $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_iteration_statement, "GXX_iteration_statement"), root_1);
						adaptor.addChild(root_1, stream_106.nextNode());
						// D:\\antlr\\E.g:148:125: ( ONE $e1)?
						if ( stream_e1.hasNext() ) {
							adaptor.addChild(root_1, (CommonTree)adaptor.create(ONE, "ONE"));
							adaptor.addChild(root_1, stream_e1.nextTree());
						}
						stream_e1.reset();

						// D:\\antlr\\E.g:148:136: ( TWO $e2)?
						if ( stream_e2.hasNext() ) {
							adaptor.addChild(root_1, (CommonTree)adaptor.create(TWO, "TWO"));
							adaptor.addChild(root_1, stream_e2.nextTree());
						}
						stream_e2.reset();

						// D:\\antlr\\E.g:148:147: ( THREE $e3)?
						if ( stream_e3.hasNext() ) {
							adaptor.addChild(root_1, (CommonTree)adaptor.create(THREE, "THREE"));
							adaptor.addChild(root_1, stream_e3.nextTree());
						}
						stream_e3.reset();

						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "iteration_statement"


	public static class jump_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "jump_statement"
	// D:\\antlr\\E.g:151:1: jump_statement : ( 'continue' ';' -> ^( GXX_jump_statement 'continue' ) | 'break' ';' -> ^( GXX_jump_statement 'break' ) | 'return' (a1= expression )? ';' -> ^( GXX_jump_statement 'return' ( $a1)? ) );
	public final EParser.jump_statement_return jump_statement() throws RecognitionException {
		EParser.jump_statement_return retval = new EParser.jump_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal53=null;
		Token char_literal54=null;
		Token string_literal55=null;
		Token char_literal56=null;
		Token string_literal57=null;
		Token char_literal58=null;
		ParserRuleReturnScope a1 =null;

		CommonTree string_literal53_tree=null;
		CommonTree char_literal54_tree=null;
		CommonTree string_literal55_tree=null;
		CommonTree char_literal56_tree=null;
		CommonTree string_literal57_tree=null;
		CommonTree char_literal58_tree=null;
		RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\antlr\\E.g:151:16: ( 'continue' ';' -> ^( GXX_jump_statement 'continue' ) | 'break' ';' -> ^( GXX_jump_statement 'break' ) | 'return' (a1= expression )? ';' -> ^( GXX_jump_statement 'return' ( $a1)? ) )
			int alt27=3;
			switch ( input.LA(1) ) {
			case 104:
				{
				alt27=1;
				}
				break;
			case 102:
				{
				alt27=2;
				}
				break;
			case 109:
				{
				alt27=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// D:\\antlr\\E.g:152:2: 'continue' ';'
					{
					string_literal53=(Token)match(input,104,FOLLOW_104_in_jump_statement1303); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_104.add(string_literal53);

					char_literal54=(Token)match(input,87,FOLLOW_87_in_jump_statement1305); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_87.add(char_literal54);

					// AST REWRITE
					// elements: 104
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 152:18: -> ^( GXX_jump_statement 'continue' )
					{
						// D:\\antlr\\E.g:152:22: ^( GXX_jump_statement 'continue' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_jump_statement, "GXX_jump_statement"), root_1);
						adaptor.addChild(root_1, stream_104.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:153:2: 'break' ';'
					{
					string_literal55=(Token)match(input,102,FOLLOW_102_in_jump_statement1321); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_102.add(string_literal55);

					char_literal56=(Token)match(input,87,FOLLOW_87_in_jump_statement1323); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_87.add(char_literal56);

					// AST REWRITE
					// elements: 102
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 153:15: -> ^( GXX_jump_statement 'break' )
					{
						// D:\\antlr\\E.g:153:19: ^( GXX_jump_statement 'break' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_jump_statement, "GXX_jump_statement"), root_1);
						adaptor.addChild(root_1, stream_102.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\antlr\\E.g:154:2: 'return' (a1= expression )? ';'
					{
					string_literal57=(Token)match(input,109,FOLLOW_109_in_jump_statement1339); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_109.add(string_literal57);

					// D:\\antlr\\E.g:154:13: (a1= expression )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==Character_constant||LA26_0==Dec||(LA26_0 >= Hex && LA26_0 <= ID)||(LA26_0 >= Oct && LA26_0 <= String)||LA26_0==65||LA26_0==70||LA26_0==72||LA26_0==74||(LA26_0 >= 76 && LA26_0 <= 77)||(LA26_0 >= 80 && LA26_0 <= 81)||LA26_0==110||LA26_0==120) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// D:\\antlr\\E.g:154:13: a1= expression
							{
							pushFollow(FOLLOW_expression_in_jump_statement1343);
							a1=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(a1.getTree());
							}
							break;

					}

					char_literal58=(Token)match(input,87,FOLLOW_87_in_jump_statement1346); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_87.add(char_literal58);

					// AST REWRITE
					// elements: 109, a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 154:31: -> ^( GXX_jump_statement 'return' ( $a1)? )
					{
						// D:\\antlr\\E.g:154:35: ^( GXX_jump_statement 'return' ( $a1)? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_jump_statement, "GXX_jump_statement"), root_1);
						adaptor.addChild(root_1, stream_109.nextNode());
						// D:\\antlr\\E.g:154:66: ( $a1)?
						if ( stream_a1.hasNext() ) {
							adaptor.addChild(root_1, stream_a1.nextTree());
						}
						stream_a1.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "jump_statement"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\antlr\\E.g:157:1: expression : assignment_expression ( ',' assignment_expression )* -> ^( GXX_expression ( assignment_expression )+ ) ;
	public final EParser.expression_return expression() throws RecognitionException {
		EParser.expression_return retval = new EParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal60=null;
		ParserRuleReturnScope assignment_expression59 =null;
		ParserRuleReturnScope assignment_expression61 =null;

		CommonTree char_literal60_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");

		try {
			// D:\\antlr\\E.g:157:12: ( assignment_expression ( ',' assignment_expression )* -> ^( GXX_expression ( assignment_expression )+ ) )
			// D:\\antlr\\E.g:158:2: assignment_expression ( ',' assignment_expression )*
			{
			pushFollow(FOLLOW_assignment_expression_in_expression1377);
			assignment_expression59=assignment_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression59.getTree());
			// D:\\antlr\\E.g:158:24: ( ',' assignment_expression )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==79) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// D:\\antlr\\E.g:158:25: ',' assignment_expression
					{
					char_literal60=(Token)match(input,79,FOLLOW_79_in_expression1380); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal60);

					pushFollow(FOLLOW_assignment_expression_in_expression1382);
					assignment_expression61=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression61.getTree());
					}
					break;

				default :
					break loop28;
				}
			}

			// AST REWRITE
			// elements: assignment_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 158:54: -> ^( GXX_expression ( assignment_expression )+ )
			{
				// D:\\antlr\\E.g:158:58: ^( GXX_expression ( assignment_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_expression, "GXX_expression"), root_1);
				if ( !(stream_assignment_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_assignment_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_assignment_expression.nextTree());
				}
				stream_assignment_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class assignment_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment_expression"
	// D:\\antlr\\E.g:161:1: assignment_expression : (a1= unary_expression a2= assignment_operator a3= assignment_expression -> ^( GXX_assignment_expression $a1 $a2 $a3) |a1= logical_or_expression -> ^( GXX_assignment_expression $a1) );
	public final EParser.assignment_expression_return assignment_expression() throws RecognitionException {
		EParser.assignment_expression_return retval = new EParser.assignment_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;
		ParserRuleReturnScope a3 =null;

		RewriteRuleSubtreeStream stream_assignment_operator=new RewriteRuleSubtreeStream(adaptor,"rule assignment_operator");
		RewriteRuleSubtreeStream stream_logical_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expression");
		RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
		RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");

		try {
			// D:\\antlr\\E.g:161:23: (a1= unary_expression a2= assignment_operator a3= assignment_expression -> ^( GXX_assignment_expression $a1 $a2 $a3) |a1= logical_or_expression -> ^( GXX_assignment_expression $a1) )
			int alt29=2;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA29_1 = input.LA(2);
				if ( (synpred38_E()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case Dec:
				{
				int LA29_2 = input.LA(2);
				if ( (synpred38_E()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case Oct:
				{
				int LA29_3 = input.LA(2);
				if ( (synpred38_E()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case Hex:
				{
				int LA29_4 = input.LA(2);
				if ( (synpred38_E()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case Character_constant:
				{
				int LA29_5 = input.LA(2);
				if ( (synpred38_E()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case String:
				{
				int LA29_6 = input.LA(2);
				if ( (synpred38_E()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case 72:
				{
				int LA29_7 = input.LA(2);
				if ( (synpred38_E()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case 77:
				{
				int LA29_8 = input.LA(2);
				if ( (synpred38_E()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case 81:
				{
				int LA29_9 = input.LA(2);
				if ( (synpred38_E()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case 65:
			case 70:
			case 74:
			case 76:
			case 80:
			case 120:
				{
				int LA29_10 = input.LA(2);
				if ( (synpred38_E()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case 110:
				{
				int LA29_11 = input.LA(2);
				if ( (synpred38_E()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// D:\\antlr\\E.g:162:2: a1= unary_expression a2= assignment_operator a3= assignment_expression
					{
					pushFollow(FOLLOW_unary_expression_in_assignment_expression1414);
					a1=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(a1.getTree());
					pushFollow(FOLLOW_assignment_operator_in_assignment_expression1418);
					a2=assignment_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_operator.add(a2.getTree());
					pushFollow(FOLLOW_assignment_expression_in_assignment_expression1422);
					a3=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_expression.add(a3.getTree());
					// AST REWRITE
					// elements: a3, a2, a1
					// token labels: 
					// rule labels: retval, a1, a2, a3
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
					RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.getTree():null);
					RewriteRuleSubtreeStream stream_a3=new RewriteRuleSubtreeStream(adaptor,"rule a3",a3!=null?a3.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 162:71: -> ^( GXX_assignment_expression $a1 $a2 $a3)
					{
						// D:\\antlr\\E.g:162:75: ^( GXX_assignment_expression $a1 $a2 $a3)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_assignment_expression, "GXX_assignment_expression"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_1, stream_a2.nextTree());
						adaptor.addChild(root_1, stream_a3.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:163:2: a1= logical_or_expression
					{
					pushFollow(FOLLOW_logical_or_expression_in_assignment_expression1447);
					a1=logical_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logical_or_expression.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 163:28: -> ^( GXX_assignment_expression $a1)
					{
						// D:\\antlr\\E.g:163:32: ^( GXX_assignment_expression $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_assignment_expression, "GXX_assignment_expression"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_expression"


	public static class assignment_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment_operator"
	// D:\\antlr\\E.g:166:1: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
	public final EParser.assignment_operator_return assignment_operator() throws RecognitionException {
		EParser.assignment_operator_return retval = new EParser.assignment_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set62=null;

		CommonTree set62_tree=null;

		try {
			// D:\\antlr\\E.g:166:21: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
			// D:\\antlr\\E.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set62=input.LT(1);
			if ( input.LA(1)==68||input.LA(1)==71||input.LA(1)==75||input.LA(1)==78||input.LA(1)==82||input.LA(1)==86||input.LA(1)==90||input.LA(1)==92||input.LA(1)==97||input.LA(1)==101||input.LA(1)==117 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set62));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_operator"


	public static class constant_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constant_expression"
	// D:\\antlr\\E.g:180:1: constant_expression : a1= logical_or_expression -> ^( GXX_constant_expression $a1) ;
	public final EParser.constant_expression_return constant_expression() throws RecognitionException {
		EParser.constant_expression_return retval = new EParser.constant_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope a1 =null;

		RewriteRuleSubtreeStream stream_logical_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expression");

		try {
			// D:\\antlr\\E.g:180:21: (a1= logical_or_expression -> ^( GXX_constant_expression $a1) )
			// D:\\antlr\\E.g:181:2: a1= logical_or_expression
			{
			pushFollow(FOLLOW_logical_or_expression_in_constant_expression1555);
			a1=logical_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logical_or_expression.add(a1.getTree());
			// AST REWRITE
			// elements: a1
			// token labels: 
			// rule labels: retval, a1
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 181:28: -> ^( GXX_constant_expression $a1)
			{
				// D:\\antlr\\E.g:181:32: ^( GXX_constant_expression $a1)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_constant_expression, "GXX_constant_expression"), root_1);
				adaptor.addChild(root_1, stream_a1.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant_expression"


	public static class logical_or_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logical_or_expression"
	// D:\\antlr\\E.g:184:1: logical_or_expression : logical_and_expression ( '||' logical_and_expression )* -> ^( GXX_logical_or_expression ( logical_and_expression )+ ) ;
	public final EParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
		EParser.logical_or_expression_return retval = new EParser.logical_or_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal64=null;
		ParserRuleReturnScope logical_and_expression63 =null;
		ParserRuleReturnScope logical_and_expression65 =null;

		CommonTree string_literal64_tree=null;
		RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
		RewriteRuleSubtreeStream stream_logical_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_and_expression");

		try {
			// D:\\antlr\\E.g:184:23: ( logical_and_expression ( '||' logical_and_expression )* -> ^( GXX_logical_or_expression ( logical_and_expression )+ ) )
			// D:\\antlr\\E.g:185:2: logical_and_expression ( '||' logical_and_expression )*
			{
			pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1584);
			logical_and_expression63=logical_and_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logical_and_expression.add(logical_and_expression63.getTree());
			// D:\\antlr\\E.g:185:25: ( '||' logical_and_expression )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==118) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// D:\\antlr\\E.g:185:26: '||' logical_and_expression
					{
					string_literal64=(Token)match(input,118,FOLLOW_118_in_logical_or_expression1587); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_118.add(string_literal64);

					pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1589);
					logical_and_expression65=logical_and_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logical_and_expression.add(logical_and_expression65.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			// AST REWRITE
			// elements: logical_and_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 185:57: -> ^( GXX_logical_or_expression ( logical_and_expression )+ )
			{
				// D:\\antlr\\E.g:185:61: ^( GXX_logical_or_expression ( logical_and_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_logical_or_expression, "GXX_logical_or_expression"), root_1);
				if ( !(stream_logical_and_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_logical_and_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_logical_and_expression.nextTree());
				}
				stream_logical_and_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_or_expression"


	public static class logical_and_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logical_and_expression"
	// D:\\antlr\\E.g:188:1: logical_and_expression : inclusive_or_expression ( '&&' inclusive_or_expression )* -> ^( GXX_logical_and_expression ( inclusive_or_expression )+ ) ;
	public final EParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
		EParser.logical_and_expression_return retval = new EParser.logical_and_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal67=null;
		ParserRuleReturnScope inclusive_or_expression66 =null;
		ParserRuleReturnScope inclusive_or_expression68 =null;

		CommonTree string_literal67_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleSubtreeStream stream_inclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule inclusive_or_expression");

		try {
			// D:\\antlr\\E.g:188:24: ( inclusive_or_expression ( '&&' inclusive_or_expression )* -> ^( GXX_logical_and_expression ( inclusive_or_expression )+ ) )
			// D:\\antlr\\E.g:189:2: inclusive_or_expression ( '&&' inclusive_or_expression )*
			{
			pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1618);
			inclusive_or_expression66=inclusive_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_inclusive_or_expression.add(inclusive_or_expression66.getTree());
			// D:\\antlr\\E.g:189:26: ( '&&' inclusive_or_expression )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==69) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// D:\\antlr\\E.g:189:27: '&&' inclusive_or_expression
					{
					string_literal67=(Token)match(input,69,FOLLOW_69_in_logical_and_expression1621); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_69.add(string_literal67);

					pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1623);
					inclusive_or_expression68=inclusive_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_inclusive_or_expression.add(inclusive_or_expression68.getTree());
					}
					break;

				default :
					break loop31;
				}
			}

			// AST REWRITE
			// elements: inclusive_or_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 189:59: -> ^( GXX_logical_and_expression ( inclusive_or_expression )+ )
			{
				// D:\\antlr\\E.g:189:63: ^( GXX_logical_and_expression ( inclusive_or_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_logical_and_expression, "GXX_logical_and_expression"), root_1);
				if ( !(stream_inclusive_or_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_inclusive_or_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_inclusive_or_expression.nextTree());
				}
				stream_inclusive_or_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_and_expression"


	public static class inclusive_or_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "inclusive_or_expression"
	// D:\\antlr\\E.g:192:1: inclusive_or_expression : exclusive_or_expression ( '|' exclusive_or_expression )* -> ^( GXX_inclusive_or_expression ( exclusive_or_expression )+ ) ;
	public final EParser.inclusive_or_expression_return inclusive_or_expression() throws RecognitionException {
		EParser.inclusive_or_expression_return retval = new EParser.inclusive_or_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal70=null;
		ParserRuleReturnScope exclusive_or_expression69 =null;
		ParserRuleReturnScope exclusive_or_expression71 =null;

		CommonTree char_literal70_tree=null;
		RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
		RewriteRuleSubtreeStream stream_exclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule exclusive_or_expression");

		try {
			// D:\\antlr\\E.g:192:25: ( exclusive_or_expression ( '|' exclusive_or_expression )* -> ^( GXX_inclusive_or_expression ( exclusive_or_expression )+ ) )
			// D:\\antlr\\E.g:193:2: exclusive_or_expression ( '|' exclusive_or_expression )*
			{
			pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1654);
			exclusive_or_expression69=exclusive_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exclusive_or_expression.add(exclusive_or_expression69.getTree());
			// D:\\antlr\\E.g:193:26: ( '|' exclusive_or_expression )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==116) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\antlr\\E.g:193:27: '|' exclusive_or_expression
					{
					char_literal70=(Token)match(input,116,FOLLOW_116_in_inclusive_or_expression1657); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_116.add(char_literal70);

					pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1659);
					exclusive_or_expression71=exclusive_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exclusive_or_expression.add(exclusive_or_expression71.getTree());
					}
					break;

				default :
					break loop32;
				}
			}

			// AST REWRITE
			// elements: exclusive_or_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 193:58: -> ^( GXX_inclusive_or_expression ( exclusive_or_expression )+ )
			{
				// D:\\antlr\\E.g:193:62: ^( GXX_inclusive_or_expression ( exclusive_or_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_inclusive_or_expression, "GXX_inclusive_or_expression"), root_1);
				if ( !(stream_exclusive_or_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_exclusive_or_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_exclusive_or_expression.nextTree());
				}
				stream_exclusive_or_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inclusive_or_expression"


	public static class exclusive_or_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exclusive_or_expression"
	// D:\\antlr\\E.g:196:1: exclusive_or_expression : and_expression ( '^' and_expression )* -> ^( GXX_exclusive_or_expression ( and_expression )+ ) ;
	public final EParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
		EParser.exclusive_or_expression_return retval = new EParser.exclusive_or_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal73=null;
		ParserRuleReturnScope and_expression72 =null;
		ParserRuleReturnScope and_expression74 =null;

		CommonTree char_literal73_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleSubtreeStream stream_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule and_expression");

		try {
			// D:\\antlr\\E.g:196:25: ( and_expression ( '^' and_expression )* -> ^( GXX_exclusive_or_expression ( and_expression )+ ) )
			// D:\\antlr\\E.g:197:2: and_expression ( '^' and_expression )*
			{
			pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1690);
			and_expression72=and_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_and_expression.add(and_expression72.getTree());
			// D:\\antlr\\E.g:197:17: ( '^' and_expression )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==100) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\antlr\\E.g:197:18: '^' and_expression
					{
					char_literal73=(Token)match(input,100,FOLLOW_100_in_exclusive_or_expression1693); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_100.add(char_literal73);

					pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1695);
					and_expression74=and_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_and_expression.add(and_expression74.getTree());
					}
					break;

				default :
					break loop33;
				}
			}

			// AST REWRITE
			// elements: and_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 197:40: -> ^( GXX_exclusive_or_expression ( and_expression )+ )
			{
				// D:\\antlr\\E.g:197:44: ^( GXX_exclusive_or_expression ( and_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_exclusive_or_expression, "GXX_exclusive_or_expression"), root_1);
				if ( !(stream_and_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_and_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_and_expression.nextTree());
				}
				stream_and_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exclusive_or_expression"


	public static class and_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "and_expression"
	// D:\\antlr\\E.g:200:1: and_expression : equality_expression ( '&' equality_expression )* -> ^( GXX_and_expression ( equality_expression )+ ) ;
	public final EParser.and_expression_return and_expression() throws RecognitionException {
		EParser.and_expression_return retval = new EParser.and_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal76=null;
		ParserRuleReturnScope equality_expression75 =null;
		ParserRuleReturnScope equality_expression77 =null;

		CommonTree char_literal76_tree=null;
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleSubtreeStream stream_equality_expression=new RewriteRuleSubtreeStream(adaptor,"rule equality_expression");

		try {
			// D:\\antlr\\E.g:200:16: ( equality_expression ( '&' equality_expression )* -> ^( GXX_and_expression ( equality_expression )+ ) )
			// D:\\antlr\\E.g:201:2: equality_expression ( '&' equality_expression )*
			{
			pushFollow(FOLLOW_equality_expression_in_and_expression1726);
			equality_expression75=equality_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_equality_expression.add(equality_expression75.getTree());
			// D:\\antlr\\E.g:201:22: ( '&' equality_expression )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==70) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// D:\\antlr\\E.g:201:23: '&' equality_expression
					{
					char_literal76=(Token)match(input,70,FOLLOW_70_in_and_expression1729); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_70.add(char_literal76);

					pushFollow(FOLLOW_equality_expression_in_and_expression1731);
					equality_expression77=equality_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_equality_expression.add(equality_expression77.getTree());
					}
					break;

				default :
					break loop34;
				}
			}

			// AST REWRITE
			// elements: equality_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 201:50: -> ^( GXX_and_expression ( equality_expression )+ )
			{
				// D:\\antlr\\E.g:201:54: ^( GXX_and_expression ( equality_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_and_expression, "GXX_and_expression"), root_1);
				if ( !(stream_equality_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_equality_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_equality_expression.nextTree());
				}
				stream_equality_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "and_expression"


	public static class equality_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equality_expression"
	// D:\\antlr\\E.g:204:1: equality_expression : relational_expression ( equality_operator relational_expression )* -> ^( GXX_equality_expression relational_expression ( equality_operator relational_expression )* ) ;
	public final EParser.equality_expression_return equality_expression() throws RecognitionException {
		EParser.equality_expression_return retval = new EParser.equality_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope relational_expression78 =null;
		ParserRuleReturnScope equality_operator79 =null;
		ParserRuleReturnScope relational_expression80 =null;

		RewriteRuleSubtreeStream stream_equality_operator=new RewriteRuleSubtreeStream(adaptor,"rule equality_operator");
		RewriteRuleSubtreeStream stream_relational_expression=new RewriteRuleSubtreeStream(adaptor,"rule relational_expression");

		try {
			// D:\\antlr\\E.g:204:21: ( relational_expression ( equality_operator relational_expression )* -> ^( GXX_equality_expression relational_expression ( equality_operator relational_expression )* ) )
			// D:\\antlr\\E.g:205:2: relational_expression ( equality_operator relational_expression )*
			{
			pushFollow(FOLLOW_relational_expression_in_equality_expression1762);
			relational_expression78=relational_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_relational_expression.add(relational_expression78.getTree());
			// D:\\antlr\\E.g:205:24: ( equality_operator relational_expression )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==66||LA35_0==93) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\antlr\\E.g:205:25: equality_operator relational_expression
					{
					pushFollow(FOLLOW_equality_operator_in_equality_expression1765);
					equality_operator79=equality_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_equality_operator.add(equality_operator79.getTree());
					pushFollow(FOLLOW_relational_expression_in_equality_expression1767);
					relational_expression80=relational_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_relational_expression.add(relational_expression80.getTree());
					}
					break;

				default :
					break loop35;
				}
			}

			// AST REWRITE
			// elements: relational_expression, relational_expression, equality_operator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 205:68: -> ^( GXX_equality_expression relational_expression ( equality_operator relational_expression )* )
			{
				// D:\\antlr\\E.g:205:72: ^( GXX_equality_expression relational_expression ( equality_operator relational_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_equality_expression, "GXX_equality_expression"), root_1);
				adaptor.addChild(root_1, stream_relational_expression.nextTree());
				// D:\\antlr\\E.g:205:120: ( equality_operator relational_expression )*
				while ( stream_relational_expression.hasNext()||stream_equality_operator.hasNext() ) {
					adaptor.addChild(root_1, stream_equality_operator.nextTree());
					adaptor.addChild(root_1, stream_relational_expression.nextTree());
				}
				stream_relational_expression.reset();
				stream_equality_operator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equality_expression"


	public static class equality_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equality_operator"
	// D:\\antlr\\E.g:208:1: equality_operator : ( '==' | '!=' );
	public final EParser.equality_operator_return equality_operator() throws RecognitionException {
		EParser.equality_operator_return retval = new EParser.equality_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set81=null;

		CommonTree set81_tree=null;

		try {
			// D:\\antlr\\E.g:208:19: ( '==' | '!=' )
			// D:\\antlr\\E.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set81=input.LT(1);
			if ( input.LA(1)==66||input.LA(1)==93 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set81));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equality_operator"


	public static class relational_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relational_expression"
	// D:\\antlr\\E.g:213:1: relational_expression : shift_expression ( relational_operator shift_expression )* -> ^( GXX_relational_expression shift_expression ( relational_operator shift_expression )* ) ;
	public final EParser.relational_expression_return relational_expression() throws RecognitionException {
		EParser.relational_expression_return retval = new EParser.relational_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope shift_expression82 =null;
		ParserRuleReturnScope relational_operator83 =null;
		ParserRuleReturnScope shift_expression84 =null;

		RewriteRuleSubtreeStream stream_shift_expression=new RewriteRuleSubtreeStream(adaptor,"rule shift_expression");
		RewriteRuleSubtreeStream stream_relational_operator=new RewriteRuleSubtreeStream(adaptor,"rule relational_operator");

		try {
			// D:\\antlr\\E.g:213:23: ( shift_expression ( relational_operator shift_expression )* -> ^( GXX_relational_expression shift_expression ( relational_operator shift_expression )* ) )
			// D:\\antlr\\E.g:214:2: shift_expression ( relational_operator shift_expression )*
			{
			pushFollow(FOLLOW_shift_expression_in_relational_expression1825);
			shift_expression82=shift_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_shift_expression.add(shift_expression82.getTree());
			// D:\\antlr\\E.g:214:19: ( relational_operator shift_expression )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==88||LA36_0==91||(LA36_0 >= 94 && LA36_0 <= 95)) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// D:\\antlr\\E.g:214:20: relational_operator shift_expression
					{
					pushFollow(FOLLOW_relational_operator_in_relational_expression1828);
					relational_operator83=relational_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_relational_operator.add(relational_operator83.getTree());
					pushFollow(FOLLOW_shift_expression_in_relational_expression1830);
					shift_expression84=shift_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_shift_expression.add(shift_expression84.getTree());
					}
					break;

				default :
					break loop36;
				}
			}

			// AST REWRITE
			// elements: relational_operator, shift_expression, shift_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 214:60: -> ^( GXX_relational_expression shift_expression ( relational_operator shift_expression )* )
			{
				// D:\\antlr\\E.g:214:64: ^( GXX_relational_expression shift_expression ( relational_operator shift_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_relational_expression, "GXX_relational_expression"), root_1);
				adaptor.addChild(root_1, stream_shift_expression.nextTree());
				// D:\\antlr\\E.g:214:109: ( relational_operator shift_expression )*
				while ( stream_relational_operator.hasNext()||stream_shift_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_relational_operator.nextTree());
					adaptor.addChild(root_1, stream_shift_expression.nextTree());
				}
				stream_relational_operator.reset();
				stream_shift_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relational_expression"


	public static class relational_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relational_operator"
	// D:\\antlr\\E.g:217:1: relational_operator : ( '<' | '>' | '<=' | '>=' );
	public final EParser.relational_operator_return relational_operator() throws RecognitionException {
		EParser.relational_operator_return retval = new EParser.relational_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set85=null;

		CommonTree set85_tree=null;

		try {
			// D:\\antlr\\E.g:217:21: ( '<' | '>' | '<=' | '>=' )
			// D:\\antlr\\E.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set85=input.LT(1);
			if ( input.LA(1)==88||input.LA(1)==91||(input.LA(1) >= 94 && input.LA(1) <= 95) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set85));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relational_operator"


	public static class shift_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "shift_expression"
	// D:\\antlr\\E.g:224:1: shift_expression : additive_expression ( shift_operator additive_expression )* -> ^( GXX_shift_expression additive_expression ( shift_operator additive_expression )* ) ;
	public final EParser.shift_expression_return shift_expression() throws RecognitionException {
		EParser.shift_expression_return retval = new EParser.shift_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope additive_expression86 =null;
		ParserRuleReturnScope shift_operator87 =null;
		ParserRuleReturnScope additive_expression88 =null;

		RewriteRuleSubtreeStream stream_additive_expression=new RewriteRuleSubtreeStream(adaptor,"rule additive_expression");
		RewriteRuleSubtreeStream stream_shift_operator=new RewriteRuleSubtreeStream(adaptor,"rule shift_operator");

		try {
			// D:\\antlr\\E.g:224:18: ( additive_expression ( shift_operator additive_expression )* -> ^( GXX_shift_expression additive_expression ( shift_operator additive_expression )* ) )
			// D:\\antlr\\E.g:225:2: additive_expression ( shift_operator additive_expression )*
			{
			pushFollow(FOLLOW_additive_expression_in_shift_expression1899);
			additive_expression86=additive_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_additive_expression.add(additive_expression86.getTree());
			// D:\\antlr\\E.g:225:22: ( shift_operator additive_expression )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==89||LA37_0==96) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// D:\\antlr\\E.g:225:23: shift_operator additive_expression
					{
					pushFollow(FOLLOW_shift_operator_in_shift_expression1902);
					shift_operator87=shift_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_shift_operator.add(shift_operator87.getTree());
					pushFollow(FOLLOW_additive_expression_in_shift_expression1904);
					additive_expression88=additive_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_additive_expression.add(additive_expression88.getTree());
					}
					break;

				default :
					break loop37;
				}
			}

			// AST REWRITE
			// elements: shift_operator, additive_expression, additive_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 225:61: -> ^( GXX_shift_expression additive_expression ( shift_operator additive_expression )* )
			{
				// D:\\antlr\\E.g:225:65: ^( GXX_shift_expression additive_expression ( shift_operator additive_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_shift_expression, "GXX_shift_expression"), root_1);
				adaptor.addChild(root_1, stream_additive_expression.nextTree());
				// D:\\antlr\\E.g:225:108: ( shift_operator additive_expression )*
				while ( stream_shift_operator.hasNext()||stream_additive_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_shift_operator.nextTree());
					adaptor.addChild(root_1, stream_additive_expression.nextTree());
				}
				stream_shift_operator.reset();
				stream_additive_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "shift_expression"


	public static class shift_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "shift_operator"
	// D:\\antlr\\E.g:228:1: shift_operator : ( '<<' | '>>' );
	public final EParser.shift_operator_return shift_operator() throws RecognitionException {
		EParser.shift_operator_return retval = new EParser.shift_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set89=null;

		CommonTree set89_tree=null;

		try {
			// D:\\antlr\\E.g:228:16: ( '<<' | '>>' )
			// D:\\antlr\\E.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set89=input.LT(1);
			if ( input.LA(1)==89||input.LA(1)==96 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set89));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "shift_operator"


	public static class additive_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additive_expression"
	// D:\\antlr\\E.g:233:1: additive_expression : multiplicative_expression ( additive_operator multiplicative_expression )* -> ^( GXX_additive_expression multiplicative_expression ( additive_operator multiplicative_expression )* ) ;
	public final EParser.additive_expression_return additive_expression() throws RecognitionException {
		EParser.additive_expression_return retval = new EParser.additive_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope multiplicative_expression90 =null;
		ParserRuleReturnScope additive_operator91 =null;
		ParserRuleReturnScope multiplicative_expression92 =null;

		RewriteRuleSubtreeStream stream_additive_operator=new RewriteRuleSubtreeStream(adaptor,"rule additive_operator");
		RewriteRuleSubtreeStream stream_multiplicative_expression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicative_expression");

		try {
			// D:\\antlr\\E.g:233:21: ( multiplicative_expression ( additive_operator multiplicative_expression )* -> ^( GXX_additive_expression multiplicative_expression ( additive_operator multiplicative_expression )* ) )
			// D:\\antlr\\E.g:234:2: multiplicative_expression ( additive_operator multiplicative_expression )*
			{
			pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1963);
			multiplicative_expression90=multiplicative_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_multiplicative_expression.add(multiplicative_expression90.getTree());
			// D:\\antlr\\E.g:234:28: ( additive_operator multiplicative_expression )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==76||LA38_0==80) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// D:\\antlr\\E.g:234:29: additive_operator multiplicative_expression
					{
					pushFollow(FOLLOW_additive_operator_in_additive_expression1966);
					additive_operator91=additive_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_additive_operator.add(additive_operator91.getTree());
					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1968);
					multiplicative_expression92=multiplicative_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiplicative_expression.add(multiplicative_expression92.getTree());
					}
					break;

				default :
					break loop38;
				}
			}

			// AST REWRITE
			// elements: multiplicative_expression, additive_operator, multiplicative_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 234:76: -> ^( GXX_additive_expression multiplicative_expression ( additive_operator multiplicative_expression )* )
			{
				// D:\\antlr\\E.g:234:80: ^( GXX_additive_expression multiplicative_expression ( additive_operator multiplicative_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_additive_expression, "GXX_additive_expression"), root_1);
				adaptor.addChild(root_1, stream_multiplicative_expression.nextTree());
				// D:\\antlr\\E.g:234:132: ( additive_operator multiplicative_expression )*
				while ( stream_additive_operator.hasNext()||stream_multiplicative_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_additive_operator.nextTree());
					adaptor.addChild(root_1, stream_multiplicative_expression.nextTree());
				}
				stream_additive_operator.reset();
				stream_multiplicative_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive_expression"


	public static class additive_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additive_operator"
	// D:\\antlr\\E.g:237:1: additive_operator : ( '+' | '-' );
	public final EParser.additive_operator_return additive_operator() throws RecognitionException {
		EParser.additive_operator_return retval = new EParser.additive_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set93=null;

		CommonTree set93_tree=null;

		try {
			// D:\\antlr\\E.g:237:19: ( '+' | '-' )
			// D:\\antlr\\E.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set93=input.LT(1);
			if ( input.LA(1)==76||input.LA(1)==80 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set93));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive_operator"


	public static class multiplicative_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicative_expression"
	// D:\\antlr\\E.g:242:1: multiplicative_expression : cast_expression ( multiplicative_operator cast_expression )* -> ^( GXX_multiplicative_expression cast_expression ( multiplicative_operator cast_expression )* ) ;
	public final EParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
		EParser.multiplicative_expression_return retval = new EParser.multiplicative_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope cast_expression94 =null;
		ParserRuleReturnScope multiplicative_operator95 =null;
		ParserRuleReturnScope cast_expression96 =null;

		RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
		RewriteRuleSubtreeStream stream_multiplicative_operator=new RewriteRuleSubtreeStream(adaptor,"rule multiplicative_operator");

		try {
			// D:\\antlr\\E.g:242:27: ( cast_expression ( multiplicative_operator cast_expression )* -> ^( GXX_multiplicative_expression cast_expression ( multiplicative_operator cast_expression )* ) )
			// D:\\antlr\\E.g:243:2: cast_expression ( multiplicative_operator cast_expression )*
			{
			pushFollow(FOLLOW_cast_expression_in_multiplicative_expression2028);
			cast_expression94=cast_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression94.getTree());
			// D:\\antlr\\E.g:243:18: ( multiplicative_operator cast_expression )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==67||LA39_0==74||LA39_0==85) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// D:\\antlr\\E.g:243:19: multiplicative_operator cast_expression
					{
					pushFollow(FOLLOW_multiplicative_operator_in_multiplicative_expression2031);
					multiplicative_operator95=multiplicative_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiplicative_operator.add(multiplicative_operator95.getTree());
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression2033);
					cast_expression96=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression96.getTree());
					}
					break;

				default :
					break loop39;
				}
			}

			// AST REWRITE
			// elements: cast_expression, cast_expression, multiplicative_operator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 243:62: -> ^( GXX_multiplicative_expression cast_expression ( multiplicative_operator cast_expression )* )
			{
				// D:\\antlr\\E.g:243:66: ^( GXX_multiplicative_expression cast_expression ( multiplicative_operator cast_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_multiplicative_expression, "GXX_multiplicative_expression"), root_1);
				adaptor.addChild(root_1, stream_cast_expression.nextTree());
				// D:\\antlr\\E.g:243:114: ( multiplicative_operator cast_expression )*
				while ( stream_cast_expression.hasNext()||stream_multiplicative_operator.hasNext() ) {
					adaptor.addChild(root_1, stream_multiplicative_operator.nextTree());
					adaptor.addChild(root_1, stream_cast_expression.nextTree());
				}
				stream_cast_expression.reset();
				stream_multiplicative_operator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicative_expression"


	public static class multiplicative_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicative_operator"
	// D:\\antlr\\E.g:246:1: multiplicative_operator : ( '*' | '/' | '%' );
	public final EParser.multiplicative_operator_return multiplicative_operator() throws RecognitionException {
		EParser.multiplicative_operator_return retval = new EParser.multiplicative_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set97=null;

		CommonTree set97_tree=null;

		try {
			// D:\\antlr\\E.g:246:25: ( '*' | '/' | '%' )
			// D:\\antlr\\E.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set97=input.LT(1);
			if ( input.LA(1)==67||input.LA(1)==74||input.LA(1)==85 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set97));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicative_operator"


	public static class cast_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cast_expression"
	// D:\\antlr\\E.g:252:1: cast_expression : (a1= unary_expression -> ^( GXX_cast_expression $a1) | '(' a1= typename ')' a2= cast_expression -> ^( GXX_cast_expression $a1 $a2) );
	public final EParser.cast_expression_return cast_expression() throws RecognitionException {
		EParser.cast_expression_return retval = new EParser.cast_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal98=null;
		Token char_literal99=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;

		CommonTree char_literal98_tree=null;
		CommonTree char_literal99_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
		RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");
		RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");

		try {
			// D:\\antlr\\E.g:252:17: (a1= unary_expression -> ^( GXX_cast_expression $a1) | '(' a1= typename ')' a2= cast_expression -> ^( GXX_cast_expression $a1 $a2) )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==Character_constant||LA40_0==Dec||(LA40_0 >= Hex && LA40_0 <= ID)||(LA40_0 >= Oct && LA40_0 <= String)||LA40_0==65||LA40_0==70||LA40_0==74||(LA40_0 >= 76 && LA40_0 <= 77)||(LA40_0 >= 80 && LA40_0 <= 81)||LA40_0==110||LA40_0==120) ) {
				alt40=1;
			}
			else if ( (LA40_0==72) ) {
				int LA40_2 = input.LA(2);
				if ( (LA40_2==Character_constant||LA40_2==Dec||(LA40_2 >= Hex && LA40_2 <= ID)||(LA40_2 >= Oct && LA40_2 <= String)||LA40_2==65||LA40_2==70||LA40_2==72||LA40_2==74||(LA40_2 >= 76 && LA40_2 <= 77)||(LA40_2 >= 80 && LA40_2 <= 81)||LA40_2==110||LA40_2==120) ) {
					alt40=1;
				}
				else if ( (LA40_2==103||LA40_2==108||(LA40_2 >= 111 && LA40_2 <= 113)) ) {
					alt40=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// D:\\antlr\\E.g:253:2: a1= unary_expression
					{
					pushFollow(FOLLOW_unary_expression_in_cast_expression2100);
					a1=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 253:23: -> ^( GXX_cast_expression $a1)
					{
						// D:\\antlr\\E.g:253:27: ^( GXX_cast_expression $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_cast_expression, "GXX_cast_expression"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:254:2: '(' a1= typename ')' a2= cast_expression
					{
					char_literal98=(Token)match(input,72,FOLLOW_72_in_cast_expression2115); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal98);

					pushFollow(FOLLOW_typename_in_cast_expression2119);
					a1=typename();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typename.add(a1.getTree());
					char_literal99=(Token)match(input,73,FOLLOW_73_in_cast_expression2121); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal99);

					pushFollow(FOLLOW_cast_expression_in_cast_expression2125);
					a2=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cast_expression.add(a2.getTree());
					// AST REWRITE
					// elements: a1, a2
					// token labels: 
					// rule labels: retval, a1, a2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
					RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 254:42: -> ^( GXX_cast_expression $a1 $a2)
					{
						// D:\\antlr\\E.g:254:46: ^( GXX_cast_expression $a1 $a2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_cast_expression, "GXX_cast_expression"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_1, stream_a2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cast_expression"


	public static class typename_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typename"
	// D:\\antlr\\E.g:257:1: typename : a1= type_specifier ( '*' )* -> ^( GXX_type_name $a1 ( '*' )* ) ;
	public final EParser.typename_return typename() throws RecognitionException {
		EParser.typename_return retval = new EParser.typename_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal100=null;
		ParserRuleReturnScope a1 =null;

		CommonTree char_literal100_tree=null;
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");

		try {
			// D:\\antlr\\E.g:257:10: (a1= type_specifier ( '*' )* -> ^( GXX_type_name $a1 ( '*' )* ) )
			// D:\\antlr\\E.g:258:2: a1= type_specifier ( '*' )*
			{
			pushFollow(FOLLOW_type_specifier_in_typename2159);
			a1=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(a1.getTree());
			// D:\\antlr\\E.g:258:20: ( '*' )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==74) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// D:\\antlr\\E.g:258:20: '*'
					{
					char_literal100=(Token)match(input,74,FOLLOW_74_in_typename2161); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_74.add(char_literal100);

					}
					break;

				default :
					break loop41;
				}
			}

			// AST REWRITE
			// elements: 74, a1
			// token labels: 
			// rule labels: retval, a1
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 258:26: -> ^( GXX_type_name $a1 ( '*' )* )
			{
				// D:\\antlr\\E.g:258:30: ^( GXX_type_name $a1 ( '*' )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_type_name, "GXX_type_name"), root_1);
				adaptor.addChild(root_1, stream_a1.nextTree());
				// D:\\antlr\\E.g:258:50: ( '*' )*
				while ( stream_74.hasNext() ) {
					adaptor.addChild(root_1, stream_74.nextNode());
				}
				stream_74.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typename"


	public static class unary_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary_expression"
	// D:\\antlr\\E.g:261:1: unary_expression : (a1= postfix_expression -> ^( GXX_unary_expression $a1) | '++' a1= unary_expression -> ^( GXX_unary_expression '++' $a1) | '--' a1= unary_expression -> ^( GXX_unary_expression '--' $a1) |a1= unary_operator a2= cast_expression -> ^( GXX_unary_expression $a1 $a2) | 'sizeof' a1= unary_expression -> ^( GXX_unary_expression ONE $a1) | 'sizeof' '(' a1= typename ')' -> ^( GXX_unary_expression TWO $a1) );
	public final EParser.unary_expression_return unary_expression() throws RecognitionException {
		EParser.unary_expression_return retval = new EParser.unary_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal101=null;
		Token string_literal102=null;
		Token string_literal103=null;
		Token string_literal104=null;
		Token char_literal105=null;
		Token char_literal106=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;

		CommonTree string_literal101_tree=null;
		CommonTree string_literal102_tree=null;
		CommonTree string_literal103_tree=null;
		CommonTree string_literal104_tree=null;
		CommonTree char_literal105_tree=null;
		CommonTree char_literal106_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
		RewriteRuleSubtreeStream stream_postfix_expression=new RewriteRuleSubtreeStream(adaptor,"rule postfix_expression");
		RewriteRuleSubtreeStream stream_unary_operator=new RewriteRuleSubtreeStream(adaptor,"rule unary_operator");
		RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");
		RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");

		try {
			// D:\\antlr\\E.g:261:18: (a1= postfix_expression -> ^( GXX_unary_expression $a1) | '++' a1= unary_expression -> ^( GXX_unary_expression '++' $a1) | '--' a1= unary_expression -> ^( GXX_unary_expression '--' $a1) |a1= unary_operator a2= cast_expression -> ^( GXX_unary_expression $a1 $a2) | 'sizeof' a1= unary_expression -> ^( GXX_unary_expression ONE $a1) | 'sizeof' '(' a1= typename ')' -> ^( GXX_unary_expression TWO $a1) )
			int alt42=6;
			switch ( input.LA(1) ) {
			case Character_constant:
			case Dec:
			case Hex:
			case ID:
			case Oct:
			case String:
			case 72:
				{
				alt42=1;
				}
				break;
			case 77:
				{
				alt42=2;
				}
				break;
			case 81:
				{
				alt42=3;
				}
				break;
			case 65:
			case 70:
			case 74:
			case 76:
			case 80:
			case 120:
				{
				alt42=4;
				}
				break;
			case 110:
				{
				int LA42_5 = input.LA(2);
				if ( (LA42_5==72) ) {
					int LA42_6 = input.LA(3);
					if ( (LA42_6==103||LA42_6==108||(LA42_6 >= 111 && LA42_6 <= 113)) ) {
						alt42=6;
					}
					else if ( (LA42_6==Character_constant||LA42_6==Dec||(LA42_6 >= Hex && LA42_6 <= ID)||(LA42_6 >= Oct && LA42_6 <= String)||LA42_6==65||LA42_6==70||LA42_6==72||LA42_6==74||(LA42_6 >= 76 && LA42_6 <= 77)||(LA42_6 >= 80 && LA42_6 <= 81)||LA42_6==110||LA42_6==120) ) {
						alt42=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 42, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA42_5==Character_constant||LA42_5==Dec||(LA42_5 >= Hex && LA42_5 <= ID)||(LA42_5 >= Oct && LA42_5 <= String)||LA42_5==65||LA42_5==70||LA42_5==74||(LA42_5 >= 76 && LA42_5 <= 77)||(LA42_5 >= 80 && LA42_5 <= 81)||LA42_5==110||LA42_5==120) ) {
					alt42=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// D:\\antlr\\E.g:262:2: a1= postfix_expression
					{
					pushFollow(FOLLOW_postfix_expression_in_unary_expression2195);
					a1=postfix_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfix_expression.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 262:25: -> ^( GXX_unary_expression $a1)
					{
						// D:\\antlr\\E.g:262:29: ^( GXX_unary_expression $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_unary_expression, "GXX_unary_expression"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:263:2: '++' a1= unary_expression
					{
					string_literal101=(Token)match(input,77,FOLLOW_77_in_unary_expression2212); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(string_literal101);

					pushFollow(FOLLOW_unary_expression_in_unary_expression2216);
					a1=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(a1.getTree());
					// AST REWRITE
					// elements: a1, 77
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 263:28: -> ^( GXX_unary_expression '++' $a1)
					{
						// D:\\antlr\\E.g:263:32: ^( GXX_unary_expression '++' $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_unary_expression, "GXX_unary_expression"), root_1);
						adaptor.addChild(root_1, stream_77.nextNode());
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\antlr\\E.g:264:2: '--' a1= unary_expression
					{
					string_literal102=(Token)match(input,81,FOLLOW_81_in_unary_expression2235); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(string_literal102);

					pushFollow(FOLLOW_unary_expression_in_unary_expression2239);
					a1=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(a1.getTree());
					// AST REWRITE
					// elements: a1, 81
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 264:28: -> ^( GXX_unary_expression '--' $a1)
					{
						// D:\\antlr\\E.g:264:32: ^( GXX_unary_expression '--' $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_unary_expression, "GXX_unary_expression"), root_1);
						adaptor.addChild(root_1, stream_81.nextNode());
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\antlr\\E.g:265:2: a1= unary_operator a2= cast_expression
					{
					pushFollow(FOLLOW_unary_operator_in_unary_expression2260);
					a1=unary_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_operator.add(a1.getTree());
					pushFollow(FOLLOW_cast_expression_in_unary_expression2264);
					a2=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cast_expression.add(a2.getTree());
					// AST REWRITE
					// elements: a1, a2
					// token labels: 
					// rule labels: retval, a1, a2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
					RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 265:40: -> ^( GXX_unary_expression $a1 $a2)
					{
						// D:\\antlr\\E.g:265:44: ^( GXX_unary_expression $a1 $a2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_unary_expression, "GXX_unary_expression"), root_1);
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_1, stream_a2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// D:\\antlr\\E.g:266:2: 'sizeof' a1= unary_expression
					{
					string_literal103=(Token)match(input,110,FOLLOW_110_in_unary_expression2284); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_110.add(string_literal103);

					pushFollow(FOLLOW_unary_expression_in_unary_expression2288);
					a1=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 266:32: -> ^( GXX_unary_expression ONE $a1)
					{
						// D:\\antlr\\E.g:266:36: ^( GXX_unary_expression ONE $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_unary_expression, "GXX_unary_expression"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(ONE, "ONE"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// D:\\antlr\\E.g:267:2: 'sizeof' '(' a1= typename ')'
					{
					string_literal104=(Token)match(input,110,FOLLOW_110_in_unary_expression2307); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_110.add(string_literal104);

					char_literal105=(Token)match(input,72,FOLLOW_72_in_unary_expression2309); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal105);

					pushFollow(FOLLOW_typename_in_unary_expression2313);
					a1=typename();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typename.add(a1.getTree());
					char_literal106=(Token)match(input,73,FOLLOW_73_in_unary_expression2315); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal106);

					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 267:32: -> ^( GXX_unary_expression TWO $a1)
					{
						// D:\\antlr\\E.g:267:36: ^( GXX_unary_expression TWO $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_unary_expression, "GXX_unary_expression"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TWO, "TWO"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_expression"


	public static class unary_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary_operator"
	// D:\\antlr\\E.g:270:1: unary_operator : ( '&' | '*' | '+' | '-' | '~' | '!' );
	public final EParser.unary_operator_return unary_operator() throws RecognitionException {
		EParser.unary_operator_return retval = new EParser.unary_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set107=null;

		CommonTree set107_tree=null;

		try {
			// D:\\antlr\\E.g:270:16: ( '&' | '*' | '+' | '-' | '~' | '!' )
			// D:\\antlr\\E.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set107=input.LT(1);
			if ( input.LA(1)==65||input.LA(1)==70||input.LA(1)==74||input.LA(1)==76||input.LA(1)==80||input.LA(1)==120 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set107));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_operator"


	public static class postfix_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "postfix_expression"
	// D:\\antlr\\E.g:279:1: postfix_expression : a1= primary_expression ( postfix )* -> ^( GXX_postfix_expression $a1 ( postfix )* ) ;
	public final EParser.postfix_expression_return postfix_expression() throws RecognitionException {
		EParser.postfix_expression_return retval = new EParser.postfix_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope postfix108 =null;

		RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
		RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");

		try {
			// D:\\antlr\\E.g:279:20: (a1= primary_expression ( postfix )* -> ^( GXX_postfix_expression $a1 ( postfix )* ) )
			// D:\\antlr\\E.g:280:2: a1= primary_expression ( postfix )*
			{
			pushFollow(FOLLOW_primary_expression_in_postfix_expression2389);
			a1=primary_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primary_expression.add(a1.getTree());
			// D:\\antlr\\E.g:280:24: ( postfix )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==72||LA43_0==77||LA43_0==81||(LA43_0 >= 83 && LA43_0 <= 84)||LA43_0==98) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// D:\\antlr\\E.g:280:24: postfix
					{
					pushFollow(FOLLOW_postfix_in_postfix_expression2391);
					postfix108=postfix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfix.add(postfix108.getTree());
					}
					break;

				default :
					break loop43;
				}
			}

			// AST REWRITE
			// elements: postfix, a1
			// token labels: 
			// rule labels: retval, a1
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 280:34: -> ^( GXX_postfix_expression $a1 ( postfix )* )
			{
				// D:\\antlr\\E.g:280:38: ^( GXX_postfix_expression $a1 ( postfix )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_postfix_expression, "GXX_postfix_expression"), root_1);
				adaptor.addChild(root_1, stream_a1.nextTree());
				// D:\\antlr\\E.g:280:67: ( postfix )*
				while ( stream_postfix.hasNext() ) {
					adaptor.addChild(root_1, stream_postfix.nextTree());
				}
				stream_postfix.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "postfix_expression"


	public static class postfix_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "postfix"
	// D:\\antlr\\E.g:283:1: postfix : ( '[' a1= expression ']' -> ^( GXX_postfix ONE $a1) | '(' (a1= arguments )? ')' -> ^( GXX_postfix TWO ( $a1)? ) | '.' a1= identifier -> ^( GXX_postfix THREE $a1) | '->' a1= identifier -> ^( GXX_postfix FOUR $a1) | '++' -> ^( GXX_postfix '++' ) | '--' -> ^( GXX_postfix '--' ) );
	public final EParser.postfix_return postfix() throws RecognitionException {
		EParser.postfix_return retval = new EParser.postfix_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal109=null;
		Token char_literal110=null;
		Token char_literal111=null;
		Token char_literal112=null;
		Token char_literal113=null;
		Token string_literal114=null;
		Token string_literal115=null;
		Token string_literal116=null;
		ParserRuleReturnScope a1 =null;

		CommonTree char_literal109_tree=null;
		CommonTree char_literal110_tree=null;
		CommonTree char_literal111_tree=null;
		CommonTree char_literal112_tree=null;
		CommonTree char_literal113_tree=null;
		CommonTree string_literal114_tree=null;
		CommonTree string_literal115_tree=null;
		CommonTree string_literal116_tree=null;
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// D:\\antlr\\E.g:283:9: ( '[' a1= expression ']' -> ^( GXX_postfix ONE $a1) | '(' (a1= arguments )? ')' -> ^( GXX_postfix TWO ( $a1)? ) | '.' a1= identifier -> ^( GXX_postfix THREE $a1) | '->' a1= identifier -> ^( GXX_postfix FOUR $a1) | '++' -> ^( GXX_postfix '++' ) | '--' -> ^( GXX_postfix '--' ) )
			int alt45=6;
			switch ( input.LA(1) ) {
			case 98:
				{
				alt45=1;
				}
				break;
			case 72:
				{
				alt45=2;
				}
				break;
			case 84:
				{
				alt45=3;
				}
				break;
			case 83:
				{
				alt45=4;
				}
				break;
			case 77:
				{
				alt45=5;
				}
				break;
			case 81:
				{
				alt45=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// D:\\antlr\\E.g:284:2: '[' a1= expression ']'
					{
					char_literal109=(Token)match(input,98,FOLLOW_98_in_postfix2424); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(char_literal109);

					pushFollow(FOLLOW_expression_in_postfix2428);
					a1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(a1.getTree());
					char_literal110=(Token)match(input,99,FOLLOW_99_in_postfix2430); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_99.add(char_literal110);

					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 284:25: -> ^( GXX_postfix ONE $a1)
					{
						// D:\\antlr\\E.g:284:29: ^( GXX_postfix ONE $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_postfix, "GXX_postfix"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(ONE, "ONE"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:285:2: '(' (a1= arguments )? ')'
					{
					char_literal111=(Token)match(input,72,FOLLOW_72_in_postfix2449); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal111);

					// D:\\antlr\\E.g:285:8: (a1= arguments )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==Character_constant||LA44_0==Dec||(LA44_0 >= Hex && LA44_0 <= ID)||(LA44_0 >= Oct && LA44_0 <= String)||LA44_0==65||LA44_0==70||LA44_0==72||LA44_0==74||(LA44_0 >= 76 && LA44_0 <= 77)||(LA44_0 >= 80 && LA44_0 <= 81)||LA44_0==110||LA44_0==120) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// D:\\antlr\\E.g:285:8: a1= arguments
							{
							pushFollow(FOLLOW_arguments_in_postfix2453);
							a1=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arguments.add(a1.getTree());
							}
							break;

					}

					char_literal112=(Token)match(input,73,FOLLOW_73_in_postfix2456); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal112);

					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 285:25: -> ^( GXX_postfix TWO ( $a1)? )
					{
						// D:\\antlr\\E.g:285:29: ^( GXX_postfix TWO ( $a1)? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_postfix, "GXX_postfix"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TWO, "TWO"));
						// D:\\antlr\\E.g:285:48: ( $a1)?
						if ( stream_a1.hasNext() ) {
							adaptor.addChild(root_1, stream_a1.nextTree());
						}
						stream_a1.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\antlr\\E.g:286:2: '.' a1= identifier
					{
					char_literal113=(Token)match(input,84,FOLLOW_84_in_postfix2476); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_84.add(char_literal113);

					pushFollow(FOLLOW_identifier_in_postfix2480);
					a1=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 286:21: -> ^( GXX_postfix THREE $a1)
					{
						// D:\\antlr\\E.g:286:25: ^( GXX_postfix THREE $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_postfix, "GXX_postfix"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(THREE, "THREE"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\antlr\\E.g:287:2: '->' a1= identifier
					{
					string_literal114=(Token)match(input,83,FOLLOW_83_in_postfix2499); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_83.add(string_literal114);

					pushFollow(FOLLOW_identifier_in_postfix2503);
					a1=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 287:22: -> ^( GXX_postfix FOUR $a1)
					{
						// D:\\antlr\\E.g:287:26: ^( GXX_postfix FOUR $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_postfix, "GXX_postfix"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(FOUR, "FOUR"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// D:\\antlr\\E.g:288:2: '++'
					{
					string_literal115=(Token)match(input,77,FOLLOW_77_in_postfix2522); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(string_literal115);

					// AST REWRITE
					// elements: 77
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 288:8: -> ^( GXX_postfix '++' )
					{
						// D:\\antlr\\E.g:288:12: ^( GXX_postfix '++' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_postfix, "GXX_postfix"), root_1);
						adaptor.addChild(root_1, stream_77.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// D:\\antlr\\E.g:289:2: '--'
					{
					string_literal116=(Token)match(input,81,FOLLOW_81_in_postfix2538); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(string_literal116);

					// AST REWRITE
					// elements: 81
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 289:8: -> ^( GXX_postfix '--' )
					{
						// D:\\antlr\\E.g:289:12: ^( GXX_postfix '--' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_postfix, "GXX_postfix"), root_1);
						adaptor.addChild(root_1, stream_81.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "postfix"


	public static class arguments_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arguments"
	// D:\\antlr\\E.g:292:1: arguments : assignment_expression ( ',' assignment_expression )* -> ^( GXX_arguments ( assignment_expression )+ ) ;
	public final EParser.arguments_return arguments() throws RecognitionException {
		EParser.arguments_return retval = new EParser.arguments_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal118=null;
		ParserRuleReturnScope assignment_expression117 =null;
		ParserRuleReturnScope assignment_expression119 =null;

		CommonTree char_literal118_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");

		try {
			// D:\\antlr\\E.g:292:11: ( assignment_expression ( ',' assignment_expression )* -> ^( GXX_arguments ( assignment_expression )+ ) )
			// D:\\antlr\\E.g:293:2: assignment_expression ( ',' assignment_expression )*
			{
			pushFollow(FOLLOW_assignment_expression_in_arguments2565);
			assignment_expression117=assignment_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression117.getTree());
			// D:\\antlr\\E.g:293:24: ( ',' assignment_expression )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==79) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// D:\\antlr\\E.g:293:25: ',' assignment_expression
					{
					char_literal118=(Token)match(input,79,FOLLOW_79_in_arguments2568); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal118);

					pushFollow(FOLLOW_assignment_expression_in_arguments2570);
					assignment_expression119=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression119.getTree());
					}
					break;

				default :
					break loop46;
				}
			}

			// AST REWRITE
			// elements: assignment_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 293:54: -> ^( GXX_arguments ( assignment_expression )+ )
			{
				// D:\\antlr\\E.g:293:58: ^( GXX_arguments ( assignment_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_arguments, "GXX_arguments"), root_1);
				if ( !(stream_assignment_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_assignment_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_assignment_expression.nextTree());
				}
				stream_assignment_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arguments"


	public static class primary_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primary_expression"
	// D:\\antlr\\E.g:296:1: primary_expression : (a1= identifier -> ^( GXX_primary_expression ONE $a1) |a1= constant -> ^( GXX_primary_expression TWO $a1) |a1= string -> ^( GXX_primary_expression THREE $a1) | '(' a1= expression ')' -> ^( GXX_primary_expression FOUR $a1) );
	public final EParser.primary_expression_return primary_expression() throws RecognitionException {
		EParser.primary_expression_return retval = new EParser.primary_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal120=null;
		Token char_literal121=null;
		ParserRuleReturnScope a1 =null;

		CommonTree char_literal120_tree=null;
		CommonTree char_literal121_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_string=new RewriteRuleSubtreeStream(adaptor,"rule string");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// D:\\antlr\\E.g:296:20: (a1= identifier -> ^( GXX_primary_expression ONE $a1) |a1= constant -> ^( GXX_primary_expression TWO $a1) |a1= string -> ^( GXX_primary_expression THREE $a1) | '(' a1= expression ')' -> ^( GXX_primary_expression FOUR $a1) )
			int alt47=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt47=1;
				}
				break;
			case Character_constant:
			case Dec:
			case Hex:
			case Oct:
				{
				alt47=2;
				}
				break;
			case String:
				{
				alt47=3;
				}
				break;
			case 72:
				{
				alt47=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// D:\\antlr\\E.g:297:2: a1= identifier
					{
					pushFollow(FOLLOW_identifier_in_primary_expression2601);
					a1=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 297:17: -> ^( GXX_primary_expression ONE $a1)
					{
						// D:\\antlr\\E.g:297:21: ^( GXX_primary_expression ONE $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_primary_expression, "GXX_primary_expression"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(ONE, "ONE"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:298:2: a1= constant
					{
					pushFollow(FOLLOW_constant_in_primary_expression2622);
					a1=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constant.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 298:15: -> ^( GXX_primary_expression TWO $a1)
					{
						// D:\\antlr\\E.g:298:19: ^( GXX_primary_expression TWO $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_primary_expression, "GXX_primary_expression"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TWO, "TWO"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\antlr\\E.g:299:2: a1= string
					{
					pushFollow(FOLLOW_string_in_primary_expression2643);
					a1=string();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_string.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 299:13: -> ^( GXX_primary_expression THREE $a1)
					{
						// D:\\antlr\\E.g:299:17: ^( GXX_primary_expression THREE $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_primary_expression, "GXX_primary_expression"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(THREE, "THREE"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\antlr\\E.g:300:2: '(' a1= expression ')'
					{
					char_literal120=(Token)match(input,72,FOLLOW_72_in_primary_expression2662); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal120);

					pushFollow(FOLLOW_expression_in_primary_expression2666);
					a1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(a1.getTree());
					char_literal121=(Token)match(input,73,FOLLOW_73_in_primary_expression2668); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal121);

					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 300:25: -> ^( GXX_primary_expression FOUR $a1)
					{
						// D:\\antlr\\E.g:300:29: ^( GXX_primary_expression FOUR $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_primary_expression, "GXX_primary_expression"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(FOUR, "FOUR"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primary_expression"


	public static class constant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// D:\\antlr\\E.g:303:1: constant : (a1= integer_constant -> ^( GXX_constant ONE $a1) |a1= character_constant -> ^( GXX_constant TWO $a1) );
	public final EParser.constant_return constant() throws RecognitionException {
		EParser.constant_return retval = new EParser.constant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope a1 =null;

		RewriteRuleSubtreeStream stream_character_constant=new RewriteRuleSubtreeStream(adaptor,"rule character_constant");
		RewriteRuleSubtreeStream stream_integer_constant=new RewriteRuleSubtreeStream(adaptor,"rule integer_constant");

		try {
			// D:\\antlr\\E.g:303:10: (a1= integer_constant -> ^( GXX_constant ONE $a1) |a1= character_constant -> ^( GXX_constant TWO $a1) )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==Dec||LA48_0==Hex||LA48_0==Oct) ) {
				alt48=1;
			}
			else if ( (LA48_0==Character_constant) ) {
				alt48=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// D:\\antlr\\E.g:304:2: a1= integer_constant
					{
					pushFollow(FOLLOW_integer_constant_in_constant2701);
					a1=integer_constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_integer_constant.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 304:23: -> ^( GXX_constant ONE $a1)
					{
						// D:\\antlr\\E.g:304:27: ^( GXX_constant ONE $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_constant, "GXX_constant"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(ONE, "ONE"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:305:2: a1= character_constant
					{
					pushFollow(FOLLOW_character_constant_in_constant2722);
					a1=character_constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_character_constant.add(a1.getTree());
					// AST REWRITE
					// elements: a1
					// token labels: 
					// rule labels: retval, a1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 305:25: -> ^( GXX_constant TWO $a1)
					{
						// D:\\antlr\\E.g:305:28: ^( GXX_constant TWO $a1)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_constant, "GXX_constant"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(TWO, "TWO"));
						adaptor.addChild(root_1, stream_a1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// D:\\antlr\\E.g:308:1: identifier : ID -> ^( GXX_identifier ID ) ;
	public final EParser.identifier_return identifier() throws RecognitionException {
		EParser.identifier_return retval = new EParser.identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID122=null;

		CommonTree ID122_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// D:\\antlr\\E.g:308:12: ( ID -> ^( GXX_identifier ID ) )
			// D:\\antlr\\E.g:309:2: ID
			{
			ID122=(Token)match(input,ID,FOLLOW_ID_in_identifier2751); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(ID122);

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 309:6: -> ^( GXX_identifier ID )
			{
				// D:\\antlr\\E.g:309:10: ^( GXX_identifier ID )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_identifier, "GXX_identifier"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class character_constant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "character_constant"
	// D:\\antlr\\E.g:316:1: character_constant : Character_constant -> ^( GXX_character_constant Character_constant ) ;
	public final EParser.character_constant_return character_constant() throws RecognitionException {
		EParser.character_constant_return retval = new EParser.character_constant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Character_constant123=null;

		CommonTree Character_constant123_tree=null;
		RewriteRuleTokenStream stream_Character_constant=new RewriteRuleTokenStream(adaptor,"token Character_constant");

		try {
			// D:\\antlr\\E.g:316:20: ( Character_constant -> ^( GXX_character_constant Character_constant ) )
			// D:\\antlr\\E.g:317:2: Character_constant
			{
			Character_constant123=(Token)match(input,Character_constant,FOLLOW_Character_constant_in_character_constant2835); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Character_constant.add(Character_constant123);

			// AST REWRITE
			// elements: Character_constant
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 317:22: -> ^( GXX_character_constant Character_constant )
			{
				// D:\\antlr\\E.g:317:26: ^( GXX_character_constant Character_constant )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_character_constant, "GXX_character_constant"), root_1);
				adaptor.addChild(root_1, stream_Character_constant.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "character_constant"


	public static class string_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "string"
	// D:\\antlr\\E.g:326:1: string : String -> ^( GXX_string String ) ;
	public final EParser.string_return string() throws RecognitionException {
		EParser.string_return retval = new EParser.string_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token String124=null;

		CommonTree String124_tree=null;
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");

		try {
			// D:\\antlr\\E.g:326:8: ( String -> ^( GXX_string String ) )
			// D:\\antlr\\E.g:327:2: String
			{
			String124=(Token)match(input,String,FOLLOW_String_in_string2959); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_String.add(String124);

			// AST REWRITE
			// elements: String
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 327:10: -> ^( GXX_string String )
			{
				// D:\\antlr\\E.g:327:14: ^( GXX_string String )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_string, "GXX_string"), root_1);
				adaptor.addChild(root_1, stream_String.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string"


	public static class integer_constant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "integer_constant"
	// D:\\antlr\\E.g:334:1: integer_constant : ( Dec -> ^( GXX_integer_constant Dec ) | Oct -> ^( GXX_integer_constant Oct ) | Hex -> ^( GXX_integer_constant Hex ) );
	public final EParser.integer_constant_return integer_constant() throws RecognitionException {
		EParser.integer_constant_return retval = new EParser.integer_constant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Dec125=null;
		Token Oct126=null;
		Token Hex127=null;

		CommonTree Dec125_tree=null;
		CommonTree Oct126_tree=null;
		CommonTree Hex127_tree=null;
		RewriteRuleTokenStream stream_Hex=new RewriteRuleTokenStream(adaptor,"token Hex");
		RewriteRuleTokenStream stream_Oct=new RewriteRuleTokenStream(adaptor,"token Oct");
		RewriteRuleTokenStream stream_Dec=new RewriteRuleTokenStream(adaptor,"token Dec");

		try {
			// D:\\antlr\\E.g:334:18: ( Dec -> ^( GXX_integer_constant Dec ) | Oct -> ^( GXX_integer_constant Oct ) | Hex -> ^( GXX_integer_constant Hex ) )
			int alt49=3;
			switch ( input.LA(1) ) {
			case Dec:
				{
				alt49=1;
				}
				break;
			case Oct:
				{
				alt49=2;
				}
				break;
			case Hex:
				{
				alt49=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// D:\\antlr\\E.g:335:2: Dec
					{
					Dec125=(Token)match(input,Dec,FOLLOW_Dec_in_integer_constant3035); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Dec.add(Dec125);

					// AST REWRITE
					// elements: Dec
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 335:7: -> ^( GXX_integer_constant Dec )
					{
						// D:\\antlr\\E.g:335:11: ^( GXX_integer_constant Dec )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_integer_constant, "GXX_integer_constant"), root_1);
						adaptor.addChild(root_1, stream_Dec.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:336:2: Oct
					{
					Oct126=(Token)match(input,Oct,FOLLOW_Oct_in_integer_constant3051); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Oct.add(Oct126);

					// AST REWRITE
					// elements: Oct
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 336:7: -> ^( GXX_integer_constant Oct )
					{
						// D:\\antlr\\E.g:336:11: ^( GXX_integer_constant Oct )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_integer_constant, "GXX_integer_constant"), root_1);
						adaptor.addChild(root_1, stream_Oct.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\antlr\\E.g:337:2: Hex
					{
					Hex127=(Token)match(input,Hex,FOLLOW_Hex_in_integer_constant3067); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Hex.add(Hex127);

					// AST REWRITE
					// elements: Hex
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 337:7: -> ^( GXX_integer_constant Hex )
					{
						// D:\\antlr\\E.g:337:11: ^( GXX_integer_constant Hex )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GXX_integer_constant, "GXX_integer_constant"), root_1);
						adaptor.addChild(root_1, stream_Hex.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integer_constant"

	// $ANTLR start synpred1_E
	public final void synpred1_E_fragment() throws RecognitionException {
		// D:\\antlr\\E.g:67:3: ( declaration )
		// D:\\antlr\\E.g:67:3: declaration
		{
		pushFollow(FOLLOW_declaration_in_synpred1_E277);
		declaration();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_E

	// $ANTLR start synpred2_E
	public final void synpred2_E_fragment() throws RecognitionException {
		// D:\\antlr\\E.g:67:17: ( function_definition )
		// D:\\antlr\\E.g:67:17: function_definition
		{
		pushFollow(FOLLOW_function_definition_in_synpred2_E281);
		function_definition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_E

	// $ANTLR start synpred19_E
	public final void synpred19_E_fragment() throws RecognitionException {
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;


		// D:\\antlr\\E.g:117:2: (a1= plain_declarator '(' (a2= parameters )? ')' )
		// D:\\antlr\\E.g:117:2: a1= plain_declarator '(' (a2= parameters )? ')'
		{
		pushFollow(FOLLOW_plain_declarator_in_synpred19_E817);
		a1=plain_declarator();
		state._fsp--;
		if (state.failed) return;

		match(input,72,FOLLOW_72_in_synpred19_E819); if (state.failed) return;

		// D:\\antlr\\E.g:117:28: (a2= parameters )?
		int alt52=2;
		int LA52_0 = input.LA(1);
		if ( (LA52_0==103||LA52_0==108||(LA52_0 >= 111 && LA52_0 <= 113)) ) {
			alt52=1;
		}
		switch (alt52) {
			case 1 :
				// D:\\antlr\\E.g:117:28: a2= parameters
				{
				pushFollow(FOLLOW_parameters_in_synpred19_E823);
				a2=parameters();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		match(input,73,FOLLOW_73_in_synpred19_E826); if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_E

	// $ANTLR start synpred29_E
	public final void synpred29_E_fragment() throws RecognitionException {
		ParserRuleReturnScope a3 =null;


		// D:\\antlr\\E.g:143:43: ( 'else' a3= statement )
		// D:\\antlr\\E.g:143:43: 'else' a3= statement
		{
		match(input,105,FOLLOW_105_in_synpred29_E1141); if (state.failed) return;

		pushFollow(FOLLOW_statement_in_synpred29_E1145);
		a3=statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred29_E

	// $ANTLR start synpred38_E
	public final void synpred38_E_fragment() throws RecognitionException {
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;
		ParserRuleReturnScope a3 =null;


		// D:\\antlr\\E.g:162:2: (a1= unary_expression a2= assignment_operator a3= assignment_expression )
		// D:\\antlr\\E.g:162:2: a1= unary_expression a2= assignment_operator a3= assignment_expression
		{
		pushFollow(FOLLOW_unary_expression_in_synpred38_E1414);
		a1=unary_expression();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_assignment_operator_in_synpred38_E1418);
		a2=assignment_operator();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_assignment_expression_in_synpred38_E1422);
		a3=assignment_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred38_E

	// Delegated rules

	public final boolean synpred38_E() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred38_E_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_E() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_E_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_E() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_E_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred29_E() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred29_E_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_E() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_E_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_program_tmp_in_program248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_program_tmp277 = new BitSet(new long[]{0x0000000000000002L,0x0003908000000000L});
	public static final BitSet FOLLOW_function_definition_in_program_tmp281 = new BitSet(new long[]{0x0000000000000002L,0x0003908000000000L});
	public static final BitSet FOLLOW_type_specifier_in_declaration303 = new BitSet(new long[]{0x0100000000000000L,0x0000000000800400L});
	public static final BitSet FOLLOW_init_declarators_in_declaration307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_declaration310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_specifier_in_function_definition345 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_plain_declarator_in_function_definition349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_function_definition351 = new BitSet(new long[]{0x0000000000000000L,0x0003908000000200L});
	public static final BitSet FOLLOW_parameters_in_function_definition355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_function_definition358 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_compound_statement_in_function_definition362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declaration_in_parameters401 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_parameters404 = new BitSet(new long[]{0x0000000000000000L,0x0003908000000000L});
	public static final BitSet FOLLOW_plain_declaration_in_parameters406 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_declarator_in_declarators437 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_declarators440 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_declarator_in_declarators442 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarators473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_init_declarators476 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarators478 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_declarator_in_init_declarator511 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_init_declarator514 = new BitSet(new long[]{0x3180000000000050L,0x0108400000033542L});
	public static final BitSet FOLLOW_initializer_in_init_declarator518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_initializer555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_115_in_initializer574 = new BitSet(new long[]{0x3180000000000050L,0x0108400000033542L});
	public static final BitSet FOLLOW_initializer_in_initializer576 = new BitSet(new long[]{0x0000000000000000L,0x0080000000008000L});
	public static final BitSet FOLLOW_79_in_initializer579 = new BitSet(new long[]{0x3180000000000050L,0x0108400000033542L});
	public static final BitSet FOLLOW_initializer_in_initializer581 = new BitSet(new long[]{0x0000000000000000L,0x0080000000008000L});
	public static final BitSet FOLLOW_119_in_initializer585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_type_specifier615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_103_in_type_specifier631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_type_specifier647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_in_type_specifier665 = new BitSet(new long[]{0x0100000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_identifier_in_type_specifier669 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_type_specifier672 = new BitSet(new long[]{0x0000000000000000L,0x0003908000000000L});
	public static final BitSet FOLLOW_type_specifier_in_type_specifier675 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_declarators_in_type_specifier677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_type_specifier679 = new BitSet(new long[]{0x0000000000000000L,0x0083908000000000L});
	public static final BitSet FOLLOW_119_in_type_specifier683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_in_type_specifier719 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_identifier_in_type_specifier723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_specifier_in_plain_declaration781 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_declarator_in_plain_declaration785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declarator_in_declarator817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_declarator819 = new BitSet(new long[]{0x0000000000000000L,0x0003908000000200L});
	public static final BitSet FOLLOW_parameters_in_declarator823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_declarator826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declarator_in_declarator851 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_declarator854 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_constant_expression_in_declarator856 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_declarator858 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_74_in_plain_declarator892 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_plain_declarator_in_plain_declarator896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_plain_declarator917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_statement_in_statement947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_statement966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selection_statement_in_statement985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_statement_in_statement1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jump_statement_in_statement1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expression_statement1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_expression_statement1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_115_in_compound_statement1086 = new BitSet(new long[]{0x3180000000000050L,0x018FFDC000833542L});
	public static final BitSet FOLLOW_declaration_in_compound_statement1088 = new BitSet(new long[]{0x3180000000000050L,0x018FFDC000833542L});
	public static final BitSet FOLLOW_statement_in_compound_statement1091 = new BitSet(new long[]{0x3180000000000050L,0x018C6D4000833542L});
	public static final BitSet FOLLOW_119_in_compound_statement1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_selection_statement1126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_selection_statement1128 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_expression_in_selection_statement1132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_selection_statement1134 = new BitSet(new long[]{0x3180000000000050L,0x010C6D4000833542L});
	public static final BitSet FOLLOW_statement_in_selection_statement1138 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_selection_statement1141 = new BitSet(new long[]{0x3180000000000050L,0x010C6D4000833542L});
	public static final BitSet FOLLOW_statement_in_selection_statement1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_114_in_iteration_statement1183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_iteration_statement1185 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_iteration_statement1191 = new BitSet(new long[]{0x3180000000000050L,0x010C6D4000833542L});
	public static final BitSet FOLLOW_statement_in_iteration_statement1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_iteration_statement1216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_iteration_statement1218 = new BitSet(new long[]{0x3180000000000050L,0x0100400000833542L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_iteration_statement1227 = new BitSet(new long[]{0x3180000000000050L,0x0100400000833542L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_iteration_statement1236 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033742L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_iteration_statement1245 = new BitSet(new long[]{0x3180000000000050L,0x010C6D4000833542L});
	public static final BitSet FOLLOW_statement_in_iteration_statement1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_jump_statement1303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_jump_statement1305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_jump_statement1321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_jump_statement1323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_jump_statement1339 = new BitSet(new long[]{0x3180000000000050L,0x0100400000833542L});
	public static final BitSet FOLLOW_expression_in_jump_statement1343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_jump_statement1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1377 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_expression1380 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1382 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_unary_expression_in_assignment_expression1414 = new BitSet(new long[]{0x0000000000000000L,0x0020002214444890L});
	public static final BitSet FOLLOW_assignment_operator_in_assignment_expression1418 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_assignment_expression_in_assignment_expression1422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_assignment_expression1447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_constant_expression1555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1584 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_118_in_logical_or_expression1587 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1589 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1618 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_logical_and_expression1621 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1654 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_inclusive_or_expression1657 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1659 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1690 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_exclusive_or_expression1693 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1695 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_and_expression1729 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1731 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1762 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000004L});
	public static final BitSet FOLLOW_equality_operator_in_equality_expression1765 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1767 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000004L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1825 = new BitSet(new long[]{0x0000000000000002L,0x00000000C9000000L});
	public static final BitSet FOLLOW_relational_operator_in_relational_expression1828 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1830 = new BitSet(new long[]{0x0000000000000002L,0x00000000C9000000L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1899 = new BitSet(new long[]{0x0000000000000002L,0x0000000102000000L});
	public static final BitSet FOLLOW_shift_operator_in_shift_expression1902 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1904 = new BitSet(new long[]{0x0000000000000002L,0x0000000102000000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1963 = new BitSet(new long[]{0x0000000000000002L,0x0000000000011000L});
	public static final BitSet FOLLOW_additive_operator_in_additive_expression1966 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1968 = new BitSet(new long[]{0x0000000000000002L,0x0000000000011000L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression2028 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200408L});
	public static final BitSet FOLLOW_multiplicative_operator_in_multiplicative_expression2031 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression2033 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200408L});
	public static final BitSet FOLLOW_unary_expression_in_cast_expression2100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_cast_expression2115 = new BitSet(new long[]{0x0000000000000000L,0x0003908000000000L});
	public static final BitSet FOLLOW_typename_in_cast_expression2119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_cast_expression2121 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_cast_expression_in_cast_expression2125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_specifier_in_typename2159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_typename2161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression2195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_unary_expression2212 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression2216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_unary_expression2235 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression2239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_operator_in_unary_expression2260 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_cast_expression_in_unary_expression2264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_unary_expression2284 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression2288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_unary_expression2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_unary_expression2309 = new BitSet(new long[]{0x0000000000000000L,0x0003908000000000L});
	public static final BitSet FOLLOW_typename_in_unary_expression2313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_unary_expression2315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_postfix_expression2389 = new BitSet(new long[]{0x0000000000000002L,0x00000004001A2100L});
	public static final BitSet FOLLOW_postfix_in_postfix_expression2391 = new BitSet(new long[]{0x0000000000000002L,0x00000004001A2100L});
	public static final BitSet FOLLOW_98_in_postfix2424 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_expression_in_postfix2428 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_postfix2430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_postfix2449 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033742L});
	public static final BitSet FOLLOW_arguments_in_postfix2453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_postfix2456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_postfix2476 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_identifier_in_postfix2480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_postfix2499 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_identifier_in_postfix2503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_postfix2522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_postfix2538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_arguments2565 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_arguments2568 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_assignment_expression_in_arguments2570 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
	public static final BitSet FOLLOW_identifier_in_primary_expression2601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expression2622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_primary_expression2643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_primary_expression2662 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_expression_in_primary_expression2666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_primary_expression2668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_constant_in_constant2701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_constant_in_constant2722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier2751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Character_constant_in_character_constant2835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_string2959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dec_in_integer_constant3035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Oct_in_integer_constant3051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hex_in_integer_constant3067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_synpred1_E277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_in_synpred2_E281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declarator_in_synpred19_E817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_synpred19_E819 = new BitSet(new long[]{0x0000000000000000L,0x0003908000000200L});
	public static final BitSet FOLLOW_parameters_in_synpred19_E823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_synpred19_E826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_synpred29_E1141 = new BitSet(new long[]{0x3180000000000050L,0x010C6D4000833542L});
	public static final BitSet FOLLOW_statement_in_synpred29_E1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_synpred38_E1414 = new BitSet(new long[]{0x0000000000000000L,0x0020002214444890L});
	public static final BitSet FOLLOW_assignment_operator_in_synpred38_E1418 = new BitSet(new long[]{0x3180000000000050L,0x0100400000033542L});
	public static final BitSet FOLLOW_assignment_expression_in_synpred38_E1422 = new BitSet(new long[]{0x0000000000000002L});
}
