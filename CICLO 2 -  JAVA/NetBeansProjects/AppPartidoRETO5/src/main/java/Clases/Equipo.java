/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author FABIAN JIMENEZ <fabian.jovalle at gmail.com>
 */
public class Equipo {
    //  ATRIBUTOS
    private int equipoCodigo;
    private String equipoNombre;
    private String equipoEntrenador;
    
    // CONSTRUCTOR
    public Equipo(){
    }

    public Equipo(int equipoCodigo, String equipoNombre, String equipoEntrenador) {
        this.equipoCodigo = equipoCodigo;
        this.equipoNombre = equipoNombre;
        this.equipoEntrenador = equipoEntrenador;
    }
    
    // GETTERS AND SETTERS

    public int getEquipoCodigo() {
        return equipoCodigo;
    }

    public void setEquipoCodigo(int equipoCodigo) {
        this.equipoCodigo = equipoCodigo;
    }

    public String getEquipoNombre() {
        return equipoNombre;
    }

    public void setEquipoNombre(String equipoNombre) {
        this.equipoNombre = equipoNombre;
    }

    public String getEquipoEntrenador() {
        return equipoEntrenador;
    }

    public void setEquipoEntrenador(String equipoEntrenador) {
        this.equipoEntrenador = equipoEntrenador;
    }
    
    // METODOS 

    @Override
    public String toString() {
        return "Equipo{" + "equipoCodigo=" + equipoCodigo + ", equipoNombre=" + equipoNombre + ", equipoEntrenador=" + equipoEntrenador + '}';
    }
    
  
}
