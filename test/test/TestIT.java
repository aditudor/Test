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
 * @author adrian.tudor
 */
public class TestIT {
    
    public TestIT() {
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
     * Test of main method, of class Test.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        test.Test.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Calculer method, of class Test.
     */
    @Test
    public void testCalculer() {
        System.out.println("Calculer");
        long montant = 0L;
        boolean federal = true;
        boolean provincial = true;
        long expResult = 115L;
        long result = test.Test.Calculer(montant, federal, provincial);
        assertEquals(expResult, result);
        fail("The test case is a prototype !!!");
    }
    
}
