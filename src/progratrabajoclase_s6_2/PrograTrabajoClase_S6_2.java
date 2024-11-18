/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progratrabajoclase_s6_2;

/**
 *
 * @author lizet
 */
public class PrograTrabajoClase_S6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double bono;
        Bonificacion empleado01= new Bonificacion("Ana","mujer",20000,20);
            bono=empleado01.calcularbono(9);
            System.out.println("La bonificacion de "+empleado01.nombre+" es de "+bono);
        
        Bonificacion empleado02= new Bonificacion("Carlos","hombre",27000,42);
            bono=empleado02.calcularbono(8);
            System.out.println("La bonificacion de "+empleado02.nombre+" es de "+bono);
        
        Bonificacion empleado03= new Bonificacion("Ricardo","hombre",15000,24);
            bono=empleado03.calcularbono(6);
            System.out.println("La bonificacion de "+empleado03.nombre+" es de "+bono);
         
        Bonificacion empleado04= new Bonificacion("Lizeth","mujer",60000,27);
            bono=empleado04.calcularbono(2);
            System.out.println("La bonificacion de "+empleado04.nombre+" es de "+bono);  
    }
    
}
