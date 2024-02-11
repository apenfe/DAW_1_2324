package Ejercicios_repaso;

import java.util.Scanner;

/*
 * Ejercicio 5
 * 
 * Crea un programa que pida un nombre completo (nombre y apellidos) de persona e 
 * indique si es válido de acuerdo al siguiente formato:
 * 
 * Un nombre completo (nombre y apellidos) debe empezar y terminar por un carácter 
 * alfabético, de la "a" a la "z". No importa si son mayúsculas o minúsculas.
 * Entre medias de la cadena puede contener espacios en blanco, para separar nombre 
 * y apellidos.
 * Pueden haber tildes en cualquier posición, incluyendo las tildes invertidas 
 * "àèìòù", tanto mayúsculas como minúsculas.
 * 
 * La Ñ debe estar contemplada.
 * La diéresis en la Ü también debe tenerse en cuenta.
 * Dado que existen apellidos compuestos, se admite el carácter guion "-" siempre y 
 * cuando tenga caracteres alfabéticos a sus lados.
 * 
 * Se admite el carácter apóstrofe ' ya que existen nombre de origen no castellano que 
 * pueden tenerlos.
 * 
 * Se admite el carácter ç.
 *  
 */

public class Ejercicio05{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserta un nombre y apellidos: ");
		String nombre = teclado.nextLine();
		
		String regex = "^([A-Za-zÁÉÍÓÚáéíàèìòÀÈÌÒÙùóúçÑñ][a-záéíóúàèìñòùüç']+)( [A-Za-zÁÉÍÓÚáéíóúÑñàèìòùç][a-záéíóúàèìòùüñç']+(-[a-záéíóúàèìòùüñç']+)?){1,2}$";
		String name = "^[A-Za-zÁÉÍÓÚáéíàèìòÀÈÌÒÙùóúçÑñ][a-záéíóúàèìñòùüç']+$";
		String surname = "^([A-Za-zÁÉÍÓÚáéíóúÑñàèìòùç][a-záéíóúàèìòùüñç']+(-[a-záéíóúàèìòùüñç']+)?){1,2}$";
		
		String[] palabras = nombre.split(" ");
		
		if(nombre.matches(regex)) {
			
			System.out.println("nombre correcto");
			
		}else {
			
			System.out.println("nombre incorrecto");
			
		}
		
		for (int i = 0; i < palabras.length; i++) {
			
			if(i==0) {
				
				if(palabras[i].matches(name)) {
					
					System.out.println("nombre correcto");
					
				}else {
					
					System.out.println("nombre incorrecto");
					
				}
				
			}else if(i>0) {
				
				if(palabras[i].matches(surname)) {
					
					System.out.println("apellido correcto");
					
				}else {
					
					System.out.println("apellido incorrecto");
					
				}
				
			}
			
		}
		
	}
	
}
