/*
 * Proyecto final para la asignatura Principios y Practicas del desarrollo de Software Orientado a Objetos.
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 */
package pedidos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase define objetos que generan un Cliente. 
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */

public class Cliente extends Usuario{
    private String Id_Pedido;

/**
* Constructor para la clase Cliente. 
* @param Nombres 
* @param Apellidos 
* @param Fecha_Nacimiento 
* @param Identificacion 
* @param Genero 
* @param Correo 
* @param Direccion 
* @param Telefono 
* @paam Correo 
*/
    public Cliente( String Nombres,  String Apellidos, String Identificacion,  String Fecha_Nacimiento, String Genero, String Direccion, String Telefono, String Correo) {
        super(   Nombres,   Apellidos,  Identificacion,   Fecha_Nacimiento,  Genero,  Direccion,  Telefono,  Correo);
        this.setCategoria("cliente");
    }
    
/**
* Metodo obtiene una lista de Clientes de base de datos.
* @return lista de Clientes en la tabla usuarios en base de datos.
*/
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
