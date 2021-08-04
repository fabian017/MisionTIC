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
public class Usuario {
   private int codigo;
   private String nombre;
   private String correo;
   private String direccion;
   private String telefono;

   public Usuario(int codigo, String nombre, String correo, String direccion, String telefono) {
       this.codigo = codigo;
       this.nombre = nombre;
       this.correo = correo;
       this.direccion = direccion;
       this.telefono = telefono;
   }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
   @Override
   public String toString(){
       return "Nombre: "+nombre+
               "\nCodigo: "+codigo +
               "\nCorreo: "+ correo +
               "\nDireccion: "+direccion+
               "\nTelefono: +"+telefono;
   }
}