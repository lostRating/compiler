grammar E ;
 
options{
	language = Java;
	output = AST ;
	ASTLabelType = CommonTree ;
	backtrack = true;
	memoize = true;
}
 
tokens
{
	GXX_program;
	GXX_declaration;
	GXX_function_definition;
	GXX_parameters;
	GXX_declarators;
	GXX_init_declarators;
	GXX_init_declarator;
	GXX_initializer;
	GXX_type_specifier;
	GXX_plain_declaration;
	GXX_declarator;
	GXX_plain_declarator;
	GXX_statement;
	GXX_expression_statement;
	GXX_compound_statement;
	GXX_selection_statement;
	GXX_iteration_statement;
	GXX_jump_statement;
	GXX_expression;
	GXX_assignment_expression;
	GXX_assignment_operator;
	GXX_constant_expression;
	GXX_logical_or_expression;
	GXX_logical_and_expression;
	GXX_inclusive_or_expression;
	GXX_exclusive_or_expression;
	GXX_and_expression;
	GXX_equality_expression;
	GXX_relational_expression;
	GXX_shift_expression;
	GXX_additive_expression;
	GXX_multiplicative_expression;
	GXX_cast_expression;
	GXX_type_name;
	GXX_unary_expression;
	GXX_postfix_expression;
	GXX_postfix;
	GXX_arguments;
	GXX_primary_expression;
	GXX_constant;
	GXX_identifier;
	GXX_character_constant;
	GXX_string;
	GXX_integer_constant;
	GXX_struct_inner;
	ONE;
	TWO;
	THREE;
	FOUR;
}

@lexer::header{
package compiler.ast;
}

@parser::header {  
package compiler.ast;
} 

program :
	a1=program_tmp  ->  ^(GXX_program $a1)  ;
	catch[RecognitionException e] {throw e;}

program_tmp :
	(declaration | function_definition)+  ;
	catch[RecognitionException e] {throw e;}
	
declaration :
	a1=type_specifier a2=init_declarators? ';'  ->  ^(GXX_declaration $a1 $a2?)  ;
	catch[RecognitionException e] {throw e;}
	
function_definition :
	a1=type_specifier a2=plain_declarator '(' a3=parameters? ')' a4=compound_statement  ->  ^(GXX_function_definition $a1 $a2 $a3? $a4)  ;
	catch[RecognitionException e] {throw e;}
	
parameters :
	plain_declaration (',' plain_declaration)*  ->  ^(GXX_parameters plain_declaration+)  ;
	catch[RecognitionException e] {throw e;}
	
declarators :
	declarator (',' declarator)*  ->  ^(GXX_declarators declarator+)  ;
	catch[RecognitionException e] {throw e;}
	
init_declarators :
	init_declarator (',' init_declarator)*  ->  ^(GXX_init_declarators init_declarator+)  ;
	catch[RecognitionException e] {throw e;}
	
init_declarator :
	a1=declarator ('=' a2=initializer)?  ->  ^(GXX_init_declarator $a1 $a2?)  ;
	catch[RecognitionException e] {throw e;}
	
initializer :
	a1=assignment_expression  ->  ^(GXX_initializer ONE $a1)  |
	'{' initializer (',' initializer)* '}'   ->  ^(GXX_initializer initializer+)  ;
	catch[RecognitionException e] {throw e;}
	
type_specifier :
	'void'  ->  ^(GXX_type_specifier 'void')  |
	'char'  ->  ^(GXX_type_specifier 'char')  |
	'int'  ->  ^(GXX_type_specifier 'int')  |
	a1=struct_or_union a2=identifier? '{' (type_specifier declarators ';')+ '}'  ->  ^(GXX_type_specifier ONE $a1 $a2? ^(GXX_struct_inner (type_specifier declarators)+))  |
	a1=struct_or_union a2=identifier  ->  ^(GXX_type_specifier $a1 $a2)  ;
	catch[RecognitionException e] {throw e;}
	
struct_or_union :
	'struct'  |
	'union'  ;
	catch[RecognitionException e] {throw e;}
	
