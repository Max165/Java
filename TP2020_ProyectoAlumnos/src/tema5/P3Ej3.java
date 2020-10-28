/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Max
 */
public class P3Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona vPersona = new Persona("Max",3205983, 123);
        Trabajador vTrabajador = new Trabajador ("Juan", 565644, 54, "Corta cesped");
        System.out.println(vPersona.toString());
        System.out.println(vTrabajador.toString());
    }
    
}
