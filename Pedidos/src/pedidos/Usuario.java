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
 * @author john and Nicolas XD
 */
public class Usuario {
    private String Nombres;
    private String Apellidos;
    private String ID;
    private String Fecha_Nacimiento;
    private String Identificacion;
    private String Genero;
    private String Direccion;
    private String Telefono;
    private String Correo;
    private String Categoria ;

   public Usuario(String ID, String Nombres,  String Apellidos, String Identificacion,  String Fecha_Nacimiento, String Genero, String Direccion, String Telefono, String Correo) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.ID = ID;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Identificacion = Identificacion;
        this.Genero = Genero;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Categoria= null;
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
                this.setIdenficacion(rs.getString("Identif"));
                this.setFecha_Nacimiento("FechaNacimiento");
                this.setGenero("GeneroUsr");
                this.setDireccion("Domicilio");
                this.setTelefono("Telefono");
                this.setCorreo(rs.getString("CorreoUsr"));
                return this;
            }
            
        } catch (SQLException ex) {

            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    public List<Usuario> obtenerListaUsuarios() {
        ConexionBD diamante = new ConexionBD();
        String sentencia = "select IdUsr from Usuario ";
        ResultSet rs = diamante.consultarBD(sentencia);
        List<Usuario> usuarios = new ArrayList<>();
        try {
            while (rs.next()) {
                Usuario u = new Usuario();
                u.obtenerUsuario(rs.getString("IdUsr"));
                usuarios.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }
    
    public Boolean crearUsuario() {
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "Insert into Proyecto.Usuario (IdUsr,Identif,Categoria,NomUsr,ApeUsr,CorreoUsr,GeneroUsr,Domicilio,Telefono,FechaNacimiento) "
                + " Values('" + this.ID + "',"
                + "'" + this.Identificacion + "',"
                + "'" + this.Categoria + "',"
                + "'" + this.Nombres + "',"
                + "'" + this.Apellidos + "',"
                + "'" + this.Correo + "',"
                + "'" + this.Genero + "',"
                + "'" + this.Direccion + "',"
                + "'" + this.Telefono + "',"
                + "'" + this.Fecha_Nacimiento + "');";
        boolean exito = Proyecto.insertarBD(sentencia);
        if (exito) {
            String sentencia2 = "select max(IdUsr) as Id from Proyecto.Usuario;";
            ResultSet rs = Proyecto.consultarBD(sentencia2);
            try {
                if (rs.next()) {
                    this.setID(rs.getString("Id"));
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

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    
    public String getIdenficacion() {
        return Identificacion;
    }

    public void setIdenficacion(String Idenficacion) {
        this.Identificacion = Idenficacion;
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