plain_declaration :
	a1=type_specifier a2=declarator  ->  ^(GXX_plain_declaration $a1 $a2);
	catch[RecognitionException e] {throw e;}
	
declarator :
	a1=plain_declarator '(' a2=parameters? ')'  ->  ^(GXX_declarator ONE $a1 $a2?)  |
	a1=plain_declarator ('[' constant_expression ']')*  ->  ^(GXX_declarator $a1 constant_expression*)  ;
	catch[RecognitionException e] {throw e;}
	
plain_declarator :
	'*' a1=plain_declarator  ->  ^(GXX_plain_declarator '*' $a1)  |
	a1=identifier  ->  ^(GXX_plain_declarator $a1)  ;
	catch[RecognitionException e] {throw e;}

statement :
	a1=expression_statement  ->  ^(GXX_statement $a1)  |
	a1=compound_statement  ->  ^(GXX_statement $a1)  |
	a1=selection_statement  ->  ^(GXX_statement $a1)  |
	a1=iteration_statement  ->  ^(GXX_statement $a1)  |
	a1=jump_statement  ->  ^(GXX_statement $a1)  ;
	catch[RecognitionException e] {throw e;}

expression_statement :
	a1=expression? ';'  ->  ^(GXX_expression_statement $a1?)  ;
	catch[RecognitionException e] {throw e;}
	
compound_statement :
	'{' declaration* statement* '}'  ->  ^(GXX_compound_statement declaration* statement*)  ;
	catch[RecognitionException e] {throw e;}
	
selection_statement :
	'if' '(' a1=expression ')' a2=statement ('else' a3=statement)?  ->  ^(GXX_selection_statement $a1 $a2 $a3?)  ;
	catch[RecognitionException e] {throw e;}
	
iteration_statement :
	'while' '(' a1=expression ')' a2=statement  ->  ^(GXX_iteration_statement 'while' $a1 $a2) |
	'for' '(' e1 = expression? ';' e2 = expression? ';' e3 = expression? ')' a1=statement  ->  ^(GXX_iteration_statement 'for' (ONE $e1)? (TWO $e2)? (THREE $e3)? $a1)  ;
	catch[RecognitionException e] {throw e;}

jump_statement :
	'continue' ';'  ->  ^(GXX_jump_statement 'continue')  |
	'break' ';'  ->  ^(GXX_jump_statement 'break')  |
	'return' a1=expression? ';'  ->  ^(GXX_jump_statement 'return' $a1?)  ;
	catch[RecognitionException e] {throw e;}

expression :
	assignment_expression (',' assignment_expression)*  ->  ^(GXX_expression assignment_expression+)  ;
	catch[RecognitionException e] {throw e;}

assignment_expression :
	a1=unary_expression a2=assignment_operator a3=assignment_expression  ->  ^(GXX_assignment_expression $a1 $a2 $a3)  |
	a1=logical_or_expression  ->  ^(GXX_assignment_expression $a1)  ;
	catch[RecognitionException e] {throw e;}
	
assignment_operator :
	'='  |//->  ^(GXX_assignment_operator '=')  |
	'*=' |// ->  ^(GXX_assignment_operator '*=')  |
	'/='  |//->  ^(GXX_assignment_operator '/=')  |
	'%='  |//->  ^(GXX_assignment_operator '%=')  |
	'+='  |//->  ^(GXX_assignment_operator '+=')  |
	'-='  |//->  ^(GXX_assignment_operator '-=')  |
	'<<='  |//->  ^(GXX_assignment_operator '<<=')  |
	'>>='  |//->  ^(GXX_assignment_operator '>>=')  |
	'&='  |//->  ^(GXX_assignment_operator  '&=')  |
	'^='  |//->  ^(GXX_assignment_operator  '^=')  |
	'|='  ;//->  ^(GXX_assignment_operator  '|=')  ;
	catch[RecognitionException e] {throw e;}
	
constant_expression :
	a1=logical_or_expression  ->  ^(GXX_constant_expression $a1)  ;
	catch[RecognitionException e] {throw e;}
	
