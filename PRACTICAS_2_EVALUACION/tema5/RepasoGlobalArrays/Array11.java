package RepasoGlobalArrays;

import java.sql.Date;
import java.text.SimpleDateFormat;

/* Array11.java
 * 
 * Escribe un método que se llame horaActual() devuelva una cadena con la hora actual en formato hh:mm:ss. 
 * 
 * Prueba el método pedido desde main().
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array11{
	
	public static void main(String[] args) {
		
		System.out.println(horaActual());
		
	}
	
	public static String horaActual() {
		
		Date fecha = new Date(System.currentTimeMillis());
		SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss");
		
		String hora = formato.format(fecha);
		
		return hora;
		
	}
	
	
	
	

}