/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.vista;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import org.jfree.ui.RefineryUtilities;
import org.junit.runner.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.edu.unp.generadorpruebas.exception.CompilacionException;
import pe.edu.unp.generadorpruebas.exception.EjecucionPruebaException;
import pe.edu.unp.generadorpruebas.exception.GeneradorException;
import pe.edu.unp.generadorpruebas.exception.ModeladoException;
import pe.edu.unp.generadorpruebas.modelo.CasoDePrueba;
import pe.edu.unp.generadorpruebas.modelo.Clase;
import pe.edu.unp.generadorpruebas.modelo.Metodo;
import pe.edu.unp.generadorpruebas.modelo.Prueba;
import pe.edu.unp.generadorpruebas.modelo.RecursoJava;
import pe.edu.unp.generadorpruebas.servicio.BusquedaSolucionesServicio;
import pe.edu.unp.generadorpruebas.servicio.CompilacionServicio;
import pe.edu.unp.generadorpruebas.servicio.ModeladoServicio;
import pe.edu.unp.generadorpruebas.servicio.PruebaServicio;
import pe.edu.unp.generadorpruebas.util.GeneradorUtil;
import pe.edu.unp.generadorpruebas.util.JavaFileFilter;
import pe.edu.unp.generadorpruebas.util.ResultadoComando;

@Component
public class FormularioPrincipal extends javax.swing.JFrame {

    private Logger logger = Logger.getLogger(getClass());

    @Autowired
    private CompilacionServicio compilacionServicio;

    @Autowired
    private ModeladoServicio modeladoServicio;

    @Autowired
    private PruebaServicio pruebaServicio;

    @Autowired
    private BusquedaSolucionesServicio busquedaSolucionesServicio;

