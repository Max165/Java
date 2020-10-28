/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

/**
 *
 * @author Max
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" ///// Factorial de los numeros del 1 al 9 /////"); 
        int aux, factorial,i;
        
        for (i=1;i<10;i++) {
            aux=i; factorial=1;
            while (aux!=0) {
                factorial=factorial*aux;
                aux=aux-1;
            }
            System.out.println(" - Factorial de "+i+" es: "+factorial);
        }
        
        
    }
    
}
