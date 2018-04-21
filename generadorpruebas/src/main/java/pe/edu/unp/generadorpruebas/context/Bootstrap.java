/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.context;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/*
 * Leemos los archivos de configuraci&oacute;n.
 */
@ImportResource(value = {
    "classpath:applicationContext.xml"
})
/*
 * Cargamos los beans desde los paquetes.
 */
@ComponentScan(basePackages = {"pe.edu.unp.generadorpruebas"},
        excludeFilters = {
            @ComponentScan.Filter(Configuration.class)})
@Configuration
/*
 * Habilita el scheduling en la aplicaci&oacute;n.
 */
@EnableScheduling
public class Bootstrap {

    private static final Logger LOGGER = Logger.getLogger(Bootstrap.class);

    @PostConstruct
    public void init() {
        LOGGER.info("Ha iniciado el contexto spring.");
    }

    @PreDestroy
    public void destroy() {
        LOGGER.info("El contexto esta a punto de ser destruido.");
    }

}
