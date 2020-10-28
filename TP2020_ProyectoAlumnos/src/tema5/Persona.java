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
public class Persona {
    private String nombre; 
    private int dni, edad;
    
    public Persona () {
        
    }
    
    public Persona(String nombre, int dni, int edad) {
        this.setNombre(nombre);
        this.setDni(dni);
        this.setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString () {
        String aux= "Mi nombre es "+this.getNombre()+", mi DNI es "+this.getDni()+ "y tengo "+this.getEdad()+".";
        return aux;
    }
}
