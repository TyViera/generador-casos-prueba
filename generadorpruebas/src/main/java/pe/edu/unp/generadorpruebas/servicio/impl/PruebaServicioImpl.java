package pe.edu.unp.generadorpruebas.servicio.impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.junit.runner.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.unp.generadorpruebas.exception.EjecucionPruebaException;
import pe.edu.unp.generadorpruebas.modelo.CasoDePrueba;
import pe.edu.unp.generadorpruebas.modelo.Clase;
import pe.edu.unp.generadorpruebas.modelo.Metodo;
import pe.edu.unp.generadorpruebas.modelo.ParametroMetodo;
import pe.edu.unp.generadorpruebas.modelo.Prueba;
import pe.edu.unp.generadorpruebas.modelo.PruebaMetodo;
import pe.edu.unp.generadorpruebas.modelo.RecursoJava;
import pe.edu.unp.generadorpruebas.servicio.EjecutorComandoMavenServicio;
import pe.edu.unp.generadorpruebas.servicio.EjecutorComandoServicio;
import pe.edu.unp.generadorpruebas.servicio.PruebaServicio;
import pe.edu.unp.generadorpruebas.util.ConfiguracionProperties;
import pe.edu.unp.generadorpruebas.util.Constantes;
import pe.edu.unp.generadorpruebas.util.GeneradorUtil;
import pe.edu.unp.generadorpruebas.util.ResultadoComando;

@Service
public class PruebaServicioImpl implements PruebaServicio {

    private final Logger logger = Logger.getLogger(getClass());

    public static final String PLANTILLA_VELOCITY_TEST = "jUnitTestTemplate.vm";
    public static final String PLANTILLA_VELOCITY_RUNNER = "junitRunnerTemplate.vm";

    @Autowired
    private EjecutorComandoMavenServicio ejecutorComandoMavenServicio;

    @Autowired
    private EjecutorComandoServicio ejecutorComandoServicio;

    @Autowired
    private VelocityEngine velocityEngine;

    private final ConfiguracionProperties properties = ConfiguracionProperties.getInstance();

    @Override
    public ResultadoComando ejecutarPrueba(RecursoJava proyecto, Prueba prueba) throws EjecucionPruebaException {
        //crear el archivo de la prueba
        String codigo, codigoRunner, rutaSalida;
        ResultadoComando resultadoComando;
        resultadoComando = null;
        try {
            //1.- para la prueba, crear el archivo java segun el modelo JUNITTestTemplate
            codigo = obtenerContenidoArchivo(prueba);
            codigoRunner = obtenerContenidoArchivoRunner(prueba);
//            System.out.println(codigo);
//            System.out.println(codigoRunner);
            //2,. ubicar ruta de creacion de archivo(s)

            //3.- Si es clase -> agregar al classpath
            //    Si es proyecto -> ejectutar con comandos maven
            //4.- ejecutar el comando de maven que ejecuta la prueba
            if (proyecto instanceof Clase) {
                comprobarExistenciaCarpetaSalida();
                copiarRecursosDeProyecto(proyecto, properties.getRutaSalida() + File.separator + proyecto.getNombre() + Constantes.EXTENSION_JAVA);
                //es solo una clase, hay que copiarla en la ruta indicada
                agregarDependenciasJUnitJars(properties.getRutaSalida());
                //agregar la clase creada
                escribirPruebaCreada(prueba.getTestClassName(), codigo);
                escribirPruebaCreada(Constantes.NOMBRE_CLASE_RUNNER, codigoRunner);
                resultadoComando = ejecutarComandoCompilacion(Constantes.NOMBRE_CLASE_RUNNER);
                if (!resultadoComando.esResultadoExito()) {
                    return resultadoComando;
                }
                resultadoComando = ejecutarComandoEjecucion(Constantes.NOMBRE_CLASE_RUNNER);
            } else {
                rutaSalida = copiarRecursosDeProyecto(proyecto, properties.getRutaSalida());
                agregarDependenciasJUnitPomXml(rutaSalida);
//nazaret@ty-ubuntu-PC:~/cd$ javac -cp *.jar *.java
//nazaret@ty-ubuntu-PC:~/cd$ java -cp junit-4.10.jar:. TestEmployeeRunner->linux
//nazaret@ty-ubuntu-PC:~/cd$ java -cp junit-4.10.jar;. TestEmployeeRunner->windows
            }
            //5.- obtener y devolver resultados
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
            throw new EjecucionPruebaException(ex);
        }
        return resultadoComando;
//        ResultadoComando resultadoComando;
//        Proyecto proyectoMaven;
//        try {
//            
//            proyectoMaven = (Proyecto) proyecto;
//            
//            
//            
//            resultadoComando = ejecutorComandoMavenServicio.test(proyectoMaven, prueba);
//            //5.- obtener y devolver resultados
//            return resultadoComando;
//        } catch (GeneradorException ex) {
//            logger.error(ex, ex);
//            throw new EjecucionPruebaException("Ocurrió un error al ejecutar la prueba");
//        }
    }

