
package Clases;

import java.util.Scanner;

public class calculadora {
    private int opcion;
    private double num1;
    private double num2;
    
    public calculadora(){
       
    }

    public calculadora(int opcion, double num1, double num2) {
        this.opcion = opcion;
        this.num1 = num1;
        this.num2 = num2;
    }
    public String sumar(){
        double suma = num1+num2;
        return "\nSuma: "+ suma;
    }
    
    public String restar(){
        double resta = num1-num2;
        return "\nResta: "+ resta;
    }
    
    public String multiplicar(){
        double multiplicacion = num1*num2;
        return "\nMultiplicacion: "+ multiplicacion;
    }
    
    public String dividir(){
        double division = num1/num2;
        return "\nDivision: "+ division;
    }
    
    public String sacarPotencia(){
        double potencia = Math.pow(num1, num2);
        return "\nPotencia: "+potencia;
    }
    
    public String sacarRaiz(){
        double r1 = Math.sqrt(num1);
        double r2 = Math.sqrt(num2);
        return "\nLa raiz 1 es: "+r1+"\nLa raiz 2 es: "+r2;
    }
    
    public static void main(String[] args) {
        int opcion;
        double num1, num2;
        Scanner teclado =  new Scanner(System.in);
        System.out.println("\n--Opciones--");
        System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
        System.out.println("5. Potencia de un numero\n6. Sacar Raiz cuadrada\n");
        System.out.println("Digite una opcion opcion: ");
        opcion=teclado.nextInt();
        while (opcion<1 || opcion>6){
            System.out.println("Digite opcion válida: ");
            opcion=teclado.nextInt();
        }
        System.out.println("Numero 1: ");
        num1=teclado.nextDouble();
        System.out.println("Numero 2: ");
        num2=teclado.nextDouble();
        calculadora calculadora1 = new calculadora(opcion, num1, num2);
        switch (opcion) {
            case 1:
                System.out.print(calculadora1.sumar());
                break;
            case 2:
                System.out.print(calculadora1.restar());
                break;
            case 3:
                System.out.print(calculadora1.multiplicar());
                break;
            case 4:
                System.out.print(calculadora1.dividir());
                break;
            case 5:
                System.out.println(calculadora1.sacarPotencia());
                break;
            case 6:
                System.out.println(calculadora1.sacarRaiz());
                break;
            default:
                break;
        } 
    }
}
