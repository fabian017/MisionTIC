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

import java.util.Scanner;

public class Funciones {
        /**
    *Funcion que suma dos enteros
    * @param num1 almacena el numero1
    * @param num2 almacena el numero2
    * @return la suma de num1+num2
    */
    public static int suma(int num1,int num2)
    {
        //int suma;
        //suma=num1+num2;
        return num1+num2;
    }
    /**
    *Funcion que resta dos enteros
    * @param num1 almacena el numero1
    * @param num2 almacena el numero2
    * @return la resta de num1+num2
    */
    public static int resta(int num1,int num2)
    {
        return num1-num2;
    }
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero1, numero2;
        //suma=0;
        System.out.println("Programa Ejemplo de Funciones");
        System.out.println("Digite numero 1:");
        numero1=teclado.nextInt();
        System.out.println("Digite numero 2:");
        numero2=teclado.nextInt();
        /*suma=numero1+numero2;
        System.out.println("La suma es:"+suma);*/
        System.out.println("La suma:"+suma(numero1,numero2));
        System.out.println("La resta:"+resta(numero1,numero2));
    }
}
