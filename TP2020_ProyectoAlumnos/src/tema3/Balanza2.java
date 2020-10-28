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
public class Balanza2 {
    private double monto;
    private int cantidad;
    private String resumen;
    
    public Balanza2 () {
       
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
    
    public String DevolverResumenDeCompra() {
        return this.resumen;
    }

    public void setResumen(String compraActual) {
        this.resumen = this.resumen + (compraActual);
    }

    public void iniciarCompra() {
        this.monto=0;
        this.cantidad=0;
        this.resumen="";
    }
    
    public void registrarProducto(Producto productoActual) {
        
        double importeActual = productoActual.getPesoKg()* productoActual.getPrecioKg() ;
        this.monto=this.monto+ importeActual;
        this.cantidad++;
        String compraActual= productoActual.getDescripcion() + (importeActual) + " $ " ;
        this.setResumen(compraActual);
    }
    
    public double devolverMontoAPagar () {
        return this.monto;
    }
    public String devolverResumenDeCompra () {
        String aux = this.resumen + " ... Total a pagar: "+this.devolverMontoAPagar()+" $ . Por la compra de "+this.cantidad+" productos";
        return aux; 
    }    
}
