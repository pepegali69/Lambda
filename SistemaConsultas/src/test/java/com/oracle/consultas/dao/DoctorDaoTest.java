/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Java
 */
public class DoctorDaoTest {
    
    public void crearDoctorTest(){
     Doctor doc = new Doctor();
     doc.setApellido("ramon");
     doc.setCodigo(2);
     doc.setEspecialidad("homeopatia");
     doc.setNombre("don");
     DoctorDAO dao = new DoctorDAOImpl();
     dao.crearDoctor(doc);
    }
}
