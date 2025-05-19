parser grammar AngulerParser;

options { tokenVocab = AngulerLexer; }

/* Top-Level Structure */
prog
:anguler_import+
component_declaration+
EOF
;

/* Import Statements */
anguler_import
:IMPORT OPEN_BRACE IDENTIFIER CLOSE_BRACE FROM STRING_LITERAL SEMICOLON;


/* Component System */
component_declaration
:COMPONENT OPEN_PAREN component_metadata CLOSE_PAREN
class_declaration
;


component_metadata
:OPEN_BRACE (metadata_property (COMMA metadata_property)*) CLOSE_BRACE;



metadata_property
: selector_property                                                       #metadataSelector
| standalone_property                                                     #metadataStandalone
| imports_property                                                        #metadataImports
| template_property                                                       #metadataTemplate
| templateUrl_property                                                    #metadataTemplateUrl
| styles_property                                                         #metadataStyles
| styleUrls_property                                                      #metadataStyleUrls
;

// Specific property types
selector_property: SELECTOR COLON STRING_LITERAL;

standalone_property: STANDALONE COLON BOOLEAN;

imports_property: IMPORTS COLON  (imports_array | BINDING ) ;

template_property: TEMPLATE COLON TEMPLATE_LITERAL;

templateUrl_property: TEMPLATE_URL COLON STRING_LITERAL;

styles_property: STYLES COLON (STRING_LITERAL | array);

styleUrls_property: STYLE_URLS COLON imports_array;


/* Type System */
type_annotation
:base_type_annotation (PIPE base_type_annotation)*;

base_type_annotation
: IDENTIFIER                                                            #simpleType
| primitive_type                                                        #primitiveType
| NULL                                                                  #nullType
| VOID                                                                  #voidType
| structured_type                                                       #structuredType
| array_type                                                            #arrayType;


primitive_type
: STRING
| NUMBER
| BOOLEAN
| ANY
|UNDEFINED
;

array_type
:IDENTIFIER OPEN_BRACKET CLOSE_BRACKET;

structured_type
:OPEN_BRACE type_pair (SEMICOLON type_pair)* SEMICOLON? CLOSE_BRACE;

type_pair
:IDENTIFIER COLON base_type_annotation;

/* Class System */
class_declaration
:EXPORT? CLASS IDENTIFIER OPEN_BRACE class_body CLOSE_BRACE;


class_body
:(instruction)*;


method_declaration
:IDENTIFIER method_body;


method_body
:OPEN_PAREN parameter_list? CLOSE_PAREN
      (COLON type_annotation)?
OPEN_BRACE instruction* CLOSE_BRACE;


/* Functions */
function_declaration
:IDENTIFIER function_body;


function_body
:OPEN_PAREN parameter_list? CLOSE_PAREN
OPEN_BRACE instruction* CLOSE_BRACE;


parameter_list
:parameter (COMMA parameter)*;

parameter
:IDENTIFIER COLON (base_type_annotation | structured_type);


function_call
:IDENTIFIER OPEN_PAREN (value (COMMA value)*)? CLOSE_PAREN;


/* Variables and Assignments */

declaraiton_keywords
:CONST
| LET
| VAR
;


variable_declaration
:declaraiton_keywords? IDENTIFIER (COLON type_annotation)? (EQUAL value)? SEMICOLON;

assignment
: member_expression EQUAL value SEMICOLON?
| IDENTIFIER EQUAL value SEMICOLON?
;


/* Expressions and Values */
value
: literal_value                                                             #literalValue
| IDENTIFIER                                                                #identifierValue
| NULL                                                                      #nullValue
| json_object                                                               #objectValue
| array                                                                     #arrayValue
| function_call                                                             #functionCallValue
| OPEN_PAREN expression CLOSE_PAREN                                         #parenthesizedValue
;


literal_value
: DECIMAL_INTEGER_LITERAL
| FLOAT_LITERAL
| STRING_LITERAL
| TEMPLATE_LITERAL
;




member_expression
:value dot_value                                                          #memberAccess
|value OPEN_BRACKET expression CLOSE_BRACKET                              #computedMemberAccess
;

dot_value
:DOT IDENTIFIER                                                           #methodCallOrPropertyAccess
    ;

arithmetic_expression
:value (MUL | SLASH | MOD) value                                          #multiplicativeExpression
|value (SUM | MIN) value                                                  #additiveExpression
;


unary_expression
: (SUM | MIN) value                                                       #unaryPlusMinusExpression
| (INCREMENT | DECREMENT) value                                           #prefixUnaryOperation
| value (INCREMENT | DECREMENT)                                           #postfixUnaryOperation
| NOT value                                                               #notExpression
;

relational_expression
: value (OPENTAG | CLOSETAG | LESS_EQUAL | GRETER_EQUAL) value            #comparisonExpression
;

equality_expression
:value (IS_EQUAL | NOT_EQUAL | IS_EQUAL_TYPE | NOT_EQUAL_TYPE) value      #equalityComparison
;


