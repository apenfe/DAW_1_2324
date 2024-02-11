/*
Dado un texto y una busqueda, censurar todas las coincidencias
de la busqueda en el texto con [-CENSURADO-].abstract

Si texto o busqueda estan vacios mostrar:
"No puedes leer el texto y la busqueda" en el caso de que ambos
parametros no lleguen.

*/

package UDEMY;
import java.util.Scanner;

public class Ejemplo11{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("inserte un texto: "); //syso (atajo de teclado)
		String texto = teclado.nextLine().trim();
		
		System.out.print("inserte una palabra a censurar: "); //syso (atajo de teclado)
		String palabra = teclado.nextLine().trim();
		
		String[]textos = censurar(texto,palabra);
		
		for(int i=0; i<textos.length;i++) {
			System.out.print(textos[i]+" "); //syso (atajo de teclado)
		}
		
	}
	
	public static String[] censurar(String texto, String palabra) {
		
		String[] censura= new String[0];
		
		if(texto=="" && palabra=="") {
			
			String[] censur= new String[1];
			censur[0]= "no se han dado datos";
			return censur;
		}
		
		censura = texto.split(" ");
		
		for(int i=0; i<censura.length ;i++) {
			if(censura[i].equals(palabra)==true) {
				censura[i]="[-CENSURADO-]";
			}else {
				continue;
			}
		}
		
		return censura;
	}
	
}