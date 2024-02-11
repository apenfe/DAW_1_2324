/*
 * Dado un array de string, devolver otro con los string compuestos por mas de dos palabras
 */

package UDEMY;

import java.util.ArrayList;

public class Ejemplo44{
	
	public static void main (String[] args) {
		
		String[] palabras = {"palabra", "palabra compuesta","palabars","otra compuesta"};
		
		ArrayList<String> palabrascompuestas = new ArrayList<String>();
		palabrascompuestas=compuestas(palabras);
		
		for (int i = 0; i < palabrascompuestas.size(); i++) {
			System.out.println(palabrascompuestas.get(i)+", ");
		}
		
	}
	
	public static ArrayList<String> compuestas(String[] palabras){
		
		ArrayList<String> palabrascomp = new ArrayList<String>();
		
		for (int i = 0; i < palabras.length; i++) {
			for(int j=0; j<palabras[i].length();j++) {
				
				if(palabras[i].charAt(j)==' ') {
					
					palabrascomp.add(palabras[i]);
					break;
					
				}
			}
		}
		
		return palabrascomp;
		
	}
	
}