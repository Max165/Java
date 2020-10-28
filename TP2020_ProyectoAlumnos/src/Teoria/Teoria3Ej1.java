/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teoria;
import PaqueteLectura.Lector;
/**
 *
 * @author Max
 */
public class Teoria3Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UrnaReferendum vUR ;
        UrnaElectoral vUE;
        vUE = new UrnaElectoral(203,5);
        vUR = new UrnaReferendum (203); 
        
        // votacion
        
        System.out.println(" | Iniciar votación |");
        System.out.println(""); 
        System.out.println("................................................"); System.out.println("");
        int dni,votoElectoral,votoReferendum; 
        System.out.print(" -> Ingresar D.N.I: ");dni=Lector.leerInt(); System.out.println("");
        while (dni!=0) {
            System.out.print(" -> Voto ELECTORAL | Ingrese un número de lista (validos de 0 a 4):"); 
            votoElectoral = Lector.leerInt();
            while (! ((votoElectoral>-1)&&(votoElectoral<5)) ) {
                System.out.println(" ******* Debe ingresar un número de lista valido. (de 0 a 4 )");
                votoElectoral = Lector.leerInt();
            }
            System.out.println("");
            if (vUE.ValidarNumeroDeLista(votoElectoral)) {
                vUE.votarPorLista(votoElectoral);
            } else { vUE.votarEnBlanco();}
            System.out.println(" -> Voto REFERENDUM -> Ingrese voto -> | 0=Blanco | <0 = voto negativo | >0 = voto positivo | ");
            votoReferendum=Lector.leerInt();
            System.out.println("");  
            if (votoReferendum==0) { vUR.votarEnBlanco(); }
            else {
                if (votoReferendum<0) { vUR.votarEnContra();}
                else { vUR.votarAFavor(); }
            }
            // otro voto
            System.out.print(" -> Ingresar D.N.I: ");dni=Lector.leerInt(); System.out.println("");
        }
        System.out.println(" ................................................"); System.out.println("");
        // INFORMAR GANADORES
        
        // ELECTORAL
        int ganadorElectoral= vUE.calcularGanador();
        double porcentaje = (vUE.devolverVotosPorLista(ganadorElectoral)*100) / vUE.calcularTotalVotos();
        System.out.println(" | VOTACION ELECTORAL -> Lista ganadora: "+ganadorElectoral+ ". Con el "+porcentaje+" % de los votos.");
            
        // REFERENDUM
        int ganadorReferendum=vUR.calcularGanador();
        porcentaje = (vUR.getVotosAFavor()*100 / vUR.calcularTotalVotos());
        System.out.println(" | Votacion REFERENDUM | Lista n° 203...");
        System.out.print("  _ Resultado: ");
        
        switch (ganadorReferendum) {
            case -1 : 
                System.out.println(" Negativo ");
            case 0 : 
                System.out.println(" Empate ");
            case 1 : 
                System.out.println(" Positivo ");
        }
    }
    
    
}
