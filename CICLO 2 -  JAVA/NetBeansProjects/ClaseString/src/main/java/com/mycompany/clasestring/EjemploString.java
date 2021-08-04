/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clasestring;

import java.util.Scanner;

/**
 *
 * @author FABIAN <fabian.jovalle at gmail.com>
 */
public class EjemploString {
    public static void main(String[] args) {
        //DECLARAR LA VARIABLE STRING DE MANERA IMPLICITA
        System.out.println("El primer String");
        //DECLARAR LA VARIABLE STRING DE MANERA EXPLICITA
        String variableStr = new String("El segundo String");
        System.out.println(variableStr);
        //DECLARA LA VARIABLE sTRING NULO
        String strNulo = "";
        String streNulo2 = new String();
        Scanner teclado=new Scanner(System.in);
        String cadena1, cadena2;
        System.out.println("Digite cadena 1:");
        cadena1=teclado.nextLine();
        System.out.println("Digite cadena 2:");
        cadena2=teclado.nextLine();
        
        if(cadena1.equals(cadena2)==true){
            System.out.println(cadena1+" igual a "+cadena2);
        }
        else{
            System.out.println(cadena1+" no igual a "+cadena2);
        }
        
        //
        //
        //
        
        char caracter=cadena1.charAt(0);
        System.out.println(caracter);
        int longitud=cadena1.length();
        System.out.println(longitud);
        String cadena3=cadena1.substring(0, 2);
        System.out.println(cadena3);
        int posicion=cadena1.indexOf(cadena2);
        if(posicion==-1){
            System.out.println(cadena2+" no esta contenido en "+cadena1);
        }
        else{
            System.out.println(cadena2+" si esta contenido en "+cadena1+" posicion:"+posicion);
        }
        System.out.println(cadena1.toUpperCase());
        System.out.println(cadena2.toLowerCase());


    }
}
