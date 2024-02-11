package Moudev2022;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

public class invertirPalabra07{
	
	public static void main(String[] args) {
		
		String url ="https://avatars.githubusercontent.com/u/17043402?v=4";
		
		
		System.out.println(invertir(url));
		
	}
	
	public static String invertir(String url) {
		
		String invertida="";
		
		for(int i=url.length()-1; i>=0;i--) {
			invertida+=url.charAt(i);
		}
		
		return invertida;
	}

}