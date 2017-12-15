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
 * Esta clase define objetos que generan una factura
 *
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */
public class Factura extends RegistroVentas {

    //Campos de la Clase;
    private String IdFactura;
    private String fechaFactura;
    /**
     * Constructor para la clase Factura.
     */
    public Factura() {
    }

    /**
     * Constructor para la clase Factura.
     *
     * @param cotizacion
     * @param cliente El parámetro cliente define el cliente asociado a la
     * factura.
     * @param descripcion El parámetro descripcion define la descripcion de la
     * factura.
     * @param valorTotal El parámetro valorTotal define el valor total de la
     * factura.
     * @param fechaFactura El parámetro fechaFactura define la fecha en que se
     * crea la factura.
     *
     */
    public Factura(Cotizacion cotizacion) {
        setIdCliente(cotizacion.getIdCliente());
        super.setCliente(cotizacion.getCliente());
        setDescripcion(cotizacion.getDescripcion());
        setValorTotal(cotizacion.getValorTotal());
        this.fechaFactura = super.fechaActual();
        this.setProductos(cotizacion.getProductos());
    }

    public Factura ObtenerFactura(String Id) {
        ConexionBD Proyecto = new ConexionBD(); // se crea la conexion con base de datos.
        String sentencia = "select * from Proyecto.Factura where IdFactura ='" + Id + "'"; //Consulta SQL 
        ResultSet rs = Proyecto.consultarBD(sentencia); // Objeto ResulSet que contendra los datos devueltos de la consulta.
        try {
            if (rs.next()) {
                this.setIdFactura(Id);
                this.setDescripcion(rs.getString("descripcion"));
                this.setIdCliente(rs.getString("IdCliente"));
                this.setFechaFactura(rs.getString("FechaFactura"));
                this.setValorTotal(rs.getDouble("valorTotal"));
                setRutaArchivo(rs.getString("rutaArchivo"));
                return this;

            }
        } catch (SQLException ex) {

            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Factura> obtenerListaFacturas(String idCliente) {
        ConexionBD diamante = new ConexionBD();
        String sentencia = "select IdFactura from factura  where IdCliente = '" + idCliente + "'";
        ResultSet rs = diamante.consultarBD(sentencia);
        List<Factura> facturas = new ArrayList<>();
        try {
            while (rs.next()) {
                Factura u = new Factura();
                u.ObtenerFactura(rs.getString("IdFactura"));
                facturas.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return facturas;
    }
    
    public Boolean crearfactura() {
        
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "Insert into Proyecto.Factura (IdCliente,descripcion,fechaFactura,valorTotal,rutaArchivo) "
                + " Values('" + getIdCliente()+ "',"
                + "'" + getDescripcion()+ "',"
                + "'" + getFechaFactura()+ "',"
                + "'" + getValorTotal()+ "',"
                + "'" + getRutaArchivo()+ "');";
        boolean exito = Proyecto.insertarBD(sentencia);
        if (exito) {
            String sentencia2 = "select max(IdFactura) as Id from Proyecto.Factura;";
            ResultSet rs = Proyecto.consultarBD(sentencia2);
            try {
                if (rs.next()) {
                    this.setIdFactura(rs.getString("Id"));
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
        String sentencia = "Update  Proyecto.Cotizacion set rutaArchivo='" + getRutaArchivo()+"'  where IdCotizacion ='" + getIdFactura()+ "'";
        boolean exito = Proyecto.insertarBD(sentencia);        
        Proyecto.cerrarConexion();
        return exito;
    }

    /**
     * Metodo que permite agregar un producto al arreglo de productos en una
     * factura.
     *
     * @param producto
     */

    public void agregarProducto(Producto producto) {
        getProductos().add(producto);
    }

    public String getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(String IdFactura) {
        this.IdFactura = IdFactura;
    }


    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }


    /**
     * Metodo crea un pedido, debe ser llamado luego de crear la factura.
     *
     * @return pedido con estado facturado y los datos de la factura.
     */
//    public Pedido generarPedido(){
//        this.fechaAprobado=fechaAprobado();
//        pedido = new Pedido("Facturado",getCliente(),getProductos(),getFechaAprobado());
//        setPedido(pedido);
//        return pedido;
//                
//    }
    
}
