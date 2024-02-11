package Ejemplo2;

public class Ejemplo37 {
	
	/*
	 * Reemplazar URLs en un texto: Escribe un programa que reemplace todas las 
	 * URLs presentes en un texto dado por una cadena específica, como [LINK].
	 * 
	 */
    
    public static void main(String[] args) {
        
        String texto= "todo lo que sea algo así: http://openai.com/c/4b03-4bb4e-feb4695 o bien así https://github.com/apenfe será censurado.";       
        String regex = "( [a-z]+://)([\\w\\.]+\\.[\\w\\.]+/{1})([\\w/\\-\\?]+) ";
        
        String salida = url(texto,regex);
        
        System.out.println(salida);
        
    }
    
    public static String url(String texto, String regex) {
    	
    	String salida = "";
    	
    	salida = texto.replaceAll(regex, "[URL]");
    	
    	return salida;
    }
    
}