/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

/**
 *
 * @author Max
 */
public class T02Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Partido [] partidos = new Partido [5];
        // cargar información de los partidos
        System.out.println(" | Cargar información de los partidos |"); System.out.println("");
        int dl=0;
        String visitante,local; int golesVisitante,golesLocal;
        System.out.print(" Nombre del equipo visitante :");  visitante=Lector.leerString();
        while ( (dl<20) && (!"ZZZ".equals(visitante)) )  {
            System.out.print(" Goles anotados por el equipo visitante :");  golesVisitante=Lector.leerInt();
            System.out.print(" Nombre del equipo local :"); local=Lector.leerString();
            System.out.print(" Goles anotados por el equipo local :");  golesLocal=Lector.leerInt();
            partidos[dl]=new Partido(local,visitante,golesLocal,golesVisitante);
            dl++;
            System.out.print(" Nombre del equipo visitante :");  visitante=Lector.leerString();
        }
        // procesar información 
        int indice,cantA=0,golesBoca=0,empates=0;
        double partidosjugados=0;
        for (indice=0;indice<dl;indice++) {
            if (partidos[indice].hayEmpate()) { empates++; }    
            else { // si no hay empate entonces consultar si river es ganador
                if ("River".equals(partidos[indice].getGanador() ) ) { cantA++; }
            } 
            if ("Boca".equals(partidos[indice].getLocal())) {
                golesBoca= golesBoca + partidos[indice].getGolesLocal(); 
            }
            partidosjugados++;
        }
        double porcentaje=-1;
        if (partidosjugados>0){  porcentaje = (empates*100)/partidosjugados; } // en Double por qué hay error cuando el total de partidos jugados es "0"?...
        
        // mostrar 
        if (partidosjugados==0) { System.out.println(" No se disputaron partidos. "); }
        else {
        System.out.println(" | Mostrar lo pedido |"); System.out.println("");
        System.out.println(" * Cantidad de victorias de River: "+cantA); System.out.println("");
        System.out.println(" * Cantidad de goles de Boca: "+golesBoca); System.out.println("");
        System.out.println(" * Porcentaje de partidos empatados: "+porcentaje+"%"); 
        }
        
        }
        
}
