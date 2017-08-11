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
public class Bere implements Serializable{

    private static final long serialVersionUID = 1L;
    private String nivelChisme;

    public String getNivelChisme() {
        return nivelChisme;
    }

    public void setNivelChisme(String nivelChisme) {
        this.nivelChisme = nivelChisme;
    }
    
}
