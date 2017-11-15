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
public class Cajon extends Producto {
    
    private int tubos;
    private int leds;
    private double canto;
    private double manofactura;
    private double perimetro;
    private double otros;
    private Acrilico frente;
    private Acrilico cantonera;

    public Cajon(int tubos , int leds, double canto, double manofactura,double otros , double alto, double ancho) {
        super(alto, ancho);
        this.tubos = tubos;
        this.leds = leds;
        this.canto = canto;
        this.manofactura = manofactura;
        this.otros = otros;
        perimetro = 2*alto+2*ancho;
        frente = new Acrilico(3,"otros",alto,ancho);
        cantonera = new Acrilico(3,"otros",canto,perimetro);
    }
    public double valorEstructura() {
        if (getAlto() > getAncho()) {
            perimetro = (int)(2 * getAlto() + 5 * getAncho()) - 1;
        } else {
            perimetro = (int)(5 * getAlto() + 2 * getAncho()) - 1;
        }

        double aluminio = (int)(perimetro / 600) + 1;
        return aluminio * 54000;
    }
    public double CalcularPrecio() {
        double valor;
        double costoLuz = tubos*5000 + leds*4500;  
        valor = costoLuz + frente.CalcularPrecio() + cantonera.CalcularPrecio()+ valorEstructura()+otros;
        setValor(valor);
        return valor;
    }

    public double getOtros() {
        return otros;
    }

    public void setOtros(double otros) {
        this.otros = otros;
    }
    

    public Acrilico getFrente() {
        return frente;
    }

    public void setFrente(Acrilico frente) {
        this.frente = frente;
    }

    public Acrilico getCantonera() {
        return cantonera;
    }

    public void setCantonera(Acrilico cantonera) {
        this.cantonera = cantonera;
    }
    
    public int getTubos() {
        return tubos;
    }

    public void setTubos(int tubos) {
        this.tubos = tubos;
    }

    public int getLeds() {
        return leds;
    }

    public void setLeds(int leds) {
        this.leds = leds;
    }

    public double getCanto() {
        return canto;
    }

    public void setCanto(double canto) {
        this.canto = canto;
    }

    public double getManofactura() {
        return manofactura;
    }

    public void setManofactura(double manofactura) {
        this.manofactura = manofactura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

}
