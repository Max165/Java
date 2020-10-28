/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import tema3.*;

/**
 *
 * @author Max
 */
public class Triangulo extends Figura{
    private double lado1,lado2,lado3;


    public Triangulo(double lado1, double lado2, double lado3, String colorRelleno, String colorLinea) {
        super(colorRelleno,colorLinea);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public Triangulo (){                        ////// ¿¿¿¿¿????
        super();
    }
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    @Override
    public String getColorRelleno() {
        return super.getColorRelleno();
    }
    @Override
    public void setColorRelleno(String colorRelleno) {
        super.setColorRelleno(colorRelleno);
    }
    @Override
    public String getColorLinea() {
        return super.getColorLinea();
    }
    @Override
    public void setColorLinea(String colorLinea) {
        super.setColorLinea(colorLinea);
    }
    
    @Override
    //Metodos abstractos
    
    public double calcularArea () {
        double resultado;
        double s = (this.lado1+this.lado2+this.lado3)/2;
        return Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3));
    }
    
    @Override
    public double calcularPerimetro () {
        return lado1+lado2+lado3;
    }
    
    @Override
    public String toString() {
        String aux = super.toString() + 
                     "Lado 1: "+this.getLado1()+ 
                     "Lado 2: "+this.getLado2()+
                     "Lado 3: "+this.getLado3();
        return aux;
    }
}
