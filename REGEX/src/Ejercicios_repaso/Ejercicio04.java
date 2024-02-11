package Ejercicios_repaso;

import java.util.Scanner;

/*
 * Ejercicio 4
 * 
 * Crea un programa que pida una fecha en formato dd/mm/aaaa e indique si el formato es válido 
 * de acuerdo a las siguientes consideraciones:
 * 
 * Tanto los días como los meses pueden tener 1 o 2 caracteres.
 * Para los días hay que tener en cuenta que, si tiene dos caracteres y el primero de ellos es 
 * un "3", el segundo solo puede tener un "0" o un "1".
 * 
 * Para los meses hay que tener en cuenta que, si tiene dos caracteres y el primero de ellos es 
 * un "1", el segundo solo puede tener un "0", un "1" o un "2".
 *  
 */

public class Ejercicio04{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserta una fecha (dd/mm/yyyy): ");
		String fecha = teclado.nextLine();
		
		String regex = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/((19|20)[0-9]{2})";
		
		if(fecha.matches(regex)) {
			
			System.out.println("Fecha correcto");
			
		}else {
			
			System.out.println("Fecha incorrecto");
			
		}
		
	}
	
}
