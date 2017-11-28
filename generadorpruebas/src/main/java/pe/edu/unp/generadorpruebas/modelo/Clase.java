package pe.edu.unp.generadorpruebas.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Clase extends RecursoJava implements Serializable {

    private String nombreCompleto;

    public Clase() {
    }

    public Clase(String rutaArchivo) {
        super(rutaArchivo);
    }

    public Clase(String rutaArchivo, String nombre) {
        super(rutaArchivo, nombre);
    }

    public Clase(String rutaArchivo, String nombre, String nombreCompleto) {
        super(rutaArchivo, nombre);
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.getRutaBase());
        hash = 29 * hash + Objects.hashCode(this.nombreCompleto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clase other = (Clase) obj;
        if (!Objects.equals(getRutaBase(), other.getRutaBase())) {
            return false;
        }
        if (!Objects.equals(this.nombreCompleto, other.nombreCompleto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clase{" + nombreCompleto + '}';
    }

}
