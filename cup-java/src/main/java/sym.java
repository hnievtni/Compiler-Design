
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int SHORT = 7;
  public static final int IDENTIFIER = 102;
  public static final int TIMES = 69;
  public static final int ANDEQ = 94;
  public static final int GT = 74;
  public static final int IMPLEMENTS = 39;
  public static final int CONST = 105;
  public static final int STRICTFP = 104;
  public static final int NOTEQ = 79;
  public static final int PLUSEQ = 89;
  public static final int RBRACK = 14;
  public static final int CATCH = 58;
  public static final int COMMA = 18;
  public static final int RBRACE = 20;
  public static final int THROW = 56;
  public static final int RPAREN = 23;
  public static final int LBRACK = 13;
  public static final int LT = 73;
  public static final int ANDAND = 83;
  public static final int OROR = 84;
  public static final int DOUBLE = 12;
  public static final int LBRACE = 19;
  public static final int TRANSIENT = 35;
  public static final int LPAREN = 22;
  public static final int XOREQ = 95;
  public static final int PROTECTED = 28;
  public static final int INTEGER_LITERAL = 97;
  public static final int NOT = 66;
  public static final int FINAL = 32;
  public static final int FLOAT = 11;
  public static final int GOTO = 106;
  public static final int URSHIFTEQ = 93;
  public static final int PACKAGE = 25;
  public static final int COMP = 65;
  public static final int EQ = 21;
  public static final int BOOLEAN_LITERAL = 99;
  public static final int MOD = 68;
  public static final int CLASS = 37;
  public static final int SUPER = 43;
  public static final int ABSTRACT = 31;
  public static final int NATIVE = 33;
  public static final int LONG = 9;
  public static final int PLUS = 63;
  public static final int QUESTION = 85;
  public static final int WHILE = 51;
  public static final int EXTENDS = 38;
  public static final int INTERFACE = 44;
  public static final int CHAR = 10;
  public static final int BOOLEAN = 5;
  public static final int SWITCH = 47;
  public static final int DO = 50;
  public static final int FOR = 52;
  public static final int RSHIFTEQ = 92;
  public static final int VOID = 40;
  public static final int DIV = 67;
  public static final int PUBLIC = 27;
  public static final int RETURN = 55;
  public static final int MULT = 17;
  public static final int ELSE = 46;
  public static final int TRY = 57;
  public static final int GTEQ = 76;
  public static final int BREAK = 53;
  public static final int DOT = 15;
  public static final int INT = 8;
  public static final int NULL_LITERAL = 103;
  public static final int THROWS = 41;
  public static final int STRING_LITERAL = 101;
  public static final int EQEQ = 78;
  public static final int EOF = 0;
  public static final int SEMICOLON = 16;
  public static final int THIS = 42;
  public static final int DEFAULT = 49;
  public static final int MULTEQ = 86;
  public static final int IMPORT = 26;
  public static final int MAIN = 4;
  public static final int MINUS = 64;
  public static final int LTEQ = 75;
  public static final int OR = 82;
  public static final int URSHIFT = 72;
  public static final int error = 1;
  public static final int SYNCHRONIZED = 34;
  public static final int DIVEQ = 87;
  public static final int LSHIFTEQ = 91;
  public static final int FINALLY = 59;
  public static final int CONTINUE = 54;
  public static final int INSTANCEOF = 77;
  public static final int IF = 45;
  public static final int MODEQ = 88;
  public static final int MINUSMINUS = 62;
  public static final int END = 3;
  public static final int COLON = 24;
  public static final int CHARACTER_LITERAL = 100;
  public static final int OREQ = 96;
  public static final int VOLATILE = 36;
  public static final int BEGIN = 2;
  public static final int CASE = 48;
  public static final int PLUSPLUS = 61;
  public static final int NEW = 60;
  public static final int RSHIFT = 71;
  public static final int BYTE = 6;
  public static final int AND = 80;
  public static final int PRIVATE = 29;
  public static final int STATIC = 30;
  public static final int LSHIFT = 70;
  public static final int XOR = 81;
  public static final int FLOATING_POINT_LITERAL = 98;
  public static final int MINUSEQ = 90;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "BEGIN",
  "END",
  "MAIN",
  "BOOLEAN",
  "BYTE",
  "SHORT",
  "INT",
  "LONG",
  "CHAR",
  "FLOAT",
  "DOUBLE",
  "LBRACK",
  "RBRACK",
  "DOT",
  "SEMICOLON",
  "MULT",
  "COMMA",
  "LBRACE",
  "RBRACE",
  "EQ",
  "LPAREN",
  "RPAREN",
  "COLON",
  "PACKAGE",
  "IMPORT",
  "PUBLIC",
  "PROTECTED",
  "PRIVATE",
  "STATIC",
  "ABSTRACT",
  "FINAL",
  "NATIVE",
  "SYNCHRONIZED",
  "TRANSIENT",
  "VOLATILE",
  "CLASS",
  "EXTENDS",
  "IMPLEMENTS",
  "VOID",
  "THROWS",
  "THIS",
  "SUPER",
  "INTERFACE",
  "IF",
  "ELSE",
  "SWITCH",
  "CASE",
  "DEFAULT",
  "DO",
  "WHILE",
  "FOR",
  "BREAK",
  "CONTINUE",
  "RETURN",
  "THROW",
  "TRY",
  "CATCH",
  "FINALLY",
  "NEW",
  "PLUSPLUS",
  "MINUSMINUS",
  "PLUS",
  "MINUS",
  "COMP",
  "NOT",
  "DIV",
  "MOD",
  "TIMES",
  "LSHIFT",
  "RSHIFT",
  "URSHIFT",
  "LT",
  "GT",
  "LTEQ",
  "GTEQ",
  "INSTANCEOF",
  "EQEQ",
  "NOTEQ",
  "AND",
  "XOR",
  "OR",
  "ANDAND",
  "OROR",
  "QUESTION",
  "MULTEQ",
  "DIVEQ",
  "MODEQ",
  "PLUSEQ",
  "MINUSEQ",
  "LSHIFTEQ",
  "RSHIFTEQ",
  "URSHIFTEQ",
  "ANDEQ",
  "XOREQ",
  "OREQ",
  "INTEGER_LITERAL",
  "FLOATING_POINT_LITERAL",
  "BOOLEAN_LITERAL",
  "CHARACTER_LITERAL",
  "STRING_LITERAL",
  "IDENTIFIER",
  "NULL_LITERAL",
  "STRICTFP",
  "CONST",
  "GOTO"
  };
}

