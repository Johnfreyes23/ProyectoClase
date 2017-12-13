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
 * Esta clase define objetos que generan un Usuario. 
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */
public class Usuario {
    //Campos de la Clase
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
    private String Cargo;
/**
* Constructor para la clase Usuario.
* @param ID Identificacion del usuario en base de datos. 
* @param Nombres 
* @param Apellidos 
* @param Identificacion 
* @param Genero 
* @param Nombres 
* @param Direccion 
* @param Telefono 
* @param Correo 
*/
   public Usuario( String Nombres,  String Apellidos, String Identificacion,  String Fecha_Nacimiento, String Genero, String Direccion, String Telefono, String Correo) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        
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

/**
* Metodo obtiene el usuario de base de datos conocido su ID.
* @param Id id de Usuario.
* @return un objeto usuario con sus atributos llenos.
*/
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
/**
* Metodo obtiene una lista de usuarios de base de datos.
* @return lista de usuarios en la tabla usuarios en base de datos.
*/
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
/**
* Metodo que crea en la tabla usuario en bases de datos un usuario.
* @return true si pudo ser creado de lo contrario retorna false.
*/   
    public Boolean crearUsuario() {
        ConexionBD Proyecto = new ConexionBD();
        String sentencia = "Insert into Proyecto.Usuario (Identif,Categoria,NomUsr,ApeUsr,CorreoUsr,GeneroUsr,Domicilio,Telefono,FechaNacimiento,cargo) "
                + " Values('" + this.Identificacion + "',"
                + "'" + this.Categoria + "',"
                + "'" + this.Nombres + "',"
                + "'" + this.Apellidos + "',"
                + "'" + this.Correo + "',"
                + "'" + this.Genero + "',"
                + "'" + this.Direccion + "',"
                + "'" + this.Telefono + "',"
                + "'" + this.Fecha_Nacimiento + "',"
                + "'" + this.Cargo + "');";
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

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
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
