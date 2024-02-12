package zEjercicio09;

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
			
			File archivo = new File(ruta);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String line = lector.nextLine();	
				lineas.add(line);

			}
			
			lector.close();
			
		}catch(FileNotFoundException e) {
			
			System.out.println("ERROR");
			e.printStackTrace();
		}
		
		return lineas;
	}
	
}