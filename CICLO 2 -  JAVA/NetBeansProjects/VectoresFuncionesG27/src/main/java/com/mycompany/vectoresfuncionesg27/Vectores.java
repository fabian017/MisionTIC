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
public class Vectores {
    public static void main(String[] args) {
        /*
         * +-------------------------+
         * | Country   |  City       |
         * ---------------------------
         * | México    | CDMX        |
         * | México    | Guadalajara |
         * | Colombia  | Bogotá      |
         * | Colombia  | Medellín    |
         * +-------------------------+
         * */
        //int [] vector=new int[2];
        String[][]ciudades=new String[4][2];
        System.out.println("Programa Ejemplo de Vectores y Indices");
        ciudades[0][0]="México";
        ciudades[0][1]="CDMX";
        ciudades[1][0]="México";
        ciudades[1][1]="Guadalajara";
        ciudades[2][0]="Colombia";
        ciudades[2][1]="Bogotá";
        ciudades[3][0]="Colombia";
        ciudades[3][1]="Medellín";
        /*
        System.out.println(ciudades[0][0]);
        System.out.println(ciudades[0][1]);
        System.out.println(ciudades[1][0]);
        System.out.println(ciudades[1][1]);
        System.out.println(ciudades[2][0]);
        System.out.println(ciudades[2][1]);
        System.out.println(ciudades[3][0]);
        System.out.println(ciudades[3][1]);

        //for anidado
        for(int contador=0;contador<4;contador++){
        for(int contador2=0;contador2<2;contador2++){
        System.out.println(ciudades[contador][contador2]);
        }
        }*/
        //for-each
        for(String filas[]:ciudades)
        {
            for(String celda:filas)
            {
                System.out.print(celda+" : ");
            }
            System.out.println();
        }
    }
}
