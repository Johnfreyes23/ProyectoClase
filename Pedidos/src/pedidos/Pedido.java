/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author john
 */
public class Pedido {
    private String estado;
    private Cotizacion cotizacion;
    private ArrayList<Producto> productos = new ArrayList();
    private Cliente cliente ;
    private ArrayList<Empleado> empleado=new ArrayList();
    private String descripcion;
    private double valorTotal;
    private String fechaIncial;
    private String fechaFinal;

    public Pedido(String estado, Cliente cliente, ArrayList<Producto>  productos, String descripcion, String fechaIncial) {
        this.estado = estado;
        this.cliente = cliente;
        this.productos = productos;
        this.descripcion = descripcion;
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
    
    
}
