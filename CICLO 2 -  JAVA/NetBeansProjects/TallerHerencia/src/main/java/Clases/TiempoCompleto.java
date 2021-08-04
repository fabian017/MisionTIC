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
public class TiempoCompleto extends Docente {
    //ATRIBUTOS
    private String categoria;
    private int puntos;
    private int salario;
    
    //CONSTRUCTOR
    public TiempoCompleto(String categoria, int puntos, int salario, String areaFormacion, String tituloProfesional, String unidadAcademica, int idPersona, String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento, String genero, int estrato) {
        super(areaFormacion, tituloProfesional, unidadAcademica, idPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato);
        this.categoria = categoria;
        this.puntos = puntos;
        this.salario = salario;
    }
    
    //METODOS GETTERS AND SETTERS

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Categoria: " + categoria
                + "\nPuntos: " + puntos
                + "\nSalario: " + salario;
    }
}
