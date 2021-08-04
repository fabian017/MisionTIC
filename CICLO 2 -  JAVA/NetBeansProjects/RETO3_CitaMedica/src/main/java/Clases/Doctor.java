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
public class Doctor extends Usuario{
    private String especialidad;

    public Doctor(String especialidad, int codigo, String nombre, String correo, String direccion, String telefono) {
        super(codigo, nombre, correo, direccion, telefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidad: "+ especialidad;   
    }
    
}
