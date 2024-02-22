package RepasosFinales;

import java.io.FileWriter;
import java.util.Scanner;

public class Main{
	
	/*
	 * Escribe un programa que pida un texto largo por teclado y lo procese, sustituyendo cada palabra
	 * que sea un verbo en infinitivo por el texto "(VERBO)".
	 * 
	 * Una vez sustituido cada verbo en infinitivo, mostrar el resultado por consola y escribirlo en un 
	 * fichero en la ruta "./frases/" con un nombre de archivo formado por el tiempo el milisegundos con 
	 * extensión ".txt"
	 * 
	 */
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserte un texto: ");
		String texto = teclado.nextLine().trim();
		
		String regex = " [A-Za-z]*(ar|er|ir|AR|ER|IR)\\b";
		
		texto = texto.replaceAll(regex, "(VERBO)");
		System.out.print(texto);

		try(FileWriter escritor = new FileWriter(".\\src\\RepasosFinales\\pruebaVerbo.txt")) {
			
			escritor.write(texto);
			System.out.println("Fin del programa. ");
			
		} catch (Exception e) {
			
			System.err.println("ERROR AL GUARDAR ARCHIVO.");
			
		}
		
	}
	
}
