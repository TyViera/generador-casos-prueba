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
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import pe.edu.unp.generadorpruebas.exception.EjecucionPruebaException;
import pe.edu.unp.generadorpruebas.util.ButtonEditor;
import pe.edu.unp.generadorpruebas.util.JTableButtonRenderer;
import pe.edu.unp.generadorpruebas.util.PruebaView;

public class ResultadosCarpetaTableDialog extends javax.swing.JDialog {

    private Logger logger = Logger.getLogger(getClass());

    private List<PruebaView> lista;
    private Frame principal;

    public ResultadosCarpetaTableDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.principal = parent;
        initComponents();
    }

    public void showDialog(List<PruebaView> lista) {
        this.lista = lista;
        llenarTabla();
        maximizar();
        this.setVisible(true);
    }

    private void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) tbDetallePruebas.getModel();
        List<ActionListener> listaAcciones = new ArrayList<>();
        model.setRowCount(0);
        for (PruebaView pruebaView : lista) {
            listaAcciones.add((ActionListener) (ActionEvent e) -> {
                //open
                ResultadosDialog dialog = new ResultadosDialog(ResultadosCarpetaTableDialog.this.principal, Boolean.TRUE);
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

    private void maximizar() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height - 50;
        int screenWidth = screenSize.width - 50;

        this.setSize(screenWidth, screenHeight);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDetallePruebas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Detalle de pruebas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDetallePruebas;
    // End of variables declaration//GEN-END:variables
}
