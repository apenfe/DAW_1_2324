package Ejercicio10;

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
	
	public static final String RUTA =".\\src\\Ejercicio10\\";
	public static final String ARCHIVO ="palabras.txt";
	
	public static void main(String[] args) {
		
		String lineas = Entrada.pedirTexto("¿Que texto desea escibir en el archivo .txt? ");
			
		if(Fichero.escribirFichero(lineas, RUTA+ARCHIVO)) {
			System.out.println("\nEl texto se ha escrito sin fallo.");
		}else {
			System.out.println("\nEl texto NO se ha podido escribir.");
		}
		
	}

}