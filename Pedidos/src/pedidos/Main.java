/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author john
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Cliente c1 = new Cliente("910", "Jhon", "Reyes", "10108515", "2000-10-23", "Masculino", "calle 18 #24-21", "6352511", "juanperez@hotmail.com");
//        c1.crearUsuario();
////        Empleado e1 = new Empleado("4", "Carlos", "Reyes", "10108515", "2000-10-23", "Masculino", "calle 18 #24-21", "6352511", "juanperez@hotmail.com", "Operario");
////        e1.crearUsuario();
//        Usuario u = new Usuario();
//        u.obtenerUsuario("3");
//        System.out.println(u.getApellidos());
//        List<Usuario> usuarios = u.obtenerListaUsuarios();
//        for (Usuario us : usuarios){
//            System.out.println(us.getNombres()+" "+us.getApellidos());
//        }
        
        // TODO code application logic here 
        Polietileno po = new Polietileno(2, 30, 40);
        po.Imprimir(po);
        Scanner sc = new Scanner(System.in);
        Integer option;
        do{
        System.out.println("¿Qué quiere hacer? \n 1)Agregar un empleado. \n 2))Hacer una cotización. \n 3)Salir");
        option = sc.nextInt();
        switch(option)
        {
            case 1: 
                System.out.println("Va a ingresar un empleado.");
                Empleado empleado = new Empleado();
                System.out.println("Nombres:.");
                empleado.setNombres(sc.next());
                System.out.println("Apellidos:.");
                empleado.setApellidos(sc.next());
                System.out.println("Documento de Identidad:.");
                empleado.setID(sc.next());
                System.out.println("Cargo:.");
                empleado.setCargo(sc.next());
                System.out.println("Fecha de Nacimiento:.");
                empleado.setFecha_Nacimiento(sc.next());
                System.out.println("Dirección:.");
                empleado.setDireccion(sc.next());
                System.out.println("Telefono:.");
                empleado.setTelefono(sc.next());
                System.out.println("Correo:.");
                empleado.setCorreo(sc.next());
                break;
            case 2: 
                System.out.println("Va a realizar una cotización.");
                System.out.println("Cedula del cliente");
                Cotizacion cotizar = new Cotizacion();
                String cedula = sc.next();
                Cliente lista = new Cliente();
                for(Cliente ver : lista.obtenerListaClientes())
                {   
                    if(cedula.equals(ver.getIdenficacion()))
                    {
                        cotizar.setCliente( ver);
                        System.out.println("Si funcionó");
                        break;
                    }
                    else
                    {
                        System.out.println("Cliente no registrado. Llenar los siguientes campos:");
                        System.out.println("Va a ingresar un cliente.");
                        Cliente cliente = new Cliente();
                        System.out.println("Código de Cliente:.");
                        cliente.setID(sc.next());
                        System.out.println("Nombres:.");
                        cliente.setNombres(sc.next());
                        System.out.println("Apellidos:.");
                        cliente.setApellidos(sc.next());
                        System.out.println("Documento de Identidad:.");
                        cliente.setIdenficacion(sc.next());
                        System.out.println("Genero:.");
                        cliente.setGenero(sc.next());
                        System.out.println("Fecha de Nacimiento:.");
                        cliente.setFecha_Nacimiento(sc.next());
                        System.out.println("Dirección:.");
                        cliente.setDireccion(sc.next());
                        System.out.println("Telefono:.");
                        cliente.setTelefono(sc.next());
                        System.out.println("Correo:.");
                        cliente.setCorreo(sc.next());
                        if(cliente.crearUsuario())
                        {
                            cotizar.setCliente(cliente);
                            System.out.println(cliente.getNombres() + " " + cliente.getApellidos() + "" + cliente.getCategoria());
                        }
                        else
                        {
                            System.out.println("No se pudo insertar en base de datos");
                        }
                        
                        break;
                    }
                }
                break;
                
        }
        } while(option != 3);
        
    }
}
