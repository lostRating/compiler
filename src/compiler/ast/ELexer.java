package compiler.ast;

// $ANTLR 3.5-rc-2 D:\\antlr\\E.g 2014-04-17 22:35:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ELexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ELexer() {} 
	public ELexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ELexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\antlr\\E.g"; }

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:2:7: ( '!' )
			// D:\\antlr\\E.g:2:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:3:7: ( '!=' )
			// D:\\antlr\\E.g:3:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:4:7: ( '%' )
			// D:\\antlr\\E.g:4:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:5:7: ( '%=' )
			// D:\\antlr\\E.g:5:9: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:6:7: ( '&&' )
			// D:\\antlr\\E.g:6:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:7:7: ( '&' )
			// D:\\antlr\\E.g:7:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:8:7: ( '&=' )
			// D:\\antlr\\E.g:8:9: '&='
			{
			match("&="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:9:7: ( '(' )
			// D:\\antlr\\E.g:9:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:10:7: ( ')' )
			// D:\\antlr\\E.g:10:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:11:7: ( '*' )
			// D:\\antlr\\E.g:11:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:12:7: ( '*=' )
			// D:\\antlr\\E.g:12:9: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:13:7: ( '+' )
			// D:\\antlr\\E.g:13:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:14:7: ( '++' )
			// D:\\antlr\\E.g:14:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:15:7: ( '+=' )
			// D:\\antlr\\E.g:15:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:16:7: ( ',' )
			// D:\\antlr\\E.g:16:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:17:7: ( '-' )
			// D:\\antlr\\E.g:17:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:18:7: ( '--' )
			// D:\\antlr\\E.g:18:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:19:7: ( '-=' )
			// D:\\antlr\\E.g:19:9: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:20:7: ( '->' )
			// D:\\antlr\\E.g:20:9: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:21:7: ( '.' )
			// D:\\antlr\\E.g:21:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:22:7: ( '/' )
			// D:\\antlr\\E.g:22:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:23:7: ( '/=' )
			// D:\\antlr\\E.g:23:9: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:24:7: ( ';' )
			// D:\\antlr\\E.g:24:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:25:7: ( '<' )
			// D:\\antlr\\E.g:25:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:26:7: ( '<<' )
			// D:\\antlr\\E.g:26:9: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:27:7: ( '<<=' )
			// D:\\antlr\\E.g:27:9: '<<='
			{
			match("<<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:28:7: ( '<=' )
			// D:\\antlr\\E.g:28:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:29:7: ( '=' )
			// D:\\antlr\\E.g:29:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:30:7: ( '==' )
			// D:\\antlr\\E.g:30:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:31:7: ( '>' )
			// D:\\antlr\\E.g:31:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:32:7: ( '>=' )
			// D:\\antlr\\E.g:32:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__95"

	// $ANTLR start "T__96"
	public final void mT__96() throws RecognitionException {
		try {
			int _type = T__96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:33:7: ( '>>' )
			// D:\\antlr\\E.g:33:9: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__96"

	// $ANTLR start "T__97"
	public final void mT__97() throws RecognitionException {
		try {
			int _type = T__97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:34:7: ( '>>=' )
			// D:\\antlr\\E.g:34:9: '>>='
			{
			match(">>="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__97"

	// $ANTLR start "T__98"
	public final void mT__98() throws RecognitionException {
		try {
			int _type = T__98;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:35:7: ( '[' )
			// D:\\antlr\\E.g:35:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__98"

	// $ANTLR start "T__99"
	public final void mT__99() throws RecognitionException {
		try {
			int _type = T__99;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:36:7: ( ']' )
			// D:\\antlr\\E.g:36:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__99"

	// $ANTLR start "T__100"
	public final void mT__100() throws RecognitionException {
		try {
			int _type = T__100;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:37:8: ( '^' )
			// D:\\antlr\\E.g:37:10: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__100"

	// $ANTLR start "T__101"
	public final void mT__101() throws RecognitionException {
		try {
			int _type = T__101;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:38:8: ( '^=' )
			// D:\\antlr\\E.g:38:10: '^='
			{
			match("^="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__101"

	// $ANTLR start "T__102"
	public final void mT__102() throws RecognitionException {
		try {
			int _type = T__102;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:39:8: ( 'break' )
			// D:\\antlr\\E.g:39:10: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__102"

	// $ANTLR start "T__103"
	public final void mT__103() throws RecognitionException {
		try {
			int _type = T__103;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:40:8: ( 'char' )
			// D:\\antlr\\E.g:40:10: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__103"

	// $ANTLR start "T__104"
	public final void mT__104() throws RecognitionException {
		try {
			int _type = T__104;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:41:8: ( 'continue' )
			// D:\\antlr\\E.g:41:10: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__104"

	// $ANTLR start "T__105"
	public final void mT__105() throws RecognitionException {
		try {
			int _type = T__105;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:42:8: ( 'else' )
			// D:\\antlr\\E.g:42:10: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__105"

	// $ANTLR start "T__106"
	public final void mT__106() throws RecognitionException {
		try {
			int _type = T__106;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:43:8: ( 'for' )
			// D:\\antlr\\E.g:43:10: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__106"

	// $ANTLR start "T__107"
	public final void mT__107() throws RecognitionException {
		try {
			int _type = T__107;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:44:8: ( 'if' )
			// D:\\antlr\\E.g:44:10: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__107"

	// $ANTLR start "T__108"
	public final void mT__108() throws RecognitionException {
		try {
			int _type = T__108;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:45:8: ( 'int' )
			// D:\\antlr\\E.g:45:10: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__108"

	// $ANTLR start "T__109"
	public final void mT__109() throws RecognitionException {
		try {
			int _type = T__109;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:46:8: ( 'return' )
			// D:\\antlr\\E.g:46:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__109"

	// $ANTLR start "T__110"
	public final void mT__110() throws RecognitionException {
		try {
			int _type = T__110;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:47:8: ( 'sizeof' )
			// D:\\antlr\\E.g:47:10: 'sizeof'
			{
			match("sizeof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__110"

	// $ANTLR start "T__111"
	public final void mT__111() throws RecognitionException {
		try {
			int _type = T__111;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:48:8: ( 'struct' )
			// D:\\antlr\\E.g:48:10: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__111"

	// $ANTLR start "T__112"
	public final void mT__112() throws RecognitionException {
		try {
			int _type = T__112;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:49:8: ( 'union' )
			// D:\\antlr\\E.g:49:10: 'union'
			{
			match("union"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__112"

	// $ANTLR start "T__113"
	public final void mT__113() throws RecognitionException {
		try {
			int _type = T__113;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:50:8: ( 'void' )
			// D:\\antlr\\E.g:50:10: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__113"

	// $ANTLR start "T__114"
	public final void mT__114() throws RecognitionException {
		try {
			int _type = T__114;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:51:8: ( 'while' )
			// D:\\antlr\\E.g:51:10: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__114"

	// $ANTLR start "T__115"
	public final void mT__115() throws RecognitionException {
		try {
			int _type = T__115;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:52:8: ( '{' )
			// D:\\antlr\\E.g:52:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__115"

	// $ANTLR start "T__116"
	public final void mT__116() throws RecognitionException {
		try {
			int _type = T__116;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:53:8: ( '|' )
			// D:\\antlr\\E.g:53:10: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__116"

	// $ANTLR start "T__117"
	public final void mT__117() throws RecognitionException {
		try {
			int _type = T__117;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:54:8: ( '|=' )
			// D:\\antlr\\E.g:54:10: '|='
			{
			match("|="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__117"

	// $ANTLR start "T__118"
	public final void mT__118() throws RecognitionException {
		try {
			int _type = T__118;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:55:8: ( '||' )
			// D:\\antlr\\E.g:55:10: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__118"

	// $ANTLR start "T__119"
	public final void mT__119() throws RecognitionException {
		try {
			int _type = T__119;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:56:8: ( '}' )
			// D:\\antlr\\E.g:56:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__119"

	// $ANTLR start "T__120"
	public final void mT__120() throws RecognitionException {
		try {
			int _type = T__120;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:57:8: ( '~' )
			// D:\\antlr\\E.g:57:10: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__120"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:312:4: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )* )
			// D:\\antlr\\E.g:313:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )*
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\antlr\\E.g:313:36: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='$'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\antlr\\E.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "Character_constant"
	public final void mCharacter_constant() throws RecognitionException {
		try {
			int _type = Character_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:320:20: ( '\\'' ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\'' | '\\\\' ) ) '\\'' | '\\'' '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) ( '0' .. '7' ) '\\'' | '\\'' '\\\\' ( '0x' | '0X' ) DigitHex DigitHex '\\'' )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\'') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='\\') ) {
					switch ( input.LA(3) ) {
					case '0':
						{
						int LA4_4 = input.LA(4);
						if ( ((LA4_4 >= '0' && LA4_4 <= '7')) ) {
							alt4=2;
						}
						else if ( (LA4_4=='X'||LA4_4=='x') ) {
							alt4=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case '\"':
					case '\'':
					case '\\':
					case 'b':
					case 'f':
					case 'n':
					case 'r':
					case 't':
						{
						alt4=1;
						}
						break;
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
						{
						alt4=2;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '&')||(LA4_1 >= '(' && LA4_1 <= '[')||(LA4_1 >= ']' && LA4_1 <= '\uFFFF')) ) {
					alt4=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// D:\\antlr\\E.g:321:2: '\\'' ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\'' | '\\\\' ) ) '\\''
					{
					match('\''); 
					// D:\\antlr\\E.g:321:7: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\'' | '\\\\' ) )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0=='\\') ) {
						alt2=1;
					}
					else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// D:\\antlr\\E.g:321:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
							{
							// D:\\antlr\\E.g:321:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
							// D:\\antlr\\E.g:321:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
							{
							match('\\'); 
							if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}

							}
							break;
						case 2 :
							// D:\\antlr\\E.g:321:55: ~ ( '\\'' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					match('\''); 
					}
					break;
				case 2 :
					// D:\\antlr\\E.g:322:2: '\\'' '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) ( '0' .. '7' ) '\\''
					{
					match('\''); 
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					match('\''); 
					}
					break;
				case 3 :
					// D:\\antlr\\E.g:323:2: '\\'' '\\\\' ( '0x' | '0X' ) DigitHex DigitHex '\\''
					{
					match('\''); 
					match('\\'); 
					// D:\\antlr\\E.g:323:12: ( '0x' | '0X' )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0=='0') ) {
						int LA3_1 = input.LA(2);
						if ( (LA3_1=='x') ) {
							alt3=1;
						}
						else if ( (LA3_1=='X') ) {
							alt3=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 3, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// D:\\antlr\\E.g:323:13: '0x'
							{
							match("0x"); 

							}
							break;
						case 2 :
							// D:\\antlr\\E.g:323:20: '0X'
							{
							match("0X"); 

							}
							break;

					}

					mDigitHex(); 

					mDigitHex(); 

					match('\''); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Character_constant"

	// $ANTLR start "String"
	public final void mString() throws RecognitionException {
		try {
			int _type = String;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:330:8: ( '\\\"' ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\\\' | '\\\"' ) )* '\\\"' )
			// D:\\antlr\\E.g:331:2: '\\\"' ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\\\' | '\\\"' ) )* '\\\"'
			{
			match('\"'); 
			// D:\\antlr\\E.g:331:7: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\\\' | '\\\"' ) )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\\') ) {
					alt5=1;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// D:\\antlr\\E.g:331:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
					{
					// D:\\antlr\\E.g:331:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
					// D:\\antlr\\E.g:331:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:331:55: ~ ( '\\\\' | '\\\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "String"

	// $ANTLR start "Dec"
	public final void mDec() throws RecognitionException {
		try {
			int _type = Dec;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:340:5: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='0') ) {
				alt7=1;
			}
			else if ( ((LA7_0 >= '1' && LA7_0 <= '9')) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// D:\\antlr\\E.g:341:2: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// D:\\antlr\\E.g:342:2: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// D:\\antlr\\E.g:342:13: ( '0' .. '9' )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// D:\\antlr\\E.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dec"

	// $ANTLR start "Oct"
	public final void mOct() throws RecognitionException {
		try {
			int _type = Oct;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:345:5: ( '0' ( '0' .. '7' )+ )
			// D:\\antlr\\E.g:346:2: '0' ( '0' .. '7' )+
			{
			match('0'); 
			// D:\\antlr\\E.g:346:5: ( '0' .. '7' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '7')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\antlr\\E.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Oct"

	// $ANTLR start "Hex"
	public final void mHex() throws RecognitionException {
		try {
			int _type = Hex;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:349:5: ( ( '0x' | '0X' ) ( DigitHex )+ )
			// D:\\antlr\\E.g:350:2: ( '0x' | '0X' ) ( DigitHex )+
			{
			// D:\\antlr\\E.g:350:2: ( '0x' | '0X' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='0') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='x') ) {
					alt9=1;
				}
				else if ( (LA9_1=='X') ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// D:\\antlr\\E.g:350:3: '0x'
					{
					match("0x"); 

					}
					break;
				case 2 :
					// D:\\antlr\\E.g:350:8: '0X'
					{
					match("0X"); 

					}
					break;

			}

			// D:\\antlr\\E.g:350:13: ( DigitHex )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'F')||(LA10_0 >= 'a' && LA10_0 <= 'f')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\antlr\\E.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Hex"

	// $ANTLR start "DigitHex"
	public final void mDigitHex() throws RecognitionException {
		try {
			// D:\\antlr\\E.g:353:19: ( Digit | 'A' .. 'F' | 'a' .. 'f' )
			// D:\\antlr\\E.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DigitHex"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// D:\\antlr\\E.g:364:17: ( 'a' .. 'z' | 'A' .. 'Z' )
			// D:\\antlr\\E.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Letter"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// D:\\antlr\\E.g:369:16: ( '0' .. '9' )
			// D:\\antlr\\E.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	// $ANTLR start "Comments"
	public final void mComments() throws RecognitionException {
		try {
			int _type = Comments;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:373:10: ( ( '/*' ( . )* '*/' ) | ( '//' (~ ( '\\n' | '\\r' ) )* ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='*') ) {
					alt13=1;
				}
				else if ( (LA13_1=='/') ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// D:\\antlr\\E.g:374:2: ( '/*' ( . )* '*/' )
					{
					// D:\\antlr\\E.g:374:2: ( '/*' ( . )* '*/' )
					// D:\\antlr\\E.g:374:3: '/*' ( . )* '*/'
					{
					match("/*"); 

					// D:\\antlr\\E.g:374:8: ( . )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0=='*') ) {
							int LA11_1 = input.LA(2);
							if ( (LA11_1=='/') ) {
								alt11=2;
							}
							else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '.')||(LA11_1 >= '0' && LA11_1 <= '\uFFFF')) ) {
								alt11=1;
							}

						}
						else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ')')||(LA11_0 >= '+' && LA11_0 <= '\uFFFF')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// D:\\antlr\\E.g:374:8: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop11;
						}
					}

					match("*/"); 

					}

					skip();
					}
					break;
				case 2 :
					// D:\\antlr\\E.g:375:2: ( '//' (~ ( '\\n' | '\\r' ) )* )
					{
					// D:\\antlr\\E.g:375:2: ( '//' (~ ( '\\n' | '\\r' ) )* )
					// D:\\antlr\\E.g:375:3: '//' (~ ( '\\n' | '\\r' ) )*
					{
					match("//"); 

					// D:\\antlr\\E.g:375:8: (~ ( '\\n' | '\\r' ) )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// D:\\antlr\\E.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop12;
						}
					}

					}

					skip();
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comments"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:378:4: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
			// D:\\antlr\\E.g:379:2: ( ' ' | '\\t' | '\\n' | '\\r' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\antlr\\E.g:382:9: ( ( '#include' ) (~ ( '\\n' | '\\r' ) )* )
			// D:\\antlr\\E.g:383:2: ( '#include' ) (~ ( '\\n' | '\\r' ) )*
			{
			// D:\\antlr\\E.g:383:2: ( '#include' )
			// D:\\antlr\\E.g:383:3: '#include'
			{
			match("#include"); 

			}

			// D:\\antlr\\E.g:383:14: (~ ( '\\n' | '\\r' ) )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\antlr\\E.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\antlr\\E.g:1:8: ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | ID | Character_constant | String | Dec | Oct | Hex | Comments | WS | INCLUDE )
		int alt15=65;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// D:\\antlr\\E.g:1:10: T__65
				{
				mT__65(); 

				}
				break;
			case 2 :
				// D:\\antlr\\E.g:1:16: T__66
				{
				mT__66(); 

				}
				break;
			case 3 :
				// D:\\antlr\\E.g:1:22: T__67
				{
				mT__67(); 

				}
				break;
			case 4 :
				// D:\\antlr\\E.g:1:28: T__68
				{
				mT__68(); 

				}
				break;
			case 5 :
				// D:\\antlr\\E.g:1:34: T__69
				{
				mT__69(); 

				}
				break;
			case 6 :
				// D:\\antlr\\E.g:1:40: T__70
				{
				mT__70(); 

				}
				break;
			case 7 :
				// D:\\antlr\\E.g:1:46: T__71
				{
				mT__71(); 

				}
				break;
			case 8 :
				// D:\\antlr\\E.g:1:52: T__72
				{
				mT__72(); 

				}
				break;
			case 9 :
				// D:\\antlr\\E.g:1:58: T__73
				{
				mT__73(); 

				}
				break;
			case 10 :
				// D:\\antlr\\E.g:1:64: T__74
				{
				mT__74(); 

				}
				break;
			case 11 :
				// D:\\antlr\\E.g:1:70: T__75
				{
				mT__75(); 

				}
				break;
			case 12 :
				// D:\\antlr\\E.g:1:76: T__76
				{
				mT__76(); 

				}
				break;
			case 13 :
				// D:\\antlr\\E.g:1:82: T__77
				{
				mT__77(); 

				}
				break;
			case 14 :
				// D:\\antlr\\E.g:1:88: T__78
				{
				mT__78(); 

				}
				break;
			case 15 :
				// D:\\antlr\\E.g:1:94: T__79
				{
				mT__79(); 

				}
				break;
			case 16 :
				// D:\\antlr\\E.g:1:100: T__80
				{
				mT__80(); 

				}
				break;
			case 17 :
				// D:\\antlr\\E.g:1:106: T__81
				{
				mT__81(); 

				}
				break;
			case 18 :
				// D:\\antlr\\E.g:1:112: T__82
				{
				mT__82(); 

				}
				break;
			case 19 :
				// D:\\antlr\\E.g:1:118: T__83
				{
				mT__83(); 

				}
				break;
			case 20 :
				// D:\\antlr\\E.g:1:124: T__84
				{
				mT__84(); 

				}
				break;
			case 21 :
				// D:\\antlr\\E.g:1:130: T__85
				{
				mT__85(); 

				}
				break;
			case 22 :
				// D:\\antlr\\E.g:1:136: T__86
				{
				mT__86(); 

				}
				break;
			case 23 :
				// D:\\antlr\\E.g:1:142: T__87
				{
				mT__87(); 

				}
				break;
			case 24 :
				// D:\\antlr\\E.g:1:148: T__88
				{
				mT__88(); 

				}
				break;
			case 25 :
				// D:\\antlr\\E.g:1:154: T__89
				{
				mT__89(); 

				}
				break;
			case 26 :
				// D:\\antlr\\E.g:1:160: T__90
				{
				mT__90(); 

				}
				break;
			case 27 :
				// D:\\antlr\\E.g:1:166: T__91
				{
				mT__91(); 

				}
				break;
			case 28 :
				// D:\\antlr\\E.g:1:172: T__92
				{
				mT__92(); 

				}
				break;
			case 29 :
				// D:\\antlr\\E.g:1:178: T__93
				{
				mT__93(); 

				}
				break;
			case 30 :
				// D:\\antlr\\E.g:1:184: T__94
				{
				mT__94(); 

				}
				break;
			case 31 :
				// D:\\antlr\\E.g:1:190: T__95
				{
				mT__95(); 

				}
				break;
			case 32 :
				// D:\\antlr\\E.g:1:196: T__96
				{
				mT__96(); 

				}
				break;
			case 33 :
				// D:\\antlr\\E.g:1:202: T__97
				{
				mT__97(); 

				}
				break;
			case 34 :
				// D:\\antlr\\E.g:1:208: T__98
				{
				mT__98(); 

				}
				break;
			case 35 :
				// D:\\antlr\\E.g:1:214: T__99
				{
				mT__99(); 

				}
				break;
			case 36 :
				// D:\\antlr\\E.g:1:220: T__100
				{
				mT__100(); 

				}
				break;
			case 37 :
				// D:\\antlr\\E.g:1:227: T__101
				{
				mT__101(); 

				}
				break;
			case 38 :
				// D:\\antlr\\E.g:1:234: T__102
				{
				mT__102(); 

				}
				break;
			case 39 :
				// D:\\antlr\\E.g:1:241: T__103
				{
				mT__103(); 

				}
				break;
			case 40 :
				// D:\\antlr\\E.g:1:248: T__104
				{
				mT__104(); 

				}
				break;
			case 41 :
				// D:\\antlr\\E.g:1:255: T__105
				{
				mT__105(); 

				}
				break;
			case 42 :
				// D:\\antlr\\E.g:1:262: T__106
				{
				mT__106(); 

				}
				break;
			case 43 :
				// D:\\antlr\\E.g:1:269: T__107
				{
				mT__107(); 

				}
				break;
			case 44 :
				// D:\\antlr\\E.g:1:276: T__108
				{
				mT__108(); 

				}
				break;
			case 45 :
				// D:\\antlr\\E.g:1:283: T__109
				{
				mT__109(); 

				}
				break;
			case 46 :
				// D:\\antlr\\E.g:1:290: T__110
				{
				mT__110(); 

				}
				break;
			case 47 :
				// D:\\antlr\\E.g:1:297: T__111
				{
				mT__111(); 

				}
				break;
			case 48 :
				// D:\\antlr\\E.g:1:304: T__112
				{
				mT__112(); 

				}
				break;
			case 49 :
				// D:\\antlr\\E.g:1:311: T__113
				{
				mT__113(); 

				}
				break;
			case 50 :
				// D:\\antlr\\E.g:1:318: T__114
				{
				mT__114(); 

				}
				break;
			case 51 :
				// D:\\antlr\\E.g:1:325: T__115
				{
				mT__115(); 

				}
				break;
			case 52 :
				// D:\\antlr\\E.g:1:332: T__116
				{
				mT__116(); 

				}
				break;
			case 53 :
				// D:\\antlr\\E.g:1:339: T__117
				{
				mT__117(); 

				}
				break;
			case 54 :
				// D:\\antlr\\E.g:1:346: T__118
				{
				mT__118(); 

				}
				break;
			case 55 :
				// D:\\antlr\\E.g:1:353: T__119
				{
				mT__119(); 

				}
				break;
			case 56 :
				// D:\\antlr\\E.g:1:360: T__120
				{
				mT__120(); 

				}
				break;
			case 57 :
				// D:\\antlr\\E.g:1:367: ID
				{
				mID(); 

				}
				break;
			case 58 :
				// D:\\antlr\\E.g:1:370: Character_constant
				{
				mCharacter_constant(); 

				}
				break;
			case 59 :
				// D:\\antlr\\E.g:1:389: String
				{
				mString(); 

				}
				break;
			case 60 :
				// D:\\antlr\\E.g:1:396: Dec
				{
				mDec(); 

				}
				break;
			case 61 :
				// D:\\antlr\\E.g:1:400: Oct
				{
				mOct(); 

				}
				break;
			case 62 :
				// D:\\antlr\\E.g:1:404: Hex
				{
				mHex(); 

				}
				break;
			case 63 :
				// D:\\antlr\\E.g:1:408: Comments
				{
				mComments(); 

				}
				break;
			case 64 :
				// D:\\antlr\\E.g:1:417: WS
				{
				mWS(); 

				}
				break;
			case 65 :
				// D:\\antlr\\E.g:1:420: INCLUDE
				{
				mINCLUDE(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\1\uffff\1\51\1\53\1\56\2\uffff\1\60\1\63\1\uffff\1\67\1\uffff\1\72\1"+
		"\uffff\1\75\1\77\1\102\2\uffff\1\104\12\41\1\uffff\1\124\5\uffff\1\45"+
		"\26\uffff\1\130\5\uffff\1\132\3\uffff\5\41\1\140\7\41\11\uffff\4\41\1"+
		"\154\1\uffff\1\155\7\41\1\165\1\41\1\167\2\uffff\4\41\1\174\1\41\1\176"+
		"\1\uffff\1\41\1\uffff\3\41\1\u0083\1\uffff\1\u0084\1\uffff\1\41\1\u0086"+
		"\1\u0087\1\u0088\2\uffff\1\41\3\uffff\1\u008a\1\uffff";
	static final String DFA15_eofS =
		"\u008b\uffff";
	static final String DFA15_minS =
		"\1\11\2\75\1\46\2\uffff\1\75\1\53\1\uffff\1\55\1\uffff\1\52\1\uffff\1"+
		"\74\2\75\2\uffff\1\75\1\162\1\150\1\154\1\157\1\146\1\145\1\151\1\156"+
		"\1\157\1\150\1\uffff\1\75\5\uffff\1\60\26\uffff\1\75\5\uffff\1\75\3\uffff"+
		"\1\145\1\141\1\156\1\163\1\162\1\44\2\164\1\172\1\162\3\151\11\uffff\1"+
		"\141\1\162\1\164\1\145\1\44\1\uffff\1\44\1\165\1\145\1\165\1\157\1\144"+
		"\1\154\1\153\1\44\1\151\1\44\2\uffff\1\162\1\157\1\143\1\156\1\44\1\145"+
		"\1\44\1\uffff\1\156\1\uffff\1\156\1\146\1\164\1\44\1\uffff\1\44\1\uffff"+
		"\1\165\3\44\2\uffff\1\145\3\uffff\1\44\1\uffff";
	static final String DFA15_maxS =
		"\1\176\3\75\2\uffff\2\75\1\uffff\1\76\1\uffff\1\75\1\uffff\2\75\1\76\2"+
		"\uffff\1\75\1\162\1\157\1\154\1\157\1\156\1\145\1\164\1\156\1\157\1\150"+
		"\1\uffff\1\174\5\uffff\1\170\26\uffff\1\75\5\uffff\1\75\3\uffff\1\145"+
		"\1\141\1\156\1\163\1\162\1\172\2\164\1\172\1\162\3\151\11\uffff\1\141"+
		"\1\162\1\164\1\145\1\172\1\uffff\1\172\1\165\1\145\1\165\1\157\1\144\1"+
		"\154\1\153\1\172\1\151\1\172\2\uffff\1\162\1\157\1\143\1\156\1\172\1\145"+
		"\1\172\1\uffff\1\156\1\uffff\1\156\1\146\1\164\1\172\1\uffff\1\172\1\uffff"+
		"\1\165\3\172\2\uffff\1\145\3\uffff\1\172\1\uffff";
	static final String DFA15_acceptS =
		"\4\uffff\1\10\1\11\2\uffff\1\17\1\uffff\1\24\1\uffff\1\27\3\uffff\1\42"+
		"\1\43\13\uffff\1\63\1\uffff\1\67\1\70\1\71\1\72\1\73\1\uffff\1\74\1\100"+
		"\1\101\1\2\1\1\1\4\1\3\1\5\1\7\1\6\1\13\1\12\1\15\1\16\1\14\1\21\1\22"+
		"\1\23\1\20\1\26\1\77\1\25\1\uffff\1\33\1\30\1\35\1\34\1\37\1\uffff\1\36"+
		"\1\45\1\44\15\uffff\1\65\1\66\1\64\1\76\1\75\1\32\1\31\1\41\1\40\5\uffff"+
		"\1\53\13\uffff\1\52\1\54\7\uffff\1\47\1\uffff\1\51\4\uffff\1\61\1\uffff"+
		"\1\46\4\uffff\1\60\1\62\1\uffff\1\55\1\56\1\57\1\uffff\1\50";
	static final String DFA15_specialS =
		"\u008b\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\46\2\uffff\1\46\22\uffff\1\46\1\1\1\43\1\47\1\41\1\2\1\3\1\42\1\4"+
			"\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\44\11\45\1\uffff\1\14\1\15\1\16\1"+
			"\17\2\uffff\32\41\1\20\1\uffff\1\21\1\22\1\41\1\uffff\1\41\1\23\1\24"+
			"\1\41\1\25\1\26\2\41\1\27\10\41\1\30\1\31\1\41\1\32\1\33\1\34\3\41\1"+
			"\35\1\36\1\37\1\40",
			"\1\50",
			"\1\52",
			"\1\54\26\uffff\1\55",
			"",
			"",
			"\1\57",
			"\1\61\21\uffff\1\62",
			"",
			"\1\64\17\uffff\1\65\1\66",
			"",
			"\1\71\4\uffff\1\71\15\uffff\1\70",
			"",
			"\1\73\1\74",
			"\1\76",
			"\1\100\1\101",
			"",
			"",
			"\1\103",
			"\1\105",
			"\1\106\6\uffff\1\107",
			"\1\110",
			"\1\111",
			"\1\112\7\uffff\1\113",
			"\1\114",
			"\1\115\12\uffff\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"",
			"\1\122\76\uffff\1\123",
			"",
			"",
			"",
			"",
			"",
			"\10\126\40\uffff\1\125\37\uffff\1\125",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\127",
			"",
			"",
			"",
			"",
			"",
			"\1\131",
			"",
			"",
			"",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\166",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\175",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\177",
			"",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\u0085",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			"\1\u0089",
			"",
			"",
			"",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | ID | Character_constant | String | Dec | Oct | Hex | Comments | WS | INCLUDE );";
		}
	}

}
