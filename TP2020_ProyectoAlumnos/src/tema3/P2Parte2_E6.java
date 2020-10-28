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
public class P2Parte2_E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio; String colorLinea, colorRelleno;
        
               // vector de colores 
        String [] colores = new String[5];
        colores[0]="Amarillo"; 
        colores[1]="Azul"; 
        colores[2]="Rojo"; 
        colores[3]="Verde";
        colores[4]="Negro"; 

        // generar datos aleatoriamente
        int aux;
        radio=GeneradorAleatorio.generarDouble(10);
        aux = GeneradorAleatorio.generarInt(5);
        colorLinea= colores[aux];
        aux = GeneradorAleatorio.generarInt(5);
        colorRelleno = colores[aux];    
        
        Circulo vCirculo1 = new Circulo(radio,colorLinea,colorRelleno);
        Circulo vCirculo2 = new Circulo ();
        System.out.println(" Circulo 1 (constructor con parametros");
        System.out.println(" - Area: "+vCirculo1.calcularArea(radio));
        System.out.println(" - Perimetro: "+vCirculo1.calcularPerimetro(radio));
        System.out.println("");
        System.out.println(" Circulo 2 (sin parametros)");
        System.out.println(" Sin parametros para calcular el area y perimetro. ");
        
    }
    
}
