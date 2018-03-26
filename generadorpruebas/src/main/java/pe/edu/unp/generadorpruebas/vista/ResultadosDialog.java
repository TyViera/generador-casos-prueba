/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.vista;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import pe.edu.unp.generadorpruebas.exception.EjecucionPruebaException;
import pe.edu.unp.generadorpruebas.modelo.Prueba;
import pe.edu.unp.generadorpruebas.modelo.PruebaMetodo;

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
        jpPanelGrafico = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDetallePruebas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Resultados de las pruebas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen de ejecucion"));

        jLabel2.setText("Resultado general:");

        jLabel3.setText("Numero de pruebas ejecutado");

        jLabel4.setText("Tiempo de ejecucion");

        txtResultadoGeneral.setText("EXITO/FRACASO");

        txtNumeroPruebas.setText("N PRUEBAS");

        txtTiempoEjecucion.setText("X MILISEGUNDOS");

        javax.swing.GroupLayout jpPanelGraficoLayout = new javax.swing.GroupLayout(jpPanelGrafico);
        jpPanelGrafico.setLayout(jpPanelGraficoLayout);
        jpPanelGraficoLayout.setHorizontalGroup(
            jpPanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpPanelGraficoLayout.setVerticalGroup(
            jpPanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpPanelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroPruebas)
                            .addComponent(txtTiempoEjecucion, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(jpPanelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 248, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 248, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JPanel jpPanelGrafico;
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
        txtResultadoGeneral.setText(result.wasSuccessful() ? "Exiti" : "Fracaso");
        txtTiempoEjecucion.setText(result.getRunTime() + " milisegundos");
        dibujarDiagrama();
        llenarTabla();
    }

    private void dibujarDiagrama() {

    }

    private void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) tbDetallePruebas.getModel();
        List<ActionListener> lista = new ArrayList<>();
        model.setRowCount(0);
        prueba.getTestsCode().stream().map((pruebaMetodo) -> {
            lista.add((ActionListener) (ActionEvent e) -> {
                JOptionPane.showMessageDialog(ResultadosDialog.this, pruebaMetodo.getCodigo());
            });
            return pruebaMetodo;
        }).forEachOrdered((pruebaMetodo) -> {
            model.addRow(new Object[]{pruebaMetodo.getNombre(), obtenerEstadoPrueba(pruebaMetodo), obtenerMensajesPrueba(pruebaMetodo), "Ver codigo"});
        });
        tbDetallePruebas.getColumn("Codigo").setCellRenderer(new JTableButtonRenderer());
        tbDetallePruebas.getColumn("Codigo").setCellEditor(new ButtonEditor(new JCheckBox(), lista));
    }

    private String obtenerEstadoPrueba(PruebaMetodo pruebaMetodo) {
        if (result.getFailureCount() <= 0) {
            return "Exito";
        }
        Failure failure = obtenerFailure(pruebaMetodo);
        if (failure != null) {
            return "Error";
        }
        return "Exito";
    }

    private String obtenerMensajesPrueba(PruebaMetodo pruebaMetodo) {
        if (result.getFailureCount() <= 0) {
            return "";
        }
        Failure failure = obtenerFailure(pruebaMetodo);
        if (failure != null) {
            return failure.getMessage();
        }
        return "";
    }

    private Failure obtenerFailure(PruebaMetodo pruebaMetodo) {
        for (Failure failure : result.getFailures()) {//test_6(GeneradorTestSegundaPrueba)
            String cabecera = pruebaMetodo.getNombre() + "(" + prueba.getTestClassName() + ")";
            if (failure.getTestHeader().equals(cabecera)) {
                return failure;
            }
        }
        return null;
    }

    private class JTableButtonRenderer extends JButton implements TableCellRenderer {

        public JTableButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            if (isSelected) {
                setForeground(table.getSelectionForeground());
                setBackground(table.getSelectionBackground());
            } else {
                setForeground(table.getForeground());
                setBackground(UIManager.getColor("Button.background"));
            }
            setText(value == null ? "" : value.toString());
            return this;
        }
    }

    private class ButtonEditor extends DefaultCellEditor {

        protected JButton button;
        private String label;
        private boolean isPushed;
        private int lastRow;
        private List<ActionListener> lista;

        public ButtonEditor(JCheckBox checkBox, List<ActionListener> lista) {
            super(checkBox);
            this.lista = lista;
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
            if (isSelected) {
                button.setForeground(table.getSelectionForeground());
                button.setBackground(table.getSelectionBackground());
            } else {
                button.setForeground(table.getForeground());
                button.setBackground(table.getBackground());
            }
            lastRow = -1;
            if (column == 3) {
                lastRow = row;
            }
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            isPushed = true;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed) {
//                JOptionPane.showMessageDialog(button, label + ": Ouch!");
                if (lastRow >= 0) {
                    ActionListener listener = lista.get(lastRow);
                    if (listener != null) {
                        listener.actionPerformed(null);
                    }
                }
            }
            isPushed = false;
            return label;
        }

        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }
    }
}
