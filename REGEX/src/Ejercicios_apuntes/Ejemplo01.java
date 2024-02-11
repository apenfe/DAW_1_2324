package Ejercicios_apuntes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo01{
	
	/*
	 * Comprueba si la cadena contiene exactamente el patrón "asd"
		Cadena: "aa.ssdd.asddd.asd"
Expresión: asd
Coincidencias: 8, 14

	 */
	
	public static void main(String[] args) {
		
		String texto = "aa.ssdd.asddd.asd";
		String regex = "asd";
		
		Pattern patron = Pattern.compile(regex);
		Matcher coincidencias = patron.matcher(texto);
		
		System.out.println("\nCOINCIDENCIAS:\n");
		
		while(coincidencias.find()) {
			
			System.out.println("INDICE: " + coincidencias.start() + " (FRAGMENTO: " + coincidencias.group() + ")");
			
		}	
		
	}
	
}