package zEjercicio12_reapso1;
import java.util.Scanner;

/* 
 * Entrada.java
 * 
 * Metodos estaticos para la entrada de datos por consola.
 * 
 * APF - 10-01-2024
 * 
 */

public class Entrada{
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static int pedirEntero() {
		
		System.out.print("Introduzca un entero: ");
		int num =-1;
		
		try {
			num = Integer.parseInt(teclado.nextLine().trim());
		}catch(Exception e) {
			System.out.println("Error no es un número.");
		}
		
		return num;
	}
	
	public static int pedirEntero(String enunciado) {
		
		int num =-1;
		
		System.out.print(enunciado);

		try {
			num = Integer.parseInt(teclado.nextLine().trim());
		}catch(Exception e) {
			System.out.println("Error no es un número.");
		}
		
		return num;
	}
		
	public static int pedirEntero(String enunciado, boolean repetir) {
		
		int num =-1;
		boolean correcto = false;
		System.out.print(enunciado);
		
		while(!correcto) {

			try {
				num = Integer.parseInt(teclado.nextLine().trim());
				correcto = true;
			}catch(Exception e) {
				System.out.print("Error no es un número, inserte un entero: ");
				if(!repetir) { // si repetrir es false da el valor por defecto en caso de fallo y no se repite
					return num;
				}
			}
		
		}
		
		return num;
		
	}
	
	public static String pedirTexto() {
		
		System.out.print("Introduzca un texto: ");
		
		return teclado.nextLine().trim();
	}
	
	public static String pedirTexto(String enunciado) {
		
		System.out.print(enunciado);
		
		return teclado.nextLine().trim();
	}
	
	public static double pedirDouble(String enunciado, boolean repetir) {
		
		double num =-1;
		boolean correcto = false;
		System.out.print(enunciado);
		
		while(!correcto) {

			try {
				num = Double.parseDouble(teclado.nextLine().trim());
				correcto = true;
			}catch(Exception e) {
				System.out.print("Error no es un número, inserte un numero: ");
				if(!repetir) { // si repetrir es false da el valor por defecto en caso de fallo y no se repite
					return num;
				}
			}
		
		}
		
		return num;
		
	}
	
}