    private String obtenerContenidoArchivo(Prueba prueba) {
        Template template;
        VelocityContext velocityContext;
        Iterator it;
        StringWriter stringWriter;

        velocityContext = new VelocityContext();
        stringWriter = new StringWriter();
        template = velocityEngine.getTemplate(PLANTILLA_VELOCITY_TEST);

        velocityContext.put("packageName", prueba.getPackageName());
        velocityContext.put("extraImports", prueba.getExtraImports());
        velocityContext.put("testClassName", prueba.getTestClassName());
        velocityContext.put("setUpClassCode", prueba.getSetUpClassCode());
        velocityContext.put("tearDownClassCode", prueba.getTearDownClassCode());
        velocityContext.put("setUpCode", prueba.getSetUpCode());
        velocityContext.put("tearDownCode", prueba.getTearDownCode());
        velocityContext.put("testsCode", prueba.getTestsCode());

//        while (it.hasNext()) {
//            Map.Entry e = (Map.Entry) it.next();
//            velocityContext.put(e.getKey().toString(), e.getValue());
//        }
        velocityEngine.init();

        template.merge(velocityContext, stringWriter);
        return stringWriter.toString();
    }

    private String obtenerContenidoArchivoRunner(Prueba prueba) {
        Template template;
        VelocityContext velocityContext;
        StringWriter stringWriter;

        velocityContext = new VelocityContext();
        stringWriter = new StringWriter();
        template = velocityEngine.getTemplate(PLANTILLA_VELOCITY_RUNNER);

        velocityContext.put("testClassName", prueba.getTestClassName());

        velocityEngine.init();

        template.merge(velocityContext, stringWriter);
        return stringWriter.toString();
    }

