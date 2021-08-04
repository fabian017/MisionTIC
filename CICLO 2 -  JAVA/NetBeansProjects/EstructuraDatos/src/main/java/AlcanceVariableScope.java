/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABIAN
 */
public class AlcanceVariableScope {
    public static void main(String[] args) {
        boolean condicion=true;
        int numero1=0;
        if(condicion){
            numero1++;
            int numero2=5;
            System.out.println(numero2);
        }
        else{
            System.out.println("Condicion Falsa");
        }
        System.out.println(numero1);
        //System.out.println(numero2);
    }
}

