/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author juanm
 */
public class ViajeTestTest {
    
    public ViajeTestTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testViajeFamiliar() throws ParseException {
        System.out.println("Viaje familiar");
        ViajeFamiliar viaje = new ViajeFamiliar("Popayán", "Bogotá", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
        assertEquals("Popayán", viaje.getOrigen());
        assertEquals("Bogotá", viaje.getDestino());
        assertEquals(1250000, viaje.getCosto());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), viaje.getFechaSalida());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), viaje.getFechaLlegada());
        assertEquals(5, viaje.getFamilia());
        assertEquals("Viaje para disfrutar con toda tu familia", viaje.descripcion());
        assertEquals("Cualquier método implementado en la clase base", viaje.cualquierMetodo());
        assertEquals("Método implementado en la clase hija viaje familiar", viaje.cualquierMetodo2());
    }
    
    @Test
         public void testViajeIncentivo() throws ParseException {
        System.out.println("Viaje incentivo");
        ViajeIncentivo viaje = new ViajeIncentivo("Popayán", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
        assertEquals("Popayán", viaje.getOrigen());
        assertEquals("Medellin", viaje.getDestino());
        assertEquals(2100000, viaje.getCosto());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), viaje.getFechaSalida());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), viaje.getFechaLlegada());
        assertEquals("Emtel", viaje.getEmpresa());
        assertEquals("Viaje incentivo que te envia la empresa Emtel", viaje.descripcion());
        assertEquals("Cualquier método implementado en la clase base", viaje.cualquierMetodo());
        assertEquals("Método implementado en la clase hija viaje de incentivo", viaje.cualquierMetodo2());
    } 
     @Test    
     public void testViajeIndividual() throws ParseException {
        System.out.println("Viaje individual");
        Viaje viaje = new ViajeIndividual("Popayán", "San Andres", 4250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        assertEquals("Popayán", viaje.getOrigen());
        assertEquals("San Andres", viaje.getDestino());
        assertEquals(4250000, viaje.getCosto());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), viaje.getFechaSalida());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"), viaje.getFechaLlegada());
        assertEquals("Disfruta tu viaje individual", viaje.descripcion());
        assertEquals("Cualquier método implementado en la clase base", viaje.cualquierMetodo());
        assertEquals("Cualquier método2 implementado en la clase base", viaje.cualquierMetodo2());
    }
     @Test
     public void testViajeTodoIncluido() throws ParseException {
        System.out.println("Viaje todo incluido");
        Viaje viaje = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        assertEquals("Popayán", viaje.getOrigen());
        assertEquals("Cartagena", viaje.getDestino());
        assertEquals(7350000, viaje.getCosto());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), viaje.getFechaSalida());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"), viaje.getFechaLlegada());
        assertEquals("Disfruta tu viaje todo incluido", viaje.descripcion());
        assertEquals("Cualquier método implementado en la clase base", viaje.cualquierMetodo());
        assertEquals("Cualquier método2 implementado en la clase base", viaje.cualquierMetodo2());
    }

    /**
     * Test of testViajeFamiliar method, of class ViajeTest.
     */
    @Test
    public void testTestViajeFamiliar() throws Exception {
        System.out.println("testViajeFamiliar");
        ViajeTest instance = new ViajeTest();
        instance.testViajeFamiliar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testViajeIncentivo method, of class ViajeTest.
     */
    @Test
    public void testTestViajeIncentivo() throws Exception {
        System.out.println("testViajeIncentivo");
        ViajeTest instance = new ViajeTest();
        instance.testViajeIncentivo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testViajeIndividual method, of class ViajeTest.
     */
    @Test
    public void testTestViajeIndividual() throws Exception {
        System.out.println("testViajeIndividual");
        ViajeTest instance = new ViajeTest();
        instance.testViajeIndividual();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testViajeTodoIncluido method, of class ViajeTest.
     */
    @Test
    public void testTestViajeTodoIncluido() throws Exception {
        System.out.println("testViajeTodoIncluido");
        ViajeTest instance = new ViajeTest();
        instance.testViajeTodoIncluido();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
