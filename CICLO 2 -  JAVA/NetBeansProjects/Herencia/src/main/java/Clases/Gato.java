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
public class Gato extends Animal{
    //ATRIBUTOS
    private boolean cazar;
    
//CONSTRUCTOS
    public Gato(){
        super("Milo", 2, 4);
        this.cazar = true;
    }
    
    //GET Y SET
    public boolean isCazar() {
        return cazar;
    }

    public void setCazar(boolean cazar) {
        this.cazar = cazar;
    }
    
    //METODO
    public void comunicar(){
        System.out.println("Meow");
    }
    
}
