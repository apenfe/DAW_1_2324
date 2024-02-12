package zEjercicio08;

/* 
 * Principal.java
 * 
 * Define la clase Punto representada por sus coordenadas x e y (números reales).
 * La clase deben disponer de un constructor genérico que recibe las dos coordenadas.
 * Crea un método llamado cuadrante() que devuelva el nombre del cuadrante en el que se encuentra el punto.
 * Crea un método llamado distancia() que calcule su distancia al origen de coordenadas y la muestre por la salida estándar.
 * Crea un método llamado moverA1() que modifique el estado del punto, trasladándolo al primer cuadrante sin que varíe su 
 * distancia al origen de coordenadas (0,0) (si el punto ya está en el primer cuadrante su estado no cambia).
 * 
 * Crea varios puntos en main() de la clase Principal. Muestra por pantalla sus coordenadas.
 * Muestra por pantalla los cuadrantes en los que se encuentra cada punto.
 * Muestra por pantalla la distancia al origen de coordenadas.
 * Mover alguno de los puntos al primer cuadrante y volver a comprobar su cuadrante y la distancia.
 * Crea un objeto de la clase Punto, situalo en las coordenadas (-2,1), muestra su distancia al origen, lo traslada al primer
 * cuadrante, muestra sus nuevas coordenadas y finalmente muestra de nuevo su distancia al origen.
 * Prueba además con los puntos (-10,-2.5), (5.2,-1) y (-1550.025, -4E-2).
 * 
 * APF - 10-01-2024
 * 
 */

public class Principal{
	
	public static void main(String[] args) {
		
		Punto punto = new Punto(1,1);
		
		System.out.println(punto.cuadrante());
		System.out.println(punto.distancia());
		punto.moverA1();
		System.out.println(punto.distancia());
		

		
	}
}