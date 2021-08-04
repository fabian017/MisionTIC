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
public class Docente extends Persona{
    //ATRIBUTOS
    private String areaFormacion;
    private String tituloProfesional;
    private String unidadAcademica;
    //CONSTRUCTOR

    public Docente(String areaFormacion, String tituloProfesional, String unidadAcademica, int idPersona, String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento, String genero, int estrato) {
    super(idPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato);
    this.areaFormacion = areaFormacion;
    this.tituloProfesional = tituloProfesional;
    this.unidadAcademica = unidadAcademica;
    }
    //GETTERS AND SETTERS

    public String getAreaFormacion() {
        return areaFormacion;
    }

    public void setAreaFormacion(String areaFormacion) {
        this.areaFormacion = areaFormacion;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public String getUnidadAcademica() {
        return unidadAcademica;
    }

    public void setUnidadAcademica(String unidadAcademica) {
        this.unidadAcademica = unidadAcademica;
    }
    
    //METODOS
    @Override
    public String toString(){
        System.out.println(super.toString());
        return "Area de Formacion: "+areaFormacion
        +"\nTitulo Profesional"+tituloProfesional
        +"\nUnidad Academica: "+unidadAcademica;
    }
}
