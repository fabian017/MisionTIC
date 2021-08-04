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
public class OperacionesCasteo {
    public static void main(String[] args) {
        int numero1=30;
        int numero2=2;
        double suma=numero1+numero2;
        System.out.println(suma);//50.0?
        double division=numero1/numero2;
        System.out.println(division);//50.0?
        char caracter='1';
        int caracter_implicito=caracter;
        System.out.println(caracter);
        System.out.println(caracter_implicito);
        short caracter_explicito=(short)caracter;
        System.out.println(caracter_explicito);
    }
}
