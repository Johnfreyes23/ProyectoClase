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

    public Cliente(String ID, String Nombres,  String Apellidos, String Identificacion,  String Fecha_Nacimiento, String Genero, String Direccion, String Telefono, String Correo) {
        super( ID,  Nombres,   Apellidos,  Identificacion,   Fecha_Nacimiento,  Genero,  Direccion,  Telefono,  Correo);
        setCategoria("cliente");
    }
    

    public Cliente() {
        super();
        setCategoria("cliente");
    }
    
    public String getId_Pedido() {
        return Id_Pedido;
    }

    public void setId_Pedido(String Id_Pedido) {
        this.Id_Pedido = Id_Pedido;
    }

  
}
