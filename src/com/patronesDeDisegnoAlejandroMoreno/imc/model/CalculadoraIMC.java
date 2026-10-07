package com.patronesDeDisegnoAlejandroMoreno.imc.model;

/**
 *
 * @author Alejandro Moreno Luna
 */
public class CalculadoraIMC {

    public double calcular(double peso, double altura) {

        double imc;
        //Iniciamos una variable llamada imc para usar un return con su imc
        imc = peso / (altura * altura);
        return imc;
    }

    public String clasificar(double imc) {
        //Realizamos el método que idenrifica el peso.
        String resultado;
        if (imc < 18.5) {
            resultado = "Bajo Peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            resultado = "Peso Normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            resultado = "Sobrepeso";
        } else {
            resultado = "Obesidad";
        }
        return resultado;
    }//Fin De La Clase
}
