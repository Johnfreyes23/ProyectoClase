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
        Scanner sc = new Scanner(System.in);
        
        Integer option;
        do{
        System.out.println("\n\n¿Qué quiere hacer? \n 1)Agregar un empleado. \n 2))Hacer una cotización. \n 3)Salir");
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
                Boolean find = false;
                Cliente c = new Cliente();
                for (Cliente it : lista.obtenerListaClientes()) {
                    if(cedula.equals(it.getIdenficacion()))
                    {
                        find = true;
                        c = it;
                        break;
                    }
                }
                if(find == true )
                {
                    cotizar.setCliente(c);
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
                    }
                    else
                    {
                        System.out.println("No se pudo insertar en base de datos");
                    }
                }
                int agregar = 1;
                ArrayList<Producto> productos = new ArrayList();
                do
                {
                    System.out.println("Cliente: " + cotizar.getCliente().getNombres() + " " + cotizar.getCliente().getApellidos());
                    System.out.println("Seleccione el producto a agregar: \n\t 1)Acrilico. \n\t 2)Cajon \n\t 3)Polietileno");
                    option = sc.nextInt();
                    Double alto, ancho, canto, calibre;
                    String color = "cristal";
                    System.out.println("Alto (cm): ");
                    alto = sc.nextDouble();
                    System.out.println("Ancho (cm): ");
                    ancho = sc.nextDouble();
                    switch(option)
                    {
                        case 1:
                            System.out.println("Calibre (mm): ");
                            calibre = sc.nextDouble();
                            System.out.println("Seleccione el color: \n\t 1)Opal \n\t 2)Cristal \n\t 3)Otros");
                            option = sc.nextInt();
                            switch(option)
                            {
                                case 1: color = "opal"; break;
                                case 2: color = "cristal"; break;
                                case 3: color = "otros"; break;
                            }
                            Acrilico acri = new Acrilico (calibre, color, alto, ancho);
                            productos.add(acri);
                            break;

                        case 2:
                            System.out.println("Numero de tubos: ");
                            int tubos = sc.nextInt();
                            System.out.println("Numero de leds: ");
                            int leds = sc.nextInt();
                            System.out.println("Canto(cm): ");
                            canto = sc.nextDouble();
                            System.out.println("Manofactura: ");
                            Double manofactura = sc.nextDouble();
                            System.out.println("Otros costos: ");
                            Double otros = sc.nextDouble();
                            Cajon cajon = new Cajon(tubos, leds, canto, manofactura, otros, alto, ancho);
                            productos.add(cajon);
                            break;
                            
                        case 3:
                            System.out.println("Calibre (mm): ");
                            calibre = sc.nextDouble();
                            Polietileno poli = new Polietileno(calibre, alto, ancho);
                            productos.add(poli);
                            break;
                    }
                    System.out.println("Agregar otro producto? \n\t 1)SI \n\t 2)NO");
                    agregar = sc.nextInt();
                }while(agregar == 1);
                cotizar.setProductos(productos);
                cotizar.generarCotizacion();
                break;
        }
        } while(option != 3);
        
    }
}
