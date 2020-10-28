/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;
import PaqueteLectura.Lector;
/**
 *
 * @author Max
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Ingrese un número: "); 
        
        int n=PaqueteLectura.Lector.leerInt();
        int aux=n; int factorial=1;
        while (aux!=0) {
            factorial=factorial*aux;
            aux=aux-1;
        }
        System.out.println(" El factorial de "+n+" es: "+factorial);
        
                
    }
    
}
