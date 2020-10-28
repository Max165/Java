/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;


public class Producto {
    
    private double pesoKg;
    private double precioKg;  
    private String descripcion; 
    
    public Producto(){

    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getPrecioKg() {
        return precioKg;
    }

    public void setPrecioKg(double precioKg) {
        this.precioKg = precioKg;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto(double pesoKg,String unaDescripcion, double precioKg){
        this.pesoKg = pesoKg;
        this.descripcion = unaDescripcion;
        this.precioKg=precioKg;
    }
    

    
}
