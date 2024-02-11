package Tarea3_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilsTest {
	
    @Test
    public void testBuscarInt() {
    	
    	/*
    	 * Este test se encarga de comprobar si las busquedas 
    	 * del entero son correctas, para ello se comprueban los valores
    	 * extremos del array, un valor que se repite y un caso en que
    	 * no se encuentra en el array.
    	 * 
    	 */
    	
    	int[]enteros = {0,3,3,4};
        
        int resultado1 = Utils.buscarInt(enteros,0); // extremo
        assertEquals(0, resultado1);
        
        int resultado2 = Utils.buscarInt(enteros,3); // numero que se repite
        assertEquals(1, resultado2);
        
        int resultado3 = Utils.buscarInt(enteros,4); // extremo
        assertEquals(3, resultado3);
        
        int resultado4 = Utils.buscarInt(enteros,5); // no está
        assertEquals(-1, resultado4);
    }
    
    @Test
    public void testMasFrecuenteInt() {
    	
    	/*
    	 * Este test se encarga de comprobar si se busca el entero mas repetido
    	 * de forma correcta. Para ello se crean diferentes arrays, uno de ellos
    	 * el de prueba del enunciado.
    	 * Otro un caso que dos numeros tienen la misma frecuencia
    	 * otro en el que todos tienen la misma frecuencia
    	 * otro en que son iguales todos
    	 * otro uno solo es el mas frecuente.
    	 * 
    	 */
    	
    	int[]enteros1 = {0,3,3,4};
    	int[]enteros2 = {4,3,3,4};
    	int[]enteros3 = {0,1,2,3};
    	int[]enteros4 = {0,0,0,0};
    	int[]enteros5 = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        
        int resultado = Utils.masFrecuenteInt(enteros1); //solo uno es mas frecuente
        assertEquals(3, resultado);
        
        resultado = Utils.masFrecuenteInt(enteros2); //dos numeros misma frecuencia
        assertEquals(4, resultado);
        
        resultado = Utils.masFrecuenteInt(enteros3); // todos numeros misma frecuencia
        assertEquals(0, resultado);
        
        resultado = Utils.masFrecuenteInt(enteros4); // todos numeros iguales
        assertEquals(0, resultado);
        
        resultado = Utils.masFrecuenteInt(enteros5); // array enunciado
        assertEquals(4, resultado);
    }
    
    @Test
    public void testEsTriangulo() {
    	
    	/*
    	 * Este test, pueba los diferentes errores que pueden darse:
    	 * 
    	 * Todos los lados 0, algun lado 0, algun lado negativo
    	 * la suma de dos lados igual a un tercero
    	 * la suma de dos lados inferior a un tercero
    	 * 
    	 * Y tambien los positivos, como serian el triangulo
    	 * equilatero, isosceles y escaleno
    	 * 
    	 */
        
        boolean resultado = Utils.esTriangulo(0,0,0); // todos lados 0
        assertFalse(resultado);
        
        resultado = Utils.esTriangulo(0,1,1); // algun lado 0
        assertFalse(resultado);
        
        resultado = Utils.esTriangulo(1,1,1); // equilatero
        assertTrue(resultado);
        
        resultado = Utils.esTriangulo(-1,3,4); // algun lado negativo
        assertFalse(resultado);
        
        resultado = Utils.esTriangulo(2,2,1); // isosceles
        assertTrue(resultado);
        
        resultado = Utils.esTriangulo(5,3,4); // escaleno
        assertTrue(resultado);
        
        resultado = Utils.esTriangulo(5,1,4); // un lado = suma de los otros
        assertFalse(resultado);
        
        resultado = Utils.esTriangulo(5,1,3); // un lado > suma de los otros
        assertFalse(resultado);
        
    }
    
    @Test
    public void testTipoTriangulo() {
    	
    	/*
    	 * Este test comprueba las 4 posibilidades del metodo
    	 * que sea error, equilatero, isosceles o escaleno.
    	 * 
    	 */
        
        String resultado = Utils.tipoTriangulo(0,0,0); // error
        assertEquals("ERROR", resultado);
        
        resultado = Utils.tipoTriangulo(3,3,3); // equilatero
        assertEquals("EQUILATERO", resultado);
        
        resultado = Utils.tipoTriangulo(2,2,1); // isosceles
        assertEquals("ISOSCELES", resultado);
        
        resultado = Utils.tipoTriangulo(5,4,2); // escaleno
        assertEquals("ESCALENO", resultado);
        
    }
}