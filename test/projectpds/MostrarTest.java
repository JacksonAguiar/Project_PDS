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
public class MostrarTest {
    
    public MostrarTest() {
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
     * Test of usuario method, of class Mostrar.
     */
    @Test
    public void testUsuario() {
        System.out.println("usuario");
        String usu = "Moglin";
        Mostrar instance = new Mostrar();
        String expResult = "-> " + usu;
        String result = instance.usuario(usu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of estadoCivil method, of class Mostrar.
     */
    @Test
    public void testEstadoCivil() {
        System.out.println("estadoCivil");
        String ec = "Solteiro";
        Mostrar instance = new Mostrar();
        String expResult = "Solteiro";
        String result = instance.estadoCivil(ec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of empregado method, of class Mostrar.
     */
    @Test
    public void testEmpregado() {
        System.out.println("empregado");
        Boolean ds = true;
        Mostrar instance = new Mostrar();
        String expResult = "Empregado";
        String result = instance.empregado(ds);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
