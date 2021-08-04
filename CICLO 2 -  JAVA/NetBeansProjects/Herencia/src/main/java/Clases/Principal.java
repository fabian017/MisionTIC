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
        Gato milo = new Gato();
        milo.mostrar();
        milo.comunicar();;
        Perro Thiago = new Perro(true);
        Thiago.mostrar();
        Thiago.comunicar();
    }
}
