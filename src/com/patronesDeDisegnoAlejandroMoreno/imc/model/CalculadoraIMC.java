
package com.patronesDeDisegnoAlejandroMoreno.imc.model;
/**
 *
 * @author Alejandro Moreno Luna
 */
public class CalculadoraIMC {
    
    public double calcular(double peso, double altura){
        
        double imc;
        //Iniciamos una variable llamada imc para usar un return con su imc
        imc=peso/(altura*altura);
        return imc;
    }
    
    public String clasificar(double imc){
        
       return "hol"; 
    }
}
