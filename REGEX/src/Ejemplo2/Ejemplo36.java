package Ejemplo2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo36 {
	
	/*
	 * Extraer hashtags de un tweet: Escribe un programa que extraiga todos los 
	 * hashtags de un tweet. Un hashtag comienza con el símbolo # seguido de caracteres alfanuméricos.
	 * 
	 */
    
    public static void main(String[] args) {
        
        String texto= "Soy un influencer#guay y tengo mucho que decir #DIGO como lo quiera decir";       
        String regex = "#[\\w\\d]+";
        
        hastag(texto,regex);
        
    }
    
    public static void hastag(String texto, String regex) {
    	
    	Pattern patron = Pattern.compile(regex);
		Matcher coincidencias = patron.matcher(texto);
		
		System.out.println("\nCOINCIDENCIAS:\n");
		
		while(coincidencias.find()) {
			
			System.out.println("(CORREO: " + coincidencias.group() + ")");
			
		}	
    }
    
}