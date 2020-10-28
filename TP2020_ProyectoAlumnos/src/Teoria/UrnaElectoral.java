/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teoria;

/**
 *
 * @author Max
 */
public class UrnaElectoral extends Urna {
    private int cantidadListas;
    int [] votos;
    
    public UrnaElectoral(){
        
    }
    public UrnaElectoral (int numeroUrna, int cantidadListas ) {
        super(numeroUrna);
        this.cantidadListas=cantidadListas;
        votos = new int [cantidadListas];
        //inicializar vector de votos?
    }

    public int getCantidadListas() {
        return cantidadListas;
    }

    public void setCantidadListas(int cantidadListas) {
        this.cantidadListas = cantidadListas;
    }
    
    public int getVotos(int lista) {
        return votos[lista];
    }
    
    public void setVotos(int lista) {
        this.votos[lista]++;
    }
    
    //metodos pedidos 
    public boolean ValidarNumeroDeLista(int numeroDeLista){
        return numeroDeLista<this.getCantidadListas();
    }
    
    public void votarPorLista (int numeroDeLista){
        votos[numeroDeLista]++;
        
    }
    public int devolverVotosPorLista(int numeroDeLista) {
        return votos[numeroDeLista];
    }
    
    // metodos abstractos declarados en la superclase 
    public int calcularGanador(){
        int i ,max, posMax=0;
        max=-1; 
        for ( i=0; i<this.getCantidadListas() ;i++ ) {
            if (votos[i]>max) {
                max=votos[i]; posMax=i;
            }
        }
        return posMax;
    }
    
    public int calcularTotalVotos () {
        int suma = this.getVotosEnBlanco();
        int i;
        for (i=0;i< this.getCantidadListas() ; i++) {
            suma=suma+votos[i];
        }
        return suma;
    }
    
}
  
