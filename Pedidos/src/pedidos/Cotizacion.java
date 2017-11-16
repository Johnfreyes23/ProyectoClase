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
    private String descripcion;
    private double valorTotal;
    
    public Cotizacion(ArrayList productos) {
        this.productos=productos;
        
    }
    
    public void generarCotizacion(){
        
        System.out.println("Arteacryl de Colombia - Cotizacion");
        System.out.println("Cliente " + cliente.getNombres()+ " " + cliente.getApellidos());
        System.out.println("Descripcion : " + descripcion);
        System.out.println("Valor total : " + CalculoValorTotal(productos));
    }
    
    public void agregarProducto (Producto producto){
        productos.add(producto);
    } 
    public double CalculoValorTotal(ArrayList Productos){
        for(Producto prod : productos){
            valorTotal=0;
            valorTotal = prod.getValor()+ valorTotal;}
        setValorTotal(valorTotal) ;
        return valorTotal;
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
