package zEjercicio10;

import java.util.ArrayList;

import Ejercicio09.Entrada;

/* 
 * Fichero.java
 * 
 * Partiendo de la clase Fichero de ejercicio anterior hacer un método estático y público
 * que reciba por parámetro una cadena de texto y la añada en una nueva línea en el mismo
 * archivo de texto plano con extensión .txt del ejercicio anterior
 * 
 * En el programa principal se debe obtener un valor devuelto por el método que sirva para
 * indicar si se ha insertado correctamente o no se ha podido.
 * 
 * APF - 10-01-2024
 * 
 */

public class Principal{
	
	public static final String RUTA =".\\src\\zEjercicio10\\";
	public static final String ARCHIVO ="palabras.txt";
	
	public static void main(String[] args) {
		
		String linea = Entrada.pedirTexto("Inserte nueva linea: ");
		
		if(Fichero.escribirFichero(linea, RUTA+ARCHIVO)) {
			System.out.println("AÑADIDA CORRECTAMENTE");
		}else {
			System.out.println("ERROR");
		}
		
		ArrayList<String> lineas=Fichero.leerFichero(RUTA+ARCHIVO);
		
		for (String string : lineas) {
			System.out.println(string);
		}
	}

}