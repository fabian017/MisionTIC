/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplobanco;

import java.util.Scanner;

/**
 *
 * @author FABIAN <fabian.jovalle at gmail.com>
 */
public class Cliente {
    private String nombre;
    private int monto;

    public Cliente(String nombre, int monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    public void depositar(int monto){
        monto += monto;
    }
   
    public void extraer(int monto){
        monto -= monto;
    }
    
    public int retornarMonto(){
        return monto;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Cliente cliente1 = new Cliente("Juan Guillermo Cudrado", 100);
        //System.out.println(cliente1.getNombre());
        Banco banco1 = new Banco();
        banco1.operar();
        banco1.depositarTotales();
    }
}

