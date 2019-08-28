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
public class CRUDTest {
    
    public CRUDTest() {
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
     * Test of salvar method, of class CRUD.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        CRUD instance = new CRUD();
        Boolean expResult = true;
        Boolean result = instance.salvar();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result);

    }

    /**
     * Test of editar method, of class CRUD.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        CRUD instance = new CRUD();
        Boolean expResult = true;
        Boolean result = instance.editar();
        assertEquals(expResult, result);
           
    }

    /**
     * Test of remover method, of class CRUD.
     */
    @Test
    public void testRemover() {
        System.out.println("remover");
        CRUD instance = new CRUD();
        Boolean expResult = true;
        Boolean result = instance.remover();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of listar method, of class CRUD.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        CRUD instance = new CRUD();
        Boolean expResult = true;
        Boolean result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
