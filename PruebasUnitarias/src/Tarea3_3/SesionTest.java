package Tarea3_3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SesionTest {
	
	/* ATRINUTOS DE LA CLASE SESION */
	
	Sesion sesion1;
	Sesion sesion2;
	Sesion sesion3;
	Sesion sesion4;
	
	/* INICIALIZACION DE LOS ATRINUTOS DE LA CLASE SESION */
	@Before
	public void preparacion() {
		
		System.out.println("PREPARACION DE SESIONES");
		
		sesion1 = new Sesion(true);
		sesion2 = new Sesion(true);
		sesion3 = new Sesion(true);
		sesion4 = new Sesion(false); /* FORZAMOS ESTE A FALSE PARA TENER UNA RUTA ERRONEA */
		
	}

    @Test
    public void testLogin() {
    	
    	System.out.println("TEST: LOG IN");
    	
        boolean resultado1 = sesion1.login("adrian","1234"); /* TRUE COINCIDENCIA EN PRIMERA LINEA */
        boolean resultado2 = sesion2.login("lucia","1111"); /* TRUE COINCIDENCIA EN ULTIMA LINEA */
        boolean resultado3 = sesion3.login("adrian","1111"); /* FALSE NO EXISTE EN EL DOCUMENTO */
        boolean resultado4 = sesion4.login("",""); /* FALSE, NO EXISTE LA RUTA, ARROJA UNA EXCEPCION */
        
        /* SE UTILIZA ASSERT TRUE Y FALSE PARA ANALIZAR BOOLEANO */
        
        assertTrue(resultado1);
        assertTrue(resultado2);
        assertFalse(resultado3);
        assertFalse(resultado4);
     
    }
    
}