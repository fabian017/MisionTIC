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
public class Administrativo extends Persona {
    //ATRIBUTOS
    private String dependencia;
    private String titulo;
    
    //CONSTRUCTOR
    public Administrativo(String dependencia, String titulo, int idPersona, String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento, String genero, int estrato) {
        super(idPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato);
        this.dependencia = dependencia;
        this.titulo = titulo;
    }
    
    //METODOS GETTERS AND SETTERS
    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    //METODOS
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Dependencia: " + dependencia
                + "\nTitulo: " + titulo;
    }

}
