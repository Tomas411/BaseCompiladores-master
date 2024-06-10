package compiladores;

import java.util.*;

<<<<<<< HEAD
=======
// Enum para los tipos de datos
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
enum TipoDato {
    INT,
    CHAR,
    DOUBLE,
    VOID
}

<<<<<<< HEAD
=======
// Clase Identificador
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
class Identificador {
    protected String nombre;
    protected TipoDato tipoDato;
    protected boolean inicializada;
    protected boolean utilizada;

    public Identificador(String nombre, TipoDato tipoDato) {
        this.nombre = nombre;
        this.tipoDato = tipoDato;
        this.inicializada = false;
        this.utilizada = false;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoDato getTipoDato() {
        return tipoDato;
    }

    public void setInicializada(boolean inicializada) {
        this.inicializada = inicializada;
    }

    public void setUtilizada(boolean utilizada) {
        this.utilizada = utilizada;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tipo: " + tipoDato + ", Inicializada: " + inicializada + ", Utilizada: " + utilizada;
    }
}

<<<<<<< HEAD
=======
// Clase Variable que hereda de Identificador
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
class Variable extends Identificador {
    public Variable(String nombre, TipoDato tipoDato) {
        super(nombre, tipoDato);
    }
}

<<<<<<< HEAD
=======
// Clase Funcion que hereda de Identificador
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
class Funcion extends Identificador {
    private List<TipoDato> argumentos;

    public Funcion(String nombre, TipoDato tipoDato, List<TipoDato> argumentos) {
        super(nombre, tipoDato);
        this.argumentos = argumentos;
    }

    public List<TipoDato> getArgumentos() {
        return argumentos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Argumentos: " + argumentos;
    }
}

<<<<<<< HEAD
=======
// Clase Contexto
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
class Contexto {
    private Map<String, Identificador> identificadores;

    public Contexto() {
        this.identificadores = new HashMap<>();
    }

    public void addIdentificador(Identificador identificador) {
        identificadores.put(identificador.getNombre(), identificador);
    }

    public Identificador buscarIdentificador(Identificador id) {
        for (Identificador identificador : identificadores.values()) {
            if (identificador.getNombre().equals(id.getNombre()) && identificador.getTipoDato() == id.getTipoDato()) {
                return identificador;
            }else if(identificador.getNombre().equals(id.getNombre()) && id.getTipoDato() == null){
                return identificador;
            }

        }
        return null;
    }

    public Map<String, Identificador> getIdentificadores() {
        return identificadores;
    }
}

<<<<<<< HEAD
=======

// Clase TablaSimbolos
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
class TablaSimbolos {
    private List<Contexto> contextos;

    public TablaSimbolos() {
        this.contextos = new ArrayList<>();
        this.contextos.add(new Contexto());
    }

    public void addContexto() {
        contextos.add(new Contexto());
    }

    public void delContexto() {
        if (contextos.size() > 1) {
            contextos.remove(contextos.size() - 1);
        }
    }
    

    public Identificador buscarIdentificador(Identificador id) {
        for (int i = contextos.size() - 1; i >= 0; i--) {
            Identificador identificador = contextos.get(i).buscarIdentificador(id);
<<<<<<< HEAD
            if (identificador != null) { 
=======
            if (identificador != null) {
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
                return identificador;
            }
        }
        return null;
    }

    public TipoDato buscarTipoIdentificador(String nombre) {
        Identificador id = new Identificador(nombre, null);
        
        for (int i = contextos.size() - 1; i >= 0; i--) {
            Identificador encontrado = contextos.get(i).buscarIdentificador(id);
            if (encontrado != null) {
                return encontrado.getTipoDato();
            }
        }
        
        return null;
    }

    public void identificadorInicializado(Identificador id) {
        for (int i = contextos.size() - 1; i >= 0; i--) {
<<<<<<< HEAD
            Identificador identificador = contextos.get(i).buscarIdentificador(id);
            if (identificador != null) {
                identificador.setInicializada(true);
=======
            Identificador encontrado = contextos.get(i).buscarIdentificador(id);
            if (encontrado != null) {
                encontrado.setInicializada(true);
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
                return;
            }
        }
    }

<<<<<<< HEAD
    public List<Contexto> getContextos() {
        return contextos;
    }
    

    public void identificadorUtilizado(Identificador id) {
        for (int i = contextos.size() - 1; i >= 0; i--) {
            Identificador identificador = contextos.get(i).buscarIdentificador(id);
            if (identificador != null) {
                identificador.setUtilizada(true);
                return;
            }
        }
    }

    
=======
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2

    public Identificador buscarIdentificadorLocal(Identificador id) {
        return contextos.get(contextos.size() - 1).buscarIdentificador(id);
    }

    public void addIdentificador(Identificador identificador) {
        contextos.get(contextos.size() - 1).addIdentificador(identificador);
    }
<<<<<<< HEAD
=======

    public void print() {
        for (Contexto contexto : contextos) {
            for (Map.Entry<String, Identificador> entry : contexto.getIdentificadores().entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
>>>>>>> 731b758be6dd0c7b38d5228c177cfb13a88fa4f2
}
