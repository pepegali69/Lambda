/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.clase5;

/**
 *
 * @author Java
 */

@FunctionalInterface
public interface IPersona {
    Persona crear(String id,String nombre);
}
