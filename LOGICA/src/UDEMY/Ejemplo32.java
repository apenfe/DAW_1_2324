/*
 * Dado un array de numeros, devolver el array 
 * con sus numeros elevados al cuadrado.
 */

package UDEMY;
//import java.util.Scanner;

public class Ejemplo32{
	
	//public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6};
		
		System.out.println("Los numeros al cuadrado son: ");
		
		int[] array2 = cuadrado(array);
		
		for(int i=0; i<array2.length;i++) {
			System.out.print(array2[i]+", ");
		}
		
	}
	
	public static int[] cuadrado(int[] array) {
		
		int[] cuadrados = new int[array.length];
		
		for(int i=0; i<array.length;i++) {
			cuadrados[i]=(int)Math.pow(array[i],2);
		}
		
		return cuadrados;
				
	}
	
}