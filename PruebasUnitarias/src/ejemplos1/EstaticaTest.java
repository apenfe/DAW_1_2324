package ejemplos1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EstaticaTest {
	
    @Test
    public void testFactorial() {
    	System.out.println("TEST SUMAR");
        int resultado = Estatica.factorial(5);
        assertEquals(120, resultado);
        resultado = Estatica.factorial(4);
        assertEquals(24, resultado);
        resultado = Estatica.factorial(0);
        assertEquals(1, resultado);
        resultado = Estatica.factorial(-4);
        assertEquals(-1, resultado);
    }
   
}