/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abraham
 */
public class ComprobanteTest {
    
    public ComprobanteTest() {
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
     * Test of getNumeroComprobante method, of class Comprobante.
     */


    /**
     * Test of setNumeroComprobante method, of class Comprobante.
     */

    /**
     * Test of getTipoDocumento method, of class Comprobante.
     */


    /**
     * Test of setTipoDocumento method, of class Comprobante.


    /**
     * Test of getTipo method, of class Comprobante.
     */

    /**
     * Test of setTipo method, of class Comprobante.
     */

    /**
     * Test of establecerFactura method, of class Comprobante.
     */
    @Test
    public void testEstablecerFactura() {
        System.out.println("establecerFactura");
        String condicionCliente = "Responsable Inscripto";
        String condicionNegocio = "Responsable Inscripto";
        Comprobante instance = new Comprobante();
        String expResult = "A";
        instance.establecerFactura(condicionCliente, condicionNegocio);
        assertEquals(expResult, "Responsable Inscripto","Responsable Inscripto");
        // TODO review the generated test code and remove the default call to fail.
        if(!expResult.equals("A")){
        
            fail("The test case is a prototype.");
        }
    }
  
    
}
