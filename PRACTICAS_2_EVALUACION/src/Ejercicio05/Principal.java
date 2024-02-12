package Ejercicio05;

/* 
 * 
 * Principal.java
 * 
 * En una clase Utilidades:
 * 
 * Define un método estático llamado encripta() que reciba un texto como
 * argumento y lo encripte utilizando el algoritmo de Cesar y lo devuelva transformado.
 * 
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * APF - 10-01-2024
 * 
 */

public class Principal{
	
	public static void main(String[] args) {
		
		String texto = Entrada.pedirTexto("Inserte un texto a cifrar: ");
		
		System.out.println("\n\tEl texto no cifrado es: " + texto);
		
		if(Utilidades.encripta(texto).equals("")) {

			System.out.println("\tEl texto debe ser letras de la A a la Z sin números.");
			
		}else {
			System.out.println("\tEl texto cifrado es: " + Utilidades.encripta(texto));
		}
		
	}
}