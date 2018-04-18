/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import pe.edu.unp.generadorpruebas.exception.EjecucionPruebaException;
import pe.edu.unp.generadorpruebas.modelo.Prueba;
import pe.edu.unp.generadorpruebas.modelo.PruebaMetodo;
import pe.edu.unp.generadorpruebas.util.ButtonEditor;
import pe.edu.unp.generadorpruebas.util.GeneradorUtil;
import pe.edu.unp.generadorpruebas.util.JTableButtonRenderer;

/**
 *
 * @author nazaret
 */
public class ResultadosDialog extends javax.swing.JDialog {

    private Result result;
    private Prueba prueba;

    /**
     * Creates new form ResultadosDialog
     */
    public ResultadosDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void showDialog(Result result, Prueba prueba) throws EjecucionPruebaException {
        this.result = result;
        this.prueba = prueba;
        inicializeData();
        maximizar();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtResultadoGeneral = new javax.swing.JTextField();
        txtNumeroPruebas = new javax.swing.JTextField();
        txtTiempoEjecucion = new javax.swing.JTextField();
        jsPanelGrafico = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDetallePruebas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resultados de las pruebas");
        setMinimumSize(new java.awt.Dimension(980, 700));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Resultados de las pruebas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen de ejecucion"));

        jLabel2.setText("Resultado general:");

        jLabel3.setText("Numero de pruebas ejecutado");

        jLabel4.setText("Tiempo de ejecucion");

        txtResultadoGeneral.setEditable(false);
        txtResultadoGeneral.setText("EXITO/FRACASO");

        txtNumeroPruebas.setEditable(false);
        txtNumeroPruebas.setText("N PRUEBAS");

        txtTiempoEjecucion.setEditable(false);
        txtTiempoEjecucion.setText("X MILISEGUNDOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsPanelGrafico)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNumeroPruebas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTiempoEjecucion, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                            .addComponent(txtResultadoGeneral))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtResultadoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumeroPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsPanelGrafico)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de pruebas"));

        tbDetallePruebas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prueba", "Estado", "Mensajes", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDetallePruebas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jsPanelGrafico;
    private javax.swing.JTable tbDetallePruebas;
    private javax.swing.JTextField txtNumeroPruebas;
    private javax.swing.JTextField txtResultadoGeneral;
    private javax.swing.JTextField txtTiempoEjecucion;
    // End of variables declaration//GEN-END:variables

    private void inicializeData() throws EjecucionPruebaException {
        if (result == null) {
            throw new EjecucionPruebaException("El resultado no puede ser un valor nulo.");
        }
        txtNumeroPruebas.setText(String.valueOf(result.getRunCount()));
        txtResultadoGeneral.setText(result.wasSuccessful() ? "Exito" : "Fracaso");
        txtTiempoEjecucion.setText(result.getRunTime() + " milisegundos");
        dibujarDiagrama();
        llenarTabla();
    }

    private void dibujarDiagrama() {
        JPanel panel = createDemoPanel();
        jsPanelGrafico.setViewportView(panel);
    }

    private PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        int failCount = result.getFailureCount();
        int totalCount = result.getRunCount();
        double errorP = failCount * 1.0 / totalCount * 1.0;

        dataset.setValue("Exito", (1 - errorP));
        dataset.setValue("Fracaso", errorP);
        return dataset;
    }

    private JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Resultado de pruebas", // chart title 
                dataset, // data    
                true, // include legend   
                true,
                false);
        ((PiePlot) chart.getPlot()).setLabelGenerator(new StandardPieSectionLabelGenerator("{0} = {2}"));
        return chart;
    }

    public JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        ChartPanel localChartPanel = new ChartPanel(chart);
        localChartPanel.setMouseWheelEnabled(true);
        return localChartPanel;
//        return new ChartPanel(chart);
    }

    private void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) tbDetallePruebas.getModel();
        List<ActionListener> lista = new ArrayList<>();
        model.setRowCount(0);
        prueba.getTestsCode().stream().map((pruebaMetodo) -> {
            lista.add((ActionListener) (ActionEvent e) -> {
                String codigo;
                codigo = "@Test\n";
                codigo += "public void " + pruebaMetodo.getNombre() + "() {\n";
                codigo += pruebaMetodo.getCodigo();
                codigo += "\n}";
                JOptionPane.showMessageDialog(ResultadosDialog.this, codigo);
            });
            return pruebaMetodo;
        }).forEachOrdered((pruebaMetodo) -> {
            model.addRow(new Object[]{pruebaMetodo.getNombre(), GeneradorUtil.obtenerEstadoPrueba(pruebaMetodo.getNombre(), result, prueba), GeneradorUtil.obtenerMensajesPrueba(pruebaMetodo.getNombre(), result, prueba), "Ver codigo"});
        });
        tbDetallePruebas.getColumn("Codigo").setCellRenderer(new JTableButtonRenderer());
        tbDetallePruebas.getColumn("Codigo").setCellEditor(new ButtonEditor(new JCheckBox(), lista, tbDetallePruebas.getColumnCount() - 1));
    }

    private void maximizar() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height - 50;
        int screenWidth = screenSize.width - 50;

        this.setSize(screenWidth, screenHeight);
    }

}
