
package compiladores;

import org.antlr.v4.runtime.*;

public class ErroresPersonalizados extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String error = "Línea " + line + ":" + charPositionInLine + " " + msg;
        if (msg.contains("')'")) {
            System.out.println("Error sintáctico: Falta cierre de paréntesis. En linea: " + line + ":" + charPositionInLine);
        } else if (msg.contains("'('")) {
            System.out.println("Error sintáctico: Falta apertura de paréntesis. En linea: " + line + ":" + charPositionInLine);
        } else if (msg.contains("';'")) {
            System.out.println("Error sintáctico: Falta punto y coma. En linea: " + line + ":" + charPositionInLine);
        } else if (msg.contains("'}'")) {
            System.out.println("Error sintáctico: Falta cierre de llaves. En linea: " + line + ":" + charPositionInLine);
        } else if (msg.contains("no viable alternative at input")) {
            System.out.println("Error sintáctico: Entrada irreconocible "+ recognizer.getVocabulary().getDisplayName(((Token) offendingSymbol).getType()));
        } else {
            System.out.println("Error sintáctico: " + error);
        } 
    }
}