package TRES2;

import java.util.Scanner;

/* 
 * Ejercicio13.java
 * 	
 * Escribe un método que se llame masFrecuenteInt() que recibe un vector de enteros. Devuelve el valor del elemento
 * más frecuente, si hay coincidencia devolvería el primero de ellos.
 * Por ejemplo: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3} devolvería 4
 * Prueba el método pedido desde main().
 * Una forma sería recorrer el vector anidar un bucle que averigüe la frecuencia del valor de cada elemento,
 * utilizando un par de variables auxiliares para retener la frecuencia máxima y el valor asociado.
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/01/2024
 *
 */

public class zejercicio13{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] num = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
				
		System.out.println("El valor que más se repite es: "+masFrecuenteInt(num));
		
	}
	
	public static int masFrecuenteInt(int[] numeros) {
		
		int max =-1, cont=0, moda=0;
		
		for(int i=0; i<numeros.length; i++) {
			
			cont=0;
			
			for(int j=0; j<numeros.length; j++) {
				
				if(numeros[i]==numeros[j]) {
					cont++;
				}else {
					continue;
				}
				
			}
			
			if(cont>=max) {
				moda=numeros[i];
				max=cont;
			}
			
		}
		
		return moda;
		
	}
	
}