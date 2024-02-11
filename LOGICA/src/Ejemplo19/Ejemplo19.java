/*
 * Dado un array de objetos de peliculas (titulo, director, vista) mostrar
 * todas las peliculas indicando cual has visto y cual no.
 * 
 * Ejmeplo:
 * 
 * misPeliculas(peliculas);
 * 
 * Ya has visto: "El señor de los anillos de Peter Jackson"
 * Te falta por ver: "La liga de la justicia de Zack Synder"
 * 
 */

package Ejemplo19;
import java.util.Scanner;

public class Ejemplo19{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Cuantas peliculas desea crear: ");
		int cantidad = Integer.parseInt(teclado.nextLine());
		
		peliculas[] listado = new peliculas[cantidad];
		
		for (int i = 1; i <=cantidad; i++) {
			
			System.out.print("Cual es el TITULO de la pelicula nº"+i+": ");
			String titulo = teclado.nextLine();
			
			System.out.print("Cual es el DIRECTOR de la pelicula nº"+i+": ");
			String director = teclado.nextLine();
			
			System.out.print("La has visto? si = 1 --- no = 0: ");
			int visto = Integer.parseInt(teclado.nextLine());
			
			listado[i-1] = new peliculas(titulo,director,visto);
           
		}
		
		for (int i = 1; i <=cantidad; i++) {

			listado[i-1].info();
           
		}
	
	}
}













