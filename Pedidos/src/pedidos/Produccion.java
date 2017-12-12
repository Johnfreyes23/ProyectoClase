/*
 * Proyecto final para la asignatura Principios y Practicas del desarrollo de Software Orientado a Objetos.
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 */
package pedidos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase define objetos que generan una orden de produccion
 *
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */
public class Produccion extends Registro {

    //Campos de la Clase
    private String IdProduccion;
    private String IdEmpleado;
    private String FechaEntrega;
    private Empleado empleado;
    private String RutaArchivo;
    private String fechaInicial;

    /**
     * Constructor para la clase produccion
     *
     * @param pedido El parámetro pedido define el pedido asociado a la orden de
     * produccion;
     */
    public Produccion() {
        this.fechaInicial = fechaActual();
    }

    /**
     * Metodo que imprime en pantalla una orden de pedido para entregar en
     * produccion.
     */

    public void GenerarOrden() {
        System.out.println("Arteacryl de Colombia - Orden de Produccion");
        System.out.println("Empleado Encargado " + getEmpleado().getNombres() + " " + getEmpleado().getApellidos());
        System.out.println("Fecha Inicio de Produccion : " + this.fechaInicial);
        System.out.println("Descripcion: ");
        System.out.println("Fecha Estimada de entrega: " + this.FechaEntrega);
    }

    public Produccion ObtenerProduccion(String Id) {
        ConexionBD Proyecto = new ConexionBD(); // se crea la conexion con base de datos.
        String sentencia = "selec * from Proyecto.Produccion where IdProduccion ='" + Id + "'"; //Consulta SQL 
        ResultSet rs = Proyecto.consultarBD(sentencia); // Objeto ResulSet que contendra los datos devueltos de la consulta.
        try {
            if (rs.next()) {
                this.setIdProduccion(Id);
                this.setIdEmpleado(rs.getString("IdUsr"));
                this.setFechaInicial(rs.getString("fechaInicio"));
                this.setFechaEntrega(rs.getString("fechaDespacho"));
                return this;

            }
        } catch (SQLException ex) {

            Logger.getLogger(Produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getIdProduccion() {
        return IdProduccion;
    }

    public void setIdProduccion(String IdProduccion) {
        this.IdProduccion = IdProduccion;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdCliente) {
        this.IdEmpleado = IdCliente;
    }

    
    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getRutaArchivo() {
        return RutaArchivo;
    }

    public void setRutaArchivo(String RutaArchivo) {
        this.RutaArchivo = RutaArchivo;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

}
