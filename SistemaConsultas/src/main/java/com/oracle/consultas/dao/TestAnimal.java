/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

/**
 *
 * @author Java
 */
public class TestAnimal {
    
    class Animal{
        String nombre;
        Animal(String nombre){
            this.nombre = nombre;
        }
        Animal reproducirse(Animal a){
            Animal hijo = new Animal(this.nombre);
            return hijo;
        }
        
    }
    
    class Gato extends Animal{
        public Gato(String nombre){
            super(nombre);
        }
        @Override
       Animal reproducirse(Animal a){
           if(a instanceof Gato){
               return new Gato("gatazo de su vidaza");
           }else{
               System.out.println("no se pueden reproducir");
               return null;
           }
       }
    }
      class Perro extends Animal{
        public Perro(String nombre){
            super(nombre);
        }
        @Override
       Animal reproducirse(Animal a){
           if(a instanceof Perro){
               return new Perro("perrazo de su vidaza");
           }else{
               System.out.println("no se pueden reproducir");
               return null;
           }
       }  
    }
    
}
