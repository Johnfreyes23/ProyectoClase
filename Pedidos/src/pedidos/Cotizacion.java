/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.util.ArrayList;

/**
 *
 * @author john
 */
public class Cotizacion {
    private ArrayList<Producto> productos = new ArrayList();
    private Cliente cliente = new Cliente();
    private String IDcliente;
    private String descripcion;
    private double valorTotal;
    static final double IVA = 0.19;
    
    public Cotizacion(String IDcliente) {
        this.IDcliente = IDcliente;
    }
    
    /**
     *
     */
    public Cotizacion() {
    }
    
    public void agregarProducto (String tipo){
        if(tipo.equals("acrilico")){
            
        }
        if(tipo.equals("cajon")){
            
        }
        if(tipo.equals("polietileno")){
            
        }
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
