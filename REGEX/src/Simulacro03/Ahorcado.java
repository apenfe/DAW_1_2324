package Simulacro03;

import java.io.File;
import java.util.ArrayList;
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

public class Ahorcado{
	
	private Scanner teclado = new Scanner(System.in);
	private String usuario;
	private String dificultad;
	private Palabra[] palabras = new Palabra[0];
	private Palabra palabra;
	
	public Ahorcado() {
		
	}
	
	public Ahorcado(String usuario, String dificultad) {
		
		this.usuario=usuario;
		this.dificultad=dificultad;
		
		leerPalabras(dificultad);
		System.out.println("Palabras leidas");
		
		this.palabra= palabraRandom();
		System.out.println("Palabra aleatoria ok");
		
	}
	
	public void play() {
		
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
		
		System.out.println("La palabra a adivinar es: ");
		int intentos = 5;
		
		do {
	
			for (int i = 0; i < palabra.getWord().length(); i++) {
				
				System.out.print(palabra.getLetras()[i]+" ");
				
			}
			
			System.out.println();
			System.out.println("Intentos: "+intentos);
			System.out.print("Inserte una letra: ");
			String letra = teclado.nextLine().trim().toLowerCase();
			
			for (int i = 0; i < palabra.getWord().length(); i++) {
				
				if((""+palabra.getWord().charAt(i)).equals(letra) && palabra.getLetras()[i]=='_') {
					//palabra.setLetras()[i]='_';
					//intentos++;
				}
				
			}
			
			intentos--;
			
		}while(true);
		
	}
	
	private Palabra palabraRandom() {
		
		do {
			
			float inicial = System.currentTimeMillis();
			int indice =(int)(inicial-(inicial-1));
			
			for (int i = 0; i < palabras.length; i++) {
				
				if(i==indice) {
					
					return palabras[i];
					
				}
				
			}
			
			return palabras[0];
			
		}while(true);
		
	}
	
	private void leerPalabras(String dificultad) {
		
		ArrayList<Palabra> entradas = new ArrayList<Palabra>();
		
		try {
			
			File archivo = new File(".\\src\\Simulacro03\\palabras.txt");
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String[] linea = lector.nextLine().split("#");
				
				if(linea[1].equalsIgnoreCase(dificultad)) {
					
					entradas.add(new Palabra(linea[0],linea[1]));
					
				}
				
			}
			
			lector.close();
			
		} catch (Exception e) {
			
			System.err.println("ERROR AL LEER ARCHIVO.");
			
		}
		
		palabras = new Palabra[entradas.size()];
		
		for (int i = 0; i < palabras.length; i++) {
			palabras[i]=entradas.get(i);
		}
		
	}
	
	public void ranking() {
		
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
				
				

			}
			
		}
		
		/*
		 *  los mostrará, ordenando primero por los más difíciles 
		 * a los más fáciles, y dentro de cada dificultad ordenando por menor cantidad de intentos fallidos, y dentro la cantidad 
		 * de fallos, ordenados por fecha de más antiguo a más reciente.
		 */
		
				
	}
		
}