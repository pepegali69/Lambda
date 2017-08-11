/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.controller;

import com.oracle.consultas.dao.DoctorDAO;
import com.oracle.consultas.dao.DoctorDAOImpl;
import com.oracle.consultas.model.Doctor;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Java
 */
@ManagedBean
@RequestScoped
public class DoctorBean {
    
    private Doctor doctor = new Doctor();

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    public void registrar(){
        DoctorDAO dao = new DoctorDAOImpl();
        dao.crearDoctor(this.doctor);
    }
}
