package Ejercicio09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
 * Fichero.java
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

public class Fichero{
	
	public static ArrayList<String> leerFichero(String ruta){
		
		ArrayList<String> lineas = new ArrayList<String>();
		
		try {
			
			File txt = new File(ruta);
			Scanner lector = new Scanner(txt);
	
			while (lector.hasNextLine()) {
				
				String data = lector.nextLine();
				lineas.add(data);
				
			}
	
			lector.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Algo ha fallado.");
			e.printStackTrace();
		}
		
		return lineas;
	}
	
}