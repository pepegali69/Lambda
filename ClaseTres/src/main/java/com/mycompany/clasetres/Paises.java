/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clasetres;

public enum Paises {
        
    MEXICO(15,"Pepe");
    
    private int iva;
    private String contacto;

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
    private Paises(int iva){
        this.iva = iva;
    }
        private Paises(int iva,String contacto){
        this.iva = iva;
        this.contacto = contacto;
    }
    

}
