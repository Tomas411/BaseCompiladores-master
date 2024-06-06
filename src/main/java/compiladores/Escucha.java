package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.Token;
import compiladores.compiladoresBaseListener;
import compiladores.compiladoresParser;

import java.util.*;

public class Escucha extends compiladoresBaseListener {
    private TablaSimbolos tablaSimbolos = new TablaSimbolos();
    private List<String> errores = new ArrayList<>();
    private ParseTreeProperty<TipoDato> tipos = new ParseTreeProperty<>();

    @Override
    public void enterPrograma(compiladoresParser.ProgramaContext ctx) {
    }

    @Override
    public void enterBloque(compiladoresParser.BloqueContext ctx) {
        tablaSimbolos.addContexto();
    }

    @Override
    public void exitBloque(compiladoresParser.BloqueContext ctx) {
        tablaSimbolos.delContexto();
    }

    @Override
    public void exitPrograma(compiladoresParser.ProgramaContext ctx) {
        tablaSimbolos.delContexto();
    }

    @Override
    public void exitParametro(compiladoresParser.ParametroContext ctx){
        String tipoDatoStr = ctx.tipo().getText();
        
        TipoDato td;
        try {
            td = TipoDato.valueOf(tipoDatoStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR, Tipo de dato no válido: " + tipoDatoStr + " en linea: " + ctx.ID().getSymbol().getLine());
            return;
        }
        
        Identificador id = new Identificador(ctx.ID().toString(), td);

        if(tablaSimbolos.buscarIdentificador(id) == null){
            tablaSimbolos.addIdentificador(id);
        } else {
            System.out.println("ERROR, La variable " + ctx.ID().toString() + " ya existe. linea: " + ctx.ID().getSymbol().getLine());
        }
    }


    @Override
    public void exitAsignacion(compiladoresParser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();

        TipoDato tipo = tablaSimbolos.buscarTipoIdentificador(nombre);

        if (tipo != null) {
            Identificador id = new Identificador(nombre, tipo);
            tablaSimbolos.identificadorInicializado(id);
            System.out.println("inicializada " + id.getTipoDato().toString() + " " + id.getNombre() + " línea: " + ctx.ID().getSymbol().getLine());
        } else {
            System.out.println("Error, no se puede asignar un valor a una variable no creada. Identificador: " + nombre + " línea: " + ctx.ID().getSymbol().getLine());
        }
    }


    @Override
    public void exitLlamada_funcion(compiladoresParser.Llamada_funcionContext ctx) {
        String nombre = ctx.ID().getText();
        boolean encontrado = false;

        for (TipoDato tipo : TipoDato.values()) {
            Identificador id = new Identificador(nombre, tipo);
            if (tablaSimbolos.buscarIdentificador(id).inicializada == false) {
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Error, no se puede asignar un valor a una variable no creada. Identificador: " + nombre + " línea: " + ctx.ID().getSymbol().getLine());
        }
    }


    @Override
    public void exitOal(compiladoresParser.OalContext ctx) {
        if(ctx.ID() != null){
            String nombre = ctx.ID().getText();
            boolean encontrado = false;

            for (TipoDato tipo : TipoDato.values()) {
                Identificador id = new Identificador(nombre, tipo);
                if (tablaSimbolos.buscarIdentificador(id) != null) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Error, no se puede asignar un valor a una variable no creada. Identificador: " + nombre + " línea: " + ctx.ID().getSymbol().getLine());
            }
        }
        
    }
}
