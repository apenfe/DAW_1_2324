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

import java.util.Scanner;

/**
 * Clase Input utilizada para recibir datos por entrada de teclado.
 * 
 * Compuesta por varios métodos públicos y estatáticos.
 * 
 * @author dmunuera
 * @version 1.0.0
 * 
 */

public class Input {
	
	/* CONSTANTES */
	
	private static Scanner keyboard = new Scanner(System.in);
	private static final String INT_ERROR = Config.RED+"\n\n\t❗ El valor introducido no es un numero ❗"+Config.RESET;
	private static final String CONTINUE = "\nPulse 'enter' para continuar...";
	private static final String GENERIC_ERROR = Config.RED+"Algo ocurrió."+Config.RESET;
	
	/* MÉTODO PARA OBTENER UN NUMERO ENTERO, NO ACEPTA NINGUN PARAMETRO */
	
	/**
	 * Método estático que permite recibir un entero introducido por el usuario.
	 * 
	 *  @return int Entero introducido por el usuario.
	 */
	
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
	
	/**
	 * Método estático que permite recibir un entero introducido por el usuario y se le muestra un enunciado.
	 * 
	 * @param text Enunciado
	 * @return int Entero introducido por el usuario.
	 */
	
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
	
	/**
	 * Método estático que permite recibir un entero introducido por el usuario y se le muestra un enunciado.
	 * Además puede especificarse que se insista o no en caso de excepción.
	 * 
	 * @param text Enunciado
	 * @param repeat True para no insistir y false para insistir.
	 *  @return int Entero introducido por el usuario.
	 */

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
	
	/**
	 * Método estático que permite recibir un texto introducido por el usuario.
	 * 
	 *  @return String Texto introducido por el usuario.
	 */
	
	public static String getString() {
		
		String value = keyboard.nextLine().trim();
		return value;
		
	}

	/* MÉTODO PARA OBTENER UN STRING, CON ENUNCIADO */
	
	/**
	 * Método estático que permite recibir un texto introducido por el usuario y se le muestra un enunciado.
	 * 
	 * @param text Enunciado
	 *  @return String Texto introducido por el usuario.
	 */
	
	public static String getString(String text) {
		
		System.out.print(text);
		return keyboard.nextLine().trim();
		
	}

	/* MÉTODO QUE PIDE PULSAR ENTER PARA CONTINUAR */
	
	/**
	 * Método estático que permite parar la ejecución del programa hasta que el usuario pulse enter
	 */
	
	public static void toContinue() {
		
		System.out.print(CONTINUE);
		
		try {
			keyboard.nextLine();
		} catch (Exception e) {
			System.out.println(GENERIC_ERROR);
		}
		
	}
}

