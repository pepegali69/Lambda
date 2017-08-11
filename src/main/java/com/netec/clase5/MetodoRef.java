/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.clase5;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Java
 */
public class MetodoRef {
    public void referenciarMEtodosObjetos(){
        String[] nombres = {"Pepe","Zure","Lore"};
        
        Arrays.sort(nombres,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }

        
    }
    );
        
        Arrays.sort(nombres,String ::compareToIgnoreCase);
          for (String nombre : nombres) {
              System.out.println(nombre);
        }
      
        }
    
    public void referenciaConstructor(){
    IPersona perLambda = (String id,String nombre) -> {return new Persona(id,nombre);}; 
        perLambda.crear("1", "bere");
        
    IPersona iper = Persona::new;
    Persona per = iper.crear("3", "Pepe");
        System.out.println(per);
}
}
