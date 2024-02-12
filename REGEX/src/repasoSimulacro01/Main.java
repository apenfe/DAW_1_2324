package repasoSimulacro01;

import java.io.FileWriter;

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
	
	public static void main(String[] args) {
		
		String texto = "Este se trata de un texto largo para borrar todos los verbos en infinito como comer, beber y dormir";
		texto= texto.replaceAll("[A-Za-z]+([aAeEiI][rR])\\b", "[verbo] ");
		
		System.out.println("El texto es finalmente: "+texto);
		String nombre =""+ System.currentTimeMillis();
		
		try {
			
			FileWriter archivo = new FileWriter(".\\src\\repasoSimulacro01\\"+nombre+".txt",true);
			
			archivo.write(texto);
			archivo.close();
			
		} catch (Exception e) {
			
			System.out.println("ERROR");
			
		}
		
		
	}
	
}
