/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.clase5;

import java.io.Serializable;

/**
 *
 * @author Java
 */
public class Gato implements Serializable{
    private String nombre;
        private String raza;
        private static final long serialVersionUID = 1L;
    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
}
