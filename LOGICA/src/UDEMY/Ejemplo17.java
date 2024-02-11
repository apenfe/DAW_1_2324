/*
 * Dado un numero, mostrar los numeros de 1 hasta el número.
 * 
 * Pero para los multiplos de 3 imprimir buzz
 * 
 * y para los numeros multiplos de 5 lighyear
 * 
 * Para multiplos de los dos imprimir buzzlighyear
 * 
 */

package UDEMY;
import java.util.Scanner;

public class Ejemplo17{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] atgs) {
		
		System.out.print("Intriduzca un número: ");
		int num = teclado.nextInt();
		
		buzz(num);
	}
	
	public static void buzz(int num) {
		
		for (int i = 1; i <= num; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("Buzzlightyear");
			}else if(i%3==0) {
				System.out.println("Buzz");
			}else if(i%5==0) {
				System.out.println("lightyear");
			}else {
				System.out.println(i);
			}
		}
	}
	
}


