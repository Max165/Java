/*
Clase Libro a la cual se agregaron constructores. Tema 4.
 */
package tema4;

/**
 *
 * @author vsanz
 */
public class Libro {
   private String titulo;
   private Autor primerAutor; 
   private String editorial;
   private int añoEdicion;
   private String ISBN; 
   private double precio; 
    
    public Libro(String primerAutor, String biografiaAutor, String titulo, String editorial, int añoEdicion, String ISBN, double precio ){
         this.editorial = editorial;
         this.añoEdicion= añoEdicion;
         this.primerAutor = new Autor (primerAutor,biografiaAutor);
         this.ISBN =  ISBN;
         this.precio = precio;
    }
    
    public Libro(  String titulo,  String editorial, String ISBN){
         this.editorial = editorial;
         this.añoEdicion= 2015;
         this.ISBN =  ISBN;
         this.precio = 100;
    }
    
    public Libro(  String titulo,  String editorial,int añoEdicion, String ISBN, double precio){
         this.titulo=titulo;
         this.editorial = editorial;
         this.añoEdicion= añoEdicion;
         this.ISBN =  ISBN;
         this.precio = precio;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getPrimerAutor() {
        return primerAutor;
    }

    public void setPrimerAutor(String nombre, String biografia) {
        this.primerAutor= new Autor (nombre,biografia);
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
     
    public Libro(){
   
    }
        
   @Override
    public String toString(){
        String aux;
        aux= titulo + " por " + primerAutor.getNombre() + " - " + añoEdicion + " - " + " ISBN: " + ISBN;
       return ( aux);
    }
        
}