logical_or_expression :
	logical_and_expression ('||' logical_and_expression)*  ->  ^(GXX_logical_or_expression logical_and_expression ('||' logical_and_expression)*);
	catch[RecognitionException e] {throw e;}
	
logical_and_expression :
	inclusive_or_expression ('&&' inclusive_or_expression)*  ->  ^(GXX_logical_and_expression inclusive_or_expression ('&&' inclusive_or_expression)*)  ;
	catch[RecognitionException e] {throw e;}
 
inclusive_or_expression :
	exclusive_or_expression ('|' exclusive_or_expression)*  ->  ^(GXX_inclusive_or_expression exclusive_or_expression ('|' exclusive_or_expression)*)  ;
	catch[RecognitionException e] {throw e;}
 
exclusive_or_expression :
	and_expression ('^' and_expression)*  ->  ^(GXX_exclusive_or_expression and_expression ('^' and_expression)*)  ;
	catch[RecognitionException e] {throw e;}
 
and_expression :
	equality_expression ('&' equality_expression)*  ->  ^(GXX_and_expression equality_expression ('&' equality_expression)*)  ;
	catch[RecognitionException e] {throw e;}
 
equality_expression :
	relational_expression (equality_operator relational_expression)*  ->  ^(GXX_equality_expression relational_expression (equality_operator relational_expression)*) ;
	catch[RecognitionException e] {throw e;}
	
equality_operator :
	'==' |
	'!=' ;
	catch[RecognitionException e] {throw e;}
	
relational_expression :
	shift_expression (relational_operator shift_expression)*  ->  ^(GXX_relational_expression shift_expression (relational_operator shift_expression)*)  ;
	catch[RecognitionException e] {throw e;}
	
relational_operator :
	'<' |
	'>' |
	'<=' |
	'>=' ;
	catch[RecognitionException e] {throw e;}
	
shift_expression :
	additive_expression (shift_operator additive_expression)*  ->  ^(GXX_shift_expression additive_expression (shift_operator additive_expression)*)  ;
	catch[RecognitionException e] {throw e;}
	
shift_operator :
	'<<' |
	'>>' ;
	catch[RecognitionException e] {throw e;}
	
additive_expression :
	multiplicative_expression (additive_operator multiplicative_expression)*  ->  ^(GXX_additive_expression multiplicative_expression (additive_operator multiplicative_expression)*)  ;
	catch[RecognitionException e] {throw e;}
	
additive_operator :
	'+' |
	'-'  ;
	catch[RecognitionException e] {throw e;}
	
multiplicative_expression :
	cast_expression (multiplicative_operator cast_expression)*  ->  ^(GXX_multiplicative_expression cast_expression (multiplicative_operator cast_expression)*)  ;
	catch[RecognitionException e] {throw e;}
	
multiplicative_operator :
	'*' |
	'/' |
	 '%' ;
	catch[RecognitionException e] {throw e;}
	
cast_expression :
	a1=unary_expression  ->  ^(GXX_cast_expression $a1)|
	'(' a1=typename ')' a2=cast_expression  ->  ^(GXX_cast_expression $a1 $a2)  ;
	catch[RecognitionException e] {throw e;}
	
typename :
	a1=type_specifier '*'*  ->  ^(GXX_type_name $a1 '*'*)  ;
	catch[RecognitionException e] {throw e;}

unary_expression :
	a1=postfix_expression  ->  ^(GXX_unary_expression $a1)  |
	'++' a1=unary_expression  ->  ^(GXX_unary_expression '++' $a1)  |
	'--' a1=unary_expression  ->  ^(GXX_unary_expression '--' $a1)  |
	a1=unary_operator a2=cast_expression  ->  ^(GXX_unary_expression $a1 $a2)  |
	'sizeof' a1=unary_expression  ->  ^(GXX_unary_expression ONE $a1)  |
	'sizeof' '(' a1=typename ')'  ->  ^(GXX_unary_expression TWO $a1)  ;
	catch[RecognitionException e] {throw e;}

unary_operator :
	'&' |
	'*' |
	'+' |
	'-' |
	'~' |
	'!' ;
	catch[RecognitionException e] {throw e;}
	
