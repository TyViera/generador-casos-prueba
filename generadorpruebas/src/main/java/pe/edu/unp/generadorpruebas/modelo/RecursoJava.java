package pe.edu.unp.generadorpruebas.modelo;

public abstract class RecursoJava {

    private String rutaBase;
    private String nombre;

    public RecursoJava() {
        this.rutaBase = null;
        this.nombre = null;
    }

    public RecursoJava(String rutaArchivo) {
        super();
        this.rutaBase = rutaArchivo;
    }

    public RecursoJava(String rutaArchivo, String nombre) {
        this.rutaBase = rutaArchivo;
        this.nombre = nombre;
    }

    public String getRutaBase() {
        return rutaBase;
    }

    public void setRutaBase(String rutaBase) {
        this.rutaBase = rutaBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
