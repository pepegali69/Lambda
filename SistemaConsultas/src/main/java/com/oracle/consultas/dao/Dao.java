/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */
public class Dao {
    
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public static void main(String[] args) {
        Object o = "B";
        
        int i;
        if(o!=null&&o.equals("B")){
            System.out.println("Esta loco");
        }else
            System.out.println("Esta loco no truena");
    }
    
    
    public void conectar(){
        String url ="jdbc:derby://localhost:1527/";
        String dbName="Consultas";
        String driver="org.apache.derby.jdbc.ClientDriver";
        String user="root";
        String pass="root";
        
        try {
            Class.forName(driver).newInstance();
            connection=DriverManager.getConnection(url+dbName, user, pass);
            System.out.println("CONECTO");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarConexion(){
        if(this.connection!=null){
            try {
                if(!this.connection.isClosed()){
                    this.connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
