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
        Acrilico p1 = new Acrilico(3,"cristal",12,12);
        
        
        
        Factura f1 = new Factura();    
        f1.agregarProducto(p1);
        String v = " " + f1.CalculoValorTotal();
        System.out.println(v);
    }     
        
}
