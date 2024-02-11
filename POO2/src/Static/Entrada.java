package Static;
import java.util.Scanner;

/*
 * cuando crear atributos estaticos de una clase? cuando sean valores fijos que no van a acambiar y sirvan para acceder en cualquier parte del programa
 * ademas el atributo estatico no representara el estado de un objeto.
 * cuando crear metodos estaticos de una clase? cuando sean metodos que reciben o no paramentros, los cuales procesara
 * para devolver un resultado y nunca cambiara el valor de un atributo de esa clase.
 * tambien puede ser que accede a atributos de la clase solamente para leer su valor,
 * Ya que deberia ser un valor constante.
 */

public class Entrada{  // ctrl + mayus + f
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static int pedirEntero() {
		
		System.out.print("Introduzca un entero: ");
		int num =-1;
		
		try {
			num = Integer.parseInt(teclado.nextLine().trim());
		}catch(Exception e) {
			System.out.println("Error no es un número.");
		}
		
		return num;
	}
	
	public static int pedirEntero(String enunciado) {
		
		int num =-1;
		
		System.out.println(enunciado);

		try {
			num = Integer.parseInt(teclado.nextLine().trim());
		}catch(Exception e) {
			System.out.println("Error no es un número.");
		}
		
		return num;
	}
		
	public static int pedirEntero(String enunciado, boolean repetir) {
		
		int num =-1;
		boolean correcto = false;
		System.out.println(enunciado);
		
		while(!correcto) {

			try {
				num = Integer.parseInt(teclado.nextLine().trim());
				correcto = true;
			}catch(Exception e) {
				System.out.println("Error no es un número.");
				if(!repetir) { // si repetrir es false da el valor por defecto en caso de fallo y no se repite
					return num;
				}
			}
		
		}
		
		return num;
		
		
	}
	
	public static String pedirTexto() {
		
		System.out.print("Introduzca un texto: ");
		
		return teclado.nextLine().trim();
	}
	
	public static String pedirTexto(String enunciado) {
		
		System.out.print(enunciado);
		
		return teclado.nextLine().trim();
	}

	
}