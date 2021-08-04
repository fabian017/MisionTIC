/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author FABIAN
 */
public class Animal {
    //ATRIBUTOS
    private int numeroPatas;
    private String nombre;
    private int edad;
    
    //CONSTRUCTOR
    public Animal(String nombre, int edad, int numeroPatas){
        this.nombre = nombre;
        this.edad = edad;
        this.numeroPatas = numeroPatas;
    }
    
    // GETTERS Y SETTERS

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //METODOS
    public void mostrar(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nNumero patas: "+numeroPatas);
    }
}
