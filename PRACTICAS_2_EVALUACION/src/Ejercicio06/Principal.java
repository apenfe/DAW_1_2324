package Ejercicio06;

/* 
 * 
 * Principal.java
 * 
 * En una clase Utilidades:
 * 
 * Define un método estático llamado desencripta() que reciba un texto
 * encriptado como argumento y utilizando el algoritmo de Cesar inverso
 * y lo devuelva transformado como texto en claro.
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
			String codigo = Utilidades.encripta(texto);
			System.out.println("\tEl texto descifrado es: "+Utilidades.desencripta(codigo));
		}
	
	}
}