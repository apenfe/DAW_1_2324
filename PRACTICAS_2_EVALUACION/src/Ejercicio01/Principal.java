package Ejercicio01;

import java.util.ArrayList;

/* 
 * Principal.java
 * 
 * Define la clase Punto representada por sus coordenadas x e y (números reales).
 * 
 * Prueba la creación de objetos de la clase instanciando un nuevo punto en la
 * clase Principal, que contiene el método main().
 * 
 * Asigna valores a las coordenadas de los puntos creados.
 * 
 * Muestra por pantalla las coordenadas de cada punto.
 * 
 * Modificar alguna de sus coordenadas accediendo directamente al atributo
 * correspondiente y vuelve a mostrar los puntos por pantalla.
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
			
			Punto actual = new Punto();
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