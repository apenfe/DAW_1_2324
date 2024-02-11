package Static;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero{
	
	public static boolean Escribir(String texto, String ruta) {
		
		try {
			
			FileWriter escritor = new FileWriter(ruta,true);
			
			escritor.write("\n"+texto);
			escritor.close();
			
			return true;
			
		}catch(Exception e) {
			
			System.out.println("ERROR EN LA LECTURA DEL FICHERO.");
			e.printStackTrace();
			return false;
			
		}
		
	}
	
	public static ArrayList<String> Leer(String ruta) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		try {
			
			File archivo = new File(ruta);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String data=lector.nextLine();
				lista.add(data);
				
			}
		
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR EN LA LECTURA DEL FICHERO.");
			e.getStackTrace();
			
		}
		
		return lista; 
		
	}

}