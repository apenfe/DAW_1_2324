package TRES2;

import java.util.Scanner;

/* 
 * Ejercicio03.java
 *
 * Escribe un programa que muestre el factorial de un número leído por teclado.
 * Para el cálculo del factorial utiliza un método llamado factorial() que recibe el número para el cálculo 
 * y devuelve el resultado.
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/01/2024
 *
 */

public class zejercicio03{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		do {
			
			System.out.print("Numero para factorial? ");
			int num = Integer.parseInt(teclado.nextLine().trim());
			
			int fact=factorial(num);
			
			System.out.println("Factorial de "+num+": "+fact);
			
			System.out.print("Desea calcular otra factorial? SI ");
			String respuesta = teclado.nextLine().trim();
			
			if(respuesta.equalsIgnoreCase("SI")==false) {
				System.out.println("FIN DEL PROGRAMA");
				return;
			}
			
		}while(true);
		
	}
	
	public static int factorial(int num) {
		
		int facto=1;
		
		for(int i=1; i<=num; i++) {
			facto *=i;
		}
		
		return facto;
	}
	
}