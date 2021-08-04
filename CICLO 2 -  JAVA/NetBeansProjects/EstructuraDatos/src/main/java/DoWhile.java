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

public class DoWhile {
    public static void main(String[] args) {
        int respuesta;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Programa Ejemplo DO WHILE");
        System.out.println("1. Peliculas");
        System.out.println("2. Series");
        System.out.println("3. Salir");
        do{
            System.out.println("Selecciones una opcion:");
            respuesta=teclado.nextInt();
            switch(respuesta){
            case 1:
                System.out.println("Peliculas");
                break;
            case 2:
                System.out.println("Series");
                break;
            case 3:
                System.out.println("Gracias por preferirnos");
                break;
            default:
                System.out.println("Selecciones opcion correcta");
                break;
            }
        }
        while(respuesta!=0);
        System.out.println("Salida del programa");
    }
}
