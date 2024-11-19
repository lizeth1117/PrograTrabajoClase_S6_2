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
 public double bono=0 ;
 public int antiguedad ;

    public Bonificacion(String nombre, String genero, double salario, int edad) {
        super(nombre, genero, salario, edad);
    }

   
    
    public double calcularbono(int antiguedad) {
       
       this.antiguedad=antiguedad ;
       
        if (salario>= 45000){
            bono=salario*0.20;    // con salario mayor a 45000 toca 20% de bono
        }
        else if (antiguedad<=5 && salario<=18900){   
        bono= salario*0.10;          //Menos de 5 anios y menos de 18900 le toca 10% de bono
        
        }
        else if (antiguedad>5 || salario>18900 && salario< 45000){
            bono=salario*0.15;}     // mas de 5 anios o con salario mayor a 18900 toca 15% de bono
     
     return bono ;
        
    }
    
      public void mostrarEmp(){
        System.out.println("\nEl empleado "+nombre+"\nGenero: "+genero+
                "\nEdad: "+edad+"\nSalario: "+salario+
                "\nAntiguedad: "+antiguedad+
                "\nBonificacion "+bono+
                "\nSalario total: "+(salario+bono));
    }       
    
}
