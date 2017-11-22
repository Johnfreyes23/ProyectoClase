/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

/**
 * Esta clase define objetos que generan los productos
 * @author John Reyes Celis
 * @author Nicolas Gamboa Agredo
 * @version: 20/11/2017
 */
public class Producto {
    //Campos de la clase
    private double alto;
    private double ancho;
    private double area;
    private double valor;
    private double costo;    
    private String tipo;
    static final double IVA = 0.19;
/**
* Constructor para la clase producto
* @param alto Define la altura del producto;
* @param ancho Define la anchura del producto;
* @param tipo Define el tipo de producto;
*/
    public Producto(double alto, double ancho, String tipo ) {
        this.alto = alto;
        this.ancho = ancho;
        this.tipo = tipo;
        this.area = this.alto * this.ancho ;
    }
    public double CalcularPrecio() {
        return valor;
    }
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getTipo()
    {
        return tipo;
    }
    
    
}
