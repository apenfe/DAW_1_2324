/*
 * Dada una cadena de texto y un numero, recortar el string mostarndo los
 * x primeros caracteres
 */

package UDEMY;

public class Ejemplo21{
	
	public static void main(String[] args) {
		
		String texto = "Esta es una prueba para ver el funcionamiento";
		int num = 7;
		
		System.out.println("Este es el texto cortado: \""+cortar(texto,num)+"\"");
	}
	
	public static String cortar(String texto, int num) {
		
		String text="";
		
		for (int i = 0; i < num; i++) {
			text+=texto.charAt(i);
		}

		return text;
	}
}