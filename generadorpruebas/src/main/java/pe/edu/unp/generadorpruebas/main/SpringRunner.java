package pe.edu.unp.generadorpruebas.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import pe.edu.unp.generadorpruebas.context.Bootstrap;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pe.edu.unp.generadorpruebas.util.ConfiguracionProperties;
import pe.edu.unp.generadorpruebas.util.Constantes;
import pe.edu.unp.generadorpruebas.vista.FormularioPrincipal;

public class SpringRunner {

    private static final Logger LOGGER = Logger.getLogger(SpringRunner.class);

    private static AnnotationConfigApplicationContext appContext;

    public static void iniciarSpring() {
        initSpringContextWithAnnotations();
    }

    public static void iniciarArchivoProperties() {
        File file = new File(Constantes.ARCHIVO_PROPERTIES);
        ConfiguracionProperties properties = ConfiguracionProperties.getInstance();
        Properties props = new Properties();
        if (!file.exists()) {
            try (FileOutputStream out = new FileOutputStream(file)) {
                props.setProperty(Constantes.PROPIEDAD_CARPETA_ENTRADA, "");
                props.setProperty(Constantes.PROPIEDAD_CARPETA_SALIDA, "");
                props.store(out, null);
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        try (FileInputStream in = new FileInputStream(file)) {
            props = new Properties();
            props.load(in);
            in.close();
            properties.setRutaEntrada(props.getProperty(Constantes.PROPIEDAD_CARPETA_ENTRADA));
            properties.setRutaSalida(props.getProperty(Constantes.PROPIEDAD_CARPETA_SALIDA));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
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
