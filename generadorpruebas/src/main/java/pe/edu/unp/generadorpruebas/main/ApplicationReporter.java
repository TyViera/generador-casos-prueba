/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.main;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ApplicationReporter {

    /**
     * Logger para la clase.
     */
    private static final Logger LOGGER
            = Logger.getLogger(ApplicationReporter.class);

    @Scheduled(fixedDelay = 10000)
    public void reportApplication() {
        LOGGER.info("La aplicacion esta corriendo.");
    }
}
