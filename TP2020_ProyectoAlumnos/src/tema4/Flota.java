/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Max
 */
public class Flota {
    private final int df=15;
    private int dl = 0;
    private Micro [] vFlota= new Micro[df] ;
     
    public Flota(){
        this.inicializarVector();
    }
    
    public void inicializarVector() {
        int i;
        for (i=0; i<(this.df); i++) {
            this.vFlota[i]=null;
        }
    }
    
    public void contarMicro () {
        this.dl++;
    }
    public boolean flotaCompleta () {
        return (this.dl==df-1);
    }
    
    public void agregarAFlota (Micro vMicro ) {
        vFlota[dl]=vMicro;
        this.contarMicro();
    }
    
    public boolean eliminarMicro (String patente) {
        int i=0; boolean encontrado=false;
        int aux;
        while ( (i<dl) && (!encontrado) ) {
            
            if (vFlota[i].getPatente().equals(patente)) {
                for ( aux=i; i<dl ; i++) {
                    vFlota[aux]=vFlota[aux+1];
                }
                encontrado=true;
            }
            this.dl--;
            i++;
        }
        return encontrado;
    }
    public Micro buscarMicro (String patente) {
        int i=0; boolean encontrado=false; 
        
        Micro aux=null; 
        while ( (i<dl) && (!encontrado) ) {
            
            if (vFlota[i].getPatente().equals(patente)) {
                aux=vFlota[i];
                encontrado=true;
            }
            i++;
        }
        return aux;
    }
    public String buscarDestino (String destino) {
        int i=0; boolean encontrado=false; 
        
        String aux=null; String auxDestino;
        while ( (i<dl) && (!encontrado) ) {
            auxDestino=vFlota[i].getDestino();
            if (auxDestino.equals(destino)) {
                aux=auxDestino;
                encontrado=true;
            }
            i++;
        }
        return aux;
    }    
    
    
    
}
