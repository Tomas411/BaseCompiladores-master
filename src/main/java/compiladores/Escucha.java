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
<<<<<<< HEAD
        Set<Identificador> allIdentificadores = new HashSet<>();
        for (Contexto contexto : tablaSimbolos.getContextos()) {
            allIdentificadores.addAll(contexto.getIdentificadores().values());
        }

        // Verificar si han sido utilizados
        for (Identificador id : allIdentificadores) {
            if (!id.utilizada) {
                System.out.println("Warning semántico: El identificador " + id.nombre + " de tipo " + id.tipoDato + " ha sido declarado pero no utilizado.");
            }
        }

        tablaSimbolos.delContexto();
    }


=======
        tablaSimbolos.delContexto();
    }

>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
    @Override
    public void exitParametro(compiladoresParser.ParametroContext ctx){
        String tipoDatoStr = ctx.tipo().getText();
        
        TipoDato td;
        try {
            td = TipoDato.valueOf(tipoDatoStr.toUpperCase());
        } catch (IllegalArgumentException e) {
<<<<<<< HEAD
=======
            System.out.println("ERROR, Tipo de dato no válido: " + tipoDatoStr + " en linea: " + ctx.ID().getSymbol().getLine());
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
            return;
        }
        
        Identificador id = new Identificador(ctx.ID().toString(), td);

        if(tablaSimbolos.buscarIdentificador(id) == null){
            tablaSimbolos.addIdentificador(id);
        } else {
<<<<<<< HEAD
            System.out.println("Error semántico, La variable " + id.tipoDato + " " + id.nombre + " ya existe. linea: " + ctx.ID().getSymbol().getLine());
        }
    }

    @Override 
    public void exitDeclaracion(compiladoresParser.DeclaracionContext ctx) { 
        if(ctx.declaracion_continua() != null && ctx.declaracion_continua().asignacion_continua() != null && ctx.parametros().parametro() != null){
            String nombre = ctx.parametros().parametro().ID().toString();
            TipoDato tipo = tablaSimbolos.buscarTipoIdentificador(nombre);
            
            if (tipo != null) {
                Identificador id = new Identificador(nombre, tipo);
                tablaSimbolos.identificadorInicializado(id);
            } else {
                System.out.println("Error semántico, no se puede asignar un valor a una variable no creada. Identificador: " + nombre + " línea: " + ctx.parametros().parametro().ID().getSymbol().getLine());
            }
=======
            System.out.println("ERROR, La variable " + ctx.ID().toString() + " ya existe. linea: " + ctx.ID().getSymbol().getLine());
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
        }
    }


    @Override
    public void exitAsignacion(compiladoresParser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();

        TipoDato tipo = tablaSimbolos.buscarTipoIdentificador(nombre);

        if (tipo != null) {
            Identificador id = new Identificador(nombre, tipo);
            tablaSimbolos.identificadorInicializado(id);
<<<<<<< HEAD
        } else {
            System.out.println("Error semántico, no se puede asignar un valor a una variable no creada. Identificador: " + nombre + " línea: " + ctx.ID().getSymbol().getLine());
        }
    }

=======
            System.out.println("inicializada " + id.getTipoDato().toString() + " " + id.getNombre() + " línea: " + ctx.ID().getSymbol().getLine());
        } else {
            System.out.println("Error, no se puede asignar un valor a una variable no creada. Identificador: " + nombre + " línea: " + ctx.ID().getSymbol().getLine());
        }
    }


>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
    @Override
    public void exitLlamada_funcion(compiladoresParser.Llamada_funcionContext ctx) {
        String nombre = ctx.ID().getText();
        boolean encontrado = false;

        for (TipoDato tipo : TipoDato.values()) {
            Identificador id = new Identificador(nombre, tipo);
<<<<<<< HEAD
            if (tablaSimbolos.buscarIdentificador(id) != null && tablaSimbolos.buscarIdentificador(id).inicializada == false) {
                encontrado = true;
                tablaSimbolos.identificadorUtilizado(id);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Error semántico, no se puede usar una funcion no creada. Identificador: " + nombre + " línea: " + ctx.ID().getSymbol().getLine());
        }
    }

    @Override 
    public void exitArgumentos(compiladoresParser.ArgumentosContext ctx) { 
        if(ctx.expresion() != null){
            Identificador id = salirExpresion(ctx.expresion());
            if(id == null){
                if(ctx.expresion().oal().ID() != null && ctx.expresion().oal().ID().getSymbol() != null)
                System.out.println("Error semántico en argumentos, no se puede comparar variables no creadas. Identificador:  " + ctx.expresion().oal().ID() + " línea: " + ctx.expresion().oal().ID().getSymbol().getLine());
            } else 
            if(id.inicializada == false){
                if(ctx.expresion().oal().ID() != null && ctx.expresion().oal().ID().getSymbol() != null)
                System.out.println("Error semántico en argumentos, no se puede comparar variables no inicializada. Identificador:  " + ctx.expresion().oal().ID() + " línea: " + ctx.expresion().oal().ID().getSymbol().getLine());
            }else tablaSimbolos.identificadorUtilizado(id);
        }
    }
    

    @Override 
    public void exitIf(compiladoresParser.IfContext ctx) {
        Identificador id = salirExpresion(ctx.expresion());
        if(id == null){
            if(ctx.expresion().oal().ID() != null && ctx.expresion().oal().ID().getSymbol() != null)
            System.out.println("Error semántico en If, no se puede comparar variables no creadas. Identificador:  " + ctx.expresion().oal().ID() + " línea: " + ctx.expresion().oal().ID().getSymbol().getLine());
        } else 
        if(id.inicializada == false){
            if(ctx.expresion().oal().ID() != null && ctx.expresion().oal().ID().getSymbol() != null)
            System.out.println("Error semántico en If, no se puede comparar variables no inicializada. Identificador:  " + ctx.expresion().oal().ID() + " línea: " + ctx.expresion().oal().ID().getSymbol().getLine());
        }else tablaSimbolos.identificadorUtilizado(id);
    }

    @Override 
    public void exitFor_continua(compiladoresParser.For_continuaContext ctx) { 
        if(ctx.expresion() != null){
            Identificador id = salirExpresion(ctx.expresion());
            if(id == null){
                if(ctx.expresion().oal().ID() != null && ctx.expresion().oal().ID().getSymbol() != null)
                System.out.println("Error semántico en For, no se puede comparar variables no creadas. Identificador:  " + ctx.expresion().oal().ID() + " línea: " + ctx.expresion().oal().ID().getSymbol().getLine());
            } else 
            if(id.inicializada == false){
                if(ctx.expresion().oal().ID() != null && ctx.expresion().oal().ID().getSymbol() != null)
                System.out.println("Error semántico en For, no se puede comparar variables no inicializada. Identificador:  " + ctx.expresion().oal().ID() + " línea: " + ctx.expresion().oal().ID().getSymbol().getLine());
            } else tablaSimbolos.identificadorUtilizado(id);
        }
    }
    
    Identificador salirExpresion(compiladoresParser.ExpresionContext ctx){
        Identificador id = null;
        String nombre = null;
        if(ctx.oal().ID() != null) nombre = ctx.oal().ID().getText();
        else if(ctx.oal().ID() != null) nombre = ctx.oal().ID().getText();

        for (TipoDato tipo : TipoDato.values()) {
            id = tablaSimbolos.buscarIdentificador(new Identificador(nombre, tipo));
            if(id != null)
            return id;
        } 
        return null;
=======
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
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
        
    }
}
