/*
 * Dado un numero, devolver su factorial
 */

package UDEMY;

import java.util.Scanner;

public class Ejemplo28{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Inserte un numero: ");
		int num = teclado.nextInt();
		
		System.out.println(factorial(num));
	}
	
	public static int factorial(int num) {

		int factorial=1;
		
		for(int i=1; i<=num; i++) {
			factorial*=i;
		}
		
		return factorial;
		
	}
}