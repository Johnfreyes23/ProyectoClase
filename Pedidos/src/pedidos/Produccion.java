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
    private String IdFactura;
    private String FechaEntrega;
    private Empleado empleado;
    private String RutaArchivo;
    private String fechaInicial;
    private ArrayList<Producto> productos;

    /**
     * Constructor para la clase produccion
     *
     * @param pedido El parámetro pedido define el pedido asociado a la orden de
     * produccion;
     */
    public Produccion(Factura factura) {
        this.fechaInicial = fechaActual();
        super.setCliente(factura.getCliente());
        super.setIdCliente(factura.getIdCliente());
        productos = factura.getProductos();
        this.IdFactura = factura.getIdFactura();
    }
    
    public Produccion()
    {}

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
        String sentencia = "select * from Proyecto.Produccion where IdFactura ='" + Id + "'"; //Consulta SQL 
        ResultSet rs = Proyecto.consultarBD(sentencia); // Objeto ResulSet que contendra los datos devueltos de la consulta.
        try {
            if (rs.next()) {
                this.setIdProduccion(Id);
                this.setIdEmpleado(rs.getString("IdEmpleado"));
                this.setFechaInicial(rs.getString("fechaInicio"));
                this.setFechaEntrega(rs.getString("fechaDespacho"));
                setIdCliente(rs.getString("IdEmpleado"));
                setRutaArchivo(rs.getString("rutaArchivo"));  
                return this;

            }
        } catch (SQLException ex) {

            Logger.getLogger(Produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Produccion ObtenerProduccionCliente(String Id) {
        ConexionBD Proyecto = new ConexionBD(); // se crea la conexion con base de datos.
        String sentencia = "selec * from Proyecto.Produccion where IdCliente ='" + Id + "'"; //Consulta SQL 
        ResultSet rs = Proyecto.consultarBD(sentencia); // Objeto ResulSet que contendra los datos devueltos de la consulta.
        try {
            if (rs.next()) {
                this.setIdProduccion(rs.getString("IdProduccion"));
                this.setIdEmpleado(rs.getString("IdEmpleado"));
                this.setFechaInicial(rs.getString("fechaInicio"));
                this.setFechaEntrega(rs.getString("fechaDespacho"));
                setIdCliente(rs.getString("IdEmpleado"));
                setRutaArchivo(rs.getString("rutaArchivo"));
                return this;

            }
        } catch (SQLException ex) {

            Logger.getLogger(Produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Boolean crearProduccion() {
        
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "Insert into Proyecto.Produccion (IdEmpleado,fechaInicio,fechaDespacho,rutaArchivo,IdCliente,IdFactura) "
                + " Values('" + getIdEmpleado()+ "',"
                + "'" + getFechaInicial()+ "',"
                + "'" + getFechaEntrega()+ "',"
                + "'" + getRutaArchivo()+ "',"
                + "'" + getCliente().getIdentificacion()+ "',"
                + "'" + getIdFactura()+ "');";        
        boolean exito = Proyecto.insertarBD(sentencia);
        if (exito) {
            String sentencia2 = "select max(IdProduccion) as Id from Proyecto.Factura;";
            ResultSet rs = Proyecto.consultarBD(sentencia2);
            try {
                if (rs.next()) {
                    this.setIdProduccion(rs.getString("Id"));
                    Proyecto.cerrarConexion();
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Proyecto.cerrarConexion();
        return false;
    }
    public Boolean GuardarRuta() {
        
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "Update  Proyecto.Produccion set rutaArchivo='" + getRutaArchivo()+"'  where IdCotizacion ='" + getIdProduccion()+ "'";
        boolean exito = Proyecto.insertarBD(sentencia);        
        Proyecto.cerrarConexion();
        return exito;
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(String IdFactura) {
        this.IdFactura = IdFactura;
    }
    

}
