/*
 * Proyecto final para la asignatura Principios y Practicas del desarrollo de Software Orientado a Objetos.
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 */
package pedidos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author john
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Pedido p1 = new Pedido();
        p1.setIdCliente("13");
        p1.setIdCotizacion("12");
        p1.setIdFactura("12");
        p1.setIdPedido("123");
        p1.setEstado("Facturado");
        p1.crearPedido();
    }          
        
}
