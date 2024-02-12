package Ejercicio11;

import java.util.ArrayList;

/* 
 * Principal.java
 * 
 * Define una clase llamada Archivo con un método estático y público
 * que devuelva una lista con objetos de un tipo de clase llamada Coche.
 * 
 * El método de la clase Archivo debe acceder a un archivo .txt dónde cada
 * línea representa la información de un coche distinto.
 * 
 * Los datos de cada línea son la "marca", el "modelo", el "color", el "combustible"
 * y el "kilometraje". Cada uno de estos valores estarán separados por una doble coma
 * ",,". Se debe crear un fichero con datos de prueba para poder probar el programa.
 * 
 * La lista de coches debe recogerse en el programa Principal y mostrarse en el orden
 * en que se han obtenido, numerando cada línea desde 1 hasta N, indicando todos los 
 * campos de cada coche.
 * 
 * APF - 10-01-2024
 * 
 */

public class Principal{
	
	public static final String RUTA =".\\src\\Ejercicio11\\";
	public static final String ARCHIVO ="coches.txt";
	
	public static void main(String[] args) {
		
		System.out.println("Los coches en la base de datos son: ");
			
		ArrayList<Coche> coches = Archivo.leerArchivo(RUTA+ARCHIVO);
		
		int i=1;
		
		for (Coche coche : coches) {
			
			System.out.println("\n"+i+" ---> "+coche.info());
			i++;
		}
		
	}

}