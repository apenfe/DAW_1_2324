package TRES2;

import java.util.Scanner;

/* 
 * Ejercicio14.java
 * 	
 * Escribe un método que se llame buscarSecuenciaInt() que recibe dos vectores de enteros, el segundo es una
 * secuencia de valores a buscar en el primer vector. Devuelve el índice donde empieza la primera ocurrencia 
 * de la secuencia buscada.
 * Por ejemplo: {4, 3, 1, 4, 2, 5, 8} y {4, 2, 5} devolvería 3.
 * Prueba el método pedido desde main().
 * Hay que recorrer el vector secuencialmente comprobando coincidencia con el primer elemento de la secuencia
 * buscada. Después hay que comprobarla completamente con otro bucle. Si hay coincidencia completa termina sin
 * llegar al final del recorrido.
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/01/2024
 *
 */

public class zejercicio14{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] numeros = {4, 3, 1, 4, 2, 5, 8};
		int[] buscar = {4, 2, 5};
				
		System.out.println("Coincidencia en el indice: "+buscarSecuenciaInt(numeros,buscar));
		
	}
	
	public static int buscarSecuenciaInt(int[] numeros, int[] buscar) {
		
		int cont=0;
		
		for(int i=0; i<numeros.length-(buscar.length)+1; i++) {
			
			cont=0;
			
			if(numeros[i]==buscar[0] ){
				
				for(int j=0; j<buscar.length; j++) {
					
					if(numeros[i+j]==buscar[j]) {
						cont++;
					}
					
				}
				
				if(cont==buscar.length) {
					return i;
				}
			}
			
		}
		
		return -1;
		
	}
	
}