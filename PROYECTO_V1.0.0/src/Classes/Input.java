package Classes; /* SE PONE PARA INDICAR EN QUE CARPETA ESTÁ, SI ES EN LA CARPETA PRINCIPAL NO HACE FALTA */

/* 
 * Input.java
 * 
 * Clase pública que contiene varias constantes que son utilizadas por los metodos estaticos de esta.
 * 
 * Se usa para obtener datos introducidos por el usuario a traves de la consola.
 * Para ello hace uso de un objeto Scanner.
 * 
 * APF - 21-12-2023
 * VERSION: 0.1.0
 * 
 */

import java.util.Scanner; /* import Classes.Input; o import Classes.*; para todo lo de la carpeta */

public class Input {
	
	/* CONSTANTES */
	
	private static Scanner keyboard = new Scanner(System.in);
	private static final String INT_ERROR = Config.ROJO+"\n\n\t❗ El valor introducido no es un numero ❗"+Config.RESET;
	private static final String CONTINUE = "\nPulse 'enter' para continuar...";
	private static final String GENERIC_ERROR = Config.ROJO+"Algo ocurrió."+Config.RESET;
	
	/* MÉTODO PARA OBTENER UN NUMERO ENTERO, NO ACEPTA NINGUN PARAMETRO */
	
	public static int getInt() {
		
		int number = -1;
		
		try {
			number = Integer.parseInt(keyboard.nextLine().trim());
		} catch (Exception e) {
			System.out.println(INT_ERROR);
		}
		
		return number;
	}

	/* MÉTODO PARA OBTENER UN NUMERO ENTERO, USA UN STRING COMO ENUNCIADO */
	
	public static int getInt(String text) {
		
		int number = -1;
		System.out.print(text);
		
		try {
			number = Integer.parseInt(keyboard.nextLine().trim());
		} catch (Exception e) {
			System.out.println(INT_ERROR);
		}
		
		return number;
	}
	
	/* MÉTODO PARA OBTENER UN NUMERO ENTERO CON ENUNCIADO, RECIBE UN BOLEANO PARA REPETIR O NO HASTA QUE SEA VALIDO */

	public static int getInt(String text, boolean repeat) {
		
		int number = -1;
		boolean success = false;
		
		do {
			
			System.out.print(text);
			
			try {
				number = Integer.parseInt(keyboard.nextLine().trim());
				success = true;
			} catch (Exception e) {
				System.out.println(INT_ERROR);
				
				if(!repeat) { // SI ES FALSE DEVUELVE UN -1, SI ES TRUE SE REPITE
					return -1;
				}
				
			}
			
		} while(!success);
		
		return number;
	}

	/* MÉTODO PARA OBTENER UN STRING, SIN ENUNCIADO */
	
	public static String getString() {
		
		String value = keyboard.nextLine().trim();
		return value;
		
	}

	/* MÉTODO PARA OBTENER UN STRING, CON ENUNCIADO */
	
	public static String getString(String text) {
		
		System.out.print(text);
		return keyboard.nextLine().trim();
		
	}

	/* MÉTODO QUE PIDE PULSAR ENTER PARA CONTINUAR */
	
	public static void toContinue() {
		
		System.out.print(CONTINUE);
		
		try {
			keyboard.nextLine();
		} catch (Exception e) {
			System.out.println(GENERIC_ERROR);
		}
		
	}
}

