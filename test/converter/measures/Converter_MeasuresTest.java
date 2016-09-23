/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter.measures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel_Angel
 */
public class Converter_MeasuresTest {
    
    public Converter_MeasuresTest() {
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
     * Test of Convert method, of class Converter_Measures.
     */
    @Test
    public void testConvert() {
        System.out.println("Convert");
        Float number = 10f;
        int index = 4;
        Float expResult = 1f;
        Float result = Converter_Measures.Convert(number, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Convertto method, of class Converter_Measures.
     */
    @Test
    public void testConvertto() {
        System.out.println("Convertto");
        Float number = 10f;
        int index = 0;
        Float expResult = 10000f;
        Float result = Converter_Measures.Convertto(number, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
