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
    private Pedido pedido ; 
    private String FechaEntrega;
    private Empleado empleado;
    private String RutaArchivo;
    private String fechaInicial;

    public Produccion(Pedido pedido) {
        this.pedido = pedido;
        this.fechaInicial=fechaActual();           
    }
    
    public void GenerarOrden(){
        System.out.println("Arteacryl de Colombia - Orden de Produccion");
        System.out.println("Empleado Encargado " + getEmpleado().getNombres()+ " " + getEmpleado().getApellidos());
        System.out.println("Fecha Inicio de Produccion : "+ this.fechaInicial);
        System.out.println("Descripcion: ");
        for(Producto ver : pedido.getProductos())
        {
            pedido.getCotizacion().Imprimir(ver);
        }
        System.out.println("Fecha Estimada de entrega: " + this.FechaEntrega);
    }
       
    private String fechaActual(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        return(formatted);        
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getRutaArchivo() {
        return RutaArchivo;
    }

    public void setRutaArchivo(String RutaArchivo) {
        this.RutaArchivo = RutaArchivo;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }
    
    
    
    
}
