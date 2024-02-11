package TRES2;

import java.util.Scanner;

/* 
 * Ejercicio17.java
 * 	
 * Escribe un método que se llame indiceAfabetico() que recibe una palabra como texto. Devuelve un array (vector)
 * de números conteniendo la posición que le corresponde a cada letra de la palabra recibida según el alfabeto
 * español.
 * Prueba el método pedido desde main().
 * Se puede resolver con un vector de char que contenga todos las letras ordenadas del alfabeto español y dos 
 * bucles for anidados (uno para las letras de la palabra y otro para el array del alfabeto). Tambien se pueden
 * utilizar las propiedades de los sistemas de codificación ASCII o unicode.
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/01/2024
 *
 */

public class zejercicio17{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String palabra ="aceg";
		int[] indices = indiceAlfabetico(palabra); 
		
		for(int i=0; i<indices.length; i++) {
			System.out.println("El indice de la letra "+palabra.charAt(i)+" es: "+indices[i]);
		}
		
	}
	
	public static int[] indiceAlfabetico(String palabra) {
		
		palabra=palabra.trim().toLowerCase();
		
		int[] indices = new int[palabra.length()];
		
		for(int i=0; i<palabra.length(); i++) {
			
			indices[i]=1+(palabra.charAt(i)-'a');
			
		}
		
		return indices;
		
	}
	
}