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
public class Micro {
    private final int df = 20;
    private String patente, destino;
    private String horaSalida;
    private int asientosOcupados;
    private boolean [] asientos = new boolean [df];
    
    public Micro () {
        
    }
    public Micro (String patente, String destino, String horaSalida) {
        this.patente=patente;
        this.horaSalida=horaSalida;
        this.asientosOcupados=0;
        this.inicializarVectorAsientos();
        
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida( String horaSalida) {
        this.horaSalida = horaSalida;
    }
    public void inicializarVectorAsientos() {
        int i;
        for (i=0;i<this.df;i++) {
            asientos[i]=false;
        }
    }
    public int getAsientosOcupados() {
        return this.asientosOcupados;
    }
    public boolean microLleno () {
        return (this.asientosOcupados==20);
        //devuelte true si hay lugar, sino false.
    }
    public boolean validarAsiento (int numeroAsiento) {
        return ((numeroAsiento<df)&&(numeroAsiento>0));
        //devuelve true si esta en el rango de asientos, sino false.
    }
    public boolean consultarAsiento(int numeroAsiento){
        return asientos[numeroAsiento-1];
    }
    public void ocuparAsiento (int numeroAsiento) {
        this.asientos[numeroAsiento-1]=true;
        this.asientosOcupados++;
    }
    public void liberarAsiento (int numeroAsiento) {
        this.asientos[numeroAsiento-1]=false;
    }
    public int primerAsientoLibre (){
        int i;
        for ( i=0; (i<20) && (this.asientos[i]==true) ; i++) {
        
        }
        return (i+1);
    }
    
}