    private String copiarRecursosDeProyecto(RecursoJava proyecto, String rutaDestino) throws FileNotFoundException, IOException {
        File fileOrigen, fileDestino;
        fileOrigen = new File(proyecto.getRutaFisica());
        fileDestino = new File(rutaDestino);

//        Files.deleteIfExists(Paths.get(Constantes.BASE_PATH_OUTPUT_TEST));
        Files.deleteIfExists(fileDestino.toPath());

        if (fileOrigen.exists()) {
            Files.copy(Paths.get(fileOrigen.getAbsolutePath()), Paths.get(fileDestino.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
        } else {
            throw new FileNotFoundException("El archivo no existe");
        }
        return fileDestino.getAbsolutePath();
    }

    @Override
    public Prueba crearPrueba(CasoDePrueba casoDePrueba) {
        Prueba prueba;
        prueba = new Prueba(casoDePrueba.getId());
        prueba.addTestCode(crearPruebaMetodo(casoDePrueba, 0));
        return prueba;
    }

    @Override
    public Prueba crearPruebas(Metodo metodo) {
        Prueba prueba;
        Integer index = 0;
        prueba = new Prueba(metodo.getClase().getNombre());
        for (CasoDePrueba casoDePrueba : metodo.getCasosPrueba()) {
            prueba.addTestCode(crearPruebaMetodo(casoDePrueba, index));
            index++;
        }
        return prueba;
    }

    @Override
    public Prueba crearPruebas(Metodo metodo, List<CasoDePrueba> solucionesOptimas) {
        Prueba prueba;
        Integer index = 0;
        prueba = new Prueba(metodo.getClase().getNombre());
        for (CasoDePrueba casoDePrueba : solucionesOptimas) {
            prueba.addTestCode(crearPruebaMetodo(casoDePrueba, index));
            index++;
        }
        return prueba;
    }

    @Override
    public List<Prueba> crearPruebas(List<CasoDePrueba> solucionesOptimas) {
        List<Prueba> listaPruebas;
        listaPruebas = new ArrayList<>();
        solucionesOptimas.forEach((casoDePrueba) -> {
            listaPruebas.add(crearPrueba(casoDePrueba));
        });
        return listaPruebas;
    }

    private PruebaMetodo crearPruebaMetodo(CasoDePrueba casoDePrueba, Integer index) {
        PruebaMetodo pruebaMetodo;
        StringBuffer buffer;
        String nombreClase, variablePrincipal, codigoMetodo, nombreMetodo;
        List<String> parametrosEntradaMetodo;
        Integer indexVar = 0;

        nombreMetodo = casoDePrueba.getCaminoEjecucion().getMetodo().getNombre();
        nombreClase = casoDePrueba.getCaminoEjecucion().getMetodo().getClase().getNombre();
        variablePrincipal = "_" + nombreClase.toLowerCase();

        parametrosEntradaMetodo = new ArrayList<>();
        codigoMetodo = "";
        for (ParametroMetodo parametro : casoDePrueba.getCaminoEjecucion().getParametros()) {
            String var, clasePar;
            clasePar = parametro.getType().getSimpleName();
//            var = "_" + clasePar.toLowerCase() + "Value" + (new Random()).nextInt(Integer.MAX_VALUE / 2);
            var = "_" + clasePar.toLowerCase() + "Value" + indexVar;
            if (esDatoPrimitivo(clasePar) || esDatoString(clasePar)) {
                codigoMetodo += clasePar + " " + var + " = " + parametro.getValue() + ";\n";
            } else {
                codigoMetodo += clasePar + " " + var + " = new " + clasePar + "(" + parametro.getValue() + ");\n";
            }
            parametrosEntradaMetodo.add(var);
            indexVar++;
        }
        //declarar variables que serviran de parametros

        codigoMetodo += String.format("%1$s %2$s = new %1$s();", nombreClase, variablePrincipal) + "\n";
        codigoMetodo += String.format("%1$s.%2$s(", variablePrincipal, nombreMetodo);
        if (parametrosEntradaMetodo.size() > 0) {
            codigoMetodo += parametrosEntradaMetodo.stream().reduce((x, y) -> {
                return String.format("%1$s, %2$s", x, y);
            }).get();
        }
        codigoMetodo += ");\n";

        pruebaMetodo = new PruebaMetodo();
        pruebaMetodo.setNombre("test_" + index);
        pruebaMetodo.setCodigo(codigoMetodo);
//        System.out.println(pruebaMetodo);
        return pruebaMetodo;
    }

    private boolean esDatoPrimitivo(String clasePar) {
        return (clasePar.equals(boolean.class.getName())
                || clasePar.equals(byte.class.getName())
                || clasePar.equals(short.class.getName())
                || clasePar.equals(int.class.getName())
                || clasePar.equals(long.class.getName())
                || clasePar.equals(float.class.getName())
                || clasePar.equals(double.class.getName()));
    }

    private boolean esDatoString(String clasePar) {
        return (clasePar.equals(String.class.getSimpleName()));
    }

    private void agregarDependenciasJUnitJars(String rutaSalida) throws IOException {
        String pathSalida = rutaSalida + File.separator + "junit-4.10.jar";
        String pathEntrada = properties.getRutaEntrada() + File.separator + "junit-4.10.jar";
        Files.copy(Paths.get(pathEntrada), Paths.get(pathSalida), StandardCopyOption.REPLACE_EXISTING);
    }

    private void agregarDependenciasJUnitPomXml(String rutaSalida) {

    }

    private void comprobarExistenciaCarpetaSalida() throws IOException {
        File file = new File(properties.getRutaSalida());
        if (file.exists()) {
            FileUtils.deleteDirectory(file);
        }
        file.mkdirs();
    }

    private ResultadoComando ejecutarComandoCompilacion(String className) throws IOException, InterruptedException {
        String comando;
        OutputStream out;

        out = new ByteArrayOutputStream();//PipedOutputStream();
        comando = "javac -cp ";
        if (GeneradorUtil.sistemaOperativoEsLinux()) {
            comando = comando + ".:";
        } else if (GeneradorUtil.sistemaOperativoEsWindows()) {
            comando = comando + ".;";
        } else {
            throw new IOException("SO no soportado");
        }
        comando = comando + "junit-4.10.jar " + className + Constantes.EXTENSION_JAVA;
        return ejecutorComandoServicio.ejecutarComando(comando, properties.getRutaSalida() + File.separator, out);
        //"javac -cp .:junit-4.10.jar " + className + Constantes.EXTENSION_JAVA, properties.getRutaSalida() + File.separator, System.out);
    }

    private ResultadoComando ejecutarComandoEjecucion(String className) throws IOException, InterruptedException, EjecucionPruebaException {
        String comando;
        OutputStream out;

        out = new ByteArrayOutputStream();//PipedOutputStream();
        comando = "java -cp junit-4.10.jar";
        if (GeneradorUtil.sistemaOperativoEsLinux()) {
            comando = comando + ":. ";
        } else if (GeneradorUtil.sistemaOperativoEsWindows()) {
            comando = comando + ";. ";
        } else {
            throw new EjecucionPruebaException("SO no soportado");
        }
        comando = comando + className;
//        System.out.println(comando);
        return ejecutorComandoServicio.ejecutarComando(comando, properties.getRutaSalida() + File.separator, out);

    }

    private void escribirPruebaCreada(String className, String codigo) throws FileNotFoundException, IOException {
        File file = new File(properties.getRutaSalida() + File.separator + className + Constantes.EXTENSION_JAVA);
        try (FileOutputStream fos = new FileOutputStream(file); PrintStream ps = new PrintStream(fos)) {
            ps.println(codigo);
        }
    }

    @Override
    public Result leerResultadosPruebas() throws ClassNotFoundException, FileNotFoundException, IOException {
        try (FileInputStream fis = new FileInputStream(properties.getRutaSalida() + File.separator + "data.dat"); ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Result) ois.readUnshared();
        }
    }

}
