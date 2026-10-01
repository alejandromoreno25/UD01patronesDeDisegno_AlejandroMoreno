package com.patronesDeDisegnoAlejandroMoreno.imc.controller;

import com.patronesDeDisegnoAlejandroMoreno.imc.model.CalculadoraIMC;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Implantamos Modelo
public class IMCController {

    //Declaramos las variables de miembros que son las variables
    //de la interfaz (apuntes hacer cuaderno)
    private final JTextField txtPeso;
    private final JTextField txtAltura;
    private final JLabel lblResultado;
    private final JLabel lblClasificacion;

    private final CalculadoraIMC calculadora = new CalculadoraIMC();
    
    public IMCController(JTextField txtPeso, JTextField txtAltura, 
            JLabel lblResultado, JLabel lblClasificacion){
        this.txtPeso = txtPeso;
        this.txtAltura = txtAltura;
        this.lblResultado = lblResultado;
        this.lblClasificacion = lblClasificacion;
    }//Inicializamos y creamos el constructor por defecto.
    
    
}

