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
public class Producto {

    private double alto;
    private double ancho;
    private double area;
    private double valor;
    private double costo;    
    private String tipo;
    static final double IVA = 0.19;

    public Producto(double alto, double ancho, String tipo ) {
        this.alto = alto;
        this.ancho = ancho;
        this.tipo = tipo;
        this.area = this.alto * this.ancho ;
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
    
    public void Imprimir(Producto product)
    {
        switch(product.getTipo())
                {
                    case "Polietileno":
                        Polietileno po = (Polietileno) product;
                        System.out.println("Producto: " + product.getTipo() + "\n Dimensiones: \n\t Alto: " + product.getAlto() + 
                                "\n\t Ancho: " + product.getAncho() + "\n\t Calibre: " + po.getCalibre());
                    break;
                }
    }
    
}
