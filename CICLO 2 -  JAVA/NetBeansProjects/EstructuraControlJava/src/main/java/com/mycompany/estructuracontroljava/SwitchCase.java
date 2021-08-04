/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estructuracontroljava;

/**
 *
 * @author FABIAN
 */

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Digite la edad:");
        edad = teclado.nextInt();
        switch(edad){
            case 0:
                System.out.println("No ha cumplido");
                break;
            case 18:
                System.out.println("Mayor de edad");
                break;
            case 65:
                System.out.println("Edad de jubilacion");
                break;
            default:
                System.out.println("Seleccione edad correcta");
            break;
        }
    }
}
