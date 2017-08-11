/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Java
 */


public class DoctorDAOImpl extends Dao implements DoctorDAO{
    private final String crearsql="INSERT INTO DOCTOR(CODIGO,NOMBRE,APELLIDO,ESPECIALIDAD) VALUES(?,?,?,?)";
    
    @Override
    public void crearDoctor(Doctor doc) {
       this.conectar();
        try {
            PreparedStatement ps = this.getConnection().prepareStatement(crearsql);
            ps.setInt(1, doc.getCodigo());
            ps.setString(2, doc.getNombre());
            ps.setString(3, doc.getApellido());
            ps.setString(4, doc.getEspecialidad());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.cerrarConexion();
        }
    }

    @Override
    public void eliminarDoctor(Doctor doc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarDoctor(Doctor doc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor buscarDoctor(Doctor doc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Doctor> listarDoctores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
