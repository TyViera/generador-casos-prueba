/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;
import util.ProductoVentaDTO;

/**
 *
 * @author nazav
 */
public class Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ProductoVentaDTO dto = (new ProductoServicio()).obtenerProductoParaVenta(Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE,
                    Long.MIN_VALUE, Boolean.TRUE, BigDecimal.TEN, Boolean.TRUE, Long.MAX_VALUE,
                    Long.MIN_VALUE, Long.MIN_VALUE);
            System.out.println(dto);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
