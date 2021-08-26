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
public class Partido {
    // ATRIBUTOS
    private int partidoCodigo;
    private String partidoFecha;
    private String equipoLocal;
    private int golesLocal;
    private String equipoVisitante;
    private int golesVisitante;
    
    // CONSTRUCTOR
    public Partido(){
    }

    public Partido(int partidoCodigo, String partidoFecha, String equipoLocal, int golesLocal, String equipoVisitante, int golesVisitante) {
        this.partidoCodigo = partidoCodigo;
        this.partidoFecha = partidoFecha;
        this.equipoLocal = equipoLocal;
        this.golesLocal = golesLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesVisitante = golesVisitante;
    }
    
    // GETTERS AND SETTERS

    public int getPartidoCodigo() {
        return partidoCodigo;
    }

    public void setPartidoCodigo(int partidoCodigo) {
        this.partidoCodigo = partidoCodigo;
    }

    public String getPartidoFecha() {
        return partidoFecha;
    }

    public void setPartidoFecha(String partidoFecha) {
        this.partidoFecha = partidoFecha;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    
    // METODOS

    @Override
    public String toString() {
        return "Partido{" + "partidoCodigo=" + partidoCodigo + ", partidoFecha=" + partidoFecha + ", equipoLocal=" + equipoLocal + ", golesLocal=" + golesLocal + ", equipoVisitante=" + equipoVisitante + ", golesVisitante=" + golesVisitante + '}';
    }
    
}


