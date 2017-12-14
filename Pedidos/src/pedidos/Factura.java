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
 * Esta clase define objetos que generan una factura
 *
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */
public class Factura extends RegistroVentas {

    //Campos de la Clase;
    private String IdFactura;
    private String descripcion;
    private double valorTotal;
    private String fechaFactura;

    /**
     * Constructor para la clase Factura.
     */
    public Factura() {
    }

    /**
     * Constructor para la clase Factura.
     *
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
        this.descripcion = cotizacion.getDescripcion();
        this.valorTotal = cotizacion.getValorTotal();
        this.fechaFactura = super.fechaActual();
        this.setProductos(cotizacion.getProductos());
    }

    public Factura ObtenerFactura(String Id) {
        ConexionBD Proyecto = new ConexionBD(); // se crea la conexion con base de datos.
        String sentencia = "selec * from Proyecto.Factura where IdFactura ='" + Id + "'"; //Consulta SQL 
        ResultSet rs = Proyecto.consultarBD(sentencia); // Objeto ResulSet que contendra los datos devueltos de la consulta.
        try {
            if (rs.next()) {
                this.setIdFactura(Id);
                this.setDescripcion(rs.getString("descripcion"));
                this.setIdCliente(rs.getString("IdCliente"));
                this.setFechaFactura(rs.getString("FechaFactura"));
                this.setValorTotal(rs.getDouble("valorTotal"));
                return this;

            }
        } catch (SQLException ex) {

            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

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
