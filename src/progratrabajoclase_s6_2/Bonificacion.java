/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progratrabajoclase_s6_2;

/**
 *
 * @author lizet
 */
public class Bonificacion extends Empleado{


    public Bonificacion(String nombre, String genero, double salario, int edad) {
        super(nombre, genero, salario, edad);
    }

   
    
    public double calcularbono(int antiguedad) {
        double bono=0 ;
        
        if (antiguedad>=5 && salario>=18900){
            bono= salario*0.10;
        }
        else if (antiguedad>=7 && salario>=25000 && salario<= 45000){
            bono=salario*0.15;
        }
        else if (salario>= 45000){
            bono=salario*0.20;
        }
     return bono ;
        
    }
            
    
}
