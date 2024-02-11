/*
 * dado un string y un numero, repetir el string tantas veces como 
 * el numero indique
 * 
 * Ejemplo:
 * repiteme("victor",2)
 * 
 * victor victor
 */
package UDEMY;
import java.util.Scanner;

public class Ejemplo14{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Introduzca una palabra: ");
		String palabra = teclado.nextLine().trim();
		System.out.print("Introduzca una cantidad de repeticiones: ");
		int num = teclado.nextInt();
		
		System.out.println(repiteme(palabra,num));
	}
	
	public static String repiteme(String palabra, int num) {
		
		String salida="";
		
		for (int i = 0; i < num; i++) {
			salida+=palabra+" ";
		}
		
		return salida;
	}
}