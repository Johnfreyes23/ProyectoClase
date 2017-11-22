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
 * Esta clase define objetos que generan una orden de produccion 
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 22/09/2016/A
 */
public class Produccion {
    //Capos de la Clase
    private Pedido pedido ; 
    private String FechaEntrega;
    private Empleado empleado;
    private String RutaArchivo;
    private String fechaInicial;
/**
* Constructor para la clase produccion
* @param pedido El parámetro pedido define el pedido asociado a la orden de produccion;
*/
    public Produccion(Pedido pedido) {
        this.pedido = pedido;
        this.empleado= pedido.getEmpleado();
        this.fechaInicial=fechaActual();           
    }
/**
* Metodo que imprime en pantalla una orden de pedido para entregar en produccion.
*/
    
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
/**
* Metodo que usa el calendario para obtener la fecha actual
* @return fecha actual al llamar el metodo
*/
    public String fechaActual(){
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
