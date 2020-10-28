
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos

import PaqueteLectura.Lector; import PaqueteLectura.GeneradorAleatorio;



public class Ej03Jugadores {

  
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        
        //Paso 3: Crear el vector para 15 double 
        double [] jugadores = new double [15];
        //Paso 4: Declarar indice 
        int i;        
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        System.out.println(" | Generar altura de los 15 jugadores (aleatoriamente) | "); System.out.println(" ");
        for (i=1;i<15;i++) {
            jugadores[i]=GeneradorAleatorio.generarDouble(3);
        }
        //Paso 7: Calcular el promedio de alturas, informarlo
        int total=0; double suma=0, promedio;
        for (i=1;i<15;i++) {
            total=total+1; suma=suma + jugadores[i];
        }
        promedio=suma/total;
        System.out.println("# El promedio de alturas de los 15 jugadores es "+promedio);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        int cant=0;
        for (i=1;i<15;i++) {
            if (jugadores[i]>(promedio)) {
                cant=cant+1;
            }
        }
        System.out.println("# Cantidad de jugadores que superan la altura promedio "+cant);
        //Paso 9: Informar la cantidad.
    }
    
}
