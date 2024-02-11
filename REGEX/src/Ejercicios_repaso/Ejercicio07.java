package Ejercicios_repaso;

import java.util.Scanner;

/*
 * Ejercicio 7
 * 
 * Crea un programa que pida un número de teléfono e indique si es válido de acuerdo al siguiente formato:
 * 
 * El número de teléfono puede empezar por un prefijo de país, el cual se compone de el carácter "+" y de uno a tres caracteres numéricos.
 * El resto del número de teléfono debe estar compuesto por 9 caracteres numéricos.
 *  
 */

public class Ejercicio07{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserta un telefono: ");
		String telefono = teclado.nextLine();
		
		String regex = "^(\\+[0-9]{1,3})?([0-9]{9})$";
		
		if(telefono.matches(regex)) {
			
			System.out.println("telefono correcto");
			
		}else {
			
			System.out.println("telefono incorrecto");
			
		}
		
	}
	
}
