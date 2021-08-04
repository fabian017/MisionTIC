/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author FABIAN <fabian.jovalle at gmail.com>
 */
public class Seleccion {
    // ATRIBUTOS O ESTADO 
    protected  int id;
    protected String nombre;
    protected String apellido;
    protected int edad;
    //CONSTRUCTOR DE LA CLASE VACIA
    public Seleccion(){
        // Constructor Vacio
    }
    //CONSTRUCTOR DE LA CLASE
    /**
    *ATRIBUTOS DE LA CLASE SELECCION
    * @param id Id del jugador
    * @param nombre nombre del jugador
    * @param apellido apellido del jugador
    * @param edad edad del jugador
    */
    public Seleccion(int id, String nombre, String apellido, int edad){
        //Constructor con Parametros
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    // COMPORTAMIENTO METODOS GETS Y SETS
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setId(String apellido){
        this.apellido = apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    // COMPORTAMIENTO METODOS TRANSACCIONALES
    /**
    * @return Informacion del jugador
    */
    public String mostrarDatos(){
        return "\nId: "+this.id+"\nNombre: "+this.nombre+
                "\nApellido: "+this.apellido+"\nEdad: "+this.edad;
    }
    //MAIN PRINCIPAL
    public static void main(String[] args) {
        ArrayList<Seleccion> jugadores = new ArrayList<>();
        //INSTANCIAR OBJETOS DE LA CLASE SELECCION
        //Seleccion futbolista1 = new Seleccion();
        Seleccion futbolista1 = new Seleccion(1, "Yerry","Mina", 26 );
        Seleccion futbolista2 = new Seleccion(2, "Juan Guillermo","Cuadrado", 33 );
        Seleccion futbolista3 = new Seleccion(3, "David","Ospina", 32 );
       
        /*System.out.println("Id: "+futbolista2.getId()+"\nNombre: "+futbolista2.getNombre()+
                "\nApellido: "+futbolista2.getApellido()+"\nEdad: "+futbolista2.getEdad());*/
        /*System.out.println(futbolista2.mostrarDatos());*/
        System.out.println(futbolista1.mostrarDatos());
        System.out.println(futbolista2.mostrarDatos());
        System.out.println(futbolista3.mostrarDatos());
        
        //AÑADIR LOS JUGADORES AL ARRAYLIST
        jugadores.add(futbolista1);
        jugadores.add(futbolista2);
        jugadores.add(futbolista3);
        
        //IMPIRIMIR LOS JUGADORES DESDE LA LISTA
        Iterator<Seleccion> nombreIterator = jugadores.iterator();
        while (nombreIterator.hasNext()){
            Seleccion elemento = nombreIterator.next();
            System.out.print("\n"+elemento.mostrarDatos());
       }
    }
}
