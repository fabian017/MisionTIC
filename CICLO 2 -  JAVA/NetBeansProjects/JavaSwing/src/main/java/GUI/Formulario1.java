/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;

/**
 *
 * @author FABIAN
 */
public class Formulario1 {

    private JFrame marco;
    private JLabel etiqueta1;

    public Formulario1() {
        //setLayout(null);
        //Crear el panel o marco y sus componentes
        marco = new JFrame();
        marco.setBounds(10, 20, 400, 300);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Crear dos etiquetas
        etiqueta1 = new JLabel("Sistema Ejemplo Libreria Swing");
        etiqueta1.setBounds(10, 10, 300, 30);
        marco.add(etiqueta1);
        JLabel etiqueta2 = new JLabel("Copyright 2021");
        etiqueta1.setBounds(10, 20, 300, 30);
        marco.add(etiqueta2);
    }

    public static void main(String[] args) {
        
        Formulario1 formulario = new Formulario1();
    }
}
