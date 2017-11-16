/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author john and Nicolas XD
 */
public class Usuario {
    private String Nombres;
    private String Apellidos;
    private String ID;
    private String Fecha_Nacimiento;
    private String Idenficacion;
    private String Genero;
    private String Direccion;
    private String Telefono;
    private String Correo;

    public Usuario(String Nombres, String Apellidos, String ID, String Fecha_Nacimiento, String Genero, String Direccion, String Telefono, String Correo) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.ID = ID;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Genero = Genero;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

  

    public Usuario() {
    }
    
    public Usuario obtenerUsuario(String Id) {
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "select * from Usuario where IdUsr='" + Id + "'";
        ResultSet rs = Proyecto.consultarBD(sentencia);
        try {
            if (rs.next()) {
                this.setID(Id);
                this.setNombres(rs.getString("NomUsr"));
                this.setApellidos(rs.getString("ApeUsr"));
                return this;
            }
        } catch (SQLException ex) {

            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public String getIdenficacion() {
        return Idenficacion;
    }

    public void setIdenficacion(String Idenficacion) {
        this.Idenficacion = Idenficacion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    
    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
}
