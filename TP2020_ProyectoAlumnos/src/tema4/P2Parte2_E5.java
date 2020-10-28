/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;
import PaqueteLectura.Lector;
/**
 *
 * @author Max
 */
public class P2Parte2_E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flota unaFlota = new Flota();
        Micro unMicro; 
        System.out.println(" | Ingreso de informacion "); System.out.println("");
        String patente, destino, horaSalida; int asientos,AsientosOcupados;
        // leer de teclado
        System.out.println(" - Patente: "); patente=Lector.leerString();
       
        while (! (patente.equals("ZZZ000")) && (! (unaFlota.flotaCompleta()) ) ) {
            System.out.println(" - Destino: "); destino=Lector.leerString();
            System.out.println(" - Hora de salida: "); horaSalida=Lector.leerString();
            unMicro = new Micro (patente,destino,horaSalida);
            unaFlota.agregarAFlota(unMicro);
            System.out.println(" ///////////////// ");
            System.out.println(" - Patente: "); patente=Lector.leerString();           
        }
        System.out.println("................................................. ");
        // leer una patente y eliminar 
        System.out.println(" * Ingresar una patente a eliminar: "); patente=Lector.leerString();
        if (unaFlota.eliminarMicro(patente) ) { System.out.println(" ___ Eliminado");}
        else { System.out.println(" ____ No encontrado"); }
        // comprobar que se elimino el micro 
        if (unaFlota.buscarMicro(patente)==null) { System.out.println(" no esta"); }
        else { System.out.println(" El micro está"); }
        // leer un destino 
        System.out.println(" * Ingresar destino para ver el micro que va a ese destino");destino=Lector.leerString();
        System.out.println(" Micro: "+unaFlota.buscarDestino(destino)); 
        
    }
    
}
