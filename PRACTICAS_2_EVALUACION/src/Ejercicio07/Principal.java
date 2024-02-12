package Ejercicio07; //okkkk

import java.util.ArrayList;

import Ejercicio03.Entrada;

/* 
 * Principal.java
 * 
 * Define la clase Punto representada por sus coordenadas x e y (números reales).
 * La clase deben disponer de un constructor genérico que recibe las dos coordenadas.
 * Crea un método llamado cuadrante() que devuelva el nombre del cuadrante en el que se encuentra el punto.
 * Crea un método llamado distancia() que calcule su distancia al origen de coordenadas y la muestre por la salida estándar.
 * 
 * Crea varios de varios puntos en main() de clase Principal.
 * Muestra por pantalla sus coordenadas.
 * Muestra por pantalla los cuadrantes en los que se encuentra cada punto.
 * Muestra por pantalla la distancia al origen de coordenadas.
 * Modificar alguna de sus coordenadas accediendo directamente al atributo correspondiente
 * y volver a comprobar su cuadrante y la distancia.
 * 
 * APF - 10-01-2024
 * 
 */

public class Principal{
	
	public static void main(String[] args) {
		
		int puntos = Entrada.pedirEntero("¿Cuantos puntos desea crear? ");
		ArrayList<Punto> coordenadas = new ArrayList<Punto>();
		
		for (int i = 0; i < puntos; i++) {
			
			double x = Entrada.pedirDouble("\n¿Coordenada x del "+(i+1)+"º punto? ",true);
			double y = Entrada.pedirDouble("¿Coordenada y del "+(i+1)+"º punto? ",true);	
			
			Punto actual = new Punto(x,y);
			coordenadas.add(actual);

		}
		
		for (int i = 0; i < puntos; i++) {
			
			System.out.println("-------------------------------------------------------------------");
			System.out.println("Las coordenadas del punto nº "+(i+1)+" son: "+coordenadas.get(i).getPunto());
			System.out.println("\nEl punto nº "+(i+1)+" esta en: "+coordenadas.get(i).cuadrante());
			System.out.println("\nEl punto nº "+(i+1)+" esta a esta distancia del origen: "+coordenadas.get(i).distancia());
			System.out.println("-------------------------------------------------------------------");
			System.out.println();

		}
		
		do {
			
			int punto = Entrada.pedirEntero("¿Que punto desea cambiar? ",true);
			
			if(punto>=1&&punto<=coordenadas.size()) {
				
				double x = Entrada.pedirDouble("\n¿Coordenada x del "+(punto)+"º punto? ",true);
				double y = Entrada.pedirDouble("¿Coordenada y del "+(punto)+"º punto? ",true);	
				coordenadas.get(punto-1).changePunto(x, y);
				break;

			}else {
				System.out.println("\nEse punto no existe.\n");
			}
			
		}while(true);
		
		for (int i = 0; i < puntos; i++) {
			
			System.out.println("-------------------------------------------------------------------");
			System.out.println("Las coordenadas del punto nº "+(i+1)+" son: "+coordenadas.get(i).getPunto());
			System.out.println("\nEl punto nº "+(i+1)+" esta en: "+coordenadas.get(i).cuadrante());
			System.out.println("\nEl punto nº "+(i+1)+" esta a esta distancia del origen: "+coordenadas.get(i).distancia());
			System.out.println("-------------------------------------------------------------------");
			System.out.println();

		}
		
	}
}