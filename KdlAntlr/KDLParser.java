// Generated from .\KDL.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WS=11, MultiLineComment=12, SingleLineComment=13, NUMBER=14, 
		DECIMAL=15, INTEGER=16, HEX=17, OCTAL=18, BINARY=19, BOOLEAN=20, CHILDRENSTART=21, 
		CHILDRENEND=22, CHARACTER=23, ESCLINE=24;
	public static final int
		RULE_node_list = 0, RULE_node = 1, RULE_node_props_and_values = 2, RULE_node_children = 3, 
		RULE_node_terminator = 4, RULE_identifier = 5, RULE_prop = 6, RULE_value = 7, 
		RULE_node_space = 8, RULE_line_escape = 9, RULE_raw_string = 10, RULE_raw_string_hash = 11, 
		RULE_escaped_string = 12, RULE_line_end = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"node_list", "node", "node_props_and_values", "node_children", "node_terminator", 
			"identifier", "prop", "value", "node_space", "line_escape", "raw_string", 
			"raw_string_hash", "escaped_string", "line_end"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'null'", "'/-'", "'r'", "'#'", "'\"'", "'\n'", "'\r\n'", 
			"'\r'", null, null, null, null, null, null, null, null, null, null, "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"MultiLineComment", "SingleLineComment", "NUMBER", "DECIMAL", "INTEGER", 
			"HEX", "OCTAL", "BINARY", "BOOLEAN", "CHILDRENSTART", "CHILDRENEND", 
			"CHARACTER", "ESCLINE"
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
	public String getGrammarFileName() { return "KDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Node_listContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(KDLParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(KDLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(KDLParser.WS, i);
		}
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public Node_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterNode_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitNode_list(this);
		}
	}

	public final Node_listContext node_list() throws RecognitionException {
		Node_listContext _localctx = new Node_listContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_node_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << WS))) != 0)) {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WS:
					{
					setState(28);
					match(WS);
					}
					break;
				case T__3:
				case T__4:
				case T__6:
					{
					setState(29);
					node();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
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

	public static class NodeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Node_terminatorContext node_terminator() {
			return getRuleContext(Node_terminatorContext.class,0);
		}
		public Line_escapeContext line_escape() {
			return getRuleContext(Line_escapeContext.class,0);
		}
		public List<Node_spaceContext> node_space() {
			return getRuleContexts(Node_spaceContext.class);
		}
		public Node_spaceContext node_space(int i) {
			return getRuleContext(Node_spaceContext.class,i);
		}
		public List<Node_props_and_valuesContext> node_props_and_values() {
			return getRuleContexts(Node_props_and_valuesContext.class);
		}
		public Node_props_and_valuesContext node_props_and_values(int i) {
			return getRuleContext(Node_props_and_valuesContext.class,i);
		}
		public Node_childrenContext node_children() {
			return getRuleContext(Node_childrenContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(KDLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(KDLParser.WS, i);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitNode(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(37);
				line_escape();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(38);
					match(WS);
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(46);
			identifier();
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					node_space();
					setState(48);
					node_props_and_values();
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << WS) | (1L << CHILDRENSTART) | (1L << ESCLINE))) != 0)) {
				{
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==ESCLINE) {
					{
					{
					setState(55);
					node_space();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				node_children();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(62);
					match(WS);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70);
			node_terminator();
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

	public static class Node_props_and_valuesContext extends ParserRuleContext {
		public PropContext prop() {
			return getRuleContext(PropContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Line_escapeContext line_escape() {
			return getRuleContext(Line_escapeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(KDLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(KDLParser.WS, i);
		}
		public Node_props_and_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_props_and_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterNode_props_and_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitNode_props_and_values(this);
		}
	}

	public final Node_props_and_valuesContext node_props_and_values() throws RecognitionException {
		Node_props_and_valuesContext _localctx = new Node_props_and_valuesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_node_props_and_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(72);
				line_escape();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(73);
					match(WS);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__6:
				{
				setState(81);
				prop();
				}
				break;
			case T__2:
			case NUMBER:
			case BOOLEAN:
			case CHARACTER:
				{
				setState(82);
				value();
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

	public static class Node_childrenContext extends ParserRuleContext {
		public TerminalNode CHILDRENSTART() { return getToken(KDLParser.CHILDRENSTART, 0); }
		public TerminalNode CHILDRENEND() { return getToken(KDLParser.CHILDRENEND, 0); }
		public Line_escapeContext line_escape() {
			return getRuleContext(Line_escapeContext.class,0);
		}
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(KDLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(KDLParser.WS, i);
		}
		public Node_childrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_children; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterNode_children(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitNode_children(this);
		}
	}

	public final Node_childrenContext node_children() throws RecognitionException {
		Node_childrenContext _localctx = new Node_childrenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_node_children);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(85);
				line_escape();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(86);
					match(WS);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(94);
			match(CHILDRENSTART);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6))) != 0)) {
				{
				{
				setState(95);
				node();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(CHILDRENEND);
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

	public static class Node_terminatorContext extends ParserRuleContext {
		public TerminalNode SingleLineComment() { return getToken(KDLParser.SingleLineComment, 0); }
		public Line_endContext line_end() {
			return getRuleContext(Line_endContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KDLParser.EOF, 0); }
		public Node_terminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterNode_terminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitNode_terminator(this);
		}
	}

	public final Node_terminatorContext node_terminator() throws RecognitionException {
		Node_terminatorContext _localctx = new Node_terminatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_node_terminator);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleLineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(SingleLineComment);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				line_end();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(T__0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(EOF);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Raw_stringContext raw_string() {
			return getRuleContext(Raw_stringContext.class,0);
		}
		public Escaped_stringContext escaped_string() {
			return getRuleContext(Escaped_stringContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifier);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				raw_string();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				escaped_string();
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

	public static class PropContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitProp(this);
		}
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			identifier();
			setState(114);
			match(T__1);
			setState(115);
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

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTER() { return getTokens(KDLParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(KDLParser.CHARACTER, i);
		}
		public TerminalNode NUMBER() { return getToken(KDLParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(KDLParser.BOOLEAN, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					match(CHARACTER);
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CHARACTER );
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(BOOLEAN);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(T__2);
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

	public static class Node_spaceContext extends ParserRuleContext {
		public TerminalNode ESCLINE() { return getToken(KDLParser.ESCLINE, 0); }
		public List<TerminalNode> WS() { return getTokens(KDLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(KDLParser.WS, i);
		}
		public Node_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterNode_space(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitNode_space(this);
		}
	}

	public final Node_spaceContext node_space() throws RecognitionException {
		Node_spaceContext _localctx = new Node_spaceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_node_space);
		int _la;
		try {
			int _alt;
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(127);
					match(WS);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(ESCLINE);
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(134);
						match(WS);
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(140);
						match(WS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(143); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Line_escapeContext extends ParserRuleContext {
		public Line_escapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_escape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterLine_escape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitLine_escape(this);
		}
	}

	public final Line_escapeContext line_escape() throws RecognitionException {
		Line_escapeContext _localctx = new Line_escapeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_line_escape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__3);
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

	public static class Raw_stringContext extends ParserRuleContext {
		public Raw_string_hashContext raw_string_hash() {
			return getRuleContext(Raw_string_hashContext.class,0);
		}
		public Raw_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterRaw_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitRaw_string(this);
		}
	}

	public final Raw_stringContext raw_string() throws RecognitionException {
		Raw_stringContext _localctx = new Raw_stringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_raw_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__4);
			setState(150);
			raw_string_hash();
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

	public static class Raw_string_hashContext extends ParserRuleContext {
		public Raw_string_hashContext raw_string_hash() {
			return getRuleContext(Raw_string_hashContext.class,0);
		}
		public Raw_string_hashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_string_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterRaw_string_hash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitRaw_string_hash(this);
		}
	}

	public final Raw_string_hashContext raw_string_hash() throws RecognitionException {
		Raw_string_hashContext _localctx = new Raw_string_hashContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_raw_string_hash);
		try {
			int _alt;
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__5);
				setState(153);
				raw_string_hash();
				setState(154);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__6);
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(157);
						matchWildcard();
						}
						} 
					}
					setState(162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(163);
				match(T__6);
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

	public static class Escaped_stringContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTER() { return getTokens(KDLParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(KDLParser.CHARACTER, i);
		}
		public Escaped_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escaped_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterEscaped_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitEscaped_string(this);
		}
	}

	public final Escaped_stringContext escaped_string() throws RecognitionException {
		Escaped_stringContext _localctx = new Escaped_stringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_escaped_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__6);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				match(CHARACTER);
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHARACTER );
			setState(172);
			match(T__6);
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

	public static class Line_endContext extends ParserRuleContext {
		public Line_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).enterLine_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KDLListener ) ((KDLListener)listener).exitLine_end(this);
		}
	}

	public final Line_endContext line_end() throws RecognitionException {
		Line_endContext _localctx = new Line_endContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_line_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00b3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\2\3\2\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\5\3/\n\3\3\3\3\3\3\3\3\3\7"+
		"\3\65\n\3\f\3\16\38\13\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\7\3B\n\3"+
		"\f\3\16\3E\13\3\5\3G\n\3\3\3\3\3\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\5\4R"+
		"\n\4\3\4\3\4\5\4V\n\4\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\5\5_\n\5\3\5\3\5"+
		"\7\5c\n\5\f\5\16\5f\13\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\5\7"+
		"r\n\7\3\b\3\b\3\b\3\b\3\t\6\ty\n\t\r\t\16\tz\3\t\3\t\3\t\5\t\u0080\n\t"+
		"\3\n\7\n\u0083\n\n\f\n\16\n\u0086\13\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n"+
		"\u008d\13\n\3\n\6\n\u0090\n\n\r\n\16\n\u0091\5\n\u0094\n\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a1\n\r\f\r\16\r\u00a4\13\r\3"+
		"\r\5\r\u00a7\n\r\3\16\3\16\6\16\u00ab\n\16\r\16\16\16\u00ac\3\16\3\16"+
		"\3\17\3\17\3\17\3\u00a2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3"+
		"\2\n\f\2\u00c1\2\"\3\2\2\2\4.\3\2\2\2\6Q\3\2\2\2\b^\3\2\2\2\nm\3\2\2\2"+
		"\fq\3\2\2\2\16s\3\2\2\2\20\177\3\2\2\2\22\u0093\3\2\2\2\24\u0095\3\2\2"+
		"\2\26\u0097\3\2\2\2\30\u00a6\3\2\2\2\32\u00a8\3\2\2\2\34\u00b0\3\2\2\2"+
		"\36!\7\r\2\2\37!\5\4\3\2 \36\3\2\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2"+
		"\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\'+\5\24\13\2(*\7"+
		"\r\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,/\3\2\2\2-+\3\2\2\2.\'"+
		"\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\66\5\f\7\2\61\62\5\22\n\2\62\63\5\6"+
		"\4\2\63\65\3\2\2\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2"+
		"\2\67F\3\2\2\28\66\3\2\2\29;\5\22\n\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<="+
		"\3\2\2\2=?\3\2\2\2><\3\2\2\2?C\5\b\5\2@B\7\r\2\2A@\3\2\2\2BE\3\2\2\2C"+
		"A\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F<\3\2\2\2FG\3\2\2\2GH\3\2\2\2"+
		"HI\5\n\6\2I\5\3\2\2\2JN\5\24\13\2KM\7\r\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2"+
		"\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QJ\3\2\2\2QR\3\2\2\2RU\3\2\2\2SV\5\16"+
		"\b\2TV\5\20\t\2US\3\2\2\2UT\3\2\2\2V\7\3\2\2\2W[\5\24\13\2XZ\7\r\2\2Y"+
		"X\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^W\3\2\2"+
		"\2^_\3\2\2\2_`\3\2\2\2`d\7\27\2\2ac\5\4\3\2ba\3\2\2\2cf\3\2\2\2db\3\2"+
		"\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\30\2\2h\t\3\2\2\2in\7\17\2\2jn"+
		"\5\34\17\2kn\7\3\2\2ln\7\2\2\3mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2"+
		"n\13\3\2\2\2or\5\26\f\2pr\5\32\16\2qo\3\2\2\2qp\3\2\2\2r\r\3\2\2\2st\5"+
		"\f\7\2tu\7\4\2\2uv\5\20\t\2v\17\3\2\2\2wy\7\31\2\2xw\3\2\2\2yz\3\2\2\2"+
		"zx\3\2\2\2z{\3\2\2\2{\u0080\3\2\2\2|\u0080\7\20\2\2}\u0080\7\26\2\2~\u0080"+
		"\7\5\2\2\177x\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\21"+
		"\3\2\2\2\u0081\u0083\7\r\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u008b\7\32\2\2\u0088\u008a\7\r\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0094\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008e\u0090\7\r\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2"+
		"\2\2\u0093\u0084\3\2\2\2\u0093\u008f\3\2\2\2\u0094\23\3\2\2\2\u0095\u0096"+
		"\7\6\2\2\u0096\25\3\2\2\2\u0097\u0098\7\7\2\2\u0098\u0099\5\30\r\2\u0099"+
		"\27\3\2\2\2\u009a\u009b\7\b\2\2\u009b\u009c\5\30\r\2\u009c\u009d\7\b\2"+
		"\2\u009d\u00a7\3\2\2\2\u009e\u00a2\7\t\2\2\u009f\u00a1\13\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\7\t\2\2\u00a6"+
		"\u009a\3\2\2\2\u00a6\u009e\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00aa\7\t\2"+
		"\2\u00a9\u00ab\7\31\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\t"+
		"\2\2\u00af\33\3\2\2\2\u00b0\u00b1\t\2\2\2\u00b1\35\3\2\2\2\33 \"+.\66"+
		"<CFNQU[^dmqz\177\u0084\u008b\u0091\u0093\u00a2\u00a6\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}