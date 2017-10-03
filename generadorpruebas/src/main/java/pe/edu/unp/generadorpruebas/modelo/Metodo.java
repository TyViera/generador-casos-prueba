package pe.edu.unp.generadorpruebas.modelo;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Metodo implements Serializable {

    private Clase clase;
    private String nombre;
    private String codigoJava;
    private final Method metodoEjecutable;
    private List<ParametroMetodo> listaParametros;

    public Metodo(Clase clase, String nombre, Method metodoEjecutable) {
        this.clase = clase;
        this.nombre = nombre;
        this.metodoEjecutable = metodoEjecutable;
        listaParametros = new ArrayList<>();
    }

    public Metodo(Clase clase, String nombre, Method metodoEjecutable, List<ParametroMetodo> listaParametros) {
        this.clase = clase;
        this.nombre = nombre;
        this.metodoEjecutable = metodoEjecutable;
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

    public Method getMetodoEjecutable() {
        return metodoEjecutable;
    }

    public String getCodigoJava() {
        return codigoJava;
    }

    public void setCodigoJava(String codigoJava) {
        this.codigoJava = codigoJava;
    }

    public List<ParametroMetodo> getListaParametros() {
        return listaParametros;
    }

    public void setListaParametros(List<ParametroMetodo> listaParametros) {
        this.listaParametros = listaParametros;
    }

    public Boolean agregarParametro(ParametroMetodo parametroMetodo) {
        return this.listaParametros.add(parametroMetodo);
    }

}
