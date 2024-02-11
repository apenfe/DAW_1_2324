package UNO1;

/**
 * Saludos.java
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * ajp - 2018.09.19
 */

import java.util.Scanner;

public class Saludos {
	public static void main(String[] args) {
		/* teclado es un canal de entrada por teclado a través de un Scanner.
		   Necesita importar el paquete java.util
		 */
		Scanner teclado = new Scanner(System.in);   // En este programa no es usado.

		int numOrden;			// Variable numérica.
		String nombre = "";		// Variable de texto, se declara pero no se inicializa.

		// Configura y muestra mensajes de bienvenida.
		numOrden = 1 ;  // Se inicializa la variable.
		System.out.println("Hola,");
		System.out.print("Soy un modesto ");
		System.out.print("programa de ordenador...\n");
		System.out.println("Bienvenido al Curso.\t" + "Este es el saludo nº " + numOrden);  // \t crea un tabulado
		numOrden++; // se aumenta en una unidad el valor de la variable.
		System.out.println("Bienvenido a Java.\t" + "Este es el saludo nº " + numOrden);
		System.out.println("\nFin programa...");    // \n antes del texto, salta una linea antes de escribir
	}
}

 /**
  * SALIDA ESPERADA:
  *
  * Hola,
  * Soy un modesto programa de ordenador...
  * Bienvenido al curso.    Este es el saludo nº 1
  * Bienvenido a Java.      Este es el saludo nº 2
  *
  * Fin programa...
  *
  */
