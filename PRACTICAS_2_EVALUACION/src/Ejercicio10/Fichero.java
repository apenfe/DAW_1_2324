package Ejercicio10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
			
			File txt = new File(ruta);
			Scanner lector = new Scanner(txt);
	
			while (lector.hasNextLine()) {
				
				String data = lector.nextLine();
				lineas.add(data);
				
			}
	
			lector.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Algo ha fallado en la lectura.");
			e.printStackTrace();
		}
		
		return lineas;
	}
	
	public static boolean escribirFichero(String texto, String ruta){
		
		try {
		      FileWriter escritor = new FileWriter(ruta,true);
		      
		      escritor.write(texto+"\n");
		      escritor.close();
		      
		} catch (IOException e) {
		      
			System.out.println("Algo ha fallado en la escritura.");
		    e.printStackTrace();
		    return false;
		}
		
		return true;
	}
	
}