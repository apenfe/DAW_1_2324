/* 
 * Ejercicio02.java
 *
 * Escribe un método llamado  palabrasCuatroLetras()que recibe una cadena de texto como parámetro y devuelve la
 * lista de palabras con al menos cuatro letras.
 * Se supondrá que una palabra está separada de otra por uno o más espacios en blanco, caracteres de tabulación
 * o caracteres de nueva línea.
 * Prueba exhaustivamente el método pedido desde main().
 *
 * Adrián Peñalver Fernández
 *
 * 01/01/2024
 *
 */

package TRES3;

import java.util.Scanner;

public class zejercicio02{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean check = true;
		String texto="";
		
			System.out.print("Inserte un texto: ");
			
			do {
				
				try {
					texto=teclado.nextLine().trim();
					check=false;
				}catch(Exception e) {
					System.out.println("ERROR: INSERTE UN TEXTO");
				}
				
			}while(check);
			
				System.out.println(palabarasCuatroLetras(texto));
		
	}
	
	public static String palabarasCuatroLetras(String texto) {
		
		String[] palabras = new String[0];
		String salida="";
		
		palabras=texto.split(" ");
		
		for (int i = 0; i < palabras.length; i++) {
			if(palabras[i].length()>=4) {
				salida+=palabras[i]+"\n";
			}
		}
		
		return salida;

	}
	
}