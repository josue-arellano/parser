package syntaxChecker;
import java_cup.runtime.*;
import java.util.Scanner;

public class scanner {
    private enum Tokens {
        _boolean, _break, _class, _double,
        _else, _extends, _for, _if,
        _implements, _int, _interface, _new,
        _newarray, _null, _println, _readln,
        _return, _string, _void, _while,
        _plus, _minus, _multiplication, _division,
        _mod, _less, _lessequal, _greater,
        _greaterequal, _equal, _notequal, _and,
        _or, _not, _assignop, _semicolon,
        _comma, _period, _leftparen, _rightparen,
        _leftbracket, _rightbracket, _leftbrace, _rightbrace,
        _intconstant, _doubleconstant, _stringconstant, _booleanconstant, _id, EOF;
        
        private static final int OFFSET = 1000;
        
        public int getValue() { return this.ordinal() + this.OFFSET; }
    }

    /* single lookahead character */
    private static String input;
    protected static Tokens next_toke;
    protected static Scanner reader;

    /* we use a SymbolFactory to generate Symbols */
    private SymbolFactory sf = new DefaultSymbolFactory();

    public scanner(String input) {
        this.input = input;
    }

    /* advance input by one character */
    protected static void advance() throws java.io.IOException  { 
        if(reader.hasNext())
            next_toke = Tokens.valueOf(reader.next());
        else
            next_toke = Tokens.EOF;
    }

    /* initialize the scanner */
    public static void init() throws java.io.IOException { 
        reader = new Scanner(input);
        advance(); 
    }

    /* recognize and return the next complete token */
    public Symbol next_token() throws java.io.IOException
    {
        for(;;)
	    switch (next_toke)
		{
            case _boolean: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_boolean", sym._boolean);
            case _break: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_break", sym._break);
            case _class: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_class", sym._class);
            case _double: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_double", sym._double);
            case _else: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_else", sym._else);
            case _extends: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_extends", sym._extends);
            case _for: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_for", sym._for);
            case _if: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_if", sym._if);
            case _implements: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_implements", sym._implements);
            case _int: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_int", sym._int);
            case _interface: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_interface", sym._interface);
            case _new: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_new", sym._new);
            case _newarray: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_newarray", sym._newarray);
            case _null: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_null", sym._null);
            case _println: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_println", sym._println);
            case _readln: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_readln", sym._readln);
            case _return: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_return", sym._return);
            case _string: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_string", sym._string);
            case _void: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_void", sym._void);
            case _while: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_while", sym._while);
            case _plus: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_plus", sym._plus);
            case _minus: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_minus", sym._minus);
            case _multiplication: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_multiplication", sym._multiplication);
            case _division: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_division", sym._division);
            case _mod: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_mod", sym._mod);
            case _less: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_less", sym._less);
            case _lessequal: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_lessequal", sym._lessequal);
            case _greater: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_greater", sym._greater);
            case _greaterequal: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_greaterequal", sym._greaterequal);
            case _equal: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_equal", sym._equal);
            case _notequal: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_notequal", sym._notequal);
            case _and: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_and", sym._and);
            case _or: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_or", sym._or);
            case _not: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_not", sym._not);
            case _assignop: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_assignop", sym._assignop);
            case _semicolon: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_semicolon", sym._semicolon);
            case _comma: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_comma", sym._comma);
            case _period: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_period", sym._period);
            case _leftparen: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_leftparen", sym._leftparen);
            case _rightparen: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_rightparen", sym._rightparen);
            case _leftbracket: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_leftbracket", sym._leftbracket);
            case _rightbracket: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_rightbracket", sym._rightbracket);
            case _leftbrace: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_leftbrace", sym._leftbrace);
            case _rightbrace: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_rightbrace", sym._rightbrace);
            case _intconstant: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_intconstant", sym._intconstant);
            case _doubleconstant: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_doubleconstant", sym._doubleconstant);
            case _stringconstant: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_stringconstant", sym._stringconstant);
            case _booleanconstant: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_booleanconstant", sym._booleanconstant);
            case _id: /*System.out.print( next_toke.toString() + " ");*/ advance(); return sf.newSymbol("_id", sym._id);
            case EOF: return sf.newSymbol("EOF", sym.EOF);

		default:
            System.out.println("[reject]");
            advance();
		    break;
		}
    }
};