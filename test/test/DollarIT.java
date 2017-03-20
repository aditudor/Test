/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian.Tudor
 */
public class DollarIT {
    
    public DollarIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Add method, of class Dollar.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        int a = 4;
        int b = 5;
        Dollar instance = new Dollar();
        int expResult = 9;
        int result = instance.Add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Procent method, of class Dollar.
     */
    @Test
    public void testProcent() {
        System.out.println("Procent");
        int a = 23400;
        int b = 3500;
        Dollar instance = new Dollar();
        int expResult = 8190;
        int result = instance.Procent(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
