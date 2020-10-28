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
import PaqueteLectura.Lector; import PaqueteLectura.GeneradorAleatorio;

public class T02Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona [] p = new Persona[4];
        System.out.println(" | Ingreso de información de las personas | (3 en total) "); System.out.println("");
        int i;
        
        for (i=0;i<3;i++) {
            System.out.println(" - Persona "+(i+1)); 
            System.out.println(" Nombre: "); String nombre=GeneradorAleatorio.generarString(10);
            System.out.println(" DNI: "); int dni=GeneradorAleatorio.generarInt(30000);
            System.out.println(" Edad: "); int edad=GeneradorAleatorio.generarInt(100);
            p[i]=new Persona(nombre,dni,edad);
            System.out.println("");
        }
        
        // mostrar personas
        for (i=1;i<3;i++) {
            System.out.println(" - Persona "+i); 
            System.out.println(p[i].toString());
            System.out.println("");
        }
        
        
    }
    
}
