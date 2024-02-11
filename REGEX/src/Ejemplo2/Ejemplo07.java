package Ejemplo2;

import java.util.regex.*;

public class Ejemplo07{
	
	public static void main(String[] args) {
		
		String texto= " 0123 aadd_   d6?f";		
		String regex = "\\D";
		//String regex = "\\D{1,4}";
		//String regex = "\\D{2,3}";
		
		coincidencias(texto,regex);
		
		boolean resultado = texto.matches(regex);
		System.out.println("VALIDADO? "+resultado); // devulve false porque esta regex solo valida un texto formado por dos caracteres	
		
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