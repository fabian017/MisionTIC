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
public class Estudiante {
    /*Se propone la construcción de la clase Estudiante,
    3 estudiantes con 2 notas, realizar la sobrecarga del método toString del
    Estudiante y creación de un método que indique si el estudiante aprobó o no,
    volver atributos privados y mostrar que pasa, definir 2 constructores para la Clase estudiante,
    modificar la clase estudiante agregando como atributo de arreglo de notas, crear métodos
    getter para los atributos del estudiante y setter para agregar las notas de un estudiante*/
    private String nombre;
    private String apellido;
    private int nota1;
    private int nota2;
    //CONSTRUCTOR
    public Estudiante(){
       nota1=5;
       nota2=4;
    }
    public Estudiante(String nombre, String apellido, int nota1, int nota2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    //METODOS GET Y SET

    public String getNombre() {
        return nombre;
    }

     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    
    //METODOS TRANSACCIONALES
    public String datos(){
        return "\nEl estudiante "+ this.nombre + " " + this.apellido + " ";
    }
    
    //SOBRECARGA DE METODOS
    public void aprobar()
    {
    float promedio=(this.nota1+this.nota2)/2;
    if(promedio>=3){
        System.out.println("Aprobo");
    }
    else
        System.out.println("No aprobo");
    } 
}
