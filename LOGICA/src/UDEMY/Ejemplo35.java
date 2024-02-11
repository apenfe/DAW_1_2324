/*
 * Dado un array de enteros, devolver el primer y ultimo elemento
 */

package UDEMY;

public class Ejemplo35{
	public static void main (String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.print("El primer y ultimo elemento del array son: ");
		int[] array2 = new int[2];
		array2=dos(array);
		
		for(int i=0;i<2;i++) {
			System.out.print(array2[i]+", ");
		}
		
	}
	
	public static int[] dos(int[] array){
		
		int[] devuelvo = new int[2];
		
		devuelvo[0]=array[0];
		devuelvo[1]=array[array.length-1];
		
		return devuelvo;
	}
	
}