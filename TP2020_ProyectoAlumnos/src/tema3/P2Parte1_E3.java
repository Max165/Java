/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author Max
 */
public class P2Parte1_E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Entrenador vEntrenador;
        String nombre; 
        double sueldoBasico;
        int cantidadCampeonatos; 
        System.out.println(" | Ingresar información de los entrenadores | "); System.out.println(""); System.out.println("");
        System.out.println(" #Entrenador "); 
        System.out.print("    - Nombre: "); nombre= Lector.leerString();
        System.out.print("    - Sueldo basico: "); sueldoBasico= Lector.leerDouble();
        System.out.print("    - Cantidad de campeonatos ganados: "); cantidadCampeonatos= Lector.leerInt();
        System.out.println("");
        vEntrenador = new Entrenador(nombre,sueldoBasico,cantidadCampeonatos);
        System.out.println(" --------------------------------------------------"); System.out.println("");
        System.out.println("");
        System.out.println(" | Informe de sueldos | ");
        System.out.println(" Sueldo final: "+vEntrenador.sueldoACobrar());
        System.out.println(" -------------------------------------------------- ");
    }
    
}
