package pe.edu.unp.generadorpruebas.modelo;

public class Proyecto extends RecursoJava {

    public Proyecto() {

    }

    public Proyecto(String ruta, String nombre) {
        super(ruta, nombre);
    }

    @Override
    public String getRutaFisica() {
        return this.getRutaBase();
    }

}
