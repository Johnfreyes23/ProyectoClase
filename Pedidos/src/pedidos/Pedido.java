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
    private String idPedido;
    private ArrayList<Producto> productos = new ArrayList();
    private Cliente cliente = new Cliente();
    private ArrayList<Empleado> empleado=new ArrayList();
    private String IDcliente;
    private String descripcion;
    private double valorTotal;
    private Date fechaIncial;
    private Date fechaFinal;

    public Pedido() {
        
    }
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
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

    public String getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(String IDcliente) {
        this.IDcliente = IDcliente;
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
