/*
 * Proyecto final para la asignatura Principios y Practicas del desarrollo de Software Orientado a Objetos.
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 */
package pedidos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Esta clase define objetos que generan un pedido. 
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */
public class Pedido extends Registro{
    //Campos de la Clase
    private String IdPedido;
    private String estado;
    private String IdCotizacion;
    private String IdFactura;
    private String IdProduccion;
    private double valorTotal;
/**
* Constructor para la clase Pedido.
* @param estado El parámetro estado define el estado asociado a el pedido.
* @param cliente El parámetro cliente define el cliente asociado al pedido.
* @param productos El parámetro productos cotendra un Array con productos asociados al pedido.
* @param fechaIncial El parámetro fechaIncial define la fecha en que se inicio el pedido.
*/
    public Pedido(String estado, Cliente cliente, ArrayList<Producto>  productos, String fechaIncial) {
        this.estado = estado;
        setCliente(cliente);
    }
    
    
    public Pedido() {
        
    }   
    
    public Pedido ObtenerPedido(String Id){
       ConexionBD Proyecto = new ConexionBD(); // se crea la conexion con base de datos.
       String sentencia = "selec * from Proyecto.Pedido where IdPedido ='"+ Id + "'"; //Consulta SQL 
       ResultSet rs = Proyecto.consultarBD(sentencia); // Objeto ResulSet que contendra los datos devueltos de la consulta.
       try{
           if(rs.next()){
               this.setIdPedido(Id);
               this.setEstado(rs.getString("IdPedido"));
               this.setEstado(rs.getString("IdCliente"));
               this.setEstado(rs.getString("IdCotizacion"));
               this.setEstado(rs.getString("IdFactura"));
               this.setEstado(rs.getString("IdProduccion"));
               this.setEstado(rs.getString("estado"));       
               return this;
               
           }
       }
        catch (SQLException ex) {

            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null;
    }
    public Boolean crearPedido() {
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "Insert into Proyecto.Pedido (IdCliente,IdCotizacion,IdFactura,IdProduccion,estado) "
                + " Values('" + getIdCliente()+ "',"
                + "'" + this.IdCotizacion + "',"
                + "'" + this.IdFactura + "',"
                + "'" + this.IdProduccion + "',"
                + "'" + this.estado  + "');";
        boolean exito = Proyecto.insertarBD(sentencia);
        if (exito) {
            String sentencia2 = "select max(IdUsr) as Id from Proyecto.Usuario;";
            ResultSet rs = Proyecto.consultarBD(sentencia2);
            try {
                if (rs.next()) {
                    this.setIdPedido(rs.getString("IdPedido"));
                    Proyecto.cerrarConexion();
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Proyecto.cerrarConexion();
        return false;
    }
    public Boolean GuardarEstado() {
        
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "Update  Proyecto.Pedido set estado='" + getEstado()+"'  where IdPedido ='" + getIdPedido()+ "'";
        boolean exito = Proyecto.insertarBD(sentencia);        
        Proyecto.cerrarConexion();
        return exito;
    }
    public Boolean GuardarIdCotizacion() {
        
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "Update  Proyecto.Pedido set IdCotizacion='" + getIdCotizacion()+"'  where IdPedido ='" + getIdPedido()+ "'";
        boolean exito = Proyecto.insertarBD(sentencia);        
        Proyecto.cerrarConexion();
        return exito;
    }

     public Boolean GuardarIdFactura() {
        
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "Update  Proyecto.Pedido set IdFactura='" + getIdFactura()+"'  where IdPedido ='" + getIdPedido()+ "'";
        boolean exito = Proyecto.insertarBD(sentencia);        
        Proyecto.cerrarConexion();
        return exito;
    }
     public Boolean GuardarIdProduccion() {
        
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "Update  Proyecto.Pedido set IdProduccion='" + getIdProduccion()+"'  where IdPedido ='" + getIdPedido()+ "'";
        boolean exito = Proyecto.insertarBD(sentencia);        
        Proyecto.cerrarConexion();
        return exito;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(String IdPedido) {
        this.IdPedido = IdPedido;
    }

    public String getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(String IdFactura) {
        this.IdFactura = IdFactura;
    }

    public String getIdProduccion() {
        return IdProduccion;
    }

    public void setIdProduccion(String IdProduccion) {
        this.IdProduccion = IdProduccion;
    }
    

    public String getIdCotizacion() {
        return IdCotizacion;
    }

    public void setIdCotizacion(String IdCotizacion) {
        this.IdCotizacion = IdCotizacion;
    }


    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
   
    
}
