/*
 * Dados dos numeros, sacar la media de ellos
 */

package UDEMY;

public class Ejemplo43{
	
	public static void main (String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(media(num));
		
	}
	
	public static int media(int[] num){
		
		int suma=0;
		
		for (int i = 0; i < num.length; i++) {
			suma+=num[i];
		}
		
		suma= suma/num.length;
		
		return suma;
	}
	
}