/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package Analizadores;
import java_cup.runtime.*;
import java.util.LinkedList;
import static Interfaz.Ventana.output;

/*------------  2da Area: Opciones y Declaraciones ---------*/
%%
%{
    //----> Codigo de usuario en sintaxis java
    public static LinkedList<TError> TablaEL = new LinkedList<TError>(); 
%}

//-------> Directivas
%public 
%class Analizador_Lexico
%cupsym Simbolos
%cup
%char
%column
%full
%ignorecase
%line
%unicode

//------> Expresiones Regulares
numero = [0-9]+
letra = [a-zA-Z]+
letranum = [a-zA-Z]+[0-9]*
begin = BEGIN[{]+
main = MAIN[{]+
palabraR = [if|else|for|rotate_c|move_h|move_c|move_m|action|left|right|sout|sint]+
corizquierdo = [{]+
corderecho = [}]+
comentarios = [**]+
palabraIF = if[(]+
palabraELSE = else[{]+
palabraFOR = for[(]+
palabraROTATE = rotate_c[(]+ 
palabraMOVE_H = move_h[(]+ 
palabraMOVE_C = move_c[(]+
palabraMOVE_M = move_m[(]+
palabraACTION = action[(]+
condiciones = [<<|>>|<=|>=|==|!!]+



//------> Estados

%%
/*------------  3raa Area: Reglas Lexicas ---------*/

//-----> Simbolos

// Aritmeticos
<YYINITIAL> "+"         { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" mas"); return new Symbol(Simbolos.mas, yycolumn, yyline, yytext()); }
<YYINITIAL> "-"         { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" menos"); return new Symbol(Simbolos.menos, yycolumn, yyline, yytext()); }
<YYINITIAL> "*"         { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" por"); return new Symbol(Simbolos.por, yycolumn, yyline, yytext()); }
<YYINITIAL> "/"         { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" div"); return new Symbol(Simbolos.div, yycolumn, yyline, yytext()); }
// Agrupacion
<YYINITIAL> "("         { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" para"); return new Symbol(Simbolos.para, yycolumn, yyline, yytext()); }
<YYINITIAL> ")"         { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" parc"); return new Symbol(Simbolos.parc, yycolumn, yyline, yytext()); }
// Otros signos
<YYINITIAL> ":"         { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" delimitador"); return new Symbol(Simbolos.delimitador, yycolumn, yyline, yytext()); }
<YYINITIAL> "#"         { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" declaracion"); return new Symbol(Simbolos.declaracion, yycolumn, yyline, yytext()); }
<YYINITIAL> ","         { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" coma"); return new Symbol(Simbolos.coma, yycolumn, yyline, yytext()); }
// Asignacion
<YYINITIAL> "="         { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" asignacion"); return new Symbol(Simbolos.asignacion, yycolumn, yyline, yytext()); }
//-------> Simbolos ER
<YYINITIAL> {numero}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" numero"); return new Symbol(Simbolos.numero, yycolumn, yyline, yytext()); }
<YYINITIAL> {letra}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" letra"); return new Symbol(Simbolos.letra, yycolumn, yyline, yytext()); }
<YYINITIAL> {letranum}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" letranum"); return new Symbol(Simbolos.letranum, yycolumn, yyline, yytext()); }

<YYINITIAL> {begin}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" begin"); return new Symbol(Simbolos.begin, yycolumn, yyline, yytext()); }
<YYINITIAL> {corizquierdo}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" corizquierdo"); return new Symbol(Simbolos.corizquierdo, yycolumn, yyline, yytext()); }
<YYINITIAL> {corderecho}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" corderecho"); return new Symbol(Simbolos.corderecho, yycolumn, yyline, yytext()); }
<YYINITIAL> {comentarios}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" comentarios"); return new Symbol(Simbolos.comentarios, yycolumn, yyline, yytext()); }
<YYINITIAL> {palabraR}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraR"); return new Symbol(Simbolos.palabraR, yycolumn, yyline, yytext()); }
<YYINITIAL> {main}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" main"); return new Symbol(Simbolos.main, yycolumn, yyline, yytext()); }

<YYINITIAL> {palabraIF}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraIF"); return new Symbol(Simbolos.palabraIF, yycolumn, yyline, yytext()); }
<YYINITIAL> {palabraELSE}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraELSE"); return new Symbol(Simbolos.palabraELSE, yycolumn, yyline, yytext()); }
<YYINITIAL> {palabraFOR}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraFOR"); return new Symbol(Simbolos.palabraFOR, yycolumn, yyline, yytext()); }
<YYINITIAL> {palabraROTATE}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraROTATE"); return new Symbol(Simbolos.palabraROTATE, yycolumn, yyline, yytext()); }
<YYINITIAL> {palabraMOVE_H}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraMOVE_H"); return new Symbol(Simbolos.palabraMOVE_H, yycolumn, yyline, yytext()); }
<YYINITIAL> {palabraMOVE_C}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraMOVE_C"); return new Symbol(Simbolos.palabraMOVE_C, yycolumn, yyline, yytext()); }
<YYINITIAL> {palabraMOVE_M}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraMOVE_M"); return new Symbol(Simbolos.palabraMOVE_M, yycolumn, yyline, yytext()); }
<YYINITIAL> {palabraACTION}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" palabraACTION"); return new Symbol(Simbolos.palabraACTION, yycolumn, yyline, yytext()); }

// Operadores logicos
<YYINITIAL> {condiciones}    { output2.setText(output2.getText()+"\n"+yytext());System.out.println("Reconocio "+yytext()+" condiciones"); return new Symbol(Simbolos.condiciones, yycolumn, yyline, yytext()); }

//------> Espacios
[ \t\r\n\f]             {/* Espacios en blanco, se ignoran */}

//------> Errores Lexicos
.                       { output.setText("Error Lexico -> "+yytext()+" Linea "+(yyline+1)+" Columna "+yycolumn);
                          System.out.println("Error Lexico -> "+yytext()+" Linea "+(yyline+1)+" Columna "+yycolumn);
                          TError datos = new TError(yytext(),yyline,yycolumn,"Error Lexico","Simbolo no existe en el lenguaje");
                          TablaEL.add(datos);}