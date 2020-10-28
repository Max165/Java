
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos

import PaqueteLectura.GeneradorAleatorio;
public class Ej05Oficinas {

    public static void main(String[] args) {
        //Paso 1: Declarar la variable vector de double 
        int [][] oficinas = new int [8][4];
        //Paso 2: Declarar indices 
        int f,c;        
        //Paso 3: Ingresar n° de piso y n° de oficina. Cargarlos en el vector
        f=GeneradorAleatorio.generarInt(10);
        while (f<8) {
            c=GeneradorAleatorio.generarInt(4);
            oficinas[f][c]++;
            f=GeneradorAleatorio.generarInt(10);
        }
        //Paso 4: Informar cantidad de personas por oficina
        for (f=0;f<8;f++) {
            System.out.println(" #PISO N° "+(f+1)+".");
            for (c=0;c<4;c++) {
                System.out.println(" -Oficina n° "+(c+1)+": "+oficinas[f][c]+" personas.");
            }
            System.out.println(" ");
        }  
    }
    
}
