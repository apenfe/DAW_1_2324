package Ejercicios_repaso;

import java.util.Scanner;

/*
 * Ejercicio 6
 * 
 * Crea un programa que pida un UUID e indique si es válido de acuerdo al siguiente formato:
 * 
 * El UUID es un Identificador único universal el cual se compone de 5 grupos de caracteres hexadecimales con un carácter guion "-" como separador.
 * El primer grupo debe 8 dígitos haxadecimales
 * El segundo, tercero y cuarto grupo debe tener 4 dígitos hexadecimales
 * El quinto grupo debe tener 12 dígitos hexadecimales.
 *  
 */

public class Ejercicio06{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserta un UUID: ");
		String uuid = teclado.nextLine();
		
		String regex = "^([0-9A-Fa-f]{8})-([0-9A-Fa-f]{4})-([0-9A-Fa-f]{4})-([0-9A-Fa-f]{4})-([0-9A-Fa-f]{12})$";
		
		if(uuid.matches(regex)) {
			
			System.out.println("uuid correcto");
			
		}else {
			
			System.out.println("uuid incorrecto");
			
		}
		
	}
	
}
