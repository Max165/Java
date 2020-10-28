/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.GeneradorAleatorio;

public class Ej06Banco {
    
    public static void main(String[] args) {
        final int corte=5;
        int i;
        int [] contador = new int [5];
        String [] operaciones = new String [5];
            //asignar nombres de operaciones
        operaciones[0]="Cobro de cheque";
        operaciones[1]="Deposito/Extracción de cuenta";
        operaciones[2]="Pago de impuestos/servicios";
        operaciones[3]="Cobro de jubilación";
        operaciones[4]="Cobro de planes";
            //inicializar vector de objetos operacion
            
            // simular operaciones de banco
        System.out.println(" | Operaciones de banco | ");
        int nOperacion=GeneradorAleatorio.generarInt(6);
        while (nOperacion!=5) {
            contador[nOperacion]++;
        }
        
        System.out.println(" | Mostrar cantidad de operaciones por cada tipo |");
        int cant,max=-1;
        for (i=0;i<5;i++) {
            cant=contador[i];
            if (cant>max) {
                max=cant;
            }
            System.out.println("- Tipo de operacion: '"+operaciones[i]+"' - Cantidad de operaciones: "+cant);
        }
        
        
    }
}
