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
public class Perro implements Serializable{

    public Perro(String raza){
        this.raza = raza;
    }
    private static final long serialVersionUID = 1L;
    
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
