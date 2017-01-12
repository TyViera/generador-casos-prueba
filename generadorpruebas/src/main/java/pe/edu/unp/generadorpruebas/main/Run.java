package pe.edu.unp.generadorpruebas.main;

import pe.edu.unp.generadorpruebas.context.ServiciosContext;

public class Run {

    public static void main(String[] args) {
        ServiciosContext ejecutorGeneradorPruebas;
        ejecutorGeneradorPruebas = ServiciosContext.getInstance();
        ejecutorGeneradorPruebas.iniciarServicios();
    }

}
