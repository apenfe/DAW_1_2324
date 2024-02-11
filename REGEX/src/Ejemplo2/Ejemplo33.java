package Ejemplo2;

public class Ejemplo33{
	
	public static void main(String[] args) {
		
		String texto= "Hola  , esto esta regular .";		
		String regex = "(\\w)(\\s+)([\\.,])";
		
		String ahora = corregir(texto,regex);
		
		System.out.println("\nCORREGIDO: "+ahora); 
		
	}
	
	public static String corregir(String texto, String regex) {
		
		String salida = texto.replaceAll(regex, "$1$3");
		return salida;
		
	}
	
}