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
        // TODO code application logic here        
        Scanner sc = new Scanner(System.in);
        Integer option;
        do{
        System.out.println("¿Qué quiere hacer? \n 1)Agregar un empleado. \n 2)Agregar un cliente. \n 3)Hacer una cotización. \n 4)Salir");
        option = sc.nextInt();
        switch(option)
        {
            case 1: 
                System.out.println("Va a ingresar un empleado.");
                break;
            case 2: 
                System.out.println("Va a ingresar un cliente.");
                break;
            case 3: 
                System.out.println("Va a realizar una cotización.");
                break;
                
        }
        } while(option != 4);
    }
    
}
