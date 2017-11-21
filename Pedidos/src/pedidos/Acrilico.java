/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

/**
 *
 * @author john
 */
public class Acrilico extends Producto{
    private double calibre;
    private String color;

    public Acrilico(double calibre, String color, double alto, double ancho) {
        super(alto, ancho, "Acrilico");
        this.calibre = calibre;
        this.color = color;
    }
    
    public double RecargoValor(double area) {
        double porcentaje = -4.186*Math.pow(10, -5)*area+2.4;
        return porcentaje;

    }

    public double CalcularPrecio() {
        
        double area = getArea();
        double costo = 0;  
        double valor;
        if(color.equals("cristal") ){
            costo = (3.67*calibre + 0.3)*area ;
        }
        if(color.equals("opal") ){
            costo = (4.032*calibre + 0.3)*area ;
        }
        if(color.equals("otros") ){
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
