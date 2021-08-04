/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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
        cedula="";
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
}
