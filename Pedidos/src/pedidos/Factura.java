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
 * Esta clase define objetos que generan una factura
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */

public class Factura {
    //Campos de la Clase
    private ArrayList<Producto> productos = new ArrayList();
    private Cliente cliente = new Cliente();
    private String descripcion;
    private double valorTotal;
    private String fechaAprobado;
    private Pedido pedido;
    private Cotizacion cotizacion;
    private Produccion produccion;

/**
* Constructor para la clase Factura.
* @param cotizacion El parámetro cotizacion define una Factura luego de cotizar.
*/
    public Factura(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
        this.cliente = cotizacion.getCliente();
        this.fechaAprobado=cotizacion.fechaAprobado();
        this.productos= cotizacion.getProductos();        
    }
    
    public Factura(){
    }
/**
* Constructor para la clase Factura.
* @param cliente El parámetro cliente define el cliente asociado a la factura.
* @param descripcion El parámetro descripcion define la descripcion de la factura.
* @param valorTotal El parámetro valorTotal define el valor total de la factura.
* @param fechaFactura El parámetro fechaFactura define la fecha en que se crea la factura.

*/
    public Factura(Cliente cliente, String descripcion,double valorTotal, String fechaFactura) {
        this.descripcion = descripcion;
        this.valorTotal = valorTotal;
        this.fechaAprobado = fechaFactura;
    }
/**
* Metodo que permite agregar un producto al arreglo de productos en una factura.
*/
    
    public void agregarProducto (Producto producto){
        productos.add(producto);
    } 
/**
* Metodo que calcula el valor total de los productos agregados a la factura
* @return suma total del valor de cada producto.
*/
    public double CalculoValorTotal(ArrayList Productos){
        valorTotal=0;
        for(Producto prod : productos){
            valorTotal = prod.getValor()+ valorTotal;}
        setValorTotal(valorTotal) ;
        return valorTotal;
    }
    
/**
* Metodo que usa el calendario para obtener la fecha actual
* @return fecha actual al llamar el metodo
*/ 
    public String fechaAprobado(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        return(formatted);        
    }
/**
* Metodo crea un pedido, debe ser llamado luego de crear la factura.
* @return pedido con estado facturado y los datos de la factura.
*/ 
    public Pedido generarPedido(){
        this.fechaAprobado=fechaAprobado();
        pedido = new Pedido("Facturado",getCliente(),getProductos(),getFechaAprobado());
        pedido.setCotizacion(getCotizacion());
        setPedido(pedido);
        return pedido;
                
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getFechaAprobado() {
        return fechaAprobado;
    }

    public void setFechaAprobado(String fechaAprobado) {
        this.fechaAprobado = fechaAprobado;
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
    
    
    
    
}
