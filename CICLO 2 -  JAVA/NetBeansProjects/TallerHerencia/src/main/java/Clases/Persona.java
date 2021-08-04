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
public class Persona{
    //ATRIBUTOS
    private int idPersona;
    private String nomPersona;
    private String apePersona;
    private String fechaNacimiento;
    private String ciudadNacimiento;
    private String genero;
    private int estrato;
    //CONSTRUCTOR

    public Persona(int idPersona, String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento, String genero, int estrato) {
        this.idPersona = idPersona;
        this.nomPersona = nomPersona;
        this.apePersona = apePersona;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudadNacimiento = ciudadNacimiento;
        this.genero = genero;
        this.estrato = estrato;
    }
    //METODOS GETTERS AND SETTERS

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public String getApePersona() {
        return apePersona;
    }

    public void setApePersona(String apePersona) {
    this.apePersona = apePersona;
    }

    public String getFechaNacimiento() {
    return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }
    
    //METODOS
    @Override
    public String toString(){
        return "Nombre: "+nomPersona
        +"\nApellido: "+apePersona
        +"\nFecha de Nacimiento: "+fechaNacimiento
        +"\nCiudad de Nacimeinto: "+ciudadNacimiento
        +"\nGenero: "+genero
        +"\nEstrato: "+estrato;
    }   
    
    public double calcularEPS(int salario){
        return salario*0.04;
    }
    
    public double calcularPension(int salario){
        return salario*0.04;
    }
    
    public double calcularARL(int salario){
        return salario*0.00348;
    }

}
