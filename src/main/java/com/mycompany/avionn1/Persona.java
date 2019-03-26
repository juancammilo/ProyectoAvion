/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avionn1;

import java.util.HashMap;
import java.util.Map;
import java.util.Date;
/**
 *
 * @author gabrielccgg
 */
public class Persona {
    
    private String cedula;
    
    private String nombre;
    
    private String apellido;
    
    Date fecha_nacimiento = new Date();
    
    Map<Integer, Persona> mapa;

    public Persona(String cedula, String nombre, String apellido, Date fecha_nacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.mapa = mapa;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
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
