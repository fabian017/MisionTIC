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
public class Enfermera extends Usuario{
    private String especialidad;

    public Enfermera(String especialidad, int codigo, String nombre, String correo, String direccion, String telefono) {
        super(codigo, nombre, correo, direccion,telefono);
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
        System.out.println(super.toString());
        return "Especialidad: " + especialidad;
    }
}
