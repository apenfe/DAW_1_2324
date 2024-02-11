/*
 * Dado un numero, ver a cauantos años, dias y meses equivale
 */

package UDEMY;

import java.util.Scanner;

public class Ejemplo27{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Inserte un numero: ");
		int num = teclado.nextInt();
		
		anosMesesDias(num);
	}
	
	public static void anosMesesDias(int num) {

		int anos=0;
		int meses=0;
		int dias =0;
		
		for(int i=365; i<=num; i+=365) {
			anos++;
		}
		
		num=num-(anos*365);
		
		for(int i=30; i<=num; i+=30) {
			meses++;
		}
		
		dias=num-(meses*30);
		
		System.out.println("Son " +anos+ " años, " +meses+ " meses y " +dias+ " días.");
		
	}
}