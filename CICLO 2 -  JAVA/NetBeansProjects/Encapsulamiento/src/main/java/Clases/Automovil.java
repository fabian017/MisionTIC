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
public class Automovil {
    //ATRIBUTOS
    private String marca;
    private String modelo;
    private int precio;
    private float velocidad;
    //CONSTRUCTOR
    public Automovil()
    {
        //VALORES POR DEFAULT
        marca="Renault";
        modelo="Stepway";
        precio=47000000;
    }
    //CONSTRUCTOR CON PARAMETROS
    public Automovil(String marca, String modelo, int precio, float velocidad)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        this.velocidad = velocidad;
    }
    //METODOS SET/GET
    public String getMarca()
    {
        return marca;
    }
    
    public void setMarca(String marca)
    {
        this.marca=marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public float getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
 
    //METODOS TRANSACCIONALES O COMPORTAMIENTO
    public String encender() {
        return "El auto esta encendido";
    }
    
    public String mostrarInfo(){
        return "\nMarca: "+ this.marca + "\nModelo: "+ this.modelo+"\nPrecio: "+this.precio+"\nVelocidad: "+this.velocidad;
    }
    
    //SOBRECARGA DE METODOS
    public void avanzar(){
        System.out.println("El auto avanza");
    }
    public void avanzar(float distancia){
        //D=v*t->t=D/v
        float tiempo=distancia/this.velocidad;
        System.out.println(tiempo+" segundos");
    }
}


