package Ejemplo2;

import java.util.regex.*;

public class Ejemplo32{
	
	public static void main(String[] args) {
		
		String texto= "PrueBa89x$";		
		String regex = "(?=.*[A-ZÑ])(?=.*[a-zñ])(?=.*\\d)(?=.+[$*-+&!¡#?%]).{8,}";
		
		coincidencias(texto,regex);
		
		boolean resultado = texto.matches(regex);
		System.out.println("\nVALIDADO? "+resultado); 
		
	}
	
	public static void coincidencias(String texto, String regex) {
		
		Pattern patron = Pattern.compile(regex);
		Matcher coincidencias = patron.matcher(texto);
		
		System.out.println("\nCOINCIDENCIAS:\n");
		
		while(coincidencias.find()) {
			
			System.out.println("INDICE: " + coincidencias.start() + " (FRAGMENTO: " + coincidencias.group() + ")");
			
		}	
		
	}
	
}