// Generated from C:/Users/thanisch/Documents/DAI-Labor/simulationfileparser/src/main/java/de/dailab/simulator/parser/grammar\SimulationFile.g4 by ANTLR 4.5
package de.dailab.simulator.parser.generated;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimulationFileParser extends Parser {
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
	public static final int
		RULE_parse = 0, RULE_simulation_stmt = 1, RULE_body_content = 2, RULE_config_stmt = 3, 
		RULE_string_assign = 4, RULE_integer_assign = 5, RULE_boolean_assign = 6, 
		RULE_partial_task = 7, RULE_task_config_stmt = 8, RULE_meta_assign = 9, 
		RULE_meta_link = 10, RULE_identifier_assign = 11, RULE_task = 12, RULE_knowledge = 13, 
		RULE_create_stmt = 14, RULE_partial_task_creation = 15, RULE_task_creation = 16, 
		RULE_meta_creation = 17, RULE_string_concat = 18, RULE_array_expr = 19, 
		RULE_array_index = 20, RULE_to_array_index = 21, RULE_from_array_index = 22, 
		RULE_constructor_scope_var = 23, RULE_constructor_scope_var_assign = 24, 
		RULE_constructor_stmt = 25, RULE_pre_block = 26, RULE_do_block = 27, RULE_block = 28, 
		RULE_statement = 29, RULE_if_stmt = 30, RULE_else_block = 31, RULE_if_expr = 32, 
		RULE_atomic_expr = 33, RULE_var_stmt = 34, RULE_inc_stmt = 35, RULE_dec_stmt = 36, 
		RULE_tasks_stmt = 37, RULE_tasks_arguments = 38;
	public static final String[] ruleNames = {
		"parse", "simulation_stmt", "body_content", "config_stmt", "string_assign", 
		"integer_assign", "boolean_assign", "partial_task", "task_config_stmt", 
		"meta_assign", "meta_link", "identifier_assign", "task", "knowledge", 
		"create_stmt", "partial_task_creation", "task_creation", "meta_creation", 
		"string_concat", "array_expr", "array_index", "to_array_index", "from_array_index", 
		"constructor_scope_var", "constructor_scope_var_assign", "constructor_stmt", 
		"pre_block", "do_block", "block", "statement", "if_stmt", "else_block", 
		"if_expr", "atomic_expr", "var_stmt", "inc_stmt", "dec_stmt", "tasks_stmt", 
		"tasks_arguments"
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

	@Override
	public String getGrammarFileName() { return "SimulationFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimulationFileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public Simulation_stmtContext simulation_stmt() {
			return getRuleContext(Simulation_stmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SimulationFileParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			simulation_stmt();
			setState(79); 
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

	public static class Simulation_stmtContext extends ParserRuleContext {
		public TerminalNode SIMULATION() { return getToken(SimulationFileParser.SIMULATION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(SimulationFileParser.LBRACE, 0); }
		public Body_contentContext body_content() {
			return getRuleContext(Body_contentContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SimulationFileParser.RBRACE, 0); }
		public Simulation_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulation_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterSimulation_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitSimulation_stmt(this);
		}
	}

	public final Simulation_stmtContext simulation_stmt() throws RecognitionException {
		Simulation_stmtContext _localctx = new Simulation_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simulation_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			match(SIMULATION);
			setState(82); 
			match(IDENTIFIER);
			setState(83); 
			match(LBRACE);
			setState(84); 
			body_content();
			setState(85); 
			match(RBRACE);
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

	public static class Body_contentContext extends ParserRuleContext {
		public List<Config_stmtContext> config_stmt() {
			return getRuleContexts(Config_stmtContext.class);
		}
		public Config_stmtContext config_stmt(int i) {
			return getRuleContext(Config_stmtContext.class,i);
		}
		public List<Partial_taskContext> partial_task() {
			return getRuleContexts(Partial_taskContext.class);
		}
		public Partial_taskContext partial_task(int i) {
			return getRuleContext(Partial_taskContext.class,i);
		}
		public List<TaskContext> task() {
			return getRuleContexts(TaskContext.class);
		}
		public TaskContext task(int i) {
			return getRuleContext(TaskContext.class,i);
		}
		public List<Meta_assignContext> meta_assign() {
			return getRuleContexts(Meta_assignContext.class);
		}
		public Meta_assignContext meta_assign(int i) {
			return getRuleContext(Meta_assignContext.class,i);
		}
		public List<Constructor_stmtContext> constructor_stmt() {
			return getRuleContexts(Constructor_stmtContext.class);
		}
		public Constructor_stmtContext constructor_stmt(int i) {
			return getRuleContext(Constructor_stmtContext.class,i);
		}
		public List<Tasks_stmtContext> tasks_stmt() {
			return getRuleContexts(Tasks_stmtContext.class);
		}
		public Tasks_stmtContext tasks_stmt(int i) {
			return getRuleContext(Tasks_stmtContext.class,i);
		}
		public Body_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterBody_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitBody_content(this);
		}
	}

	public final Body_contentContext body_content() throws RecognitionException {
		Body_contentContext _localctx = new Body_contentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << CONSTRUCTOR) | (1L << TASK) | (1L << PARTIALTASK) | (1L << START) | (1L << GOAL) | (1L << AUTOCOMPLETE) | (1L << LOOP) | (1L << META))) != 0)) {
				{
				setState(93);
				switch (_input.LA(1)) {
				case START:
				case GOAL:
				case AUTOCOMPLETE:
				case LOOP:
					{
					setState(87); 
					config_stmt();
					}
					break;
				case PARTIALTASK:
					{
					setState(88); 
					partial_task();
					}
					break;
				case TASK:
					{
					setState(89); 
					task();
					}
					break;
				case META:
					{
					setState(90); 
					meta_assign();
					}
					break;
				case CONSTRUCTOR:
					{
					setState(91); 
					constructor_stmt();
					}
					break;
				case CALL:
					{
					setState(92); 
					tasks_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97);
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

	public static class Config_stmtContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(SimulationFileParser.START, 0); }
		public String_assignContext string_assign() {
			return getRuleContext(String_assignContext.class,0);
		}
		public TerminalNode GOAL() { return getToken(SimulationFileParser.GOAL, 0); }
		public TerminalNode LOOP() { return getToken(SimulationFileParser.LOOP, 0); }
		public Integer_assignContext integer_assign() {
			return getRuleContext(Integer_assignContext.class,0);
		}
		public TerminalNode AUTOCOMPLETE() { return getToken(SimulationFileParser.AUTOCOMPLETE, 0); }
		public Boolean_assignContext boolean_assign() {
			return getRuleContext(Boolean_assignContext.class,0);
		}
		public Config_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterConfig_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitConfig_stmt(this);
		}
	}

	public final Config_stmtContext config_stmt() throws RecognitionException {
		Config_stmtContext _localctx = new Config_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_config_stmt);
		try {
			setState(106);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); 
				match(START);
				setState(99); 
				string_assign();
				}
				break;
			case GOAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); 
				match(GOAL);
				setState(101); 
				string_assign();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); 
				match(LOOP);
				setState(103); 
				integer_assign();
				}
				break;
			case AUTOCOMPLETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(104); 
				match(AUTOCOMPLETE);
				setState(105); 
				boolean_assign();
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

	public static class String_assignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SimulationFileParser.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SimulationFileParser.STRING_LITERAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimulationFileParser.SEMICOLON, 0); }
		public String_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterString_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitString_assign(this);
		}
	}

	public final String_assignContext string_assign() throws RecognitionException {
		String_assignContext _localctx = new String_assignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			match(ASSIGN);
			setState(109); 
			match(STRING_LITERAL);
			setState(110); 
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

	public static class Integer_assignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SimulationFileParser.ASSIGN, 0); }
		public TerminalNode INTEGER() { return getToken(SimulationFileParser.INTEGER, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimulationFileParser.SEMICOLON, 0); }
		public Integer_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterInteger_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitInteger_assign(this);
		}
	}

	public final Integer_assignContext integer_assign() throws RecognitionException {
		Integer_assignContext _localctx = new Integer_assignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_integer_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			match(ASSIGN);
			setState(113); 
			match(INTEGER);
			setState(114); 
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

	public static class Boolean_assignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SimulationFileParser.ASSIGN, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimulationFileParser.BOOLEAN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimulationFileParser.SEMICOLON, 0); }
		public Boolean_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterBoolean_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitBoolean_assign(this);
		}
	}

	public final Boolean_assignContext boolean_assign() throws RecognitionException {
		Boolean_assignContext _localctx = new Boolean_assignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_boolean_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); 
			match(ASSIGN);
			setState(117); 
			match(BOOLEAN);
			setState(118); 
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

	public static class Partial_taskContext extends ParserRuleContext {
		public TerminalNode PARTIALTASK() { return getToken(SimulationFileParser.PARTIALTASK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(SimulationFileParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimulationFileParser.RBRACE, 0); }
		public List<Task_config_stmtContext> task_config_stmt() {
			return getRuleContexts(Task_config_stmtContext.class);
		}
		public Task_config_stmtContext task_config_stmt(int i) {
			return getRuleContext(Task_config_stmtContext.class,i);
		}
		public List<Meta_assignContext> meta_assign() {
			return getRuleContexts(Meta_assignContext.class);
		}
		public Meta_assignContext meta_assign(int i) {
			return getRuleContext(Meta_assignContext.class,i);
		}
		public Partial_taskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partial_task; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterPartial_task(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitPartial_task(this);
		}
	}

	public final Partial_taskContext partial_task() throws RecognitionException {
		Partial_taskContext _localctx = new Partial_taskContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_partial_task);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			match(PARTIALTASK);
			setState(121); 
			match(IDENTIFIER);
			setState(122); 
			match(LBRACE);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEQUENTIAL || _la==META) {
				{
				setState(125);
				switch (_input.LA(1)) {
				case SEQUENTIAL:
					{
					setState(123); 
					task_config_stmt();
					}
					break;
				case META:
					{
					setState(124); 
					meta_assign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130); 
			match(RBRACE);
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

	public static class Task_config_stmtContext extends ParserRuleContext {
		public TerminalNode SEQUENTIAL() { return getToken(SimulationFileParser.SEQUENTIAL, 0); }
		public Boolean_assignContext boolean_assign() {
			return getRuleContext(Boolean_assignContext.class,0);
		}
		public Task_config_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task_config_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterTask_config_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitTask_config_stmt(this);
		}
	}

	public final Task_config_stmtContext task_config_stmt() throws RecognitionException {
		Task_config_stmtContext _localctx = new Task_config_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_task_config_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			match(SEQUENTIAL);
			setState(133); 
			boolean_assign();
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

	public static class Meta_assignContext extends ParserRuleContext {
		public TerminalNode META() { return getToken(SimulationFileParser.META, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public String_assignContext string_assign() {
			return getRuleContext(String_assignContext.class,0);
		}
		public Identifier_assignContext identifier_assign() {
			return getRuleContext(Identifier_assignContext.class,0);
		}
		public Meta_linkContext meta_link() {
			return getRuleContext(Meta_linkContext.class,0);
		}
		public Meta_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterMeta_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitMeta_assign(this);
		}
	}

	public final Meta_assignContext meta_assign() throws RecognitionException {
		Meta_assignContext _localctx = new Meta_assignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_meta_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			match(META);
			setState(136); 
			match(IDENTIFIER);
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(137); 
				string_assign();
				}
				break;
			case 2:
				{
				setState(138); 
				identifier_assign();
				}
				break;
			case 3:
				{
				setState(139); 
				meta_link();
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

	public static class Meta_linkContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SimulationFileParser.ASSIGN, 0); }
		public TerminalNode META() { return getToken(SimulationFileParser.META, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public Meta_linkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterMeta_link(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitMeta_link(this);
		}
	}

	public final Meta_linkContext meta_link() throws RecognitionException {
		Meta_linkContext _localctx = new Meta_linkContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_meta_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			match(ASSIGN);
			setState(143); 
			match(META);
			setState(144); 
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

	public static class Identifier_assignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SimulationFileParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimulationFileParser.SEMICOLON, 0); }
		public Identifier_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterIdentifier_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitIdentifier_assign(this);
		}
	}

	public final Identifier_assignContext identifier_assign() throws RecognitionException {
		Identifier_assignContext _localctx = new Identifier_assignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifier_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); 
			match(ASSIGN);
			setState(147); 
			match(IDENTIFIER);
			setState(148); 
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

	public static class TaskContext extends ParserRuleContext {
		public TerminalNode TASK() { return getToken(SimulationFileParser.TASK, 0); }
		public TerminalNode LBRACE() { return getToken(SimulationFileParser.LBRACE, 0); }
		public KnowledgeContext knowledge() {
			return getRuleContext(KnowledgeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SimulationFileParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimulationFileParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimulationFileParser.IDENTIFIER, i);
		}
		public TerminalNode EXTENDS() { return getToken(SimulationFileParser.EXTENDS, 0); }
		public List<Task_config_stmtContext> task_config_stmt() {
			return getRuleContexts(Task_config_stmtContext.class);
		}
		public Task_config_stmtContext task_config_stmt(int i) {
			return getRuleContext(Task_config_stmtContext.class,i);
		}
		public List<Meta_assignContext> meta_assign() {
			return getRuleContexts(Meta_assignContext.class);
		}
		public Meta_assignContext meta_assign(int i) {
			return getRuleContext(Meta_assignContext.class,i);
		}
		public TaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitTask(this);
		}
	}

	public final TaskContext task() throws RecognitionException {
		TaskContext _localctx = new TaskContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_task);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); 
			match(TASK);
			setState(152);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(151); 
				match(IDENTIFIER);
				}
			}

			setState(156);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(154); 
				match(EXTENDS);
				setState(155); 
				match(IDENTIFIER);
				}
			}

			setState(158); 
			match(LBRACE);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEQUENTIAL || _la==META) {
				{
				setState(161);
				switch (_input.LA(1)) {
				case SEQUENTIAL:
					{
					setState(159); 
					task_config_stmt();
					}
					break;
				case META:
					{
					setState(160); 
					meta_assign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166); 
			knowledge();
			setState(167); 
			match(RBRACE);
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

	public static class KnowledgeContext extends ParserRuleContext {
		public TerminalNode KNOWLEDGE() { return getToken(SimulationFileParser.KNOWLEDGE, 0); }
		public TerminalNode ASSIGN() { return getToken(SimulationFileParser.ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(SimulationFileParser.LBRACK, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(SimulationFileParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(SimulationFileParser.STRING_LITERAL, i);
		}
		public TerminalNode RBRACK() { return getToken(SimulationFileParser.RBRACK, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimulationFileParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SimulationFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimulationFileParser.COMMA, i);
		}
		public KnowledgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knowledge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterKnowledge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitKnowledge(this);
		}
	}

	public final KnowledgeContext knowledge() throws RecognitionException {
		KnowledgeContext _localctx = new KnowledgeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_knowledge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); 
			match(KNOWLEDGE);
			setState(170); 
			match(ASSIGN);
			setState(171); 
			match(LBRACK);
			setState(172); 
			match(STRING_LITERAL);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173); 
				match(COMMA);
				setState(174); 
				match(STRING_LITERAL);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180); 
			match(RBRACK);
			setState(181); 
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

	public static class Create_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SimulationFileParser.CREATE, 0); }
		public Meta_creationContext meta_creation() {
			return getRuleContext(Meta_creationContext.class,0);
		}
		public Partial_task_creationContext partial_task_creation() {
			return getRuleContext(Partial_task_creationContext.class,0);
		}
		public Task_creationContext task_creation() {
			return getRuleContext(Task_creationContext.class,0);
		}
		public Create_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterCreate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitCreate_stmt(this);
		}
	}

	public final Create_stmtContext create_stmt() throws RecognitionException {
		Create_stmtContext _localctx = new Create_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			match(CREATE);
			setState(187);
			switch (_input.LA(1)) {
			case META_TEXT:
				{
				setState(184); 
				meta_creation();
				}
				break;
			case PARTIALTASK:
				{
				setState(185); 
				partial_task_creation();
				}
				break;
			case TASK:
				{
				setState(186); 
				task_creation();
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

	public static class Partial_task_creationContext extends ParserRuleContext {
		public TerminalNode PARTIALTASK() { return getToken(SimulationFileParser.PARTIALTASK, 0); }
		public TerminalNode LPAREN() { return getToken(SimulationFileParser.LPAREN, 0); }
		public Atomic_exprContext atomic_expr() {
			return getRuleContext(Atomic_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimulationFileParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(SimulationFileParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimulationFileParser.RBRACE, 0); }
		public List<Task_config_stmtContext> task_config_stmt() {
			return getRuleContexts(Task_config_stmtContext.class);
		}
		public Task_config_stmtContext task_config_stmt(int i) {
			return getRuleContext(Task_config_stmtContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimulationFileParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimulationFileParser.SEMICOLON, i);
		}
		public List<Meta_assignContext> meta_assign() {
			return getRuleContexts(Meta_assignContext.class);
		}
		public Meta_assignContext meta_assign(int i) {
			return getRuleContext(Meta_assignContext.class,i);
		}
		public Partial_task_creationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partial_task_creation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterPartial_task_creation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitPartial_task_creation(this);
		}
	}

	public final Partial_task_creationContext partial_task_creation() throws RecognitionException {
		Partial_task_creationContext _localctx = new Partial_task_creationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partial_task_creation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); 
			match(PARTIALTASK);
			setState(190); 
			match(LPAREN);
			setState(191); 
			atomic_expr();
			setState(192); 
			match(RPAREN);
			setState(193); 
			match(LBRACE);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEQUENTIAL || _la==META) {
				{
				setState(200);
				switch (_input.LA(1)) {
				case SEQUENTIAL:
					{
					setState(194); 
					task_config_stmt();
					setState(195); 
					match(SEMICOLON);
					}
					break;
				case META:
					{
					setState(197); 
					meta_assign();
					setState(198); 
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205); 
			match(RBRACE);
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

	public static class Task_creationContext extends ParserRuleContext {
		public TerminalNode TASK() { return getToken(SimulationFileParser.TASK, 0); }
		public TerminalNode LPAREN() { return getToken(SimulationFileParser.LPAREN, 0); }
		public List<Atomic_exprContext> atomic_expr() {
			return getRuleContexts(Atomic_exprContext.class);
		}
		public Atomic_exprContext atomic_expr(int i) {
			return getRuleContext(Atomic_exprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SimulationFileParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimulationFileParser.SEMICOLON, 0); }
		public TerminalNode EXTENDING() { return getToken(SimulationFileParser.EXTENDING, 0); }
		public Task_creationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task_creation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterTask_creation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitTask_creation(this);
		}
	}

	public final Task_creationContext task_creation() throws RecognitionException {
		Task_creationContext _localctx = new Task_creationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_task_creation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); 
			match(TASK);
			setState(208); 
			match(LPAREN);
			setState(209); 
			atomic_expr();
			setState(210); 
			match(RPAREN);
			setState(213);
			_la = _input.LA(1);
			if (_la==EXTENDING) {
				{
				setState(211); 
				match(EXTENDING);
				setState(212); 
				atomic_expr();
				}
			}

			setState(215); 
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

	public static class Meta_creationContext extends ParserRuleContext {
		public TerminalNode META_TEXT() { return getToken(SimulationFileParser.META_TEXT, 0); }
		public TerminalNode LPAREN() { return getToken(SimulationFileParser.LPAREN, 0); }
		public List<Atomic_exprContext> atomic_expr() {
			return getRuleContexts(Atomic_exprContext.class);
		}
		public Atomic_exprContext atomic_expr(int i) {
			return getRuleContext(Atomic_exprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SimulationFileParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(SimulationFileParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimulationFileParser.SEMICOLON, 0); }
		public Meta_creationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_creation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterMeta_creation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitMeta_creation(this);
		}
	}

	public final Meta_creationContext meta_creation() throws RecognitionException {
		Meta_creationContext _localctx = new Meta_creationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_meta_creation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); 
			match(META_TEXT);
			setState(218); 
			match(LPAREN);
			setState(219); 
			atomic_expr();
			setState(220); 
			match(COMMA);
			setState(221); 
			atomic_expr();
			setState(222); 
			match(RPAREN);
			setState(223); 
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

	public static class String_concatContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(SimulationFileParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(SimulationFileParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(SimulationFileParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SimulationFileParser.INTEGER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimulationFileParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimulationFileParser.IDENTIFIER, i);
		}
		public List<Constructor_scope_varContext> constructor_scope_var() {
			return getRuleContexts(Constructor_scope_varContext.class);
		}
		public Constructor_scope_varContext constructor_scope_var(int i) {
			return getRuleContext(Constructor_scope_varContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimulationFileParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimulationFileParser.PLUS, i);
		}
		public String_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterString_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitString_concat(this);
		}
	}

	public final String_concatContext string_concat() throws RecognitionException {
		String_concatContext _localctx = new String_concatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string_concat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(225); 
				match(STRING_LITERAL);
				}
				break;
			case INTEGER:
				{
				setState(226); 
				match(INTEGER);
				}
				break;
			case IDENTIFIER:
				{
				setState(227); 
				match(IDENTIFIER);
				}
				break;
			case CREATION_VAR:
				{
				setState(228); 
				constructor_scope_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(231); 
				match(PLUS);
				setState(236);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(232); 
					match(STRING_LITERAL);
					}
					break;
				case INTEGER:
					{
					setState(233); 
					match(INTEGER);
					}
					break;
				case IDENTIFIER:
					{
					setState(234); 
					match(IDENTIFIER);
					}
					break;
				case CREATION_VAR:
					{
					setState(235); 
					constructor_scope_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(242);
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

	public static class Array_exprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SimulationFileParser.LBRACK, 0); }
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SimulationFileParser.RBRACK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public Constructor_scope_varContext constructor_scope_var() {
			return getRuleContext(Constructor_scope_varContext.class,0);
		}
		public Array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterArray_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitArray_expr(this);
		}
	}

	public final Array_exprContext array_expr() throws RecognitionException {
		Array_exprContext _localctx = new Array_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(243); 
				match(IDENTIFIER);
				}
				break;
			case CREATION_VAR:
				{
				setState(244); 
				constructor_scope_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(247); 
			match(LBRACK);
			setState(248); 
			array_index();
			setState(249); 
			match(RBRACK);
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

	public static class Array_indexContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(SimulationFileParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SimulationFileParser.INTEGER, i);
		}
		public To_array_indexContext to_array_index() {
			return getRuleContext(To_array_indexContext.class,0);
		}
		public From_array_indexContext from_array_index() {
			return getRuleContext(From_array_indexContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimulationFileParser.COLON, 0); }
		public Array_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterArray_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitArray_index(this);
		}
	}

	public final Array_indexContext array_index() throws RecognitionException {
		Array_indexContext _localctx = new Array_indexContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array_index);
		try {
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); 
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252); 
				to_array_index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253); 
				from_array_index();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254); 
				match(INTEGER);
				setState(255); 
				match(COLON);
				setState(256); 
				match(INTEGER);
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

	public static class To_array_indexContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SimulationFileParser.COLON, 0); }
		public TerminalNode INTEGER() { return getToken(SimulationFileParser.INTEGER, 0); }
		public To_array_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to_array_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterTo_array_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitTo_array_index(this);
		}
	}

	public final To_array_indexContext to_array_index() throws RecognitionException {
		To_array_indexContext _localctx = new To_array_indexContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_to_array_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); 
			match(COLON);
			setState(260); 
			match(INTEGER);
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

	public static class From_array_indexContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SimulationFileParser.INTEGER, 0); }
		public TerminalNode COLON() { return getToken(SimulationFileParser.COLON, 0); }
		public From_array_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_array_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterFrom_array_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitFrom_array_index(this);
		}
	}

	public final From_array_indexContext from_array_index() throws RecognitionException {
		From_array_indexContext _localctx = new From_array_indexContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_from_array_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); 
			match(INTEGER);
			setState(263); 
			match(COLON);
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

	public static class Constructor_scope_varContext extends ParserRuleContext {
		public TerminalNode CREATION_VAR() { return getToken(SimulationFileParser.CREATION_VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public Constructor_scope_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_scope_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterConstructor_scope_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitConstructor_scope_var(this);
		}
	}

	public final Constructor_scope_varContext constructor_scope_var() throws RecognitionException {
		Constructor_scope_varContext _localctx = new Constructor_scope_varContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructor_scope_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); 
			match(CREATION_VAR);
			setState(266); 
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

	public static class Constructor_scope_var_assignContext extends ParserRuleContext {
		public Constructor_scope_varContext constructor_scope_var() {
			return getRuleContext(Constructor_scope_varContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SimulationFileParser.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SimulationFileParser.STRING_LITERAL, 0); }
		public Constructor_scope_var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_scope_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterConstructor_scope_var_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitConstructor_scope_var_assign(this);
		}
	}

	public final Constructor_scope_var_assignContext constructor_scope_var_assign() throws RecognitionException {
		Constructor_scope_var_assignContext _localctx = new Constructor_scope_var_assignContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constructor_scope_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); 
			constructor_scope_var();
			setState(269); 
			match(ASSIGN);
			setState(270); 
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

	public static class Constructor_stmtContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(SimulationFileParser.CONSTRUCTOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(SimulationFileParser.LBRACE, 0); }
		public Do_blockContext do_block() {
			return getRuleContext(Do_blockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SimulationFileParser.RBRACE, 0); }
		public Pre_blockContext pre_block() {
			return getRuleContext(Pre_blockContext.class,0);
		}
		public Constructor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterConstructor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitConstructor_stmt(this);
		}
	}

	public final Constructor_stmtContext constructor_stmt() throws RecognitionException {
		Constructor_stmtContext _localctx = new Constructor_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructor_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); 
			match(CONSTRUCTOR);
			setState(273); 
			match(IDENTIFIER);
			setState(274); 
			match(LBRACE);
			setState(276);
			_la = _input.LA(1);
			if (_la==PRE) {
				{
				setState(275); 
				pre_block();
				}
			}

			setState(278); 
			do_block();
			setState(279); 
			match(RBRACE);
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

	public static class Pre_blockContext extends ParserRuleContext {
		public TerminalNode PRE() { return getToken(SimulationFileParser.PRE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Pre_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterPre_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitPre_block(this);
		}
	}

	public final Pre_blockContext pre_block() throws RecognitionException {
		Pre_blockContext _localctx = new Pre_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pre_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); 
			match(PRE);
			setState(282); 
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

	public static class Do_blockContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(SimulationFileParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Do_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterDo_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitDo_block(this);
		}
	}

	public final Do_blockContext do_block() throws RecognitionException {
		Do_blockContext _localctx = new Do_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_do_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); 
			match(DO);
			setState(285); 
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimulationFileParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimulationFileParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); 
			match(LBRACE);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << VAR) | (1L << IF) | (1L << CREATE))) != 0)) {
				{
				{
				setState(288); 
				statement();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294); 
			match(RBRACE);
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

	public static class StatementContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Var_stmtContext var_stmt() {
			return getRuleContext(Var_stmtContext.class,0);
		}
		public Create_stmtContext create_stmt() {
			return getRuleContext(Create_stmtContext.class,0);
		}
		public Inc_stmtContext inc_stmt() {
			return getRuleContext(Inc_stmtContext.class,0);
		}
		public Dec_stmtContext dec_stmt() {
			return getRuleContext(Dec_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(296); 
				if_stmt();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(297); 
				var_stmt();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(298); 
				create_stmt();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 4);
				{
				setState(299); 
				inc_stmt();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 5);
				{
				setState(300); 
				dec_stmt();
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimulationFileParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(SimulationFileParser.LPAREN, 0); }
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimulationFileParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); 
			match(IF);
			setState(304); 
			match(LPAREN);
			setState(305); 
			if_expr();
			setState(306); 
			match(RPAREN);
			setState(307); 
			block();
			setState(309);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(308); 
				else_block();
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SimulationFileParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitElse_block(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); 
			match(ELSE);
			setState(312); 
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

	public static class If_exprContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(SimulationFileParser.BOOLEAN, 0); }
		public List<Atomic_exprContext> atomic_expr() {
			return getRuleContexts(Atomic_exprContext.class);
		}
		public Atomic_exprContext atomic_expr(int i) {
			return getRuleContext(Atomic_exprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(SimulationFileParser.EQUAL, 0); }
		public TerminalNode UNEQUAL() { return getToken(SimulationFileParser.UNEQUAL, 0); }
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterIf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitIf_expr(this);
		}
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_if_expr);
		int _la;
		try {
			setState(319);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(314); 
				match(BOOLEAN);
				}
				break;
			case CREATION_VAR:
			case IDENTIFIER:
			case STRING_LITERAL:
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); 
				atomic_expr();
				setState(316);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==UNEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(317); 
				atomic_expr();
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

	public static class Atomic_exprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public String_concatContext string_concat() {
			return getRuleContext(String_concatContext.class,0);
		}
		public Array_exprContext array_expr() {
			return getRuleContext(Array_exprContext.class,0);
		}
		public Constructor_scope_varContext constructor_scope_var() {
			return getRuleContext(Constructor_scope_varContext.class,0);
		}
		public Atomic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterAtomic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitAtomic_expr(this);
		}
	}

	public final Atomic_exprContext atomic_expr() throws RecognitionException {
		Atomic_exprContext _localctx = new Atomic_exprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_atomic_expr);
		try {
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321); 
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322); 
				string_concat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323); 
				array_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(324); 
				constructor_scope_var();
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

	public static class Var_stmtContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SimulationFileParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SimulationFileParser.ASSIGN, 0); }
		public String_concatContext string_concat() {
			return getRuleContext(String_concatContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimulationFileParser.SEMICOLON, 0); }
		public Var_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterVar_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitVar_stmt(this);
		}
	}

	public final Var_stmtContext var_stmt() throws RecognitionException {
		Var_stmtContext _localctx = new Var_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_var_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); 
			match(VAR);
			setState(328); 
			match(IDENTIFIER);
			setState(329); 
			match(ASSIGN);
			setState(330); 
			string_concat();
			setState(331); 
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

	public static class Inc_stmtContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(SimulationFileParser.INC, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimulationFileParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public Constructor_scope_varContext constructor_scope_var() {
			return getRuleContext(Constructor_scope_varContext.class,0);
		}
		public Inc_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterInc_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitInc_stmt(this);
		}
	}

	public final Inc_stmtContext inc_stmt() throws RecognitionException {
		Inc_stmtContext _localctx = new Inc_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); 
			match(INC);
			setState(336);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(334); 
				match(IDENTIFIER);
				}
				break;
			case CREATION_VAR:
				{
				setState(335); 
				constructor_scope_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(338); 
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

	public static class Dec_stmtContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(SimulationFileParser.DEC, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimulationFileParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public Constructor_scope_varContext constructor_scope_var() {
			return getRuleContext(Constructor_scope_varContext.class,0);
		}
		public Dec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterDec_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitDec_stmt(this);
		}
	}

	public final Dec_stmtContext dec_stmt() throws RecognitionException {
		Dec_stmtContext _localctx = new Dec_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dec_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); 
			match(DEC);
			setState(343);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(341); 
				match(IDENTIFIER);
				}
				break;
			case CREATION_VAR:
				{
				setState(342); 
				constructor_scope_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(345); 
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

	public static class Tasks_stmtContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(SimulationFileParser.CALL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SimulationFileParser.IDENTIFIER, 0); }
		public Tasks_argumentsContext tasks_arguments() {
			return getRuleContext(Tasks_argumentsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimulationFileParser.SEMICOLON, 0); }
		public Tasks_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tasks_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterTasks_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitTasks_stmt(this);
		}
	}

	public final Tasks_stmtContext tasks_stmt() throws RecognitionException {
		Tasks_stmtContext _localctx = new Tasks_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tasks_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); 
			match(CALL);
			setState(348); 
			match(IDENTIFIER);
			setState(349); 
			tasks_arguments();
			setState(350); 
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

	public static class Tasks_argumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SimulationFileParser.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SimulationFileParser.STRING_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(SimulationFileParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SimulationFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimulationFileParser.COMMA, i);
		}
		public List<Constructor_scope_var_assignContext> constructor_scope_var_assign() {
			return getRuleContexts(Constructor_scope_var_assignContext.class);
		}
		public Constructor_scope_var_assignContext constructor_scope_var_assign(int i) {
			return getRuleContext(Constructor_scope_var_assignContext.class,i);
		}
		public Tasks_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tasks_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).enterTasks_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimulationFileListener ) ((SimulationFileListener)listener).exitTasks_arguments(this);
		}
	}

	public final Tasks_argumentsContext tasks_arguments() throws RecognitionException {
		Tasks_argumentsContext _localctx = new Tasks_argumentsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tasks_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); 
			match(LPAREN);
			setState(353); 
			match(STRING_LITERAL);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(354); 
				match(COMMA);
				setState(355); 
				constructor_scope_var_assign();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361); 
			match(RPAREN);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5m\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083\13\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u008f\n\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u009b\n\16\3\16\3\16\5\16\u009f"+
		"\n\16\3\16\3\16\3\16\7\16\u00a4\n\16\f\16\16\16\u00a7\13\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b2\n\17\f\17\16\17\u00b5\13"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00be\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00cb\n\21\f\21\16\21\u00ce"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d8\n\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00e8"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ef\n\24\7\24\u00f1\n\24\f\24\16"+
		"\24\u00f4\13\24\3\25\3\25\5\25\u00f8\n\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0104\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0117\n\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\7\36\u0124\n\36\f\36"+
		"\16\36\u0127\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u0130\n\37"+
		"\3 \3 \3 \3 \3 \3 \5 \u0138\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0142"+
		"\n\"\3#\3#\3#\3#\5#\u0148\n#\3$\3$\3$\3$\3$\3$\3%\3%\3%\5%\u0153\n%\3"+
		"%\3%\3&\3&\3&\5&\u015a\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u0167"+
		"\n(\f(\16(\u016a\13(\3(\3(\3(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\3\3\2\34\35\u0176\2P\3\2\2\2\4"+
		"S\3\2\2\2\6a\3\2\2\2\bl\3\2\2\2\nn\3\2\2\2\fr\3\2\2\2\16v\3\2\2\2\20z"+
		"\3\2\2\2\22\u0086\3\2\2\2\24\u0089\3\2\2\2\26\u0090\3\2\2\2\30\u0094\3"+
		"\2\2\2\32\u0098\3\2\2\2\34\u00ab\3\2\2\2\36\u00b9\3\2\2\2 \u00bf\3\2\2"+
		"\2\"\u00d1\3\2\2\2$\u00db\3\2\2\2&\u00e7\3\2\2\2(\u00f7\3\2\2\2*\u0103"+
		"\3\2\2\2,\u0105\3\2\2\2.\u0108\3\2\2\2\60\u010b\3\2\2\2\62\u010e\3\2\2"+
		"\2\64\u0112\3\2\2\2\66\u011b\3\2\2\28\u011e\3\2\2\2:\u0121\3\2\2\2<\u012f"+
		"\3\2\2\2>\u0131\3\2\2\2@\u0139\3\2\2\2B\u0141\3\2\2\2D\u0147\3\2\2\2F"+
		"\u0149\3\2\2\2H\u014f\3\2\2\2J\u0156\3\2\2\2L\u015d\3\2\2\2N\u0162\3\2"+
		"\2\2PQ\5\4\3\2QR\7\2\2\3R\3\3\2\2\2ST\7\r\2\2TU\7,\2\2UV\7(\2\2VW\5\6"+
		"\4\2WX\7)\2\2X\5\3\2\2\2Y`\5\b\5\2Z`\5\20\t\2[`\5\32\16\2\\`\5\24\13\2"+
		"]`\5\64\33\2^`\5L\'\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2"+
		"\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\7\3\2\2\2ca\3\2\2\2de\7\25"+
		"\2\2em\5\n\6\2fg\7\26\2\2gm\5\n\6\2hi\7\30\2\2im\5\f\7\2jk\7\27\2\2km"+
		"\5\16\b\2ld\3\2\2\2lf\3\2\2\2lh\3\2\2\2lj\3\2\2\2m\t\3\2\2\2no\7\"\2\2"+
		"op\7-\2\2pq\7\37\2\2q\13\3\2\2\2rs\7\"\2\2st\7.\2\2tu\7\37\2\2u\r\3\2"+
		"\2\2vw\7\"\2\2wx\7\33\2\2xy\7\37\2\2y\17\3\2\2\2z{\7\24\2\2{|\7,\2\2|"+
		"\u0081\7(\2\2}\u0080\5\22\n\2~\u0080\5\24\13\2\177}\3\2\2\2\177~\3\2\2"+
		"\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7)\2\2\u0085\21\3\2\2\2\u0086"+
		"\u0087\7\31\2\2\u0087\u0088\5\16\b\2\u0088\23\3\2\2\2\u0089\u008a\7#\2"+
		"\2\u008a\u008e\7,\2\2\u008b\u008f\5\n\6\2\u008c\u008f\5\30\r\2\u008d\u008f"+
		"\5\26\f\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2"+
		"\u008f\25\3\2\2\2\u0090\u0091\7\"\2\2\u0091\u0092\7#\2\2\u0092\u0093\7"+
		",\2\2\u0093\27\3\2\2\2\u0094\u0095\7\"\2\2\u0095\u0096\7,\2\2\u0096\u0097"+
		"\7\37\2\2\u0097\31\3\2\2\2\u0098\u009a\7\23\2\2\u0099\u009b\7,\2\2\u009a"+
		"\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009d\7\16"+
		"\2\2\u009d\u009f\7,\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a5\7(\2\2\u00a1\u00a4\5\22\n\2\u00a2\u00a4\5\24"+
		"\13\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\7)\2\2\u00aa\33\3\2\2\2\u00ab\u00ac"+
		"\7\32\2\2\u00ac\u00ad\7\"\2\2\u00ad\u00ae\7*\2\2\u00ae\u00b3\7-\2\2\u00af"+
		"\u00b0\7!\2\2\u00b0\u00b2\7-\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7\u00b8\7\37\2\2\u00b8\35\3\2\2\2\u00b9"+
		"\u00bd\7\f\2\2\u00ba\u00be\5$\23\2\u00bb\u00be\5 \21\2\u00bc\u00be\5\""+
		"\22\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\37\3\2\2\2\u00bf\u00c0\7\24\2\2\u00c0\u00c1\7&\2\2\u00c1\u00c2\5D#\2"+
		"\u00c2\u00c3\7\'\2\2\u00c3\u00cc\7(\2\2\u00c4\u00c5\5\22\n\2\u00c5\u00c6"+
		"\7\37\2\2\u00c6\u00cb\3\2\2\2\u00c7\u00c8\5\24\13\2\u00c8\u00c9\7\37\2"+
		"\2\u00c9\u00cb\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\u00ce"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\7)\2\2\u00d0!\3\2\2\2\u00d1\u00d2\7\23\2\2"+
		"\u00d2\u00d3\7&\2\2\u00d3\u00d4\5D#\2\u00d4\u00d7\7\'\2\2\u00d5\u00d6"+
		"\7\17\2\2\u00d6\u00d8\5D#\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\7\37\2\2\u00da#\3\2\2\2\u00db\u00dc\7\20\2"+
		"\2\u00dc\u00dd\7&\2\2\u00dd\u00de\5D#\2\u00de\u00df\7!\2\2\u00df\u00e0"+
		"\5D#\2\u00e0\u00e1\7\'\2\2\u00e1\u00e2\7\37\2\2\u00e2%\3\2\2\2\u00e3\u00e8"+
		"\7-\2\2\u00e4\u00e8\7.\2\2\u00e5\u00e8\7,\2\2\u00e6\u00e8\5\60\31\2\u00e7"+
		"\u00e3\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8\u00f2\3\2\2\2\u00e9\u00ee\7\36\2\2\u00ea\u00ef\7-\2\2\u00eb"+
		"\u00ef\7.\2\2\u00ec\u00ef\7,\2\2\u00ed\u00ef\5\60\31\2\u00ee\u00ea\3\2"+
		"\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00e9\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\'\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8"+
		"\7,\2\2\u00f6\u00f8\5\60\31\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2"+
		"\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7*\2\2\u00fa\u00fb\5*\26\2\u00fb\u00fc"+
		"\7+\2\2\u00fc)\3\2\2\2\u00fd\u0104\7.\2\2\u00fe\u0104\5,\27\2\u00ff\u0104"+
		"\5.\30\2\u0100\u0101\7.\2\2\u0101\u0102\7 \2\2\u0102\u0104\7.\2\2\u0103"+
		"\u00fd\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2"+
		"\2\2\u0104+\3\2\2\2\u0105\u0106\7 \2\2\u0106\u0107\7.\2\2\u0107-\3\2\2"+
		"\2\u0108\u0109\7.\2\2\u0109\u010a\7 \2\2\u010a/\3\2\2\2\u010b\u010c\7"+
		"$\2\2\u010c\u010d\7,\2\2\u010d\61\3\2\2\2\u010e\u010f\5\60\31\2\u010f"+
		"\u0110\7\"\2\2\u0110\u0111\7-\2\2\u0111\63\3\2\2\2\u0112\u0113\7\13\2"+
		"\2\u0113\u0114\7,\2\2\u0114\u0116\7(\2\2\u0115\u0117\5\66\34\2\u0116\u0115"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\58\35\2\u0119"+
		"\u011a\7)\2\2\u011a\65\3\2\2\2\u011b\u011c\7\b\2\2\u011c\u011d\5:\36\2"+
		"\u011d\67\3\2\2\2\u011e\u011f\7\t\2\2\u011f\u0120\5:\36\2\u01209\3\2\2"+
		"\2\u0121\u0125\7(\2\2\u0122\u0124\5<\37\2\u0123\u0122\3\2\2\2\u0124\u0127"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u0129\7)\2\2\u0129;\3\2\2\2\u012a\u0130\5> \2\u012b"+
		"\u0130\5F$\2\u012c\u0130\5\36\20\2\u012d\u0130\5H%\2\u012e\u0130\5J&\2"+
		"\u012f\u012a\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012c\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u012f\u012e\3\2\2\2\u0130=\3\2\2\2\u0131\u0132\7\6\2\2\u0132"+
		"\u0133\7&\2\2\u0133\u0134\5B\"\2\u0134\u0135\7\'\2\2\u0135\u0137\5:\36"+
		"\2\u0136\u0138\5@!\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138?\3"+
		"\2\2\2\u0139\u013a\7\7\2\2\u013a\u013b\5:\36\2\u013bA\3\2\2\2\u013c\u0142"+
		"\7\33\2\2\u013d\u013e\5D#\2\u013e\u013f\t\2\2\2\u013f\u0140\5D#\2\u0140"+
		"\u0142\3\2\2\2\u0141\u013c\3\2\2\2\u0141\u013d\3\2\2\2\u0142C\3\2\2\2"+
		"\u0143\u0148\7,\2\2\u0144\u0148\5&\24\2\u0145\u0148\5(\25\2\u0146\u0148"+
		"\5\60\31\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u0147\u0146\3\2\2\2\u0148E\3\2\2\2\u0149\u014a\7\5\2\2\u014a\u014b\7"+
		",\2\2\u014b\u014c\7\"\2\2\u014c\u014d\5&\24\2\u014d\u014e\7\37\2\2\u014e"+
		"G\3\2\2\2\u014f\u0152\7\3\2\2\u0150\u0153\7,\2\2\u0151\u0153\5\60\31\2"+
		"\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155"+
		"\7\37\2\2\u0155I\3\2\2\2\u0156\u0159\7\4\2\2\u0157\u015a\7,\2\2\u0158"+
		"\u015a\5\60\31\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3"+
		"\2\2\2\u015b\u015c\7\37\2\2\u015cK\3\2\2\2\u015d\u015e\7\n\2\2\u015e\u015f"+
		"\7,\2\2\u015f\u0160\5N(\2\u0160\u0161\7\37\2\2\u0161M\3\2\2\2\u0162\u0163"+
		"\7&\2\2\u0163\u0168\7-\2\2\u0164\u0165\7!\2\2\u0165\u0167\5\62\32\2\u0166"+
		"\u0164\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7\'\2\2\u016c"+
		"O\3\2\2\2\37_al\177\u0081\u008e\u009a\u009e\u00a3\u00a5\u00b3\u00bd\u00ca"+
		"\u00cc\u00d7\u00e7\u00ee\u00f2\u00f7\u0103\u0116\u0125\u012f\u0137\u0141"+
		"\u0147\u0152\u0159\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}