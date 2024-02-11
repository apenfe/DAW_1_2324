package Tarea3_2;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class EstudianteTest {
	
	/* ATRINUTOS DE LA CLASE ESTUDIANTE */
	
	Estudiante estudiante1;
	Estudiante estudiante2;
	Estudiante estudiante3;
	
	/* INICIALIZACION DE LOS ATRINUTOS DE LA CLASE ESTUDIANTE */
	@Before
	public void preparacion() {
		
		System.out.println("PREPARACION");
		
		estudiante1 = new Estudiante("A",23,2.4);
		estudiante2 = new Estudiante("B",17,9.5);
		estudiante3 = new Estudiante("C",99,23);
	}

    @Test
    public void testGetNombre() {
    	
    	System.out.println("TEST GET NOMBRE");
    	
        String resultado1 = estudiante1.getNombre();
        String resultado2 = estudiante2.getNombre();
        String resultado3 = estudiante3.getNombre();
        
        assertEquals("A", resultado1);
        assertEquals("B", resultado2);
        assertEquals("C", resultado3);
    }
    
    @Test
    public void testGetEdad() {
    	
    	System.out.println("TEST GET EDAD");
    	
        int resultado1 = estudiante1.getEdad();
        int resultado2 = estudiante2.getEdad();
        int resultado3 = estudiante3.getEdad();
        
        assertEquals(23, resultado1);
        assertEquals(17, resultado2);
        assertEquals(99, resultado3);
    	
    }
    
    @Test
    public void testGetNota() {
    	
    	System.out.println("TEST GET NOTA");
    	
        double resultado1 = estudiante1.getNota();
        double resultado2 = estudiante2.getNota();
        double resultado3 = estudiante3.getNota();
        
        assertEquals(2.4, resultado1,1e-10);
        assertEquals(9.5, resultado2,1e-10);
        assertEquals(0, resultado3,1e-10);
    	
    }
	
	/* PRUEBA DEL ESTADO ACADEMICO, TENER EN CUENTA EL OPERADOR TERNARIO */
    
    @Test
    public void testObtenerEstadoAcademico() {
    	
    	System.out.println("TEST GET ESTADO ACADEMICO");
    	
        String resultado1 = estudiante1.obtenerEstadoAcademico();
        String resultado2 = estudiante2.obtenerEstadoAcademico();
        String resultado3 = estudiante3.obtenerEstadoAcademico();
        
        assertEquals("Suspenso", resultado1);
        assertEquals("Sobresaliente", resultado2);
        assertEquals("Suspenso", resultado3);
        
    }
    
}