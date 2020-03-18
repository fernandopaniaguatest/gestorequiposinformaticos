package com.fernandopaniagua.proyecto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {
    
    public CalculadoraTest() {
        System.out.println("Constructor");
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void testSumar() {
        int s1 = 5;
        int s2 = 6;
        int resultadoEsperado = 11;
        Calculadora c = new Calculadora();
        int resultadoObtenido = c.sumar(s1, s2);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testDuplicar() {
        int s1 = 5;
        int resultadoEsperado = 10;
        Calculadora c = new Calculadora();
        int resultadoObtenido = c.duplicar(s1);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void testMultiplicarDecimales(){
        float f1 = 3.1f;
        float f2 = 2.8f;
        float resultadoEsperado = 8.68f;
        Calculadora c = new Calculadora();
        float resultadoObtenido = c.multiplicar(f1, f2);
        System.out.println(resultadoObtenido);
        assertEquals(resultadoEsperado, resultadoObtenido, 0.01f);
    }
}
