/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author john
 */
//public class Cotizacion {
//    private ArrayList<Producto> productos = new ArrayList();
//    private Cliente cliente = new Cliente();
//    private String descripcion;
//    private double valorTotal;
    
//    public Cotizacion(ArrayList productos) {
//        this.productos=productos;
//        
//    }
public class Cotizacion extends Factura {

    public Cotizacion(Cliente cliente,String descripcion, double valorTotal, String fechaAprobado) {
        super(cliente, descripcion, valorTotal, fechaAprobado);
    }

    public Cotizacion() {
        super();
    }   
    
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
