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
public class Cotizacion extends Factura {
   

    public Cotizacion(Cliente cliente,String descripcion, double valorTotal, String fechaAprobado) {
        super(cliente, descripcion, valorTotal, fechaAprobado);
    }

    public Cotizacion() {
        super();
    }   
    
    
    public void generarCotizacion(){
        
        System.out.println("Arteacryl de Colombia - Cotizacion");
        System.out.println("Cliente " + getCliente().getNombres()+ " " + getCliente().getApellidos());
        System.out.println("Descripcion : " + getDescripcion());
        System.out.println("Valor total : " + CalculoValorTotal(getProductos()));
    }
    
}
