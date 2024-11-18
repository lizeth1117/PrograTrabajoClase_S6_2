/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progratrabajoclase_s6_2;

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
    
    public void mostrarDetalles(String titulo){ 
        System.out.println("Titulo: "+titulo+"\nAutor: "+autor+"\nISBN: "+isbn+"\nPrecio: "+precio);
        
    }
    
    public float descuento(int edad){
        float descuento, total;
        if(edad>=60)
            descuento=(float)0.75 ;
        else 
            descuento=(float)0.90 ;
        
        total=(float)(precio*descuento) ;
        return total ;
    }
    
    public static void main(String[] args) {
        Libro libro001=new Libro("don quijote","Miguel de cervantes","110220330440",800);
        Libro libro002=new Libro ("el retrato de dorian gray ","Oscar Wilde","10020300400",550);
        Libro libro003=new Libro ("it ","Stephen King","10030300300",945);
        
        libro001.mostrarDetalles("don quijote");
       
        float total=libro001.descuento(79) ;
        System.out.println("Precio menos el descuento "+total);
        
    }
}
