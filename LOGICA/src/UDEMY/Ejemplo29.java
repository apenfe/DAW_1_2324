/*
 * Dado un numero, indicar si es capicua o no
 */

package UDEMY;

import java.util.Scanner;

public class Ejemplo29{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Inserte un numero para ver si es capicua: ");
		int num = teclado.nextInt();
		
		if(capicua(num)) {
			System.out.println("El número "+num+" es capicua.");
		}else {
			System.out.println("El número "+num+" NO es capicua.");
		}
		
	}
	
	public static boolean capicua(int num) {

		String numero ="" ,numero2="";
		numero+=num;
		
		for(int i=numero.length()-1;i>=0;i--) {
			numero2+=numero.charAt(i);
		}
		
		if(numero.equals(numero2)) {
			return true;
		}
		
		return false;
		
	}
}