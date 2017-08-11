/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.exceptions;

import java.util.Date;

/**
 *
 * @author Java
 */
public class MiException extends Exception{
    
    private int code;
    private String descripcion;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    private Date date;

    public MiException() {
    }

    public MiException(String message) {
        super(message);
    }

    public MiException(String message, Throwable cause) {
        super(message, cause);
    }

    public MiException(Throwable cause) {
        super(cause);
    }

    public MiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
