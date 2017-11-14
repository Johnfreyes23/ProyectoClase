/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

/**
 *
 * @author john
 */
public class Pedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Acrilico a1  = new Acrilico(4,"cristal",30,40);
        System.out.println(a1.CalcularPrecio());
        System.out.println(a1.getCosto());
    }
    
}
