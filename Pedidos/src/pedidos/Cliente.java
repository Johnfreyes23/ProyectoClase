/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public List<Cliente> obtenerListaClientes() {
        ConexionBD diamante = new ConexionBD();
        String sentencia = "select IdUsr from Usuario ";
        ResultSet rs = diamante.consultarBD(sentencia);
        List<Cliente> clientes = new ArrayList<>();
        try {
            while (rs.next()) {
                Cliente u = new Cliente();
                u.obtenerUsuario(rs.getString("IdUsr"));
                clientes.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
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
