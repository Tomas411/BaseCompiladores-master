package compiladores;

import java.util.ArrayList;
import java.util.List;

public class Optimizador {
    private List<String> codigoOriginal;
    private List<String> codigoOptimizado;

    public Optimizador(List<String> codigoOriginal) {
        this.codigoOriginal = codigoOriginal;
        this.codigoOptimizado = new ArrayList<>();
    }

    public List<String> optimizar() {
        for (String linea : codigoOriginal) {
            if (esAsignacion(linea) && contieneExpresionConstante(linea)) {
                // Simplificar expresiones constantes
                String lineaSimplificada = simplificarExpresionConstante(linea);
                codigoOptimizado.add(lineaSimplificada);
            } else {
                // Mantener las demás líneas sin cambios
                codigoOptimizado.add(linea);
            }
        }
        return codigoOptimizado;
    }

    private boolean esAsignacion(String linea) {
        return linea.contains("=") && !linea.contains("if") && !linea.contains("goto");
    }

    private boolean contieneExpresionConstante(String linea) {
        String[] partes = linea.split(" = ");
        if (partes.length == 2) {
            String derecha = partes[1].trim();
            return derecha.matches("\\d+\\s*[+\\-*/]\\s*\\d+\\s*;?");
        }
        return false;
    }

    private String simplificarExpresionConstante(String linea) {
        String[] partes = linea.split(" = ");
        String izquierda = partes[0].trim();
        String derecha = partes[1].trim().replace(";", ""); // Eliminar el ; para evaluar correctamente

        // Evalúa la expresión constante
        int resultado = evaluarExpresion(derecha);
        return izquierda + " = " + resultado + ";";
    }

    private int evaluarExpresion(String expresion) {
        String[] tokens;
        if (expresion.contains("+")) {
            tokens = expresion.split("\\+");
            return Integer.parseInt(tokens[0].trim()) + Integer.parseInt(tokens[1].trim());
        } else if (expresion.contains("-")) {
            tokens = expresion.split("-");
            return Integer.parseInt(tokens[0].trim()) - Integer.parseInt(tokens[1].trim());
        } else if (expresion.contains("*")) {
            tokens = expresion.split("\\*");
            return Integer.parseInt(tokens[0].trim()) * Integer.parseInt(tokens[1].trim());
        } else if (expresion.contains("/")) {
            tokens = expresion.split("/");
            return Integer.parseInt(tokens[0].trim()) / Integer.parseInt(tokens[1].trim());
        }
        return 0; // En caso de que no haya operador
    }
}