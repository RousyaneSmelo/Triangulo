/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class TrianguloTest {
    
    public TrianguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of classificar method, of class Triangulo.
     */
    @Test
    public void testClassificar() {
        System.out.println("classificar");
        double a = 10.0;
        double b = 10.0;
        double c = 10.0;
        Triangulo instance = new Triangulo();
        String expResult = "Triangulo Equilatero";
        String result = instance.classificar(a, b, c);
        assertEquals(expResult, result);
       
        a = 13.0;
        b = 13.0;
        c = 9.0;
        expResult = "Triangulo Isósceles";
        result = instance.classificar(a, b, c);
        assertEquals(expResult, result);
        
        a = 10.0;
        b = 8.0;
        c = 9.0;
        expResult = "Triangulo Escaleno";
        result = instance.classificar(a, b, c);
        assertEquals(expResult, result);
                
        a = 4.0;
        b = 3.0;
        c = 20.0;
        expResult = "Não é um triangulo!";
        result = instance.classificar(a, b, c);
        assertEquals(expResult, result);
        
        
        
    }
    
}
