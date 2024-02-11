/*
 * Dado un string ponerlo completo en mayusculas o minusculas dependiendo
 * de si si hay mas mayusculas inicialmente o no, si hay mas mayusculas,
 * se pone todo en mayusculas, en caso contrario en minusculas
 */

package UDEMY;

import java.util.Scanner;

public class Ejemplo26{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Inserte un numero para ver su serie de Fibonacci: ");
		int num = teclado.nextInt();
		
		fibonacci(num);
	}
	
	public static void fibonacci(int num) {
		
		int n1=1, n2=1;
		int suma =2;
		
		if(num==0) {
			System.out.println("1, ");
			
		}else if(num==1){
			System.out.println("1, 1, ");
		}else {
			
			System.out.print("1, 1,");
			for(int i=2; i<=num;i++) {
				System.out.print(suma+", ");
				n2=n1;
				n1=suma;
				suma=n1+n2;
			}
		}
		
		
	}
}