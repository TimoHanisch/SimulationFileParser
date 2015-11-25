// Generated from C:/Users/thanisch/Documents/DAI-Labor/simulationfileparser/src/main/java/de/dailab/simulator/parser/grammar\SimulationFile.g4 by ANTLR 4.5
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
public class SimulationFileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INC=1, DEC=2, VAR=3, IF=4, ELSE=5, PRE=6, DO=7, CALL=8, CONSTRUCTOR=9, 
		CREATE=10, SIMULATION=11, EXTENDS=12, EXTENDING=13, META_TEXT=14, TASKS=15, 
		FOR=16, TASK=17, PARTIALTASK=18, START=19, GOAL=20, AUTOCOMPLETE=21, LOOP=22, 
		SEQUENTIAL=23, KNOWLEDGE=24, BOOLEAN=25, EQUAL=26, UNEQUAL=27, PLUS=28, 
		SEMICOLON=29, COLON=30, COMMA=31, ASSIGN=32, META=33, CREATION_VAR=34, 
		POINTER=35, LPAREN=36, RPAREN=37, LBRACE=38, RBRACE=39, LBRACK=40, RBRACK=41, 
		IDENTIFIER=42, STRING_LITERAL=43, INTEGER=44, SKIP=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INC", "DEC", "VAR", "IF", "ELSE", "PRE", "DO", "CALL", "CONSTRUCTOR", 
		"CREATE", "SIMULATION", "EXTENDS", "EXTENDING", "META_TEXT", "TASKS", 
		"FOR", "TASK", "PARTIALTASK", "START", "GOAL", "AUTOCOMPLETE", "LOOP", 
		"SEQUENTIAL", "KNOWLEDGE", "BOOLEAN", "TRUE", "FALSE", "EQUAL", "UNEQUAL", 
		"PLUS", "SEMICOLON", "COLON", "COMMA", "ASSIGN", "META", "CREATION_VAR", 
		"POINTER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"IDENTIFIER", "LETTER", "STRING_LITERAL", "INTEGER", "DIGIT", "EscapeSequence", 
		"OctalEscape", "SKIP", "WS", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'inc'", "'dec'", "'var'", "'if'", "'else'", "'pre'", "'do'", "'call'", 
		"'constructor'", "'create'", "'simulation'", "'extends'", "'extending'", 
		"'meta'", "'tasks'", "'for'", "'task'", "'partialtask'", "'start'", "'goal'", 
		"'autocomplete'", "'loop'", "'sequential'", "'knowledge'", null, "'=='", 
		"'!='", "'+'", "';'", "':'", "','", "':='", "'@'", "'$'", "'*'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INC", "DEC", "VAR", "IF", "ELSE", "PRE", "DO", "CALL", "CONSTRUCTOR", 
		"CREATE", "SIMULATION", "EXTENDS", "EXTENDING", "META_TEXT", "TASKS", 
		"FOR", "TASK", "PARTIALTASK", "START", "GOAL", "AUTOCOMPLETE", "LOOP", 
		"SEQUENTIAL", "KNOWLEDGE", "BOOLEAN", "EQUAL", "UNEQUAL", "PLUS", "SEMICOLON", 
		"COLON", "COMMA", "ASSIGN", "META", "CREATION_VAR", "POINTER", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "IDENTIFIER", "STRING_LITERAL", 
		"INTEGER", "SKIP"
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


	public SimulationFileLexer(CharStream input) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u0180\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\5\32\u0112\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3-\7-\u0145\n-\f-\16-\u0148\13-\3.\3.\3/\3/\3/\7/\u014f\n/\f/"+
		"\16/\u0152\13/\3/\3/\3\60\6\60\u0157\n\60\r\60\16\60\u0158\3\61\3\61\3"+
		"\62\3\62\3\62\5\62\u0160\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u016b\n\63\3\64\3\64\5\64\u016f\n\64\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\7\66\u0177\n\66\f\66\16\66\u017a\13\66\3\66\5\66\u017d\n\66\3"+
		"\66\3\66\2\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\2\67\29\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[\2]-_.a\2c\2e\2g/"+
		"i\2k\2\3\2\b\3\2\62;\4\2C\\c|\4\2$$^^\n\2$$))^^ddhhppttvv\5\2\13\f\16"+
		"\17\"\"\4\2\f\f\17\17\u0183\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2g\3\2\2\2\3m\3"+
		"\2\2\2\5q\3\2\2\2\7u\3\2\2\2\ty\3\2\2\2\13|\3\2\2\2\r\u0081\3\2\2\2\17"+
		"\u0085\3\2\2\2\21\u0088\3\2\2\2\23\u008d\3\2\2\2\25\u0099\3\2\2\2\27\u00a0"+
		"\3\2\2\2\31\u00ab\3\2\2\2\33\u00b3\3\2\2\2\35\u00bd\3\2\2\2\37\u00c2\3"+
		"\2\2\2!\u00c8\3\2\2\2#\u00cc\3\2\2\2%\u00d1\3\2\2\2\'\u00dd\3\2\2\2)\u00e3"+
		"\3\2\2\2+\u00e8\3\2\2\2-\u00f5\3\2\2\2/\u00fa\3\2\2\2\61\u0105\3\2\2\2"+
		"\63\u0111\3\2\2\2\65\u0113\3\2\2\2\67\u0118\3\2\2\29\u011e\3\2\2\2;\u0121"+
		"\3\2\2\2=\u0124\3\2\2\2?\u0126\3\2\2\2A\u0128\3\2\2\2C\u012a\3\2\2\2E"+
		"\u012c\3\2\2\2G\u012f\3\2\2\2I\u0131\3\2\2\2K\u0133\3\2\2\2M\u0135\3\2"+
		"\2\2O\u0137\3\2\2\2Q\u0139\3\2\2\2S\u013b\3\2\2\2U\u013d\3\2\2\2W\u013f"+
		"\3\2\2\2Y\u0141\3\2\2\2[\u0149\3\2\2\2]\u014b\3\2\2\2_\u0156\3\2\2\2a"+
		"\u015a\3\2\2\2c\u015f\3\2\2\2e\u016a\3\2\2\2g\u016e\3\2\2\2i\u0172\3\2"+
		"\2\2k\u0174\3\2\2\2mn\7k\2\2no\7p\2\2op\7e\2\2p\4\3\2\2\2qr\7f\2\2rs\7"+
		"g\2\2st\7e\2\2t\6\3\2\2\2uv\7x\2\2vw\7c\2\2wx\7t\2\2x\b\3\2\2\2yz\7k\2"+
		"\2z{\7h\2\2{\n\3\2\2\2|}\7g\2\2}~\7n\2\2~\177\7u\2\2\177\u0080\7g\2\2"+
		"\u0080\f\3\2\2\2\u0081\u0082\7r\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g"+
		"\2\2\u0084\16\3\2\2\2\u0085\u0086\7f\2\2\u0086\u0087\7q\2\2\u0087\20\3"+
		"\2\2\2\u0088\u0089\7e\2\2\u0089\u008a\7c\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7n\2\2\u008c\22\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7q\2\2\u008f"+
		"\u0090\7p\2\2\u0090\u0091\7u\2\2\u0091\u0092\7v\2\2\u0092\u0093\7t\2\2"+
		"\u0093\u0094\7w\2\2\u0094\u0095\7e\2\2\u0095\u0096\7v\2\2\u0096\u0097"+
		"\7q\2\2\u0097\u0098\7t\2\2\u0098\24\3\2\2\2\u0099\u009a\7e\2\2\u009a\u009b"+
		"\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7c\2\2\u009d\u009e\7v\2\2\u009e"+
		"\u009f\7g\2\2\u009f\26\3\2\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7o\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7c\2\2"+
		"\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa"+
		"\7p\2\2\u00aa\30\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7z\2\2\u00ad\u00ae"+
		"\7v\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7f\2\2\u00b1"+
		"\u00b2\7u\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7z\2\2\u00b5"+
		"\u00b6\7v\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7f\2\2"+
		"\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7i\2\2\u00bc\34\3\2"+
		"\2\2\u00bd\u00be\7o\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1"+
		"\7c\2\2\u00c1\36\3\2\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5"+
		"\7u\2\2\u00c5\u00c6\7m\2\2\u00c6\u00c7\7u\2\2\u00c7 \3\2\2\2\u00c8\u00c9"+
		"\7h\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7t\2\2\u00cb\"\3\2\2\2\u00cc\u00cd"+
		"\7v\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7m\2\2\u00d0"+
		"$\3\2\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\u00d5\7v\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7n\2\2"+
		"\u00d8\u00d9\7v\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7u\2\2\u00db\u00dc"+
		"\7m\2\2\u00dc&\3\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7v\2\2\u00df\u00e0"+
		"\7c\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7v\2\2\u00e2(\3\2\2\2\u00e3\u00e4"+
		"\7i\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7n\2\2\u00e7"+
		"*\3\2\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7v\2\2\u00eb"+
		"\u00ec\7q\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7o\2\2"+
		"\u00ef\u00f0\7r\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3"+
		"\7v\2\2\u00f3\u00f4\7g\2\2\u00f4,\3\2\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7"+
		"\7q\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7r\2\2\u00f9.\3\2\2\2\u00fa\u00fb"+
		"\7u\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7s\2\2\u00fd\u00fe\7w\2\2\u00fe"+
		"\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7v\2\2\u0101\u0102\7k\2\2"+
		"\u0102\u0103\7c\2\2\u0103\u0104\7n\2\2\u0104\60\3\2\2\2\u0105\u0106\7"+
		"m\2\2\u0106\u0107\7p\2\2\u0107\u0108\7q\2\2\u0108\u0109\7y\2\2\u0109\u010a"+
		"\7n\2\2\u010a\u010b\7g\2\2\u010b\u010c\7f\2\2\u010c\u010d\7i\2\2\u010d"+
		"\u010e\7g\2\2\u010e\62\3\2\2\2\u010f\u0112\5\65\33\2\u0110\u0112\5\67"+
		"\34\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\64\3\2\2\2\u0113\u0114"+
		"\7v\2\2\u0114\u0115\7t\2\2\u0115\u0116\7w\2\2\u0116\u0117\7g\2\2\u0117"+
		"\66\3\2\2\2\u0118\u0119\7h\2\2\u0119\u011a\7c\2\2\u011a\u011b\7n\2\2\u011b"+
		"\u011c\7u\2\2\u011c\u011d\7g\2\2\u011d8\3\2\2\2\u011e\u011f\7?\2\2\u011f"+
		"\u0120\7?\2\2\u0120:\3\2\2\2\u0121\u0122\7#\2\2\u0122\u0123\7?\2\2\u0123"+
		"<\3\2\2\2\u0124\u0125\7-\2\2\u0125>\3\2\2\2\u0126\u0127\7=\2\2\u0127@"+
		"\3\2\2\2\u0128\u0129\7<\2\2\u0129B\3\2\2\2\u012a\u012b\7.\2\2\u012bD\3"+
		"\2\2\2\u012c\u012d\7<\2\2\u012d\u012e\7?\2\2\u012eF\3\2\2\2\u012f\u0130"+
		"\7B\2\2\u0130H\3\2\2\2\u0131\u0132\7&\2\2\u0132J\3\2\2\2\u0133\u0134\7"+
		",\2\2\u0134L\3\2\2\2\u0135\u0136\7*\2\2\u0136N\3\2\2\2\u0137\u0138\7+"+
		"\2\2\u0138P\3\2\2\2\u0139\u013a\7}\2\2\u013aR\3\2\2\2\u013b\u013c\7\177"+
		"\2\2\u013cT\3\2\2\2\u013d\u013e\7]\2\2\u013eV\3\2\2\2\u013f\u0140\7_\2"+
		"\2\u0140X\3\2\2\2\u0141\u0146\5[.\2\u0142\u0145\5[.\2\u0143\u0145\t\2"+
		"\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147Z\3\2\2\2\u0148\u0146\3\2\2\2"+
		"\u0149\u014a\t\3\2\2\u014a\\\3\2\2\2\u014b\u0150\7$\2\2\u014c\u014f\5"+
		"c\62\2\u014d\u014f\n\4\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7$\2\2\u0154^\3\2\2\2\u0155\u0157"+
		"\5a\61\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159`\3\2\2\2\u015a\u015b\t\2\2\2\u015bb\3\2\2\2\u015c"+
		"\u015d\7^\2\2\u015d\u0160\t\5\2\2\u015e\u0160\5e\63\2\u015f\u015c\3\2"+
		"\2\2\u015f\u015e\3\2\2\2\u0160d\3\2\2\2\u0161\u0162\7^\2\2\u0162\u0163"+
		"\4\62\65\2\u0163\u0164\4\629\2\u0164\u016b\4\629\2\u0165\u0166\7^\2\2"+
		"\u0166\u0167\4\629\2\u0167\u016b\4\629\2\u0168\u0169\7^\2\2\u0169\u016b"+
		"\4\629\2\u016a\u0161\3\2\2\2\u016a\u0165\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"f\3\2\2\2\u016c\u016f\5i\65\2\u016d\u016f\5k\66\2\u016e\u016c\3\2\2\2"+
		"\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\b\64\2\2\u0171h\3"+
		"\2\2\2\u0172\u0173\t\6\2\2\u0173j\3\2\2\2\u0174\u0178\7%\2\2\u0175\u0177"+
		"\n\7\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017d\7\17"+
		"\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017f\7\f\2\2\u017fl\3\2\2\2\16\2\u0111\u0144\u0146\u014e\u0150\u0158"+
		"\u015f\u016a\u016e\u0178\u017c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}