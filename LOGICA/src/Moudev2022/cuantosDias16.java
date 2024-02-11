package Moudev2022;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/*
 * Crea una función que calcule y retorne cuántos días hay entre dos cadenas
 * de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se
 *   lanzará una excepción.
 */

public class cuantosDias16{
	
	public static void main(String[] args) {
		
		String formato = "dd/MM/yyyy";
		String fecha1 = "11/05/1995";
		String fecha2 = "11/05/1996";
		
		System.out.println("La cantidad de dias entre las fechas son: "+fecha(fecha1,fecha2,formato));
		
	}
	
	public static int fecha(String fecha1, String fecha2, String formato) {
		
		int num=0;
		
		if(!isValidDate(fecha1,formato)||!isValidDate(fecha2,formato)) {
			return -1;
		}else {
			
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 
	        try {
	        	
	            Date date1 =sdf.parse(fecha1);
	            Date date2 = sdf.parse(fecha2);
	            Duration duration = Duration.between(date1.toInstant(), date2.toInstant());
	    
	            num= (int) duration.toDays();
	
	        }
	        catch (ParseException e) {
	            e.printStackTrace();
	        }
		
		}
		
		return num;
		
	}
	
	public static boolean isValidDate(String date, String dateFormat) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
		
		try {
			dtf.parse(date);
		} catch (DateTimeParseException ex) {
			return false;
		}
		
		return true;
	}

}