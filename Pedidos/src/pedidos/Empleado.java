/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

/**
 *
 * @author Nicolas
 */
public class Empleado extends Usuario {
    private String Cargo;
    private String Orden_Pedido;

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getOrden_Pedido() {
        return Orden_Pedido;
    }

    public void setOrden_Pedido(String Orden_Pedido) {
        this.Orden_Pedido = Orden_Pedido;
    }


    public Empleado(String Cargo, String Orden_Pedido, String Nombres, String Apellidos, String ID, String Fecha_Nacimiento, String Genero, String Direccion, String Telefono, String Correo) {
        super(ID, Nombres, Direccion, Apellidos, Fecha_Nacimiento, Genero, Direccion, Telefono, Correo);
        this.Cargo = Cargo;
        this.Orden_Pedido = Orden_Pedido;
        setCategoria("cliente");
    }
    

    public Empleado() {
        super();
        setCategoria("cliente");
    }
    
    
}
