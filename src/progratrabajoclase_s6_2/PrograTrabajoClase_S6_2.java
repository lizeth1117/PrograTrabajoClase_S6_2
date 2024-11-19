/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progratrabajoclase_s6_2;

import javax.swing.JOptionPane;

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
        int antiguedad ;
        Bonificacion empleado01= new Bonificacion("Ana Martinez","mujer",20000,20);
           antiguedad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la antiguedad del empleado "+empleado01.nombre));
            empleado01.calcularbono(antiguedad);
            empleado01.mostrarEmp();
        
        Bonificacion empleado02= new Bonificacion("Carlos Rodriguez","hombre",27000,42);
           antiguedad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la antiguedad del empleado "+empleado02.nombre));
            empleado02.calcularbono(antiguedad);
            empleado02.mostrarEmp();
        
        Bonificacion empleado03= new Bonificacion("Ricardo Paz","hombre",15000,24);
             antiguedad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la antiguedad del empleado "+empleado03.nombre));
            empleado03.calcularbono(antiguedad);
            empleado03.mostrarEmp();
         
        Bonificacion empleado04= new Bonificacion("Lilian Medina","mujer",60000,27);
            antiguedad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la antiguedad del empleado "+empleado04.nombre));
            empleado04.calcularbono(antiguedad);
            empleado04.mostrarEmp();
    }
    
}
