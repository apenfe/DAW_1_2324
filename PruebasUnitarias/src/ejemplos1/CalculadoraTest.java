package ejemplos1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora calculadora;
	
	@Before
	public void preparacion() {
		System.out.println("PREPARACION");
		this.calculadora = new Calculadora();
	}
	
    @Test
    public void testSumar() {
    	System.out.println("TEST SUMAR");
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testRestar() {
    	System.out.println("TEST RESTAR");
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
    }
    
    @Test
    public void testPar() {
    	System.out.println("TEST PAR");
        boolean resultado = calculadora.esPar(2);
        assertTrue(resultado);
        boolean resultado1 = calculadora.esPar(3);
        assertFalse(resultado1);
    }
    
    @Test
    public void testImpar() {
    	System.out.println("TEST IMPAR");
        boolean resultado = calculadora.esImpar(5);
        assertEquals(true, resultado);
    }
}