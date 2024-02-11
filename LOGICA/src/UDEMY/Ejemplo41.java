/*
 * Hacer un triangulo de asteriscos
 * 
 * 12*
 * 1***
 * *****
 * *******
 */

package UDEMY;

public class Ejemplo41{
	
	public static void main (String[] args) {
		
		int num = 4;
		
		System.out.println(triangulo(num));
		
	}
	
	public static String triangulo(int num){
		
		String triangle = "";
		
		for(int i=1; i<=num;i++) {
			
			for(int j=0;j<num-i;j++) {
				
				triangle+=" ";
				
			}
			
			for(int j=0;j<i+(i-1);j++) {
				
				triangle+="*";
				
			}
			
			triangle+="\n";
		}
		
		return triangle;
	}
	
}