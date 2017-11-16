/*
 * ConexionBD.java  (01/06/04)
 *
 * Derechos de Autor Grupo Software CALUMET, 
 * Escuela de Ingeniera de Sistemas e Informtica - UIS
 * Bucaramanga (Santander) Colombia
 * Todos los derechos reservados.
 *
 * Este software es informacin propietaria y confidencial del 
 * Grupo Software CALUMET, cualquier intento de uso o distribucin
 * debe ser aprobado por CALUMET
 *
 * ltima modificacin:  23/12/04 
 * @Author: Rikardo lvarez
 */
package pedidos;

import java.sql.*;

public class ConexionBD {

    // Configuracion de la conexion a la base de datos 
    private String DB_driver = "";
    private String url = "";
    private String username = "";
    private String password = "";
    public Connection con = null;
    private Statement stmt = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private String query = null;

    //Constructor sin parmetros		
    public ConexionBD() {
        DB_driver = "com.mysql.jdbc.Driver";

        url = "jdbc:mysql://localhost:3306/Proyecto"; //URL base de datos poseidon // se encuentra en civil
        username = "root"; //usuario base de datos 
        password = "piolin"; // Contrasenna

        //Asignacin del Driver
        try {
            Class.forName(DB_driver);
        } catch (ClassNotFoundException cnfx) {
            //System.out.println("No se pudo cargar el Driver Correctamente!");
        }
        // Realizar la conexin
        try {
            con = DriverManager.getConnection(url, username, password);
            con.setTransactionIsolation(8);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    // Constructor con parmetros
    ConexionBD(String driver, String url, String usuario, String passw) {
        this.DB_driver = driver;
        this.url = url;
        this.username = usuario;
        this.password = passw;

        //Asignacin del Driver
        try {
            Class.forName(DB_driver);
        } catch (ClassNotFoundException cnfx) {
            //System.out.println("No se pudo cargar el Driver Correctamente!");
        }
        // Realizar la conexin
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //Retornar la conexin
    public Connection getConnection() {
        return con;
    }

    //Cerrar la conexin
    public void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Mtodo que devuelve un ResultSet de una consulta (tratamiento de SELECT)
    public ResultSet consultarBD(String sentencia) {
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sentencia);
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } catch (RuntimeException rex) {
            rex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return rs;
    }


    // Metodo que realiza un INSERT y devuelve TRUE si la operacin fue existosa
    public boolean insertarBD(String sentencia) {
        try {
            stmt = con.createStatement();
            stmt.execute(sentencia);
        } catch (SQLException sqlex) {
            //System.out.println("ERROR RUTINA: "+ sqlex);
            return false;
        } catch (RuntimeException rex) {
            //System.out.println("ERROR RUTINA: "+ rex);
            return false;
        } catch (Exception ex) {
            //System.out.println("EXCEPCION: "+ ex);
            return false;
        }
        return true;
    }


    // Método que realiza una operacin como UPDATE, DELETE, CREATE TABLE, entre otras
    // y devuelve TRUE si la operacin fue existosa
    public boolean actualizarBD(String sentencia) {
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(sentencia);
        } catch (SQLException sqlex) {
            System.out.println("ERROR RUTINA: " + sqlex);
            return false;
        } catch (RuntimeException rex) {
            System.out.println("ERROR RUTINA: " + rex);
            return false;
        } catch (Exception ex) {
            System.out.println("EXCEPCION: " + ex);
            return false;
        }
        return true;
    }


    public boolean executeBD(String sentencia) {
        try {
            stmt = con.createStatement();
            stmt.execute(sentencia);
        } catch (SQLException sqlex) {
            System.out.println("ERROR RUTINA: " + sqlex);
            return false;
        } catch (RuntimeException rex) {
            System.out.println("ERROR RUTINA: " + rex);
            return false;
        } catch (Exception ex) {
            System.out.println("EXCEPCION: " + ex);
            return false;
        }
        return true;
    }

    public boolean setAutoCommitBD(boolean parametro) {
        try {
            con.setAutoCommit(parametro);
        } catch (SQLException sqlex) {
            System.out.println("Error al configurar el autoCommit " + sqlex.getMessage());
            return false;
        }
        return true;
    }

    public void cerrarConexion() {
        closeConnection(con);
    }

    public boolean commitBD() {
        try {
            con.commit();
            return true;
        } catch (SQLException sqlex) {
            //System.out.println("Error al hacer commit "+sqlex.getMessage());
            return false;
        }
    }

    public boolean rollbackBD() {
        try {
            con.rollback();
            return true;
        } catch (SQLException sqlex) {
            //System.out.println("Error al hacer rollback "+sqlex.getMessage());
            return false;
        }
    }

}
