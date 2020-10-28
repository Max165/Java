/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import PaqueteLectura.Lector;
/**
 *
 * @author Max
 */
public class P3E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        double sueldoBasico;
        int campeonatosGanados,partidosJugados,golesAnotados;
        System.out.println(" | Ingresar información de los empleados |"); 
        System.out.println("");
        System.out.println(" # Leer ENTRENADOR.");
        System.out.print(" _ Nombre : "); nombre=Lector.leerString();
        System.out.print(" _ Sueldo basico: "); sueldoBasico=Lector.leerDouble();
        System.out.print("_ Campeonatos ganados: "); campeonatosGanados=Lector.leerInt();
        System.out.println("");
        Entrenador vEntrenador = new Entrenador(nombre,sueldoBasico,campeonatosGanados);
        //
        System.out.println(" # Leer JUGADOR.");
        System.out.print(" _ Nombre : "); nombre=Lector.leerString();
        System.out.print(" _ Sueldo basico: "); sueldoBasico=Lector.leerDouble();
        System.out.print("_ Partidos jugados: "); partidosJugados=Lector.leerInt();
        System.out.print("_ Goles anotados: "); golesAnotados=Lector.leerInt();
        System.out.println("");
        Jugador vJugador = new Jugador(nombre,sueldoBasico,partidosJugados,golesAnotados);
        //
        System.out.println(" | Informe |"); System.out.println("");
        System.out.println(" # Entrenador:"); 
        System.out.println(vEntrenador.toString());
        System.out.println("");
        System.out.println(" #Jugador: ");
        System.out.println(vJugador.toString());
    }
    
}
