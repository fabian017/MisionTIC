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
public class Paciente extends Usuario{
    private String fechaNac;
    private double alto;
    private double ancho;
    private String tipoSangre;

    public Paciente(String fechaNac, double alto, double ancho, String tipoSangre, int codigo, String nombre, String correo, String direccion, String telefono) {
        super(codigo, nombre, correo, direccion, telefono);
        this.fechaNac = fechaNac;
        this.alto = alto;
        this.ancho = ancho;
        this.tipoSangre = tipoSangre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Fecha Nacimiento: " + fechaNac + ", Alto: " + alto + ", Ancho: " + ancho + ", Tipo Sangre: " + tipoSangre;
    }
    
  
}
