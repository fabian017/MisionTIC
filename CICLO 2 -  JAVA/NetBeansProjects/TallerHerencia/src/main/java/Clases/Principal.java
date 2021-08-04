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
public class Principal {
    public static void main(String[] args) {
        /*Docente(String areaFormacion, String tituloProfesional, String unidadAcademica, int idPersona,
        String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento, String genero,
        int estrato)
        Docente docente1=new Docente("Administracion de Empresas","Economista","Facultad de Socioeconomicas",
        1,"Johan","Forero","1980-11-11", "Medellin","Masculino",4);
        System.out.println(docente1.toString());
         */
        TiempoCompleto tc1 = new TiempoCompleto("Doctorado", 200, 6000000, "Administracion de Empresas", "Economista", "Facultad de Socioeconomicas",
                1, "Alma", "Chacon", "1980-11-11", "Medellin", "Femenino", 4);
        System.out.println(tc1.toString());
        double nuevoSalario = tc1.getSalario() - tc1.calcularEPS(tc1.getSalario()) - tc1.calcularPension(tc1.getSalario()) - tc1.calcularARL(tc1.getSalario());
        System.out.println("El salario menos la EPS, Pension y ARL:" + nuevoSalario);
    //Persona persona1=new Persona(1,"Johan","Forero","1980-11-11", "Medellin","Masculino",4);
    }
}
