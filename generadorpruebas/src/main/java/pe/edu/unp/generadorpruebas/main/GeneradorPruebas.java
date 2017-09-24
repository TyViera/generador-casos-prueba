/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.main;

/**
 *
 * @author nazaret
 */
public class GeneradorPruebas {

    public static void main(String[] args) {

        try {
            SpringRunner.iniciarSpring();
            java.awt.EventQueue.invokeLater(() -> {
                SpringRunner.obtenerFormularioPrincipal().setVisible(true);
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
