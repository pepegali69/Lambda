/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.statictest;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */
public class Utileria {
    public static Date stringToDate(String s){
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/mm/dd");
        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException ex) {
            Logger.getLogger(Utileria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }
    
    
    public static void main(String[] args) {
        System.out.println(stringToDate("2017/07/08"));
    }
    
    
    
}
