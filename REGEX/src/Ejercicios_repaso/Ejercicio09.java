package Ejercicios_repaso;

import java.util.Scanner;

/*
 * Ejercicio 9
 * 
 * Crea un programa que pida una matrícula de vehículo e indique si el formato es válido de acuerdo a las siguientes indicaciones:
 * 
 * Matrícula actual:
 * 
 * Las matrículas actuales se componen de 7 caracteres en dos grupos.
 * El primer grupo se compone de 4 caracteres numéricos.
 * El segundo grupo se compone de 3 caracteres alfabéticos mayúsculas en donde se excluyen las vocales (AEIOU), la Ñ y la Q.
 * 
 * Matrícula antigua:
 * 
 * Las matrículas antiguas se componen de entre 6 y 8 caracteres en tres grupos.
 * El primer grupo corresponde al identificador de provincia y contiene caracteres alfabéticos los cuales solo pueden ser los del siguiente listado (lista)
 * El segundo grupo se compone de 4 caracteres numéricos.
 * El tercer grupo se compone de 1 o 2 caracteres alfabéticos mayúsculas en donde se excluyen las vocales (AEIOU), la Ñ y la Q.
 * 
 */

public class Ejercicio09{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserte una matricula: ");
		String matricula = teclado.nextLine();
		
		String actual = "^([0-9]{4})[BCDFGHIJKLMNPRSTVWXY]{3}$";
		String antigua = "^(C|VI|AB|A|AL|O|AV|BA|B|CC|CA|S|CS|CE|CR)([0-9]{4})[BCDFGHIJKLMNPRSTVWXY]{1,2}$";
		
		if(matricula.matches(actual)) {
			
			System.out.println("matricula nueva");
			
		}else {
			
			System.out.println("ERROR");
			
		}
		
		if(matricula.matches(antigua)) {
			
			System.out.println("matricula antigua");
			
		}else {
			
			System.out.println("ERROR");
			
		}
		
	}
	
}
