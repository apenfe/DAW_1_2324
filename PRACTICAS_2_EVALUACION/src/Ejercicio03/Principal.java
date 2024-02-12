package Ejercicio03;

import java.util.ArrayList;

/* 
 * Principal.java
 * 
 * Una vez definida la clase Punto representada por sus coordenadas x e y (números reales).
 * 
 * Define un constructor genérico que reciba las dos coordenadas.
 * Crea varios puntos en el método main() de la clase Principal.
 * Muestra por pantalla las coordenadas de cada uno de los puntos.
 * Modifica alguna de sus coordenadas accediendo directamente al 
 * atributo correspondiente y vuelve a mostrar los puntos.
 * 
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * APF - 10-01-2024
 * 
 */

public class Principal{
	
	public static void main(String[] args) {
		
		int puntos = Entrada.pedirEntero("¿Cuantos puntos desea crear? ",true);
		System.out.println();
		
		ArrayList<Punto> coordenadas = new ArrayList<Punto>();
		
		for (int i = 0; i < puntos; i++) {
			
			double x = Entrada.pedirDouble("¿Coordenada x del "+(i+1)+"º punto? ",true);
			double y = Entrada.pedirDouble("¿Coordenada y del "+(i+1)+"º punto? ",true);	
			
			Punto actual = new Punto(x,y);
			coordenadas.add(actual);
			System.out.println();
		}
		
		for (int i = 0; i < puntos; i++) {
			
			System.out.println("La coordenada x del punto nº "+(i+1)+" es: "+coordenadas.get(i).getX());
			System.out.println("La coordenada y del punto nº "+(i+1)+" es: "+coordenadas.get(i).getY());
			System.out.println();

		}
		
		do {
			
			int punto = Entrada.pedirEntero("¿Que punto desea cambiar? ",true);
			
			if(punto>=1&&punto<=coordenadas.size()) {
				
				double x = Entrada.pedirDouble("\n¿Coordenada x del "+(punto)+"º punto? ",true);
				double y = Entrada.pedirDouble("¿Coordenada y del "+(punto)+"º punto? ",true);	
				coordenadas.get(punto-1).setX(x);
				coordenadas.get(punto-1).setY(y);
				break;

			}else {
				System.out.println("\nEse punto no existe.\n");
			}
			
		}while(true);
		
		for (int i = 0; i < puntos; i++) {
			
			System.out.println("\nLa coordenada x del punto nº "+(i+1)+" es: "+coordenadas.get(i).getX());
			System.out.println("La coordenada y del punto nº "+(i+1)+" es: "+coordenadas.get(i).getY());
			System.out.println();

		}
		
	}
}