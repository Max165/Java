/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author Max
 */
public class P2Parte2_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" | Triangulo | Ingresar datos: "); 
        /*
        System.out.println(" lado A: "); double lado1=Lector.leerDouble();
        System.out.println(" lado B: "); double lado2=Lector.leerDouble();
        System.out.println(" lado C: "); double lado3=Lector.leerDouble();
        */
        System.out.println(" lado A: "); double lado1=GeneradorAleatorio.generarDouble(15);
        System.out.println(" lado B: "); double lado2=GeneradorAleatorio.generarDouble(15);
        System.out.println(" lado C: "); double lado3=GeneradorAleatorio.generarDouble(15);
        
        System.out.println(" Color relleno: "); String colorRelleno=GeneradorAleatorio.generarString(4);
        System.out.println(" Color linea: "); String colorLinea=GeneradorAleatorio.generarString(4);
        System.out.println("");
        Triangulo t1 = new Triangulo(lado1,lado2,lado3,colorRelleno,colorLinea);
        System.out.println(" ------------------------- constructor NO NULO"); 
        System.out.println(" Area :" +t1.calcularArea()+ ".");
        System.out.println(" Perimetro "+t1.perimetro(lado1, lado2, lado3));
        System.out.println(" ------------------------- ");           
        System.out.println(" | Triangulo | Ingresar datos: "); 
        /*
        System.out.println(" lado A: "); double lado1=Lector.leerDouble();
        System.out.println(" lado B: "); double lado2=Lector.leerDouble();
        System.out.println(" lado C: "); double lado3=Lector.leerDouble();
        */
        System.out.println(" lado A: "); lado1=GeneradorAleatorio.generarDouble(15);
        System.out.println(" lado B: "); lado2=GeneradorAleatorio.generarDouble(15);
        System.out.println(" lado C: "); lado3=GeneradorAleatorio.generarDouble(15);
        System.out.println(" Color relleno: "); colorRelleno=GeneradorAleatorio.generarString(4);
        System.out.println(" Color linea: "); colorLinea=GeneradorAleatorio.generarString(4);
        System.out.println("");
        t1.setLado1(lado1);
        t1.setLado2(lado2);
        t1.setLado3(lado3);
        t1.setColorLinea(colorLinea);
        t1.setColorRelleno(colorRelleno);
        System.out.println(" ------------------------- constructor NULO ");
        System.out.println(" Area :" +t1.calcularArea()+ ".");
        System.out.println(" Perimetro "+t1.perimetro(lado1, lado2, lado3));
        System.out.println(" ------------------------- ");
    }        
    
}
