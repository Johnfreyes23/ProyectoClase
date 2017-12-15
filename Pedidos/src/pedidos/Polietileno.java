 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

/**
 * Esta clase define objetos que genera los productos Polietilenos
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */
public class Polietileno extends Producto {
//Campo independiente de la clase Polietileno que es hija de la clase Producto
    private double calibre;
/**
* Constructor para la clase Polietileno
* @param calibre Define el calibre del producto polietileno;
* @param ancho Define la anchura del producto polietileno;
* @param alto Define la altura del producto polietileno;
*/
    public Polietileno(double calibre, double alto, double ancho) {
        super(alto, ancho, "Polietileno");
        this.calibre = calibre;
    }
/**
* Metodo que calcula el recargo que genera el area a producir, entre más pequeña el area mayor es el recargo.
*/
    public double RecargoValor(double area) {
        double porcentaje = -5.369*Math.pow(10, -5)*area+3.6;
        return porcentaje;

    }
/**
* Metodo que calcula el precio del producto teniendo en cuenta su area.
*/
    public int CalcularPrecio() {

        double area = getArea();
        double costo =  ((442.8 * calibre + 0.4428*(area-20000)*(calibre/20))) ;
        int valor = (int) (costo * RecargoValor(area));
        setCosto(costo);
        setValor(valor);
        return valor;
    }

    public double getCalibre()
    {
        return calibre;
    }
    
    public String detalles(){
        String detalles = "\n " + this.getTipo() + "  Alto: " + this.getAlto() + 
                                " Ancho: " + this.getAncho() + " Calibre: " + this.getCalibre();
        return detalles ;
    }
}
