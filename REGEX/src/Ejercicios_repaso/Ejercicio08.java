package Ejercicios_repaso;

import java.util.Scanner;

/*
 * Ejercicio 8
 * 
 * Crea un programa que pida un IBAN e indique si el formato es válido de acuerdo a las siguientes indicaciones:
 * 
 * Si se introduce todo junto sin espacios:
 * 
 * Los dos primeros caracteres deben ser letras mayúsculas.
 * Los siguientes 22 caracteres deben ser números.
 * 
 * Si se introduce separado por espacios:
 * 
 * Debe estar formado por cinco grupos separados por un solo carácter "espacio":
 * El primer grupo está formado por dos caracteres que deben ser letras mayúsculas y dos números
 * El segundo y el tercer grupo deben estar formados por cuatro caracteres numéricos cada uno.
 * El cuarto grupo debe estar formado por dos caracteres numéricos.
 * El quinto grupo debe estar formado por diez caracteres numéricos.
 *  
 */

public class Ejercicio08{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserta un IBAN: ");
		String iban = teclado.nextLine();
		
		String regex = "^([A-Z]{2})([0-9]{22})$";
		String regex1 = "^([A-Z]{2}[0-9]{2}) ([0-9]{4}) ([0-9]{4}) ([0-9]{2}) ([0-9]{10})$";
		
		if(iban.matches(regex)) {
			
			System.out.println("IBAN correcto");
			
		}else {
			
			System.out.println("IBAN incorrecto");
			
		}
		
		if(iban.matches(regex1)) {
			
			System.out.println("IBAN correcto");
			
		}else {
			
			System.out.println("IBAN incorrecto");
			
		}
		
	}
	
}
