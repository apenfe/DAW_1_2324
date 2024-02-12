package Ejercicio12;

import java.util.ArrayList;

/* 
 * Archivo.java
 * 
 * Partiendo de la clase Archivo de ejercicio anterior hacer un método estático y público
 * que reciba por parámetro un objeto de la clase Coche y la añada en una nueva línea en 
 * el mismo archivo de texto plano con extensión .txt del ejercicio anterior, con la información
 * del nuevo coche
 * 
 * En el programa principal se debe pedir los datos del nuevo coche y enviarlos al método de la
 * clase Archivo para obtener un valor devuelto por el método que sirva para indicar si se ha 
 * insertado correctamente o no se ha podido.
 * 
 * APF - 10-01-2024
 * 
 */

public class Principal{
	
	public static final String RUTA =".\\src\\Ejercicio12\\";
	public static final String ARCHIVO ="coches.txt";
	
	public static void main(String[] args) {
		
		System.out.println("Los coches en la base de datos son: \n");
			
		ArrayList<Coche> coches = Archivo.leerArchivo(RUTA+ARCHIVO);
		
		int i=1;
		
		for (Coche coche : coches) {
			
			System.out.println(i+" ---> "+coche.info());
			i++;
		}
		
		System.out.println("\nCrear nuevo vehiculo: ");
		String marca = Entrada.pedirTexto("\tMarca: ");
		String modelo = Entrada.pedirTexto("\tModelo: ");
		String color = Entrada.pedirTexto("\tColor: ");
		String combustible = Entrada.pedirTexto("\tCombustible: ");
		String kilometraje = Entrada.pedirTexto("\tKilometraje: ");
		
		Coche nuevo = new Coche(marca,modelo,color,combustible,kilometraje);
		coches.add(nuevo);
		
		if(Archivo.escribirArchivo(nuevo, RUTA+ARCHIVO)) {
			
			System.out.println("AÑADIDO CORRECTAMENTE.");
			
			i=1;
			
			for (Coche coche : coches) {
				
				System.out.println(i+" ---> "+coche.info());
				i++;
			}
			
		}else{
			
			System.out.println("ERROR.");

		}

		
	}

}