package pe.edu.unp.generadorpruebas.modelo;

/**
 * Un camino de ejecución es ejectuar un metodo con ciertos parametros
 * @author nazaret
 */
public class CaminoEjecucion {
    
    private Metodo metodo;
    private ParametroMetodo parametros;

    public CaminoEjecucion(Metodo metodo, ParametroMetodo parametros) {
        this.metodo = metodo;
        this.parametros = parametros;
    }

    public Metodo getMetodo() {
        return metodo;
    }

    public void setMetodo(Metodo metodo) {
        this.metodo = metodo;
    }

    public ParametroMetodo getParametros() {
        return parametros;
    }

    public void setParametros(ParametroMetodo parametros) {
        this.parametros = parametros;
    }

    
    
    
    
}
