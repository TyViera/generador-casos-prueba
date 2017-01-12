package pe.edu.unp.generadorpruebas.modelo;

import java.io.Serializable;
import java.util.List;

public class Metodo implements Serializable {

    private Clase clase;
    private String nombre;
    private List<ParametroMetodo> listaParametros;

    public Metodo() {
    }

    public Metodo(Clase clase, String nombre, List<ParametroMetodo> listaParametros) {
        this.clase = clase;
        this.nombre = nombre;
        this.listaParametros = listaParametros;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ParametroMetodo> getListaParametros() {
        return listaParametros;
    }

    public void setListaParametros(List<ParametroMetodo> listaParametros) {
        this.listaParametros = listaParametros;
    }

}
