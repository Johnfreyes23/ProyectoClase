    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author john
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.obtenerTarea("1");
        System.out.println(u.getApellidos());
        // TODO code application logic here 
//        ArrayList<Usuario> usuarios = new ArrayList();
//        Scanner sc = new Scanner(System.in);
//        Integer option;
//        do{
//        System.out.println("¿Qué quiere hacer? \n 1)Agregar un empleado. \n 2)Agregar un cliente. \n 3)Hacer una cotización. \n 4)Salir");
//        option = sc.nextInt();
//        switch(option)
//        {
//            case 1: 
//                System.out.println("Va a ingresar un empleado.");
//                Empleado empleado = new Empleado();
//                System.out.println("Nombres:.");
//                empleado.setNombres(sc.next());
//                System.out.println("Apellidos:.");
//                empleado.setApellidos(sc.next());
//                System.out.println("Documento de Identidad:.");
//                empleado.setID(sc.next());
//                System.out.println("Cargo:.");
//                empleado.setCargo(sc.next());
//                System.out.println("Fecha de Nacimiento:.");
//                empleado.setFecha_Nacimiento(sc.next());
//                System.out.println("Dirección:.");
//                empleado.setDireccion(sc.next());
//                System.out.println("Telefono:.");
//                empleado.setTelefono(sc.next());
//                System.out.println("Correo:.");
//                empleado.setCorreo(sc.next());
//                usuarios.add(empleado);
//                break;
//            case 2: 
//                System.out.println("Va a ingresar un cliente.");
//                Cliente cliente = new Cliente();
//                System.out.println("Código de Cliente:.");
//                cliente.setId_Cliente(sc.next());
//                System.out.println("Nombres:.");
//                cliente.setNombres(sc.next());
//                System.out.println("Apellidos:.");
//                cliente.setApellidos(sc.next());
//                System.out.println("Documento de Identidad:.");
//                cliente.setID(sc.next());
//                System.out.println("Fecha de Nacimiento:.");
//                cliente.setFecha_Nacimiento(sc.next());
//                System.out.println("Dirección:.");
//                cliente.setDireccion(sc.next());
//                System.out.println("Telefono:.");
//                cliente.setTelefono(sc.next());
//                System.out.println("Correo:.");
//                cliente.setCorreo(sc.next());
//                usuarios.add(cliente);
//                break;
//            case 3: 
//                System.out.println("Va a realizar una cotización.");
//                break;
//                
//        }
//        } while(option != 4);
//        
//        for(Usuario usu : usuarios){
//            System.out.println(usu.getNombres() + " " + usu.getApellidos());
//        }
    }
    
}
