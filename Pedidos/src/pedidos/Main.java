/*
 * Proyecto final para la asignatura Principios y Practicas del desarrollo de Software Orientado a Objetos.
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
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
                System.out.println("Codigo Empleado:");
                empleado.setID(sc.next());
                System.out.println("Nombres:.");
                empleado.setNombres(sc.next());
                System.out.println("Apellidos:.");
                empleado.setApellidos(sc.next());
                System.out.println("Documento de Identidad:.");
                empleado.setIdenficacion(sc.next());
                System.out.println("Genero:.");
                empleado.setGenero(sc.next());
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
                empleado.crearUsuario();
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
                System.out.println("\n ¿Contuniar a facturar? \n\t 1)Descartar cotización. 2)Facturar.");
                option = sc.nextInt();
                if(option == 2)
                {
                    Factura factura = new Factura(cotizar);
                    System.out.println("FACTURA \n Fecha: " + factura.getFechaAprobado() +  "\n Producto \t\t Valor");
                    for(Producto ver : factura.getProductos())
                    {
                        System.out.println(ver.getTipo() + "\t\t" + ver.getValor());
                    }
                    System.out.println("VALOR TOTAL: \t $" + factura.CalculoValorTotal(productos));
                    
                    System.out.println("Para enviar pedido a producción presione enter");
                    sc.next();
                    Pedido pedido = factura.generarPedido();
                    Empleado e1 = new Empleado();
                    System.out.println("Asignar un empleado al pedido:");
                    int i = 1;
                    for(Empleado ver : e1.obtenerListaEmpleados())
                    {
                        System.out.println(i + ")" + ver.getNombres() + " " + ver.getApellidos());
                        i++;
                    }
                    option = sc.nextInt();
                    pedido.setEmpleado(e1.obtenerListaEmpleados().get(option-1));
                    Produccion produccion = new Produccion(pedido);
                    System.out.println("Fecha estimada de entrega del producto: ");
                    produccion.setFechaEntrega(sc.next());
                    produccion.GenerarOrden();
                }
                break;
        }
        } while(option != 3);
        
    }
}
