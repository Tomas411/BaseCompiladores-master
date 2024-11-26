package compiladores;

import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CommonTokenStream;

// Las diferentes entradas se explicaran oportunamente
public class App {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("input/programa.txt");

        // create a lexer that feeds off of input CharStream
        compiladoresLexer lexer = new compiladoresLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        compiladoresParser parser = new compiladoresParser(tokens);

        // create Listener
        Escucha escucha = new Escucha();

        // Conecto el objeto con Listeners al parser
        parser.addParseListener(escucha);

        parser.removeErrorListeners();
        parser.addErrorListener(new ErroresPersonalizados());
        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        ParseTree tree =  parser.programa();
        // Conectamos el visitor
        Caminante caminante = new Caminante();
        caminante.visit(tree);
        List<String> codigoC3D = caminante.getC3DCode();

        System.out.println("código sin optimizar");
        // Imprimir el código sin optimizar
        for (String linea : codigoC3D) {
            System.out.println(linea);
        }

        // Crear instancia del optimizador
        Optimizador optimizador = new Optimizador(codigoC3D);

        // Obtener código optimizado
        List<String> codigoOptimizado = optimizador.optimizar();

        System.out.println("código optimizado");
        // Imprimir el código optimizado
        for (String linea : codigoOptimizado) {
            System.out.println(linea);
        }
    }
}