/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author Max
 */
public class T02Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona [] p = new Persona [15];
            //generar personas al azar
        int i;
        for (i=0;i<15;i++) {
            System.out.println(" - Persona n° "+(i+1)); 
            String nombre=GeneradorAleatorio.generarString(10); System.out.println(" Nombre (generado al azar): "+nombre); 
            int dni=GeneradorAleatorio.generarInt(30000); System.out.println(" DNI (generado al azar): "+dni);
            int edad=GeneradorAleatorio.generarInt(100); System.out.println(" Edad (generada al azar) :"+edad);
            p[i]=new Persona(nombre,dni,edad);
            System.out.println("");
        }
        System.out.println("-------------------------"); System.out.println(" ");
            //procesar
        int min=99999,cant=0; Persona personaMenor=null;
        for (i=0;i<15;i++) { 
            if (p[i].getEdad()>65) { cant++; } 
            if (p[i].getDNI()<min) { 
                personaMenor=p[i];
                min=p[i].getDNI(); } 
        }     
            //informar
        System.out.println("Cantidad de personas mayores a 65: "+cant);
        System.out.println(personaMenor.toString());
        System.out.println("-------------------------");
    }
    
}
