/*
 * Proyecto final para la asignatura Principios y Practicas del desarrollo de Software Orientado a Objetos.
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 */
package pedidos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Esta clase define objetos que generan cotizacion
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */

public class Cotizacion extends Factura {
    
/**
* Constructor para la clase produccion
* @param cliente El parámetro pedido define el cliente asociado a la cotizacion.
* @param descripcion El parámetro descripcion define la descripcion de la cotizacion.
* @param valorTotal El parámetro valorTotal define el valor total de la cotizacion.
* @param fechaAprobado El parámetro fechaAprobado define la fecha en que se crea la cotizacion.

*/
    public Cotizacion(Cliente cliente,String descripcion, double valorTotal, String fechaAprobado) {
        super(cliente, descripcion, valorTotal, fechaAprobado);
    }

    public Cotizacion() {
        super();
    }   
/**
* Metodo que imprime en pantalla descripcion de los productos en cotizacion de un pedido.
*/
    public void Imprimir(Producto product)
    {
        switch(product.getTipo())
                {
                    case "Polietileno":
                        Polietileno po = (Polietileno) product;
                        System.out.println("Producto: " + product.getTipo() + "\n Dimensiones: \n\t Alto: " + product.getAlto() + 
                                "\n\t Ancho: " + product.getAncho() + "\n\t Calibre: " + po.getCalibre() + "\n\t Valor: $" + 
                                po.CalcularPrecio());
                    break;
                    
                    case "Acrilico":
                        Acrilico a1 = (Acrilico) product;
                        System.out.println("Producto: " + product.getTipo() + "\n Dimensiones: \n\t Alto: " + product.getAlto() + 
                                "\n\t Ancho: " + product.getAncho() + "\n\t Calibre: " + a1.getCalibre() + "\n\t Color: " + a1.getColor() + 
                                "\n\t Valor: $" + a1.CalcularPrecio());
                    break;
                    
                    case "Cajon":
                        Cajon c1 = (Cajon) product;
                        System.out.println("Producto: " + product.getTipo() + "\n Dimensiones: \n\t Alto: " + product.getAlto() + 
                                "\n\t Largo: " + product.getAncho() + "\n\t Ancho: " + c1.getCanto() + "\n\t Valor: $" + c1.CalcularPrecio());
                        
                }
    }
    
/**
* Metodo que imprime en pantalla descripcion la cotizacion de un pedido.
*/
    public void generarCotizacion(){
        
        System.out.println("Arteacryl de Colombia - Cotizacion");
        System.out.println("Cliente " + getCliente().getNombres()+ " " + getCliente().getApellidos());
        System.out.println("Producto(s) a cotizar");
        for(Producto ver : getProductos())
        {
            Imprimir(ver);
        }
        System.out.println("Valor total : " + CalculoValorTotal(getProductos()));
    }
    
}
