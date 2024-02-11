package TRES2;

import java.util.Scanner;

/* 
 * Ejercicio12.java
 * 	
 * Escribe un método que se llame yaOrdenadoInt() que recibe un vector de enteros. Devuelve true si está ordenado.
 * Por ejemplo: {3, 2, 3, 4, 7, 2, 4} devolvería false.
 * Prueba el método pedido desde main().
 * Hay que recorrer el vector secuencialmente comprobando por parejas y si se encuentra un par de elementos
 * desordenados hay que terminar sin llegar al final del recorrido.
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/01/2024
 *
 */

public class zejercicio12{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] num = {3, 5, 5, 5, 6};
				
		if(yaOrdenadoInt(num)) {
			System.out.println("Estan ordenados.");
		}else {
			System.out.println("NO estan ordenados.");
		}
		
	}
	
	public static boolean yaOrdenadoInt(int[] numeros) {
		
		for(int i=1; i<numeros.length;i++) {
			if(numeros[i-1]<=numeros[i]) {
				continue;
			}else {
				return false;
			}
		}
		
		return true;
		
	}
	
}