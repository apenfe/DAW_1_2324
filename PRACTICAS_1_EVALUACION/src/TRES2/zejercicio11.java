package TRES2;

import java.util.Scanner;

/* REVISAR
 * Ejercicio11.java
 * 	
 * Escribe un método que se llame contarIntConsecutivos() que recibe un vector de enteros. Devuelve cuantos
 * valores -entre sus elementos- están ordenados. Si  todos los elementos son diferentes devuelve 0.
 * Por ejemplo: {3, 5, 3, 4, 5, 5, 4} devolvería 3.
 * Prueba el método pedido desde main().
 * Recorriendo los datos de izquierda a derecha, empezando por el segundo elemento hay que comprobar si es 
 * secuencia del anterior. Se puede utilizar un contador iniciado en 1 que se incrementa al comprobarse que un
 * elemento es consecutivo -en orden- con el anterior. Cada vez que se inicia nueva secuencia hay que guardar 
 * el  valor del contador en una variable auxiliar con el máximo alcanzado.
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/01/2024
 *
 */

public class zejercicio11{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] num = {3, 5, 3, 4, 5, 5, 4};
				
		System.out.print("El numero de enteros consecutivos es: ");
		System.out.println(contarIntConsecutivos(num));
		
	}
	
	public static int contarIntConsecutivos(int[] numeros) {
		
		int consecutivos=1, max=0;
		
		for(int i=1; i<numeros.length;i++) {
			
			if(numeros[i-1]==numeros[i]-1) {
				consecutivos++;
			}else {
				
				if(consecutivos==1) {
					continue;
				}else {
					
					if(consecutivos>max) {
						max=consecutivos;
						consecutivos=1;
					}
				}
			}	
		}
		
		return max;
		
	}
	
}