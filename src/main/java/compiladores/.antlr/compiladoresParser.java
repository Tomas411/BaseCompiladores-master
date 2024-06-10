// Generated from /home/tomas411/Documentos/Facu/TC/BaseCompiladores-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

package compiladores;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class compiladoresParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERO=1, COMILLA=2, INT=3, DOUBLE=4, VOID=5, CHAR=6, PYC=7, IGUAL=8, 
		COMA=9, PA=10, PB=11, LA=12, LB=13, IF=14, ELSE=15, WHILE=16, FOR=17, 
		RETURN=18, PUNTO=19, FLOTANTE=20, CARACTER=21, ADD_OP=22, SUB_OP=23, MUL_OP=24, 
		DIV_OP=25, MOD_OP=26, AND_OP=27, OR_OP=28, NOT_OP=29, EQ_OP=30, NEQ_OP=31, 
		LT_OP=32, GT_OP=33, LTE_OP=34, GTE_OP=35, INC_OP=36, DEC_OP=37, ID=38, 
		WS=39;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_parametros = 3, 
		RULE_parametro = 4, RULE_mas_parametros = 5, RULE_declaracion = 6, RULE_declaracion_continua = 7, 
		RULE_tipo = 8, RULE_asignacion = 9, RULE_mas_asignaciones = 10, RULE_expresion = 11, 
		RULE_op_expresion = 12, RULE_oal = 13, RULE_llamada_funcion = 14, RULE_argumentos = 15, 
		RULE_mas_argumentos = 16, RULE_bloque = 17, RULE_if = 18, RULE_else_bloque = 19, 
		RULE_while = 20, RULE_for = 21, RULE_for_continua = 22, RULE_retorno = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "parametros", "parametro", 
			"mas_parametros", "declaracion", "declaracion_continua", "tipo", "asignacion", 
			"mas_asignaciones", "expresion", "op_expresion", "oal", "llamada_funcion", 
			"argumentos", "mas_argumentos", "bloque", "if", "else_bloque", "while", 
			"for", "for_continua", "retorno"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'''", "'int'", "'double'", "'void'", "'char'", "';'", "'='", 
			"','", "'('", "')'", "'{'", "'}'", "'if'", "'else'", "'while'", "'for'", 
			"'return'", "'.'", null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", 
			"'||'", "'!'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'++'", 
			"'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMERO", "COMILLA", "INT", "DOUBLE", "VOID", "CHAR", "PYC", "IGUAL", 
			"COMA", "PA", "PB", "LA", "LB", "IF", "ELSE", "WHILE", "FOR", "RETURN", 
			"PUNTO", "FLOTANTE", "CARACTER", "ADD_OP", "SUB_OP", "MUL_OP", "DIV_OP", 
			"MOD_OP", "AND_OP", "OR_OP", "NOT_OP", "EQ_OP", "NEQ_OP", "LT_OP", "GT_OP", 
			"LTE_OP", "GTE_OP", "INC_OP", "DEC_OP", "ID", "WS"
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
	public String getGrammarFileName() { return "compiladores.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compiladoresParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compiladoresParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			instrucciones();
			setState(49);
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
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitInstrucciones(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case INT:
			case DOUBLE:
			case VOID:
			case CHAR:
			case PYC:
			case IGUAL:
			case COMA:
			case PA:
			case LA:
			case IF:
			case WHILE:
			case FOR:
			case RETURN:
			case FLOTANTE:
			case CARACTER:
			case ADD_OP:
			case SUB_OP:
			case MUL_OP:
			case DIV_OP:
			case MOD_OP:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				instruccion();
				setState(52);
				instrucciones();
				}
				break;
			case EOF:
			case LB:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(ID);
				setState(59);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				expresion();
				setState(61);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				while_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				if_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				for_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				llamada_funcion();
				setState(67);
				match(PYC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				bloque();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				retorno();
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
	public static class ParametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Mas_parametrosContext mas_parametros() {
			return getRuleContext(Mas_parametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametros);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case VOID:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				parametro();
				setState(74);
				mas_parametros();
				}
				break;
			case PYC:
			case IGUAL:
			case COMA:
			case PA:
			case PB:
			case ADD_OP:
			case SUB_OP:
			case MUL_OP:
			case DIV_OP:
			case MOD_OP:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			tipo();
			setState(80);
			match(ID);
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
	public static class Mas_parametrosContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Mas_parametrosContext mas_parametros() {
			return getRuleContext(Mas_parametrosContext.class,0);
		}
		public Mas_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterMas_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitMas_parametros(this);
		}
	}

	public final Mas_parametrosContext mas_parametros() throws RecognitionException {
		Mas_parametrosContext _localctx = new Mas_parametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mas_parametros);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(COMA);
				setState(83);
				parametro();
				setState(84);
				mas_parametros();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class DeclaracionContext extends ParserRuleContext {
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Declaracion_continuaContext declaracion_continua() {
			return getRuleContext(Declaracion_continuaContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			parametros();
			setState(90);
			declaracion_continua();
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
	public static class Declaracion_continuaContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PB() { return getToken(compiladoresParser.PB, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Declaracion_continuaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_continua; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterDeclaracion_continua(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitDeclaracion_continua(this);
		}
	}

	public final Declaracion_continuaContext declaracion_continua() throws RecognitionException {
		Declaracion_continuaContext _localctx = new Declaracion_continuaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion_continua);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(PA);
				setState(95);
				parametros();
				setState(96);
				match(PB);
				setState(97);
				bloque();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(PA);
				setState(100);
				parametros();
				setState(101);
				match(PB);
				setState(102);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				match(COMA);
				setState(105);
				match(ID);
				setState(106);
				declaracion();
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(compiladoresParser.DOUBLE, 0); }
		public TerminalNode VOID() { return getToken(compiladoresParser.VOID, 0); }
		public TerminalNode CHAR() { return getToken(compiladoresParser.CHAR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) ) {
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(compiladoresParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Mas_asignacionesContext mas_asignaciones() {
			return getRuleContext(Mas_asignacionesContext.class,0);
		}
		public TerminalNode ADD_OP() { return getToken(compiladoresParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(compiladoresParser.SUB_OP, 0); }
		public TerminalNode MUL_OP() { return getToken(compiladoresParser.MUL_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(compiladoresParser.DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(compiladoresParser.MOD_OP, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignacion);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(IGUAL);
				setState(112);
				expresion();
				setState(113);
				mas_asignaciones();
				}
				break;
			case ADD_OP:
			case SUB_OP:
			case MUL_OP:
			case DIV_OP:
			case MOD_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 130023424L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				match(IGUAL);
				setState(117);
				expresion();
				setState(118);
				mas_asignaciones();
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
	public static class Mas_asignacionesContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Mas_asignacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_asignaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterMas_asignaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitMas_asignaciones(this);
		}
	}

	public final Mas_asignacionesContext mas_asignaciones() throws RecognitionException {
		Mas_asignacionesContext _localctx = new Mas_asignacionesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mas_asignaciones);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(PYC);
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(COMA);
				setState(124);
				asignacion();
				}
				break;
			case IGUAL:
			case ADD_OP:
			case SUB_OP:
			case MUL_OP:
			case DIV_OP:
			case MOD_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				asignacion();
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
	public static class ExpresionContext extends ParserRuleContext {
		public OalContext oal() {
			return getRuleContext(OalContext.class,0);
		}
		public Op_expresionContext op_expresion() {
			return getRuleContext(Op_expresionContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			oal();
			setState(129);
			op_expresion();
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
	public static class Op_expresionContext extends ParserRuleContext {
		public OalContext oal() {
			return getRuleContext(OalContext.class,0);
		}
		public Op_expresionContext op_expresion() {
			return getRuleContext(Op_expresionContext.class,0);
		}
		public TerminalNode ADD_OP() { return getToken(compiladoresParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(compiladoresParser.SUB_OP, 0); }
		public TerminalNode MUL_OP() { return getToken(compiladoresParser.MUL_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(compiladoresParser.DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(compiladoresParser.MOD_OP, 0); }
		public TerminalNode AND_OP() { return getToken(compiladoresParser.AND_OP, 0); }
		public TerminalNode OR_OP() { return getToken(compiladoresParser.OR_OP, 0); }
		public TerminalNode EQ_OP() { return getToken(compiladoresParser.EQ_OP, 0); }
		public TerminalNode NEQ_OP() { return getToken(compiladoresParser.NEQ_OP, 0); }
		public TerminalNode LT_OP() { return getToken(compiladoresParser.LT_OP, 0); }
		public TerminalNode GT_OP() { return getToken(compiladoresParser.GT_OP, 0); }
		public TerminalNode LTE_OP() { return getToken(compiladoresParser.LTE_OP, 0); }
		public TerminalNode GTE_OP() { return getToken(compiladoresParser.GTE_OP, 0); }
		public TerminalNode INC_OP() { return getToken(compiladoresParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(compiladoresParser.DEC_OP, 0); }
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Op_expresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterOp_expresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitOp_expresion(this);
		}
	}

	public final Op_expresionContext op_expresion() throws RecognitionException {
		Op_expresionContext _localctx = new Op_expresionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op_expresion);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68178411520L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				oal();
				setState(133);
				op_expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(INC_OP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(DEC_OP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(COMA);
				setState(138);
				expresion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
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
	public static class OalContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(compiladoresParser.FLOTANTE, 0); }
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode CARACTER() { return getToken(compiladoresParser.CARACTER, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public OalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterOal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitOal(this);
		}
	}

	public final OalContext oal() throws RecognitionException {
		OalContext _localctx = new OalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_oal);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(NUMERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(FLOTANTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(CARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				llamada_funcion();
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
	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PB() { return getToken(compiladoresParser.PB, 0); }
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitLlamada_funcion(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_llamada_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			setState(150);
			match(PA);
			setState(151);
			argumentos();
			setState(152);
			match(PB);
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
	public static class ArgumentosContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Mas_argumentosContext mas_argumentos() {
			return getRuleContext(Mas_argumentosContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argumentos);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case FLOTANTE:
			case CARACTER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				expresion();
				setState(155);
				mas_argumentos();
				}
				break;
			case PB:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class Mas_argumentosContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Mas_argumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterMas_argumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitMas_argumentos(this);
		}
	}

	public final Mas_argumentosContext mas_argumentos() throws RecognitionException {
		Mas_argumentosContext _localctx = new Mas_argumentosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mas_argumentos);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(COMA);
				setState(161);
				argumentos();
				}
				break;
			case PB:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(compiladoresParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LB() { return getToken(compiladoresParser.LB, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(LA);
			setState(166);
			instrucciones();
			setState(167);
			match(LB);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(compiladoresParser.IF, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PB() { return getToken(compiladoresParser.PB, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Else_bloqueContext else_bloque() {
			return getRuleContext(Else_bloqueContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(IF);
			setState(170);
			match(PA);
			setState(171);
			expresion();
			setState(172);
			match(PB);
			setState(173);
			bloque();
			setState(174);
			else_bloque();
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
	public static class Else_bloqueContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(compiladoresParser.ELSE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Else_bloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterElse_bloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitElse_bloque(this);
		}
	}

	public final Else_bloqueContext else_bloque() throws RecognitionException {
		Else_bloqueContext _localctx = new Else_bloqueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_else_bloque);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(ELSE);
				setState(177);
				bloque();
				}
				break;
			case EOF:
			case NUMERO:
			case INT:
			case DOUBLE:
			case VOID:
			case CHAR:
			case PYC:
			case IGUAL:
			case COMA:
			case PA:
			case LA:
			case LB:
			case IF:
			case WHILE:
			case FOR:
			case RETURN:
			case FLOTANTE:
			case CARACTER:
			case ADD_OP:
			case SUB_OP:
			case MUL_OP:
			case DIV_OP:
			case MOD_OP:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(compiladoresParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PB() { return getToken(compiladoresParser.PB, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WHILE);
			setState(182);
			match(PA);
			setState(183);
			expresion();
			setState(184);
			match(PB);
			setState(185);
			bloque();
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(compiladoresParser.FOR, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public List<For_continuaContext> for_continua() {
			return getRuleContexts(For_continuaContext.class);
		}
		public For_continuaContext for_continua(int i) {
			return getRuleContext(For_continuaContext.class,i);
		}
		public TerminalNode PB() { return getToken(compiladoresParser.PB, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitFor(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(FOR);
			setState(188);
			match(PA);
			setState(189);
			for_continua();
			setState(190);
			for_continua();
			setState(191);
			for_continua();
			setState(192);
			match(PB);
			setState(193);
			bloque();
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
	public static class For_continuaContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public For_continuaContext for_continua() {
			return getRuleContext(For_continuaContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public TerminalNode PB() { return getToken(compiladoresParser.PB, 0); }
		public For_continuaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_continua; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterFor_continua(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitFor_continua(this);
		}
	}

	public final For_continuaContext for_continua() throws RecognitionException {
		For_continuaContext _localctx = new For_continuaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_for_continua);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				declaracion();
				setState(196);
				for_continua();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				expresion();
				setState(199);
				for_continua();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(COMA);
				setState(202);
				for_continua();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				match(PB);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
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
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(compiladoresParser.RETURN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_retorno);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(RETURN);
				setState(209);
				expresion();
				setState(210);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(RETURN);
				setState(213);
				match(PYC);
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
		"\u0004\u0001\'\u00d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"8\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003N\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005X\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007l\b\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\ty\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u007f\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u008d\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0094\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u009f\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00a4\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00b4\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00cf\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00d7\b\u0017\u0001\u0017\u0000\u0000"+
		"\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.\u0000\u0003\u0001\u0000\u0003\u0006\u0001"+
		"\u0000\u0016\u001a\u0002\u0000\u0016\u001c\u001e#\u00e3\u00000\u0001\u0000"+
		"\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000"+
		"\u0006M\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000\nW\u0001\u0000"+
		"\u0000\u0000\fY\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000"+
		"\u0010m\u0001\u0000\u0000\u0000\u0012x\u0001\u0000\u0000\u0000\u0014~"+
		"\u0001\u0000\u0000\u0000\u0016\u0080\u0001\u0000\u0000\u0000\u0018\u008c"+
		"\u0001\u0000\u0000\u0000\u001a\u0093\u0001\u0000\u0000\u0000\u001c\u0095"+
		"\u0001\u0000\u0000\u0000\u001e\u009e\u0001\u0000\u0000\u0000 \u00a3\u0001"+
		"\u0000\u0000\u0000\"\u00a5\u0001\u0000\u0000\u0000$\u00a9\u0001\u0000"+
		"\u0000\u0000&\u00b3\u0001\u0000\u0000\u0000(\u00b5\u0001\u0000\u0000\u0000"+
		"*\u00bb\u0001\u0000\u0000\u0000,\u00ce\u0001\u0000\u0000\u0000.\u00d6"+
		"\u0001\u0000\u0000\u000001\u0003\u0002\u0001\u000012\u0005\u0000\u0000"+
		"\u00012\u0001\u0001\u0000\u0000\u000034\u0003\u0004\u0002\u000045\u0003"+
		"\u0002\u0001\u000058\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u0000"+
		"73\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008\u0003\u0001\u0000"+
		"\u0000\u00009H\u0003\f\u0006\u0000:;\u0005&\u0000\u0000;H\u0003\u0012"+
		"\t\u0000<=\u0003\u0016\u000b\u0000=>\u0005\u0007\u0000\u0000>H\u0001\u0000"+
		"\u0000\u0000?H\u0003(\u0014\u0000@H\u0003$\u0012\u0000AH\u0003*\u0015"+
		"\u0000BC\u0003\u001c\u000e\u0000CD\u0005\u0007\u0000\u0000DH\u0001\u0000"+
		"\u0000\u0000EH\u0003\"\u0011\u0000FH\u0003.\u0017\u0000G9\u0001\u0000"+
		"\u0000\u0000G:\u0001\u0000\u0000\u0000G<\u0001\u0000\u0000\u0000G?\u0001"+
		"\u0000\u0000\u0000G@\u0001\u0000\u0000\u0000GA\u0001\u0000\u0000\u0000"+
		"GB\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000"+
		"\u0000H\u0005\u0001\u0000\u0000\u0000IJ\u0003\b\u0004\u0000JK\u0003\n"+
		"\u0005\u0000KN\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MI\u0001"+
		"\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000N\u0007\u0001\u0000\u0000"+
		"\u0000OP\u0003\u0010\b\u0000PQ\u0005&\u0000\u0000Q\t\u0001\u0000\u0000"+
		"\u0000RS\u0005\t\u0000\u0000ST\u0003\b\u0004\u0000TU\u0003\n\u0005\u0000"+
		"UX\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WR\u0001\u0000\u0000"+
		"\u0000WV\u0001\u0000\u0000\u0000X\u000b\u0001\u0000\u0000\u0000YZ\u0003"+
		"\u0006\u0003\u0000Z[\u0003\u000e\u0007\u0000[\r\u0001\u0000\u0000\u0000"+
		"\\l\u0005\u0007\u0000\u0000]l\u0003\u0012\t\u0000^_\u0005\n\u0000\u0000"+
		"_`\u0003\u0006\u0003\u0000`a\u0005\u000b\u0000\u0000ab\u0003\"\u0011\u0000"+
		"bl\u0001\u0000\u0000\u0000cd\u0005\n\u0000\u0000de\u0003\u0006\u0003\u0000"+
		"ef\u0005\u000b\u0000\u0000fg\u0005\u0007\u0000\u0000gl\u0001\u0000\u0000"+
		"\u0000hi\u0005\t\u0000\u0000ij\u0005&\u0000\u0000jl\u0003\f\u0006\u0000"+
		"k\\\u0001\u0000\u0000\u0000k]\u0001\u0000\u0000\u0000k^\u0001\u0000\u0000"+
		"\u0000kc\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000l\u000f\u0001"+
		"\u0000\u0000\u0000mn\u0007\u0000\u0000\u0000n\u0011\u0001\u0000\u0000"+
		"\u0000op\u0005\b\u0000\u0000pq\u0003\u0016\u000b\u0000qr\u0003\u0014\n"+
		"\u0000ry\u0001\u0000\u0000\u0000st\u0007\u0001\u0000\u0000tu\u0005\b\u0000"+
		"\u0000uv\u0003\u0016\u000b\u0000vw\u0003\u0014\n\u0000wy\u0001\u0000\u0000"+
		"\u0000xo\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000y\u0013\u0001"+
		"\u0000\u0000\u0000z\u007f\u0005\u0007\u0000\u0000{|\u0005\t\u0000\u0000"+
		"|\u007f\u0003\u0012\t\u0000}\u007f\u0003\u0012\t\u0000~z\u0001\u0000\u0000"+
		"\u0000~{\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0015"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0003\u001a\r\u0000\u0081\u0082\u0003"+
		"\u0018\f\u0000\u0082\u0017\u0001\u0000\u0000\u0000\u0083\u0084\u0007\u0002"+
		"\u0000\u0000\u0084\u0085\u0003\u001a\r\u0000\u0085\u0086\u0003\u0018\f"+
		"\u0000\u0086\u008d\u0001\u0000\u0000\u0000\u0087\u008d\u0005$\u0000\u0000"+
		"\u0088\u008d\u0005%\u0000\u0000\u0089\u008a\u0005\t\u0000\u0000\u008a"+
		"\u008d\u0003\u0016\u000b\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c"+
		"\u0083\u0001\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008c"+
		"\u0088\u0001\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u0019\u0001\u0000\u0000\u0000\u008e"+
		"\u0094\u0005\u0001\u0000\u0000\u008f\u0094\u0005\u0014\u0000\u0000\u0090"+
		"\u0094\u0005&\u0000\u0000\u0091\u0094\u0005\u0015\u0000\u0000\u0092\u0094"+
		"\u0003\u001c\u000e\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u008f"+
		"\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u001b"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005&\u0000\u0000\u0096\u0097\u0005"+
		"\n\u0000\u0000\u0097\u0098\u0003\u001e\u000f\u0000\u0098\u0099\u0005\u000b"+
		"\u0000\u0000\u0099\u001d\u0001\u0000\u0000\u0000\u009a\u009b\u0003\u0016"+
		"\u000b\u0000\u009b\u009c\u0003 \u0010\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009a\u0001\u0000\u0000"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u001f\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005\t\u0000\u0000\u00a1\u00a4\u0003\u001e\u000f\u0000"+
		"\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4!\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\f\u0000\u0000\u00a6\u00a7\u0003\u0002\u0001\u0000\u00a7\u00a8"+
		"\u0005\r\u0000\u0000\u00a8#\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"\u000e\u0000\u0000\u00aa\u00ab\u0005\n\u0000\u0000\u00ab\u00ac\u0003\u0016"+
		"\u000b\u0000\u00ac\u00ad\u0005\u000b\u0000\u0000\u00ad\u00ae\u0003\"\u0011"+
		"\u0000\u00ae\u00af\u0003&\u0013\u0000\u00af%\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005\u000f\u0000\u0000\u00b1\u00b4\u0003\"\u0011\u0000\u00b2\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\'\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0010\u0000\u0000\u00b6\u00b7\u0005\n\u0000\u0000\u00b7\u00b8\u0003\u0016"+
		"\u000b\u0000\u00b8\u00b9\u0005\u000b\u0000\u0000\u00b9\u00ba\u0003\"\u0011"+
		"\u0000\u00ba)\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0011\u0000\u0000"+
		"\u00bc\u00bd\u0005\n\u0000\u0000\u00bd\u00be\u0003,\u0016\u0000\u00be"+
		"\u00bf\u0003,\u0016\u0000\u00bf\u00c0\u0003,\u0016\u0000\u00c0\u00c1\u0005"+
		"\u000b\u0000\u0000\u00c1\u00c2\u0003\"\u0011\u0000\u00c2+\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0003\f\u0006\u0000\u00c4\u00c5\u0003,\u0016"+
		"\u0000\u00c5\u00cf\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\u0016\u000b"+
		"\u0000\u00c7\u00c8\u0003,\u0016\u0000\u00c8\u00cf\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005\t\u0000\u0000\u00ca\u00cf\u0003,\u0016\u0000\u00cb"+
		"\u00cf\u0005\u0007\u0000\u0000\u00cc\u00cf\u0005\u000b\u0000\u0000\u00cd"+
		"\u00cf\u0001\u0000\u0000\u0000\u00ce\u00c3\u0001\u0000\u0000\u0000\u00ce"+
		"\u00c6\u0001\u0000\u0000\u0000\u00ce\u00c9\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf-\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0005\u0012\u0000\u0000\u00d1\u00d2\u0003\u0016\u000b\u0000\u00d2\u00d3"+
		"\u0005\u0007\u0000\u0000\u00d3\u00d7\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0005\u0012\u0000\u0000\u00d5\u00d7\u0005\u0007\u0000\u0000\u00d6\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7/\u0001"+
		"\u0000\u0000\u0000\u000e7GMWkx~\u008c\u0093\u009e\u00a3\u00b3\u00ce\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}