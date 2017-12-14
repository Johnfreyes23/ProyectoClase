/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;
/**
 * Esta clase define objetos que generan productos Acrilicos
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */
public class Acrilico extends Producto{
    //Campo independiente de la clase Acrilico que es hija de la clase Producto
    private double calibre;
    private String color;
/**
* Constructor para la clase Polietileno
* @param calibre Define el calibre del producto Acrilico;
* @param color Define el color del producto Acrilico;
* @param ancho Define la anchura del producto polietileno;
* @param alto Define la altura del producto polietileno;
*/
    public Acrilico(double calibre, String color, double alto, double ancho) {
        super(alto, ancho, "Acrilico");
        this.calibre = calibre;
        this.color = color;
    }
/**
* Metodo que calcula el recargo que genera el area a producir, entre más pequeña el area mayor es el recargo.
*/
    public double RecargoValor(double area) {
        double porcentaje = -4.186*Math.pow(10, -5)*area+2.4;
        return porcentaje;
    }
/**
* Metodo que calcula el precio del producto teniendo en cuenta el area y el color.
*/
    public double CalcularPrecio() {
        
        double area = getArea();
        double costo = 0;  
        double valor;
        if(color.equals("Cristal") ){
            costo = (3.67*calibre + 0.3)*area ;
        }
        if(color.equals("Opal") ){
            costo = (4.032*calibre + 0.3)*area ;
        }
        if(color.equals("Otros") ){
            costo = (4.123*calibre + 0.3)*area ;
        }
        
        valor = costo*RecargoValor(area);
        setCosto(costo);
        setValor(valor);
        return valor;
    }
    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(double calibre) {
        this.calibre = calibre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
