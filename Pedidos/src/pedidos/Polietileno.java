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
public class Polietileno extends Producto {

    private double calibre;

    public Polietileno(double calibre, double alto, double ancho) {
        super(alto, ancho, "Polietileno");
        this.calibre = calibre;
    }

    public double RecargoValor(double area) {
        double porcentaje = -5.369*Math.pow(10, -5)*area+3.6;
        return porcentaje;

    }

    public double CalcularPrecio() {

        double area = getArea();
        double costo =  ((442.8 * calibre + 0.4428*(area-20000)*(calibre/20))) ;
        double valor = costo * RecargoValor(area);
        setCosto(costo);
        setValor(valor);
        return valor;
    }

    public double getCalibre()
    {
        return calibre;
    }
}
