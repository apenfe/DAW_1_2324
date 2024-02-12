package Ejercicio12;

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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo{
	
	public static ArrayList<Coche> leerArchivo(String ruta){
		
		ArrayList<Coche> coches = new ArrayList<Coche>();
		
		try {
			
			File txt = new File(ruta);
			Scanner lector = new Scanner(txt);
	
			while (lector.hasNextLine()) {
				
				String[] data = lector.nextLine().split(",,");
				coches.add(new Coche(data));
				
			}
	
			lector.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Algo ha fallado en la lectura.");
			e.printStackTrace();
		}
		
		return coches;
	}
	
	public static boolean escribirArchivo(Coche coche, String ruta){
		
		try {
			
			FileWriter escritor = new FileWriter(ruta,true);
		     
		    escritor.write(coche.infoTxt()+"\n");
		    escritor.close();
		      
		} catch (IOException e) {
		      
		      e.printStackTrace();
		      return false;
		}
		
		return true;
		
	}

}