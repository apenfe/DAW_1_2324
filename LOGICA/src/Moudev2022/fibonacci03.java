package Moudev2022;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class fibonacci03{
	
	public static void main(String[] args) {
		
		int n1=1, n2=1, suma=0;
		
		System.out.println(1);
		System.out.println(1);
		
		for(int i=2; i<=50; i++) {
			suma=n1+n2;
			System.out.println(suma);
			n2=n1;
			n1=suma;
		}
	}

}