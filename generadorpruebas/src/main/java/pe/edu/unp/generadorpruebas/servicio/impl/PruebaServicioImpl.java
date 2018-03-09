package pe.edu.unp.generadorpruebas.servicio.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
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
import pe.edu.unp.generadorpruebas.util.Constantes;
import pe.edu.unp.generadorpruebas.util.GeneradorUtil;
import pe.edu.unp.generadorpruebas.util.ResultadoComando;

@Service
public class PruebaServicioImpl implements PruebaServicio {

    private final Logger logger = Logger.getLogger(getClass());

    public static final String PLANTILLA_VELOCITY = "jUnitTestTemplate.vm";

    @Autowired
    private EjecutorComandoMavenServicio ejecutorComandoMavenServicio;

    @Autowired
    private EjecutorComandoServicio ejecutorComandoServicio;

    @Autowired
    private VelocityEngine velocityEngine;

    @Override
    public ResultadoComando ejecutarPrueba(RecursoJava proyecto, Prueba prueba) throws EjecucionPruebaException {
        //crear el archivo de la prueba
        String codigo, rutaSalida;
        try {
            //1.- para la prueba, crear el archivo java segun el modelo JUNITTestTemplate
            codigo = obtenerContenidoArchivo(prueba);
            System.out.println(codigo);
            //2,. ubicar ruta de creacion de archivo(s)

            //3.- Si es clase -> agregar al classpath
            //    Si es proyecto -> ejectutar con comandos maven
            //4.- ejecutar el comando de maven que ejecuta la prueba
            if (proyecto instanceof Clase) {
                comprobarExistenciaCarpetaSalida();
                copiarRecursosDeProyecto(proyecto, Constantes.BASE_PATH_OUTPUT_TEST + File.separator + proyecto.getNombre() + Constantes.EXTENSION_JAVA);
                //es solo una clase, hay que copiarla en la ruta indicada
                agregarDependenciasJUnitJars(Constantes.BASE_PATH_OUTPUT_TEST);
                //agregar la clase creada
                escribirPruebaCreada(prueba, codigo);
                System.out.println(prueba.getTestClassName());
                ejecutarComandoCompilacion(proyecto.getNombre());
                ejecutarComandoCompilacion(prueba.getTestClassName());
//                System.out.println(ejecutarComandoEjecucion(proyecto).getGobbler().getResultadoComando());
            } else {
                rutaSalida = copiarRecursosDeProyecto(proyecto, Constantes.BASE_PATH_OUTPUT_TEST);
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
        return null;
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
        template = velocityEngine.getTemplate(PLANTILLA_VELOCITY);

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

    private String copiarRecursosDeProyecto(RecursoJava proyecto, String rutaDestino) throws FileNotFoundException, IOException {
        File fileOrigen, fileDestino;
        fileOrigen = new File(proyecto.getRutaFisica());
        fileDestino = new File(rutaDestino);

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
        prueba.addTestCode(crearPruebaMetodo(casoDePrueba));
        return prueba;
    }

    @Override
    public Prueba crearPruebas(Metodo metodo) {
        Prueba prueba;
        prueba = new Prueba(metodo.getClase().getNombre());
        metodo.getCasosPrueba().forEach((casoDePrueba) -> {
            prueba.addTestCode(crearPruebaMetodo(casoDePrueba));
        });
        return prueba;
    }

    @Override
    public Prueba crearPruebas(Metodo metodo, List<CasoDePrueba> solucionesOptimas) {
        Prueba prueba;
        prueba = new Prueba(metodo.getClase().getNombre());
        solucionesOptimas.forEach((casoDePrueba) -> {
            prueba.addTestCode(crearPruebaMetodo(casoDePrueba));
        });
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

    private PruebaMetodo crearPruebaMetodo(CasoDePrueba casoDePrueba) {
        PruebaMetodo pruebaMetodo;
        StringBuffer buffer;
        String nombreClase, variablePrincipal, codigoMetodo, nombreMetodo;
        List<String> parametrosEntradaMetodo;

        nombreMetodo = casoDePrueba.getCaminoEjecucion().getMetodo().getNombre();
        nombreClase = casoDePrueba.getCaminoEjecucion().getMetodo().getClase().getNombre();
        variablePrincipal = "_" + nombreClase.toLowerCase();

        parametrosEntradaMetodo = new ArrayList<>();
        codigoMetodo = "";
        for (ParametroMetodo parametro : casoDePrueba.getCaminoEjecucion().getParametros()) {
            String var, clasePar;
            clasePar = parametro.getType().getName();
            var = "_" + clasePar.toLowerCase() + "Value" + (new Random()).nextInt(Integer.MAX_VALUE / 2);
            if (esDatoPrimitivo(clasePar)) {
                codigoMetodo += clasePar + " " + var + " = " + parametro.getValue() + ";\n";
            } else {
                codigoMetodo += clasePar + " " + var + " = new " + clasePar + "(" + parametro.getValue() + ");\n";
            }
            parametrosEntradaMetodo.add(var);
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
        pruebaMetodo.setNombre("test_" + System.currentTimeMillis());
        pruebaMetodo.setCodigo(codigoMetodo);
        System.out.println(pruebaMetodo);
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

    private void agregarDependenciasJUnitJars(String rutaSalida) throws IOException {
        String pathSalida = rutaSalida + File.separator + "junit-4.10.jar";
        String pathEntrada = Constantes.BASE_PATH_INPUT_TEST + File.separator + "junit-4.10.jar";
        Files.copy(Paths.get(pathEntrada), Paths.get(pathSalida), StandardCopyOption.REPLACE_EXISTING);
    }

    private void agregarDependenciasJUnitPomXml(String rutaSalida) {

    }

    private void comprobarExistenciaCarpetaSalida() {
        File file = new File(Constantes.BASE_PATH_OUTPUT_TEST);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    private ResultadoComando ejecutarComandoCompilacion(String className) throws IOException, InterruptedException {
        return ejecutorComandoServicio.ejecutarComando("javac -cp *.jar " + className + Constantes.EXTENSION_JAVA, Constantes.BASE_PATH_OUTPUT_TEST + File.separator, System.out);
    }

    private ResultadoComando ejecutarComandoEjecucion(RecursoJava proyecto) throws IOException, InterruptedException, EjecucionPruebaException {
        String comando;
        if (GeneradorUtil.sistemaOperativoEsLinux()) {
            comando = "java -cp *.jar:. " + proyecto.getNombre();
        } else if (GeneradorUtil.sistemaOperativoEsWindows()) {
            comando = "java -cp *.jar;. " + proyecto.getNombre();
        } else {
            throw new EjecucionPruebaException("SO no soportado");
        }
        System.out.println(comando);
        System.out.println(Constantes.BASE_PATH_OUTPUT_TEST);
        return ejecutorComandoServicio.ejecutarComando(comando, Constantes.BASE_PATH_OUTPUT_TEST + File.separator, System.out);

    }

    public static void main(String[] args) {
        try {
            Process exec = Runtime.getRuntime().exec("javac -cp junit-4.10.jar  GeneradorTestSegundaPrueba.java", null, new File(Constantes.BASE_PATH_OUTPUT_TEST));
            Integer exitValue = exec.waitFor();

            InputStreamReader isr = new InputStreamReader(exec.getErrorStream());
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            isr = new InputStreamReader(exec.getInputStream());
            br = new BufferedReader(isr);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(exitValue);
        } catch (InterruptedException | IOException ex) {
            java.util.logging.Logger.getLogger(PruebaServicioImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void escribirPruebaCreada(Prueba prueba, String codigo) throws FileNotFoundException, IOException {
        File file = new File(Constantes.BASE_PATH_OUTPUT_TEST + File.separator + prueba.getTestClassName() + Constantes.EXTENSION_JAVA);
        try (FileOutputStream fos = new FileOutputStream(file); PrintStream ps = new PrintStream(fos)) {
            ps.println(codigo);
        }
    }
}
