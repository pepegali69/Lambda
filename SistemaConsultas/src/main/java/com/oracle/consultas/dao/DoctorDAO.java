/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.util.List;

/**
 *
 * @author Java
 */
public interface DoctorDAO {
    public void crearDoctor(Doctor doc);
    public void eliminarDoctor(Doctor doc);
    public void modificarDoctor(Doctor doc);
    public Doctor buscarDoctor(Doctor doc);
    public List<Doctor> listarDoctores();
}
