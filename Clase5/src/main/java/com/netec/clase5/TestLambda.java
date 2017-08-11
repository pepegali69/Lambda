/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.clase5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Java
 */
public class TestLambda {
    
    public static void main(String[] args) {
        TestLambda tl = new TestLambda();
        //tl.ordenaSinLmbda();
        
        Operacion op =(double x,double y) ->x+y;
        System.out.println(op.calcularSuma(3, 4));
    }
    
    public void ordenaSinLmbda(){
        List<Perro> list;
        list = new ArrayList<>();
        list.add(new Perro("tronkos"));
        list.add(new Perro("pirata"));
        list.add(new Perro("rocky"));
        list.add(new Perro("rufo"));
        list.add(new Perro("peluchina"));
        Collections.sort(list,new Comparator<Perro>() {
            @Override
            public int compare(Perro o1, Perro o2) {
                return o1.getRaza().compareTo(o2.getRaza());
            }
        });
        
        for (Perro perro : list) {
            System.out.println(perro.getRaza());
        }
    }
    
    
     public void ordenaLambda(){
        List<Perro> list;
        list = new ArrayList<>();
        list.add(new Perro("tronkos"));
        list.add(new Perro("pirata"));
        list.add(new Perro("rocky"));
        list.add(new Perro("rufo"));
        list.add(new Perro("peluchina"));
        Collections.sort(list, (Perro o1, Perro o2) -> o1.getRaza().compareTo(o2.getRaza()));
        
        list.forEach((Perro perro) -> {
            System.out.println(perro.getRaza());
        });
    }

    interface Operacion {

        public double calcularSuma(double x,double y);
    }
}
