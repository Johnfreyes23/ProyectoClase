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
public class Produccion {
    Pedido pedido ; 
    String FechaEntrega;
    ArrayList<Empleado> empleados = new ArrayList();
    String RutaArchivo;
    String fechaInicial;

    public Produccion(Pedido pedido) {
        this.pedido = pedido;
        this.fechaInicial=fechaActual();           
    }
    
   
    
    private String fechaActual(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        return(formatted);        
    }
}
