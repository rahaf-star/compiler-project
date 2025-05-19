// Generated from C:/Users/Lenovo/Desktop/compiler/compiler/src/antlr/AngulerParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngulerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_BRACE=1, CLOSE_BRACE=2, OPEN_PAREN=3, CLOSE_PAREN=4, OPEN_BRACKET=5, 
		CLOSE_BRACKET=6, COMMA=7, SEMICOLON=8, DOT=9, COLON=10, QUOTE=11, EQUAL=12, 
		IS_EQUAL=13, NOT_EQUAL=14, IS_EQUAL_TYPE=15, NOT_EQUAL_TYPE=16, BACK_SLASH=17, 
		ARROW=18, COMPONENT=19, ANGULAR=20, INCREMENT=21, DECREMENT=22, VOID=23, 
		OPENTAG=24, CLOSETAG=25, LESS_EQUAL=26, GRETER_EQUAL=27, SLASH=28, OPERATOR=29, 
		DOLLAR=30, AND=31, OR=32, PIPE=33, TRY=34, CATCH=35, FINALLY=36, NEW=37, 
		THIS=38, TRUE=39, TYPE=40, INTERFACE=41, IMPLEMENTS=42, EXTENDS=43, ABSTRACT=44, 
		READONLY=45, ASYNC=46, AWAIT=47, OF=48, IN=49, INSTANCEOF=50, TYPEOF=51, 
		DELETE=52, PLUS=53, MINUS=54, MULT=55, MOD=56, BIT_AND=57, BIT_XOR=58, 
		BIT_NOT=59, SHIFT_LEFT=60, SHIFT_RIGHT=61, UNSIGNED_SHIFT_RIGHT=62, QUESTION=63, 
		ELLIPSIS=64, PLUS_EQUAL=65, MINUS_EQUAL=66, MULT_EQUAL=67, DIV_EQUAL=68, 
		MOD_EQUAL=69, AND_EQUAL=70, OR_EQUAL=71, XOR_EQUAL=72, SHIFT_LEFT_EQUAL=73, 
		SHIFT_RIGHT_EQUAL=74, UNSIGNED_SHIFT_RIGHT_EQUAL=75, GET=76, SET=77, BACKTICK=78, 
		TEMPLATE_STRING_EXPRESSION=79, ANY=80, UNKNOWN=81, NEVER=82, BOOLEAN=83, 
		NUMBER=84, STRING=85, SYMBOL=86, OBJECT=87, AT=88, NAMESPACE=89, SELECTOR=90, 
		STANDALONE=91, IMPORTS=92, TEMPLATE=93, TEMPLATE_URL=94, STYLES=95, STYLE_URLS=96, 
		STYLE_URL=97, NG_IF=98, NG_FOR=99, NG_CLASS=100, NG_STYLE=101, NG_MODEL=102, 
		DIRECTIVE=103, STYLE_ATTR=104, ALT_ATTR=105, SRC_ATTR=106, HREF_ATTR=107, 
		DIV_TAG=108, H1_TAG=109, H2_TAG=110, H3_TAG=111, P_TAG=112, IMG_TAG=113, 
		A_TAG=114, SPAN_TAG=115, BUTTON_TAG=116, BINDING=117, EVENT_BINDING=118, 
		INTERPOLATION=119, FUNCTION=120, PUBLIC=121, PRIVATE=122, PROTECTED=123, 
		CLASS=124, IMPORT=125, FROM=126, EXPORT=127, IF=128, ELSE=129, FOR=130, 
		WHILE=131, DO=132, SWITCH=133, CASE=134, DEFAULT=135, RETURN=136, BREAK=137, 
		CONTINUE=138, FALSE=139, NULL=140, UNDEFINED=141, CONST=142, LET=143, 
		VAR=144, IDENTIFIER=145, STRING_LITERAL=146, TEMPLATE_LITERAL=147, DECIMAL_INTEGER_LITERAL=148, 
		HEX_INTEGER_LITERAL=149, OCTAL_INTEGER_LITERAL=150, BINARY_INTEGER_LITERAL=151, 
		FLOAT_LITERAL=152, LINE_COMMENT=153, BLOCK_COMMENT=154, WS=155, HTML_WS=156, 
		HTML_OPEN_BRACE=157, HTML_CLOSE_BRACE=158, HTML_CLOSE_PAREN=159, HTML_OPENTAG=160, 
		HTML_TEXT=161, BIT_OR=162, NOT=163;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_empty_statement = 2, RULE_block_statement = 3, 
		RULE_expression_statement = 4, RULE_variable_statement = 5, RULE_export_statement = 6, 
		RULE_if_statement = 7, RULE_switch_statement = 8, RULE_case_clause = 9, 
		RULE_default_clause = 10, RULE_for_statement = 11, RULE_while_statement = 12, 
		RULE_do_while_statement = 13, RULE_try_statement = 14, RULE_catch_clause = 15, 
		RULE_finally_clause = 16, RULE_return_statement = 17, RULE_break_statement = 18, 
		RULE_continue_statement = 19, RULE_expression = 20, RULE_binary_operator = 21, 
		RULE_unary_operator = 22, RULE_argument_list = 23, RULE_anguler_import = 24, 
		RULE_component_declaration = 25, RULE_component_metadata = 26, RULE_metadata_property = 27, 
		RULE_type_annotation = 28, RULE_base_type_annotation = 29, RULE_array_type = 30, 
		RULE_structured_type = 31, RULE_type_pair = 32, RULE_class_declaration = 33, 
		RULE_class_body = 34, RULE_method_declaration = 35, RULE_function_declaration = 36, 
		RULE_function_body = 37, RULE_parameter_list = 38, RULE_parameter = 39, 
		RULE_function_call = 40, RULE_variable_declaration = 41, RULE_assignment = 42, 
		RULE_value = 43, RULE_dot_value = 44, RULE_logical_operator = 45, RULE_json_object = 46, 
		RULE_json_pair = 47, RULE_imports_array = 48, RULE_array = 49, RULE_instruction = 50, 
		RULE_html_value = 51, RULE_open_tag = 52, RULE_html_attribute = 53, RULE_close_tag = 54, 
		RULE_single_tag = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "empty_statement", "block_statement", "expression_statement", 
			"variable_statement", "export_statement", "if_statement", "switch_statement", 
			"case_clause", "default_clause", "for_statement", "while_statement", 
			"do_while_statement", "try_statement", "catch_clause", "finally_clause", 
			"return_statement", "break_statement", "continue_statement", "expression", 
			"binary_operator", "unary_operator", "argument_list", "anguler_import", 
			"component_declaration", "component_metadata", "metadata_property", "type_annotation", 
			"base_type_annotation", "array_type", "structured_type", "type_pair", 
			"class_declaration", "class_body", "method_declaration", "function_declaration", 
			"function_body", "parameter_list", "parameter", "function_call", "variable_declaration", 
			"assignment", "value", "dot_value", "logical_operator", "json_object", 
			"json_pair", "imports_array", "array", "instruction", "html_value", "open_tag", 
			"html_attribute", "close_tag", "single_tag"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", null, "'['", "']'", "','", "';'", "'.'", "':'", 
			"'''", "'='", "'=='", "'!='", "'==='", "'!=='", "'\\'", "'=>'", "'@Component'", 
			"'@angular'", "'++'", "'--'", "'void'", null, "'>'", "'<='", "'>='", 
			"'/'", null, "'$'", "'&&'", "'||'", "'|'", "'try'", "'catch'", "'finally'", 
			"'new'", "'this'", "'true'", "'type'", "'interface'", "'implements'", 
			"'extends'", "'abstract'", "'readonly'", "'async'", "'await'", "'of'", 
			"'in'", "'instanceof'", "'typeof'", "'delete'", "'+'", "'-'", "'*'", 
			"'%'", "'&'", "'^'", "'~'", "'<<'", "'>>'", "'>>>'", "'?'", "'...'", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", 
			"'>>='", "'>>>='", "'get'", "'set'", "'`'", "'${'", "'any'", "'unknown'", 
			"'never'", "'boolean'", "'number'", "'string'", "'symbol'", "'object'", 
			"'@'", "'namespace'", "'selector'", "'standalone'", "'imports'", "'template'", 
			"'templateUrl'", "'styles'", "'styleUrls'", "'styleUrl'", "'*ngIf'", 
			"'*ngFor'", "'[ngClass]'", "'[ngStyle]'", "'[(ngModel)]'", null, "'style'", 
			"'alt'", "'src'", "'href'", "'div'", "'h1'", "'h2'", "'h3'", "'p'", "'img'", 
			"'a'", "'span'", "'button'", null, null, null, "'function'", "'public'", 
			"'private'", "'protectd'", "'class'", "'import'", "'from'", "'export'", 
			"'if'", "'else'", "'for'", "'while'", "'do'", "'switch'", "'case'", "'default'", 
			"'return'", "'break'", "'continue'", "'false'", "'null'", "'undefined'", 
			"'const'", "'let'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_BRACE", "CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "COMMA", "SEMICOLON", "DOT", "COLON", "QUOTE", "EQUAL", 
			"IS_EQUAL", "NOT_EQUAL", "IS_EQUAL_TYPE", "NOT_EQUAL_TYPE", "BACK_SLASH", 
			"ARROW", "COMPONENT", "ANGULAR", "INCREMENT", "DECREMENT", "VOID", "OPENTAG", 
			"CLOSETAG", "LESS_EQUAL", "GRETER_EQUAL", "SLASH", "OPERATOR", "DOLLAR", 
			"AND", "OR", "PIPE", "TRY", "CATCH", "FINALLY", "NEW", "THIS", "TRUE", 
			"TYPE", "INTERFACE", "IMPLEMENTS", "EXTENDS", "ABSTRACT", "READONLY", 
			"ASYNC", "AWAIT", "OF", "IN", "INSTANCEOF", "TYPEOF", "DELETE", "PLUS", 
			"MINUS", "MULT", "MOD", "BIT_AND", "BIT_XOR", "BIT_NOT", "SHIFT_LEFT", 
			"SHIFT_RIGHT", "UNSIGNED_SHIFT_RIGHT", "QUESTION", "ELLIPSIS", "PLUS_EQUAL", 
			"MINUS_EQUAL", "MULT_EQUAL", "DIV_EQUAL", "MOD_EQUAL", "AND_EQUAL", "OR_EQUAL", 
			"XOR_EQUAL", "SHIFT_LEFT_EQUAL", "SHIFT_RIGHT_EQUAL", "UNSIGNED_SHIFT_RIGHT_EQUAL", 
			"GET", "SET", "BACKTICK", "TEMPLATE_STRING_EXPRESSION", "ANY", "UNKNOWN", 
			"NEVER", "BOOLEAN", "NUMBER", "STRING", "SYMBOL", "OBJECT", "AT", "NAMESPACE", 
			"SELECTOR", "STANDALONE", "IMPORTS", "TEMPLATE", "TEMPLATE_URL", "STYLES", 
			"STYLE_URLS", "STYLE_URL", "NG_IF", "NG_FOR", "NG_CLASS", "NG_STYLE", 
			"NG_MODEL", "DIRECTIVE", "STYLE_ATTR", "ALT_ATTR", "SRC_ATTR", "HREF_ATTR", 
			"DIV_TAG", "H1_TAG", "H2_TAG", "H3_TAG", "P_TAG", "IMG_TAG", "A_TAG", 
			"SPAN_TAG", "BUTTON_TAG", "BINDING", "EVENT_BINDING", "INTERPOLATION", 
			"FUNCTION", "PUBLIC", "PRIVATE", "PROTECTED", "CLASS", "IMPORT", "FROM", 
			"EXPORT", "IF", "ELSE", "FOR", "WHILE", "DO", "SWITCH", "CASE", "DEFAULT", 
			"RETURN", "BREAK", "CONTINUE", "FALSE", "NULL", "UNDEFINED", "CONST", 
			"LET", "VAR", "IDENTIFIER", "STRING_LITERAL", "TEMPLATE_LITERAL", "DECIMAL_INTEGER_LITERAL", 
			"HEX_INTEGER_LITERAL", "OCTAL_INTEGER_LITERAL", "BINARY_INTEGER_LITERAL", 
			"FLOAT_LITERAL", "LINE_COMMENT", "BLOCK_COMMENT", "WS", "HTML_WS", "HTML_OPEN_BRACE", 
			"HTML_CLOSE_BRACE", "HTML_CLOSE_PAREN", "HTML_OPENTAG", "HTML_TEXT", 
			"BIT_OR", "NOT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngulerParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngulerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngulerParser.EOF, 0); }
		public List<Anguler_importContext> anguler_import() {
			return getRuleContexts(Anguler_importContext.class);
		}
		public Anguler_importContext anguler_import(int i) {
			return getRuleContext(Anguler_importContext.class,i);
		}
		public List<Component_declarationContext> component_declaration() {
			return getRuleContexts(Component_declarationContext.class);
		}
		public Component_declarationContext component_declaration(int i) {
			return getRuleContext(Component_declarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(112);
				anguler_import();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPONENT) {
				{
				{
				setState(118);
				component_declaration();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 603482504692760618L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 550057636825L) != 0)) {
				{
				{
				setState(124);
				statement();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Variable_statementContext variable_statement() {
			return getRuleContext(Variable_statementContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Export_statementContext export_statement() {
			return getRuleContext(Export_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				block_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				switch_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				for_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				while_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				do_while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				try_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
				return_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(140);
				break_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(141);
				continue_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(142);
				expression_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(143);
				variable_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(144);
				class_declaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(145);
				function_declaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(146);
				export_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Empty_statementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public Empty_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterEmpty_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitEmpty_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitEmpty_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_statementContext empty_statement() throws RecognitionException {
		Empty_statementContext _localctx = new Empty_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_empty_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_statementContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(OPEN_BRACE);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 603482504692760618L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 550057636825L) != 0)) {
				{
				{
				setState(152);
				statement();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExpression_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			expression(0);
			setState(161);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_statementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterVariable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitVariable_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitVariable_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_statementContext variable_statement() throws RecognitionException {
		Variable_statementContext _localctx = new Variable_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			variable_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Export_statementContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngulerParser.EXPORT, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Export_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Export_statementContext export_statement() throws RecognitionException {
		Export_statementContext _localctx = new Export_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_export_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(EXPORT);
			setState(166);
			variable_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngulerParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngulerParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IF);
			setState(169);
			match(OPEN_PAREN);
			setState(170);
			expression(0);
			setState(171);
			match(CLOSE_PAREN);
			setState(172);
			statement();
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(173);
				match(ELSE);
				setState(174);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(AngulerParser.SWITCH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public List<Case_clauseContext> case_clause() {
			return getRuleContexts(Case_clauseContext.class);
		}
		public Case_clauseContext case_clause(int i) {
			return getRuleContext(Case_clauseContext.class,i);
		}
		public Default_clauseContext default_clause() {
			return getRuleContext(Default_clauseContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(SWITCH);
			setState(178);
			match(OPEN_PAREN);
			setState(179);
			expression(0);
			setState(180);
			match(CLOSE_PAREN);
			setState(181);
			match(OPEN_BRACE);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(182);
				case_clause();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(188);
				default_clause();
				}
			}

			setState(191);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_clauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(AngulerParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterCase_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitCase_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitCase_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_clauseContext case_clause() throws RecognitionException {
		Case_clauseContext _localctx = new Case_clauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(CASE);
			setState(194);
			expression(0);
			setState(195);
			match(COLON);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 603482504692760618L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 550057636825L) != 0)) {
				{
				{
				setState(196);
				statement();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_clauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(AngulerParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Default_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDefault_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDefault_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDefault_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_clauseContext default_clause() throws RecognitionException {
		Default_clauseContext _localctx = new Default_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_default_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(DEFAULT);
			setState(203);
			match(COLON);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 603482504692760618L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 550057636825L) != 0)) {
				{
				{
				setState(204);
				statement();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AngulerParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(AngulerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngulerParser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(AngulerParser.IN, 0); }
		public TerminalNode VAR() { return getToken(AngulerParser.VAR, 0); }
		public TerminalNode LET() { return getToken(AngulerParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngulerParser.CONST, 0); }
		public TerminalNode OF() { return getToken(AngulerParser.OF, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_statement);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(FOR);
				setState(211);
				match(OPEN_PAREN);
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(212);
					variable_declaration();
					}
					break;
				case 2:
					{
					setState(213);
					expression(0);
					}
					break;
				}
				setState(216);
				match(SEMICOLON);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 603482487512891434L) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 8393185L) != 0)) {
					{
					setState(217);
					expression(0);
					}
				}

				setState(220);
				match(SEMICOLON);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 603482487512891434L) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 8393185L) != 0)) {
					{
					setState(221);
					expression(0);
					}
				}

				setState(224);
				match(CLOSE_PAREN);
				setState(225);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(FOR);
				setState(227);
				match(OPEN_PAREN);
				setState(228);
				_la = _input.LA(1);
				if ( !(((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				match(IDENTIFIER);
				setState(230);
				match(IN);
				setState(231);
				expression(0);
				setState(232);
				match(CLOSE_PAREN);
				setState(233);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(FOR);
				setState(236);
				match(OPEN_PAREN);
				setState(237);
				_la = _input.LA(1);
				if ( !(((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				match(IDENTIFIER);
				setState(239);
				match(OF);
				setState(240);
				expression(0);
				setState(241);
				match(CLOSE_PAREN);
				setState(242);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AngulerParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(WHILE);
			setState(247);
			match(OPEN_PAREN);
			setState(248);
			expression(0);
			setState(249);
			match(CLOSE_PAREN);
			setState(250);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(AngulerParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AngulerParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDo_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(DO);
			setState(253);
			statement();
			setState(254);
			match(WHILE);
			setState(255);
			match(OPEN_PAREN);
			setState(256);
			expression(0);
			setState(257);
			match(CLOSE_PAREN);
			setState(258);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Try_statementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(AngulerParser.TRY, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Catch_clauseContext catch_clause() {
			return getRuleContext(Catch_clauseContext.class,0);
		}
		public Finally_clauseContext finally_clause() {
			return getRuleContext(Finally_clauseContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTry_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTry_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(TRY);
			setState(261);
			block_statement();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(262);
				catch_clause();
				}
			}

			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(265);
				finally_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(AngulerParser.CATCH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterCatch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitCatch_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitCatch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clauseContext catch_clause() throws RecognitionException {
		Catch_clauseContext _localctx = new Catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(CATCH);
			setState(269);
			match(OPEN_PAREN);
			setState(270);
			match(IDENTIFIER);
			setState(271);
			match(COLON);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE || _la==VOID || _la==NULL || _la==IDENTIFIER) {
				{
				setState(272);
				type_annotation();
				}
			}

			setState(275);
			match(CLOSE_PAREN);
			setState(276);
			block_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Finally_clauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(AngulerParser.FINALLY, 0); }
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Finally_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFinally_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFinally_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFinally_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_clauseContext finally_clause() throws RecognitionException {
		Finally_clauseContext _localctx = new Finally_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_finally_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(FINALLY);
			setState(279);
			block_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngulerParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(RETURN);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 603482487512891434L) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 8393185L) != 0)) {
				{
				setState(282);
				expression(0);
				}
			}

			setState(285);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AngulerParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_break_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(BREAK);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(288);
				match(IDENTIFIER);
				}
			}

			setState(291);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(AngulerParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_continue_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(CONTINUE);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(294);
				match(IDENTIFIER);
				}
			}

			setState(297);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEW() { return getToken(AngulerParser.NEW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AngulerParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode QUESTION() { return getToken(AngulerParser.QUESTION, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngulerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngulerParser.CLOSE_BRACKET, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case OPEN_BRACKET:
			case NULL:
			case IDENTIFIER:
			case STRING_LITERAL:
			case TEMPLATE_LITERAL:
			case DECIMAL_INTEGER_LITERAL:
			case FLOAT_LITERAL:
				{
				setState(300);
				value(0);
				}
				break;
			case INCREMENT:
			case DECREMENT:
			case PLUS:
			case MINUS:
			case BIT_NOT:
			case NOT:
				{
				setState(301);
				unary_operator();
				setState(302);
				expression(6);
				}
				break;
			case NEW:
				{
				setState(304);
				match(NEW);
				setState(305);
				expression(0);
				setState(306);
				match(OPEN_PAREN);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 603482487512891434L) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 8393185L) != 0)) {
					{
					setState(307);
					argument_list();
					}
				}

				setState(310);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_PAREN:
				{
				setState(312);
				match(OPEN_PAREN);
				setState(313);
				expression(0);
				setState(314);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(339);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(319);
						binary_operator();
						setState(320);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(324);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QUESTION) {
							{
							setState(323);
							match(QUESTION);
							}
						}

						setState(326);
						match(DOT);
						setState(327);
						match(IDENTIFIER);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(328);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(329);
						match(OPEN_BRACKET);
						setState(330);
						expression(0);
						setState(331);
						match(CLOSE_BRACKET);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(334);
						match(OPEN_PAREN);
						setState(336);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 603482487512891434L) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 8393185L) != 0)) {
							{
							setState(335);
							argument_list();
							}
						}

						setState(338);
						match(CLOSE_PAREN);
						}
						break;
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_operatorContext extends ParserRuleContext {
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(AngulerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngulerParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(AngulerParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(AngulerParser.MOD, 0); }
		public TerminalNode BIT_AND() { return getToken(AngulerParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(AngulerParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(AngulerParser.BIT_XOR, 0); }
		public TerminalNode SHIFT_LEFT() { return getToken(AngulerParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(AngulerParser.SHIFT_RIGHT, 0); }
		public TerminalNode UNSIGNED_SHIFT_RIGHT() { return getToken(AngulerParser.UNSIGNED_SHIFT_RIGHT, 0); }
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_binary_operator);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS_EQUAL:
			case NOT_EQUAL:
			case IS_EQUAL_TYPE:
			case NOT_EQUAL_TYPE:
			case LESS_EQUAL:
			case GRETER_EQUAL:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				logical_operator();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(MINUS);
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(MULT);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				match(MOD);
				}
				break;
			case BIT_AND:
				enterOuterAlt(_localctx, 6);
				{
				setState(349);
				match(BIT_AND);
				}
				break;
			case BIT_OR:
				enterOuterAlt(_localctx, 7);
				{
				setState(350);
				match(BIT_OR);
				}
				break;
			case BIT_XOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(351);
				match(BIT_XOR);
				}
				break;
			case SHIFT_LEFT:
				enterOuterAlt(_localctx, 9);
				{
				setState(352);
				match(SHIFT_LEFT);
				}
				break;
			case SHIFT_RIGHT:
				enterOuterAlt(_localctx, 10);
				{
				setState(353);
				match(SHIFT_RIGHT);
				}
				break;
			case UNSIGNED_SHIFT_RIGHT:
				enterOuterAlt(_localctx, 11);
				{
				setState(354);
				match(UNSIGNED_SHIFT_RIGHT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(AngulerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngulerParser.MINUS, 0); }
		public TerminalNode INCREMENT() { return getToken(AngulerParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(AngulerParser.DECREMENT, 0); }
		public TerminalNode NOT() { return getToken(AngulerParser.NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(AngulerParser.BIT_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 603482350073937920L) != 0) || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			expression(0);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(360);
				match(COMMA);
				setState(361);
				expression(0);
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Anguler_importContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngulerParser.IMPORT, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public TerminalNode FROM() { return getToken(AngulerParser.FROM, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public Anguler_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anguler_import; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAnguler_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAnguler_import(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAnguler_import(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anguler_importContext anguler_import() throws RecognitionException {
		Anguler_importContext _localctx = new Anguler_importContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_anguler_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(IMPORT);
			setState(368);
			match(OPEN_BRACE);
			setState(369);
			match(IDENTIFIER);
			setState(370);
			match(CLOSE_BRACE);
			setState(371);
			match(FROM);
			setState(372);
			match(STRING_LITERAL);
			setState(373);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Component_declarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngulerParser.COMPONENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public Component_metadataContext component_metadata() {
			return getRuleContext(Component_metadataContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Component_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterComponent_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitComponent_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitComponent_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_declarationContext component_declaration() throws RecognitionException {
		Component_declarationContext _localctx = new Component_declarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_component_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(COMPONENT);
			setState(376);
			match(OPEN_PAREN);
			setState(377);
			component_metadata();
			setState(378);
			match(CLOSE_PAREN);
			setState(379);
			class_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Component_metadataContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public List<Metadata_propertyContext> metadata_property() {
			return getRuleContexts(Metadata_propertyContext.class);
		}
		public Metadata_propertyContext metadata_property(int i) {
			return getRuleContext(Metadata_propertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Component_metadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterComponent_metadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitComponent_metadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitComponent_metadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_metadataContext component_metadata() throws RecognitionException {
		Component_metadataContext _localctx = new Component_metadataContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_component_metadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(OPEN_BRACE);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 255L) != 0)) {
				{
				setState(382);
				metadata_property();
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(383);
					match(COMMA);
					setState(384);
					metadata_property();
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(392);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Metadata_propertyContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode SELECTOR() { return getToken(AngulerParser.SELECTOR, 0); }
		public TerminalNode STANDALONE() { return getToken(AngulerParser.STANDALONE, 0); }
		public TerminalNode IMPORTS() { return getToken(AngulerParser.IMPORTS, 0); }
		public TerminalNode TEMPLATE() { return getToken(AngulerParser.TEMPLATE, 0); }
		public TerminalNode TEMPLATE_URL() { return getToken(AngulerParser.TEMPLATE_URL, 0); }
		public TerminalNode STYLES() { return getToken(AngulerParser.STYLES, 0); }
		public TerminalNode STYLE_URLS() { return getToken(AngulerParser.STYLE_URLS, 0); }
		public TerminalNode STYLE_URL() { return getToken(AngulerParser.STYLE_URL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public Imports_arrayContext imports_array() {
			return getRuleContext(Imports_arrayContext.class,0);
		}
		public TerminalNode TEMPLATE_LITERAL() { return getToken(AngulerParser.TEMPLATE_LITERAL, 0); }
		public TerminalNode BINDING() { return getToken(AngulerParser.BINDING, 0); }
		public Metadata_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadata_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadata_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadata_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Metadata_propertyContext metadata_property() throws RecognitionException {
		Metadata_propertyContext _localctx = new Metadata_propertyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_metadata_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(395);
			match(COLON);
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(396);
				value(0);
				}
				break;
			case 2:
				{
				setState(397);
				json_object();
				}
				break;
			case 3:
				{
				setState(398);
				imports_array();
				}
				break;
			case 4:
				{
				setState(399);
				match(TEMPLATE_LITERAL);
				}
				break;
			case 5:
				{
				setState(400);
				match(BINDING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_annotationContext extends ParserRuleContext {
		public List<Base_type_annotationContext> base_type_annotation() {
			return getRuleContexts(Base_type_annotationContext.class);
		}
		public Base_type_annotationContext base_type_annotation(int i) {
			return getRuleContext(Base_type_annotationContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(AngulerParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(AngulerParser.PIPE, i);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterType_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitType_annotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitType_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			base_type_annotation();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(404);
				match(PIPE);
				setState(405);
				base_type_annotation();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Base_type_annotationContext extends ParserRuleContext {
		public Base_type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type_annotation; }
	 
		public Base_type_annotationContext() { }
		public void copyFrom(Base_type_annotationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeContext extends Base_type_annotationContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public SimpleTypeContext(Base_type_annotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends Base_type_annotationContext {
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public ArrayTypeContext(Base_type_annotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructuredTypeContext extends Base_type_annotationContext {
		public Structured_typeContext structured_type() {
			return getRuleContext(Structured_typeContext.class,0);
		}
		public StructuredTypeContext(Base_type_annotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStructuredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStructuredType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidTypeContext extends Base_type_annotationContext {
		public TerminalNode VOID() { return getToken(AngulerParser.VOID, 0); }
		public VoidTypeContext(Base_type_annotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullTypeContext extends Base_type_annotationContext {
		public TerminalNode NULL() { return getToken(AngulerParser.NULL, 0); }
		public NullTypeContext(Base_type_annotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNullType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNullType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNullType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_type_annotationContext base_type_annotation() throws RecognitionException {
		Base_type_annotationContext _localctx = new Base_type_annotationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_base_type_annotation);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new SimpleTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new NullTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(NULL);
				}
				break;
			case 3:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				match(VOID);
				}
				break;
			case 4:
				_localctx = new StructuredTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				structured_type();
				}
				break;
			case 5:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				array_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(AngulerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngulerParser.CLOSE_BRACKET, 0); }
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(IDENTIFIER);
			setState(419);
			match(OPEN_BRACKET);
			setState(420);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Structured_typeContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public List<Type_pairContext> type_pair() {
			return getRuleContexts(Type_pairContext.class);
		}
		public Type_pairContext type_pair(int i) {
			return getRuleContext(Type_pairContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(AngulerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngulerParser.SEMICOLON, i);
		}
		public Structured_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structured_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStructured_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStructured_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStructured_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structured_typeContext structured_type() throws RecognitionException {
		Structured_typeContext _localctx = new Structured_typeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_structured_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(OPEN_BRACE);
			setState(423);
			type_pair();
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					match(SEMICOLON);
					setState(425);
					type_pair();
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(431);
				match(SEMICOLON);
				}
			}

			setState(434);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_pairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Base_type_annotationContext base_type_annotation() {
			return getRuleContext(Base_type_annotationContext.class,0);
		}
		public Type_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterType_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitType_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitType_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_pairContext type_pair() throws RecognitionException {
		Type_pairContext _localctx = new Type_pairContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(IDENTIFIER);
			setState(437);
			match(COLON);
			setState(438);
			base_type_annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngulerParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public TerminalNode EXPORT() { return getToken(AngulerParser.EXPORT, 0); }
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(440);
				match(EXPORT);
				}
			}

			setState(443);
			match(CLASS);
			setState(444);
			match(IDENTIFIER);
			setState(445);
			match(OPEN_BRACE);
			setState(446);
			class_body();
			setState(447);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_bodyContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
		}
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACE || _la==OPEN_BRACKET || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 301793289L) != 0)) {
				{
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(449);
					instruction();
					}
					break;
				case 2:
					{
					setState(450);
					method_declaration();
					}
					break;
				case 3:
					{
					setState(451);
					variable_declaration();
					}
					break;
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(IDENTIFIER);
			setState(458);
			match(OPEN_PAREN);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(459);
				parameter_list();
				}
			}

			setState(462);
			match(CLOSE_PAREN);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(463);
				match(COLON);
				setState(464);
				type_annotation();
				}
			}

			setState(467);
			match(OPEN_BRACE);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACE || _la==OPEN_BRACKET || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 301793289L) != 0)) {
				{
				{
				setState(468);
				instruction();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(IDENTIFIER);
			setState(477);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(OPEN_PAREN);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(480);
				parameter_list();
				}
			}

			setState(483);
			match(CLOSE_PAREN);
			setState(484);
			match(OPEN_BRACE);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACE || _la==OPEN_BRACKET || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 301793289L) != 0)) {
				{
				{
				setState(485);
				instruction();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			parameter();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(494);
				match(COMMA);
				setState(495);
				parameter();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Base_type_annotationContext base_type_annotation() {
			return getRuleContext(Base_type_annotationContext.class,0);
		}
		public Structured_typeContext structured_type() {
			return getRuleContext(Structured_typeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(IDENTIFIER);
			setState(502);
			match(COLON);
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(503);
				base_type_annotation();
				}
				break;
			case 2:
				{
				setState(504);
				structured_type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(IDENTIFIER);
			setState(508);
			match(OPEN_PAREN);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE || _la==OPEN_BRACKET || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 4577L) != 0)) {
				{
				setState(509);
				value(0);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(510);
					match(COMMA);
					setState(511);
					value(0);
					}
					}
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(519);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CONST() { return getToken(AngulerParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngulerParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngulerParser.VAR, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 7L) != 0)) {
				{
				setState(521);
				_la = _input.LA(1);
				if ( !(((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(524);
			match(IDENTIFIER);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(525);
				match(COLON);
				setState(526);
				type_annotation();
				}
			}

			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(529);
				match(EQUAL);
				setState(530);
				value(0);
				}
			}

			setState(533);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			value(0);
			setState(536);
			match(EQUAL);
			setState(537);
			value(0);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(538);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallValueContext extends ValueContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFunctionCallValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFunctionCallValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFunctionCallValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends ValueContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Dot_valueContext dot_value() {
			return getRuleContext(Dot_valueContext.class,0);
		}
		public MemberAccessContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierValueContext extends ValueContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public IdentifierValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterIdentifierValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitIdentifierValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitIdentifierValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectValueContext extends ValueContext {
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public ObjectValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitObjectValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitObjectValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValueContext extends ValueContext {
		public Imports_arrayContext imports_array() {
			return getRuleContext(Imports_arrayContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOperationContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public BinaryOperationContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitBinaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitBinaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperationContext extends ValueContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(AngulerParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(AngulerParser.DECREMENT, 0); }
		public UnaryOperationContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullValueContext extends ValueContext {
		public TerminalNode NULL() { return getToken(AngulerParser.NULL, 0); }
		public NullValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNullValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNullValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralValueContext extends ValueContext {
		public TerminalNode DECIMAL_INTEGER_LITERAL() { return getToken(AngulerParser.DECIMAL_INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(AngulerParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public TerminalNode TEMPLATE_LITERAL() { return getToken(AngulerParser.TEMPLATE_LITERAL, 0); }
		public LiteralValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitLiteralValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		return value(0);
	}

	private ValueContext value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueContext _localctx = new ValueContext(_ctx, _parentState);
		ValueContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_value, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				_localctx = new LiteralValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(542);
				match(DECIMAL_INTEGER_LITERAL);
				}
				break;
			case 2:
				{
				_localctx = new LiteralValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(543);
				match(FLOAT_LITERAL);
				}
				break;
			case 3:
				{
				_localctx = new LiteralValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(544);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				{
				_localctx = new LiteralValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(545);
				match(TEMPLATE_LITERAL);
				}
				break;
			case 5:
				{
				_localctx = new IdentifierValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(546);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				_localctx = new NullValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(547);
				match(NULL);
				}
				break;
			case 7:
				{
				_localctx = new ObjectValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(548);
				json_object();
				}
				break;
			case 8:
				{
				_localctx = new ArrayValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(549);
				imports_array();
				}
				break;
			case 9:
				{
				_localctx = new ArrayValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(550);
				array();
				}
				break;
			case 10:
				{
				_localctx = new FunctionCallValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(551);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(564);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOperationContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(554);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(555);
						logical_operator();
						setState(556);
						value(4);
						}
						break;
					case 2:
						{
						_localctx = new MemberAccessContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(558);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(559);
						dot_value();
						}
						break;
					case 3:
						{
						_localctx = new UnaryOperationContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(560);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(561);
						match(INCREMENT);
						}
						break;
					case 4:
						{
						_localctx = new UnaryOperationContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(562);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(563);
						match(DECREMENT);
						}
						break;
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dot_valueContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AngulerParser.DOT, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Dot_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDot_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDot_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDot_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_valueContext dot_value() throws RecognitionException {
		Dot_valueContext _localctx = new Dot_valueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dot_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(DOT);
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(570);
				function_call();
				}
				break;
			case 2:
				{
				setState(571);
				match(IDENTIFIER);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(AngulerParser.AND, 0); }
		public TerminalNode OR() { return getToken(AngulerParser.OR, 0); }
		public TerminalNode IS_EQUAL() { return getToken(AngulerParser.IS_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(AngulerParser.NOT_EQUAL, 0); }
		public TerminalNode IS_EQUAL_TYPE() { return getToken(AngulerParser.IS_EQUAL_TYPE, 0); }
		public TerminalNode NOT_EQUAL_TYPE() { return getToken(AngulerParser.NOT_EQUAL_TYPE, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(AngulerParser.LESS_EQUAL, 0); }
		public TerminalNode GRETER_EQUAL() { return getToken(AngulerParser.GRETER_EQUAL, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitLogical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6643900416L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Json_objectContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public List<Json_pairContext> json_pair() {
			return getRuleContexts(Json_pairContext.class);
		}
		public Json_pairContext json_pair(int i) {
			return getRuleContext(Json_pairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Json_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterJson_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitJson_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitJson_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_objectContext json_object() throws RecognitionException {
		Json_objectContext _localctx = new Json_objectContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_json_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(OPEN_BRACE);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(577);
				json_pair();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(578);
					match(COMMA);
					setState(579);
					json_pair();
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(587);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Json_pairContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public Imports_arrayContext imports_array() {
			return getRuleContext(Imports_arrayContext.class,0);
		}
		public TerminalNode TEMPLATE_LITERAL() { return getToken(AngulerParser.TEMPLATE_LITERAL, 0); }
		public Json_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterJson_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitJson_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitJson_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_pairContext json_pair() throws RecognitionException {
		Json_pairContext _localctx = new Json_pairContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_json_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(590);
			match(COLON);
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(591);
				value(0);
				}
				break;
			case 2:
				{
				setState(592);
				json_object();
				}
				break;
			case 3:
				{
				setState(593);
				imports_array();
				}
				break;
			case 4:
				{
				setState(594);
				match(TEMPLATE_LITERAL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Imports_arrayContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngulerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngulerParser.CLOSE_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Imports_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterImports_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitImports_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitImports_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Imports_arrayContext imports_array() throws RecognitionException {
		Imports_arrayContext _localctx = new Imports_arrayContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_imports_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(OPEN_BRACKET);
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE || _la==OPEN_BRACKET || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 4577L) != 0)) {
				{
				setState(598);
				value(0);
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(599);
					match(COMMA);
					setState(600);
					value(0);
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(608);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(AngulerParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(AngulerParser.CLOSE_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(OPEN_BRACKET);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE || _la==OPEN_BRACKET || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 4577L) != 0)) {
				{
				setState(611);
				value(0);
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(612);
					match(COMMA);
					setState(613);
					value(0);
					}
					}
					setState(618);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(621);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends InstructionContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public DeclarationStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends InstructionContext {
		public TerminalNode EXPORT() { return getToken(AngulerParser.EXPORT, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public ExportStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends InstructionContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatementContext extends InstructionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends InstructionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends InstructionContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public FunctionDeclarationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends InstructionContext {
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public ClassDeclarationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_instruction);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new FunctionCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				function_call();
				}
				break;
			case 2:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				value(0);
				}
				break;
			case 3:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(625);
				variable_declaration();
				}
				break;
			case 4:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(626);
				assignment();
				}
				break;
			case 5:
				_localctx = new ClassDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(627);
				class_declaration();
				}
				break;
			case 6:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(628);
				function_declaration();
				}
				break;
			case 7:
				_localctx = new ExportStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(629);
				match(EXPORT);
				setState(630);
				variable_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_valueContext extends ParserRuleContext {
		public Html_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_value; }
	 
		public Html_valueContext() { }
		public void copyFrom(Html_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContext extends Html_valueContext {
		public TerminalNode INTERPOLATION() { return getToken(AngulerParser.INTERPOLATION, 0); }
		public InterpolationContext(Html_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends Html_valueContext {
		public Single_tagContext single_tag() {
			return getRuleContext(Single_tagContext.class,0);
		}
		public SelfClosingTagContext(Html_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedHtmlContext extends Html_valueContext {
		public Open_tagContext open_tag() {
			return getRuleContext(Open_tagContext.class,0);
		}
		public List<Html_valueContext> html_value() {
			return getRuleContexts(Html_valueContext.class);
		}
		public Html_valueContext html_value(int i) {
			return getRuleContext(Html_valueContext.class,i);
		}
		public Close_tagContext close_tag() {
			return getRuleContext(Close_tagContext.class,0);
		}
		public NestedHtmlContext(Html_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNestedHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNestedHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNestedHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContentContext extends Html_valueContext {
		public TerminalNode HTML_TEXT() { return getToken(AngulerParser.HTML_TEXT, 0); }
		public TextContentContext(Html_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTextContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTextContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTextContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_valueContext html_value() throws RecognitionException {
		Html_valueContext _localctx = new Html_valueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_html_value);
		try {
			int _alt;
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new NestedHtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(633);
				open_tag();
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(634);
						html_value();
						}
						} 
					}
					setState(639);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(640);
					close_tag();
					}
					break;
				}
				}
				}
				break;
			case 2:
				_localctx = new SelfClosingTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				single_tag();
				}
				break;
			case 3:
				_localctx = new InterpolationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				match(INTERPOLATION);
				}
				break;
			case 4:
				_localctx = new TextContentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(645);
				match(HTML_TEXT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Open_tagContext extends ParserRuleContext {
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TerminalNode HTML_OPENTAG() { return getToken(AngulerParser.HTML_OPENTAG, 0); }
		public TerminalNode DIV_TAG() { return getToken(AngulerParser.DIV_TAG, 0); }
		public TerminalNode H1_TAG() { return getToken(AngulerParser.H1_TAG, 0); }
		public TerminalNode H2_TAG() { return getToken(AngulerParser.H2_TAG, 0); }
		public TerminalNode H3_TAG() { return getToken(AngulerParser.H3_TAG, 0); }
		public TerminalNode P_TAG() { return getToken(AngulerParser.P_TAG, 0); }
		public TerminalNode IMG_TAG() { return getToken(AngulerParser.IMG_TAG, 0); }
		public TerminalNode A_TAG() { return getToken(AngulerParser.A_TAG, 0); }
		public TerminalNode SPAN_TAG() { return getToken(AngulerParser.SPAN_TAG, 0); }
		public TerminalNode BUTTON_TAG() { return getToken(AngulerParser.BUTTON_TAG, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public List<Html_attributeContext> html_attribute() {
			return getRuleContexts(Html_attributeContext.class);
		}
		public Html_attributeContext html_attribute(int i) {
			return getRuleContext(Html_attributeContext.class,i);
		}
		public Open_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterOpen_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitOpen_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitOpen_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_tagContext open_tag() throws RecognitionException {
		Open_tagContext _localctx = new Open_tagContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_open_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_la = _input.LA(1);
			if ( !(_la==OPENTAG || _la==HTML_OPENTAG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(649);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 137438953983L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 2146335L) != 0)) {
				{
				{
				setState(650);
				html_attribute();
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(656);
			match(CLOSETAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_attributeContext extends ParserRuleContext {
		public Html_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_attribute; }
	 
		public Html_attributeContext() { }
		public void copyFrom(Html_attributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveAttributeContext extends Html_attributeContext {
		public TerminalNode DIRECTIVE() { return getToken(AngulerParser.DIRECTIVE, 0); }
		public DirectiveAttributeContext(Html_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDirectiveAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDirectiveAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDirectiveAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventBindingContext extends Html_attributeContext {
		public TerminalNode EVENT_BINDING() { return getToken(AngulerParser.EVENT_BINDING, 0); }
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EventBindingContext(Html_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandardAttributeContext extends Html_attributeContext {
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public TerminalNode CLASS() { return getToken(AngulerParser.CLASS, 0); }
		public TerminalNode STYLE_ATTR() { return getToken(AngulerParser.STYLE_ATTR, 0); }
		public TerminalNode ALT_ATTR() { return getToken(AngulerParser.ALT_ATTR, 0); }
		public TerminalNode SRC_ATTR() { return getToken(AngulerParser.SRC_ATTR, 0); }
		public TerminalNode HREF_ATTR() { return getToken(AngulerParser.HREF_ATTR, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public TerminalNode TEMPLATE_LITERAL() { return getToken(AngulerParser.TEMPLATE_LITERAL, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public TerminalNode INTERPOLATION() { return getToken(AngulerParser.INTERPOLATION, 0); }
		public StandardAttributeContext(Html_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStandardAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStandardAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStandardAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyBindingContext extends Html_attributeContext {
		public TerminalNode BINDING() { return getToken(AngulerParser.BINDING, 0); }
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PropertyBindingContext(Html_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPropertyBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPropertyBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPropertyBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_attributeContext html_attribute() throws RecognitionException {
		Html_attributeContext _localctx = new Html_attributeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_html_attribute);
		int _la;
		try {
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLE_ATTR:
			case ALT_ATTR:
			case SRC_ATTR:
			case HREF_ATTR:
			case CLASS:
				_localctx = new StandardAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				_la = _input.LA(1);
				if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 1048591L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(659);
				match(EQUAL);
				setState(667);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(660);
					match(STRING_LITERAL);
					}
					break;
				case TEMPLATE_LITERAL:
					{
					setState(661);
					match(TEMPLATE_LITERAL);
					}
					break;
				case OPEN_BRACE:
					{
					setState(662);
					match(OPEN_BRACE);
					setState(663);
					value(0);
					setState(664);
					match(CLOSE_BRACE);
					}
					break;
				case INTERPOLATION:
					{
					setState(666);
					match(INTERPOLATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DIRECTIVE:
				_localctx = new DirectiveAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				match(DIRECTIVE);
				}
				break;
			case BINDING:
				_localctx = new PropertyBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				match(BINDING);
				setState(671);
				match(EQUAL);
				setState(672);
				value(0);
				}
				break;
			case EVENT_BINDING:
				_localctx = new EventBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(673);
				match(EVENT_BINDING);
				setState(674);
				match(EQUAL);
				setState(675);
				value(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Close_tagContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(AngulerParser.SLASH, 0); }
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TerminalNode HTML_OPENTAG() { return getToken(AngulerParser.HTML_OPENTAG, 0); }
		public TerminalNode DIV_TAG() { return getToken(AngulerParser.DIV_TAG, 0); }
		public TerminalNode H1_TAG() { return getToken(AngulerParser.H1_TAG, 0); }
		public TerminalNode H2_TAG() { return getToken(AngulerParser.H2_TAG, 0); }
		public TerminalNode H3_TAG() { return getToken(AngulerParser.H3_TAG, 0); }
		public TerminalNode P_TAG() { return getToken(AngulerParser.P_TAG, 0); }
		public TerminalNode IMG_TAG() { return getToken(AngulerParser.IMG_TAG, 0); }
		public TerminalNode A_TAG() { return getToken(AngulerParser.A_TAG, 0); }
		public TerminalNode SPAN_TAG() { return getToken(AngulerParser.SPAN_TAG, 0); }
		public TerminalNode BUTTON_TAG() { return getToken(AngulerParser.BUTTON_TAG, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Close_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterClose_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitClose_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitClose_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_tagContext close_tag() throws RecognitionException {
		Close_tagContext _localctx = new Close_tagContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_close_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_la = _input.LA(1);
			if ( !(_la==OPENTAG || _la==HTML_OPENTAG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(679);
			match(SLASH);
			setState(680);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 137438953983L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(681);
			match(CLOSETAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_tagContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(AngulerParser.SLASH, 0); }
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TerminalNode HTML_OPENTAG() { return getToken(AngulerParser.HTML_OPENTAG, 0); }
		public TerminalNode DIV_TAG() { return getToken(AngulerParser.DIV_TAG, 0); }
		public TerminalNode H1_TAG() { return getToken(AngulerParser.H1_TAG, 0); }
		public TerminalNode H2_TAG() { return getToken(AngulerParser.H2_TAG, 0); }
		public TerminalNode H3_TAG() { return getToken(AngulerParser.H3_TAG, 0); }
		public TerminalNode P_TAG() { return getToken(AngulerParser.P_TAG, 0); }
		public TerminalNode IMG_TAG() { return getToken(AngulerParser.IMG_TAG, 0); }
		public TerminalNode A_TAG() { return getToken(AngulerParser.A_TAG, 0); }
		public TerminalNode SPAN_TAG() { return getToken(AngulerParser.SPAN_TAG, 0); }
		public TerminalNode BUTTON_TAG() { return getToken(AngulerParser.BUTTON_TAG, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public List<Html_attributeContext> html_attribute() {
			return getRuleContexts(Html_attributeContext.class);
		}
		public Html_attributeContext html_attribute(int i) {
			return getRuleContext(Html_attributeContext.class,i);
		}
		public Single_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSingle_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSingle_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSingle_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_tagContext single_tag() throws RecognitionException {
		Single_tagContext _localctx = new Single_tagContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_single_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_la = _input.LA(1);
			if ( !(_la==OPENTAG || _la==HTML_OPENTAG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(684);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 137438953983L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 2146335L) != 0)) {
				{
				{
				setState(685);
				html_attribute();
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(691);
			match(SLASH);
			setState(692);
			match(CLOSETAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 43:
			return value_sempred((ValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00a3\u02b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u0001\u0000\u0005\u0000r\b\u0000\n\u0000\f\u0000u\t\u0000"+
		"\u0001\u0000\u0005\u0000x\b\u0000\n\u0000\f\u0000{\t\u0000\u0001\u0000"+
		"\u0005\u0000~\b\u0000\n\u0000\f\u0000\u0081\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0094\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003\u009a\b\u0003\n"+
		"\u0003\f\u0003\u009d\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00b0\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00b8\b\b\n\b\f\b\u00bb\t\b\u0001\b\u0003\b"+
		"\u00be\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00c6"+
		"\b\t\n\t\f\t\u00c9\t\t\u0001\n\u0001\n\u0001\n\u0005\n\u00ce\b\n\n\n\f"+
		"\n\u00d1\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00d7\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00db\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00df\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00f5\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0108\b\u000e\u0001\u000e\u0003\u000e"+
		"\u010b\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0112\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u011c\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u0122\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0128\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0135\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u013d\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0145\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0151\b\u0014\u0001\u0014"+
		"\u0005\u0014\u0154\b\u0014\n\u0014\f\u0014\u0157\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0164\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u016b"+
		"\b\u0017\n\u0017\f\u0017\u016e\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0182\b\u001a\n\u001a"+
		"\f\u001a\u0185\t\u001a\u0003\u001a\u0187\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0192\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u0197\b\u001c\n\u001c\f\u001c\u019a\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01a1\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u01ab\b\u001f\n\u001f\f\u001f\u01ae\t\u001f"+
		"\u0001\u001f\u0003\u001f\u01b1\b\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0001!\u0003!\u01ba\b!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u01c5\b\"\n\"\f\"\u01c8"+
		"\t\"\u0001#\u0001#\u0001#\u0003#\u01cd\b#\u0001#\u0001#\u0001#\u0003#"+
		"\u01d2\b#\u0001#\u0001#\u0005#\u01d6\b#\n#\f#\u01d9\t#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0003%\u01e2\b%\u0001%\u0001%\u0001%\u0005"+
		"%\u01e7\b%\n%\f%\u01ea\t%\u0001%\u0001%\u0001&\u0001&\u0001&\u0005&\u01f1"+
		"\b&\n&\f&\u01f4\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01fa\b\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0005(\u0201\b(\n(\f(\u0204\t(\u0003(\u0206"+
		"\b(\u0001(\u0001(\u0001)\u0003)\u020b\b)\u0001)\u0001)\u0001)\u0003)\u0210"+
		"\b)\u0001)\u0001)\u0003)\u0214\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u021c\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u0229\b+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u0235\b+\n+\f+\u0238\t+\u0001"+
		",\u0001,\u0001,\u0003,\u023d\b,\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0005.\u0245\b.\n.\f.\u0248\t.\u0003.\u024a\b.\u0001.\u0001.\u0001/"+
		"\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0254\b/\u00010\u00010\u0001"+
		"0\u00010\u00050\u025a\b0\n0\f0\u025d\t0\u00030\u025f\b0\u00010\u00010"+
		"\u00011\u00011\u00011\u00011\u00051\u0267\b1\n1\f1\u026a\t1\u00031\u026c"+
		"\b1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u0278\b2\u00013\u00013\u00053\u027c\b3\n3\f3\u027f\t3\u00013"+
		"\u00033\u0282\b3\u00013\u00013\u00013\u00033\u0287\b3\u00014\u00014\u0001"+
		"4\u00054\u028c\b4\n4\f4\u028f\t4\u00014\u00014\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00035\u029c\b5\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00035\u02a5\b5\u00016\u00016\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00057\u02af\b7\n7\f7\u02b2\t7\u00017\u0001"+
		"7\u00017\u00017\u0000\u0002(V8\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjln\u0000\b\u0001\u0000\u008e\u0090\u0004\u0000\u0015\u0016"+
		"56;;\u00a3\u00a3\u0001\u0000Za\u0003\u0000\r\u0010\u001a\u001b\u001f "+
		"\u0001\u0000\u0091\u0092\u0002\u0000\u0018\u0018\u00a0\u00a0\u0002\u0000"+
		"lt\u0091\u0091\u0002\u0000hk||\u02fe\u0000s\u0001\u0000\u0000\u0000\u0002"+
		"\u0093\u0001\u0000\u0000\u0000\u0004\u0095\u0001\u0000\u0000\u0000\u0006"+
		"\u0097\u0001\u0000\u0000\u0000\b\u00a0\u0001\u0000\u0000\u0000\n\u00a3"+
		"\u0001\u0000\u0000\u0000\f\u00a5\u0001\u0000\u0000\u0000\u000e\u00a8\u0001"+
		"\u0000\u0000\u0000\u0010\u00b1\u0001\u0000\u0000\u0000\u0012\u00c1\u0001"+
		"\u0000\u0000\u0000\u0014\u00ca\u0001\u0000\u0000\u0000\u0016\u00f4\u0001"+
		"\u0000\u0000\u0000\u0018\u00f6\u0001\u0000\u0000\u0000\u001a\u00fc\u0001"+
		"\u0000\u0000\u0000\u001c\u0104\u0001\u0000\u0000\u0000\u001e\u010c\u0001"+
		"\u0000\u0000\u0000 \u0116\u0001\u0000\u0000\u0000\"\u0119\u0001\u0000"+
		"\u0000\u0000$\u011f\u0001\u0000\u0000\u0000&\u0125\u0001\u0000\u0000\u0000"+
		"(\u013c\u0001\u0000\u0000\u0000*\u0163\u0001\u0000\u0000\u0000,\u0165"+
		"\u0001\u0000\u0000\u0000.\u0167\u0001\u0000\u0000\u00000\u016f\u0001\u0000"+
		"\u0000\u00002\u0177\u0001\u0000\u0000\u00004\u017d\u0001\u0000\u0000\u0000"+
		"6\u018a\u0001\u0000\u0000\u00008\u0193\u0001\u0000\u0000\u0000:\u01a0"+
		"\u0001\u0000\u0000\u0000<\u01a2\u0001\u0000\u0000\u0000>\u01a6\u0001\u0000"+
		"\u0000\u0000@\u01b4\u0001\u0000\u0000\u0000B\u01b9\u0001\u0000\u0000\u0000"+
		"D\u01c6\u0001\u0000\u0000\u0000F\u01c9\u0001\u0000\u0000\u0000H\u01dc"+
		"\u0001\u0000\u0000\u0000J\u01df\u0001\u0000\u0000\u0000L\u01ed\u0001\u0000"+
		"\u0000\u0000N\u01f5\u0001\u0000\u0000\u0000P\u01fb\u0001\u0000\u0000\u0000"+
		"R\u020a\u0001\u0000\u0000\u0000T\u0217\u0001\u0000\u0000\u0000V\u0228"+
		"\u0001\u0000\u0000\u0000X\u0239\u0001\u0000\u0000\u0000Z\u023e\u0001\u0000"+
		"\u0000\u0000\\\u0240\u0001\u0000\u0000\u0000^\u024d\u0001\u0000\u0000"+
		"\u0000`\u0255\u0001\u0000\u0000\u0000b\u0262\u0001\u0000\u0000\u0000d"+
		"\u0277\u0001\u0000\u0000\u0000f\u0286\u0001\u0000\u0000\u0000h\u0288\u0001"+
		"\u0000\u0000\u0000j\u02a4\u0001\u0000\u0000\u0000l\u02a6\u0001\u0000\u0000"+
		"\u0000n\u02ab\u0001\u0000\u0000\u0000pr\u00030\u0018\u0000qp\u0001\u0000"+
		"\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000ty\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"vx\u00032\u0019\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u007f\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0003\u0002\u0001\u0000}|\u0001"+
		"\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0000\u0000"+
		"\u0001\u0083\u0001\u0001\u0000\u0000\u0000\u0084\u0094\u0003\u0006\u0003"+
		"\u0000\u0085\u0094\u0003\u000e\u0007\u0000\u0086\u0094\u0003\u0010\b\u0000"+
		"\u0087\u0094\u0003\u0016\u000b\u0000\u0088\u0094\u0003\u0018\f\u0000\u0089"+
		"\u0094\u0003\u001a\r\u0000\u008a\u0094\u0003\u001c\u000e\u0000\u008b\u0094"+
		"\u0003\"\u0011\u0000\u008c\u0094\u0003$\u0012\u0000\u008d\u0094\u0003"+
		"&\u0013\u0000\u008e\u0094\u0003\b\u0004\u0000\u008f\u0094\u0003\n\u0005"+
		"\u0000\u0090\u0094\u0003B!\u0000\u0091\u0094\u0003H$\u0000\u0092\u0094"+
		"\u0003\f\u0006\u0000\u0093\u0084\u0001\u0000\u0000\u0000\u0093\u0085\u0001"+
		"\u0000\u0000\u0000\u0093\u0086\u0001\u0000\u0000\u0000\u0093\u0087\u0001"+
		"\u0000\u0000\u0000\u0093\u0088\u0001\u0000\u0000\u0000\u0093\u0089\u0001"+
		"\u0000\u0000\u0000\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u008b\u0001"+
		"\u0000\u0000\u0000\u0093\u008c\u0001\u0000\u0000\u0000\u0093\u008d\u0001"+
		"\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u008f\u0001"+
		"\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0003\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\b\u0000\u0000\u0096\u0005\u0001\u0000"+
		"\u0000\u0000\u0097\u009b\u0005\u0001\u0000\u0000\u0098\u009a\u0003\u0002"+
		"\u0001\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u0002\u0000\u0000\u009f\u0007\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0003(\u0014\u0000\u00a1\u00a2\u0005\b\u0000"+
		"\u0000\u00a2\t\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003R)\u0000\u00a4"+
		"\u000b\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u007f\u0000\u0000\u00a6"+
		"\u00a7\u0003R)\u0000\u00a7\r\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0080\u0000\u0000\u00a9\u00aa\u0005\u0003\u0000\u0000\u00aa\u00ab\u0003"+
		"(\u0014\u0000\u00ab\u00ac\u0005\u0004\u0000\u0000\u00ac\u00af\u0003\u0002"+
		"\u0001\u0000\u00ad\u00ae\u0005\u0081\u0000\u0000\u00ae\u00b0\u0003\u0002"+
		"\u0001\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u000f\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0085"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0003\u0000\u0000\u00b3\u00b4\u0003(\u0014"+
		"\u0000\u00b4\u00b5\u0005\u0004\u0000\u0000\u00b5\u00b9\u0005\u0001\u0000"+
		"\u0000\u00b6\u00b8\u0003\u0012\t\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00be\u0003\u0014\n\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0002\u0000\u0000\u00c0"+
		"\u0011\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0086\u0000\u0000\u00c2"+
		"\u00c3\u0003(\u0014\u0000\u00c3\u00c7\u0005\n\u0000\u0000\u00c4\u00c6"+
		"\u0003\u0002\u0001\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u0013\u0001\u0000\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0087\u0000\u0000\u00cb\u00cf"+
		"\u0005\n\u0000\u0000\u00cc\u00ce\u0003\u0002\u0001\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u0015\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005"+
		"\u0082\u0000\u0000\u00d3\u00d6\u0005\u0003\u0000\u0000\u00d4\u00d7\u0003"+
		"R)\u0000\u00d5\u00d7\u0003(\u0014\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0005\b\u0000\u0000"+
		"\u00d9\u00db\u0003(\u0014\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00de\u0005\b\u0000\u0000\u00dd\u00df\u0003(\u0014\u0000\u00de\u00dd"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0004\u0000\u0000\u00e1\u00f5"+
		"\u0003\u0002\u0001\u0000\u00e2\u00e3\u0005\u0082\u0000\u0000\u00e3\u00e4"+
		"\u0005\u0003\u0000\u0000\u00e4\u00e5\u0007\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005\u0091\u0000\u0000\u00e6\u00e7\u00051\u0000\u0000\u00e7\u00e8\u0003"+
		"(\u0014\u0000\u00e8\u00e9\u0005\u0004\u0000\u0000\u00e9\u00ea\u0003\u0002"+
		"\u0001\u0000\u00ea\u00f5\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0082"+
		"\u0000\u0000\u00ec\u00ed\u0005\u0003\u0000\u0000\u00ed\u00ee\u0007\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005\u0091\u0000\u0000\u00ef\u00f0\u00050\u0000"+
		"\u0000\u00f0\u00f1\u0003(\u0014\u0000\u00f1\u00f2\u0005\u0004\u0000\u0000"+
		"\u00f2\u00f3\u0003\u0002\u0001\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f4\u00d2\u0001\u0000\u0000\u0000\u00f4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00eb\u0001\u0000\u0000\u0000\u00f5\u0017\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0083\u0000\u0000\u00f7\u00f8\u0005\u0003\u0000\u0000"+
		"\u00f8\u00f9\u0003(\u0014\u0000\u00f9\u00fa\u0005\u0004\u0000\u0000\u00fa"+
		"\u00fb\u0003\u0002\u0001\u0000\u00fb\u0019\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005\u0084\u0000\u0000\u00fd\u00fe\u0003\u0002\u0001\u0000\u00fe"+
		"\u00ff\u0005\u0083\u0000\u0000\u00ff\u0100\u0005\u0003\u0000\u0000\u0100"+
		"\u0101\u0003(\u0014\u0000\u0101\u0102\u0005\u0004\u0000\u0000\u0102\u0103"+
		"\u0005\b\u0000\u0000\u0103\u001b\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"\"\u0000\u0000\u0105\u0107\u0003\u0006\u0003\u0000\u0106\u0108\u0003\u001e"+
		"\u000f\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000"+
		"\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u010b\u0003 \u0010"+
		"\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u001d\u0001\u0000\u0000\u0000\u010c\u010d\u0005#\u0000\u0000"+
		"\u010d\u010e\u0005\u0003\u0000\u0000\u010e\u010f\u0005\u0091\u0000\u0000"+
		"\u010f\u0111\u0005\n\u0000\u0000\u0110\u0112\u00038\u001c\u0000\u0111"+
		"\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0004\u0000\u0000\u0114"+
		"\u0115\u0003\u0006\u0003\u0000\u0115\u001f\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0005$\u0000\u0000\u0117\u0118\u0003\u0006\u0003\u0000\u0118!\u0001"+
		"\u0000\u0000\u0000\u0119\u011b\u0005\u0088\u0000\u0000\u011a\u011c\u0003"+
		"(\u0014\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005\b\u0000"+
		"\u0000\u011e#\u0001\u0000\u0000\u0000\u011f\u0121\u0005\u0089\u0000\u0000"+
		"\u0120\u0122\u0005\u0091\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0005\b\u0000\u0000\u0124%\u0001\u0000\u0000\u0000\u0125"+
		"\u0127\u0005\u008a\u0000\u0000\u0126\u0128\u0005\u0091\u0000\u0000\u0127"+
		"\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0005\b\u0000\u0000\u012a\'"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0006\u0014\uffff\uffff\u0000\u012c"+
		"\u013d\u0003V+\u0000\u012d\u012e\u0003,\u0016\u0000\u012e\u012f\u0003"+
		"(\u0014\u0006\u012f\u013d\u0001\u0000\u0000\u0000\u0130\u0131\u0005%\u0000"+
		"\u0000\u0131\u0132\u0003(\u0014\u0000\u0132\u0134\u0005\u0003\u0000\u0000"+
		"\u0133\u0135\u0003.\u0017\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0005\u0004\u0000\u0000\u0137\u013d\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0005\u0003\u0000\u0000\u0139\u013a\u0003(\u0014\u0000\u013a\u013b"+
		"\u0005\u0004\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u012b"+
		"\u0001\u0000\u0000\u0000\u013c\u012d\u0001\u0000\u0000\u0000\u013c\u0130"+
		"\u0001\u0000\u0000\u0000\u013c\u0138\u0001\u0000\u0000\u0000\u013d\u0155"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\n\u0007\u0000\u0000\u013f\u0140\u0003"+
		"*\u0015\u0000\u0140\u0141\u0003(\u0014\b\u0141\u0154\u0001\u0000\u0000"+
		"\u0000\u0142\u0144\n\u0005\u0000\u0000\u0143\u0145\u0005?\u0000\u0000"+
		"\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0005\t\u0000\u0000\u0147"+
		"\u0154\u0005\u0091\u0000\u0000\u0148\u0149\n\u0004\u0000\u0000\u0149\u014a"+
		"\u0005\u0005\u0000\u0000\u014a\u014b\u0003(\u0014\u0000\u014b\u014c\u0005"+
		"\u0006\u0000\u0000\u014c\u0154\u0001\u0000\u0000\u0000\u014d\u014e\n\u0003"+
		"\u0000\u0000\u014e\u0150\u0005\u0003\u0000\u0000\u014f\u0151\u0003.\u0017"+
		"\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0154\u0005\u0004\u0000"+
		"\u0000\u0153\u013e\u0001\u0000\u0000\u0000\u0153\u0142\u0001\u0000\u0000"+
		"\u0000\u0153\u0148\u0001\u0000\u0000\u0000\u0153\u014d\u0001\u0000\u0000"+
		"\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156)\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u0164\u0003Z-\u0000\u0159\u0164"+
		"\u00055\u0000\u0000\u015a\u0164\u00056\u0000\u0000\u015b\u0164\u00057"+
		"\u0000\u0000\u015c\u0164\u00058\u0000\u0000\u015d\u0164\u00059\u0000\u0000"+
		"\u015e\u0164\u0005\u00a2\u0000\u0000\u015f\u0164\u0005:\u0000\u0000\u0160"+
		"\u0164\u0005<\u0000\u0000\u0161\u0164\u0005=\u0000\u0000\u0162\u0164\u0005"+
		">\u0000\u0000\u0163\u0158\u0001\u0000\u0000\u0000\u0163\u0159\u0001\u0000"+
		"\u0000\u0000\u0163\u015a\u0001\u0000\u0000\u0000\u0163\u015b\u0001\u0000"+
		"\u0000\u0000\u0163\u015c\u0001\u0000\u0000\u0000\u0163\u015d\u0001\u0000"+
		"\u0000\u0000\u0163\u015e\u0001\u0000\u0000\u0000\u0163\u015f\u0001\u0000"+
		"\u0000\u0000\u0163\u0160\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000"+
		"\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164+\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0007\u0001\u0000\u0000\u0166-\u0001\u0000\u0000\u0000"+
		"\u0167\u016c\u0003(\u0014\u0000\u0168\u0169\u0005\u0007\u0000\u0000\u0169"+
		"\u016b\u0003(\u0014\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016e"+
		"\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016d/\u0001\u0000\u0000\u0000\u016e\u016c\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0005}\u0000\u0000\u0170\u0171\u0005\u0001"+
		"\u0000\u0000\u0171\u0172\u0005\u0091\u0000\u0000\u0172\u0173\u0005\u0002"+
		"\u0000\u0000\u0173\u0174\u0005~\u0000\u0000\u0174\u0175\u0005\u0092\u0000"+
		"\u0000\u0175\u0176\u0005\b\u0000\u0000\u01761\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0005\u0013\u0000\u0000\u0178\u0179\u0005\u0003\u0000\u0000"+
		"\u0179\u017a\u00034\u001a\u0000\u017a\u017b\u0005\u0004\u0000\u0000\u017b"+
		"\u017c\u0003B!\u0000\u017c3\u0001\u0000\u0000\u0000\u017d\u0186\u0005"+
		"\u0001\u0000\u0000\u017e\u0183\u00036\u001b\u0000\u017f\u0180\u0005\u0007"+
		"\u0000\u0000\u0180\u0182\u00036\u001b\u0000\u0181\u017f\u0001\u0000\u0000"+
		"\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000"+
		"\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u017e\u0001\u0000\u0000"+
		"\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0005\u0002\u0000\u0000\u01895\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0007\u0002\u0000\u0000\u018b\u0191\u0005\n\u0000\u0000\u018c"+
		"\u0192\u0003V+\u0000\u018d\u0192\u0003\\.\u0000\u018e\u0192\u0003`0\u0000"+
		"\u018f\u0192\u0005\u0093\u0000\u0000\u0190\u0192\u0005u\u0000\u0000\u0191"+
		"\u018c\u0001\u0000\u0000\u0000\u0191\u018d\u0001\u0000\u0000\u0000\u0191"+
		"\u018e\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0190\u0001\u0000\u0000\u0000\u01927\u0001\u0000\u0000\u0000\u0193\u0198"+
		"\u0003:\u001d\u0000\u0194\u0195\u0005!\u0000\u0000\u0195\u0197\u0003:"+
		"\u001d\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000"+
		"\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000"+
		"\u0000\u0000\u01999\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000"+
		"\u0000\u019b\u01a1\u0005\u0091\u0000\u0000\u019c\u01a1\u0005\u008c\u0000"+
		"\u0000\u019d\u01a1\u0005\u0017\u0000\u0000\u019e\u01a1\u0003>\u001f\u0000"+
		"\u019f\u01a1\u0003<\u001e\u0000\u01a0\u019b\u0001\u0000\u0000\u0000\u01a0"+
		"\u019c\u0001\u0000\u0000\u0000\u01a0\u019d\u0001\u0000\u0000\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1"+
		";\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\u0091\u0000\u0000\u01a3\u01a4"+
		"\u0005\u0005\u0000\u0000\u01a4\u01a5\u0005\u0006\u0000\u0000\u01a5=\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0005\u0001\u0000\u0000\u01a7\u01ac\u0003"+
		"@ \u0000\u01a8\u01a9\u0005\b\u0000\u0000\u01a9\u01ab\u0003@ \u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad"+
		"\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af"+
		"\u01b1\u0005\b\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3"+
		"\u0005\u0002\u0000\u0000\u01b3?\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005"+
		"\u0091\u0000\u0000\u01b5\u01b6\u0005\n\u0000\u0000\u01b6\u01b7\u0003:"+
		"\u001d\u0000\u01b7A\u0001\u0000\u0000\u0000\u01b8\u01ba\u0005\u007f\u0000"+
		"\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005|\u0000\u0000"+
		"\u01bc\u01bd\u0005\u0091\u0000\u0000\u01bd\u01be\u0005\u0001\u0000\u0000"+
		"\u01be\u01bf\u0003D\"\u0000\u01bf\u01c0\u0005\u0002\u0000\u0000\u01c0"+
		"C\u0001\u0000\u0000\u0000\u01c1\u01c5\u0003d2\u0000\u01c2\u01c5\u0003"+
		"F#\u0000\u01c3\u01c5\u0003R)\u0000\u01c4\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7E\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\u0091\u0000\u0000\u01ca"+
		"\u01cc\u0005\u0003\u0000\u0000\u01cb\u01cd\u0003L&\u0000\u01cc\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001"+
		"\u0000\u0000\u0000\u01ce\u01d1\u0005\u0004\u0000\u0000\u01cf\u01d0\u0005"+
		"\n\u0000\u0000\u01d0\u01d2\u00038\u001c\u0000\u01d1\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d7\u0005\u0001\u0000\u0000\u01d4\u01d6\u0003d2\u0000"+
		"\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000"+
		"\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000"+
		"\u01da\u01db\u0005\u0002\u0000\u0000\u01dbG\u0001\u0000\u0000\u0000\u01dc"+
		"\u01dd\u0005\u0091\u0000\u0000\u01dd\u01de\u0003J%\u0000\u01deI\u0001"+
		"\u0000\u0000\u0000\u01df\u01e1\u0005\u0003\u0000\u0000\u01e0\u01e2\u0003"+
		"L&\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\u0004\u0000"+
		"\u0000\u01e4\u01e8\u0005\u0001\u0000\u0000\u01e5\u01e7\u0003d2\u0000\u01e6"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ec\u0005\u0002\u0000\u0000\u01ecK\u0001\u0000\u0000\u0000\u01ed\u01f2"+
		"\u0003N\'\u0000\u01ee\u01ef\u0005\u0007\u0000\u0000\u01ef\u01f1\u0003"+
		"N\'\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3M\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u0005\u0091\u0000\u0000\u01f6\u01f9\u0005\n\u0000\u0000"+
		"\u01f7\u01fa\u0003:\u001d\u0000\u01f8\u01fa\u0003>\u001f\u0000\u01f9\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01faO\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0005\u0091\u0000\u0000\u01fc\u0205\u0005"+
		"\u0003\u0000\u0000\u01fd\u0202\u0003V+\u0000\u01fe\u01ff\u0005\u0007\u0000"+
		"\u0000\u01ff\u0201\u0003V+\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201"+
		"\u0204\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0001\u0000\u0000\u0000\u0203\u0206\u0001\u0000\u0000\u0000\u0204"+
		"\u0202\u0001\u0000\u0000\u0000\u0205\u01fd\u0001\u0000\u0000\u0000\u0205"+
		"\u0206\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207"+
		"\u0208\u0005\u0004\u0000\u0000\u0208Q\u0001\u0000\u0000\u0000\u0209\u020b"+
		"\u0007\u0000\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b"+
		"\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020f"+
		"\u0005\u0091\u0000\u0000\u020d\u020e\u0005\n\u0000\u0000\u020e\u0210\u0003"+
		"8\u001c\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000"+
		"\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u0212\u0005\f\u0000"+
		"\u0000\u0212\u0214\u0003V+\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213"+
		"\u0214\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0005\b\u0000\u0000\u0216S\u0001\u0000\u0000\u0000\u0217\u0218"+
		"\u0003V+\u0000\u0218\u0219\u0005\f\u0000\u0000\u0219\u021b\u0003V+\u0000"+
		"\u021a\u021c\u0005\b\u0000\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021b"+
		"\u021c\u0001\u0000\u0000\u0000\u021cU\u0001\u0000\u0000\u0000\u021d\u021e"+
		"\u0006+\uffff\uffff\u0000\u021e\u0229\u0005\u0094\u0000\u0000\u021f\u0229"+
		"\u0005\u0098\u0000\u0000\u0220\u0229\u0005\u0092\u0000\u0000\u0221\u0229"+
		"\u0005\u0093\u0000\u0000\u0222\u0229\u0005\u0091\u0000\u0000\u0223\u0229"+
		"\u0005\u008c\u0000\u0000\u0224\u0229\u0003\\.\u0000\u0225\u0229\u0003"+
		"`0\u0000\u0226\u0229\u0003b1\u0000\u0227\u0229\u0003P(\u0000\u0228\u021d"+
		"\u0001\u0000\u0000\u0000\u0228\u021f\u0001\u0000\u0000\u0000\u0228\u0220"+
		"\u0001\u0000\u0000\u0000\u0228\u0221\u0001\u0000\u0000\u0000\u0228\u0222"+
		"\u0001\u0000\u0000\u0000\u0228\u0223\u0001\u0000\u0000\u0000\u0228\u0224"+
		"\u0001\u0000\u0000\u0000\u0228\u0225\u0001\u0000\u0000\u0000\u0228\u0226"+
		"\u0001\u0000\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229\u0236"+
		"\u0001\u0000\u0000\u0000\u022a\u022b\n\u0003\u0000\u0000\u022b\u022c\u0003"+
		"Z-\u0000\u022c\u022d\u0003V+\u0004\u022d\u0235\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\n\u0004\u0000\u0000\u022f\u0235\u0003X,\u0000\u0230\u0231"+
		"\n\u0002\u0000\u0000\u0231\u0235\u0005\u0015\u0000\u0000\u0232\u0233\n"+
		"\u0001\u0000\u0000\u0233\u0235\u0005\u0016\u0000\u0000\u0234\u022a\u0001"+
		"\u0000\u0000\u0000\u0234\u022e\u0001\u0000\u0000\u0000\u0234\u0230\u0001"+
		"\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0235\u0238\u0001"+
		"\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001"+
		"\u0000\u0000\u0000\u0237W\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000"+
		"\u0000\u0000\u0239\u023c\u0005\t\u0000\u0000\u023a\u023d\u0003P(\u0000"+
		"\u023b\u023d\u0005\u0091\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000"+
		"\u023c\u023b\u0001\u0000\u0000\u0000\u023dY\u0001\u0000\u0000\u0000\u023e"+
		"\u023f\u0007\u0003\u0000\u0000\u023f[\u0001\u0000\u0000\u0000\u0240\u0249"+
		"\u0005\u0001\u0000\u0000\u0241\u0246\u0003^/\u0000\u0242\u0243\u0005\u0007"+
		"\u0000\u0000\u0243\u0245\u0003^/\u0000\u0244\u0242\u0001\u0000\u0000\u0000"+
		"\u0245\u0248\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000"+
		"\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000"+
		"\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u0241\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000"+
		"\u024b\u024c\u0005\u0002\u0000\u0000\u024c]\u0001\u0000\u0000\u0000\u024d"+
		"\u024e\u0007\u0004\u0000\u0000\u024e\u0253\u0005\n\u0000\u0000\u024f\u0254"+
		"\u0003V+\u0000\u0250\u0254\u0003\\.\u0000\u0251\u0254\u0003`0\u0000\u0252"+
		"\u0254\u0005\u0093\u0000\u0000\u0253\u024f\u0001\u0000\u0000\u0000\u0253"+
		"\u0250\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253"+
		"\u0252\u0001\u0000\u0000\u0000\u0254_\u0001\u0000\u0000\u0000\u0255\u025e"+
		"\u0005\u0005\u0000\u0000\u0256\u025b\u0003V+\u0000\u0257\u0258\u0005\u0007"+
		"\u0000\u0000\u0258\u025a\u0003V+\u0000\u0259\u0257\u0001\u0000\u0000\u0000"+
		"\u025a\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000"+
		"\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025f\u0001\u0000\u0000\u0000"+
		"\u025d\u025b\u0001\u0000\u0000\u0000\u025e\u0256\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000"+
		"\u0260\u0261\u0005\u0006\u0000\u0000\u0261a\u0001\u0000\u0000\u0000\u0262"+
		"\u026b\u0005\u0005\u0000\u0000\u0263\u0268\u0003V+\u0000\u0264\u0265\u0005"+
		"\u0007\u0000\u0000\u0265\u0267\u0003V+\u0000\u0266\u0264\u0001\u0000\u0000"+
		"\u0000\u0267\u026a\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000"+
		"\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026c\u0001\u0000\u0000"+
		"\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026b\u0263\u0001\u0000\u0000"+
		"\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000"+
		"\u0000\u026d\u026e\u0005\u0006\u0000\u0000\u026ec\u0001\u0000\u0000\u0000"+
		"\u026f\u0278\u0003P(\u0000\u0270\u0278\u0003V+\u0000\u0271\u0278\u0003"+
		"R)\u0000\u0272\u0278\u0003T*\u0000\u0273\u0278\u0003B!\u0000\u0274\u0278"+
		"\u0003H$\u0000\u0275\u0276\u0005\u007f\u0000\u0000\u0276\u0278\u0003R"+
		")\u0000\u0277\u026f\u0001\u0000\u0000\u0000\u0277\u0270\u0001\u0000\u0000"+
		"\u0000\u0277\u0271\u0001\u0000\u0000\u0000\u0277\u0272\u0001\u0000\u0000"+
		"\u0000\u0277\u0273\u0001\u0000\u0000\u0000\u0277\u0274\u0001\u0000\u0000"+
		"\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0278e\u0001\u0000\u0000\u0000"+
		"\u0279\u027d\u0003h4\u0000\u027a\u027c\u0003f3\u0000\u027b\u027a\u0001"+
		"\u0000\u0000\u0000\u027c\u027f\u0001\u0000\u0000\u0000\u027d\u027b\u0001"+
		"\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u0281\u0001"+
		"\u0000\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u0280\u0282\u0003"+
		"l6\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000"+
		"\u0000\u0282\u0287\u0001\u0000\u0000\u0000\u0283\u0287\u0003n7\u0000\u0284"+
		"\u0287\u0005w\u0000\u0000\u0285\u0287\u0005\u00a1\u0000\u0000\u0286\u0279"+
		"\u0001\u0000\u0000\u0000\u0286\u0283\u0001\u0000\u0000\u0000\u0286\u0284"+
		"\u0001\u0000\u0000\u0000\u0286\u0285\u0001\u0000\u0000\u0000\u0287g\u0001"+
		"\u0000\u0000\u0000\u0288\u0289\u0007\u0005\u0000\u0000\u0289\u028d\u0007"+
		"\u0006\u0000\u0000\u028a\u028c\u0003j5\u0000\u028b\u028a\u0001\u0000\u0000"+
		"\u0000\u028c\u028f\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000\u0000"+
		"\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u0290\u0001\u0000\u0000"+
		"\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u0290\u0291\u0005\u0019\u0000"+
		"\u0000\u0291i\u0001\u0000\u0000\u0000\u0292\u0293\u0007\u0007\u0000\u0000"+
		"\u0293\u029b\u0005\f\u0000\u0000\u0294\u029c\u0005\u0092\u0000\u0000\u0295"+
		"\u029c\u0005\u0093\u0000\u0000\u0296\u0297\u0005\u0001\u0000\u0000\u0297"+
		"\u0298\u0003V+\u0000\u0298\u0299\u0005\u0002\u0000\u0000\u0299\u029c\u0001"+
		"\u0000\u0000\u0000\u029a\u029c\u0005w\u0000\u0000\u029b\u0294\u0001\u0000"+
		"\u0000\u0000\u029b\u0295\u0001\u0000\u0000\u0000\u029b\u0296\u0001\u0000"+
		"\u0000\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c\u02a5\u0001\u0000"+
		"\u0000\u0000\u029d\u02a5\u0005g\u0000\u0000\u029e\u029f\u0005u\u0000\u0000"+
		"\u029f\u02a0\u0005\f\u0000\u0000\u02a0\u02a5\u0003V+\u0000\u02a1\u02a2"+
		"\u0005v\u0000\u0000\u02a2\u02a3\u0005\f\u0000\u0000\u02a3\u02a5\u0003"+
		"V+\u0000\u02a4\u0292\u0001\u0000\u0000\u0000\u02a4\u029d\u0001\u0000\u0000"+
		"\u0000\u02a4\u029e\u0001\u0000\u0000\u0000\u02a4\u02a1\u0001\u0000\u0000"+
		"\u0000\u02a5k\u0001\u0000\u0000\u0000\u02a6\u02a7\u0007\u0005\u0000\u0000"+
		"\u02a7\u02a8\u0005\u001c\u0000\u0000\u02a8\u02a9\u0007\u0006\u0000\u0000"+
		"\u02a9\u02aa\u0005\u0019\u0000\u0000\u02aam\u0001\u0000\u0000\u0000\u02ab"+
		"\u02ac\u0007\u0005\u0000\u0000\u02ac\u02b0\u0007\u0006\u0000\u0000\u02ad"+
		"\u02af\u0003j5\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02af\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b3\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b4\u0005\u001c\u0000\u0000\u02b4\u02b5\u0005"+
		"\u0019\u0000\u0000\u02b5o\u0001\u0000\u0000\u0000Fsy\u007f\u0093\u009b"+
		"\u00af\u00b9\u00bd\u00c7\u00cf\u00d6\u00da\u00de\u00f4\u0107\u010a\u0111"+
		"\u011b\u0121\u0127\u0134\u013c\u0144\u0150\u0153\u0155\u0163\u016c\u0183"+
		"\u0186\u0191\u0198\u01a0\u01ac\u01b0\u01b9\u01c4\u01c6\u01cc\u01d1\u01d7"+
		"\u01e1\u01e8\u01f2\u01f9\u0202\u0205\u020a\u020f\u0213\u021b\u0228\u0234"+
		"\u0236\u023c\u0246\u0249\u0253\u025b\u025e\u0268\u026b\u0277\u027d\u0281"+
		"\u0286\u028d\u029b\u02a4\u02b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}