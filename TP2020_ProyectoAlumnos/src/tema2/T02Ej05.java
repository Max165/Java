/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

/**
 *
 * @author Max
 */
import PaqueteLectura.Lector;
public class T02Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] vector = new char [10];
        // leer palabras
            System.out.println(" | Ingresar palabras |"); System.out.println("");
            int i;
            for (i=0;i<10;i++) {
                System.out.print(" Palabra #"+(i+1)+": ");String palabra=Lector.leerString();
                vector[i]=palabra.charAt(0);
            }
            System.out.println("------------------------------"); System.out.println("");
        // mostrar palabra formada 
            System.out.println(" | Expresion formada |"); System.out.println(""); 
            for (i=0;i<10;i++) {
                System.out.print(vector[i]);
            }
            System.out.println(""); System.out.println("------------------------------");
        
    }
    
}
