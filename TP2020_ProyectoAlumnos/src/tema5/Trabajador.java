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
public class Trabajador extends Persona{
    private String tarea;
    
    public Trabajador(String nombre, int dni, int edad,String tarea) {
        super(nombre,dni,edad);
        this.setTarea(tarea);
    }
    
    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    
    public String toString () {
        String aux = super.toString() + " Soy "+this.getTarea()+".";
        return aux;
    }
}
