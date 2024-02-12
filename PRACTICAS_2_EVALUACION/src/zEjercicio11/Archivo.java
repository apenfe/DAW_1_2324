package zEjercicio11;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/* 
 * Archivo.java
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

public class Archivo{
	
	public static ArrayList<Coche> leer(String ruta){
		
		ArrayList<Coche> coches = new ArrayList<Coche>();
		
		try {
			
			File archivo = new File(ruta);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split(",,");
				coches.add(new Coche(linea));
			
			}
			
			lector.close();
			
		}catch(Exception e) {
			System.out.println("ERROR");
		}
		
		return coches;
		
	}
	
	public static ArrayList<String> leerText(String ruta){
		
		ArrayList<String> coches = new ArrayList<String>();
		
		try {
			
			File archivo = new File(ruta);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String linea = lector.nextLine();
				coches.add(linea);
			
			}
			
			lector.close();
			
		}catch(Exception e) {
			System.out.println("ERROR");
		}
		
		return coches;
		
	}
	
	
}