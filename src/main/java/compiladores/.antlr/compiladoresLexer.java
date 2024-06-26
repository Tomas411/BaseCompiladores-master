// Generated from /home/tomas411/Documentos/Facu/TC/BaseCompiladores-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class compiladoresLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "NUMERO", "COMILLA", "INT", "DOUBLE", "VOID", "CHAR", 
			"PYC", "IGUAL", "COMA", "PA", "PB", "LA", "LB", "IF", "ELSE", "WHILE", 
			"FOR", "RETURN", "PUNTO", "FLOTANTE", "CARACTER", "ADD_OP", "SUB_OP", 
			"MUL_OP", "DIV_OP", "MOD_OP", "AND_OP", "OR_OP", "NOT_OP", "EQ_OP", "NEQ_OP", 
			"LT_OP", "GT_OP", "LTE_OP", "GTE_OP", "INC_OP", "DEC_OP", "ID", "WS"
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


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

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
		"\u0004\u0000\'\u00e3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0004\u0002Y\b\u0002\u000b\u0002\f\u0002Z\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0004\u0016\u00a3\b\u0016\u000b\u0016\f\u0016\u00a4\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u00d3\b\'"+
		"\u0001\'\u0001\'\u0001\'\u0005\'\u00d8\b\'\n\'\f\'\u00db\t\'\u0001(\u0004"+
		"(\u00de\b(\u000b(\f(\u00df\u0001(\u0001(\u0000\u0000)\u0001\u0000\u0003"+
		"\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006"+
		"\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f"+
		"\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u00161\u0017"+
		"3\u00185\u00197\u001a9\u001b;\u001c=\u001d?\u001eA\u001fC E!G\"I#K$M%"+
		"O&Q\'\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n"+
		"\r\r  \u00e7\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0001S\u0001"+
		"\u0000\u0000\u0000\u0003U\u0001\u0000\u0000\u0000\u0005X\u0001\u0000\u0000"+
		"\u0000\u0007\\\u0001\u0000\u0000\u0000\t^\u0001\u0000\u0000\u0000\u000b"+
		"b\u0001\u0000\u0000\u0000\ri\u0001\u0000\u0000\u0000\u000fn\u0001\u0000"+
		"\u0000\u0000\u0011s\u0001\u0000\u0000\u0000\u0013u\u0001\u0000\u0000\u0000"+
		"\u0015w\u0001\u0000\u0000\u0000\u0017y\u0001\u0000\u0000\u0000\u0019{"+
		"\u0001\u0000\u0000\u0000\u001b}\u0001\u0000\u0000\u0000\u001d\u007f\u0001"+
		"\u0000\u0000\u0000\u001f\u0081\u0001\u0000\u0000\u0000!\u0084\u0001\u0000"+
		"\u0000\u0000#\u0089\u0001\u0000\u0000\u0000%\u008f\u0001\u0000\u0000\u0000"+
		"\'\u0093\u0001\u0000\u0000\u0000)\u009a\u0001\u0000\u0000\u0000+\u009c"+
		"\u0001\u0000\u0000\u0000-\u00a0\u0001\u0000\u0000\u0000/\u00a8\u0001\u0000"+
		"\u0000\u00001\u00aa\u0001\u0000\u0000\u00003\u00ac\u0001\u0000\u0000\u0000"+
		"5\u00ae\u0001\u0000\u0000\u00007\u00b0\u0001\u0000\u0000\u00009\u00b2"+
		"\u0001\u0000\u0000\u0000;\u00b5\u0001\u0000\u0000\u0000=\u00b8\u0001\u0000"+
		"\u0000\u0000?\u00ba\u0001\u0000\u0000\u0000A\u00bd\u0001\u0000\u0000\u0000"+
		"C\u00c0\u0001\u0000\u0000\u0000E\u00c2\u0001\u0000\u0000\u0000G\u00c4"+
		"\u0001\u0000\u0000\u0000I\u00c7\u0001\u0000\u0000\u0000K\u00ca\u0001\u0000"+
		"\u0000\u0000M\u00cd\u0001\u0000\u0000\u0000O\u00d2\u0001\u0000\u0000\u0000"+
		"Q\u00dd\u0001\u0000\u0000\u0000ST\u0007\u0000\u0000\u0000T\u0002\u0001"+
		"\u0000\u0000\u0000UV\u0007\u0001\u0000\u0000V\u0004\u0001\u0000\u0000"+
		"\u0000WY\u0003\u0003\u0001\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0006"+
		"\u0001\u0000\u0000\u0000\\]\u0005\'\u0000\u0000]\b\u0001\u0000\u0000\u0000"+
		"^_\u0005i\u0000\u0000_`\u0005n\u0000\u0000`a\u0005t\u0000\u0000a\n\u0001"+
		"\u0000\u0000\u0000bc\u0005d\u0000\u0000cd\u0005o\u0000\u0000de\u0005u"+
		"\u0000\u0000ef\u0005b\u0000\u0000fg\u0005l\u0000\u0000gh\u0005e\u0000"+
		"\u0000h\f\u0001\u0000\u0000\u0000ij\u0005v\u0000\u0000jk\u0005o\u0000"+
		"\u0000kl\u0005i\u0000\u0000lm\u0005d\u0000\u0000m\u000e\u0001\u0000\u0000"+
		"\u0000no\u0005c\u0000\u0000op\u0005h\u0000\u0000pq\u0005a\u0000\u0000"+
		"qr\u0005r\u0000\u0000r\u0010\u0001\u0000\u0000\u0000st\u0005;\u0000\u0000"+
		"t\u0012\u0001\u0000\u0000\u0000uv\u0005=\u0000\u0000v\u0014\u0001\u0000"+
		"\u0000\u0000wx\u0005,\u0000\u0000x\u0016\u0001\u0000\u0000\u0000yz\u0005"+
		"(\u0000\u0000z\u0018\u0001\u0000\u0000\u0000{|\u0005)\u0000\u0000|\u001a"+
		"\u0001\u0000\u0000\u0000}~\u0005{\u0000\u0000~\u001c\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005}\u0000\u0000\u0080\u001e\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005i\u0000\u0000\u0082\u0083\u0005f\u0000\u0000\u0083 "+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u0086\u0005"+
		"l\u0000\u0000\u0086\u0087\u0005s\u0000\u0000\u0087\u0088\u0005e\u0000"+
		"\u0000\u0088\"\u0001\u0000\u0000\u0000\u0089\u008a\u0005w\u0000\u0000"+
		"\u008a\u008b\u0005h\u0000\u0000\u008b\u008c\u0005i\u0000\u0000\u008c\u008d"+
		"\u0005l\u0000\u0000\u008d\u008e\u0005e\u0000\u0000\u008e$\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005f\u0000\u0000\u0090\u0091\u0005o\u0000\u0000"+
		"\u0091\u0092\u0005r\u0000\u0000\u0092&\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005r\u0000\u0000\u0094\u0095\u0005e\u0000\u0000\u0095\u0096\u0005t"+
		"\u0000\u0000\u0096\u0097\u0005u\u0000\u0000\u0097\u0098\u0005r\u0000\u0000"+
		"\u0098\u0099\u0005n\u0000\u0000\u0099(\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0005.\u0000\u0000\u009b*\u0001\u0000\u0000\u0000\u009c\u009d\u0003\u0005"+
		"\u0002\u0000\u009d\u009e\u0003)\u0014\u0000\u009e\u009f\u0003\u0005\u0002"+
		"\u0000\u009f,\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\u0007\u0003\u0000"+
		"\u00a1\u00a3\u0003\u0001\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0003\u0007\u0003\u0000\u00a7.\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005+\u0000\u0000\u00a90\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"-\u0000\u0000\u00ab2\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005*\u0000"+
		"\u0000\u00ad4\u0001\u0000\u0000\u0000\u00ae\u00af\u0005/\u0000\u0000\u00af"+
		"6\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005%\u0000\u0000\u00b18\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005&\u0000\u0000\u00b3\u00b4\u0005&\u0000"+
		"\u0000\u00b4:\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005|\u0000\u0000\u00b6"+
		"\u00b7\u0005|\u0000\u0000\u00b7<\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"!\u0000\u0000\u00b9>\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005=\u0000"+
		"\u0000\u00bb\u00bc\u0005=\u0000\u0000\u00bc@\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005!\u0000\u0000\u00be\u00bf\u0005=\u0000\u0000\u00bfB\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005<\u0000\u0000\u00c1D\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005>\u0000\u0000\u00c3F\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005<\u0000\u0000\u00c5\u00c6\u0005=\u0000\u0000\u00c6H\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005>\u0000\u0000\u00c8\u00c9\u0005=\u0000"+
		"\u0000\u00c9J\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005+\u0000\u0000\u00cb"+
		"\u00cc\u0005+\u0000\u0000\u00ccL\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"-\u0000\u0000\u00ce\u00cf\u0005-\u0000\u0000\u00cfN\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d3\u0003\u0001\u0000\u0000\u00d1\u00d3\u0005_\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d9\u0001\u0000\u0000\u0000\u00d4\u00d8\u0003\u0001\u0000\u0000"+
		"\u00d5\u00d8\u0003\u0003\u0001\u0000\u00d6\u00d8\u0005_\u0000\u0000\u00d7"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"P\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00de"+
		"\u0007\u0002\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0006(\u0000\u0000\u00e2R\u0001\u0000\u0000\u0000\u0007\u0000Z\u00a4"+
		"\u00d2\u00d7\u00d9\u00df\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}