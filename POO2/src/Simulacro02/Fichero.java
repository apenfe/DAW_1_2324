package Simulacro02;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero{
	
	public static Coordenada[] leer(String ruta) {
		
		ArrayList<Coordenada> coordenadas = new ArrayList<Coordenada>();
		Coordenada[] salida = new Coordenada[0];
		
		try {
			
			File archivo = new File(ruta);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split(",");
				double x = Double.parseDouble(linea[0]);
				double y = Double.parseDouble(linea[1]);
				
				coordenadas.add(new Coordenada(x,y));
				
			}
			
			lector.close();
			
			salida = new Coordenada[coordenadas.size()];
			
			for(int i=0; i<coordenadas.size();i++) {
				salida[i]=coordenadas.get(i);
			}
			
		}catch(Exception e) {
			
			System.out.println("ERROR");
		}
		
		return salida;
	}
		
}