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

    private  float calibre;

    public Polietileno(float calibre, float alto, float ancho) {
        super(alto, ancho);
        this.calibre = calibre;
    }

    public double RecargoValor(float area) {
        double porcentaje = 0.1;
        if (area > 10000) {
            porcentaje =  0.6;
            
        }
        if (area <= 10000 && area >= 5000) {
            porcentaje =  1.2;
             
        }
        if (area < 5000) {
            porcentaje =  2;
            
        }
        return porcentaje;

    }

    float CalcularPrecio() {

        float area = getArea();
        float valor = (float) ((442.8 * calibre + 0.4428*area- 8856)* RecargoValor(area)) ;
        setValor(valor);
        return valor;
    }

}
