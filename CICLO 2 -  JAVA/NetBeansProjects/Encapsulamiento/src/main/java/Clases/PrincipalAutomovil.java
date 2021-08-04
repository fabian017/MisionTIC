/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author FABIAN <fabian.jovalle at gmail.com>
 */
public class PrincipalAutomovil {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        //System.out.println(miAuto.marca+" "+miAuto.modelo);
        //miAuto.marca="Renault";
        //System.out.println(miAuto.marca
        System.out.println("Digite marca:");
        String marca=teclado.nextLine();
        //System.out.println(marca);
        System.out.println("Digite modelo:");
        String modelo=teclado.nextLine();
        //System.out.println(modelo);
        System.out.println("Digite precio:");
        int precio=teclado.nextInt();
        //System.out.println(precio
        System.out.println("Digite velocidad en Km/s:");
        float velocidad=teclado.nextFloat();
        System.out.println("Digite distancia en Metros:");
        float distancia=teclado.nextFloat();
        Automovil miAuto=new Automovil(marca,modelo,precio,velocidad);
        /*System.out.println("Marca: "+miAuto.getMarca()+"\nModelo: "
        +miAuto.getModelo()+"\nPrecio:"+miAuto.getPrecio()+"\nVelocidad:"+miAuto.getVelocidad());
        System.out.println(miAuto.encender());*/
        System.out.println(miAuto.mostrarInfo());
        miAuto.avanzar(distancia);
    }
}
