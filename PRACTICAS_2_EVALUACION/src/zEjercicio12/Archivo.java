package zEjercicio12;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/* 
 * Archivo.java
 * 
 * Partiendo de la clase Archivo de ejercicio anterior hacer un método estático y público
 * que reciba por parámetro un objeto de la clase Coche y la añada en una nueva línea en 
 * el mismo archivo de texto plano con extensión .txt del ejercicio anterior, con la información
 * del nuevo coche
 * 
 * En el programa principal se debe pedir los datos del nuevo coche y enviarlos al método de la
 * clase Archivo para obtener un valor devuelto por el método que sirva para indicar si se ha 
 * insertado correctamente o no se ha podido.
 * 
 * APF - 10-01-2024
 * 
 */

public class Archivo{
	
	public static boolean escribir(String ruta, String linea) {
		
		try {
			
			FileWriter escritor = new FileWriter(ruta,true);
			
			escritor.write(linea+"\n");
			
			escritor.close();
			
		}catch(Exception e) {
			System.out.println("ERROR");
			return false;
		}
		
		return true;
	}
	
	public static ArrayList<Coche> leer(String ruta) {
		
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
	
	


}