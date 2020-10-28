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
public class P2Parte2_E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre,biografia,titulo,editorial, ISBN;
        int añoEdicion;
        double precio;
        System.out.println(" | Ingreso de información de libro |"); System.out.println("");
        System.out.println(" -> Información del autor.");
        System.out.print("    - Nombre:"); nombre=Lector.leerString();
        System.out.print("    - Biografia:"); biografia=Lector.leerString();
        System.out.println("   -> Información del libro.");
        System.out.print("  - Titulo: "); titulo=Lector.leerString();
        System.out.print("  - Editorial: "); editorial=Lector.leerString();
        System.out.print("  - Año de edición: "); añoEdicion=Lector.leerInt();
        System.out.print("  - ISBN: "); ISBN=Lector.leerString();
        System.out.print("  - Precio: "); precio=Lector.leerDouble();
        System.out.println("");
        System.out.println("..............................................................");
        System.out.println("");
        Libro vLibro = new Libro(titulo,editorial,añoEdicion,ISBN,precio);
        vLibro.setPrimerAutor(nombre,biografia);
        System.out.println(".......................MOSTRAR .......................................");
        System.out.println("");
        System.out.println(vLibro.toString());
    }
    
}
