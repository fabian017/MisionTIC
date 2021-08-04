/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vectoresfuncionesg27;

/**
 *
 * @author FABIAN <fabian.jovalle at gmail.com>
 */

import java.lang.Math;
import java.util.Scanner;

public class Circulo {
    public static double areaCirculo(double radio)
    {
     return Math.PI*Math.pow(radio, 2);
    }
    public static double volumenEsfera(double radio)
    {
     return (4/3)*(Math.PI*Math.pow(radio, 3));
    }
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double radio, area, volumen, areaCirculo;
        System.out.println("Programa Area del Circulo y la Esfera");
        System.out.println("Digite radio:");
        radio=teclado.nextDouble();
        //areaCirculo=PI*radio*radio;
        //areaCirculo=Math.PI*Math.pow(radio, 2);
        System.out.println("El area del Circulo es:"+areaCirculo(radio));
        System.out.println("El volumen de la esfera es:"+volumenEsfera(radio));
}
}