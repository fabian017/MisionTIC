/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vectoresfuncionesg27;

/**
 *
 * @author FABIAN <fabian.jovalle at gmail.com>
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa1=new HashMap<String, String>();
        mapa1.put("rojo", "red");
        mapa1.put("verde", "green");
        mapa1.put("azul", "blue");
        System.out.println("Programa Ejemplo HashMap");
        System.out.println("Listado de clave");
        /*
        for(String clave: mapa1.keySet())
        {
        System.out.println(clave);
        }
        for(String valor: mapa1.values())
        {
        System.out.println(valor);
        }*/
        Collection coleccion1=mapa1.values();
        Iterator iterador=coleccion1.iterator();
        while(iterador.hasNext())
        {
            System.out.println(coleccion1+":"+iterador.next());
        }

    }
}
