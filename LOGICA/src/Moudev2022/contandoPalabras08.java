package Moudev2022;

import java.util.ArrayList;
/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */

public class contandoPalabras08{
	
	public static void main(String[] args) {
		
		String texto ="Este texto, esta compuesto por y por por varias palabras diferentes y en el texto aparece alguna igual.";
		
		contarPalabras(texto);
		
	}
	
	public static void contarPalabras(String texto) {
		
		texto=texto.toLowerCase().trim();
		texto=texto.replaceAll("[^A-Za-záéíóúÁÉÍÓÚ\\s]", "");
		String[] palabras = texto.split(" ");
		ArrayList<String> vistas = new ArrayList<String>();
		
		int cont=0;
		
		este: for(int i=0; i<palabras.length; i++) {
			
			String palabra = palabras[i];
			cont=0;
			
			for(int j=0; j<vistas.size(); j++) {
				if(palabra.equals(vistas.get(j))) {
					continue este;
				}
			}
			
			for(int j=0; j<palabras.length; j++) {
				
				if(palabra.equals(palabras[j])) {
					cont++;
				}	
				
			}
			
			System.out.println(palabra+" listada "+cont+" veces.");
			cont=0;
			vistas.add(palabra);
			
		}
	}

}