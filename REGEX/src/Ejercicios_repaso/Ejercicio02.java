package Ejercicios_repaso;

import java.util.Scanner;

/*
 * Ejercicio 2
 * 
 * Crea un programa que pida un DNI o NIE e indique si es válido de acuerdo al siguiente formato:
 * 
 * Para DNI:
 * 
 * Se compone de 9 caracteres.
 * Los 8 primeros caracteres son números.
 * El último carácter es una letra, mayúscula o minúscula, la cual solo puede ser "TRWAGMYFPDXBNJZSQVHLCKE".
 * 
 * Para NIE:
 * 
 * Se compone de 9 caracteres.
 * El primer carácter es una letra, mayúscula o minúscula, la cual solo puede ser "XYZ".
 * Los 7 siguientes caracteres son números.
 * El último carácter es una letra, mayúscula o minúscula, la cual solo puede ser "TRWAGMYFPDXBNJZSQVHLCKE".
 *  
 */

public class Ejercicio02{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserta un DNI (12345678X): ");
		String dni = teclado.nextLine();
		
		System.out.print("Inserta un NIE (X1234567X): ");
		String nie = teclado.nextLine();
		
		String regexDni = "^[\\d]{8}[TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke]{1}$";
		String regexNie = "^[XYZxyz]{1}[\\d]{7}[TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke]{1}$";
		
		if(dni.matches(regexDni)) {
			
			System.out.println("DNI correcto");
			
		}else {
			
			System.out.println("DNI incorrecto");
			
		}
		
		if(nie.matches(regexNie)) {
			
			System.out.println("NIE correcto");
			
		}else {
			
			System.out.println("NIE incorrecto");
			
		}
		
	}
	
}
