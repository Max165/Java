/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Ej04Matrices {

    public static void main(String[] args) {
     
    //1. definir la matriz de enteros de tamaño 10x10 e iniciarla con números aleatorios entre 0 y 200 
    int [][] matrix = new int [10][10];
    System.out.println("    | Generar matriz (aleatoriamente) |");
    int f,c;
    for (f=0;f<10;f++) {
        for (c=0;c<10;c++) {
            matrix[f][c]=GeneradorAleatorio.generarInt(201);
        }
    }
    System.out.println("");
    System.out.println(" ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- "); System.out.println("");
    //2. mostrar el contenido de la matriz en consola
        System.out.println(" | Mostrar matriz |"); System.out.println(" ");
    for (f=0;f<10;f++) {
        for (c=0;c<10;c++) {
            System.out.println(" Pos ("+(f+1)+","+(c+1)+") : "+matrix[f][c]);
        }
    }
    System.out.println("");
    System.out.println(" ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- "); System.out.println("");

    //3. calcular e informar la suma de todos los elementos almacenados entre las filas 2 y 9 y las columnas 0 y 3
        
    System.out.println(" | mostrar datos entre filas 2-9, columnas 0-3 |"); System.out.println(" ");
    for (f=1;f<9;f++) {
        for (c=0;c<3;c++) {
            System.out.println(" Pos ("+(f+1)+","+(c+1)+") : "+matrix[f][c]);
        }
    }  
    //4. generar un vector de 10 posiciones donde cada posición i contiene la suma de la columna i de la matriz 
    int [] v = new int [10];
    int i,acumulado;
    for (f=0;f<10;f++) {
        acumulado=0;
        for (c=0;c<10;c++) {
            acumulado=acumulado+matrix[f][c];
        }
        v[f]=acumulado;
    }
    System.out.println("");
    System.out.println(" ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- "); System.out.println("");
    //5. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
    //   y en caso contrario imprima "No se encontró el elemento".
        //ingresar valor y controlar que este dentro del rango
    System.out.println(" | Buscar valor en matriz | "); System.out.println("");
    System.out.println(" Ingresar un número (entre 0 y 200) --> : "); int valor=Lector.leerInt();
    while ( (valor<0)|(valor>200) ) { 
        System.out.println(" ¡ número fuera de rango ! ");
        System.out.println("Ingresar un número (entre 0 y 200)"); valor=Lector.leerInt(); 
    }
        // buscar valor 
    System.out.println("");
    boolean encontrado=false;
    f=0; 
    while ( (!encontrado)&&(f<10) ) {
        c=0;
        while ((!encontrado)&&(c<10)) {
            if (matrix[f][c]==valor) { encontrado=true; } 
            c++;
        }
        f++;
    }
    if (encontrado) { System.out.println(" Resultado de la busqueda: valor encontrado"); }
    else { System.out.println(" Resultado de la busqueda: NO encontrado"); }
    System.out.println("");
    System.out.println(" ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- "); System.out.println("");
    
    }
}
