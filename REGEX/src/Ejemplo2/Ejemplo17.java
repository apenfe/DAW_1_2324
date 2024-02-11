package Ejemplo2;

import java.util.regex.*;

public class Ejemplo17{
	
	public static void main(String[] args) {
		
		String texto= "bab";		
		String regex = "b?";
		
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