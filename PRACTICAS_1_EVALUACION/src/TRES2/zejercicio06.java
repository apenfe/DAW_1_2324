package TRES2;

import java.util.Scanner;

/* 
 * Ejercicio06.java
 *
 * Escribe un método que se llame rombo() que reciba un número entero como parámetro y muestre por pantalla  
 * un rombo de asteriscos.
 * Por ejemplo, si como argumento se le proporciona el valor 5, el resultado sería:
 * 
 *                     *
 *                    ***
 *                   *****
 *                    ***
 *                     *
 *
 * Hay que tener en cuenta que el número de filas -para un rombo- debe ser impar por cuestiones de simetría.
 * Prueba el método pedido desde main().
 * 
 * Adrián Peñalver Fernández
 * 
 * 05/11/2023
 *
 */

public class zejercicio06{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num = 0;
		
		do {
			
			do {
				
				System.out.print("Numero de alturas rombo? IMPAR ");
				num = Integer.parseInt(teclado.nextLine().trim());
				
			}while(num%2==0);
			
			rombo(num);
			
			System.out.print("Desea calcular otra piramide? SI ");
			String respuesta = teclado.nextLine().trim();
			
			if(respuesta.equalsIgnoreCase("SI")==false) {
				System.out.println("FIN DEL PROGRAMA");
				return;
			}
			
		}while(true);
		
	}
	
	public static void rombo(int num) {
		
		for(int i=1; i<=num/2+1; i++) { // nomal
			
			for(int j=0; j<num-i; j++) {	
				System.out.print(" ");
			}
			
			for(int j=0; j<i+(i-1); j++) {	
				System.out.print("*");
			}
			
			System.out.println();
		
		}
		
		for(int i=num/2; i>=1; i--) {
			
			for(int j=num-i; j>0; j--) { 
				System.out.print(" ");
			}
			
			for(int j=i+(i-1); j>0; j--) {	
				System.out.print("*");
			}
			
			System.out.println();
		
		}
		
	}
	
}