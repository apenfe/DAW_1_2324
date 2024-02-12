package Simulacro03;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Simulacro 3 Juego ahorcado
 * 
 * Consiste en crear un juego del ahorcado en el que se acceda a un fichero de texto (palabras.txt) 
 * con palabras y el programa seleccione una de ellas aleatoriamente para mostrar por pantalla tantos 
 * caracteres "_" como carateres tenga la palabra. El programa irá pidiendo al usuario que introduzca 
 * caracteres de forma individual para intentar adivinar la palabra. Si acumula 5 intentos fallidos, 
 * el usuario perderá la partida.
 * 
 * Al comprobar si la letra está en la palabra, deberá ignorar mayúsculas y minúsculas.
 * 
 * Adicionales: En cada intento de resolver, que muestre un muñequito formado por caracteres mostrando la cabeza y extremidades 
 * del muñeco dependiendo de la cantidad de fallos cometidos.´
 * 
 */

public class Principal{
	
	public static Scanner teclado = new Scanner(System.in);
	public static Ahorcado currentGame = new Ahorcado();
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("--- MENU ---");
			System.out.println("1 - NUEVO JUEGO");
			System.out.println("2 - VER RANKING");
			System.out.println("0 - FINALIZAR");
			
			int opcion = pedirInt("Seleccione una opcion: ");
			
			if(opcion==1) {
				
				System.out.print("Introduzca un nombre de usuario: ");
				String nick = teclado.nextLine().trim();
				String dificultad="";
				
				do {
					
					System.out.print("Selecciona dificultad (facil, normal y dificil): ");
					dificultad = teclado.nextLine().trim();
					
					if(!dificultad.equalsIgnoreCase("facil")||!dificultad.equalsIgnoreCase("normal")||!dificultad.equalsIgnoreCase("dificil")) {
						System.out.println("Seleccione una opcion valida.");
					}else {
						break;
					}
					
				}while(true);
				
				currentGame = new Ahorcado(nick,dificultad);
				
				do {
					
					currentGame.play();
					
				}while(true);
				
				/*
 * El programa mostrará los "huecos" de cada letra y pedirá al usuario que introduzca una letra, mostrando 
 * además, los intentos disponibles (5 al inicio). Después de que el usuario introduzca una letra, actualizará 
 * los huecos revelando las letras si ha acertado. El programa podrá considerar que el usuario ha ganado si:
 * 
 * Acierta todas las letras y queda completamente descubierta
 * O después de cada intento, se le pregunta al usuario si quiere intentar acertar la palabra completa, pidiendo 
 * al usuario que introduzca la palabra completa. Esta opción gastará un intento.
 * Una vez finalizada la partida, el programa deberán guardar en un fichero ranking.txt el resultado de la partida, 
 * guardando en cada línea nombre de usuario, la palabra, la dificultad, intentos fallidos y la fecha.
				 */
				
			}else if(opcion == 2) {
				
				ranking();
				
			}else if(opcion == 0) {
				
				System.out.println("Saliendo del programa...");
				break;
				
			}else {
				
				System.out.println("Selecciona una opcion entre 0 y 2.");
				
			}	
			
		}while(true);
		
	}	
	
	public static int pedirInt(String enunciado) {
		
		System.out.print(enunciado);
		
		do {
			
			try {
				
				int num = Integer.parseInt(teclado.nextLine().trim());
				return num;
				
			} catch (Exception e) {
				
				System.err.println("ERROR - Introduce un entero: ");
				
			}
			
		} while (true);
		
	}
	
	public static void ranking() {
		
		ArrayList<Ranking> jugadas = new ArrayList<Ranking>();
		
		try {
			
			File archivo = new File(".\\src\\Simulacro03\\ranking.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("#");
				jugadas.add(new Ranking(linea));
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.out.println("Error al leer fichero.");
			
		}
		
		Ranking[] ranking = new Ranking[jugadas.size()];
		
		for (int i = 0; i < ranking.length; i++) {

			ranking[i] = jugadas.get(i);

		}

		for (int i = 0; i < ranking.length; i++) {

			for (int j = 0; j < ranking.length-i; j++) {
				
				if() {
					
				}

			}
			
		}
		
		/*
		 *  los mostrará, ordenando primero por los más difíciles 
		 * a los más fáciles, y dentro de cada dificultad ordenando por menor cantidad de intentos fallidos, y dentro la cantidad 
		 * de fallos, ordenados por fecha de más antiguo a más reciente.
		 */
		
				
	}
		
}