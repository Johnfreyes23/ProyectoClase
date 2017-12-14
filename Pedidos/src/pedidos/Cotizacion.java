/*
 * Proyecto final para la asignatura Principios y Practicas del desarrollo de Software Orientado a Objetos.
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 */
package pedidos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase define objetos que generan cotizacion
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */

public class Cotizacion extends RegistroVentas {
    
/**
* Constructor para la clase produccion
* @param cliente El parámetro pedido define el cliente asociado a la cotizacion.
* @param descripcion El parámetro descripcion define la descripcion de la cotizacion.
* @param valorTotal El parámetro valorTotal define el valor total de la cotizacion.
* @param fechaAprobado El parámetro fechaAprobado define la fecha en que se crea la cotizacion.

*
//*/
//    public Cotizacion(Cliente cliente,String descripcion, double valorTotal, String fechaAprobado) {
//        super(cliente, descripcion, valorTotal, fechaAprobado);
//    }
    
    private String IdCotizacion;
    private String FechaCotizacion;
    

    public Cotizacion() {
        super();
        FechaCotizacion = super.fechaActual();
    }   
    
     public Cotizacion ObtenerCotizacion(String Id) {
        ConexionBD Proyecto = new ConexionBD(); // se crea la conexion con base de datos.
        String sentencia = "selec * from Proyecto.Cotizacion where IdCotizacion ='" + Id + "'"; //Consulta SQL 
        ResultSet rs = Proyecto.consultarBD(sentencia); // Objeto ResulSet que contendra los datos devueltos de la consulta.
        try {
            if (rs.next()) {
                this.setIdCotizacion(Id);
                this.setDescripcion(rs.getString("descripcion"));
                this.setIdCliente(rs.getString("IdCliente"));
                this.setFechaCotizacion(rs.getString("FechaCotizacion"));
                this.setValorTotal(rs.getDouble("valorTotal"));
                return this;

            }
        } catch (SQLException ex) {

            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
     
      public Boolean GuardarRuta() {
        
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "Insert into Proyecto.Cotizacion  where IdCotizacion ='" + getIdCotizacion() + "' (rutaArchivo) "
                + " Values('" + getRutaArchivo()+ "');";
        boolean exito = Proyecto.insertarBD(sentencia);
        
        Proyecto.cerrarConexion();
        return exito;
    }
     
     public Boolean crearCotizacion() {
        
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "Insert into Proyecto.Cotizacion (IdCliente,fechaCotizacion,descripcion,valorTotal,rutaArchivo) "
                + " Values('" + getIdCliente()+ "',"
                + "'" + getFechaCotizacion() + "',"
                + "'" + getDescripcion()+ "',"
                + "'" + getValorTotal()+ "',"
                + "'" + getRutaArchivo()+ "');";
        boolean exito = Proyecto.insertarBD(sentencia);
        if (exito) {
            String sentencia2 = "select max(IdCotizacion) as Id from Proyecto.Cotizacion;";
            ResultSet rs = Proyecto.consultarBD(sentencia2);
            try {
                if (rs.next()) {
                    this.setIdCotizacion(rs.getString("Id"));
                    Proyecto.cerrarConexion();
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Proyecto.cerrarConexion();
        return false;
    }

    public String getIdCotizacion() {
        return IdCotizacion;
    }

    public void setIdCotizacion(String IdCotizacion) {
        this.IdCotizacion = IdCotizacion;
    }

    public String getFechaCotizacion() {
        return FechaCotizacion;
    }

    public void setFechaCotizacion(String FechaCotizacion) {
        this.FechaCotizacion = FechaCotizacion;
    }
    
    
    
}
