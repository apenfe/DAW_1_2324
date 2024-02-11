package Ejercicios_repaso;

import java.util.Scanner;

/*
 * Ejercicio 3
 * 
 * Crea un programa que pida una dirección IPv4 e indique si es válida de acuerdo al siguiente formato:
 * 
 * Se compone de cuatro grupos de números separados por el carácter punto "."; ejemplo: 192.168.1.15
 * Cada grupo de números puede tener entre 1 y 3 caracteres ya que el rango numérico de cada grupo va 
 * desde el 0 al 255.
 * 
 * Opcionalmente, se podría hacer mediante un split y comprobar cada grupo individualmente, pero se 
 * recomienda dejar esta opción para cuando se haya probado la expresión regular que abarca todas las 
 * posibilidades de cada grupo.
 *  
 */

public class Ejercicio03{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserta una IPv4 (255.255.255.255): ");
		String ip = teclado.nextLine();
		
		String regexIP = "^([0-9]{1}|[0-9]{2}|1[0-9]{2}|2[0-5]{2}|2[0-4][0-9])\\.([0-9]{1}|[0-9]{2}|1[0-9]{2}|2[0-5]{2}|2[0-4][0-9])\\.([0-9]{1}|[0-9]{2}|1[0-9]{2}|2[0-5]{2}|2[0-4][0-9])\\.([0-9]{1}|[0-9]{2}|1[0-9]{2}|2[0-5]{2}|2[0-4][0-9])$";
		String regexOcteto ="^[0-9]{1}|[0-9]{2}|1[0-9]{2}|2[0-5]{2}|2[0-4][0-9]$";
		
		
		String[] octetos = ip.split("\\.");
		
		for (int i = 0; i < octetos.length; i++) {
			
			if(octetos[i].matches(regexOcteto)) {
				
				System.out.println("Octeto nº "+(i+1)+" correcto.");
				
			}else {
				
				System.out.println("Octeto nº "+(i+1)+" incorrecto.");
				
			}
			
			
		}
		
		if(ip.matches(regexIP)) {
			
			System.out.println("IP correcta");
			
		}else {
			
			System.out.println("IP incorrecta");
			
		}
		
	}
	
}
