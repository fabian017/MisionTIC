/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author FABIAN
 */

import javax.swing.*;

public class HolaMundoGUI
{
public static void main(String[] args)
{
JFrame marco=new JFrame("Ventana Hola Mundo");
marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
JLabel etiqueta=new JLabel("Programacion Basica JAVA");
marco.getContentPane().add(etiqueta);
marco.pack();
marco.setLocationRelativeTo(null);
marco.setVisible(true);
}

}
