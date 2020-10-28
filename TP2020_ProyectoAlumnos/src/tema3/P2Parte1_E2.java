/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Max
 */
public class P2Parte1_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Balanza vBalanza;
        vBalanza= new Balanza();
        vBalanza.iniciarCompra();
        System.out.println(" | Nueva compra |"); System.out.println("");
        double peso,precio;
        System.out.println(" - peso (generado al azar):"); peso= Lector.leerDouble();
        while (peso!=0) {
            System.out.println(" - precio (generado al azar):"); precio= Lector.leerDouble();
            vBalanza.registrarProducto(peso,precio);
            System.out.println(" - peso (generado al azar):"); peso= peso= Lector.leerDouble();
        }
        System.out.println(" ");
        System.out.println("--------------------------------------------------"); System.out.println("");
        System.out.println(" | Informar resultado |"); System.out.println("");
        System.out.println(" - "+vBalanza.devolverResumenDeCompra());
    }
    
}
