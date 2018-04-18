/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.vista;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;
import pe.edu.unp.generadorpruebas.exception.EjecucionPruebaException;
import pe.edu.unp.generadorpruebas.util.ButtonEditor;
import pe.edu.unp.generadorpruebas.util.GeneradorUtil;
import pe.edu.unp.generadorpruebas.util.JTableButtonRenderer;
import pe.edu.unp.generadorpruebas.util.PruebaView;

/**
 *
 * @author nazav
 */
public class ResultadosCarpetaJDialog extends javax.swing.JDialog {

    private Logger logger = Logger.getLogger(getClass());

    private List<PruebaView> lista;
    private Long tiempoTranscurrido;
    private Frame principal;

    /**
     * Creates new form ResultadosCarpetaJDialog
     */
    public ResultadosCarpetaJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.principal = parent;
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDetallePruebas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroArchivos = new javax.swing.JTextField();
        txtNumeroPruebas = new javax.swing.JTextField();
        txtTiempoEjecucion = new javax.swing.JTextField();
        jsPanelGrafico = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(959, 650));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Resultados de las pruebas");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de pruebas"));

        tbDetallePruebas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Archivo", "Metodo", "Pruebas ejecutadas", "Errores", "Detalle"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen de ejecucion"));

        jLabel2.setText("Numero de archivos");

        jLabel3.setText("Numero de pruebas ejecutado");

        jLabel4.setText("Tiempo de ejecucion");

        txtNumeroArchivos.setEditable(false);
        txtNumeroArchivos.setText("EXITO/FRACASO");

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jsPanelGrafico)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54)
                        .addComponent(txtNumeroArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumeroPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jsPanelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showDialog(List<PruebaView> lista, Long tiempoTranscurrido) throws EjecucionPruebaException {
        this.lista = lista;
        this.tiempoTranscurrido = tiempoTranscurrido;
        inicializeData();
        maximizar();
        this.setVisible(true);
    }

    private void dibujarDiagrama() {
        jsPanelGrafico.setViewportView(createDemoPanel());
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset localDefaultCategoryDataset = new DefaultCategoryDataset();
        String str1 = "Casos";
        String str2 = "Errores";
        lista.stream().forEach((pruebaView) -> {
            String cat = pruebaView.getArchivo() + "." + pruebaView.getMetodo();
            localDefaultCategoryDataset.addValue(obtenerCantidadPruebasEjecutadas(pruebaView.getArchivo(), pruebaView.getMetodo()), str1, cat);
            localDefaultCategoryDataset.addValue(obtenerCantidadPruebasError(pruebaView.getArchivo(), pruebaView.getMetodo()), str2, cat);
        });

        return localDefaultCategoryDataset;
    }

    private static JFreeChart createChart(CategoryDataset paramCategoryDataset) {
        JFreeChart localJFreeChart = ChartFactory.createBarChart("Bar Chart Demo 7", "Prueba", "Casos", paramCategoryDataset);
        localJFreeChart.removeLegend();
        CategoryPlot localCategoryPlot = (CategoryPlot) localJFreeChart.getPlot();
        localCategoryPlot.setRangePannable(true);
        NumberAxis localNumberAxis = (NumberAxis) localCategoryPlot.getRangeAxis();
        localNumberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        BarRenderer localBarRenderer = (BarRenderer) localCategoryPlot.getRenderer();
        localBarRenderer.setDrawBarOutline(false);
        localBarRenderer.setItemMargin(0.1D);
        localBarRenderer.setBaseItemLabelGenerator(new LabelGenerator());
        localBarRenderer.setBaseItemLabelsVisible(true);
        ItemLabelPosition localItemLabelPosition1 = new ItemLabelPosition(ItemLabelAnchor.INSIDE12, TextAnchor.CENTER_RIGHT, TextAnchor.CENTER_RIGHT, -1.5707963267948966D);
        localBarRenderer.setBasePositiveItemLabelPosition(localItemLabelPosition1);
        ItemLabelPosition localItemLabelPosition2 = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.CENTER_LEFT, TextAnchor.CENTER_LEFT, -1.5707963267948966D);
        localBarRenderer.setPositiveItemLabelPositionFallback(localItemLabelPosition2);
        CategoryAxis localCategoryAxis = localCategoryPlot.getDomainAxis();
        localCategoryAxis.setCategoryLabelPositions(CategoryLabelPositions.STANDARD);
        return localJFreeChart;
    }

    public JPanel createDemoPanel() {
        JFreeChart localJFreeChart = createChart(createDataset());
        return new ChartPanel(localJFreeChart);
    }

    private void maximizar() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height - 50;
        int screenWidth = screenSize.width - 50;

        this.setSize(screenWidth, screenHeight);
    }

    private void inicializeData() throws EjecucionPruebaException {
        if (lista == null) {
            throw new EjecucionPruebaException("El resultado no puede ser un valor nulo.");
        }
        txtNumeroPruebas.setText(obtenerCantidadPruebas() + " pruebas");
        txtNumeroArchivos.setText(obtenerCantidadArchivos() + " archivos");
        txtTiempoEjecucion.setText(tiempoTranscurrido + " milisegundos");
        dibujarDiagrama();
        llenarTabla();
    }

    private Integer obtenerCantidadPruebas() {
        Integer n;
        n = 0;
        n = lista.stream().map((pruebaView) -> {
            Integer m = 0;
            m = pruebaView.getPrueba().getTestsCode().stream().map((_item) -> 1).reduce(m, Integer::sum);
            return m;
        }).reduce(n, Integer::sum);
        return n;
    }

    private Integer obtenerCantidadPruebasEjecutadas(String archivo, String metodo) {
        Integer n;
        n = 0;
        n = lista.stream().filter((pruebaView) -> {
            return pruebaView.getMetodo().equals(metodo) && pruebaView.getArchivo().equals(archivo);
        }).map((pruebaView) -> {
            Integer m = 0;
            m = pruebaView.getPrueba().getTestsCode().stream().map((_item) -> 1).reduce(m, Integer::sum);
            return m;
        }).reduce(n, Integer::sum);
        return n;
    }

    private Integer obtenerCantidadPruebasError(String archivo, String metodo) {
        Integer n;
        n = 0;
        n = lista.stream()
                .filter((pruebaView) -> {
                    return pruebaView.getMetodo().equals(metodo) && pruebaView.getArchivo().equals(archivo) && !pruebaView.getResult().wasSuccessful();
                })
                .map((pruebaView) -> {
                    Integer m = 0;
                    m = pruebaView.getPrueba().getTestsCode().stream()
                            .filter((_item) -> {
                                return GeneradorUtil.obtenerEstadoPrueba(_item.getNombre(), pruebaView.getResult(),
                                        pruebaView.getPrueba()
                                ).equalsIgnoreCase("error");
                            })
                            .map((_item) -> 1).reduce(m, Integer::sum);
                    return m;
                }).reduce(n, Integer::sum);
        return n;
    }

    private Integer obtenerCantidadArchivos() {
        Map<String, Integer> mapa;
        mapa = new HashMap<>();
        lista.forEach((pruebaView) -> {
            Integer cantidad;
            cantidad = mapa.get(pruebaView.getArchivo());
            if (cantidad == null) {
                cantidad = 0;
            }
            mapa.put(pruebaView.getArchivo(), cantidad + 1);
        });
        return mapa.size();
    }

    private void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) tbDetallePruebas.getModel();
        List<ActionListener> listaAcciones = new ArrayList<>();
        model.setRowCount(0);
        for (PruebaView pruebaView : lista) {
            listaAcciones.add((ActionListener) (ActionEvent e) -> {
                //open
                ResultadosDialog dialog = new ResultadosDialog(ResultadosCarpetaJDialog.this.principal, Boolean.TRUE);
                try {
                    dialog.showDialog(pruebaView.getResult(), pruebaView.getPrueba());
                } catch (EjecucionPruebaException ex) {
                    logger.error(ex, ex);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            });
            model.addRow(new Object[]{pruebaView.getArchivo(), pruebaView.getMetodo(), pruebaView.getResult().getRunCount(), pruebaView.getResult().getFailureCount(), "Ver Detalles"});
        }
        tbDetallePruebas.getColumn("Detalle").setCellRenderer(new JTableButtonRenderer());
        tbDetallePruebas.getColumn("Detalle").setCellEditor(new ButtonEditor(new JCheckBox(), listaAcciones, tbDetallePruebas.getColumnCount() - 1));
    }

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
    private javax.swing.JTextField txtNumeroArchivos;
    private javax.swing.JTextField txtNumeroPruebas;
    private javax.swing.JTextField txtTiempoEjecucion;
    // End of variables declaration//GEN-END:variables

    private static class LabelGenerator extends StandardCategoryItemLabelGenerator {

        @Override
        public String generateLabel(CategoryDataset paramCategoryDataset, int paramInt1, int paramInt2) {
            return paramCategoryDataset.getRowKey(paramInt1).toString() + "(" + paramInt2 + ")";
        }
    }

}
