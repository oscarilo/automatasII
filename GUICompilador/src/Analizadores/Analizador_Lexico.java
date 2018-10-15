/* The following code was generated by JFlex 1.6.1 */

/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package Analizadores;
import java_cup.runtime.*;
import java.util.LinkedList;
import static Interfaz.Ventana.output;
import static Interfaz.Ventana.output2;

/*------------  2da Area: Opciones y Declaraciones ---------*/

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>A_Lexico.jflex</tt>
 */
public class Analizador_Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 52, 52, 53, 52, 52,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    52, 43,  0, 49,  0,  0,  0,  0, 24, 47, 21, 44, 50, 45,  0, 46, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 48,  0, 43, 51, 43,  0, 
     0, 11,  3, 37,  2,  4, 22,  5, 41,  7,  2,  2, 25, 10,  8, 30, 
     2,  2, 32, 28, 34,  2, 39,  2,  2,  2,  2,  0,  0,  0,  0, 36, 
     0, 19,  3, 38,  2, 14, 23, 15, 42, 16,  2,  2, 26, 18, 17, 31, 
     2,  2, 33, 29, 35, 13, 40,  2,  2,  2,  2,  9, 12, 20,  0,  0, 
     0,  0,  0,  0,  0, 53,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\3\3\1\1\1\3\1\4\2\3"+
    "\1\5\5\3\1\6\1\7\2\3\1\10\2\3\1\5"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\2\3\1\0\11\3\1\24\5\3"+
    "\1\0\1\3\1\25\1\0\13\3\1\0\1\3\1\0"+
    "\1\3\1\0\2\3\1\0\5\3\1\26\2\3\1\0"+
    "\1\3\1\27\1\30\2\0\1\3\1\5\3\3\1\31"+
    "\4\0\1\3\3\5\3\3\1\32\1\33\1\34\1\35"+
    "\1\0\1\5\1\0\1\5\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[117];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\u0144\0\u017a"+
    "\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4\0\u032a"+
    "\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\66\0\u046e\0\u04a4"+
    "\0\u04da\0\u0510\0\66\0\66\0\66\0\66\0\66\0\66"+
    "\0\66\0\u0510\0\66\0\u0546\0\u057c\0\u05b2\0\u05e8\0\u061e"+
    "\0\u0654\0\u068a\0\u06c0\0\u06f6\0\u072c\0\u0762\0\u0798\0\u07ce"+
    "\0\u03cc\0\u0804\0\u083a\0\u0870\0\u08a6\0\u08dc\0\u0912\0\u0948"+
    "\0\u05e8\0\u097e\0\u09b4\0\u09ea\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2"+
    "\0\u0af8\0\u0b2e\0\u0b64\0\u0b9a\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72"+
    "\0\u0ca8\0\u0cde\0\u0d14\0\u0d4a\0\u0d80\0\u0db6\0\u0dec\0\u0e22"+
    "\0\u0e58\0\u0e8e\0\u0ec4\0\u0efa\0\u0f30\0\u0f66\0\u0f9c\0\u0c72"+
    "\0\u0cde\0\u0fd2\0\u1008\0\u103e\0\u1074\0\u10aa\0\u10e0\0\u1116"+
    "\0\u0f66\0\u114c\0\u1182\0\u11b8\0\u11ee\0\u1224\0\u125a\0\u1290"+
    "\0\u12c6\0\u12fc\0\u1332\0\u1368\0\u114c\0\u1182\0\u11b8\0\u11ee"+
    "\0\u139e\0\u13d4\0\u140a\0\u1440\0\u140a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[117];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\4\1\7\1\10"+
    "\1\4\1\11\1\12\1\13\1\14\1\15\1\16\1\15"+
    "\1\17\1\15\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\4\1\15\1\2\1\4\1\15\1\4\1\15"+
    "\1\27\1\30\1\4\1\15\1\31\1\4\1\15\1\4"+
    "\1\15\1\4\1\15\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\70\0\1\3\65\0"+
    "\1\44\4\4\1\0\2\4\1\0\2\4\1\0\7\4"+
    "\2\0\2\4\1\0\2\4\1\0\10\4\1\0\6\4"+
    "\14\0\1\44\2\4\1\45\1\4\1\0\2\4\1\0"+
    "\2\4\1\0\1\4\1\45\5\4\2\0\2\4\1\0"+
    "\2\4\1\0\10\4\1\0\6\4\14\0\1\44\4\4"+
    "\1\0\2\4\1\0\2\4\1\0\7\4\2\0\2\4"+
    "\1\0\2\46\1\0\10\4\1\0\6\4\41\0\2\47"+
    "\37\0\1\44\4\4\1\0\2\4\1\0\2\4\1\0"+
    "\7\4\2\0\2\50\1\0\2\4\1\0\10\4\1\0"+
    "\6\4\24\0\1\11\55\0\1\44\4\4\1\0\2\4"+
    "\1\0\1\4\1\51\1\0\6\4\1\51\2\0\2\4"+
    "\1\0\2\4\1\0\2\4\2\52\4\4\1\0\6\4"+
    "\14\0\1\44\4\4\1\0\2\4\1\0\2\4\1\0"+
    "\7\4\2\0\2\4\1\0\2\4\1\0\10\4\1\0"+
    "\2\53\4\4\27\0\1\14\7\31\3\0\1\31\2\0"+
    "\1\31\2\0\1\31\1\0\1\31\1\0\1\31\1\0"+
    "\2\31\1\0\1\31\1\0\1\31\1\0\1\31\1\32"+
    "\7\0\1\32\3\0\1\44\4\4\1\0\2\4\1\0"+
    "\2\4\1\31\7\15\2\0\1\4\1\15\1\0\1\4"+
    "\1\15\1\0\1\4\1\15\1\4\1\15\1\4\1\15"+
    "\1\4\1\15\1\31\1\4\1\15\1\4\1\15\1\4"+
    "\1\15\14\0\1\44\4\4\1\0\2\4\1\0\2\4"+
    "\1\31\7\15\2\0\1\4\1\15\1\0\1\46\1\54"+
    "\1\0\1\4\1\15\1\4\1\15\1\4\1\15\1\4"+
    "\1\15\1\31\1\4\1\15\1\4\1\15\1\4\1\15"+
    "\14\0\1\44\4\4\1\0\2\4\1\0\2\4\1\31"+
    "\7\15\2\0\1\50\1\55\1\0\1\4\1\15\1\0"+
    "\1\4\1\15\1\4\1\15\1\4\1\15\1\4\1\15"+
    "\1\31\1\4\1\15\1\4\1\15\1\4\1\15\14\0"+
    "\1\44\4\4\1\0\2\4\1\0\1\4\1\51\1\31"+
    "\6\15\1\56\2\0\1\4\1\15\1\0\1\4\1\15"+
    "\1\0\1\4\1\15\1\52\1\57\1\4\1\15\1\4"+
    "\1\15\1\31\1\4\1\15\1\4\1\15\1\4\1\15"+
    "\14\0\1\44\4\4\1\0\2\4\1\0\2\4\1\31"+
    "\7\15\2\0\1\4\1\15\1\0\1\4\1\15\1\0"+
    "\1\4\1\15\1\4\1\15\1\4\1\15\1\4\1\15"+
    "\1\31\1\53\1\60\1\4\1\15\1\4\1\15\37\0"+
    "\1\22\66\0\1\61\41\0\1\44\4\4\1\0\2\4"+
    "\1\0\2\4\1\0\7\4\2\0\2\4\1\0\2\4"+
    "\1\0\2\4\2\62\4\4\1\0\6\4\14\0\1\44"+
    "\4\4\1\0\2\4\1\0\2\4\1\31\7\15\2\0"+
    "\1\4\1\15\1\0\1\4\1\15\1\0\1\4\1\15"+
    "\1\62\1\63\1\4\1\15\1\4\1\15\1\31\1\4"+
    "\1\15\1\4\1\15\1\4\1\15\14\0\1\44\4\4"+
    "\1\0\2\4\1\0\2\4\1\0\7\4\2\0\2\4"+
    "\1\0\2\4\1\0\2\4\2\64\4\4\1\0\6\4"+
    "\14\0\1\44\4\4\1\0\2\4\1\0\2\4\1\31"+
    "\7\15\2\0\1\4\1\15\1\0\1\4\1\15\1\0"+
    "\1\4\1\15\1\64\1\65\1\4\1\15\1\4\1\15"+
    "\1\31\1\4\1\15\1\4\1\15\1\4\1\15\27\0"+
    "\10\31\3\0\1\31\2\0\1\31\2\0\1\31\1\0"+
    "\1\31\1\0\1\31\1\0\2\31\1\0\1\31\1\0"+
    "\1\31\1\0\1\31\27\0\1\32\36\0\1\32\7\0"+
    "\1\32\3\0\1\44\65\0\1\44\3\4\1\66\1\0"+
    "\2\4\1\0\2\4\1\0\2\4\1\66\4\4\2\0"+
    "\2\4\1\0\2\4\1\0\10\4\1\0\6\4\14\0"+
    "\1\44\4\4\1\0\2\4\1\0\2\4\1\0\7\4"+
    "\2\0\2\4\1\0\2\4\1\67\2\70\6\4\1\0"+
    "\6\4\43\0\1\71\36\0\1\44\4\4\1\0\2\4"+
    "\1\0\2\4\1\0\7\4\2\0\2\4\1\71\2\4"+
    "\1\0\10\4\1\0\6\4\14\0\1\44\4\4\1\72"+
    "\1\73\1\4\1\0\2\4\1\0\3\4\1\73\3\4"+
    "\2\0\2\4\1\0\2\4\1\0\10\4\1\0\6\4"+
    "\14\0\1\44\4\4\1\0\2\4\1\0\2\4\1\0"+
    "\7\4\2\0\2\4\1\0\2\4\1\0\10\4\1\0"+
    "\2\4\2\74\2\4\14\0\1\44\4\4\1\0\2\4"+
    "\1\0\2\4\1\0\7\4\2\0\2\4\1\0\2\4"+
    "\1\0\6\4\2\75\1\0\6\4\14\0\1\44\4\4"+
    "\1\0\2\4\1\0\2\4\1\31\7\15\2\0\1\4"+
    "\1\15\1\0\1\4\1\15\1\67\1\70\1\76\1\4"+
    "\1\15\1\4\1\15\1\4\1\15\1\31\1\4\1\15"+
    "\1\4\1\15\1\4\1\15\14\0\1\44\4\4\1\0"+
    "\2\4\1\0\2\4\1\31\7\15\2\0\1\4\1\15"+
    "\1\71\1\4\1\15\1\0\1\4\1\15\1\4\1\15"+
    "\1\4\1\15\1\4\1\15\1\31\1\4\1\15\1\4"+
    "\1\15\1\4\1\15\14\0\1\44\4\4\1\72\1\73"+
    "\1\4\1\0\2\4\1\31\3\15\1\77\3\15\2\0"+
    "\1\4\1\15\1\0\1\4\1\15\1\0\1\4\1\15"+
    "\1\4\1\15\1\4\1\15\1\4\1\15\1\31\1\4"+
    "\1\15\1\4\1\15\1\4\1\15\14\0\1\44\4\4"+
    "\1\0\2\4\1\0\2\4\1\31\7\15\2\0\1\4"+
    "\1\15\1\0\1\4\1\15\1\0\1\4\1\15\1\4"+
    "\1\15\1\4\1\15\1\4\1\15\1\31\1\4\1\15"+
    "\1\74\1\100\1\4\1\15\14\0\1\44\4\4\1\0"+
    "\2\4\1\0\2\4\1\31\7\15\2\0\1\4\1\15"+
    "\1\0\1\4\1\15\1\0\1\4\1\15\1\4\1\15"+
    "\1\4\1\15\1\75\1\101\1\31\1\4\1\15\1\4"+
    "\1\15\1\4\1\15\14\0\1\44\4\4\1\0\2\4"+
    "\1\0\2\4\1\0\7\4\2\0\2\4\1\0\2\4"+
    "\1\0\4\4\2\102\2\4\1\0\6\4\14\0\1\44"+
    "\4\4\1\0\2\4\1\0\2\4\1\31\7\15\2\0"+
    "\1\4\1\15\1\0\1\4\1\15\1\0\1\4\1\15"+
    "\1\4\1\15\1\102\1\103\1\4\1\15\1\31\1\4"+
    "\1\15\1\4\1\15\1\4\1\15\14\0\1\44\4\4"+
    "\1\0\2\4\1\0\2\4\1\0\7\4\2\0\2\4"+
    "\1\0\2\4\1\0\6\4\2\104\1\0\6\4\14\0"+
    "\1\44\4\4\1\0\2\4\1\0\2\4\1\31\7\15"+
    "\2\0\1\4\1\15\1\0\1\4\1\15\1\0\1\4"+
    "\1\15\1\4\1\15\1\4\1\15\1\104\1\105\1\31"+
    "\1\4\1\15\1\4\1\15\1\4\1\15\14\0\1\44"+
    "\4\4\1\106\1\107\1\4\1\0\2\4\1\0\3\4"+
    "\1\107\3\4\2\0\2\4\1\0\2\4\1\0\10\4"+
    "\1\0\6\4\17\0\1\110\11\0\1\110\50\0\1\44"+
    "\2\4\1\111\1\4\1\0\2\4\1\0\2\4\1\0"+
    "\1\4\1\111\5\4\2\0\2\4\1\0\2\4\1\0"+
    "\10\4\1\0\6\4\23\0\1\112\10\0\1\112\45\0"+
    "\1\44\4\4\1\0\1\4\1\113\1\0\2\4\1\0"+
    "\4\4\1\113\2\4\2\0\2\4\1\0\2\4\1\0"+
    "\10\4\1\0\6\4\14\0\1\44\2\4\1\114\1\4"+
    "\1\0\2\4\1\0\2\4\1\0\1\4\1\114\5\4"+
    "\2\0\2\4\1\0\2\4\1\0\10\4\1\0\6\4"+
    "\14\0\1\44\4\4\1\115\1\116\1\4\1\0\2\4"+
    "\1\0\3\4\1\116\3\4\2\0\2\4\1\0\2\4"+
    "\1\0\10\4\1\0\6\4\14\0\1\44\2\4\1\111"+
    "\1\4\1\0\2\4\1\0\2\4\1\31\1\15\1\117"+
    "\5\15\2\0\1\4\1\15\1\0\1\4\1\15\1\0"+
    "\1\4\1\15\1\4\1\15\1\4\1\15\1\4\1\15"+
    "\1\31\1\4\1\15\1\4\1\15\1\4\1\15\14\0"+
    "\1\44\4\4\1\0\1\4\1\113\1\0\2\4\1\31"+
    "\4\15\1\120\2\15\2\0\1\4\1\15\1\0\1\4"+
    "\1\15\1\0\1\4\1\15\1\4\1\15\1\4\1\15"+
    "\1\4\1\15\1\31\1\4\1\15\1\4\1\15\1\4"+
    "\1\15\14\0\1\44\2\4\1\114\1\4\1\0\2\4"+
    "\1\0\2\4\1\31\1\15\1\121\5\15\2\0\1\4"+
    "\1\15\1\0\1\4\1\15\1\0\1\4\1\15\1\4"+
    "\1\15\1\4\1\15\1\4\1\15\1\31\1\4\1\15"+
    "\1\4\1\15\1\4\1\15\14\0\1\44\4\4\1\115"+
    "\1\116\1\4\1\0\2\4\1\31\3\15\1\122\3\15"+
    "\2\0\1\4\1\15\1\0\1\4\1\15\1\0\1\4"+
    "\1\15\1\4\1\15\1\4\1\15\1\4\1\15\1\31"+
    "\1\4\1\15\1\4\1\15\1\4\1\15\14\0\1\44"+
    "\4\4\1\0\2\4\1\0\2\4\1\0\7\4\2\0"+
    "\2\4\1\123\2\4\1\0\10\4\1\0\6\4\14\0"+
    "\1\44\4\4\1\0\2\4\1\0\2\4\1\31\7\15"+
    "\2\0\1\4\1\15\1\123\1\4\1\15\1\0\1\4"+
    "\1\15\1\4\1\15\1\4\1\15\1\4\1\15\1\31"+
    "\1\4\1\15\1\4\1\15\1\4\1\15\14\0\1\44"+
    "\4\4\1\0\2\4\1\0\1\4\1\124\1\0\6\4"+
    "\1\124\2\0\2\4\1\0\2\4\1\0\10\4\1\0"+
    "\6\4\14\0\1\44\4\4\1\0\2\4\1\0\1\4"+
    "\1\124\1\31\6\15\1\125\2\0\1\4\1\15\1\0"+
    "\1\4\1\15\1\0\1\4\1\15\1\4\1\15\1\4"+
    "\1\15\1\4\1\15\1\31\1\4\1\15\1\4\1\15"+
    "\1\4\1\15\23\0\1\126\10\0\1\126\45\0\1\44"+
    "\4\4\1\0\1\4\1\127\1\0\2\4\1\0\4\4"+
    "\1\127\2\4\2\0\2\4\1\0\2\4\1\0\10\4"+
    "\1\0\6\4\24\0\1\130\55\0\1\44\4\4\1\0"+
    "\2\4\1\130\2\4\1\0\7\4\2\0\2\4\1\0"+
    "\2\4\1\0\10\4\1\0\6\4\24\0\1\131\55\0"+
    "\1\44\4\4\1\0\2\4\1\131\2\4\1\0\7\4"+
    "\2\0\2\4\1\0\2\4\1\0\10\4\1\0\6\4"+
    "\14\0\1\44\4\4\1\0\2\4\1\0\2\4\1\0"+
    "\7\4\2\0\2\4\1\0\2\4\1\0\10\4\1\132"+
    "\6\4\51\0\2\133\27\0\1\44\4\4\1\0\2\4"+
    "\1\0\2\4\1\0\7\4\2\0\2\4\1\0\2\4"+
    "\1\0\2\4\2\134\4\4\1\0\6\4\14\0\1\44"+
    "\4\4\1\0\2\4\1\130\2\4\1\31\7\15\2\0"+
    "\1\4\1\15\1\0\1\4\1\15\1\0\1\4\1\15"+
    "\1\4\1\15\1\4\1\15\1\4\1\15\1\31\1\4"+
    "\1\15\1\4\1\15\1\4\1\15\14\0\1\44\4\4"+
    "\1\0\2\4\1\131\2\4\1\31\7\15\2\0\1\4"+
    "\1\15\1\0\1\4\1\15\1\0\1\4\1\15\1\4"+
    "\1\15\1\4\1\15\1\4\1\15\1\31\1\4\1\15"+
    "\1\4\1\15\1\4\1\15\14\0\1\44\4\4\1\0"+
    "\2\4\1\0\2\4\1\31\7\15\2\0\1\4\1\15"+
    "\1\0\1\4\1\15\1\0\1\4\1\15\1\4\1\15"+
    "\1\4\1\15\1\4\1\15\1\135\1\4\1\15\1\4"+
    "\1\15\1\4\1\15\14\0\1\44\4\4\1\0\2\4"+
    "\1\0\2\4\1\31\7\15\2\0\1\4\1\15\1\0"+
    "\1\4\1\15\1\0\1\4\1\15\1\134\1\136\1\4"+
    "\1\15\1\4\1\15\1\31\1\4\1\15\1\4\1\15"+
    "\1\4\1\15\43\0\1\123\36\0\1\44\4\4\1\0"+
    "\2\4\1\0\2\4\1\0\7\4\2\0\2\4\1\0"+
    "\2\4\1\0\6\4\2\137\1\0\6\4\14\0\1\44"+
    "\4\4\1\0\2\4\1\0\2\4\1\31\7\15\2\0"+
    "\1\4\1\15\1\0\1\4\1\15\1\0\1\4\1\15"+
    "\1\4\1\15\1\4\1\15\1\137\1\140\1\31\1\4"+
    "\1\15\1\4\1\15\1\4\1\15\24\0\1\141\55\0"+
    "\1\44\4\4\1\0\2\4\1\141\2\4\1\0\7\4"+
    "\2\0\2\4\1\0\2\4\1\0\10\4\1\0\6\4"+
    "\25\0\1\142\7\0\1\142\22\0\2\143\2\0\2\144"+
    "\23\0\1\145\10\0\1\145\45\0\1\44\4\4\1\0"+
    "\1\4\1\146\1\0\2\4\1\0\4\4\1\146\2\4"+
    "\2\0\2\4\1\0\2\4\1\0\10\4\1\0\6\4"+
    "\25\0\1\142\1\0\6\31\1\147\1\31\3\0\1\31"+
    "\2\0\1\31\2\0\1\31\1\0\1\31\1\0\1\31"+
    "\1\0\2\31\1\143\1\150\1\0\1\31\1\144\1\151"+
    "\14\0\1\44\4\4\1\0\1\4\1\146\1\0\2\4"+
    "\1\31\4\15\1\152\2\15\2\0\1\4\1\15\1\0"+
    "\1\4\1\15\1\0\1\4\1\15\1\4\1\15\1\4"+
    "\1\15\1\4\1\15\1\31\1\4\1\15\1\4\1\15"+
    "\1\4\1\15\14\0\1\44\2\4\1\153\1\4\1\0"+
    "\2\4\1\0\2\4\1\0\1\4\1\153\5\4\2\0"+
    "\2\4\1\0\2\4\1\0\10\4\1\0\6\4\14\0"+
    "\1\44\2\4\1\153\1\4\1\0\2\4\1\0\2\4"+
    "\1\31\1\15\1\154\5\15\2\0\1\4\1\15\1\0"+
    "\1\4\1\15\1\0\1\4\1\15\1\4\1\15\1\4"+
    "\1\15\1\4\1\15\1\31\1\4\1\15\1\4\1\15"+
    "\1\4\1\15\43\0\1\155\65\0\1\156\65\0\1\157"+
    "\65\0\1\160\36\0\1\44\4\4\1\0\2\4\1\0"+
    "\2\4\1\0\7\4\2\0\2\4\1\160\2\4\1\0"+
    "\10\4\1\0\6\4\27\0\10\31\3\0\1\31\1\155"+
    "\1\0\1\31\2\0\1\31\1\0\1\31\1\0\1\31"+
    "\1\0\2\31\1\0\1\31\1\0\1\31\1\0\1\31"+
    "\27\0\10\31\3\0\1\31\1\156\1\0\1\31\2\0"+
    "\1\31\1\0\1\31\1\0\1\31\1\0\2\31\1\0"+
    "\1\31\1\0\1\31\1\0\1\31\27\0\10\31\3\0"+
    "\1\31\1\157\1\0\1\31\2\0\1\31\1\0\1\31"+
    "\1\0\1\31\1\0\2\31\1\0\1\31\1\0\1\31"+
    "\1\0\1\31\14\0\1\44\4\4\1\0\2\4\1\0"+
    "\2\4\1\31\7\15\2\0\1\4\1\15\1\160\1\4"+
    "\1\15\1\0\1\4\1\15\1\4\1\15\1\4\1\15"+
    "\1\4\1\15\1\31\1\4\1\15\1\4\1\15\1\4"+
    "\1\15\14\0\1\44\4\4\1\0\2\4\1\0\2\4"+
    "\1\0\7\4\2\0\2\4\1\0\2\4\1\0\10\4"+
    "\1\161\6\4\14\0\1\44\4\4\1\0\2\4\1\0"+
    "\2\4\1\31\7\15\2\0\1\4\1\15\1\0\1\4"+
    "\1\15\1\0\1\4\1\15\1\4\1\15\1\4\1\15"+
    "\1\4\1\15\1\162\1\4\1\15\1\4\1\15\1\4"+
    "\1\15\60\0\2\163\33\0\10\31\3\0\1\31\2\0"+
    "\1\31\2\0\1\31\1\0\1\31\1\0\1\31\1\0"+
    "\2\31\1\163\1\164\1\0\1\31\1\0\1\31\43\0"+
    "\1\165\51\0\10\31\3\0\1\31\1\165\1\0\1\31"+
    "\2\0\1\31\1\0\1\31\1\0\1\31\1\0\2\31"+
    "\1\0\1\31\1\0\1\31\1\0\1\31\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5238];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\23\1\1\11\4\1\7\11\1\1\1\11"+
    "\3\1\1\0\17\1\1\0\2\1\1\0\13\1\1\0"+
    "\1\1\1\0\1\1\1\0\2\1\1\0\10\1\1\0"+
    "\3\1\2\0\6\1\4\0\13\1\1\0\1\1\1\0"+
    "\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[117];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    //----> Codigo de usuario en sintaxis java
    public static LinkedList<TError> TablaEL = new LinkedList<TError>(); 


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Analizador_Lexico(java.io.Reader in) {
    this.zzReader = in;
  }



  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(Simbolos.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { output.setText("Error Lexico -> "+yytext()+" Linea "+(yyline+1)+" Columna "+yycolumn);
                          System.out.println("Error Lexico -> "+yytext()+" Linea "+(yyline+1)+" Columna "+yycolumn);
                          TError datos = new TError(yytext(),yyline,yycolumn,"Error Lexico","Simbolo no existe en el lenguaje");
                          TablaEL.add(datos);
            }
          case 31: break;
          case 2: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" numero"); return new Symbol(Simbolos.numero, yycolumn, yyline, yytext());
            }
          case 32: break;
          case 3: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" letra"); return new Symbol(Simbolos.letra, yycolumn, yyline, yytext());
            }
          case 33: break;
          case 4: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" corizquierdo"); return new Symbol(Simbolos.corizquierdo, yycolumn, yyline, yytext());
            }
          case 34: break;
          case 5: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraR"); return new Symbol(Simbolos.palabraR, yycolumn, yyline, yytext());
            }
          case 35: break;
          case 6: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" corderecho"); return new Symbol(Simbolos.corderecho, yycolumn, yyline, yytext());
            }
          case 36: break;
          case 7: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" por"); return new Symbol(Simbolos.por, yycolumn, yyline, yytext());
            }
          case 37: break;
          case 8: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" para"); return new Symbol(Simbolos.para, yycolumn, yyline, yytext());
            }
          case 38: break;
          case 9: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" condiciones"); return new Symbol(Simbolos.condiciones, yycolumn, yyline, yytext());
            }
          case 39: break;
          case 10: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" mas"); return new Symbol(Simbolos.mas, yycolumn, yyline, yytext());
            }
          case 40: break;
          case 11: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" menos"); return new Symbol(Simbolos.menos, yycolumn, yyline, yytext());
            }
          case 41: break;
          case 12: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" div"); return new Symbol(Simbolos.div, yycolumn, yyline, yytext());
            }
          case 42: break;
          case 13: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" parc"); return new Symbol(Simbolos.parc, yycolumn, yyline, yytext());
            }
          case 43: break;
          case 14: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" delimitador"); return new Symbol(Simbolos.delimitador, yycolumn, yyline, yytext());
            }
          case 44: break;
          case 15: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" declaracion"); return new Symbol(Simbolos.declaracion, yycolumn, yyline, yytext());
            }
          case 45: break;
          case 16: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" coma"); return new Symbol(Simbolos.coma, yycolumn, yyline, yytext());
            }
          case 46: break;
          case 17: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" asignacion"); return new Symbol(Simbolos.asignacion, yycolumn, yyline, yytext());
            }
          case 47: break;
          case 18: 
            { /* Espacios en blanco, se ignoran */
            }
          case 48: break;
          case 19: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" letranum"); return new Symbol(Simbolos.letranum, yycolumn, yyline, yytext());
            }
          case 49: break;
          case 20: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" comentarios"); return new Symbol(Simbolos.comentarios, yycolumn, yyline, yytext());
            }
          case 50: break;
          case 21: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraIF"); return new Symbol(Simbolos.palabraIF, yycolumn, yyline, yytext());
            }
          case 51: break;
          case 22: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraFOR"); return new Symbol(Simbolos.palabraFOR, yycolumn, yyline, yytext());
            }
          case 52: break;
          case 23: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraELSE"); return new Symbol(Simbolos.palabraELSE, yycolumn, yyline, yytext());
            }
          case 53: break;
          case 24: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" main"); return new Symbol(Simbolos.main, yycolumn, yyline, yytext());
            }
          case 54: break;
          case 25: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" begin"); return new Symbol(Simbolos.begin, yycolumn, yyline, yytext());
            }
          case 55: break;
          case 26: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraMOVE_M"); return new Symbol(Simbolos.palabraMOVE_M, yycolumn, yyline, yytext());
            }
          case 56: break;
          case 27: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraMOVE_C"); return new Symbol(Simbolos.palabraMOVE_C, yycolumn, yyline, yytext());
            }
          case 57: break;
          case 28: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraMOVE_H"); return new Symbol(Simbolos.palabraMOVE_H, yycolumn, yyline, yytext());
            }
          case 58: break;
          case 29: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraACTION"); return new Symbol(Simbolos.palabraACTION, yycolumn, yyline, yytext());
            }
          case 59: break;
          case 30: 
            { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraROTATE"); return new Symbol(Simbolos.palabraROTATE, yycolumn, yyline, yytext());
            }
          case 60: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}