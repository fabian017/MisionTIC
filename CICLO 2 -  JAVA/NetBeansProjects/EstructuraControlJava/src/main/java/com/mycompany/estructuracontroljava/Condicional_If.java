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


public class Condicional_If {
    public static void main(String[] args){
/*Ingresar el sueldo de una persona, si supera los 2'000.000 pesos mostrar
un mensaje en pantalla indicando que debe abonar impuestos.*/
Scanner linea=new Scanner(System.in);
float sueldo;
System.out.println("Programa que calcula si debe pagar impuestos");
System.out.println("Digite sueldo:");
sueldo=linea.nextFloat();
if(sueldo>=2000000){
    System.out.println("Debe pagar impuestos a la DIAN");
}
else{
    System.out.println("No debe pagar impuestos a la DIAN");
}
}
}
