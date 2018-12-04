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
public class LineaVentaTest {
    
    public LineaVentaTest() {
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
     * Test of getCantidad method, of class LineaVenta.
     */

    /**
     * Test of setCantidad method, of class LineaVenta.
     */

    /**
     * Test of getProducto method, of class LineaVenta.
     */

    /**
     * Test of setProducto method, of class LineaVenta.
     */
    /**
     * Test of getSubTotal method, of class LineaVenta.
     */


    /**
     * Test of setSubTotal method, of class LineaVenta.
     */


    /**
     * Test of calcularSubTotal method, of class LineaVenta.
     */
    @Test
    public void testCalcularSubTotal() {
        System.out.println("calcularSubTotal");
        Rubro rubro1 = new Rubro("Sandwicheria");
        Producto producto1 = new Producto(1, "Milanesa", 50, false, 24,rubro1, true);
        LineaVenta instance = new LineaVenta(2,producto1);
        double expResult = 100;
        double result = instance.calcularSubTotal();
        assertEquals(expResult, result,0.0);

        if(result != expResult){
            fail("El testo no paso");
        }
    }
    
}
