package Simulacro02repaso3;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero{
	
	public static final String RUTA= ".\\files\\coordenadas.txt";
	
	public static Coordenada[] leer() {
		
		ArrayList<Coordenada> puntos = new ArrayList<Coordenada>();
		
		try {
			
			File archivo = new File(RUTA);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split(",");
				double x = Double.parseDouble(linea[0]);
				double y = Double.parseDouble(linea[1]);
				
				puntos.add(new Coordenada(x,y));
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}
		
		Coordenada[] salida = new Coordenada[puntos.size()];
		
		for (int i = 0; i < salida.length; i++) {
			salida[i]=puntos.get(i);
		}
		
		return salida;
		
	}
	
	public static boolean escribir(String linea) {
		
		try {
			
			FileWriter escritor = new FileWriter(RUTA,true);
			
			escritor.write("\n"+linea);
			escritor.close();
			
		}catch(Exception e) {
			System.out.println("ERROR");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	

	
		
	
	
	
}