    /**
     * Creates new form FormularioPrincipal
     */
    public FormularioPrincipal() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            LOGGER.error(ex, ex);
            ex.printStackTrace();
        }
        initComponents();
        limpiarFormulario();
        RefineryUtilities.centerFrameOnScreen(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEjecutar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreClase = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextArea();
        txtNombreMetodo = new javax.swing.JTextField();
        jpbBarraProgreso = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmiConfigurar = new javax.swing.JMenuItem();
        jmiSeleccionar = new javax.swing.JMenuItem();
        jmiGuardar = new javax.swing.JMenuItem();
        jmiCargar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador de casos de pruebas");
        setMinimumSize(new java.awt.Dimension(795, 510));

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo de prueba"));

        jLabel1.setText("Clase:");

        jLabel2.setText("Método:");

        txtNombreClase.setEditable(false);
        txtNombreClase.setText("jTextField1");

        txtCodigo.setEditable(false);
        txtCodigo.setColumns(20);
        txtCodigo.setRows(5);
        jScrollPane2.setViewportView(txtCodigo);

        txtNombreMetodo.setEditable(false);
        txtNombreMetodo.setText("jTextField2");

        jpbBarraProgreso.setMaximum(6);

        jLabel3.setText("Progreso:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreClase)
                            .addComponent(txtNombreMetodo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jpbBarraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpbBarraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jmArchivo.setText("Archivo");

        jmiConfigurar.setText("Configurar...");
        jmiConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConfigurarActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiConfigurar);

        jmiSeleccionar.setText("Seleccionar archivo...");
        jmiSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSeleccionarActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiSeleccionar);

        jmiGuardar.setText("Guardar");
        jmiGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGuardarActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiGuardar);

        jmiCargar.setText("Cargar");
        jmiCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCargarActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiCargar);

        jMenuBar1.add(jmArchivo);

        jMenu2.setText("Ayuda");

        jmiAcercaDe.setText("Acerca de...");
        jMenu2.add(jmiAcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEjecutar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnEjecutar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        (new Thread(() -> {
            ejecutarPruebas();
        })).start();
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private boolean ejecutarPruebas() throws HeadlessException {
        List<CasoDePrueba> solucionesOptimas;
        ResultadoComando resultadoPruebas;
        String rutaArchivo, nombreMetodo;
        RecursoJava proyecto;
        Result result;
        Metodo metodo;
        Prueba prueba;
        rutaArchivo = txtNombreClase.getText();
        nombreMetodo = txtNombreMetodo.getText();
        if (!validarNombreMetodo(nombreMetodo)) {
            return true;
        }
        proyecto = modeladoServicio.obtenerProyecto(rutaArchivo);
        jpbBarraProgreso.setValue(1);
        //1.- compilacion
        if (!compilar(proyecto)) {
            jpbBarraProgreso.setValue(0);
            return true;
        }
        //2.- modelado
        metodo = validacionMetodo(proyecto, nombreMetodo);
        jpbBarraProgreso.setValue(2);
        if (metodo == null) {
            jpbBarraProgreso.setValue(0);
            return true;
        }
        //3.- busqueda de soluciones optimas
        solucionesOptimas = busquedaSolucionesServicio.buscarSolucionesOptimas(metodo);
        jpbBarraProgreso.setValue(3);
        //4.- Creacion de pruebas
        prueba = pruebaServicio.crearPruebas(metodo, solucionesOptimas);
        jpbBarraProgreso.setValue(4);
        //5.- Ejecucion de pruebas
        resultadoPruebas = resultadoPruebas(proyecto, prueba);
        jpbBarraProgreso.setValue(5);
        if (resultadoPruebas == null) {
            jpbBarraProgreso.setValue(0);
            return true;
        }
        if (!resultadoPruebas.esResultadoExito()) {
            JOptionPane.showMessageDialog(this, "Ha fallado la ejecución de las pruebas.\n" + resultadoPruebas.getGobbler().getResultadoErrorComando());
            jpbBarraProgreso.setValue(0);
            return true;
        }
        //6.- Resultados
        result = obtenerResultadoDePruebasDeArchivo();
        jpbBarraProgreso.setValue(6);
        if (result == null) {
            jpbBarraProgreso.setValue(0);
            return true;
        }
        ResultadosDialog dialog = new ResultadosDialog(this, Boolean.TRUE);
        try {
            dialog.showDialog(result, prueba);
        } catch (EjecucionPruebaException ex) {
            logger.error(ex, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        return false;
    }

    private void jmiCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiCargarActionPerformed

    private void jmiGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiGuardarActionPerformed

    private void jmiConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConfigurarActionPerformed
        ConfigurarDialog dialog = new ConfigurarDialog(this, Boolean.TRUE);
        dialog.setVisible(true);
    }//GEN-LAST:event_jmiConfigurarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int confirm;
        confirm = JOptionPane.showConfirmDialog(this, "Si cancela los datos no guardados se perderan, ¿esta seguro de cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            limpiarFormulario();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jmiSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSeleccionarActionPerformed
        JFileChooser chooser;
        int eleccion;
        chooser = new JFileChooser();
        chooser.setFileFilter(new JavaFileFilter());
        eleccion = chooser.showOpenDialog(this);
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            procesarArchivoSeleccionado(chooser.getSelectedFile());
        }
    }//GEN-LAST:event_jmiSeleccionarActionPerformed

    private void procesarArchivoSeleccionado(File selectedFile) {
        try {
            compilacionServicio.validarProgramaSeleccionado(selectedFile.getAbsolutePath());

            txtNombreClase.setText(selectedFile.getAbsolutePath());
            cargarCodigoArchivoSeleccionado(selectedFile.getAbsolutePath());
            activarComponentes(true);
        } catch (GeneradorException ex) {
            logger.error(ex, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void cargarCodigoArchivoSeleccionado(String absolutePath) {
        try {
            try (FileReader fr = new FileReader(absolutePath)) {
                try (BufferedReader reader = new BufferedReader(fr)) {
                    String linea;
                    while ((linea = reader.readLine()) != null) {
                        txtCodigo.setText(txtCodigo.getText() + linea + "\n");
                    }
                }
            }
        } catch (IOException ex) {
            logger.error(ex, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void limpiarFormulario() {
        txtCodigo.setText("");
        txtNombreClase.setText("");
        txtNombreMetodo.setText("");
        jpbBarraProgreso.setValue(0);
        activarComponentes(false);
    }

    private void activarComponentes(boolean valor) {
        btnCancelar.setEnabled(true);
        btnEjecutar.setEnabled(valor);
        txtNombreMetodo.setEditable(valor);
    }

    private Result obtenerResultadoDePruebasDeArchivo() throws HeadlessException {
        Result result;
        try {
            result = pruebaServicio.leerResultadosPruebas();
        } catch (ClassNotFoundException | IOException ex) {
            logger.error(ex, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
            result = null;
        }
        return result;
    }

    private ResultadoComando resultadoPruebas(RecursoJava proyecto, Prueba prueba) {
        ResultadoComando resultadoPruebas;
        try {
            resultadoPruebas = pruebaServicio.ejecutarPrueba(proyecto, prueba);
        } catch (EjecucionPruebaException ex) {
            logger.error(ex, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
            resultadoPruebas = null;
        }
        return resultadoPruebas;
    }

    private Metodo validacionMetodo(RecursoJava proyecto, String nombreMetodo) throws HeadlessException {
        Metodo metodo;
        Clase clase;
        try {
            clase = (Clase) proyecto;
            metodo = modeladoServicio.obtenerMetodoEjecucion(clase, nombreMetodo);
        } catch (ModeladoException ex) {
            logger.error(ex, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
            metodo = null;
        }
        return metodo;
    }

    private boolean validarNombreMetodo(String nombreMetodo) throws HeadlessException {
        if (!GeneradorUtil.esCadenaValida(nombreMetodo)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de metodo");
            return false;
        }
        if (metodoEsMetodoDefault(nombreMetodo)) {
            JOptionPane.showMessageDialog(this, "El nombre de metodo ingresado no es valido");
            return false;
        }
        return true;
    }

    private Boolean compilar(RecursoJava proyecto) {
        Boolean compilar;
        try {
            //1.- compilacion
            compilar = compilacionServicio.compilar(proyecto);
            if (!compilar) {
                JOptionPane.showMessageDialog(this, "No se ha podido compilar la clase correctamente, pro favor intentelo de nuevo.");
            }
        } catch (CompilacionException ex) {
            compilar = Boolean.FALSE;
            logger.error(ex, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        return compilar;
    }

    private boolean metodoEsMetodoDefault(String nombreMetodo) {
        return nombreMetodo.equalsIgnoreCase("equals")
                || nombreMetodo.equalsIgnoreCase("tostring")
                || nombreMetodo.equalsIgnoreCase("getclass")
                || nombreMetodo.equalsIgnoreCase("notify")
                || nombreMetodo.equalsIgnoreCase("notifyall")
                || nombreMetodo.equalsIgnoreCase("wait")
                || nombreMetodo.equalsIgnoreCase("hashcode");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenuItem jmiAcercaDe;
    private javax.swing.JMenuItem jmiCargar;
    private javax.swing.JMenuItem jmiConfigurar;
    private javax.swing.JMenuItem jmiGuardar;
    private javax.swing.JMenuItem jmiSeleccionar;
    private javax.swing.JProgressBar jpbBarraProgreso;
    private javax.swing.JTextArea txtCodigo;
    private javax.swing.JTextField txtNombreClase;
    private javax.swing.JTextField txtNombreMetodo;
    // End of variables declaration//GEN-END:variables

}
