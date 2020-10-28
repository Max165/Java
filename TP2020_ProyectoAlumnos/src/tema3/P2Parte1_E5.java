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
public class P2Parte1_E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Balanza2 vBalanza; Producto vProducto;
        vBalanza= new Balanza2(); 
        vBalanza.iniciarCompra();
        System.out.println(" | Nueva compra |"); System.out.println("");
        double peso,precio; String descripcion;
        System.out.print(" - Peso (Kg):"); peso= Lector.leerDouble();
        while (peso!=0) {
            System.out.print(" - Descripcion: "); descripcion= Lector.leerString();
            System.out.print(" - Precio ($):"); precio= Lector.leerDouble();
            vProducto = new Producto(peso,descripcion,precio);
            vBalanza.registrarProducto(vProducto);
            System.out.print(" - Peso (Kg):"); peso= Lector.leerDouble();
        }
        System.out.println(" ");
        System.out.println("--------------------------------------------------"); System.out.println("");
        System.out.println(" | Informar resultado |"); System.out.println("");
        System.out.println(" - "+vBalanza.devolverResumenDeCompra());
    }
    
}
    

