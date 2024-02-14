package Simulacro03;

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
 * El programa debe cumplir con las siguientes consideraciones:
 * 
 * Mostrará un menú con varias opciones:
 * 1- Nuevo juego
 * 2- Ver ranking
 * 0- Finalizar
 * 
 * Cuando se pulse la opción 1, pedirá introducir un nombre de usuario. Después, el programa pedirá que 
 * el usuario elija una dificultad (fácil, normal, difícil). La dificultad "fácil" será para palabras de 
 * 5 caracteres o menos, la dificultad "normal" para palabras de entre 6 y 10 caracteres y la dificultad 
 * "difícil" para palabras de más de 10 caracteres.
 * 
 * Después, el programa seleccionará aleatoriamente (intenta no usar Math.random) una palabra en base a 
 * la dificultad seleccionada, obtenida de un fichero de palabras.
 * 
 * El programa mostrará los "huecos" de cada letra y pedirá al usuario que introduzca una letra, mostrando 
 * además, los intentos disponibles (5 al inicio). Después de que el usuario introduzca una letra, actualizará 
 * los huecos revelando las letras si ha acertado. El programa podrá considerar que el usuario ha ganado si:
 * 
 * Acierta todas las letras y queda completamente descubierta O después de cada intento, se le pregunta al usuario 
 * si quiere intentar acertar la palabra completa, pidiendo al usuario que introduzca la palabra completa. 
 * Esta opción gastará un intento.
 * 
 * Una vez finalizada la partida, el programa deberán guardar en un fichero ranking.txt el resultado de la partida, 
 * guardando en cada línea nombre de usuario, la palabra, la dificultad, intentos fallidos y la fecha.
 * 
 * Para la opción 2, el programa leerá el fichero ranking.txt y los mostrará, ordenando primero por los más difíciles 
 * a los más fáciles, y dentro de cada dificultad ordenando por menor cantidad de intentos fallidos, y dentro la 
 * cantidad de fallos, ordenados por fecha de más antiguo a más reciente.
 * 
 * Al comprobar si la letra está en la palabra, deberá ignorar mayúsculas y minúsculas.
 * 
 * Se deben crear las clases necesarias para instanciar objetos correspondientes a los datos que se van a almacenar durante 
 * la ejecución del programa: Partida, Palabra, Ranking, etc.
 * 
 * Adicionales: En cada intento de resolver, que muestre un muñequito formado por caracteres mostrando la cabeza y extremidades 
 * del muñeco dependiendo de la cantidad de fallos cometidos.
 * 
 */

public class Principal{
	
	public static Scanner teclado = new Scanner(System.in);
	public static Ahorcado currentGame = new Ahorcado();
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("\n--- MENU ---");
			System.out.println("1 - NUEVO JUEGO");
			System.out.println("2 - VER RANKING");
			System.out.println("0 - FINALIZAR");
			
			int opcion = pedirInt("Seleccione una opcion: ");
			
			if(opcion==1) {
				
				System.out.print("\nIntroduzca un nombre de usuario: ");
				String nick = teclado.nextLine().trim();
				String dificultad="";
				
				do {
					
					System.out.print("\nSelecciona dificultad (facil, normal y dificil): ");
					dificultad = teclado.nextLine().trim().toLowerCase();
					
					if(dificultad.equals("facil")||dificultad.equals("normal")||dificultad.equals("dificil")) {
						currentGame = new Ahorcado(nick,dificultad);
						break;
					}else {
						
						System.out.println("\nSeleccione una opcion valida.");
			
					}
					
				}while(true);
				
				currentGame.play();
				
			}else if(opcion == 2) {
				
				currentGame.ranking();
				
			}else if(opcion == 0) {
				
				System.out.println("\nSaliendo del programa...");
				break;
				
			}else {
				
				System.out.println("\nSelecciona una opcion entre 0 y 2.");
				
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
		
}