package RepasoGlobalArrays;

import java.sql.Date;
import java.text.SimpleDateFormat;

/* Array12.java
 * 
 * Escribe un método que se llame fechaHoraActual() devuelva una cadena con la fecha y hora actual en formato dd/mm/aaaa hh:mm:ss.
 * 
 * El método debe llamarse cada 1 segundo para mostrar por pantalla el resultado simulando el funcionamiento de un reloj.
 * 
 * Prueba el método pedido desde main().
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array12{
	
	public static void main(String[] args) {
	
		do {
			
			try {
				
				System.out.println(fechaHoraActual());
				Thread.sleep(1000);
				
			} catch (Exception e) {
				
				System.err.println("ERROR");
				
			}
			
		} while (true);
	
	}
	
	public static String fechaHoraActual() {
		
		Date fecha = new Date(System.currentTimeMillis());
		SimpleDateFormat fechas = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horas = new SimpleDateFormat("hh:mm:ss");
		
		return fechas.format(fecha)+" >>> "+horas.format(fecha);
		
	}
	
}