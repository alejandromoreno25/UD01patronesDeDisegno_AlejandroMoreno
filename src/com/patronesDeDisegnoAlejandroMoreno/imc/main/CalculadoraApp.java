package com.patronesDeDisegnoAlejandroMoreno.imc.main;

import com.patronesDeDisegnoAlejandroMoreno.imc.controller.IMCController;
import com.patronesDeDisegnoAlejandroMoreno.imc.view.Calculadora;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
//Importamos el controlador y la vista

/**
 *
 * @author Alejandro Moreno Luna
 */
public class CalculadoraApp {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            // Si falla, mantiene el conjunto de elementos visuales paleta de colores
            //fondo y tipografias.
        }
        //Esto nos garantiza que el objeto se ponga en cola y se ejecute de forma segura
        SwingUtilities.invokeLater(() -> {
            // 1. Instanciamos la vista  y el Modelo/Controlador
            Calculadora vistaPanel = new Calculadora();

            IMCController controlador = new IMCController(vistaPanel);

            //El JPanel no funciona por si mismo. Necesitamos un JFrame.
            //Ya que no puede ser visible si no lo comvertimos.
            JFrame ventana = new JFrame("Calculadora IMC");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setContentPane(vistaPanel);
            ventana.pack();
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        });

    }

}
