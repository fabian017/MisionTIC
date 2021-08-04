/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author FABIAN <fabian.jovalle at gmail.com>
 */
public class Calculadora {
    //ATRIBUTOS
    /**
     *La operacion a ejecutar
     */
    private int opcion;
    
    /**
     *numero para la operacion
     */
    private double num1, num2;
    
    //CONSTRUCTORES
    public Calculadora(){
        opcion=0;
        num1=0;
        num2=0;
    }

    public Calculadora(int opcion, double num1, double num2) {
        this.opcion = opcion;
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //OPERACIONES
    
    /**
     * @param suma suma de los numeros
     * @return la suma de los 2 numeros
     */
    public String sumar(){
        double suma = num1+num2;
        return "\nLa suma es: "+ suma;
    }
    /**
     * @param resta resta de los numeros
     * @return la resta de los 2 numeros
     */
    public String restar(){
        double resta = num1-num2;
        return "\nLa resta es: "+ resta;
    }
    /**
     * @param multiplicacion multiplicacion de los numeros
     * @return la multiplicacion de los 2 numeros
     */
    public String multiplicar(){
        double multiplicacion = num1*num2;
        return "\nLa multiplicacion es: "+ multiplicacion;
    }
    /**
     * @param division division de los numeros
     * @return la division de los 2 numeros
     */
    public String dividir(){
        double division = num1/num2;
        return "\nLa division es: "+ division;
    }
    /**
     *@param potencia potencia de un numero
     * @return potencia del num1 elevado al num2
     */
    public String potenciar(){
        double potencia = Math.pow(num1, num2);
        return "\nLa potencia es: "+potencia;
    }
    /**
     *@param raiz raiz de un numero
     * @return raiz cuadrada de los numeros
     */
    public String radical(){
        double raiz1 = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);
        return "\nLa raiz cuadrada del numero 1 es: "+raiz1+"\nLa raiz cuadrada del numero 2 es: "+raiz2;
    }
    
    public static void main(String[] args) {
        int opcion;
        double num1, num2;
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Jose Fabian Jimenez Ovalle G-27");
        
        do{
            System.out.println("\n\nCalculadora en Java");
            System.out.println("\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
            System.out.println("5. Potencia\n6. Raiz cuadrada\n7. Salir");
            System.out.println("Digite opcion: ");
            opcion=teclado.nextInt();
            while (opcion<1 || opcion>7){
                System.out.println("Digite opcion Correcta: ");
                opcion=teclado.nextInt();
            }
            System.out.println("Digite numero 1: ");
            num1=teclado.nextDouble();
            System.out.println("Digite numero 2: ");
            num2=teclado.nextDouble();
            Calculadora calculadora = new Calculadora(opcion, num1, num2);
            switch (opcion) {
                case 1:
                    System.out.print(calculadora.sumar());
                    break;
                case 2:
                    System.out.print(calculadora.restar());
                    break;
                case 3:
                    System.out.print(calculadora.multiplicar());
                    break;
                case 4:
                    System.out.print(calculadora.dividir());
                    break;
                case 5:
                    System.out.println(calculadora.potenciar());
                    break;
                case 6:
                    System.out.println(calculadora.radical());
                    break;
                case 7:
                    System.out.println("SALIENDO DE LA CALCULADORA JAVA :D");
                    break;
                default:
                    break;
            } 
        }
        while(opcion != 7);
    }
}
