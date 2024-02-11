/*
 * Dado un numero mostrar el cuadrado de todos los naturales del 0 al numero
 */

package UDEMY;

import java.util.Scanner;

public class Ejemplo38{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.print("Inserte un numero: ");
		int numero = Integer.parseInt(teclado.nextLine().trim());
		
		cuadrados(numero);	
	}
	
	public static void cuadrados(int numero){
		
		for (int i = 1; i <= numero; i++) {
			System.out.println(Math.pow(i, 2));
		}
		
	}
	
}