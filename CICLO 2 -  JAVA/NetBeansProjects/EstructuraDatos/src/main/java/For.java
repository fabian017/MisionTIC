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

public class For {
    public static void main(String[] args) {
        /*
    int contador=0;
    //boolean condicion=true;
    while(contador<10){
        //sentencias
        System.out.println(contador);
        contador++;
    }
    */

    //for(inicializador,condicion,incremento){}

    /*for(int contador=0;contador<10;contador++){
        System.out.println(contador);
    }

ESCRIBIR UN PROGRAMA QUE LEA 10 NOTAS DE ALUMNOS Y NOS INFORMEN
CUANTOS TIENEN NOTAS MAYORES O IGUALES A 7 Y CUANTOS MENORES*/

    float nota;
        int aprobados=0,reprobados=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Programa Ejemplo FOR");
        for(int contador=1;contador<=10;contador++){
            System.out.println("Digite nota "+contador+":");
            nota=teclado.nextFloat();
            if(nota>=7){
                aprobados++;
            }
            else{
                reprobados++;
            }
        }
            System.out.println("Aprobados:"+aprobados);
            System.out.println("Reprobados:"+reprobados);
    }
}
