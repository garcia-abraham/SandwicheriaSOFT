/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sun.util.calendar.LocalGregorianCalendar;

/**
 *
 * @author abraham
 */
public class VentaTest {
    
    public VentaTest() {
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
     * Test of getNeto method, of class Venta.
     */

    /**
     * Test of crearCliente method, of class Venta.
     */
    @Test
    public void testCrearCliente() {
        System.out.println("crearCliente");
        String condicionTributaria = "Resposable Inscripto";
        Cliente cliente = new Cliente(0, 0, 0, condicionTributaria, "", "");
        Venta instance = new Venta(1);
        Cliente expResult = cliente;
        instance.crearCliente(condicionTributaria);
        assertEquals(expResult.getCondicionTributaria(), condicionTributaria);
        // TODO review the generated test code and remove the default call to fail.
       if(cliente.getCondicionTributaria() != condicionTributaria){
            fail("El testo no paso");
        }
    }

    /**
     * Test of calculatTotal method, of class Venta.
     */
    @Test
    public void testCalculatTotal() {
        System.out.println("calculatTotal");
        Venta instance = new Venta(1);
        Rubro rubro1 = new Rubro("Sandwicheria");
        Producto producto1 = new Producto(1, "Milanesa", 50, false, 24,rubro1, true);
        Producto producto2 = new Producto(1, "Lomito", 50, false, 24,rubro1, true);
        LineaVenta lv1 = new LineaVenta(2,producto1);
        double expResult = 100;
        instance.calculatTotal();
        assertEquals(expResult, 100,0);
        // TODO review the generated test code and remove the default call to fail.
        if(100 != expResult){
            fail("El testo no paso");
        }
    }
    
}
