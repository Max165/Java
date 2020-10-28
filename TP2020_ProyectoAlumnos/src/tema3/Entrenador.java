/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Max
 */
public class Entrenador {
    private String nombre; 
    private Double sueldoBasico;  
    private int campeonatosGanados; 

    public Entrenador(){
        
    }
    public Entrenador(String nombre, double sueldoBasico, int campeonatosGanados) {
        this.nombre=nombre;
        this.sueldoBasico=sueldoBasico;
        this.campeonatosGanados=campeonatosGanados;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getCampeonatosGanados() {
        return campeonatosGanados;
    }

    public void setCampeonatosGanados(int campeonatosGanados) {
        this.campeonatosGanados = campeonatosGanados;
    }
    
    public double sueldoACobrar () {
        double aux;
        if (this.campeonatosGanados==0) { aux=this.sueldoBasico; }
        else { 
            if (this.campeonatosGanados<=4) { aux=this.sueldoBasico+ 5000; }
            else { 
                if (this.campeonatosGanados <= 10) { aux=this.sueldoBasico +30000; }
                else { aux=this.sueldoBasico+50000; }
            }
        }
        return aux;
    }
    
}
