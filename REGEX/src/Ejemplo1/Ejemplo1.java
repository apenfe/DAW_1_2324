package Ejemplo1;

import java.util.regex.*;

public class Ejemplo1{
	
	public static void main(String[] args) {
		
		String texto= "aa.ssdd.asddd.asd";		
		String regex = "asd";
		//String regex = "\\.a";
		//String regex = ".a";
		
		Pattern patron = Pattern.compile(regex);
		Matcher coincidencias = patron.matcher(texto);
		
		System.out.println("\nCOINCIDENCIAS:\n");
		
		while(coincidencias.find()) {
			
			System.out.println("INDICE: "+coincidencias.start()+" (FRAGMENTO: "+coincidencias.group()+")");
			
		}	
		
	}
	
}