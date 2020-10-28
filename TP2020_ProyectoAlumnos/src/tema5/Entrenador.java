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
public class Entrenador extends Empleado {
    private int campeonatosGanados;

    public Entrenador() {
        super();
    }
    
    public Entrenador (String nombre, double sueldoBasico, int campeonatosGanados){
        super(nombre,sueldoBasico);
        this.setCampeonatosGanados(campeonatosGanados);
    }
    
    public int getCampeonatosGanados() {
        return campeonatosGanados;
    }

    public void setCampeonatosGanados(int campeonatosGanados) {
        this.campeonatosGanados = campeonatosGanados;
    }
    //metodos abstractos
    public double calcularSueldoACobrar(){
        double aux=super.getSueldoBasico();
        int ganados=this.campeonatosGanados;
        if ((ganados>1)&&(ganados<4)) {aux=aux+5000; } 
        else { 
            if (ganados<10) { aux=aux+30000;} 
            else { if (ganados>=10){ aux=aux+50000; } }
        }
        return aux;
    }
    public String toString() {
        String aux = super.toString();
        return aux;
    }

}
