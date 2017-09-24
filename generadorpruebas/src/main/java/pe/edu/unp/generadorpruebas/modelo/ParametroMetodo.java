package pe.edu.unp.generadorpruebas.modelo;

import java.io.Serializable;
import java.lang.reflect.Parameter;

public class ParametroMetodo implements Serializable {

    private String nombre;
    private Object value;
    private Class type;
    private final Parameter parametroEjecutable;

    public ParametroMetodo(Parameter parametroEjecutable) {
        this(parametroEjecutable.getName(), null, parametroEjecutable.getType(), parametroEjecutable);
    }

    public ParametroMetodo(String nombre, Object value, Class type, Parameter parametroEjecutable) {
        this.nombre = nombre;
        this.value = value;
        this.type = type;
        this.parametroEjecutable = parametroEjecutable;
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

    public Parameter getParametroEjecutable() {
        return parametroEjecutable;
    }

}
