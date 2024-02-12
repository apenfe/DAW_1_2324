package Ejercicio04;

import java.util.ArrayList;

import Ejercicio03.Entrada;

/* 
 * Principal.java
 * 
 * Una vez definida la clase Punto representada por sus coordenadas x e y (números reales).
 * 
 * Una vez definido un constructor genérico que reciba las dos coordenadas.
 * Define un método que se llame cuadrante() que devuelva el nombre del cuadrante en el
 * que se encuentra el punto. Debe controlar además si se encuentra entre dos cuadrantes
 * o sobre el centro del eje (0, 0)
 * 
 * Crea varios puntos en main() de clase Principal.
 * Muestra por pantalla las coordenadas de cada uno de los puntos.
 * Muestra por pantalla los cuadrantes en los que se encuentra cada punto.
 * Modifica alguno de los puntos accediendo directamente a los atributos correspondientes
 * y vuelve a comprobar su cuadrante.
 * 
 * Deben seguirse los principios y estilo del código limpio.
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
			
			System.out.println("\nLa coordenada x del punto nº "+(i+1)+" es: "+coordenadas.get(i).getX());
			System.out.println("La coordenada y del punto nº "+(i+1)+" es: "+coordenadas.get(i).getY());
			System.out.println("El cuadrante del punto nº "+(i+1)+" es: "+coordenadas.get(i).cuadrante());
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
			System.out.println("El cuadrante del punto nº "+(i+1)+" es: "+coordenadas.get(i).cuadrante());
			System.out.println();

		}
		
	}
}