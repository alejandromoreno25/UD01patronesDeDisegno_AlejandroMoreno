package com.patronesDeDisegnoAlejandroMoreno.imc.controller;

import com.patronesDeDisegnoAlejandroMoreno.imc.model.CalculadoraIMC;
import com.patronesDeDisegnoAlejandroMoreno.imc.view.Calculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Implementamos el controlador
//Creamos variable de la vista y del modelo e instanciamos el modelo
//en el constructor.
public class IMCController implements ActionListener{
    private final Calculadora vistaPanel; //Vista
    private final CalculadoraIMC calculadora; //Modelo
    
    public IMCController(Calculadora vistaPanel) {
        this.vistaPanel = vistaPanel;
        this.calculadora = new CalculadoraIMC();
    this.vistaPanel.getBtnCalcular().addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

