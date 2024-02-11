package Ejemplo2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo35 {
	
	/*
	 * Extraer direcciones de correo electrónico de un texto: Escribe un programa que extraiga todas las direcciones de correo electrónico presentes en un texto dado.
	 */
    
    public static void main(String[] args) {
        
        String texto= "Si encuento adrian@gmail.com u otro correo como lorenzo12@gmail.com los guardo.";       
        String regex = "( [\\w\\d]+)@([\\w\\d]+\\.[a-z]+ )";
        
        correos(texto,regex);
        
    }
    
    public static void correos(String texto, String regex) {
    	
    	Pattern patron = Pattern.compile(regex);
		Matcher coincidencias = patron.matcher(texto);
		
		System.out.println("\nCOINCIDENCIAS:\n");
		
		while(coincidencias.find()) {
			
			System.out.println("(CORREO: " + coincidencias.group() + ")");
			
		}	
    }
    
}