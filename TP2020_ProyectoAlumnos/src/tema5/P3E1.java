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
public class P3E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double lado1, lado2,lado3; String colorLinea,colorRelleno;
        System.out.println(" | Ingresar información |"); System.out.println("");
        System.out.println(" # Leer TRIANGULO.");
        System.out.print(" _ Lado 1: "); lado1=Lector.leerDouble();
        System.out.print(" _ Lado 2: "); lado2=Lector.leerDouble();
        System.out.print(" _ Lado 3: "); lado3=Lector.leerDouble();
        System.out.print(" _ Color linea: "); colorLinea=Lector.leerString();
        System.out.print(" _ Color relleno: "); colorRelleno=Lector.leerString();
        Triangulo vTriangulo = new Triangulo(lado1,lado2,lado3,colorRelleno,colorLinea);
        //
        System.out.println("");
        System.out.println(" # Leer CUADRADO.");
        System.out.print(" _ Lado : "); lado1=Lector.leerDouble();
        System.out.print(" _ Color linea: "); colorLinea=Lector.leerString();
        System.out.print(" _ Color relleno: "); colorRelleno=Lector.leerString();        
        System.out.println("");
        Cuadrado vCuadrado = new Cuadrado(lado1,colorRelleno,colorLinea);
        //
        System.out.println(" | Informe |"); System.out.println("");
        System.out.println(" # Triangulo:"); 
        System.out.println(vTriangulo.toString());
        System.out.println("");
        System.out.println(" #Cuadrado: ");
        System.out.println(vCuadrado.toString());
    }
    
}
