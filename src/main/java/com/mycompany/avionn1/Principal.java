/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avionn1;

/**
 *
 * @author gabrielccgg
 */
public class Principal {
    public Principal(String ar[]){
        Logica logica = new Logica();
        logica.avion1 = logica.create(logica.size1,logica.size11);
        logica.avion2 = logica.create(logica.size2,logica.size21);
        logica.avion3 = logica.create(logica.size3,logica.size31);
        logica.pedirDatos(ar);
    }
    public static void main(String[] ar){
        Principal m = new Principal(ar);
    }
}
