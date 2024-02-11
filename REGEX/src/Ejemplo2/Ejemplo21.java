package Ejemplo2;

import java.util.regex.*;

public class Ejemplo21{
	
	public static void main(String[] args) {
		
		String texto= "abc del mar";		
		String regex = "^abc.*"; // a seguido de b y de c literalmnete, si lo meto en corchetes, solo uno de ellos
		//String regex = "[.*abc.*]";
		
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