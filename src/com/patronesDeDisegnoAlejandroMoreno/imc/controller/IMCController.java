package com.patronesDeDisegnoAlejandroMoreno.imc.controller;

import com.patronesDeDisegnoAlejandroMoreno.imc.model.CalculadoraIMC;
import com.patronesDeDisegnoAlejandroMoreno.imc.view.Calculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Implementamos el controlador
//Creamos variable de la vista y del modelo e instanciamos el modelo
//en el constructor.
public class IMCController implements ActionListener {

    private final Calculadora vista; //Vista
    private final CalculadoraIMC calculadora; //Modelo

    public IMCController(Calculadora vista) {
        this.vista = vista;
        this.calculadora = new CalculadoraIMC();
        this.vista.getBtnCalcular().addActionListener(this);
    }

    private void procesarCalculo() {
        //Antes de comenzar comprobamos que todos los campos estén rellenos de 
        //manera correcta y cambiamos la coma por el punto
        String textoaltura = vista.getTxtAltura().replace(",", ".");
        String textopeso = vista.getTxtPeso().replace(",", ".");

        double imc;
        String clasificacion;
        
        try {
            //Pasamos los Strings a float para calcular.
            double altura = Double.parseDouble(textoaltura);
            double peso = Double.parseDouble(textopeso);

            if (peso <= 0 || altura <= 0) {
                vista.setResultado("");
                vista.setClasificacion("Introduce un valor superior a 0");
                return;
            }

            imc = calculadora.calcular(peso, altura);
            clasificacion = calculadora.clasificar(imc);

            //Resultados de la operación
            vista.setResultado(String.format("Tu IMC es: %.2f", imc));
            vista.setClasificacion("Clasificación: " + clasificacion);

        } catch (NumberFormatException nfe) {
            vista.setResultado("Error: Datos Invalidos");
            //Ahora pasamos al modelo tras configurar que se introduzca 
            //Un valor correcto.
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnCalcular()) {
            this.procesarCalculo();
        }
    }
//Sobreescribimos ese método que nos dice si el botón que se acciona
    //Es el botón calcular o no.
}
