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
					dificultad = teclado.nextLine().trim().toLowerCase();
					
					if(dificultad.equals("facil")||dificultad.equals("normal")||dificultad.equals("dificil")) {
						currentGame = new Ahorcado(nick,dificultad);
						break;
					}else {
						
						System.out.println("Seleccione una opcion valida.");
			
					}
					
				}while(true);
				
				currentGame.play();
				
			}else if(opcion == 2) {
				
				currentGame.ranking();
				
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
		
}