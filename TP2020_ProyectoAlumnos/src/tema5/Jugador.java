/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Max
 */
public class Jugador extends Empleado {
    private int partidosJugados, golesAnotados;

    public Jugador () {
        super();
    }
    
    public Jugador (String nombre, double sueldoBasico, int partidosJugados, int golesAnotados){
        super(nombre,sueldoBasico);
        this.setPartidosJugados(partidosJugados);
        this.setGolesAnotados(golesAnotados);
    }
    
    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }
    
    //metodos abstractos
    public double calcularSueldoACobrar() {
        double aux=super.getSueldoBasico();
        double promedio=( this.getGolesAnotados() )/( this.getPartidosJugados() );
        if (promedio>0.5) {aux=aux*2; }
        return aux;
    }
    public String toString () {
        String aux= super.toString();
        return aux;
    }
}
