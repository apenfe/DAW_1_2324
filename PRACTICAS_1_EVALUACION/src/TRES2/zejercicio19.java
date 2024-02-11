package TRES2;

import java.util.Scanner;

/* 
 * Ejercicio19.java
 * 	
 * Escribe un método que se llame ordenarBurbuja() que recibe un vector de enteros para ordenarlos por el método
 * de la burbuja . Devuelve 1 si ha ordenado, 0 si ya estaba ordenado y un valor negativo si no se ha podido
 * ordenar.
 * Prueba el método pedido desde main().
 * Consulta el anexo de los apuntes: Anexo 7. Algoritmos de búsqueda y ordenación
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/01/2024
 *
 */

public class zejercicio19{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] num1 = {1,2,3,4,5}; 
		int[] num2 = {5,2,8,4,5}; 
		int[] num3 = {1,1,1,1,1}; 
		
		int sol1 = ordenarBurbuja(num1);
		int sol2 = ordenarBurbuja(num2);
		int sol3 = ordenarBurbuja(num3);
		
		if(sol1==0) {
			System.out.println("Ya estaba ordenado");
		}else if(sol1==1) {
			System.out.println("EStaba desordenado y se ha ordenado");
		}else {
			System.out.println("No se ha podido ordenar");
		}
		
		if(sol2==0) {
			System.out.println("Ya estaba ordenado");
		}else if(sol2==1) {
			System.out.println("EStaba desordenado y se ha ordenado");
		}else {
			System.out.println("No se ha podido ordenar");
		}
		
		if(sol3==0) {
			System.out.println("Ya estaba ordenado");
		}else if(sol3==1) {
			System.out.println("EStaba desordenado y se ha ordenado");
		}else {
			System.out.println("No se ha podido ordenar");
		}
		
	}
	
	public static int ordenarBurbuja(int[] numeros) {
		
		int cont=1, aux=0;
		
		for(int i=1; i<numeros.length; i++) {
			if(numeros[i]==numeros[i-1]) {
				cont++;
			}
		}
		
		if(cont==numeros.length) {
			return -1;
		}
		
		cont=0;
		
		for(int i=1; i<numeros.length; i++) {
			for(int j=0; j<(numeros.length)-i; j++) {
				
				if(numeros[j]>numeros[j+1]) {
					cont++;
					aux=numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
				}
			}
		}
		
		if(cont==0) {
			return 0;
		}else {
			return 1;
		}
		
		
	}
	
}