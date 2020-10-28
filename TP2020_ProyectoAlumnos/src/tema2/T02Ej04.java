/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

/**
 *
 * @author Max
 */
public class T02Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona [][] turnos = new Persona [5][8]; //matriz turnos por cada dia 
        int [] dl = new int [5]; //vector de dimensiones logicas por cada #dia
        // inicializar 
        int f;
            for (f=0;f<5;f++) {
                dl[f]=0;
            }
        //leer o generar datos aleatoriamente
            f=0; 
            int c;
            System.out.println(" Nombre (ingresar por teclado) :"); String nombre=Lector.leerString();
            while ( (f<5)&& (!"ZZZ".equals(nombre)) ) {
                c=0;
                while ( (c<8)&& (!"ZZZ".equals(nombre)) ) {
                    int dni=GeneradorAleatorio.generarInt(30000); System.out.println(" DNI (generado al azar): "+dni);
                    int edad=GeneradorAleatorio.generarInt(100); System.out.println(" Edad (generada al azar) :"+edad);
                    turnos[f][c]= new Persona (nombre,dni,edad);
                    dl[f]++;
                    System.out.println("");
                    System.out.println(" Nombre (ingresar por teclado) :"); nombre=Lector.leerString();
                    c++;
                }
                f++;
            }
        // informar
            System.out.println(" | Información de los turnos |");
            for (f=0;f<5;f++) {
                System.out.println(" Día #"+(f+1));
                for (c=0;c<dl[f];c++) {
                    System.out.println(" Turno #"+(c+1));
                    System.out.println(turnos[f][c].toString());
                }
                if (dl[f]==0) { 
                    System.out.println(" Sin turnos "); }
            }
        
    }
    
}
