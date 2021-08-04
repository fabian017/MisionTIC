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
public class PrincipalEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1=new Estudiante("Mauricio","Borja",3,3);
        Estudiante estudiante2=new Estudiante("Lionel","Messi",2,2);
        Estudiante estudiante3=new Estudiante("Yerry","Mina",5,5);
        //System.out.println("El estudiante "+estudiante1.getNombre()+" "+estudiante1.getApellido());
        System.out.print(estudiante1.datos());
        estudiante1.aprobar();
        //System.out.println("El estudiante "+estudiante2.getNombre()+" "+estudiante2.getApellido());
        System.out.print(estudiante2.datos());
        estudiante2.aprobar();
        //System.out.println("El estudiante "+estudiante3.getNombre()+" "+estudiante3.getApellido());
        System.out.print(estudiante3.datos());
        estudiante3.aprobar();
    }
}

