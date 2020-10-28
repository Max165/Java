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
public abstract class Urna {
    private int numeroUrna;
    private int votosEnBlanco;
    
    public Urna () {

    }   
    public Urna (int numero){
        this.numeroUrna=numero;
        this.votosEnBlanco=0;
    }
    public int getNumero() {
        return numeroUrna;
    }

    public int getVotosEnBlanco() {
        return votosEnBlanco;
    }
    
    public void setNumeroUrna(int numeroUrna) {
        this.numeroUrna = numeroUrna;
    }
    
    public void votarEnBlanco() {
        this.votosEnBlanco++;
    }
    //metodos abstractos (se definen en la subclase).
    public abstract int calcularGanador();
    public abstract int calcularTotalVotos();
}
