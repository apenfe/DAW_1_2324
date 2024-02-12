package zEjercicio09;

import java.util.ArrayList;

/* 
 * Principal.java
 * 
 * Define una clase llamada Fichero con un método estático y público que devuelva una
 * lista con todas las líneas de un archivo de texto plano con extensión .txt
 * 
 * La lista de líneas debe recogerse en el programa Principal y mostrarse en el orden
 * en que se han obtenido, numerando cada línea desde 1 hasta N.
 * 
 * APF - 10-01-2024
 * 
 */

public class Principal{
	
	public static final String RUTA =".\\src\\Ejercicio09\\";
	public static final String ARCHIVO ="palabras.txt";
	
	public static void main(String[] args) {
		
		ArrayList<String> lineas = Fichero.leerFichero(RUTA+ARCHIVO);
			
		int i=1;
		
		for (String linea : lineas) {
			
			System.out.println("Linea nº "+i+": "+linea);
			i++;
			
		} 
		
	}

}