logical_expression
: value AND value                                                         #logicalAndExpression
| value OR value                                                          #logicalOrExpression
;


conditional_expression
: value QUESTION expression COLON expression  #ternaryExpression
;


expression
: conditional_expression                                                   #exprConditional
| logical_expression                                                       #exprLogical
| relational_expression                                                    #exprRelational
| equality_expression                                                      #exprEquality
| arithmetic_expression                                                    #exprArithmetic
| unary_expression                                                         #exprUnary
| member_expression                                                        #exprMemberAccess
| value                                                                    #exprValue
;


/* Data Structures */
json_object
: OPEN_BRACE (json_pair (COMMA json_pair)*)? CLOSE_BRACE;

json_pair
: (IDENTIFIER | STRING_LITERAL) COLON value ;

imports_array
: OPEN_BRACKET (value (COMMA value)*)? CLOSE_BRACKET;

array
:OPEN_BRACKET (value (COMMA value)*)? CLOSE_BRACKET;

/* Statements */
instruction
: function_call SEMICOLON                                           #functionCallStatement
| variable_declaration                                              #declarationStatement
| assignment                                                        #assignmentStatement
| class_declaration                                                 #classDeclaration
| function_declaration                                              #functionDeclaration
| EXPORT variable_declaration                                       #exportStatement
|conditional_statements                                            #conditionalStatement
|interface_Declaration                                              #interfaceDeclaration
|generic_Type                                                       #genericType
|method_declaration                                                 #methodDeclaration
;


conditional_statements
: if_statement                                                       #stmtIf
| switch_statement                                                   #stmtSwitch
| while_statement                                                    #stmtWhile
| do_while_statement                                                 #stmtDoWhile
| for_statement                                                      #stmtFor
| continue_Statement                                                 #stmtContinue
| return_Statement                                                   #stmtReturn
| break_statement                                                    #stmtBreak
;



block
:OPEN_BRACE instruction* CLOSE_BRACE;


if_statement
:IF OPEN_PAREN value CLOSE_PAREN block (ELSE if_statement | ELSE block)?;


for_statement
: FOR OPEN_PAREN
(variable_declaration | expressionSequence | SEMICOLON)
expressionSequence? SEMICOLON
expressionSequence?
CLOSE_PAREN block
;



switch_statement
:SWITCH (OPEN_PAREN value CLOSE_PAREN | EVENT_BINDING) OPEN_BRACE switch_body CLOSE_BRACE;


switch_body
:(switch_case | switch_default)*;


switch_case
:CASE value COLON instruction*;



switch_default
: DEFAULT COLON instruction*;


while_statement
: WHILE OPEN_PAREN value CLOSE_PAREN block;


do_while_statement
: DO block WHILE OPEN_PAREN value CLOSE_PAREN SEMICOLON;


continue_Statement
:CONTINUE (IDENTIFIER)? eos
;

return_Statement
: RETURN  (expressionSequence)? eos?
;


break_statement
: BREAK SEMICOLON
;



expressionSequence
: value (',' value)*
| IDENTIFIER
;

interface_Declaration
: INTERFACE IDENTIFIER structured_type;

generic_Type
: IDENTIFIER OPENTAG type_annotation (',' type_annotation)* '>';

eos
:SEMICOLON
|EOF
;



/* Template System */
html_value
: (open_tag html_value* close_tag?)                                         #nestedHtml
| single_tag                                                                #selfClosingTag
| INTERPOLATION                                                             #interpolation
| HTML_TEXT                                                                 #textContent
| template_variable                                                         #templateVariable
| ng_content                                                                #ngContent
| ng_template                                                               #ngTemplate
;




tags
: DIV_TAG
| H1_TAG
| H2_TAG
| H3_TAG
| P_TAG
| IMG_TAG
| A_TAG
| SPAN_TAG
| BUTTON_TAG
;



open_tag
:(OPENTAG | HTML_OPENTAG)
(tags | IDENTIFIER)
html_attribute* CLOSETAG
;




attrs
:STYLE_ATTR
| ALT_ATTR
| SRC_ATTR
| HREF_ATTR
;





html_attribute
: BINDING EQUAL expression                                              #propertyBinding
| EVENT_BINDING EQUAL expression                                        #eventBinding
;






close_tag
:(OPENTAG | HTML_OPENTAG) SLASH
(tags | IDENTIFIER)
CLOSETAG
;




single_tag
:(OPENTAG | HTML_OPENTAG)
(tags | IDENTIFIER)
html_attribute* SLASH CLOSETAG
;



template_variable
:HASH IDENTIFIER
;



ng_content
:OPENTAG NG_CONTENT html_attribute* CLOSETAG
;




ng_template
:OPENTAG NG_TEMPLATE html_attribute* CLOSETAG html_value* OPENTAG SLASH ng_template CLOSETAG   #ngTemplateWithContent
|OPENTAG NG_TEMPLATE html_attribute* SLASH CLOSETAG                                            #ngTemplateSelfClosing;