package compiladores;


import java.util.*;

public class Escucha extends compiladoresBaseListener {
    private TablaSimbolos tablaSimbolos = new TablaSimbolos();

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


    @Override
    public void exitParametro(compiladoresParser.ParametroContext ctx){
        String tipoDatoStr = ctx.tipo().getText();
        
        TipoDato td;
        try {
            td = TipoDato.valueOf(tipoDatoStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            return;
        }
        
        Identificador id = new Identificador(ctx.ID().toString(), td);

        if(tablaSimbolos.buscarIdentificador(id) == null){
            tablaSimbolos.addIdentificador(id);
        } else {
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
        }
    }


    @Override
    public void exitAsignacion(compiladoresParser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();

        TipoDato tipo = tablaSimbolos.buscarTipoIdentificador(nombre);

        if (tipo != null) {
            Identificador id = new Identificador(nombre, tipo);
            tablaSimbolos.identificadorInicializado(id);
        } else {
            System.out.println("Error semántico, no se puede asignar un valor a una variable no creada. Identificador: " + nombre + " línea: " + ctx.ID().getSymbol().getLine());
        }
    }

    @Override
    public void exitLlamada_funcion(compiladoresParser.Llamada_funcionContext ctx) {
        String nombre = ctx.ID().getText();
        boolean encontrado = false;

        for (TipoDato tipo : TipoDato.values()) {
            Identificador id = new Identificador(nombre, tipo);
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
        else if(ctx.oal().ID() != null) nombre = ctx.oal().ID().getText(); //tengo que fijarme esto

        for (TipoDato tipo : TipoDato.values()) {
            id = tablaSimbolos.buscarIdentificador(new Identificador(nombre, tipo));
            if(id != null)
            return id;
        } 
        return null;  
    }
}