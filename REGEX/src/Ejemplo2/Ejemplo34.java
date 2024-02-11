package Ejemplo2;

public class Ejemplo34{
	
	public static void main(String[] args) {
		
		String texto= "<titulo>EJEMPLO_TEST</titulo>";		
		String regex = "(?i)(<titulo.*?>)(.+?)(</titulo>)";
		
		String ahora = corregir(texto,regex);
		
		System.out.println("\nCORREGIDO: "+ahora); 
		
	}
	
	public static String corregir(String texto, String regex) {
		
		String salida = texto.replaceAll(regex,"$2");
		return salida;
		
	}
	
}