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
public class Empleado extends Usuario {
    //Campos de la Clase
    private String Cargo;
    private String Orden_Pedido;
/**
* Constructor para la clase Empleado.
* @param ID Identificacion del Empleado en base de datos. 
* @param Nombres 
* @param Apellidos 
* @param Identificacion 
* @param Genero 
* @param Nombres 
* @param Direccion 
* @param Telefono 
* @param Correo 
*/
    public Empleado( String Nombres, String Apellidos, String Identificacion, String Fecha_Nacimiento, String Genero, String Direccion, String Telefono, String Correo, String Cargo) {
        super( Nombres, Apellidos, Identificacion, Fecha_Nacimiento,  Genero, Direccion, Telefono, Correo);
        this.Cargo = Cargo;
        this.Orden_Pedido = Orden_Pedido;
        setCategoria("Empleado");
    }
    

    public Empleado() {
        super();
        setCategoria("Empleado");
    }
    
/**
* Metodo obtiene una lista de Empleados de base de datos.
* @return lista de Empleados en la tabla usuarios en base de datos.
*/
    public List<Empleado> obtenerListaEmpleados() {
        ConexionBD diamante = new ConexionBD();
        String sentencia = "select IdUsr from Usuario where Categoria = 'Empleado'";
        ResultSet rs = diamante.consultarBD(sentencia);
        List<Empleado> empleados = new ArrayList<>();
        try {
            while (rs.next()) {
                Empleado u = new Empleado();
                u.obtenerUsuario(rs.getString("IdUsr"));
                empleados.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empleados;
    }

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


    
    
    
    
}
