package analizadores;
import java_cup.runtime.Symbol; 


public class Lexico implements java_cup.runtime.Scanner {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final int YY_BOL = 65536;
	private final int YY_EOF = 65537;
	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yychar;
	private int yyline;
	private boolean yy_at_bol;
	private int yy_lexical_state;

	public Lexico (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	public Lexico (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	private Lexico () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yychar = 0;
		yyline = 0;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
 
    yyline = 1; 
    yychar = 1; 
	}

	private boolean yy_eof_done = false;
	private final int YYINITIAL = 0;
	private final int yy_state_dtrans[] = {
		0
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private int yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_end () {
		if (yy_buffer_end > yy_buffer_start &&
		    '\n' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
		if (yy_buffer_end > yy_buffer_start &&
		    '\r' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
	}
	private boolean yy_last_was_cr=false;
	private void yy_mark_start () {
		int i;
		for (i = yy_buffer_start; i < yy_buffer_index; ++i) {
			if ('\n' == yy_buffer[i] && !yy_last_was_cr) {
				++yyline;
			}
			if ('\r' == yy_buffer[i]) {
				++yyline;
				yy_last_was_cr=true;
			} else yy_last_was_cr=false;
		}
		yychar = yychar
			+ yy_buffer_index - yy_buffer_start;
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
		yy_at_bol = (yy_buffer_end > yy_buffer_start) &&
		            ('\r' == yy_buffer[yy_buffer_end-1] ||
		             '\n' == yy_buffer[yy_buffer_end-1] ||
		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||
		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]);
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	private int[][] unpackFromString(int size1, int size2, String st) {
		int colonIndex = -1;
		String lengthString;
		int sequenceLength = 0;
		int sequenceInteger = 0;

		int commaIndex;
		String workString;

		int res[][] = new int[size1][size2];
		for (int i= 0; i < size1; i++) {
			for (int j= 0; j < size2; j++) {
				if (sequenceLength != 0) {
					res[i][j] = sequenceInteger;
					sequenceLength--;
					continue;
				}
				commaIndex = st.indexOf(',');
				workString = (commaIndex==-1) ? st :
					st.substring(0, commaIndex);
				st = st.substring(commaIndex+1);
				colonIndex = workString.indexOf(':');
				if (colonIndex == -1) {
					res[i][j]=Integer.parseInt(workString);
					continue;
				}
				lengthString =
					workString.substring(colonIndex+1);
				sequenceLength=Integer.parseInt(lengthString);
				workString=workString.substring(0,colonIndex);
				sequenceInteger=Integer.parseInt(workString);
				res[i][j] = sequenceInteger;
				sequenceLength--;
			}
		}
		return res;
	}
	private int yy_acpt[] = {
		/* 0 */ YY_NOT_ACCEPT,
		/* 1 */ YY_NO_ANCHOR,
		/* 2 */ YY_NO_ANCHOR,
		/* 3 */ YY_NO_ANCHOR,
		/* 4 */ YY_NO_ANCHOR,
		/* 5 */ YY_NO_ANCHOR,
		/* 6 */ YY_NO_ANCHOR,
		/* 7 */ YY_NO_ANCHOR,
		/* 8 */ YY_NO_ANCHOR,
		/* 9 */ YY_NO_ANCHOR,
		/* 10 */ YY_NO_ANCHOR,
		/* 11 */ YY_NO_ANCHOR,
		/* 12 */ YY_NO_ANCHOR,
		/* 13 */ YY_NO_ANCHOR,
		/* 14 */ YY_NO_ANCHOR,
		/* 15 */ YY_NO_ANCHOR,
		/* 16 */ YY_NO_ANCHOR,
		/* 17 */ YY_NO_ANCHOR,
		/* 18 */ YY_NO_ANCHOR,
		/* 19 */ YY_NO_ANCHOR,
		/* 20 */ YY_NO_ANCHOR,
		/* 21 */ YY_NO_ANCHOR,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NO_ANCHOR,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NO_ANCHOR,
		/* 27 */ YY_NO_ANCHOR,
		/* 28 */ YY_NO_ANCHOR,
		/* 29 */ YY_NO_ANCHOR,
		/* 30 */ YY_NO_ANCHOR,
		/* 31 */ YY_NO_ANCHOR,
		/* 32 */ YY_NO_ANCHOR,
		/* 33 */ YY_NO_ANCHOR,
		/* 34 */ YY_NO_ANCHOR,
		/* 35 */ YY_NO_ANCHOR,
		/* 36 */ YY_NO_ANCHOR,
		/* 37 */ YY_NOT_ACCEPT,
		/* 38 */ YY_NO_ANCHOR,
		/* 39 */ YY_NO_ANCHOR,
		/* 40 */ YY_NO_ANCHOR,
		/* 41 */ YY_NO_ANCHOR,
		/* 42 */ YY_NOT_ACCEPT,
		/* 43 */ YY_NO_ANCHOR,
		/* 44 */ YY_NO_ANCHOR,
		/* 45 */ YY_NOT_ACCEPT,
		/* 46 */ YY_NO_ANCHOR,
		/* 47 */ YY_NO_ANCHOR,
		/* 48 */ YY_NOT_ACCEPT,
		/* 49 */ YY_NO_ANCHOR,
		/* 50 */ YY_NOT_ACCEPT,
		/* 51 */ YY_NOT_ACCEPT,
		/* 52 */ YY_NOT_ACCEPT,
		/* 53 */ YY_NOT_ACCEPT,
		/* 54 */ YY_NOT_ACCEPT,
		/* 55 */ YY_NOT_ACCEPT,
		/* 56 */ YY_NOT_ACCEPT,
		/* 57 */ YY_NOT_ACCEPT,
		/* 58 */ YY_NO_ANCHOR,
		/* 59 */ YY_NO_ANCHOR,
		/* 60 */ YY_NOT_ACCEPT,
		/* 61 */ YY_NO_ANCHOR,
		/* 62 */ YY_NO_ANCHOR,
		/* 63 */ YY_NO_ANCHOR,
		/* 64 */ YY_NO_ANCHOR,
		/* 65 */ YY_NO_ANCHOR,
		/* 66 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,65538,
"37:8,38:2,24,37,38,25,37:18,27,40,36:6,13,14,21,19,35,20,23,22,26:10,11,12," +
"39,36,29,32,36,34:2,7,34,1,34:4,10,34:3,9,8,34:11,15,36,16,36,28,36,3,30:10" +
",4,30:5,6,30:2,5,2,30:4,17,31,18,33,37:65409,0:2")[0];

	private int yy_rmap[] = unpackFromString(1,67,
"0,1,2,3:8,4,5,6,7,8,1:2,9,3,1:6,10,1,11,1,12,1,13,1,14,15,14,16,17,18,19,20" +
",21,14,1,22,23,24,25,26,11,27,12,28,29,30,31,32,33,34,15,35,36,37,38,39,40")[0];

	private int yy_nxt[][] = unpackFromString(41,41,
"1,2,58:5,62,66:3,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,17,38,19,58,39,41" +
",44,66,19:2,44,17,47,19,-1:42,43,65,43:8,-1:15,43,-1,43,-1,43,-1:2,37,43,42" +
",-1:38,48,-1:9,20:5,-1:23,20,-1:2,48,-1:36,21,-1:3,48,-1:9,22:5,-1:23,22,-1" +
":2,48,-1:29,50,-1:10,48,-1:9,51:5,-1:23,51,-1:2,48,-1:8,43:10,-1:12,52,-1:2" +
",40,-1,43,-1,43,-1:2,53,43,54,-1:40,42,-1:6,28:23,-1:2,28:15,-1:26,30:2,-1:" +
"3,30,-1:44,54,-1:6,43:10,-1:15,43,-1,43,-1,43,-1:3,43,-1:7,60:39,57,-1,24,2" +
"5:5,24:4,25:13,-1:2,25,-1,25:5,-1,24,25:2,-1:2,25:2,-1,43:10,-1:15,43,-1,43" +
",-1,43,-1:2,48,43,-1:8,55:5,-1:23,55,-1:2,48,-1:8,43:10,-1:12,52,-1:2,40,-1" +
",43,-1,43,-1:3,43,-1:8,23:5,-1:23,23,-1:2,48,-1:8,26:10,-1:19,26,-1:3,26,-1" +
":7,25,27:5,25:17,-1:2,25,-1,25:2,27,25:2,-1,25:3,-1:2,25:2,-1,43:9,34,-1:15" +
",43,-1,43,-1,43,-1:3,43,-1:39,48,-1:6,56,-1,25:23,-1:2,25,-1,25:5,-1,25:3,-" +
"1:2,25:2,-1,43:5,36,43:4,-1:15,43,-1,43,-1,43,-1:3,43,-1:8,29:5,-1:23,29,-1" +
":11,25:23,-1:2,31,-1,25:5,-1,25:3,-1:2,25:2,-1:26,32,-1:16,33:5,-1:23,33,-1" +
":11,60:40,-1,60:28,35,60:10,57,-1,43:10,-1:15,43,-1,43,-1,43,-1:2,45,43,42," +
"-1:6,43:8,46,43,-1:15,43,-1,43,-1,43,-1:3,43,-1:7,43:2,49,43:7,-1:15,43,-1," +
"43,-1,43,-1:3,43,-1:7,43:7,59,43:2,-1:15,43,-1,43,-1,43,-1:2,37,43,42,-1:6," +
"43:4,61,43:5,-1:15,43,-1,43,-1,43,-1:3,43,-1:7,43:3,63,43:6,-1:15,43,-1,43," +
"-1,43,-1:3,43,-1:7,43:2,64,43:7,-1:15,43,-1,43,-1,43,-1:3,43,-1:7,43:10,-1:" +
"15,43,-1,43,-1,43,-1:2,37,43,42,-1:5");

	public java_cup.runtime.Symbol next_token ()
		throws java.io.IOException {
		int yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL;
			else yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			if (YY_EOF == yy_lookahead && true == yy_initial) {
				return null;
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_move_end();
					}
					yy_to_mark();
					switch (yy_last_accept_state) {
					case 1:
						
					case -2:
						break;
					case 2:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -3:
						break;
					case 3:
						{return new Symbol(sym.DOSPUNTOS,yyline,yychar, yytext());}
					case -4:
						break;
					case 4:
						{return new Symbol(sym.PTCOMA,yyline,yychar, yytext());}
					case -5:
						break;
					case 5:
						{return new Symbol(sym.PARIZQ,yyline,yychar, yytext());}
					case -6:
						break;
					case 6:
						{return new Symbol(sym.PARDER,yyline,yychar, yytext());}
					case -7:
						break;
					case 7:
						{return new Symbol(sym.CORIZQ,yyline,yychar, yytext());}
					case -8:
						break;
					case 8:
						{return new Symbol(sym.CORDER,yyline,yychar, yytext());}
					case -9:
						break;
					case 9:
						{return new Symbol(sym.LLAVEABIERTA,yyline,yychar, yytext());}
					case -10:
						break;
					case 10:
						{return new Symbol(sym.LLAVECERRADA,yyline,yychar, yytext());}
					case -11:
						break;
					case 11:
						{return new Symbol(sym.MAS,yyline,yychar, yytext());}
					case -12:
						break;
					case 12:
						{return new Symbol(sym.MENOS,yyline,yychar, yytext());}
					case -13:
						break;
					case 13:
						{return new Symbol(sym.ASTERISCO,yyline,yychar, yytext());}
					case -14:
						break;
					case 14:
						{return new Symbol(sym.DIVIDIDO,yyline,yychar, yytext());}
					case -15:
						break;
					case 15:
						{return new Symbol(sym.PUNTO,yyline,yychar, yytext());}
					case -16:
						break;
					case 16:
						{yychar=1;}
					case -17:
						break;
					case 17:
						{}
					case -18:
						break;
					case 18:
						{return new Symbol(sym.ENTERO,yyline,yychar, yytext());}
					case -19:
						break;
					case 19:
						{
    System.out.println("Este es un error lexico: "+yytext()+", en la linea: "
    +yyline+", en la columna: "+yychar);
}
					case -20:
						break;
					case 20:
						{return new Symbol(sym.PLUS,yyline,yychar, yytext());}
					case -21:
						break;
					case 21:
						{return new Symbol(sym.FLECHA,yyline,yychar, yytext());}
					case -22:
						break;
					case 22:
						{return new Symbol(sym.DISY,yyline,yychar, yytext());}
					case -23:
						break;
					case 23:
						{return new Symbol(sym.MARK,yyline,yychar, yytext());}
					case -24:
						break;
					case 24:
						{return new Symbol(sym.CONMAY,yyline,yychar, yytext());}
					case -25:
						break;
					case 25:
						{return new Symbol(sym.LETRAS,yyline,yychar, yytext());}
					case -26:
						break;
					case 26:
						{return new Symbol(sym.LETRAS,yyline,yychar, yytext());}
					case -27:
						break;
					case 27:
						{return new Symbol(sym.CONJMIN,yyline,yychar, yytext());}
					case -28:
						break;
					case 28:
						{}
					case -29:
						break;
					case 29:
						{return new Symbol(sym.CONCA,yyline,yychar, yytext());}
					case -30:
						break;
					case 30:
						{return new Symbol(sym.DECIMAL,yyline,yychar, yytext());}
					case -31:
						break;
					case 31:
						{return new Symbol(sym.CONNUM,yyline,yychar, yytext());}
					case -32:
						break;
					case 32:
						{return new Symbol(sym.NUMEROS,yyline,yychar, yytext());}
					case -33:
						break;
					case 33:
						{return new Symbol(sym.DISY,yyline,yychar, yytext());}
					case -34:
						break;
					case 34:
						{return new Symbol(sym.CONJ,yyline,yychar, yytext());}
					case -35:
						break;
					case 35:
						{}
					case -36:
						break;
					case 36:
						{return new Symbol(sym.REVALUAR,yyline,yychar, yytext());}
					case -37:
						break;
					case 38:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -38:
						break;
					case 39:
						{}
					case -39:
						break;
					case 40:
						{return new Symbol(sym.ENTERO,yyline,yychar, yytext());}
					case -40:
						break;
					case 41:
						{
    System.out.println("Este es un error lexico: "+yytext()+", en la linea: "
    +yyline+", en la columna: "+yychar);
}
					case -41:
						break;
					case 43:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -42:
						break;
					case 44:
						{
    System.out.println("Este es un error lexico: "+yytext()+", en la linea: "
    +yyline+", en la columna: "+yychar);
}
					case -43:
						break;
					case 46:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -44:
						break;
					case 47:
						{
    System.out.println("Este es un error lexico: "+yytext()+", en la linea: "
    +yyline+", en la columna: "+yychar);
}
					case -45:
						break;
					case 49:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -46:
						break;
					case 58:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -47:
						break;
					case 59:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -48:
						break;
					case 61:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -49:
						break;
					case 62:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -50:
						break;
					case 63:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -51:
						break;
					case 64:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -52:
						break;
					case 65:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -53:
						break;
					case 66:
						{return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());}
					case -54:
						break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
						yy_mark_end();
					}
				}
			}
		}
	}
}
