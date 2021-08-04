/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplobanco;

/**
 *
 * @author FABIAN <fabian.jovalle at gmail.com>
 */ 
public class Banco {
    private Cliente cliente1;
    private Cliente cliente2;
    private Cliente cliente3;

    public Banco() {
        this.cliente1 =new Cliente("Juan Guillermo Cuadrado",1000000000);
        this.cliente2 = new Cliente("Yerry Mina",800000000);
        this.cliente3 = new Cliente("Luis Diaz",1000000000);
    }

    public Banco(Cliente cliente1, Cliente cliente2, Cliente cliente3) {
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
        this.cliente3 = cliente3;
    }
    
    public void operar(){
        cliente1.depositar(100000);
    }
    public int depositarTotales(){
        int total =cliente1.retornarMonto()+cliente2.retornarMonto()+cliente3.retornarMonto();
        return total;
    }
    
}
