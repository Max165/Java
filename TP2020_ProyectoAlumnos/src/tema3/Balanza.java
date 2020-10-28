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
public class Balanza {
    private double monto;
    private int cantidad;
    
    public Balanza () {
       
    }
    
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void iniciarCompra() {
        this.monto=0;
        this.cantidad=0;
    }
    
    public void registrarProducto(double pesoKg, double precioKg) {
        this.monto=this.monto+(pesoKg*precioKg);
        this.cantidad++;
    }
    
    public double devolverMontoAPagar () {
        return this.monto;
    }
    public String devolverResumenDeCompra () {
        String aux = "Total a pagar: "+this.devolverMontoAPagar()+" $ . Por la compra de "+this.cantidad+" productos";
        return aux; 
    }
    
}