postfix_expression :
	a1=primary_expression postfix*  ->  ^(GXX_postfix_expression $a1 postfix*)  ;
	catch[RecognitionException e] {throw e;}
	
postfix :
	'[' a1=expression ']'  ->  ^(GXX_postfix ONE $a1)  |
	'(' a1=arguments? ')'  ->  ^(GXX_postfix TWO $a1?)  |
	'.' a1=identifier  ->  ^(GXX_postfix THREE $a1)  |
	'->' a1=identifier  ->  ^(GXX_postfix FOUR $a1)  |
	'++'  ->  ^(GXX_postfix '++')  |
	'--'  ->  ^(GXX_postfix '--')  ;
	catch[RecognitionException e] {throw e;}

arguments :
	assignment_expression (',' assignment_expression)*  ->  ^(GXX_arguments assignment_expression+);
	catch[RecognitionException e] {throw e;}
	
primary_expression :
	a1=identifier  ->  ^(GXX_primary_expression ONE $a1)  |
	a1=constant  ->  ^(GXX_primary_expression TWO $a1)  |
	a1=string  ->  ^(GXX_primary_expression THREE $a1)  |
	'(' a1=expression ')'  ->  ^(GXX_primary_expression FOUR $a1)  ;
	catch[RecognitionException e] {throw e;}
	
constant :
	a1=integer_constant  ->  ^(GXX_constant ONE $a1)  |
	a1=character_constant  -> ^(GXX_constant TWO $a1)  ;
	catch[RecognitionException e] {throw e;}

identifier :
	ID  ->  ^(GXX_identifier ID);
	catch[RecognitionException e] {throw e;}
	
ID :
	('A'..'Z' | 'a'..'z' | '_' | '$') ('A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9')* ;
	//catch[RecognitionException e] {throw e;}
	
character_constant :
	Character_constant  ->  ^(GXX_character_constant Character_constant);
	catch[RecognitionException e] {throw e;}
	
Character_constant :
	'\'' ( ('\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')) | ~('\''|'\\') ) '\''  |
	'\'' '\\' ('0'..'7')('0'..'7')('0'..'7') '\''  |
	'\'' '\\' ('0x' | '0X') DigitHex DigitHex '\''  ;
	//catch[RecognitionException e] {throw e;}

string :
	String  ->  ^(GXX_string String);
	catch[RecognitionException e] {throw e;}
	
String :
	'\"' ( ('\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')) | ~('\\'|'\"') )* '\"' ;
	//catch[RecognitionException e] {throw e;}

integer_constant :
	Dec  ->  ^(GXX_integer_constant ONE Dec)  |
	Oct  ->  ^(GXX_integer_constant TWO Oct)  |
	Hex  ->  ^(GXX_integer_constant THREE Hex)   ;
	catch[RecognitionException e] {throw e;}

Dec :
	'0' |
	('1'..'9') ('0'..'9')* ;
	//catch[RecognitionException e] {throw e;}

Oct :
	'0'('0'..'7')+;
	//catch[RecognitionException e] {throw e;}

Hex :
	('0x'|'0X')(DigitHex)+;
	//catch[RecognitionException e] {throw e;}
	
fragment DigitHex :
	Digit |
	'A'..'F' |
	'a'..'f' ;
	//catch[RecognitionException e] {throw e;}

//fragment IdFirst :
//	Letter |
//	'_' |
//	'$' ;

fragment Letter :
	'a'..'z' |
	'A'..'Z' ;
	//catch[RecognitionException e] {throw e;}

fragment Digit :
	'0'..'9' ;
	//catch[RecognitionException e] {throw e;}
	
Comments :
	('/*' .* '*/') {skip();} |
	('//' ~('\n' | '\r')*) {skip();} ;
	//catch[RecognitionException e] {throw e;}
	
WS :
	(' ' | '\t' | '\n' | '\r') {skip();} ;
	//catch[RecognitionException e] {throw e;}
	
INCLUDE :
	('#include')~('\n' | '\r')* {skip();};