/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpds;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20161064010022
 */
public class LastClassTest {
    
    public LastClassTest() {
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
     * Test of pc method, of class LastClass.
     */
    @Test
    public void testPc() {
        System.out.println("pc");
        String pc = "pc0";
        LastClass instance = new LastClass();
        String expResult = "Computador 1: " + pc;
        String result = instance.pc(pc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of smartphone method, of class LastClass.
     */
    @Test
    public void testSmartphone() {
        System.out.println("smartphone");
        String stphone = "Xiaomi Redmi note 8 PRO";
        LastClass instance = new LastClass();
        String expResult = "Smartphone 1: " + stphone;
        String result = instance.smartphone(stphone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of status method, of class LastClass.
     */
    @Test
    public void testStatus() {
        System.out.println("status");
        Boolean st = true;
        LastClass instance = new LastClass();
        String expResult = "Funcionando.";
        String result = instance.status(st);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
