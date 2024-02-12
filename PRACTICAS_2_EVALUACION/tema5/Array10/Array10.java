package Array10;

import java.sql.Date;
import java.text.SimpleDateFormat;

/* Array10.java
 * 
 * Escribe un método que se llame fechaActual() devuelva una cadena con la fecha actual en formato dd/mm/aaaa. 
 * 
 * Prueba el método pedido desde main().
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array10{
	
	public static void main(String[] args) {
		
		String fecha = fechaActual();
		
		System.out.println("La fecha de hoy es: "+fecha);
		
	}
	
	public static String fechaActual() {
		
		String salida = "";
		
		long milis= System.currentTimeMillis();
		Date myDate = new Date(milis);

		salida= new SimpleDateFormat("dd/MM/yyyy").format(myDate);
		
	    return salida;
		
	}

}