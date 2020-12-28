// Generated from .\KDL.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KDLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WS=11, MultiLineComment=12, SingleLineComment=13, NUMBER=14, 
		DECIMAL=15, INTEGER=16, HEX=17, OCTAL=18, BINARY=19, BOOLEAN=20, CHILDRENSTART=21, 
		CHILDRENEND=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "WS", "MultiLineComment", "SingleLineComment", "ESCLINE", "BOM", 
			"UNICODESPACE", "COMMENTBLOCK", "CHARACTER", "NUMBER", "DECIMAL", "INTEGER", 
			"EXPONENT", "SIGN", "HEX", "HEXDIGIT", "OCTAL", "BINARY", "BOOLEAN", 
			"CHILDRENSTART", "CHILDRENEND", "LINEEND"
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
			"HEX", "OCTAL", "BINARY", "BOOLEAN", "CHILDRENSTART", "CHILDRENEND"
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


	public KDLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00ec\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\5\f^\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\5\re\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16n\n\16\f\16\16\16"+
		"q\13\16\3\16\3\16\3\17\3\17\7\17w\n\17\f\17\16\17z\13\17\3\17\3\17\5\17"+
		"~\n\17\3\20\3\20\3\21\5\21\u0083\n\21\3\22\3\22\7\22\u0087\n\22\f\22\16"+
		"\22\u008a\13\22\7\22\u008c\n\22\f\22\16\22\u008f\13\22\3\23\6\23\u0092"+
		"\n\23\r\23\16\23\u0093\3\24\3\24\3\24\3\24\5\24\u009a\n\24\3\25\3\25\3"+
		"\25\6\25\u009f\n\25\r\25\16\25\u00a0\5\25\u00a3\n\25\3\25\5\25\u00a6\n"+
		"\25\3\26\5\26\u00a9\n\26\3\26\3\26\7\26\u00ad\n\26\f\26\16\26\u00b0\13"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00bd"+
		"\n\31\f\31\16\31\u00c0\13\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\7\33\u00c9"+
		"\n\33\f\33\16\33\u00cc\13\33\3\34\3\34\3\34\3\34\3\34\7\34\u00d3\n\34"+
		"\f\34\16\34\u00d6\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5"+
		"\35\u00e1\n\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \5 \u00eb\n \4o\u0088\2"+
		"!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2"+
		"\37\2!\2#\2%\2\'\20)\21+\22-\2/\2\61\23\63\2\65\24\67\259\26;\27=\30?"+
		"\2\3\2\r\6\2\13\13\"\"\u00a2\u00a2\u1682\u1682\4\2C\\c|\3\2\62;\4\2\62"+
		";aa\4\2GGgg\4\2--//\5\2\62;CHch\3\2\629\4\2\629aa\3\2\62\63\4\2\62\63"+
		"aa\2\u00fa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2"+
		"\61\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tJ\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17"+
		"Q\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2\25X\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2"+
		"\33i\3\2\2\2\35t\3\2\2\2\37\177\3\2\2\2!\u0082\3\2\2\2#\u008d\3\2\2\2"+
		"%\u0091\3\2\2\2\'\u0099\3\2\2\2)\u009b\3\2\2\2+\u00a8\3\2\2\2-\u00b1\3"+
		"\2\2\2/\u00b4\3\2\2\2\61\u00b6\3\2\2\2\63\u00c1\3\2\2\2\65\u00c3\3\2\2"+
		"\2\67\u00cd\3\2\2\29\u00e0\3\2\2\2;\u00e2\3\2\2\2=\u00e4\3\2\2\2?\u00ea"+
		"\3\2\2\2AB\7=\2\2B\4\3\2\2\2CD\7?\2\2D\6\3\2\2\2EF\7p\2\2FG\7w\2\2GH\7"+
		"n\2\2HI\7n\2\2I\b\3\2\2\2JK\7\61\2\2KL\7/\2\2L\n\3\2\2\2MN\7t\2\2N\f\3"+
		"\2\2\2OP\7%\2\2P\16\3\2\2\2QR\7$\2\2R\20\3\2\2\2ST\7\f\2\2T\22\3\2\2\2"+
		"UV\7\17\2\2VW\7\f\2\2W\24\3\2\2\2XY\7\17\2\2Y\26\3\2\2\2Z^\5\37\20\2["+
		"^\5!\21\2\\^\5\31\r\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\30\3\2\2\2_`\7\61"+
		"\2\2`a\7,\2\2ad\3\2\2\2be\5#\22\2ce\5\31\r\2db\3\2\2\2dc\3\2\2\2ef\3\2"+
		"\2\2fg\7,\2\2gh\7\61\2\2h\32\3\2\2\2ij\7\61\2\2jk\7\61\2\2ko\3\2\2\2l"+
		"n\13\2\2\2ml\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2\2pr\3\2\2\2qo\3\2\2\2"+
		"rs\5? \2s\34\3\2\2\2tx\7^\2\2uw\5\27\f\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2"+
		"xy\3\2\2\2y}\3\2\2\2zx\3\2\2\2{~\5\33\16\2|~\5? \2}{\3\2\2\2}|\3\2\2\2"+
		"~\36\3\2\2\2\177\u0080\7\ufff1\2\2\u0080 \3\2\2\2\u0081\u0083\t\2\2\2"+
		"\u0082\u0081\3\2\2\2\u0083\"\3\2\2\2\u0084\u0088\7,\2\2\u0085\u0087\13"+
		"\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0084\3\2"+
		"\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"$\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\t\3\2\2\u0091\u0090\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094&\3"+
		"\2\2\2\u0095\u009a\5)\25\2\u0096\u009a\5\61\31\2\u0097\u009a\5\65\33\2"+
		"\u0098\u009a\5\67\34\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a(\3\2\2\2\u009b\u00a2\5+\26\2\u009c"+
		"\u009e\7\60\2\2\u009d\u009f\t\4\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u009c\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\5-"+
		"\27\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6*\3\2\2\2\u00a7\u00a9"+
		"\5/\30\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ae\t\4\2\2\u00ab\u00ad\t\5\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af,\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b2\t\6\2\2\u00b2\u00b3\5+\26\2\u00b3.\3\2\2\2\u00b4"+
		"\u00b5\t\7\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\7\62\2\2\u00b7\u00b8\7z\2"+
		"\2\u00b8\u00b9\3\2\2\2\u00b9\u00be\5\63\32\2\u00ba\u00bd\5\63\32\2\u00bb"+
		"\u00bd\7a\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\62\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c2\t\b\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7\62\2\2\u00c4"+
		"\u00c5\7q\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00ca\t\t\2\2\u00c7\u00c9\t\n"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\66\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\62\2"+
		"\2\u00ce\u00cf\7d\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d4\t\13\2\2\u00d1\u00d3"+
		"\t\f\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d58\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00d9\7t\2\2\u00d9\u00da\7w\2\2\u00da\u00e1\7g\2\2\u00db\u00dc\7h\2\2"+
		"\u00dc\u00dd\7c\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7u\2\2\u00df\u00e1"+
		"\7g\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00db\3\2\2\2\u00e1:\3\2\2\2\u00e2\u00e3"+
		"\7}\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7\177\2\2\u00e5>\3\2\2\2\u00e6\u00eb"+
		"\7\f\2\2\u00e7\u00e8\7\17\2\2\u00e8\u00eb\7\f\2\2\u00e9\u00eb\7\17\2\2"+
		"\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb@\3"+
		"\2\2\2\30\2]dox}\u0082\u0088\u008d\u0093\u0099\u00a0\u00a2\u00a5\u00a8"+
		"\u00ae\u00bc\u00be\u00ca\u00d4\u00e0\u00ea\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}