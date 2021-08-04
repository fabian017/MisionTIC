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
public class PrincipalPersona {
    public static void main(String[] args) {
        String nombre, cedula, sexo;
        int edad;
        double peso, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite nombre: ");
        nombre=teclado.nextLine();
        System.out.println("Digite edad: ");
        edad=teclado.nextInt();
        System.out.println("Digite cedula: ");
        cedula=teclado.next();
        System.out.println("Digite sexo: ");
        sexo=teclado.next();
        System.out.println("Digite peso: ");
        peso=teclado.nextDouble();
        System.out.println("Digite altura: ");
        altura=teclado.nextDouble();
        Persona persona1= new Persona();
        Persona persona2= new Persona("Luis",24,"88123456","H",80,1.70);
        Persona persona3= new Persona(nombre, edad, cedula, sexo, peso, altura);
        //System.out.println("Nombre: "+persona1.getNombre()+"\nEdad: "+persona1.getEdad()+"\nCedula: "+persona1.getCedula()+"\nSexo: "+persona1.getSexo());
        //System.out.println("Nombre: "+persona2.getNombre()+"\nEdad: "+persona2.getEdad()+"\nCedula: "+persona2.getCedula());
        persona1.mostrarPersona();
        persona2.mostrarPersona();
        persona3.mostrarPersona();
        System.out.println(persona3.calcularIMC());
    }
    
}
