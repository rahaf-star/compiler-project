// Generated from C:/Users/Rahaf/Desktop/comp/compiler-project/compiler/src/antlr/AngulerParser.g4 by ANTLR 4.13.2
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
		HTML_TEXT=161, MUL=162, SUM=163, MIN=164, NOT=165, HASH=166, NG_CONTENT=167, 
		NG_TEMPLATE=168;
	public static final int
		RULE_prog = 0, RULE_anguler_import = 1, RULE_component_declaration = 2, 
		RULE_component_metadata = 3, RULE_metadata_property = 4, RULE_selector_property = 5, 
		RULE_standalone_property = 6, RULE_imports_property = 7, RULE_template_property = 8, 
		RULE_templateUrl_property = 9, RULE_styles_property = 10, RULE_styleUrls_property = 11, 
		RULE_type_annotation = 12, RULE_base_type_annotation = 13, RULE_primitive_type = 14, 
		RULE_array_type = 15, RULE_structured_type = 16, RULE_type_pair = 17, 
		RULE_class_declaration = 18, RULE_class_body = 19, RULE_method_declaration = 20, 
		RULE_method_body = 21, RULE_function_declaration = 22, RULE_function_body = 23, 
		RULE_parameter_list = 24, RULE_parameter = 25, RULE_function_call = 26, 
		RULE_declaraiton_keywords = 27, RULE_variable_declaration = 28, RULE_assignment = 29, 
		RULE_value = 30, RULE_literal_value = 31, RULE_member_expression = 32, 
		RULE_dot_value = 33, RULE_arithmetic_expression = 34, RULE_unary_expression = 35, 
		RULE_relational_expression = 36, RULE_equality_expression = 37, RULE_logical_expression = 38, 
		RULE_conditional_expression = 39, RULE_expression = 40, RULE_json_object = 41, 
		RULE_json_pair = 42, RULE_imports_array = 43, RULE_array = 44, RULE_instruction = 45, 
		RULE_conditional_statements = 46, RULE_block = 47, RULE_if_statement = 48, 
		RULE_for_statement = 49, RULE_switch_statement = 50, RULE_switch_body = 51, 
		RULE_switch_case = 52, RULE_switch_default = 53, RULE_while_statement = 54, 
		RULE_do_while_statement = 55, RULE_continue_Statement = 56, RULE_return_Statement = 57, 
		RULE_break_statement = 58, RULE_expressionSequence = 59, RULE_interface_Declaration = 60, 
		RULE_generic_Type = 61, RULE_eos = 62, RULE_html_value = 63, RULE_tags = 64, 
		RULE_open_tag = 65, RULE_attrs = 66, RULE_html_attribute = 67, RULE_close_tag = 68, 
		RULE_single_tag = 69, RULE_template_variable = 70, RULE_ng_content = 71, 
		RULE_ng_template = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "anguler_import", "component_declaration", "component_metadata", 
			"metadata_property", "selector_property", "standalone_property", "imports_property", 
			"template_property", "templateUrl_property", "styles_property", "styleUrls_property", 
			"type_annotation", "base_type_annotation", "primitive_type", "array_type", 
			"structured_type", "type_pair", "class_declaration", "class_body", "method_declaration", 
			"method_body", "function_declaration", "function_body", "parameter_list", 
			"parameter", "function_call", "declaraiton_keywords", "variable_declaration", 
			"assignment", "value", "literal_value", "member_expression", "dot_value", 
			"arithmetic_expression", "unary_expression", "relational_expression", 
			"equality_expression", "logical_expression", "conditional_expression", 
			"expression", "json_object", "json_pair", "imports_array", "array", "instruction", 
			"conditional_statements", "block", "if_statement", "for_statement", "switch_statement", 
			"switch_body", "switch_case", "switch_default", "while_statement", "do_while_statement", 
			"continue_Statement", "return_Statement", "break_statement", "expressionSequence", 
			"interface_Declaration", "generic_Type", "eos", "html_value", "tags", 
			"open_tag", "attrs", "html_attribute", "close_tag", "single_tag", "template_variable", 
			"ng_content", "ng_template"
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
			"MUL", "SUM", "MIN", "NOT", "HASH", "NG_CONTENT", "NG_TEMPLATE"
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
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				anguler_import();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				component_declaration();
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMPONENT );
			setState(156);
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
		enterRule(_localctx, 2, RULE_anguler_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IMPORT);
			setState(159);
			match(OPEN_BRACE);
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(CLOSE_BRACE);
			setState(162);
			match(FROM);
			setState(163);
			match(STRING_LITERAL);
			setState(164);
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
		enterRule(_localctx, 4, RULE_component_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(COMPONENT);
			setState(167);
			match(OPEN_PAREN);
			setState(168);
			component_metadata();
			setState(169);
			match(CLOSE_PAREN);
			setState(170);
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
		enterRule(_localctx, 6, RULE_component_metadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(OPEN_BRACE);
			{
			setState(173);
			metadata_property();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(174);
				match(COMMA);
				setState(175);
				metadata_property();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(181);
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
		public Metadata_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata_property; }
	 
		public Metadata_propertyContext() { }
		public void copyFrom(Metadata_propertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataStyleUrlsContext extends Metadata_propertyContext {
		public StyleUrls_propertyContext styleUrls_property() {
			return getRuleContext(StyleUrls_propertyContext.class,0);
		}
		public MetadataStyleUrlsContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataStyleUrls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataStyleUrls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataStyleUrls(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataImportsContext extends Metadata_propertyContext {
		public Imports_propertyContext imports_property() {
			return getRuleContext(Imports_propertyContext.class,0);
		}
		public MetadataImportsContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataImports(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataTemplateContext extends Metadata_propertyContext {
		public Template_propertyContext template_property() {
			return getRuleContext(Template_propertyContext.class,0);
		}
		public MetadataTemplateContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataTemplate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataStylesContext extends Metadata_propertyContext {
		public Styles_propertyContext styles_property() {
			return getRuleContext(Styles_propertyContext.class,0);
		}
		public MetadataStylesContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataStyles(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataStandaloneContext extends Metadata_propertyContext {
		public Standalone_propertyContext standalone_property() {
			return getRuleContext(Standalone_propertyContext.class,0);
		}
		public MetadataStandaloneContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataStandalone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataSelectorContext extends Metadata_propertyContext {
		public Selector_propertyContext selector_property() {
			return getRuleContext(Selector_propertyContext.class,0);
		}
		public MetadataSelectorContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetadataTemplateUrlContext extends Metadata_propertyContext {
		public TemplateUrl_propertyContext templateUrl_property() {
			return getRuleContext(TemplateUrl_propertyContext.class,0);
		}
		public MetadataTemplateUrlContext(Metadata_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMetadataTemplateUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMetadataTemplateUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMetadataTemplateUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Metadata_propertyContext metadata_property() throws RecognitionException {
		Metadata_propertyContext _localctx = new Metadata_propertyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metadata_property);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new MetadataSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				selector_property();
				}
				break;
			case STANDALONE:
				_localctx = new MetadataStandaloneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				standalone_property();
				}
				break;
			case IMPORTS:
				_localctx = new MetadataImportsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				imports_property();
				}
				break;
			case TEMPLATE:
				_localctx = new MetadataTemplateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				template_property();
				}
				break;
			case TEMPLATE_URL:
				_localctx = new MetadataTemplateUrlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				templateUrl_property();
				}
				break;
			case STYLES:
				_localctx = new MetadataStylesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				styles_property();
				}
				break;
			case STYLE_URLS:
				_localctx = new MetadataStyleUrlsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				styleUrls_property();
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
	public static class Selector_propertyContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngulerParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public Selector_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSelector_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSelector_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSelector_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_propertyContext selector_property() throws RecognitionException {
		Selector_propertyContext _localctx = new Selector_propertyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selector_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(SELECTOR);
			setState(193);
			match(COLON);
			setState(194);
			match(STRING_LITERAL);
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
	public static class Standalone_propertyContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(AngulerParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngulerParser.BOOLEAN, 0); }
		public Standalone_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalone_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStandalone_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStandalone_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStandalone_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standalone_propertyContext standalone_property() throws RecognitionException {
		Standalone_propertyContext _localctx = new Standalone_propertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_standalone_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(STANDALONE);
			setState(197);
			match(COLON);
			setState(198);
			match(BOOLEAN);
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
	public static class Imports_propertyContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(AngulerParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Imports_arrayContext imports_array() {
			return getRuleContext(Imports_arrayContext.class,0);
		}
		public TerminalNode BINDING() { return getToken(AngulerParser.BINDING, 0); }
		public Imports_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterImports_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitImports_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitImports_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Imports_propertyContext imports_property() throws RecognitionException {
		Imports_propertyContext _localctx = new Imports_propertyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_imports_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(IMPORTS);
			setState(201);
			match(COLON);
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				{
				setState(202);
				imports_array();
				}
				break;
			case BINDING:
				{
				setState(203);
				match(BINDING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Template_propertyContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(AngulerParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode TEMPLATE_LITERAL() { return getToken(AngulerParser.TEMPLATE_LITERAL, 0); }
		public Template_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTemplate_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTemplate_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTemplate_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_propertyContext template_property() throws RecognitionException {
		Template_propertyContext _localctx = new Template_propertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_template_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(TEMPLATE);
			setState(207);
			match(COLON);
			setState(208);
			match(TEMPLATE_LITERAL);
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
	public static class TemplateUrl_propertyContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_URL() { return getToken(AngulerParser.TEMPLATE_URL, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public TemplateUrl_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateUrl_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTemplateUrl_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTemplateUrl_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTemplateUrl_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateUrl_propertyContext templateUrl_property() throws RecognitionException {
		TemplateUrl_propertyContext _localctx = new TemplateUrl_propertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_templateUrl_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(TEMPLATE_URL);
			setState(211);
			match(COLON);
			setState(212);
			match(STRING_LITERAL);
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
	public static class Styles_propertyContext extends ParserRuleContext {
		public TerminalNode STYLES() { return getToken(AngulerParser.STYLES, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Styles_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styles_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStyles_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStyles_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStyles_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Styles_propertyContext styles_property() throws RecognitionException {
		Styles_propertyContext _localctx = new Styles_propertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_styles_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(STYLES);
			setState(215);
			match(COLON);
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(216);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_BRACKET:
				{
				setState(217);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class StyleUrls_propertyContext extends ParserRuleContext {
		public TerminalNode STYLE_URLS() { return getToken(AngulerParser.STYLE_URLS, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Imports_arrayContext imports_array() {
			return getRuleContext(Imports_arrayContext.class,0);
		}
		public StyleUrls_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleUrls_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStyleUrls_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStyleUrls_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStyleUrls_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleUrls_propertyContext styleUrls_property() throws RecognitionException {
		StyleUrls_propertyContext _localctx = new StyleUrls_propertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_styleUrls_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(STYLE_URLS);
			setState(221);
			match(COLON);
			setState(222);
			imports_array();
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
		enterRule(_localctx, 24, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			base_type_annotation();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(225);
				match(PIPE);
				setState(226);
				base_type_annotation();
				}
				}
				setState(231);
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
	public static class PrimitiveTypeContext extends Base_type_annotationContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public PrimitiveTypeContext(Base_type_annotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
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
		enterRule(_localctx, 26, RULE_base_type_annotation);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new SimpleTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				primitive_type();
				}
				break;
			case 3:
				_localctx = new NullTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(NULL);
				}
				break;
			case 4:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(VOID);
				}
				break;
			case 5:
				_localctx = new StructuredTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				structured_type();
				}
				break;
			case 6:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
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
	public static class Primitive_typeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngulerParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AngulerParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngulerParser.BOOLEAN, 0); }
		public TerminalNode ANY() { return getToken(AngulerParser.ANY, 0); }
		public TerminalNode UNDEFINED() { return getToken(AngulerParser.UNDEFINED, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrimitive_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrimitive_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrimitive_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2305843009213694009L) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(IDENTIFIER);
			setState(243);
			match(OPEN_BRACKET);
			setState(244);
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
		enterRule(_localctx, 32, RULE_structured_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(OPEN_BRACE);
			setState(247);
			type_pair();
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					match(SEMICOLON);
					setState(249);
					type_pair();
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(255);
				match(SEMICOLON);
				}
			}

			setState(258);
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
		enterRule(_localctx, 34, RULE_type_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(IDENTIFIER);
			setState(261);
			match(COLON);
			setState(262);
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
		enterRule(_localctx, 36, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(264);
				match(EXPORT);
				}
			}

			setState(267);
			match(CLASS);
			setState(268);
			match(IDENTIFIER);
			setState(269);
			match(OPEN_BRACE);
			setState(270);
			class_body();
			setState(271);
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
		enterRule(_localctx, 38, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023255594L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 301822937L) != 0)) {
				{
				{
				setState(273);
				instruction();
				}
				}
				setState(278);
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
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
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
		enterRule(_localctx, 40, RULE_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(IDENTIFIER);
			setState(280);
			method_body();
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
	public static class Method_bodyContext extends ParserRuleContext {
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
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMethod_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMethod_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_method_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(OPEN_PAREN);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(283);
				parameter_list();
				}
			}

			setState(286);
			match(CLOSE_PAREN);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(287);
				match(COLON);
				setState(288);
				type_annotation();
				}
			}

			setState(291);
			match(OPEN_BRACE);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023255594L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 301822937L) != 0)) {
				{
				{
				setState(292);
				instruction();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
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
		enterRule(_localctx, 44, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(IDENTIFIER);
			setState(301);
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
		enterRule(_localctx, 46, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(OPEN_PAREN);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(304);
				parameter_list();
				}
			}

			setState(307);
			match(CLOSE_PAREN);
			setState(308);
			match(OPEN_BRACE);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023255594L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 301822937L) != 0)) {
				{
				{
				setState(309);
				instruction();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
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
		enterRule(_localctx, 48, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			parameter();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(318);
				match(COMMA);
				setState(319);
				parameter();
				}
				}
				setState(324);
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
		enterRule(_localctx, 50, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(IDENTIFIER);
			setState(326);
			match(COLON);
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(327);
				base_type_annotation();
				}
				break;
			case 2:
				{
				setState(328);
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
		enterRule(_localctx, 52, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(IDENTIFIER);
			setState(332);
			match(OPEN_PAREN);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 4577L) != 0)) {
				{
				setState(333);
				value();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(334);
					match(COMMA);
					setState(335);
					value();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(343);
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
	public static class Declaraiton_keywordsContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngulerParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngulerParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngulerParser.VAR, 0); }
		public Declaraiton_keywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraiton_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterDeclaraiton_keywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitDeclaraiton_keywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitDeclaraiton_keywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaraiton_keywordsContext declaraiton_keywords() throws RecognitionException {
		Declaraiton_keywordsContext _localctx = new Declaraiton_keywordsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declaraiton_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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
		public Declaraiton_keywordsContext declaraiton_keywords() {
			return getRuleContext(Declaraiton_keywordsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 7L) != 0)) {
				{
				setState(347);
				declaraiton_keywords();
				}
			}

			setState(350);
			match(IDENTIFIER);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(351);
				match(COLON);
				setState(352);
				type_annotation();
				}
			}

			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(355);
				match(EQUAL);
				setState(356);
				value();
				}
			}

			setState(359);
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
		public Member_expressionContext member_expression() {
			return getRuleContext(Member_expressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 58, RULE_assignment);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				member_expression();
				setState(362);
				match(EQUAL);
				setState(363);
				value();
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(364);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(IDENTIFIER);
				setState(368);
				match(EQUAL);
				setState(369);
				value();
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(370);
					match(SEMICOLON);
					}
				}

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
	public static class ParenthesizedValueContext extends ValueContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public ParenthesizedValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterParenthesizedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitParenthesizedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitParenthesizedValue(this);
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
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
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
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_value);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				literal_value();
				}
				break;
			case 2:
				_localctx = new IdentifierValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new NullValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(NULL);
				}
				break;
			case 4:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				json_object();
				}
				break;
			case 5:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(379);
				array();
				}
				break;
			case 6:
				_localctx = new FunctionCallValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(380);
				function_call();
				}
				break;
			case 7:
				_localctx = new ParenthesizedValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(381);
				match(OPEN_PAREN);
				setState(382);
				expression();
				setState(383);
				match(CLOSE_PAREN);
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
	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode DECIMAL_INTEGER_LITERAL() { return getToken(AngulerParser.DECIMAL_INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(AngulerParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
		public TerminalNode TEMPLATE_LITERAL() { return getToken(AngulerParser.TEMPLATE_LITERAL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ( !(((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & 71L) != 0)) ) {
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
	public static class Member_expressionContext extends ParserRuleContext {
		public Member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_expression; }
	 
		public Member_expressionContext() { }
		public void copyFrom(Member_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends Member_expressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Dot_valueContext dot_value() {
			return getRuleContext(Dot_valueContext.class,0);
		}
		public MemberAccessContext(Member_expressionContext ctx) { copyFrom(ctx); }
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
	public static class ComputedMemberAccessContext extends Member_expressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(AngulerParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(AngulerParser.CLOSE_BRACKET, 0); }
		public ComputedMemberAccessContext(Member_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterComputedMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitComputedMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitComputedMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_expressionContext member_expression() throws RecognitionException {
		Member_expressionContext _localctx = new Member_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_member_expression);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new MemberAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				value();
				setState(390);
				dot_value();
				}
				break;
			case 2:
				_localctx = new ComputedMemberAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				value();
				setState(393);
				match(OPEN_BRACKET);
				setState(394);
				expression();
				setState(395);
				match(CLOSE_BRACKET);
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
	public static class Dot_valueContext extends ParserRuleContext {
		public Dot_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_value; }
	 
		public Dot_valueContext() { }
		public void copyFrom(Dot_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallOrPropertyAccessContext extends Dot_valueContext {
		public TerminalNode DOT() { return getToken(AngulerParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public MethodCallOrPropertyAccessContext(Dot_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMethodCallOrPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMethodCallOrPropertyAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMethodCallOrPropertyAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_valueContext dot_value() throws RecognitionException {
		Dot_valueContext _localctx = new Dot_valueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dot_value);
		try {
			_localctx = new MethodCallOrPropertyAccessContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(DOT);
			setState(400);
			match(IDENTIFIER);
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
	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
	 
		public Arithmetic_expressionContext() { }
		public void copyFrom(Arithmetic_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends Arithmetic_expressionContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode SUM() { return getToken(AngulerParser.SUM, 0); }
		public TerminalNode MIN() { return getToken(AngulerParser.MIN, 0); }
		public AdditiveExpressionContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends Arithmetic_expressionContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode MUL() { return getToken(AngulerParser.MUL, 0); }
		public TerminalNode SLASH() { return getToken(AngulerParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(AngulerParser.MOD, 0); }
		public MultiplicativeExpressionContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arithmetic_expression);
		int _la;
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new MultiplicativeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				value();
				setState(403);
				_la = _input.LA(1);
				if ( !(_la==SLASH || _la==MOD || _la==MUL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(404);
				value();
				}
				break;
			case 2:
				_localctx = new AdditiveExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				value();
				setState(407);
				_la = _input.LA(1);
				if ( !(_la==SUM || _la==MIN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(408);
				value();
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
	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	 
		public Unary_expressionContext() { }
		public void copyFrom(Unary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPlusMinusExpressionContext extends Unary_expressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SUM() { return getToken(AngulerParser.SUM, 0); }
		public TerminalNode MIN() { return getToken(AngulerParser.MIN, 0); }
		public UnaryPlusMinusExpressionContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterUnaryPlusMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitUnaryPlusMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitUnaryPlusMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixUnaryOperationContext extends Unary_expressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(AngulerParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(AngulerParser.DECREMENT, 0); }
		public PrefixUnaryOperationContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPrefixUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPrefixUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPrefixUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends Unary_expressionContext {
		public TerminalNode NOT() { return getToken(AngulerParser.NOT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NotExpressionContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixUnaryOperationContext extends Unary_expressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(AngulerParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(AngulerParser.DECREMENT, 0); }
		public PostfixUnaryOperationContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterPostfixUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitPostfixUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitPostfixUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unary_expression);
		int _la;
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
			case MIN:
				_localctx = new UnaryPlusMinusExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				_la = _input.LA(1);
				if ( !(_la==SUM || _la==MIN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(413);
				value();
				}
				break;
			case INCREMENT:
			case DECREMENT:
				_localctx = new PrefixUnaryOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(415);
				value();
				}
				break;
			case OPEN_BRACE:
			case OPEN_PAREN:
			case OPEN_BRACKET:
			case NULL:
			case IDENTIFIER:
			case STRING_LITERAL:
			case TEMPLATE_LITERAL:
			case DECIMAL_INTEGER_LITERAL:
			case FLOAT_LITERAL:
				_localctx = new PostfixUnaryOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				value();
				setState(417);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NOT:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				match(NOT);
				setState(420);
				value();
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
	public static class Relational_expressionContext extends ParserRuleContext {
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
	 
		public Relational_expressionContext() { }
		public void copyFrom(Relational_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends Relational_expressionContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(AngulerParser.LESS_EQUAL, 0); }
		public TerminalNode GRETER_EQUAL() { return getToken(AngulerParser.GRETER_EQUAL, 0); }
		public ComparisonExpressionContext(Relational_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_relational_expression);
		int _la;
		try {
			_localctx = new ComparisonExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			value();
			setState(424);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(425);
			value();
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
	public static class Equality_expressionContext extends ParserRuleContext {
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
	 
		public Equality_expressionContext() { }
		public void copyFrom(Equality_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityComparisonContext extends Equality_expressionContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode IS_EQUAL() { return getToken(AngulerParser.IS_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(AngulerParser.NOT_EQUAL, 0); }
		public TerminalNode IS_EQUAL_TYPE() { return getToken(AngulerParser.IS_EQUAL_TYPE, 0); }
		public TerminalNode NOT_EQUAL_TYPE() { return getToken(AngulerParser.NOT_EQUAL_TYPE, 0); }
		public EqualityComparisonContext(Equality_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterEqualityComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitEqualityComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitEqualityComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_equality_expression);
		int _la;
		try {
			_localctx = new EqualityComparisonContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			value();
			setState(428);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(429);
			value();
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
	public static class Logical_expressionContext extends ParserRuleContext {
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
	 
		public Logical_expressionContext() { }
		public void copyFrom(Logical_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends Logical_expressionContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode AND() { return getToken(AngulerParser.AND, 0); }
		public LogicalAndExpressionContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends Logical_expressionContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode OR() { return getToken(AngulerParser.OR, 0); }
		public LogicalOrExpressionContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_logical_expression);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new LogicalAndExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				value();
				setState(432);
				match(AND);
				setState(433);
				value();
				}
				break;
			case 2:
				_localctx = new LogicalOrExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				value();
				setState(436);
				match(OR);
				setState(437);
				value();
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
	public static class Conditional_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	 
		public Conditional_expressionContext() { }
		public void copyFrom(Conditional_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends Conditional_expressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(AngulerParser.QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public TernaryExpressionContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_conditional_expression);
		try {
			_localctx = new TernaryExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			value();
			setState(442);
			match(QUESTION);
			setState(443);
			expression();
			setState(444);
			match(COLON);
			setState(445);
			expression();
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMemberAccessContext extends ExpressionContext {
		public Member_expressionContext member_expression() {
			return getRuleContext(Member_expressionContext.class,0);
		}
		public ExprMemberAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExprMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExprMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExprMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprConditionalContext extends ExpressionContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public ExprConditionalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExprConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExprConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExprConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprValueContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExprValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExprValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExprValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExprValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelationalContext extends ExpressionContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public ExprRelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExprRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExprRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExprRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprEqualityContext extends ExpressionContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public ExprEqualityContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExprEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExprEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExprEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicalContext extends ExpressionContext {
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public ExprLogicalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExprLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExprLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExprLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryContext extends ExpressionContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public ExprUnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExprUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprArithmeticContext extends ExpressionContext {
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public ExprArithmeticContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExprArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExprArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExprArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expression);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new ExprConditionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				conditional_expression();
				}
				break;
			case 2:
				_localctx = new ExprLogicalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				logical_expression();
				}
				break;
			case 3:
				_localctx = new ExprRelationalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				relational_expression();
				}
				break;
			case 4:
				_localctx = new ExprEqualityContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				equality_expression();
				}
				break;
			case 5:
				_localctx = new ExprArithmeticContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				arithmetic_expression();
				}
				break;
			case 6:
				_localctx = new ExprUnaryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(452);
				unary_expression();
				}
				break;
			case 7:
				_localctx = new ExprMemberAccessContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(453);
				member_expression();
				}
				break;
			case 8:
				_localctx = new ExprValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(454);
				value();
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
		enterRule(_localctx, 82, RULE_json_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(OPEN_BRACE);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(458);
				json_pair();
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(459);
					match(COMMA);
					setState(460);
					json_pair();
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(468);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AngulerParser.STRING_LITERAL, 0); }
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
		enterRule(_localctx, 84, RULE_json_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(471);
			match(COLON);
			setState(472);
			value();
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
		enterRule(_localctx, 86, RULE_imports_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(OPEN_BRACKET);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 4577L) != 0)) {
				{
				setState(475);
				value();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(476);
					match(COMMA);
					setState(477);
					value();
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(485);
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
		enterRule(_localctx, 88, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(OPEN_BRACKET);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 4577L) != 0)) {
				{
				setState(488);
				value();
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(489);
					match(COMMA);
					setState(490);
					value();
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(498);
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
	public static class ConditionalStatementContext extends InstructionContext {
		public Conditional_statementsContext conditional_statements() {
			return getRuleContext(Conditional_statementsContext.class,0);
		}
		public ConditionalStatementContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
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
	public static class InterfaceDeclarationContext extends InstructionContext {
		public Interface_DeclarationContext interface_Declaration() {
			return getRuleContext(Interface_DeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends InstructionContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public MethodDeclarationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
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
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
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
	public static class GenericTypeContext extends InstructionContext {
		public Generic_TypeContext generic_Type() {
			return getRuleContext(Generic_TypeContext.class,0);
		}
		public GenericTypeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitGenericType(this);
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
		enterRule(_localctx, 90, RULE_instruction);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new FunctionCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				function_call();
				setState(501);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				variable_declaration();
				}
				break;
			case 3:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				assignment();
				}
				break;
			case 4:
				_localctx = new ClassDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				class_declaration();
				}
				break;
			case 5:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(506);
				function_declaration();
				}
				break;
			case 6:
				_localctx = new ExportStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(507);
				match(EXPORT);
				setState(508);
				variable_declaration();
				}
				break;
			case 7:
				_localctx = new ConditionalStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(509);
				conditional_statements();
				}
				break;
			case 8:
				_localctx = new InterfaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(510);
				interface_Declaration();
				}
				break;
			case 9:
				_localctx = new GenericTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(511);
				generic_Type();
				}
				break;
			case 10:
				_localctx = new MethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(512);
				method_declaration();
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
	public static class Conditional_statementsContext extends ParserRuleContext {
		public Conditional_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statements; }
	 
		public Conditional_statementsContext() { }
		public void copyFrom(Conditional_statementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtBreakContext extends Conditional_statementsContext {
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public StmtBreakContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStmtBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStmtBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStmtBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtWhileContext extends Conditional_statementsContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public StmtWhileContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStmtWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStmtWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStmtWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtDoWhileContext extends Conditional_statementsContext {
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public StmtDoWhileContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStmtDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStmtDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStmtDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtForContext extends Conditional_statementsContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public StmtForContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStmtFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStmtFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStmtFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtIfContext extends Conditional_statementsContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public StmtIfContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStmtIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtContinueContext extends Conditional_statementsContext {
		public Continue_StatementContext continue_Statement() {
			return getRuleContext(Continue_StatementContext.class,0);
		}
		public StmtContinueContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStmtContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStmtContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStmtContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtReturnContext extends Conditional_statementsContext {
		public Return_StatementContext return_Statement() {
			return getRuleContext(Return_StatementContext.class,0);
		}
		public StmtReturnContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStmtReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStmtReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStmtReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtSwitchContext extends Conditional_statementsContext {
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public StmtSwitchContext(Conditional_statementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterStmtSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitStmtSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitStmtSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_statementsContext conditional_statements() throws RecognitionException {
		Conditional_statementsContext _localctx = new Conditional_statementsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_conditional_statements);
		try {
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				if_statement();
				}
				break;
			case SWITCH:
				_localctx = new StmtSwitchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				switch_statement();
				}
				break;
			case WHILE:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				while_statement();
				}
				break;
			case DO:
				_localctx = new StmtDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				do_while_statement();
				}
				break;
			case FOR:
				_localctx = new StmtForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(519);
				for_statement();
				}
				break;
			case CONTINUE:
				_localctx = new StmtContinueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(520);
				continue_Statement();
				}
				break;
			case RETURN:
				_localctx = new StmtReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(521);
				return_Statement();
				}
				break;
			case BREAK:
				_localctx = new StmtBreakContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(522);
				break_statement();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(OPEN_BRACE);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023255594L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 301822937L) != 0)) {
				{
				{
				setState(526);
				instruction();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(532);
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngulerParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngulerParser.ELSE, 0); }
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
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
		enterRule(_localctx, 96, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(IF);
			setState(535);
			match(OPEN_PAREN);
			setState(536);
			value();
			setState(537);
			match(CLOSE_PAREN);
			setState(538);
			block();
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(539);
				match(ELSE);
				setState(540);
				if_statement();
				}
				break;
			case 2:
				{
				setState(541);
				match(ELSE);
				setState(542);
				block();
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
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AngulerParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(AngulerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngulerParser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
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
		enterRule(_localctx, 98, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(FOR);
			setState(546);
			match(OPEN_PAREN);
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(547);
				variable_declaration();
				}
				break;
			case 2:
				{
				setState(548);
				expressionSequence();
				}
				break;
			case 3:
				{
				setState(549);
				match(SEMICOLON);
				}
				break;
			}
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 4577L) != 0)) {
				{
				setState(552);
				expressionSequence();
				}
			}

			setState(555);
			match(SEMICOLON);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & 4577L) != 0)) {
				{
				setState(556);
				expressionSequence();
				}
			}

			setState(559);
			match(CLOSE_PAREN);
			setState(560);
			block();
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
		public TerminalNode OPEN_BRACE() { return getToken(AngulerParser.OPEN_BRACE, 0); }
		public Switch_bodyContext switch_body() {
			return getRuleContext(Switch_bodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngulerParser.CLOSE_BRACE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public TerminalNode EVENT_BINDING() { return getToken(AngulerParser.EVENT_BINDING, 0); }
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
		enterRule(_localctx, 100, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(SWITCH);
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				setState(563);
				match(OPEN_PAREN);
				setState(564);
				value();
				setState(565);
				match(CLOSE_PAREN);
				}
				break;
			case EVENT_BINDING:
				{
				setState(567);
				match(EVENT_BINDING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(570);
			match(OPEN_BRACE);
			setState(571);
			switch_body();
			setState(572);
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
	public static class Switch_bodyContext extends ParserRuleContext {
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public List<Switch_defaultContext> switch_default() {
			return getRuleContexts(Switch_defaultContext.class);
		}
		public Switch_defaultContext switch_default(int i) {
			return getRuleContext(Switch_defaultContext.class,i);
		}
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSwitch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSwitch_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSwitch_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_switch_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				setState(576);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
					{
					setState(574);
					switch_case();
					}
					break;
				case DEFAULT:
					{
					setState(575);
					switch_default();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(580);
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
	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(AngulerParser.CASE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(CASE);
			setState(582);
			value();
			setState(583);
			match(COLON);
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023255594L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 301822937L) != 0)) {
				{
				{
				setState(584);
				instruction();
				}
				}
				setState(589);
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
	public static class Switch_defaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(AngulerParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(AngulerParser.COLON, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Switch_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterSwitch_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitSwitch_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitSwitch_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_defaultContext switch_default() throws RecognitionException {
		Switch_defaultContext _localctx = new Switch_defaultContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_switch_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(DEFAULT);
			setState(591);
			match(COLON);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023255594L) != 0) || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & 301822937L) != 0)) {
				{
				{
				setState(592);
				instruction();
				}
				}
				setState(597);
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
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AngulerParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngulerParser.CLOSE_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 108, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(WHILE);
			setState(599);
			match(OPEN_PAREN);
			setState(600);
			value();
			setState(601);
			match(CLOSE_PAREN);
			setState(602);
			block();
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AngulerParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngulerParser.OPEN_PAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 110, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(DO);
			setState(605);
			block();
			setState(606);
			match(WHILE);
			setState(607);
			match(OPEN_PAREN);
			setState(608);
			value();
			setState(609);
			match(CLOSE_PAREN);
			setState(610);
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
	public static class Continue_StatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(AngulerParser.CONTINUE, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Continue_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterContinue_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitContinue_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitContinue_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_StatementContext continue_Statement() throws RecognitionException {
		Continue_StatementContext _localctx = new Continue_StatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_continue_Statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(CONTINUE);
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(613);
				match(IDENTIFIER);
				}
			}

			setState(616);
			eos();
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
	public static class Return_StatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngulerParser.RETURN, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public Return_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterReturn_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitReturn_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitReturn_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_StatementContext return_Statement() throws RecognitionException {
		Return_StatementContext _localctx = new Return_StatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_return_Statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(RETURN);
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(619);
				expressionSequence();
				}
				break;
			}
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOF || _la==SEMICOLON) {
				{
				setState(622);
				eos();
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
	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AngulerParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 116, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(BREAK);
			setState(626);
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
	public static class ExpressionSequenceContext extends ParserRuleContext {
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
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expressionSequence);
		int _la;
		try {
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				value();
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(629);
					match(COMMA);
					setState(630);
					value();
					}
					}
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				match(IDENTIFIER);
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
	public static class Interface_DeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngulerParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Structured_typeContext structured_type() {
			return getRuleContext(Structured_typeContext.class,0);
		}
		public Interface_DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_Declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterInterface_Declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitInterface_Declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitInterface_Declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_DeclarationContext interface_Declaration() throws RecognitionException {
		Interface_DeclarationContext _localctx = new Interface_DeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_interface_Declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(INTERFACE);
			setState(640);
			match(IDENTIFIER);
			setState(641);
			structured_type();
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
	public static class Generic_TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public List<Type_annotationContext> type_annotation() {
			return getRuleContexts(Type_annotationContext.class);
		}
		public Type_annotationContext type_annotation(int i) {
			return getRuleContext(Type_annotationContext.class,i);
		}
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngulerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngulerParser.COMMA, i);
		}
		public Generic_TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_Type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterGeneric_Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitGeneric_Type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitGeneric_Type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_TypeContext generic_Type() throws RecognitionException {
		Generic_TypeContext _localctx = new Generic_TypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_generic_Type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(IDENTIFIER);
			setState(644);
			match(OPENTAG);
			setState(645);
			type_annotation();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(646);
				match(COMMA);
				setState(647);
				type_annotation();
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(653);
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
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(AngulerParser.SEMICOLON, 0); }
		public TerminalNode EOF() { return getToken(AngulerParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SEMICOLON) ) {
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
	public static class NgContentContext extends Html_valueContext {
		public Ng_contentContext ng_content() {
			return getRuleContext(Ng_contentContext.class,0);
		}
		public NgContentContext(Html_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNgContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNgContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNgContent(this);
			else return visitor.visitChildren(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateVariableContext extends Html_valueContext {
		public Template_variableContext template_variable() {
			return getRuleContext(Template_variableContext.class,0);
		}
		public TemplateVariableContext(Html_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTemplateVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTemplateVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTemplateVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgTemplateContext extends Html_valueContext {
		public Ng_templateContext ng_template() {
			return getRuleContext(Ng_templateContext.class,0);
		}
		public NgTemplateContext(Html_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNgTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNgTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNgTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_valueContext html_value() throws RecognitionException {
		Html_valueContext _localctx = new Html_valueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_html_value);
		try {
			int _alt;
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new NestedHtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(657);
				open_tag();
				setState(661);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(658);
						html_value();
						}
						} 
					}
					setState(663);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(664);
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
				setState(667);
				single_tag();
				}
				break;
			case 3:
				_localctx = new InterpolationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				match(INTERPOLATION);
				}
				break;
			case 4:
				_localctx = new TextContentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(669);
				match(HTML_TEXT);
				}
				break;
			case 5:
				_localctx = new TemplateVariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(670);
				template_variable();
				}
				break;
			case 6:
				_localctx = new NgContentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(671);
				ng_content();
				}
				break;
			case 7:
				_localctx = new NgTemplateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(672);
				ng_template();
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
	public static class TagsContext extends ParserRuleContext {
		public TerminalNode DIV_TAG() { return getToken(AngulerParser.DIV_TAG, 0); }
		public TerminalNode H1_TAG() { return getToken(AngulerParser.H1_TAG, 0); }
		public TerminalNode H2_TAG() { return getToken(AngulerParser.H2_TAG, 0); }
		public TerminalNode H3_TAG() { return getToken(AngulerParser.H3_TAG, 0); }
		public TerminalNode P_TAG() { return getToken(AngulerParser.P_TAG, 0); }
		public TerminalNode IMG_TAG() { return getToken(AngulerParser.IMG_TAG, 0); }
		public TerminalNode A_TAG() { return getToken(AngulerParser.A_TAG, 0); }
		public TerminalNode SPAN_TAG() { return getToken(AngulerParser.SPAN_TAG, 0); }
		public TerminalNode BUTTON_TAG() { return getToken(AngulerParser.BUTTON_TAG, 0); }
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 511L) != 0)) ) {
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
	public static class Open_tagContext extends ParserRuleContext {
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TerminalNode HTML_OPENTAG() { return getToken(AngulerParser.HTML_OPENTAG, 0); }
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
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
		enterRule(_localctx, 130, RULE_open_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_la = _input.LA(1);
			if ( !(_la==OPENTAG || _la==HTML_OPENTAG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV_TAG:
			case H1_TAG:
			case H2_TAG:
			case H3_TAG:
			case P_TAG:
			case IMG_TAG:
			case A_TAG:
			case SPAN_TAG:
			case BUTTON_TAG:
				{
				setState(678);
				tags();
				}
				break;
			case IDENTIFIER:
				{
				setState(679);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BINDING || _la==EVENT_BINDING) {
				{
				{
				setState(682);
				html_attribute();
				}
				}
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(688);
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
	public static class AttrsContext extends ParserRuleContext {
		public TerminalNode STYLE_ATTR() { return getToken(AngulerParser.STYLE_ATTR, 0); }
		public TerminalNode ALT_ATTR() { return getToken(AngulerParser.ALT_ATTR, 0); }
		public TerminalNode SRC_ATTR() { return getToken(AngulerParser.SRC_ATTR, 0); }
		public TerminalNode HREF_ATTR() { return getToken(AngulerParser.HREF_ATTR, 0); }
		public AttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitAttrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitAttrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrsContext attrs() throws RecognitionException {
		AttrsContext _localctx = new AttrsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_attrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 15L) != 0)) ) {
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
	public static class EventBindingContext extends Html_attributeContext {
		public TerminalNode EVENT_BINDING() { return getToken(AngulerParser.EVENT_BINDING, 0); }
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
	public static class PropertyBindingContext extends Html_attributeContext {
		public TerminalNode BINDING() { return getToken(AngulerParser.BINDING, 0); }
		public TerminalNode EQUAL() { return getToken(AngulerParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 134, RULE_html_attribute);
		try {
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINDING:
				_localctx = new PropertyBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				match(BINDING);
				setState(693);
				match(EQUAL);
				setState(694);
				expression();
				}
				break;
			case EVENT_BINDING:
				_localctx = new EventBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				match(EVENT_BINDING);
				setState(696);
				match(EQUAL);
				setState(697);
				expression();
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
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
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
		enterRule(_localctx, 136, RULE_close_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if ( !(_la==OPENTAG || _la==HTML_OPENTAG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(701);
			match(SLASH);
			setState(704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV_TAG:
			case H1_TAG:
			case H2_TAG:
			case H3_TAG:
			case P_TAG:
			case IMG_TAG:
			case A_TAG:
			case SPAN_TAG:
			case BUTTON_TAG:
				{
				setState(702);
				tags();
				}
				break;
			case IDENTIFIER:
				{
				setState(703);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(706);
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
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
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
		enterRule(_localctx, 138, RULE_single_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_la = _input.LA(1);
			if ( !(_la==OPENTAG || _la==HTML_OPENTAG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV_TAG:
			case H1_TAG:
			case H2_TAG:
			case H3_TAG:
			case P_TAG:
			case IMG_TAG:
			case A_TAG:
			case SPAN_TAG:
			case BUTTON_TAG:
				{
				setState(709);
				tags();
				}
				break;
			case IDENTIFIER:
				{
				setState(710);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BINDING || _la==EVENT_BINDING) {
				{
				{
				setState(713);
				html_attribute();
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(719);
			match(SLASH);
			setState(720);
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
	public static class Template_variableContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(AngulerParser.HASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngulerParser.IDENTIFIER, 0); }
		public Template_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterTemplate_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitTemplate_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitTemplate_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_variableContext template_variable() throws RecognitionException {
		Template_variableContext _localctx = new Template_variableContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_template_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(HASH);
			setState(723);
			match(IDENTIFIER);
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
	public static class Ng_contentContext extends ParserRuleContext {
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TerminalNode NG_CONTENT() { return getToken(AngulerParser.NG_CONTENT, 0); }
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public List<Html_attributeContext> html_attribute() {
			return getRuleContexts(Html_attributeContext.class);
		}
		public Html_attributeContext html_attribute(int i) {
			return getRuleContext(Html_attributeContext.class,i);
		}
		public Ng_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNg_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNg_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNg_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_contentContext ng_content() throws RecognitionException {
		Ng_contentContext _localctx = new Ng_contentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ng_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(OPENTAG);
			setState(726);
			match(NG_CONTENT);
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BINDING || _la==EVENT_BINDING) {
				{
				{
				setState(727);
				html_attribute();
				}
				}
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(733);
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
	public static class Ng_templateContext extends ParserRuleContext {
		public Ng_templateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_template; }
	 
		public Ng_templateContext() { }
		public void copyFrom(Ng_templateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgTemplateSelfClosingContext extends Ng_templateContext {
		public TerminalNode OPENTAG() { return getToken(AngulerParser.OPENTAG, 0); }
		public TerminalNode NG_TEMPLATE() { return getToken(AngulerParser.NG_TEMPLATE, 0); }
		public TerminalNode SLASH() { return getToken(AngulerParser.SLASH, 0); }
		public TerminalNode CLOSETAG() { return getToken(AngulerParser.CLOSETAG, 0); }
		public List<Html_attributeContext> html_attribute() {
			return getRuleContexts(Html_attributeContext.class);
		}
		public Html_attributeContext html_attribute(int i) {
			return getRuleContext(Html_attributeContext.class,i);
		}
		public NgTemplateSelfClosingContext(Ng_templateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNgTemplateSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNgTemplateSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNgTemplateSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgTemplateWithContentContext extends Ng_templateContext {
		public List<TerminalNode> OPENTAG() { return getTokens(AngulerParser.OPENTAG); }
		public TerminalNode OPENTAG(int i) {
			return getToken(AngulerParser.OPENTAG, i);
		}
		public TerminalNode NG_TEMPLATE() { return getToken(AngulerParser.NG_TEMPLATE, 0); }
		public List<TerminalNode> CLOSETAG() { return getTokens(AngulerParser.CLOSETAG); }
		public TerminalNode CLOSETAG(int i) {
			return getToken(AngulerParser.CLOSETAG, i);
		}
		public TerminalNode SLASH() { return getToken(AngulerParser.SLASH, 0); }
		public Ng_templateContext ng_template() {
			return getRuleContext(Ng_templateContext.class,0);
		}
		public List<Html_attributeContext> html_attribute() {
			return getRuleContexts(Html_attributeContext.class);
		}
		public Html_attributeContext html_attribute(int i) {
			return getRuleContext(Html_attributeContext.class,i);
		}
		public List<Html_valueContext> html_value() {
			return getRuleContexts(Html_valueContext.class);
		}
		public Html_valueContext html_value(int i) {
			return getRuleContext(Html_valueContext.class,i);
		}
		public NgTemplateWithContentContext(Ng_templateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).enterNgTemplateWithContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngulerParserListener ) ((AngulerParserListener)listener).exitNgTemplateWithContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngulerParserVisitor ) return ((AngulerParserVisitor<? extends T>)visitor).visitNgTemplateWithContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_templateContext ng_template() throws RecognitionException {
		Ng_templateContext _localctx = new Ng_templateContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_ng_template);
		int _la;
		try {
			int _alt;
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new NgTemplateWithContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(OPENTAG);
				setState(736);
				match(NG_TEMPLATE);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BINDING || _la==EVENT_BINDING) {
					{
					{
					setState(737);
					html_attribute();
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(743);
				match(CLOSETAG);
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(744);
						html_value();
						}
						} 
					}
					setState(749);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(750);
				match(OPENTAG);
				setState(751);
				match(SLASH);
				setState(752);
				ng_template();
				setState(753);
				match(CLOSETAG);
				}
				break;
			case 2:
				_localctx = new NgTemplateSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				match(OPENTAG);
				setState(756);
				match(NG_TEMPLATE);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BINDING || _la==EVENT_BINDING) {
					{
					{
					setState(757);
					html_attribute();
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(763);
				match(SLASH);
				setState(764);
				match(CLOSETAG);
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

	public static final String _serializedATN =
		"\u0004\u0001\u00a8\u0300\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0004\u0000\u0094"+
		"\b\u0000\u000b\u0000\f\u0000\u0095\u0001\u0000\u0004\u0000\u0099\b\u0000"+
		"\u000b\u0000\f\u0000\u009a\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00b1\b\u0003"+
		"\n\u0003\f\u0003\u00b4\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00bf\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00cd\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00db\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00e4\b\f\n\f\f\f\u00e7\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00ef\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00fb\b\u0010\n\u0010\f\u0010\u00fe\t\u0010"+
		"\u0001\u0010\u0003\u0010\u0101\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0003\u0012\u010a\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0005\u0013\u0113\b\u0013\n\u0013\f\u0013\u0116\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u011d"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0122\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0126\b\u0015\n\u0015\f\u0015\u0129"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0132\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0137\b\u0017\n\u0017\f\u0017\u013a\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0141\b\u0018"+
		"\n\u0018\f\u0018\u0144\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u014a\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u0151\b\u001a\n\u001a\f\u001a\u0154\t\u001a"+
		"\u0003\u001a\u0156\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0003\u001c\u015d\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0162\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0166\b"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u016e\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0174\b\u001d\u0003\u001d\u0176\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0182\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u018e\b \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u019b\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01a6\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u01b8\b&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u01c8\b(\u0001)\u0001)\u0001)\u0001)\u0005)\u01ce\b)\n)\f)\u01d1"+
		"\t)\u0003)\u01d3\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0005+\u01df\b+\n+\f+\u01e2\t+\u0003+\u01e4\b+\u0001+"+
		"\u0001+\u0001,\u0001,\u0001,\u0001,\u0005,\u01ec\b,\n,\f,\u01ef\t,\u0003"+
		",\u01f1\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0202\b-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u020c\b.\u0001/\u0001"+
		"/\u0005/\u0210\b/\n/\f/\u0213\t/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00030\u0220\b0\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u0227\b1\u00011\u00031\u022a\b1\u00011\u00011\u0003"+
		"1\u022e\b1\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u0239\b2\u00012\u00012\u00012\u00012\u00013\u00013\u00053\u0241"+
		"\b3\n3\f3\u0244\t3\u00014\u00014\u00014\u00014\u00054\u024a\b4\n4\f4\u024d"+
		"\t4\u00015\u00015\u00015\u00055\u0252\b5\n5\f5\u0255\t5\u00016\u00016"+
		"\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00018\u00018\u00038\u0267\b8\u00018\u00018\u00019\u0001"+
		"9\u00039\u026d\b9\u00019\u00039\u0270\b9\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0005;\u0278\b;\n;\f;\u027b\t;\u0001;\u0003;\u027e\b;\u0001<"+
		"\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001=\u0005=\u0289"+
		"\b=\n=\f=\u028c\t=\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0005?\u0294"+
		"\b?\n?\f?\u0297\t?\u0001?\u0003?\u029a\b?\u0001?\u0001?\u0001?\u0001?"+
		"\u0001?\u0001?\u0003?\u02a2\b?\u0001@\u0001@\u0001A\u0001A\u0001A\u0003"+
		"A\u02a9\bA\u0001A\u0005A\u02ac\bA\nA\fA\u02af\tA\u0001A\u0001A\u0001B"+
		"\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u02bb\bC\u0001"+
		"D\u0001D\u0001D\u0001D\u0003D\u02c1\bD\u0001D\u0001D\u0001E\u0001E\u0001"+
		"E\u0003E\u02c8\bE\u0001E\u0005E\u02cb\bE\nE\fE\u02ce\tE\u0001E\u0001E"+
		"\u0001E\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0005G\u02d9\bG\nG\f"+
		"G\u02dc\tG\u0001G\u0001G\u0001H\u0001H\u0001H\u0005H\u02e3\bH\nH\fH\u02e6"+
		"\tH\u0001H\u0001H\u0005H\u02ea\bH\nH\fH\u02ed\tH\u0001H\u0001H\u0001H"+
		"\u0001H\u0001H\u0001H\u0001H\u0001H\u0005H\u02f7\bH\nH\fH\u02fa\tH\u0001"+
		"H\u0001H\u0003H\u02fe\bH\u0001H\u0000\u0000I\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0000\r\u0003\u0000PPSU\u008d\u008d\u0001\u0000"+
		"\u008e\u0090\u0002\u0000\u0092\u0094\u0098\u0098\u0003\u0000\u001c\u001c"+
		"88\u00a2\u00a2\u0001\u0000\u00a3\u00a4\u0001\u0000\u0015\u0016\u0001\u0000"+
		"\u0018\u001b\u0001\u0000\r\u0010\u0001\u0000\u0091\u0092\u0001\u0001\b"+
		"\b\u0001\u0000lt\u0002\u0000\u0018\u0018\u00a0\u00a0\u0001\u0000hk\u0328"+
		"\u0000\u0093\u0001\u0000\u0000\u0000\u0002\u009e\u0001\u0000\u0000\u0000"+
		"\u0004\u00a6\u0001\u0000\u0000\u0000\u0006\u00ac\u0001\u0000\u0000\u0000"+
		"\b\u00be\u0001\u0000\u0000\u0000\n\u00c0\u0001\u0000\u0000\u0000\f\u00c4"+
		"\u0001\u0000\u0000\u0000\u000e\u00c8\u0001\u0000\u0000\u0000\u0010\u00ce"+
		"\u0001\u0000\u0000\u0000\u0012\u00d2\u0001\u0000\u0000\u0000\u0014\u00d6"+
		"\u0001\u0000\u0000\u0000\u0016\u00dc\u0001\u0000\u0000\u0000\u0018\u00e0"+
		"\u0001\u0000\u0000\u0000\u001a\u00ee\u0001\u0000\u0000\u0000\u001c\u00f0"+
		"\u0001\u0000\u0000\u0000\u001e\u00f2\u0001\u0000\u0000\u0000 \u00f6\u0001"+
		"\u0000\u0000\u0000\"\u0104\u0001\u0000\u0000\u0000$\u0109\u0001\u0000"+
		"\u0000\u0000&\u0114\u0001\u0000\u0000\u0000(\u0117\u0001\u0000\u0000\u0000"+
		"*\u011a\u0001\u0000\u0000\u0000,\u012c\u0001\u0000\u0000\u0000.\u012f"+
		"\u0001\u0000\u0000\u00000\u013d\u0001\u0000\u0000\u00002\u0145\u0001\u0000"+
		"\u0000\u00004\u014b\u0001\u0000\u0000\u00006\u0159\u0001\u0000\u0000\u0000"+
		"8\u015c\u0001\u0000\u0000\u0000:\u0175\u0001\u0000\u0000\u0000<\u0181"+
		"\u0001\u0000\u0000\u0000>\u0183\u0001\u0000\u0000\u0000@\u018d\u0001\u0000"+
		"\u0000\u0000B\u018f\u0001\u0000\u0000\u0000D\u019a\u0001\u0000\u0000\u0000"+
		"F\u01a5\u0001\u0000\u0000\u0000H\u01a7\u0001\u0000\u0000\u0000J\u01ab"+
		"\u0001\u0000\u0000\u0000L\u01b7\u0001\u0000\u0000\u0000N\u01b9\u0001\u0000"+
		"\u0000\u0000P\u01c7\u0001\u0000\u0000\u0000R\u01c9\u0001\u0000\u0000\u0000"+
		"T\u01d6\u0001\u0000\u0000\u0000V\u01da\u0001\u0000\u0000\u0000X\u01e7"+
		"\u0001\u0000\u0000\u0000Z\u0201\u0001\u0000\u0000\u0000\\\u020b\u0001"+
		"\u0000\u0000\u0000^\u020d\u0001\u0000\u0000\u0000`\u0216\u0001\u0000\u0000"+
		"\u0000b\u0221\u0001\u0000\u0000\u0000d\u0232\u0001\u0000\u0000\u0000f"+
		"\u0242\u0001\u0000\u0000\u0000h\u0245\u0001\u0000\u0000\u0000j\u024e\u0001"+
		"\u0000\u0000\u0000l\u0256\u0001\u0000\u0000\u0000n\u025c\u0001\u0000\u0000"+
		"\u0000p\u0264\u0001\u0000\u0000\u0000r\u026a\u0001\u0000\u0000\u0000t"+
		"\u0271\u0001\u0000\u0000\u0000v\u027d\u0001\u0000\u0000\u0000x\u027f\u0001"+
		"\u0000\u0000\u0000z\u0283\u0001\u0000\u0000\u0000|\u028f\u0001\u0000\u0000"+
		"\u0000~\u02a1\u0001\u0000\u0000\u0000\u0080\u02a3\u0001\u0000\u0000\u0000"+
		"\u0082\u02a5\u0001\u0000\u0000\u0000\u0084\u02b2\u0001\u0000\u0000\u0000"+
		"\u0086\u02ba\u0001\u0000\u0000\u0000\u0088\u02bc\u0001\u0000\u0000\u0000"+
		"\u008a\u02c4\u0001\u0000\u0000\u0000\u008c\u02d2\u0001\u0000\u0000\u0000"+
		"\u008e\u02d5\u0001\u0000\u0000\u0000\u0090\u02fd\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0003\u0002\u0001\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0003\u0004\u0002\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005\u0000\u0000\u0001\u009d\u0001\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005}\u0000\u0000\u009f\u00a0\u0005\u0001\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0091\u0000\u0000\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2"+
		"\u00a3\u0005~\u0000\u0000\u00a3\u00a4\u0005\u0092\u0000\u0000\u00a4\u00a5"+
		"\u0005\b\u0000\u0000\u00a5\u0003\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		"\u0013\u0000\u0000\u00a7\u00a8\u0005\u0003\u0000\u0000\u00a8\u00a9\u0003"+
		"\u0006\u0003\u0000\u00a9\u00aa\u0005\u0004\u0000\u0000\u00aa\u00ab\u0003"+
		"$\u0012\u0000\u00ab\u0005\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0001"+
		"\u0000\u0000\u00ad\u00b2\u0003\b\u0004\u0000\u00ae\u00af\u0005\u0007\u0000"+
		"\u0000\u00af\u00b1\u0003\b\u0004\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0002\u0000\u0000"+
		"\u00b6\u0007\u0001\u0000\u0000\u0000\u00b7\u00bf\u0003\n\u0005\u0000\u00b8"+
		"\u00bf\u0003\f\u0006\u0000\u00b9\u00bf\u0003\u000e\u0007\u0000\u00ba\u00bf"+
		"\u0003\u0010\b\u0000\u00bb\u00bf\u0003\u0012\t\u0000\u00bc\u00bf\u0003"+
		"\u0014\n\u0000\u00bd\u00bf\u0003\u0016\u000b\u0000\u00be\u00b7\u0001\u0000"+
		"\u0000\u0000\u00be\u00b8\u0001\u0000\u0000\u0000\u00be\u00b9\u0001\u0000"+
		"\u0000\u0000\u00be\u00ba\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\t\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005Z\u0000"+
		"\u0000\u00c1\u00c2\u0005\n\u0000\u0000\u00c2\u00c3\u0005\u0092\u0000\u0000"+
		"\u00c3\u000b\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005[\u0000\u0000\u00c5"+
		"\u00c6\u0005\n\u0000\u0000\u00c6\u00c7\u0005S\u0000\u0000\u00c7\r\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005\\\u0000\u0000\u00c9\u00cc\u0005\n"+
		"\u0000\u0000\u00ca\u00cd\u0003V+\u0000\u00cb\u00cd\u0005u\u0000\u0000"+
		"\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u000f\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005]\u0000\u0000\u00cf"+
		"\u00d0\u0005\n\u0000\u0000\u00d0\u00d1\u0005\u0093\u0000\u0000\u00d1\u0011"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005^\u0000\u0000\u00d3\u00d4\u0005"+
		"\n\u0000\u0000\u00d4\u00d5\u0005\u0092\u0000\u0000\u00d5\u0013\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0005_\u0000\u0000\u00d7\u00da\u0005\n\u0000"+
		"\u0000\u00d8\u00db\u0005\u0092\u0000\u0000\u00d9\u00db\u0003X,\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u0015\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005`\u0000\u0000\u00dd\u00de"+
		"\u0005\n\u0000\u0000\u00de\u00df\u0003V+\u0000\u00df\u0017\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e5\u0003\u001a\r\u0000\u00e1\u00e2\u0005!\u0000"+
		"\u0000\u00e2\u00e4\u0003\u001a\r\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u0019\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ef\u0005\u0091\u0000\u0000"+
		"\u00e9\u00ef\u0003\u001c\u000e\u0000\u00ea\u00ef\u0005\u008c\u0000\u0000"+
		"\u00eb\u00ef\u0005\u0017\u0000\u0000\u00ec\u00ef\u0003 \u0010\u0000\u00ed"+
		"\u00ef\u0003\u001e\u000f\u0000\u00ee\u00e8\u0001\u0000\u0000\u0000\u00ee"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000\u0000\u0000\u00ee"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u001b\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0007\u0000\u0000\u0000\u00f1\u001d\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0005\u0091\u0000\u0000\u00f3\u00f4\u0005\u0005\u0000\u0000\u00f4"+
		"\u00f5\u0005\u0006\u0000\u0000\u00f5\u001f\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0005\u0001\u0000\u0000\u00f7\u00fc\u0003\"\u0011\u0000\u00f8\u00f9"+
		"\u0005\b\u0000\u0000\u00f9\u00fb\u0003\"\u0011\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0101\u0005"+
		"\b\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0002"+
		"\u0000\u0000\u0103!\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0091\u0000"+
		"\u0000\u0105\u0106\u0005\n\u0000\u0000\u0106\u0107\u0003\u001a\r\u0000"+
		"\u0107#\u0001\u0000\u0000\u0000\u0108\u010a\u0005\u007f\u0000\u0000\u0109"+
		"\u0108\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0005|\u0000\u0000\u010c\u010d"+
		"\u0005\u0091\u0000\u0000\u010d\u010e\u0005\u0001\u0000\u0000\u010e\u010f"+
		"\u0003&\u0013\u0000\u010f\u0110\u0005\u0002\u0000\u0000\u0110%\u0001\u0000"+
		"\u0000\u0000\u0111\u0113\u0003Z-\u0000\u0112\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0001\u0000\u0000\u0000\u0115\'\u0001\u0000\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u0091\u0000\u0000\u0118"+
		"\u0119\u0003*\u0015\u0000\u0119)\u0001\u0000\u0000\u0000\u011a\u011c\u0005"+
		"\u0003\u0000\u0000\u011b\u011d\u00030\u0018\u0000\u011c\u011b\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e\u0121\u0005\u0004\u0000\u0000\u011f\u0120\u0005\n\u0000"+
		"\u0000\u0120\u0122\u0003\u0018\f\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000"+
		"\u0123\u0127\u0005\u0001\u0000\u0000\u0124\u0126\u0003Z-\u0000\u0125\u0124"+
		"\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0005\u0002\u0000\u0000\u012b+\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		"\u0091\u0000\u0000\u012d\u012e\u0003.\u0017\u0000\u012e-\u0001\u0000\u0000"+
		"\u0000\u012f\u0131\u0005\u0003\u0000\u0000\u0130\u0132\u00030\u0018\u0000"+
		"\u0131\u0130\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0004\u0000\u0000"+
		"\u0134\u0138\u0005\u0001\u0000\u0000\u0135\u0137\u0003Z-\u0000\u0136\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b"+
		"\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0005\u0002\u0000\u0000\u013c/\u0001\u0000\u0000\u0000\u013d\u0142\u0003"+
		"2\u0019\u0000\u013e\u013f\u0005\u0007\u0000\u0000\u013f\u0141\u00032\u0019"+
		"\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u01431\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0005\u0091\u0000\u0000\u0146\u0149\u0005\n\u0000\u0000\u0147"+
		"\u014a\u0003\u001a\r\u0000\u0148\u014a\u0003 \u0010\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a3\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0005\u0091\u0000\u0000\u014c\u0155\u0005"+
		"\u0003\u0000\u0000\u014d\u0152\u0003<\u001e\u0000\u014e\u014f\u0005\u0007"+
		"\u0000\u0000\u014f\u0151\u0003<\u001e\u0000\u0150\u014e\u0001\u0000\u0000"+
		"\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000"+
		"\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u014d\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005\u0004\u0000\u0000\u01585\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0007\u0001\u0000\u0000\u015a7\u0001\u0000\u0000\u0000\u015b"+
		"\u015d\u00036\u001b\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0161"+
		"\u0005\u0091\u0000\u0000\u015f\u0160\u0005\n\u0000\u0000\u0160\u0162\u0003"+
		"\u0018\f\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000"+
		"\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0164\u0005\f\u0000"+
		"\u0000\u0164\u0166\u0003<\u001e\u0000\u0165\u0163\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0005\b\u0000\u0000\u01689\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0003@ \u0000\u016a\u016b\u0005\f\u0000\u0000\u016b\u016d\u0003"+
		"<\u001e\u0000\u016c\u016e\u0005\b\u0000\u0000\u016d\u016c\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0176\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0005\u0091\u0000\u0000\u0170\u0171\u0005\f\u0000"+
		"\u0000\u0171\u0173\u0003<\u001e\u0000\u0172\u0174\u0005\b\u0000\u0000"+
		"\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000"+
		"\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u0169\u0001\u0000\u0000\u0000"+
		"\u0175\u016f\u0001\u0000\u0000\u0000\u0176;\u0001\u0000\u0000\u0000\u0177"+
		"\u0182\u0003>\u001f\u0000\u0178\u0182\u0005\u0091\u0000\u0000\u0179\u0182"+
		"\u0005\u008c\u0000\u0000\u017a\u0182\u0003R)\u0000\u017b\u0182\u0003X"+
		",\u0000\u017c\u0182\u00034\u001a\u0000\u017d\u017e\u0005\u0003\u0000\u0000"+
		"\u017e\u017f\u0003P(\u0000\u017f\u0180\u0005\u0004\u0000\u0000\u0180\u0182"+
		"\u0001\u0000\u0000\u0000\u0181\u0177\u0001\u0000\u0000\u0000\u0181\u0178"+
		"\u0001\u0000\u0000\u0000\u0181\u0179\u0001\u0000\u0000\u0000\u0181\u017a"+
		"\u0001\u0000\u0000\u0000\u0181\u017b\u0001\u0000\u0000\u0000\u0181\u017c"+
		"\u0001\u0000\u0000\u0000\u0181\u017d\u0001\u0000\u0000\u0000\u0182=\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0007\u0002\u0000\u0000\u0184?\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0003<\u001e\u0000\u0186\u0187\u0003B!\u0000"+
		"\u0187\u018e\u0001\u0000\u0000\u0000\u0188\u0189\u0003<\u001e\u0000\u0189"+
		"\u018a\u0005\u0005\u0000\u0000\u018a\u018b\u0003P(\u0000\u018b\u018c\u0005"+
		"\u0006\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u0185\u0001"+
		"\u0000\u0000\u0000\u018d\u0188\u0001\u0000\u0000\u0000\u018eA\u0001\u0000"+
		"\u0000\u0000\u018f\u0190\u0005\t\u0000\u0000\u0190\u0191\u0005\u0091\u0000"+
		"\u0000\u0191C\u0001\u0000\u0000\u0000\u0192\u0193\u0003<\u001e\u0000\u0193"+
		"\u0194\u0007\u0003\u0000\u0000\u0194\u0195\u0003<\u001e\u0000\u0195\u019b"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0003<\u001e\u0000\u0197\u0198\u0007"+
		"\u0004\u0000\u0000\u0198\u0199\u0003<\u001e\u0000\u0199\u019b\u0001\u0000"+
		"\u0000\u0000\u019a\u0192\u0001\u0000\u0000\u0000\u019a\u0196\u0001\u0000"+
		"\u0000\u0000\u019bE\u0001\u0000\u0000\u0000\u019c\u019d\u0007\u0004\u0000"+
		"\u0000\u019d\u01a6\u0003<\u001e\u0000\u019e\u019f\u0007\u0005\u0000\u0000"+
		"\u019f\u01a6\u0003<\u001e\u0000\u01a0\u01a1\u0003<\u001e\u0000\u01a1\u01a2"+
		"\u0007\u0005\u0000\u0000\u01a2\u01a6\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0005\u00a5\u0000\u0000\u01a4\u01a6\u0003<\u001e\u0000\u01a5\u019c\u0001"+
		"\u0000\u0000\u0000\u01a5\u019e\u0001\u0000\u0000\u0000\u01a5\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6G\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\u0003<\u001e\u0000\u01a8\u01a9\u0007\u0006\u0000"+
		"\u0000\u01a9\u01aa\u0003<\u001e\u0000\u01aaI\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0003<\u001e\u0000\u01ac\u01ad\u0007\u0007\u0000\u0000\u01ad\u01ae"+
		"\u0003<\u001e\u0000\u01aeK\u0001\u0000\u0000\u0000\u01af\u01b0\u0003<"+
		"\u001e\u0000\u01b0\u01b1\u0005\u001f\u0000\u0000\u01b1\u01b2\u0003<\u001e"+
		"\u0000\u01b2\u01b8\u0001\u0000\u0000\u0000\u01b3\u01b4\u0003<\u001e\u0000"+
		"\u01b4\u01b5\u0005 \u0000\u0000\u01b5\u01b6\u0003<\u001e\u0000\u01b6\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b7\u01af\u0001\u0000\u0000\u0000\u01b7\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b8M\u0001\u0000\u0000\u0000\u01b9\u01ba\u0003"+
		"<\u001e\u0000\u01ba\u01bb\u0005?\u0000\u0000\u01bb\u01bc\u0003P(\u0000"+
		"\u01bc\u01bd\u0005\n\u0000\u0000\u01bd\u01be\u0003P(\u0000\u01beO\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c8\u0003N\'\u0000\u01c0\u01c8\u0003L&\u0000"+
		"\u01c1\u01c8\u0003H$\u0000\u01c2\u01c8\u0003J%\u0000\u01c3\u01c8\u0003"+
		"D\"\u0000\u01c4\u01c8\u0003F#\u0000\u01c5\u01c8\u0003@ \u0000\u01c6\u01c8"+
		"\u0003<\u001e\u0000\u01c7\u01bf\u0001\u0000\u0000\u0000\u01c7\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c1\u0001\u0000\u0000\u0000\u01c7\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c3\u0001\u0000\u0000\u0000\u01c7\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c8Q\u0001\u0000\u0000\u0000\u01c9\u01d2\u0005\u0001"+
		"\u0000\u0000\u01ca\u01cf\u0003T*\u0000\u01cb\u01cc\u0005\u0007\u0000\u0000"+
		"\u01cc\u01ce\u0003T*\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01d1"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d2\u01ca\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5"+
		"\u0005\u0002\u0000\u0000\u01d5S\u0001\u0000\u0000\u0000\u01d6\u01d7\u0007"+
		"\b\u0000\u0000\u01d7\u01d8\u0005\n\u0000\u0000\u01d8\u01d9\u0003<\u001e"+
		"\u0000\u01d9U\u0001\u0000\u0000\u0000\u01da\u01e3\u0005\u0005\u0000\u0000"+
		"\u01db\u01e0\u0003<\u001e\u0000\u01dc\u01dd\u0005\u0007\u0000\u0000\u01dd"+
		"\u01df\u0003<\u001e\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e3\u01db\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6"+
		"\u0005\u0006\u0000\u0000\u01e6W\u0001\u0000\u0000\u0000\u01e7\u01f0\u0005"+
		"\u0005\u0000\u0000\u01e8\u01ed\u0003<\u001e\u0000\u01e9\u01ea\u0005\u0007"+
		"\u0000\u0000\u01ea\u01ec\u0003<\u001e\u0000\u01eb\u01e9\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000"+
		"\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01e8\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0005\u0006\u0000\u0000\u01f3Y\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u00034\u001a\u0000\u01f5\u01f6\u0005\b\u0000\u0000\u01f6"+
		"\u0202\u0001\u0000\u0000\u0000\u01f7\u0202\u00038\u001c\u0000\u01f8\u0202"+
		"\u0003:\u001d\u0000\u01f9\u0202\u0003$\u0012\u0000\u01fa\u0202\u0003,"+
		"\u0016\u0000\u01fb\u01fc\u0005\u007f\u0000\u0000\u01fc\u0202\u00038\u001c"+
		"\u0000\u01fd\u0202\u0003\\.\u0000\u01fe\u0202\u0003x<\u0000\u01ff\u0202"+
		"\u0003z=\u0000\u0200\u0202\u0003(\u0014\u0000\u0201\u01f4\u0001\u0000"+
		"\u0000\u0000\u0201\u01f7\u0001\u0000\u0000\u0000\u0201\u01f8\u0001\u0000"+
		"\u0000\u0000\u0201\u01f9\u0001\u0000\u0000\u0000\u0201\u01fa\u0001\u0000"+
		"\u0000\u0000\u0201\u01fb\u0001\u0000\u0000\u0000\u0201\u01fd\u0001\u0000"+
		"\u0000\u0000\u0201\u01fe\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000"+
		"\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202[\u0001\u0000\u0000"+
		"\u0000\u0203\u020c\u0003`0\u0000\u0204\u020c\u0003d2\u0000\u0205\u020c"+
		"\u0003l6\u0000\u0206\u020c\u0003n7\u0000\u0207\u020c\u0003b1\u0000\u0208"+
		"\u020c\u0003p8\u0000\u0209\u020c\u0003r9\u0000\u020a\u020c\u0003t:\u0000"+
		"\u020b\u0203\u0001\u0000\u0000\u0000\u020b\u0204\u0001\u0000\u0000\u0000"+
		"\u020b\u0205\u0001\u0000\u0000\u0000\u020b\u0206\u0001\u0000\u0000\u0000"+
		"\u020b\u0207\u0001\u0000\u0000\u0000\u020b\u0208\u0001\u0000\u0000\u0000"+
		"\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020a\u0001\u0000\u0000\u0000"+
		"\u020c]\u0001\u0000\u0000\u0000\u020d\u0211\u0005\u0001\u0000\u0000\u020e"+
		"\u0210\u0003Z-\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210\u0213\u0001"+
		"\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001"+
		"\u0000\u0000\u0000\u0212\u0214\u0001\u0000\u0000\u0000\u0213\u0211\u0001"+
		"\u0000\u0000\u0000\u0214\u0215\u0005\u0002\u0000\u0000\u0215_\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0005\u0080\u0000\u0000\u0217\u0218\u0005\u0003"+
		"\u0000\u0000\u0218\u0219\u0003<\u001e\u0000\u0219\u021a\u0005\u0004\u0000"+
		"\u0000\u021a\u021f\u0003^/\u0000\u021b\u021c\u0005\u0081\u0000\u0000\u021c"+
		"\u0220\u0003`0\u0000\u021d\u021e\u0005\u0081\u0000\u0000\u021e\u0220\u0003"+
		"^/\u0000\u021f\u021b\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000"+
		"\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220a\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0005\u0082\u0000\u0000\u0222\u0226\u0005\u0003\u0000\u0000"+
		"\u0223\u0227\u00038\u001c\u0000\u0224\u0227\u0003v;\u0000\u0225\u0227"+
		"\u0005\b\u0000\u0000\u0226\u0223\u0001\u0000\u0000\u0000\u0226\u0224\u0001"+
		"\u0000\u0000\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227\u0229\u0001"+
		"\u0000\u0000\u0000\u0228\u022a\u0003v;\u0000\u0229\u0228\u0001\u0000\u0000"+
		"\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000"+
		"\u0000\u022b\u022d\u0005\b\u0000\u0000\u022c\u022e\u0003v;\u0000\u022d"+
		"\u022c\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e"+
		"\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0005\u0004\u0000\u0000\u0230"+
		"\u0231\u0003^/\u0000\u0231c\u0001\u0000\u0000\u0000\u0232\u0238\u0005"+
		"\u0085\u0000\u0000\u0233\u0234\u0005\u0003\u0000\u0000\u0234\u0235\u0003"+
		"<\u001e\u0000\u0235\u0236\u0005\u0004\u0000\u0000\u0236\u0239\u0001\u0000"+
		"\u0000\u0000\u0237\u0239\u0005v\u0000\u0000\u0238\u0233\u0001\u0000\u0000"+
		"\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000"+
		"\u0000\u023a\u023b\u0005\u0001\u0000\u0000\u023b\u023c\u0003f3\u0000\u023c"+
		"\u023d\u0005\u0002\u0000\u0000\u023de\u0001\u0000\u0000\u0000\u023e\u0241"+
		"\u0003h4\u0000\u023f\u0241\u0003j5\u0000\u0240\u023e\u0001\u0000\u0000"+
		"\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000\u0000"+
		"\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000"+
		"\u0000\u0243g\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\u0005\u0086\u0000\u0000\u0246\u0247\u0003<\u001e\u0000\u0247"+
		"\u024b\u0005\n\u0000\u0000\u0248\u024a\u0003Z-\u0000\u0249\u0248\u0001"+
		"\u0000\u0000\u0000\u024a\u024d\u0001\u0000\u0000\u0000\u024b\u0249\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024ci\u0001\u0000"+
		"\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024e\u024f\u0005\u0087"+
		"\u0000\u0000\u024f\u0253\u0005\n\u0000\u0000\u0250\u0252\u0003Z-\u0000"+
		"\u0251\u0250\u0001\u0000\u0000\u0000\u0252\u0255\u0001\u0000\u0000\u0000"+
		"\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000"+
		"\u0254k\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0005\u0083\u0000\u0000\u0257\u0258\u0005\u0003\u0000\u0000\u0258"+
		"\u0259\u0003<\u001e\u0000\u0259\u025a\u0005\u0004\u0000\u0000\u025a\u025b"+
		"\u0003^/\u0000\u025bm\u0001\u0000\u0000\u0000\u025c\u025d\u0005\u0084"+
		"\u0000\u0000\u025d\u025e\u0003^/\u0000\u025e\u025f\u0005\u0083\u0000\u0000"+
		"\u025f\u0260\u0005\u0003\u0000\u0000\u0260\u0261\u0003<\u001e\u0000\u0261"+
		"\u0262\u0005\u0004\u0000\u0000\u0262\u0263\u0005\b\u0000\u0000\u0263o"+
		"\u0001\u0000\u0000\u0000\u0264\u0266\u0005\u008a\u0000\u0000\u0265\u0267"+
		"\u0005\u0091\u0000\u0000\u0266\u0265\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u0269"+
		"\u0003|>\u0000\u0269q\u0001\u0000\u0000\u0000\u026a\u026c\u0005\u0088"+
		"\u0000\u0000\u026b\u026d\u0003v;\u0000\u026c\u026b\u0001\u0000\u0000\u0000"+
		"\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026f\u0001\u0000\u0000\u0000"+
		"\u026e\u0270\u0003|>\u0000\u026f\u026e\u0001\u0000\u0000\u0000\u026f\u0270"+
		"\u0001\u0000\u0000\u0000\u0270s\u0001\u0000\u0000\u0000\u0271\u0272\u0005"+
		"\u0089\u0000\u0000\u0272\u0273\u0005\b\u0000\u0000\u0273u\u0001\u0000"+
		"\u0000\u0000\u0274\u0279\u0003<\u001e\u0000\u0275\u0276\u0005\u0007\u0000"+
		"\u0000\u0276\u0278\u0003<\u001e\u0000\u0277\u0275\u0001\u0000\u0000\u0000"+
		"\u0278\u027b\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000"+
		"\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027e\u0001\u0000\u0000\u0000"+
		"\u027b\u0279\u0001\u0000\u0000\u0000\u027c\u027e\u0005\u0091\u0000\u0000"+
		"\u027d\u0274\u0001\u0000\u0000\u0000\u027d\u027c\u0001\u0000\u0000\u0000"+
		"\u027ew\u0001\u0000\u0000\u0000\u027f\u0280\u0005)\u0000\u0000\u0280\u0281"+
		"\u0005\u0091\u0000\u0000\u0281\u0282\u0003 \u0010\u0000\u0282y\u0001\u0000"+
		"\u0000\u0000\u0283\u0284\u0005\u0091\u0000\u0000\u0284\u0285\u0005\u0018"+
		"\u0000\u0000\u0285\u028a\u0003\u0018\f\u0000\u0286\u0287\u0005\u0007\u0000"+
		"\u0000\u0287\u0289\u0003\u0018\f\u0000\u0288\u0286\u0001\u0000\u0000\u0000"+
		"\u0289\u028c\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000"+
		"\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028d\u0001\u0000\u0000\u0000"+
		"\u028c\u028a\u0001\u0000\u0000\u0000\u028d\u028e\u0005\u0019\u0000\u0000"+
		"\u028e{\u0001\u0000\u0000\u0000\u028f\u0290\u0007\t\u0000\u0000\u0290"+
		"}\u0001\u0000\u0000\u0000\u0291\u0295\u0003\u0082A\u0000\u0292\u0294\u0003"+
		"~?\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0294\u0297\u0001\u0000\u0000"+
		"\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000"+
		"\u0000\u0296\u0299\u0001\u0000\u0000\u0000\u0297\u0295\u0001\u0000\u0000"+
		"\u0000\u0298\u029a\u0003\u0088D\u0000\u0299\u0298\u0001\u0000\u0000\u0000"+
		"\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u02a2\u0001\u0000\u0000\u0000"+
		"\u029b\u02a2\u0003\u008aE\u0000\u029c\u02a2\u0005w\u0000\u0000\u029d\u02a2"+
		"\u0005\u00a1\u0000\u0000\u029e\u02a2\u0003\u008cF\u0000\u029f\u02a2\u0003"+
		"\u008eG\u0000\u02a0\u02a2\u0003\u0090H\u0000\u02a1\u0291\u0001\u0000\u0000"+
		"\u0000\u02a1\u029b\u0001\u0000\u0000\u0000\u02a1\u029c\u0001\u0000\u0000"+
		"\u0000\u02a1\u029d\u0001\u0000\u0000\u0000\u02a1\u029e\u0001\u0000\u0000"+
		"\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a2\u007f\u0001\u0000\u0000\u0000\u02a3\u02a4\u0007\n\u0000\u0000"+
		"\u02a4\u0081\u0001\u0000\u0000\u0000\u02a5\u02a8\u0007\u000b\u0000\u0000"+
		"\u02a6\u02a9\u0003\u0080@\u0000\u02a7\u02a9\u0005\u0091\u0000\u0000\u02a8"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a9"+
		"\u02ad\u0001\u0000\u0000\u0000\u02aa\u02ac\u0003\u0086C\u0000\u02ab\u02aa"+
		"\u0001\u0000\u0000\u0000\u02ac\u02af\u0001\u0000\u0000\u0000\u02ad\u02ab"+
		"\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02b0"+
		"\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02b0\u02b1"+
		"\u0005\u0019\u0000\u0000\u02b1\u0083\u0001\u0000\u0000\u0000\u02b2\u02b3"+
		"\u0007\f\u0000\u0000\u02b3\u0085\u0001\u0000\u0000\u0000\u02b4\u02b5\u0005"+
		"u\u0000\u0000\u02b5\u02b6\u0005\f\u0000\u0000\u02b6\u02bb\u0003P(\u0000"+
		"\u02b7\u02b8\u0005v\u0000\u0000\u02b8\u02b9\u0005\f\u0000\u0000\u02b9"+
		"\u02bb\u0003P(\u0000\u02ba\u02b4\u0001\u0000\u0000\u0000\u02ba\u02b7\u0001"+
		"\u0000\u0000\u0000\u02bb\u0087\u0001\u0000\u0000\u0000\u02bc\u02bd\u0007"+
		"\u000b\u0000\u0000\u02bd\u02c0\u0005\u001c\u0000\u0000\u02be\u02c1\u0003"+
		"\u0080@\u0000\u02bf\u02c1\u0005\u0091\u0000\u0000\u02c0\u02be\u0001\u0000"+
		"\u0000\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c3\u0005\u0019\u0000\u0000\u02c3\u0089\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c7\u0007\u000b\u0000\u0000\u02c5\u02c8\u0003\u0080"+
		"@\u0000\u02c6\u02c8\u0005\u0091\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8\u02cc\u0001\u0000\u0000"+
		"\u0000\u02c9\u02cb\u0003\u0086C\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000"+
		"\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000"+
		"\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02cf\u0001\u0000\u0000\u0000"+
		"\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005\u001c\u0000\u0000"+
		"\u02d0\u02d1\u0005\u0019\u0000\u0000\u02d1\u008b\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d3\u0005\u00a6\u0000\u0000\u02d3\u02d4\u0005\u0091\u0000\u0000"+
		"\u02d4\u008d\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005\u0018\u0000\u0000"+
		"\u02d6\u02da\u0005\u00a7\u0000\u0000\u02d7\u02d9\u0003\u0086C\u0000\u02d8"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d9\u02dc\u0001\u0000\u0000\u0000\u02da"+
		"\u02d8\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db"+
		"\u02dd\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dd"+
		"\u02de\u0005\u0019\u0000\u0000\u02de\u008f\u0001\u0000\u0000\u0000\u02df"+
		"\u02e0\u0005\u0018\u0000\u0000\u02e0\u02e4\u0005\u00a8\u0000\u0000\u02e1"+
		"\u02e3\u0003\u0086C\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e6"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e5\u02e7\u0001\u0000\u0000\u0000\u02e6\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e7\u02eb\u0005\u0019\u0000\u0000\u02e8\u02ea"+
		"\u0003~?\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000\u02ea\u02ed\u0001\u0000"+
		"\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ee\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ef\u0005\u0018\u0000\u0000\u02ef\u02f0\u0005\u001c"+
		"\u0000\u0000\u02f0\u02f1\u0003\u0090H\u0000\u02f1\u02f2\u0005\u0019\u0000"+
		"\u0000\u02f2\u02fe\u0001\u0000\u0000\u0000\u02f3\u02f4\u0005\u0018\u0000"+
		"\u0000\u02f4\u02f8\u0005\u00a8\u0000\u0000\u02f5\u02f7\u0003\u0086C\u0000"+
		"\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f7\u02fa\u0001\u0000\u0000\u0000"+
		"\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000"+
		"\u02f9\u02fb\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fc\u0005\u001c\u0000\u0000\u02fc\u02fe\u0005\u0019\u0000\u0000"+
		"\u02fd\u02df\u0001\u0000\u0000\u0000\u02fd\u02f3\u0001\u0000\u0000\u0000"+
		"\u02fe\u0091\u0001\u0000\u0000\u0000G\u0095\u009a\u00b2\u00be\u00cc\u00da"+
		"\u00e5\u00ee\u00fc\u0100\u0109\u0114\u011c\u0121\u0127\u0131\u0138\u0142"+
		"\u0149\u0152\u0155\u015c\u0161\u0165\u016d\u0173\u0175\u0181\u018d\u019a"+
		"\u01a5\u01b7\u01c7\u01cf\u01d2\u01e0\u01e3\u01ed\u01f0\u0201\u020b\u0211"+
		"\u021f\u0226\u0229\u022d\u0238\u0240\u0242\u024b\u0253\u0266\u026c\u026f"+
		"\u0279\u027d\u028a\u0295\u0299\u02a1\u02a8\u02ad\u02ba\u02c0\u02c7\u02cc"+
		"\u02da\u02e4\u02eb\u02f8\u02fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}