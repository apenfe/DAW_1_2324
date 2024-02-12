package zEjercicio10;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/* 
 * Fichero.java
 * 
 * Partiendo de la clase Fichero de ejercicio anterior hacer un método estático y público
 * que reciba por parámetro una cadena de texto y la añada en una nueva línea en el mismo
 * archivo de texto plano con extensión .txt del ejercicio anterior
 * 
 * En el programa principal se debe obtener un valor devuelto por el método que sirva para
 * indicar si se ha insertado correctamente o no se ha podido.
 * 
 * APF - 10-01-2024
 * 
 */

public class Fichero{
	
	public static ArrayList<String> leerFichero(String ruta){
		
		ArrayList<String> lineas = new ArrayList<String>();
		
		try {
			
			File archivo =new File(ruta);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String linea = lector.nextLine();
				lineas.add(linea);
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR");
			e.printStackTrace();
			
		}
		
		return lineas;
		
	}
	
	public static boolean escribirFichero(String texto, String ruta){
		
		try {
			
			FileWriter escritor = new FileWriter(ruta,true);
				
				escritor.write(texto+"\n");
				escritor.close();
				return true;
		
		}catch(Exception e) {
			
			System.out.println("ERROR");
			e.printStackTrace();
			return false;
		}
	
		
	}
	
}