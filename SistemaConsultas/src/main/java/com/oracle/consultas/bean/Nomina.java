/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.bean;

/**
 *
 * @author Java
 */
public class Nomina<M,T> {
    private M key;

    public M getKey() {
        return key;
    }

    public void setKey(M key) {
        this.key = key;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    private T valor;
    
}
