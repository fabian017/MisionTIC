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
public class Perro extends Animal{
    //ATRIBUTOS
    private boolean domestico;
    //CONSTRUCTOR
    public Perro(boolean domestico){
        super("Thiago",5, 4);
        this.domestico = domestico;
    }
    //GET Y SET
    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }
    //METODOS
    public void comunicar(){
        System.out.println("Woof");
    }
}
