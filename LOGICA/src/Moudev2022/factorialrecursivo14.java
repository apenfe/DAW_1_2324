package Moudev2022;

/*
 * Escribe una función que calcule y retorne el factorial de un número dado
 * de forma recursiva.
 */

public class factorialrecursivo14{
	
	public static void main(String[] args) {
		
		int num = 5;
		
		System.out.println("El factorial de "+num+" es: "+factorial(num));
		
	}
	
	public static int factorial(int num) {
		
		if(num==0) {
			return 1;
		}else {
			return num * factorial(num-1);
		}
		
	}

}