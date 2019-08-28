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
public class SubmitTest {
    
    public SubmitTest() {
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
     * Test of teste method, of class Submit.
     */
    @Test
    public void testTeste() {
        System.out.println("teste");
        Submit instance = new Submit();
        String expResult = "iniciando teste...";
        String result = instance.teste();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of data method, of class Submit.
     */
    @Test
    public void testData() {
        System.out.println("data");
        String data = "dados";
        Submit instance = new Submit();
        String expResult = "dados";
        String result = instance.data(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of acess method, of class Submit.
     */
    @Test
    public void testAcess() {
        System.out.println("acess");
        Submit instance = new Submit();
        String expResult = "Acesso autorizado!";
        String result = instance.acess();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
