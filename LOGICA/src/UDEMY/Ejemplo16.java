/*
 * Dado un texto, contar las vocales
 */

package UDEMY;

public class Ejemplo16{
	public static void main(String[] args) {
		String texto = "murcielago es una palabra que tiene todas las vocales";
		
		System.out.println("La cantidad total de vocales es: "+contarVocales(texto));
	}
	
	public static int contarVocales(String texto) {
		
		texto =texto.trim().toLowerCase();	
		int cont=0;
		
		for (int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i)=='a'||texto.charAt(i)=='e'||texto.charAt(i)=='i'||texto.charAt(i)=='o'||texto.charAt(i)=='u') {
				cont++;
			}
		}
		
		return cont;
	}
}
