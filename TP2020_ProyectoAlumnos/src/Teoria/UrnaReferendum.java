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

public class UrnaReferendum extends Urna {
    private int votosAFavor; 
    private int votosEnContra;
 
    public UrnaReferendum() {
        
    }
    
    public UrnaReferendum (int numeroUrna){
        super(numeroUrna);
        //this.inicializarVotos();  <------ ¿porque no se puede hacer esto?
        this.votosAFavor=0; this.votosEnContra=0;    
    }

    public int getVotosAFavor(){
        return this.votosAFavor;
    }
    
    public int getVotosEnContra() {
        return this.votosEnContra;
    }
    
    public void inicializarVotos(){
        this.votosAFavor=0;
        this.votosEnContra=0;
    }
    
    // metodos pedidos 
    public void votarAFavor(){
        this.votosAFavor++;
    }
    
    public void votarEnContra()   {
        this.votosEnContra++;
    }
    
    public int calcularGanador(){
        if (votosAFavor==votosEnContra){return -1;}
        else { 
            if (votosEnContra<votosAFavor) { return 0; } 
            else { return 1; } 
        }
    }

    @Override
    public int calcularTotalVotos() {
        return this.getVotosEnBlanco() + this.getVotosAFavor() + this.getVotosEnContra();
    }
    
}
