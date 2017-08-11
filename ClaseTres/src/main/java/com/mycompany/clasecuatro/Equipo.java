/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clasecuatro;

/**
 *
 * @author Java
 */
public class Equipo implements Comparable<Equipo>{
    private String nombre;
    private String liga;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    private String pais;

    
    @Override
    public int compareTo(Equipo o) {
        return this.nombre.compareTo(o.nombre);
    }
            
}
