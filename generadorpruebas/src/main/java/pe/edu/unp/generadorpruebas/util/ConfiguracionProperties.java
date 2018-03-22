/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.util;

/**
 *
 * @author nazaret
 */
public class ConfiguracionProperties {

    private String rutaEntrada;
    private String rutaSalida;

    private ConfiguracionProperties() {
    }

    public String getRutaEntrada() {
        return rutaEntrada;
    }

    public void setRutaEntrada(String rutaEntrada) {
        this.rutaEntrada = rutaEntrada;
    }

    public String getRutaSalida() {
        return rutaSalida;
    }

    public void setRutaSalida(String rutaSalida) {
        this.rutaSalida = rutaSalida;
    }

    public static ConfiguracionProperties getInstance() {
        return ConfiguracionPropertiesHolder.INSTANCE;
    }

    private static class ConfiguracionPropertiesHolder {

        private static final ConfiguracionProperties INSTANCE = new ConfiguracionProperties();
    }
}
