
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores;

import java_cup.runtime.*;
import java.util.LinkedList;
import java.util.List;
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
    "\000\032\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\004\011\000\002\004\012\000\002\006\005" +
    "\000\002\006\003\000\002\006\005\000\002\006\003\000" +
    "\002\006\005\000\002\006\005\000\002\006\005\000\002" +
    "\010\007\000\002\013\002\000\002\010\011\000\002\011" +
    "\005\000\002\011\005\000\002\011\004\000\002\011\004" +
    "\000\002\011\004\000\002\011\003\000\002\011\005\000" +
    "\002\012\003\000\002\012\003\000\002\012\003\000\002" +
    "\012\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\063\000\004\004\006\001\002\000\004\002\000\001" +
    "\002\000\004\002\065\001\002\000\004\006\010\001\002" +
    "\000\004\030\035\001\002\000\004\010\011\001\002\000" +
    "\004\030\012\001\002\000\004\011\013\001\002\000\004" +
    "\012\014\001\002\000\010\007\016\015\015\026\020\001" +
    "\002\000\010\013\ufffb\014\032\020\031\001\002\000\010" +
    "\013\ufff9\014\026\020\025\001\002\000\004\013\023\001" +
    "\002\000\004\014\021\001\002\000\004\026\022\001\002" +
    "\000\004\013\ufff6\001\002\000\006\006\010\030\ufffe\001" +
    "\002\000\004\030\ufffd\001\002\000\010\007\016\015\015" +
    "\026\020\001\002\000\004\007\027\001\002\000\004\013" +
    "\ufff8\001\002\000\004\013\ufffa\001\002\000\010\007\016" +
    "\015\015\026\020\001\002\000\004\015\033\001\002\000" +
    "\004\013\ufff7\001\002\000\004\013\ufffc\001\002\000\004" +
    "\011\037\001\002\000\004\002\uffff\001\002\000\004\012" +
    "\040\001\002\000\020\004\046\021\041\022\042\023\050" +
    "\024\044\025\043\033\045\001\002\000\020\004\046\021" +
    "\041\022\042\023\050\024\044\025\043\033\045\001\002" +
    "\000\020\004\046\021\041\022\042\023\050\024\044\025" +
    "\043\033\045\001\002\000\020\004\046\021\041\022\042" +
    "\023\050\024\044\025\043\033\045\001\002\000\020\004" +
    "\046\021\041\022\042\023\050\024\044\025\043\033\045" +
    "\001\002\000\022\004\uffed\013\uffed\021\uffed\022\uffed\023" +
    "\uffed\024\uffed\025\uffed\033\uffed\001\002\000\004\030\056" +
    "\001\002\000\004\013\053\001\002\000\020\004\046\021" +
    "\041\022\042\023\050\024\044\025\043\033\045\001\002" +
    "\000\020\004\046\021\041\022\042\023\050\024\044\025" +
    "\043\033\045\001\002\000\022\004\ufff1\013\ufff1\021\ufff1" +
    "\022\ufff1\023\ufff1\024\ufff1\025\ufff1\033\ufff1\001\002\000" +
    "\006\002\ufff5\030\ufff4\001\002\000\004\030\035\001\002" +
    "\000\004\002\ufff3\001\002\000\004\005\057\001\002\000" +
    "\022\004\uffec\013\uffec\021\uffec\022\uffec\023\uffec\024\uffec" +
    "\025\uffec\033\uffec\001\002\000\022\004\uffee\013\uffee\021" +
    "\uffee\022\uffee\023\uffee\024\uffee\025\uffee\033\uffee\001\002" +
    "\000\022\004\uffef\013\uffef\021\uffef\022\uffef\023\uffef\024" +
    "\uffef\025\uffef\033\uffef\001\002\000\022\004\ufff0\013\ufff0" +
    "\021\ufff0\022\ufff0\023\ufff0\024\ufff0\025\ufff0\033\ufff0\001" +
    "\002\000\020\004\046\021\041\022\042\023\050\024\044" +
    "\025\043\033\045\001\002\000\022\004\ufff2\013\ufff2\021" +
    "\ufff2\022\ufff2\023\ufff2\024\ufff2\025\ufff2\033\ufff2\001\002" +
    "\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\063\000\006\002\004\003\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\006\001\001\000\004" +
    "\010\035\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\006\016\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\023\001\001\000\002\001\001\000\004\006\027\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\033\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\011\046\001\001\000\004\011" +
    "\062\001\001\000\004\011\061\001\001\000\004\011\060" +
    "\001\001\000\004\011\057\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\011\050\001\001" +
    "\000\004\011\051\001\001\000\002\001\001\000\004\013" +
    "\053\001\001\000\004\010\054\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\011\063\001\001" +
    "\000\002\001\001\000\002\001\001" });

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
   
     String palabra = "";
     List<Nodo> lista = new LinkedList<Nodo>();
    


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
          case 2: // instrucciones ::= LLAVEABIERTA conjuntos Xreg 
            {
              Object RESULT =null;
		System.out.println("ANALISIS  EXITOSO \n *********************************************" );
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // conjuntos ::= CONJ DOSPUNTOS IDENTIFICADOR GUION MAYORQUE notacion PUNTOCOMA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("conjuntos",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // conjuntos ::= CONJ DOSPUNTOS IDENTIFICADOR GUION MAYORQUE notacion PUNTOCOMA conjuntos 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("conjuntos",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // notacion ::= NUMERO COMA notacion 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // notacion ::= NUMERO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // notacion ::= LETRA COMA notacion 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // notacion ::= LETRA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // notacion ::= LETRA TILDE LETRA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // notacion ::= NUMERO TILDE NUMERO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // notacion ::= SIMBOLOS TILDE SIMBOLOS 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("notacion",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Xreg ::= IDENTIFICADOR GUION MAYORQUE z PUNTOCOMA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 System.out.println(a);
        Nodo ultimo = new Nodo();
        ultimo.setPadre(".");
        ultimo.setIzquierda((Nodo)a);
        Nodo numeral = new Nodo();
        numeral.setPadre("#");
        ultimo.setDerecha(numeral);
        //ultimo.imprimir();
        lista.add(ultimo);
        arbol arb = new arbol();
        arb.contar(lista);
        
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("Xreg",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NT$0 ::= 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
 System.out.println(a);
        Nodo ultimo = new Nodo();
        ultimo.setPadre(".");
        ultimo.setIzquierda((Nodo)a);
        Nodo numeral = new Nodo();
        numeral.setPadre("#");
        ultimo.setDerecha(numeral);
        //ultimo.imprimir();
        lista.add(ultimo);
        
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("NT$0",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Xreg ::= IDENTIFICADOR GUION MAYORQUE z PUNTOCOMA NT$0 Xreg 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("Xreg",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // z ::= PUNTO z z 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 Nodo nodo = new Nodo(); 
        nodo.setPadre(".");
        nodo.setIzquierda((Nodo)a);
        nodo.setDerecha((Nodo)b);
        RESULT = nodo;
        
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("z",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // z ::= OR z z 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 Nodo nodo = new Nodo(); 
        nodo.setPadre("|");
        nodo.setIzquierda((Nodo)a);
        nodo.setDerecha((Nodo)b);
        RESULT = nodo;
        
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("z",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // z ::= ASTERISCO z 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 Nodo nodo = new Nodo(); 
        nodo.setPadre("*");
        nodo.setIzquierda((Nodo)a);
        RESULT = nodo;
        
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("z",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // z ::= MAS z 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 Nodo nodo = new Nodo(); 
        nodo.setPadre("+");
        nodo.setIzquierda((Nodo)a);
        RESULT = nodo;
        
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("z",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // z ::= INTERROGACION z 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 Nodo nodo = new Nodo(); 
        nodo.setPadre("?");
        nodo.setIzquierda((Nodo)a);
        RESULT = nodo;
        
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("z",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // z ::= CARACTER 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 Nodo nodo = new Nodo(); 
        nodo.setPadre(id);
        nodo.setTipo("id");
        RESULT = nodo;
        
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("z",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // z ::= LLAVEABIERTA IDENTIFICADOR LLAVECERRADA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 Nodo nodo = new Nodo(); 
        nodo.setPadre(id);
        RESULT = nodo;
        
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("z",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // caracter ::= LETRA 
            {
              Object RESULT =null;
		int qleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int qright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String q = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 String t = q; 
                      RESULT = q;  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("caracter",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // caracter ::= NUMERO 
            {
              Object RESULT =null;
		int qleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int qright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String q = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 String t = q; 
                      RESULT = q;  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("caracter",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // caracter ::= SIMBOLOS 
            {
              Object RESULT =null;
		int qleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int qright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String q = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 String t = q; 
                      RESULT = q;  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("caracter",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // caracter ::= PUNTO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("caracter",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
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
