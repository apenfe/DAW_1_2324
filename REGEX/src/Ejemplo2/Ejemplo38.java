package Ejemplo2;

public class Ejemplo38 {
	
	/*
	 * Contar palabras en un texto: Escribe un programa que cuente el número de 
	 * palabras en un texto, utilizando una expresión regular para dividir el texto en palabras.
	 * 
	 */
    
    public static void main(String[] args) {
        
        String texto= "todo lo que sea algo así: http://openai.com/c/4b03-4bb4e-feb4695 o bien así https://github.com/apenfe será censurado.";       
        String regex = "\\s+";
        
        int palabras = contarPalabras(texto,regex);
        
        System.out.println("Son un total de "+palabras+" palabras.");
        
    }
    
    public static int contarPalabras(String texto, String regex) {
    	
    	return texto.split(regex).length;
    }
    
}