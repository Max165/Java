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
public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;

    public Empleado(){
        
    }
    public Empleado (String nombre, double sueldoBasico) {
        this.setNombre(nombre);
        this.setSueldoBasico(sueldoBasico);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    //metodos abstractos 
    public abstract double calcularSueldoACobrar();
    
    public String toString (){
        String aux= "Nombre: "+this.getNombre()+". Sueldo:" +this.calcularSueldoACobrar();
        return aux;
    }
    
}
