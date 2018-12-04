/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
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
public class ProductoTest {
    
    public ProductoTest() {
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
     * Test of getAgregados method, of class Producto.

    /**
     * Test of setAgregados method, of class Producto.
     */

    /**
     * Test of agregarAgregadoHabilitado method, of class Producto.
     */
    /*@Test
    public void testAgregarAgregadoHabilitado() {
        System.out.println("agregarAgregadoHabilitado");
        Agregado agregado = null;
        Producto instance = null;
        instance.agregarAgregadoHabilitado(agregado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarAgregadoDeshabilitado method, of class Producto.
     */
    /*@Test
    public void testAgregarAgregadoDeshabilitado() {
        System.out.println("agregarAgregadoDeshabilitado");
        Agregado agregado = null;
        Producto instance = null;
        instance.agregarAgregadoDeshabilitado(agregado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of habilitarAgregado method, of class Producto.
     */
    /*@Test
    public void testHabilitarAgregado() {
        System.out.println("habilitarAgregado");
        int codigo = 0;
        Producto instance = null;
        instance.habilitarAgregado(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deshabilitarAgregado method, of class Producto.
     */
    /*@Test
    public void testDeshabilitarAgregado() {
        System.out.println("deshabilitarAgregado");
        int codigo = 0;
        Producto instance = null;
        instance.deshabilitarAgregado(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restaurar method, of class Producto.
     */
    /*@Test
    public void testRestaurar() {
        System.out.println("restaurar");
        Producto instance = null;
        instance.restaurar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPrecio method, of class Producto.
     */
    @Test
    public void testCalcularPrecio() {
        System.out.println("calcularPrecio");
        Rubro rubro1 = new Rubro("Sandwicheria");
        Producto producto1 = new Producto(1, "Milanesa", 50, false, 24,rubro1, true);
        Producto instance = producto1;
        double expResult = 50;
        double result = instance.calcularPrecio();
        assertEquals(expResult, result,0.0);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("El testo no paso");
        }
    }
    
}
