/*
 * Proyecto final para la asignatura Principios y Practicas del desarrollo de Software Orientado a Objetos.
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 */
package pedidos;

import java.util.ArrayList;
import java.util.Date;
/**
 * Esta clase define objetos que generan un pedido. 
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */
public class Pedido {
    //Campos de la Clase
    private String estado;
    private Cotizacion cotizacion;
    private ArrayList<Producto> productos = new ArrayList();
    private Cliente cliente ;
    private Empleado empleado;
    private String descripcion;
    private double valorTotal;
    private String fechaIncial;
    private String fechaFinal;
/**
* Constructor para la clase Pedido.
* @param estado El parámetro estado define el estado asociado a el pedido.
* @param cliente El parámetro cliente define el cliente asociado al pedido.
* @param productos El parámetro productos cotendra un Array con productos asociados al pedido.
* @param fechaIncial El parámetro fechaIncial define la fecha en que se inicio el pedido.
*/
    public Pedido(String estado, Cliente cliente, ArrayList<Producto>  productos, String fechaIncial) {
        this.estado = estado;
        this.cliente = cliente;
        this.productos = productos;
        this.fechaIncial = fechaIncial;
    }
    
    
    public Pedido() {
        
    }   
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getFechaIncial() {
        return fechaIncial;
    }

    public void setFechaIncial(String fechaIncial) {
        this.fechaIncial = fechaIncial;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    
}
