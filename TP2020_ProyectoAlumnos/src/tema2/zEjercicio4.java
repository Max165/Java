/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.Lector;

/**
 *
 * @author Max
 */
public class zEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Persona [][] matriz;
        int [] dl = new int [5];
        int i;
        //inicializar vector de dimensiones logicas
            for (i=0;i<5;i++) {
                dl[i]=0;
            }
        
        Persona [][] matriz = new Persona [5][8];
       
        // cargar matriz 
            String nombre = Lector.leerString();
            int dias=0,turnos;
            while (nombre.equals("ZZZ") && (dias<5)) {
                turnos=0;
                while ( (turnos<8) && (nombre.equals("ZZZ")) ) {
                    int edad = Lector.leerInt();
                    int dni = Lector.leerInt();    
                    matriz[dias][turnos]= new Persona (nombre,dni,edad);
                    turnos++;
                    dl[dias]++;
                    //leer otro nombre
                    nombre = Lector.leerString();
                }
                dias++;
            }
        // informar 
            for (dias=0;dias<5;dias++) {
                System.out.println(" DIA # "+dias); System.out.println(" ");
                for (turnos=0;turnos<dl[dias];turnos++) {
                    System.out.println(" TURNO N° "+turnos);
                    System.out.println(" - Persona:");
                    System.out.println(matriz[dias][turnos].toString());
                }
            }
              
    }
    
}
