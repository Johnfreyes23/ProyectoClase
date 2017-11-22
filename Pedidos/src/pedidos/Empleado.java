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
public class Empleado extends Usuario {
    private String Cargo;
    private String Orden_Pedido;
    public Empleado(String ID, String Nombres, String Apellidos, String Identificacion, String Fecha_Nacimiento, String Genero, String Direccion, String Telefono, String Correo, String Cargo) {
        super(ID, Nombres, Apellidos, Identificacion, Fecha_Nacimiento,  Genero, Direccion, Telefono, Correo);
        this.Cargo = Cargo;
        this.Orden_Pedido = Orden_Pedido;
        setCategoria("Empleado");
    }
    

    public Empleado() {
        super();
        setCategoria("Empleado");
    }
    public List<Empleado> obtenerListaEmpleados() {
        ConexionBD diamante = new ConexionBD();
        String sentencia = "select IdUsr from Usuario ";
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
