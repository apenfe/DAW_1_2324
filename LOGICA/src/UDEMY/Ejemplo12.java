/*
Dado un numero mostrar todos los números desde ese al 0 de 8 en 8
en una lista con guiones y cada numero debe empezar por nº

hastaCero(100) //devuelve

nº 100
nº 92
nº 84
...
nº 14

FIN
*/

package UDEMY;

import java.util.Scanner;

public class Ejemplo12{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserte un número entero: ");
		int numero = Integer.parseInt(teclado.nextLine().trim());
		
		System.out.println(hastaCero(numero));
		
	}
	
	public static String hastaCero(int numero) {
		
		String lista ="Del "+numero+" al 0.\n";
		
		for(int i=numero; i>=0; i-=8) {
			lista+="nº "+i+"\n";
		}
		
		lista+="FIN\n";
		
		return lista;
	}
}