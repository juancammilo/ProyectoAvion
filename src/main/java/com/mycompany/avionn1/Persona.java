/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avionn1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gabrielccgg
 */
public class Persona {
    
    private String cedula;
    
    private String nombre;
    
    private String apellido;
    
    int dia;
    
    private String mes;
    
    int año;
    
    
    Map<Integer, Persona> mapa;

    public Persona(String cedula, String nombre, String apellido, int dia, String mes, int año) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.mapa = mapa;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

   

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    

    public Map<Integer, Persona> getMapa() {
        return mapa;
    }

    public void setMapa(Map<Integer, Persona> mapa) {
        this.mapa = mapa;
    }

}
