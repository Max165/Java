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
public class P2Parte1_E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo vCirculo;
        double radio; String colorRelleno,colorLinea;
        System.out.println(" | Ingresar información de circulo |"); System.out.println("");
        System.out.println("");
        System.out.println(" - Radio: "); radio= Lector.leerDouble();
        System.out.println(" - Color de relleno:"); colorRelleno=Lector.leerString();
        System.out.println(" - Color de linea:"); colorLinea= Lector.leerString();
        System.out.println("");
        System.out.println("--------------------------------------------------");
        vCirculo=new Circulo(radio,colorRelleno,colorLinea);
        System.out.println(" | Informes |"); System.out.println("");
        System.out.println(" - Area del circulo: "+vCirculo.calcularArea(radio)+".");
        System.out.println(" - Perimetro del circulo: "+vCirculo.calcularPerimetro(radio));
        System.out.println("--------------------------------------------------");        
    }
    
}
