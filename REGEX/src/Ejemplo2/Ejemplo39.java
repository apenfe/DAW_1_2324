package Ejemplo2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo39 {
	
	/*
	 * Extraer números de un texto: Escribe un programa que extraiga todos los números presentes en un texto dado.
	 * 
	 */
    
    public static void main(String[] args) {
        
        String texto= "Todos los numeros primos son mas de 1, 2, 3 y 5 tambien lo es el 7 así como el 13.";       
        String regex = "([\\d]+)";
        
        numerosEnTexto(texto,regex);
        
    }
    
    public static void numerosEnTexto(String texto, String regex) {
    	
    	Pattern patron = Pattern.compile(regex);
    	Matcher coincidencias = patron.matcher(texto);
    	
    	while(coincidencias.find()) {
    		
    		System.out.println("Numero: "+coincidencias.group()+". ");
    		
    	}
    	
    }
    
}