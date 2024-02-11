package Ejemplo2;

import java.util.regex.*;

public class Ejemplo28{
	
	public static void main(String[] args) {
		
		String texto= "abc dfdgparfdg asdrabcty";		
		//String regex = "(a|b)+"; // los parentesis agrupan
		//String regex = "^(abc|xyz).*(par|ter).*"; 
		String regex = "^([Aa][Bb][cC]|[xX][Yy][zZ]).*([Pp][Aa][rR]|[Tt][eE][Rr]).*"; 
		
		
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