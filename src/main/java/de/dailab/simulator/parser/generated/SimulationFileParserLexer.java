// Generated from C:/Users/Timo/IdeaProjects/SimulationFileParser/src/main/java/de/dailab/simulator/parser/grammar\SimulationFile.g4 by ANTLR 4.5
package de.dailab.simulator.parser.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimulationFileParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SIMULATION=1, EXTENDS=2, TASK=3, PARTIALTASK=4, START=5, GOAL=6, AUTOCOMPLETE=7, 
		LOOP=8, SEQUENTIAL=9, KNOWLEDGE=10, BOOLEAN=11, SEMICOLON=12, COMMA=13, 
		ASSIGN=14, META=15, LPAREN=16, RPAREN=17, LBRACE=18, RBRACE=19, LBRACK=20, 
		RBRACK=21, IDENTIFIER=22, STRING_LITERAL=23, INTEGER=24, SKIP=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SIMULATION", "EXTENDS", "TASK", "PARTIALTASK", "START", "GOAL", "AUTOCOMPLETE", 
		"LOOP", "SEQUENTIAL", "KNOWLEDGE", "BOOLEAN", "TRUE", "FALSE", "SEMICOLON", 
		"COMMA", "ASSIGN", "META", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
		"RBRACK", "IDENTIFIER", "LETTER", "STRING_LITERAL", "INTEGER", "DIGIT", 
		"EscapeSequence", "OctalEscape", "SKIP", "WS", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'simulation'", "'extends'", "'task'", "'partialtask'", "'start'", 
		"'goal'", "'autocomplete'", "'loop'", "'sequential'", "'knowledge'", null, 
		"';'", "','", "':='", "'@'", "'('", "')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SIMULATION", "EXTENDS", "TASK", "PARTIALTASK", "START", "GOAL", 
		"AUTOCOMPLETE", "LOOP", "SEQUENTIAL", "KNOWLEDGE", "BOOLEAN", "SEMICOLON", 
		"COMMA", "ASSIGN", "META", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
		"RBRACK", "IDENTIFIER", "STRING_LITERAL", "INTEGER", "SKIP"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SimulationFileParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimulationFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00fe\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u009e\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\7\31\u00c3\n\31\f\31\16\31\u00c6\13\31\3\32\3\32\3\33\3\33\3\33\7"+
		"\33\u00cd\n\33\f\33\16\33\u00d0\13\33\3\33\3\33\3\34\6\34\u00d5\n\34\r"+
		"\34\16\34\u00d6\3\35\3\35\3\36\3\36\3\36\5\36\u00de\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00e9\n\37\3 \3 \5 \u00ed\n \3 \3"+
		" \3!\3!\3\"\3\"\7\"\u00f5\n\"\f\"\16\"\u00f8\13\"\3\"\5\"\u00fb\n\"\3"+
		"\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33"+
		"\2\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\2\65\31\67\32"+
		"9\2;\2=\2?\33A\2C\2\3\2\b\3\2\62;\4\2C\\c|\4\2$$^^\n\2$$))^^ddhhppttv"+
		"v\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0101\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2?\3\2\2\2\3E\3"+
		"\2\2\2\5P\3\2\2\2\7X\3\2\2\2\t]\3\2\2\2\13i\3\2\2\2\ro\3\2\2\2\17t\3\2"+
		"\2\2\21\u0081\3\2\2\2\23\u0086\3\2\2\2\25\u0091\3\2\2\2\27\u009d\3\2\2"+
		"\2\31\u009f\3\2\2\2\33\u00a4\3\2\2\2\35\u00aa\3\2\2\2\37\u00ac\3\2\2\2"+
		"!\u00ae\3\2\2\2#\u00b1\3\2\2\2%\u00b3\3\2\2\2\'\u00b5\3\2\2\2)\u00b7\3"+
		"\2\2\2+\u00b9\3\2\2\2-\u00bb\3\2\2\2/\u00bd\3\2\2\2\61\u00bf\3\2\2\2\63"+
		"\u00c7\3\2\2\2\65\u00c9\3\2\2\2\67\u00d4\3\2\2\29\u00d8\3\2\2\2;\u00dd"+
		"\3\2\2\2=\u00e8\3\2\2\2?\u00ec\3\2\2\2A\u00f0\3\2\2\2C\u00f2\3\2\2\2E"+
		"F\7u\2\2FG\7k\2\2GH\7o\2\2HI\7w\2\2IJ\7n\2\2JK\7c\2\2KL\7v\2\2LM\7k\2"+
		"\2MN\7q\2\2NO\7p\2\2O\4\3\2\2\2PQ\7g\2\2QR\7z\2\2RS\7v\2\2ST\7g\2\2TU"+
		"\7p\2\2UV\7f\2\2VW\7u\2\2W\6\3\2\2\2XY\7v\2\2YZ\7c\2\2Z[\7u\2\2[\\\7m"+
		"\2\2\\\b\3\2\2\2]^\7r\2\2^_\7c\2\2_`\7t\2\2`a\7v\2\2ab\7k\2\2bc\7c\2\2"+
		"cd\7n\2\2de\7v\2\2ef\7c\2\2fg\7u\2\2gh\7m\2\2h\n\3\2\2\2ij\7u\2\2jk\7"+
		"v\2\2kl\7c\2\2lm\7t\2\2mn\7v\2\2n\f\3\2\2\2op\7i\2\2pq\7q\2\2qr\7c\2\2"+
		"rs\7n\2\2s\16\3\2\2\2tu\7c\2\2uv\7w\2\2vw\7v\2\2wx\7q\2\2xy\7e\2\2yz\7"+
		"q\2\2z{\7o\2\2{|\7r\2\2|}\7n\2\2}~\7g\2\2~\177\7v\2\2\177\u0080\7g\2\2"+
		"\u0080\20\3\2\2\2\u0081\u0082\7n\2\2\u0082\u0083\7q\2\2\u0083\u0084\7"+
		"q\2\2\u0084\u0085\7r\2\2\u0085\22\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7s\2\2\u0089\u008a\7w\2\2\u008a\u008b\7g\2\2\u008b"+
		"\u008c\7p\2\2\u008c\u008d\7v\2\2\u008d\u008e\7k\2\2\u008e\u008f\7c\2\2"+
		"\u008f\u0090\7n\2\2\u0090\24\3\2\2\2\u0091\u0092\7m\2\2\u0092\u0093\7"+
		"p\2\2\u0093\u0094\7q\2\2\u0094\u0095\7y\2\2\u0095\u0096\7n\2\2\u0096\u0097"+
		"\7g\2\2\u0097\u0098\7f\2\2\u0098\u0099\7i\2\2\u0099\u009a\7g\2\2\u009a"+
		"\26\3\2\2\2\u009b\u009e\5\31\r\2\u009c\u009e\5\33\16\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\30\3\2\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1"+
		"\7t\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7g\2\2\u00a3\32\3\2\2\2\u00a4\u00a5"+
		"\7h\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7u\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7=\2\2\u00ab\36\3\2\2\2\u00ac"+
		"\u00ad\7.\2\2\u00ad \3\2\2\2\u00ae\u00af\7<\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"\"\3\2\2\2\u00b1\u00b2\7B\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7*\2\2\u00b4"+
		"&\3\2\2\2\u00b5\u00b6\7+\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7}\2\2\u00b8*"+
		"\3\2\2\2\u00b9\u00ba\7\177\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7]\2\2\u00bc"+
		".\3\2\2\2\u00bd\u00be\7_\2\2\u00be\60\3\2\2\2\u00bf\u00c4\5\63\32\2\u00c0"+
		"\u00c3\5\63\32\2\u00c1\u00c3\t\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3"+
		"\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\62\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\t\3\2\2\u00c8\64\3\2\2\2\u00c9"+
		"\u00ce\7$\2\2\u00ca\u00cd\5;\36\2\u00cb\u00cd\n\4\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7$"+
		"\2\2\u00d2\66\3\2\2\2\u00d3\u00d5\59\35\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d78\3\2\2\2\u00d8"+
		"\u00d9\t\2\2\2\u00d9:\3\2\2\2\u00da\u00db\7^\2\2\u00db\u00de\t\5\2\2\u00dc"+
		"\u00de\5=\37\2\u00dd\u00da\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de<\3\2\2\2"+
		"\u00df\u00e0\7^\2\2\u00e0\u00e1\4\62\65\2\u00e1\u00e2\4\629\2\u00e2\u00e9"+
		"\4\629\2\u00e3\u00e4\7^\2\2\u00e4\u00e5\4\629\2\u00e5\u00e9\4\629\2\u00e6"+
		"\u00e7\7^\2\2\u00e7\u00e9\4\629\2\u00e8\u00df\3\2\2\2\u00e8\u00e3\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e9>\3\2\2\2\u00ea\u00ed\5A!\2\u00eb\u00ed"+
		"\5C\"\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\b \2\2\u00ef@\3\2\2\2\u00f0\u00f1\t\6\2\2\u00f1B\3\2\2\2\u00f2"+
		"\u00f6\7%\2\2\u00f3\u00f5\n\7\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fb\7\17\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\f\2\2\u00fdD\3\2\2\2\16\2\u009d"+
		"\u00c2\u00c4\u00cc\u00ce\u00d6\u00dd\u00e8\u00ec\u00f6\u00fa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}