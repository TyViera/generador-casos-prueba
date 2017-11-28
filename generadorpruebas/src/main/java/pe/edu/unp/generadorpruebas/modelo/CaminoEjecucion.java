package pe.edu.unp.generadorpruebas.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Un camino de ejecución es ejectuar un metodo con ciertos parametros
 *
 * @author nazaret
 */
public class CaminoEjecucion {

    private Metodo metodo;
    private List<ParametroMetodo> parametros;

    public CaminoEjecucion(CaminoEjecucion caminoEjecucion) {
        this.metodo = caminoEjecucion.metodo;
        this.parametros = new ArrayList<>(caminoEjecucion.parametros);
    }

    public CaminoEjecucion(Metodo metodo, List<ParametroMetodo> parametros) {
        this.metodo = metodo;
        this.parametros = parametros;
    }

    public Metodo getMetodo() {
        return metodo;
    }

    public void setMetodo(Metodo metodo) {
        this.metodo = metodo;
    }

    public List<ParametroMetodo> getParametros() {
        return parametros;
    }

    public void setParametros(List<ParametroMetodo> parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        return "CaminoEjecucion{" + "metodo=" + metodo + ", parametros=" + parametros + '}';
    }

}
