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
public class Factura {
    private ArrayList<Producto> productos = new ArrayList();
    private Cliente cliente = new Cliente();
    private String descripcion;
    private double valorTotal;
    private String fechaAprobado;
    private Pedido pedido;
    private Cotizacion cotizacion;
    private Produccion p;

    public Factura(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
        this.cliente = cotizacion.getCliente();
        this.fechaAprobado=cotizacion.fechaAprobado();
        this.productos= cotizacion.getProductos();        
    }
    
    public Factura(){
    }

    public Factura(Cliente cliente, String descripcion,double valorTotal, String fechaFactura) {
        this.descripcion = descripcion;
        this.valorTotal = valorTotal;
        this.fechaAprobado = fechaFactura;
    }

    
    public void agregarProducto (Producto producto){
        productos.add(producto);
    } 
    public double CalculoValorTotal(ArrayList Productos){
        valorTotal=0;
        for(Producto prod : productos){
            valorTotal = prod.getValor()+ valorTotal;}
        setValorTotal(valorTotal) ;
        return valorTotal;
    }
    
    
    public String fechaAprobado(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        return(formatted);        
    }
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
