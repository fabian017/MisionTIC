/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABIAN
 */

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*Escribir un programa que solicite la carga de 10 un primeros
        valores por teclado y imprima su suma y promedio.*/
        Scanner teclado=new Scanner(System.in);
        double suma=0,promedio,valor,contador=1;
        System.out.println("Programa Ejemplo Bucle WHILE");
        while(contador<=10){
            System.out.println("Digite valor:");
            valor=teclado.nextDouble();
            suma+=valor;
            contador++;
        }
        promedio=suma/10;
        System.out.println("Promedio:"+promedio);
    }
}
