/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author FABIAN
 */
public interface Nadador {
    public default void Nadar(){
        System.out.println("Nadar");
    }
}
