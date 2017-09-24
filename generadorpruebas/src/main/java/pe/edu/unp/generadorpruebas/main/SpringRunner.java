package pe.edu.unp.generadorpruebas.main;

import pe.edu.unp.generadorpruebas.context.Bootstrap;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pe.edu.unp.generadorpruebas.vista.FormularioPrincipal;

public class SpringRunner {

    private static final Logger LOGGER = Logger.getLogger(SpringRunner.class);

    private static AnnotationConfigApplicationContext appContext;

    public static void iniciarSpring() {
        initSpringContextWithAnnotations();
    }

    private static void initSpringContextWithAnnotations() {
        appContext = new AnnotationConfigApplicationContext(Bootstrap.class);
        appContext.start();
        LOGGER.info("A continuacion registramos el shutdown hook.");
        appContext.registerShutdownHook();
    }

    public static FormularioPrincipal obtenerFormularioPrincipal() {
        return appContext.getBean(FormularioPrincipal.class);
    }

}
