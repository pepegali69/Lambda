/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clasecuatro;

import junit.framework.Assert;
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
public class TestOperaciones {
  
    @Test
    public void testOperaciones(){
        Operaciones op = new Operaciones();
        int res=op.suma(3, 5);
        assertEquals(9,res);
    }
}
