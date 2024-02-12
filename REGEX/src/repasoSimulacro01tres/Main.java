package repasoSimulacro01tres;

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
		String regex = "[a-zA-z]+(ar|er|ir|AR|ER|IR){1}[^A-Za-z]{1}";
		
		texto = texto.replaceAll(regex, "(Verbo)");
		String nombre = ""+System.currentTimeMillis();
		
		try {
			
			FileWriter escritor = new FileWriter(".\\src\\repasoSimulacro01tres\\"+nombre+".txt",true);
			escritor.write(texto);
			escritor.close();
			
		} catch (Exception e) {
			
			System.out.println("Error");
			
		}
		
	}
	
}
