/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

/**
 *
 * @author Max
 */
public class Operacion {
    private String nombre;
    private int cantidad=0;

    public void Operacion () {
        cantidad=0;
    }
    public String getOperacion() {
        return nombre;
    }

    public void setOperacion(int n) {
        switch (n) {
            case 0:
              this.nombre = "cobro de cheque";
              break;
            case 1:
              this.nombre = "deposito/extracción de cuenta";
              break;
            case 2:
              this.nombre = "pago de impuesto/servicios";
              break;
            case 3:
              this.nombre = "cobro de jubilacion";
              break;
            case 4:
              this.nombre= "cobro de planes";
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void contar() {
        this.cantidad++;
    }
    
    
}
