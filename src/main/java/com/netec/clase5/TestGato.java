/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.clase5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */
public class TestGato {
    public static void main(String[] args) {
        TestGato test = new TestGato();
        test.setArchivo();
        test.getArchivo();
    }
    
    public Object getArchivo(){
        FileInputStream fis = null;
        Gato gato = null;
        try {
            fis = new FileInputStream("testSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            gato = (Gato) ois.readObject();
            System.out.println(gato);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestGato.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestGato.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestGato.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(TestGato.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return gato;
    }
    
    public void setArchivo(){
        FileOutputStream fos = null;
        try {
            Gato benito = new Gato();
            benito.setNombre("benito");
            benito.setRaza("espartano");
            fos = new FileOutputStream("testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(benito);
            os.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestGato.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestGato.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(TestGato.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
