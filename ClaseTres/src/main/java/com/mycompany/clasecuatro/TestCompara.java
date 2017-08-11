/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clasecuatro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Java
 */
public class TestCompara {
    public static void main(String[] args) {
        List<Equipo> equipos = new ArrayList<>();
        for(int i=0;i<20;i++){
            Equipo equipo = new Equipo();
            equipo.setNombre(String.valueOf((char) ('Z' - i )));
            equipos.add(equipo);
        }
        for(Equipo eq:equipos){
            System.out.println(eq.getNombre()+", ");
        }
        Collections.sort(equipos);
        for(Equipo eq:equipos){
            System.out.println(eq.getNombre()+", ");
        }
    }
}
