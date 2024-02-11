package Simulacro02repaso2;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero{
	
	public static final String RUTA= ".\\files\\coordenadas.txt";

	public static Coordenada[] leer() {
		
		ArrayList<Coordenada> coordenadas = new ArrayList<Coordenada>();
		Coordenada[] puntos = new Coordenada[0];
		
		try {
			
			File archivo = new File(RUTA);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				String[] linea = lector.nextLine().split(",");
				double x= Double.parseDouble(linea[0]);
				double y= Double.parseDouble(linea[1]);
				
				coordenadas.add(new Coordenada(x,y));
			}
			
			puntos = new Coordenada[coordenadas.size()];
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("Error.");
			e.printStackTrace();
			
		}
		
		for(int i=0; i<puntos.length; i++) {
			puntos[i]=coordenadas.get(i);
		}
		
		return puntos;
		
	}
	
	public static boolean escribir(Coordenada a) {
		
		try {
			
			FileWriter escritor = new FileWriter(RUTA,true);
			
			escritor.write(a.getX()+","+a.getY()+"\n");
			
			escritor.close();
			return true;
			
		}catch(Exception e) {
			
			System.out.println("Error.");
			e.printStackTrace();
			return false;
			
		}
		
	}
	
	
	
	
}