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
public class P2Parte2_E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Micro vMicro = new Micro("ABC123","Mar Del Plata","5:00");
        
        int asiento;
        System.out.println(" ...............................................");
        System.out.println(" Ingresar numero de asiento: "); asiento=Lector.leerInt();
        while ( ((vMicro.validarAsiento(asiento)) ) && (! (vMicro.microLleno()) ) ) {
            if (!vMicro.consultarAsiento(asiento)) {
                vMicro.ocuparAsiento(asiento);
                System.out.println(" !¡ Asiento ocupado con exito");  }
            else { System.out.println(" !¡ Asiento ocupado. El siguiente asiento libre es el: "+vMicro.primerAsientoLibre());}
            System.out.println(" Ingresar numero de asiento: "); asiento=Lector.leerInt();
        }
        // informar asientos ocupados
        System.out.println(" --- La cantidad de asientos ocupados es: "+ vMicro.getAsientosOcupados()); 
        System.out.println(" ................................................");
    }
    
}
