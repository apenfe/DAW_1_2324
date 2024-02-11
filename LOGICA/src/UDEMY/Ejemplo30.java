/*
 * Dado un array de enteros con numeros repetidos, devolver un array que solo tenga los ejemplares unicos
 */

package UDEMY;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo30{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] numeros = {1,2,3,2,2,1,4};
		
		ArrayList<Integer> array = unicos(numeros);
		
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
	
	public static ArrayList<Integer> unicos(int[] numeros) {
		
		boolean check = true;

		ArrayList<Integer> ejemplares = new ArrayList<Integer>();
		
		for(int i=0; i<numeros.length;i++) {
			for(int j=0; j<ejemplares.size();j++) {
				
				if(numeros[i]==ejemplares.get(j)) {
					check=false;
				}
				
			}
			
			if(check) {
				ejemplares.add(numeros[i]);
			}else {
				check=true;
			}
		}
		
		return ejemplares;
		
	}
}