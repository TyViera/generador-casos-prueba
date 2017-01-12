package pe.edu.unp.generadorpruebas.modelo;

import java.io.Serializable;

public class ParametroMetodo implements Serializable {

    private String nombre;
    private Object value;
    private Class type;

    public ParametroMetodo() {
    }

    public ParametroMetodo(String nombre, Object value, Class type) {
        this.nombre = nombre;
        this.value = value;
        this.type = type;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

}
