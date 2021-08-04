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

public class EjemploIFDosNumeros {
public static void main(String[] args) {
Scanner linea=new Scanner(System.in);
float numero1;
float numero2;
System.out.println("Programa que calcula el mayor de dos numeros");
System.out.println("Digite numero 1:");
numero1=linea.nextFloat();
System.out.println("Digite numero 2:");
numero2=linea.nextFloat();
if(numero1>numero2)
{
System.out.println("El mayor es numero 1: "+numero1);
}
else
{
System.out.println("El mayor es numero 2: "+numero2);
}
}
}
