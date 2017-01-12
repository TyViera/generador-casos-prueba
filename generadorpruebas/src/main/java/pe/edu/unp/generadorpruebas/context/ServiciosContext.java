package pe.edu.unp.generadorpruebas.context;

import pe.edu.unp.generadorpruebas.servicio.ArchivoServicio;
import pe.edu.unp.generadorpruebas.servicio.CompilacionServicio;
import pe.edu.unp.generadorpruebas.servicio.EjecucionServicio;
import pe.edu.unp.generadorpruebas.servicio.EjecutorComandoServicio;
import pe.edu.unp.generadorpruebas.servicio.PruebaServicio;

public class ServiciosContext {

    private ArchivoServicio archivoServicio;
    private CompilacionServicio compilacionServicio;
    private EjecucionServicio ejecucionServicio;
    private EjecutorComandoServicio ejecutorComandoServicio;
    private PruebaServicio pruebaComandoServicio;

    private ServiciosContext() {
    }

    public void iniciarServicios(){
        //...
    }
    
    public ArchivoServicio getArchivoServicio() {
        return archivoServicio;
    }

    public CompilacionServicio getCompilacionServicio() {
        return compilacionServicio;
    }

    public EjecucionServicio getEjecucionServicio() {
        return ejecucionServicio;
    }

    public EjecutorComandoServicio getEjecutorComandoServicio() {
        return ejecutorComandoServicio;
    }

    public PruebaServicio getPruebaComandoServicio() {
        return pruebaComandoServicio;
    }

    public static ServiciosContext getInstance() {
        return EjecutorGeneradorPruebasHolder.INSTANCE;
    }

    private static class EjecutorGeneradorPruebasHolder {

        private static final ServiciosContext INSTANCE = new ServiciosContext();
    }

}
