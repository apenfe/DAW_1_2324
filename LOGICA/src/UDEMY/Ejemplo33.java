/*
 * Haz un reloj que en tiempo real vaya mostarndo la hora a cada segundo.
 * 
 * Solo puedes usar el objeto date para obtener la hora inicial, pero no 
 * para actualizarla.
 */

package UDEMY;
import java.time.LocalTime;

public class Ejemplo33{
	
	public static void main(String[] args) {
		
		LocalTime hora = LocalTime.now();
		System.out.println(hora);
		
		
		while(true) {
			
			try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			hora = newHora(hora);
			
			System.out.println(hora);
			
		}

	}
    
	public static LocalTime newHora(LocalTime hora) {
		
		LocalTime nuevahora = LocalTime.now();
		
		return nuevahora;
	}
	
}