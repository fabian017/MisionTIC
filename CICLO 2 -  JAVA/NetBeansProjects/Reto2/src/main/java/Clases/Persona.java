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
public class Persona {
    private final static String sexoDefecto="H";
    //ATRIBUTOS
    /**
     *Nombre de persona
     */
    private String nombre;
    /**
     *Edad de persona
     */
    private int edad;
    /**
     *Cedula de persona
     */
    private String cedula;
    /**
     *Sexo de persona
     */
    private String sexo;
    /**
     *Peso de persona
     */
    private double peso;
    /**
     *Altura de persona
     */
    private double altura;
    
    //CONSTRUCTOR
    /**
     *Constructor por defecto 
     */
    public Persona(){
        nombre="";
        edad=0;
        sexo=sexoDefecto;
        peso=0;
        altura=0;        
    }
    
    public Persona(String nombre, int edad, String cedula,String sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.cedula=cedula;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;       
    }
    
    //METODOS GET Y SET

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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //METODOS TRANSACCIONALES
    /**
     *Metodo que muestra los datos de la persona
     */
    public void mostrarPersona(){
        System.out.println("\nNombre: "+this.nombre+"\nEdad: "+this.edad+"\nCedula: "+this.cedula
                +"\nSexo: "+this.sexo+"\nPeso: "+this.peso+"\nAltura: "+this.altura);
    }
    /**
     *Calcular Indice de Masa Corporal
     * @param peso peso de la persona
     * @param altura altura de la person
     * @return -1=INFRAPESO 1=SOBREPESO 0=PESO IDEAL
     */
    public int calcularIMC(){
        double IMC= peso/(Math.pow(altura,2));
        if (IMC<20){
            return -1;
        }
        else if (IMC>=20 && IMC<=25){
            return 0;
        }
        else{
         return 1;   
        }
    }
    
    /**
     *Indica si es mayor de edad
     * @return true es mayor de edad, false no es mayor de edad
     */
    public boolean esMayorDeEdad(){
        if (edad>=18){
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     *Comprueba que el sexo introducido es correcto
     * @param sexo Sexo de la persona
     * @return el sexo introducido si es correcto y si no lo estable como Hombre
     */
    public String comprobarSexo(String sexo){
        if (sexo.toUpperCase() == "H"){
            return "Sexo: Hombre";
        }
        else if (sexo.toUpperCase() =="M"){
            return "Sexo: Mujer";
        }
        else{
            return "Sexo: Hombre";
        }
    }
    
    public static void main(String[] args) {
        String nombre, cedula, sexo;
        int edad;
        double peso, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Jose Fabian Jimenez Ovalle");
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
        Persona persona1= new Persona(nombre, edad, cedula, sexo, peso, altura);
        persona1.mostrarPersona();
        System.out.println("IMC: "+persona1.calcularIMC());
        System.out.println(persona1.comprobarSexo(sexo.toUpperCase()));
        System.out.println("Mayor de Edad: "+persona1.esMayorDeEdad());
    }
}
