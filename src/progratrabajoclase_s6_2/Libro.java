/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progratrabajoclase_s6_2;

import javax.swing.JOptionPane;

/**
 *
 * @author lizet
 */
public class Libro {
    String titulo, autor, isbn ;
    float  precio ;

    public Libro(String titulo, String autor, String isbn, float precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }
    
    public void mostrarDetalles(){ 
        System.out.println("\nTitulo: "+titulo+"\nAutor: "+autor+"\nISBN: "+isbn+"\nPrecio: "+precio);
        
    }
    
    public float descuento(int edad){
        float descuento, total;
        if(edad>=60)  // mayor de tercera edad tiene 25%
            descuento=(float)0.75 ;
        else           // descuento de 10%
            descuento=(float)0.90 ;
        
        total=(float)(precio*descuento) ;
        return total ;
    }
    
    public static void main(String[] args) {
        int edad ;
        // Arreglo de Objetos de libros
        Libro [] libros= new Libro [3] ; 
        libros[0]=new Libro("Don Quijote","Miguel de Cervantes","110220330440",800);
        libros[1]=new Libro ("El Retrato de Dorian Gray ","Oscar Wilde","10020300400",550);
        libros[2]=new Libro ("It ","Stephen King","10030300300",945);
        
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente."));
        
        for (int i = 0; i < libros.length; i++) {
            libros[i].mostrarDetalles();
            float total=libros[i].descuento(edad) ;
            System.out.println("\nEl libro "+libros[i].titulo+
                " tiene un precio de "+libros[i].precio+
                "Lps. \nPrecio final menos el descuento es de "+total+" Lps.");
        }
        
    }
}
