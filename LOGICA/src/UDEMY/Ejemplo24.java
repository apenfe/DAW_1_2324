/*
 * Dado un array de enteros y un numero, detectar si ese array es la permutacion 
 * del numero dado, desde el 1 hasta este dado
 */

package UDEMY;

public class Ejemplo24{
	
	public static void main(String[] args) {
		
		int num=5;
		int[] permutacion= {1,2,4,5};
		
		if(permutacionComprobacion(permutacion,num)) {
			System.out.println("Estos numeros son la permutacion de "+num);
		}else {
			System.out.println("Estos numeros NO son la permutacion de "+num);
		}
	}
	
	public static boolean permutacionComprobacion(int[] permutacion, int num) {
		
		for(int i=1; i<=num;i++) {
			if(permutacion[i-1]!=i) {
				return false;
			}
		}

		return true;
	}
}