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
public class PropriedadesTest {
    
    public PropriedadesTest() {
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
     * Test of house method, of class Propriedades.
     */
    @Test
    public void testHouse() {
        System.out.println("house");
        String house = "casa blanca";
        Propriedades instance = new Propriedades();
        String expResult = "Casa: " + house;
        String result = instance.house(house);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of car method, of class Propriedades.
     */
    @Test
    public void testCar() {
        System.out.println("car");
        String car = "ferrari";
        Propriedades instance = new Propriedades();
        String expResult = "Carro: " + car;
        String result = instance.car(car);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of life method, of class Propriedades.
     */
    @Test
    public void testLife() {
        System.out.println("life");
        int life = 0;
        Propriedades instance = new Propriedades();
        String expResult = "life: " + life;
        String result = instance.life(life);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
