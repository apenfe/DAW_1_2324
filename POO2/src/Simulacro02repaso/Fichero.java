package Simulacro02repaso;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero{
	
	private static final String RUTA = ".\\files\\coordenadas.txt";
	
	public static Coordenada[] leer() {
		
		ArrayList<Coordenada> coordenadas = new ArrayList<Coordenada>();
		
		
		try {
			
			File archivo = new File(RUTA);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split(",");
				double x = Double.parseDouble(linea[0]);
				double y = Double.parseDouble(linea[1]);
				
				coordenadas.add(new Coordenada(x,y));

			}
			
			lector.close();
			
		}catch(Exception e) {
			
			System.out.println("ERROR");
			e.printStackTrace();
		}
		
		Coordenada[] salida = new Coordenada[coordenadas.size()];
		
		for(int i=0; i<coordenadas.size();i++) {
			salida[i]=coordenadas.get(i);
		}
		
		return salida;
	}
	
	
	
	
}