
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\002\004\000\002\002\003\000\002\003" +
    "\010\000\002\005\010\000\002\005\011\000\002\006\003" +
    "\000\002\006\003\000\002\006\003\000\002\006\003\000" +
    "\002\006\003\000\002\006\003\000\002\006\003\000\002" +
    "\006\003\000\002\006\003\000\002\006\003\000\002\006" +
    "\003\000\002\007\007\000\002\007\010\000\002\010\006" +
    "\000\002\010\005\000\002\010\006\000\002\010\007\000" +
    "\002\010\010\000\002\010\007\000\002\010\007\000\002" +
    "\010\010\000\002\010\006\000\002\010\004\000\002\010" +
    "\003\000\002\010\004\000\002\010\005\000\002\010\006" +
    "\000\002\010\005\000\002\010\005\000\002\010\006\000" +
    "\002\010\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\076\000\004\011\006\001\002\000\004\002\000\001" +
    "\002\000\004\002\100\001\002\000\004\036\010\001\002" +
    "\000\004\040\032\001\002\000\004\037\011\001\002\000" +
    "\004\040\012\001\002\000\004\041\013\001\002\000\030" +
    "\024\021\025\026\026\017\027\020\030\024\031\016\032" +
    "\023\033\014\034\027\042\022\043\025\001\002\000\004" +
    "\004\ufff3\001\002\000\004\004\030\001\002\000\004\004" +
    "\ufff5\001\002\000\004\004\ufff8\001\002\000\004\004\ufff7" +
    "\001\002\000\004\004\ufffb\001\002\000\004\004\ufffc\001" +
    "\002\000\004\004\ufff4\001\002\000\004\004\ufff6\001\002" +
    "\000\004\004\ufffa\001\002\000\004\004\ufff9\001\002\000" +
    "\004\004\ufff2\001\002\000\006\036\010\040\ufffe\001\002" +
    "\000\004\040\ufffd\001\002\000\004\041\037\001\002\000" +
    "\004\046\034\001\002\000\004\046\035\001\002\000\004" +
    "\012\036\001\002\000\004\002\uffff\001\002\000\004\044" +
    "\040\001\002\000\006\011\043\045\042\001\002\000\004" +
    "\004\076\001\002\000\020\004\uffe5\011\043\015\063\021" +
    "\066\022\064\044\062\045\042\001\002\000\004\040\044" +
    "\001\002\000\004\012\045\001\002\000\020\004\uffee\011" +
    "\043\015\047\021\052\022\050\044\046\045\042\001\002" +
    "\000\006\011\043\045\042\001\002\000\012\004\uffed\011" +
    "\043\021\057\045\042\001\002\000\006\004\uffe7\044\054" +
    "\001\002\000\004\004\uffef\001\002\000\006\011\043\045" +
    "\042\001\002\000\004\004\uffea\001\002\000\006\011\043" +
    "\045\042\001\002\000\004\004\uffe8\001\002\000\004\004" +
    "\uffec\001\002\000\006\011\043\045\042\001\002\000\004" +
    "\004\uffeb\001\002\000\004\004\uffe9\001\002\000\006\011" +
    "\043\045\042\001\002\000\012\004\uffe4\011\043\021\073" +
    "\045\042\001\002\000\006\004\uffde\044\070\001\002\000" +
    "\004\004\uffe6\001\002\000\006\011\043\045\042\001\002" +
    "\000\004\004\uffe1\001\002\000\006\011\043\045\042\001" +
    "\002\000\004\004\uffdf\001\002\000\004\004\uffe3\001\002" +
    "\000\006\011\043\045\042\001\002\000\004\004\uffe2\001" +
    "\002\000\004\004\uffe0\001\002\000\006\040\032\046\ufff1" +
    "\001\002\000\004\046\ufff0\001\002\000\004\002\001\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\076\000\006\002\004\003\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\006\001\001\000\004" +
    "\007\032\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\006\014\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\030\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\010\040\001\001\000\002\001\001\000\004\010" +
    "\064\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\050\001\001\000\004\010\060\001\001\000\004\010" +
    "\055\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\052\001\001\000\002\001\001\000\004\010\054\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\010\057" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\010" +
    "\074\001\001\000\004\010\071\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\066\001\001\000\002\001" +
    "\001\000\004\010\070\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\010\073\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\076\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /**
     * Método al que se llama automáticamente ante algún error sintactico.
     **/ 
    public void syntax_error(Symbol s){ 
        System.out.println("Error Sintáctico en la Línea " + (s.left) +
        " Columna "+s.right+ ". No se esperaba este componente: " +s.value+"."); 
    } 

    /**
     * Método al que se llama automáticamente ante algún error sintáctico 
     * en el que ya no es posible una recuperación de errores.
     **/ 
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error síntactico irrecuperable en la Línea " + 
        (s.left)+ " Columna "+s.right+". Componente " + s.value + 
        " no reconocido."); 
    }  


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico$actions {
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action_part00000000(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= instrucciones 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instrucciones ::= LLAVEABIERTA conjuntos expresionesRegulares DPORCENTAJE DPORCENTAJE LLAVECERRADA 
            {
              Object RESULT =null;
		System.out.println("ANALISIS  EXITOSO \n *******************" );
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // conjuntos ::= CONJ DOSPUNTOS IDENTIFICADOR FLECHA notacion PTCOMA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("conjuntos",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // conjuntos ::= CONJ DOSPUNTOS IDENTIFICADOR FLECHA notacion PTCOMA conjuntos 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("conjuntos",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // notacion ::= CONCA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // notacion ::= DISY 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // notacion ::= STAR 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // notacion ::= PLUS 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // notacion ::= MARK 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // notacion ::= CONJMIN 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // notacion ::= CONMAY 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // notacion ::= CONNUM 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // notacion ::= NUMEROS 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // notacion ::= LETRAS 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // notacion ::= SIMBOLO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expresionesRegulares ::= IDENTIFICADOR FLECHA PUNTO regular PTCOMA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresionesRegulares",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresionesRegulares ::= IDENTIFICADOR FLECHA PUNTO regular PTCOMA expresionesRegulares 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresionesRegulares",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // regular ::= LLAVEABIERTA IDENTIFICADOR LLAVECERRADA regular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // regular ::= LLAVEABIERTA IDENTIFICADOR LLAVECERRADA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // regular ::= LLAVEABIERTA IDENTIFICADOR LLAVECERRADA ASTERISCO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // regular ::= LLAVEABIERTA IDENTIFICADOR LLAVECERRADA ASTERISCO regular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // regular ::= LLAVEABIERTA IDENTIFICADOR LLAVECERRADA ASTERISCO OR regular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // regular ::= LLAVEABIERTA IDENTIFICADOR LLAVECERRADA OR regular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // regular ::= LLAVEABIERTA IDENTIFICADOR LLAVECERRADA PUNTO regular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // regular ::= LLAVEABIERTA IDENTIFICADOR LLAVECERRADA INTERROGACION PUNTO regular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // regular ::= LLAVEABIERTA IDENTIFICADOR LLAVECERRADA INTERROGACION 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // regular ::= CARACTER regular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // regular ::= CARACTER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // regular ::= CARACTER ASTERISCO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // regular ::= CARACTER ASTERISCO regular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // regular ::= CARACTER ASTERISCO OR regular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // regular ::= CARACTER OR regular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // regular ::= CARACTER PUNTO regular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // regular ::= CARACTER INTERROGACION PUNTO regular 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // regular ::= CARACTER INTERROGACION 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("regular",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Sintactico$do_action_part00000000(
                               CUP$Sintactico$act_num,
                               CUP$Sintactico$parser,
                               CUP$Sintactico$stack,
                               CUP$Sintactico$top);
    }
}

}
