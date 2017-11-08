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
public class Cliente extends Usuario{
    private String Id_Pedido;
    private String Id_Cliente;

    public Cliente(String Nombres, String Apellidos, String ID, String Fecha_Nacimiento, String Direccion, String Telefono, String Correo) {
        super(Nombres, Apellidos, ID, Fecha_Nacimiento, Direccion, Telefono, Correo);
    }

    public Cliente() {
        super();
    }
    
    public String getId_Pedido() {
        return Id_Pedido;
    }

    public void setId_Pedido(String Id_Pedido) {
        this.Id_Pedido = Id_Pedido;
    }

    public String getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(String Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }
    
}
