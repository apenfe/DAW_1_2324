package Array11;

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
		
		String hora = horaActual();
		
		System.out.println("La hora actual es: " + hora);
		
	}
	
	public static String horaActual() {
		
		String salida = "";
		
		long milis= System.currentTimeMillis();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date(milis);
		salida=dateFormat.format(date);
	
	    return salida;
		
	}

}