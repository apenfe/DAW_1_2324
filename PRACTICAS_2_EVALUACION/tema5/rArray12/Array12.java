package rArray12;

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
				
				Thread.sleep(1*1000);
				
			} catch (Exception e) {
				
				   System.out.println(e);
				
			}
			
			System.out.println("La fecha y hora actual es: " + fechaHoraActual());
			
		}while(true);
		
		
		
	}
	
	public static String fechaHoraActual() {
		
		Date fecha = new Date(System.currentTimeMillis());
		String salida = new SimpleDateFormat("dd/MM/yyyy").format(fecha);
		salida += " " + new SimpleDateFormat("hh:mm:ss").format(fecha);
		
		return salida;
		
	}

}