package Simulacro01;

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
		System.out.print("INTRODUCE UN TEXTO: ");
		String texto = teclado.nextLine();
		
		texto=texto.replaceAll("[A-Za-zñÑ]+[AaEeIi][rR]", "(VERBO)");
		System.out.println(texto);
		long milisegundos = System.currentTimeMillis();
		
		try {
			
			FileWriter archivo = new FileWriter(".\\src\\Simulacro01\\"+milisegundos+".txt",true);
			
			archivo.write(texto);
			
			archivo.close();
			
		}catch(Exception e) {
			System.out.println("ERROR");
		}
		
		
	}
	
}