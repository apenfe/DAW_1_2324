package Ejercicios_repaso;

import java.util.Scanner;

/*
 * Ejercicio 1
 * 
 * Crea un programa que pida un nombre de usuario e indique si es válido 
 * de acuerdo al siguiente formato:
 * 
 * Debe tener una longitud de entre 3 y 20 caracteres
 * Debe empezar por un carácter alfabético, mayúscula o minúscula
 * A partir del segundo carácter puede contener mayúsculas, minúsculas, 
 * números, y caracteres especiales como _ # $ % ? = + - &
 * 
 */

public class Ejercicio01{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserta un nombre de usuario: ");
		String nick = teclado.nextLine();
		
		String regex = "^[A-Za-z]{1}.{2,19}";
		
		if(nick.matches(regex)) {
			
			System.out.println("nick correcto");
			
		}else {
			
			System.out.println("nick incorrecto");
			
		}
		
	}
	
}
