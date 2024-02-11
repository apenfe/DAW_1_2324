/*
 * Dado un array de numeros, devolver el valor mas alto y el mas bajo
 */

package UDEMY;

public class Ejemplo40{
	
	public static void main (String[] args) {
		
		int[] numeros = {2,3,6,7,10,-2};
		
		System.out.println("El valor más bajo es: "+bajo(numeros));
		System.out.println("El valor más alto es: "+alto(numeros));
		
	}
	
	public static int alto(int[] numeros){
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i]>max) {
				max=numeros[i];
			}
		}
		
		return max;
	}
	
	public static int bajo(int[] numeros){
			
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i]<min) {
				min=numeros[i];
			}
		}
		
		return min;
		
	}
	
}