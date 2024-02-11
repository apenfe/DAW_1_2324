package TRES2;

import java.util.Scanner;

/* 
 * Ejercicio05.java
 *
 * Escribe un método que se llame triangulo() que reciba un número entero como parámetro y muestre por pantalla
 * una pirámide de asteriscos.
 * Por ejemplo, si se proporciona el valor 6, el resultado sería:
 * 
 *                     *
 *                    ***
 *                   *****
 *                  *******
 *                 *********
 *                ***********
 *
 * Prueba el método pedido desde main().
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/01/2024
 *
 */

public class zejercicio05{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		do {
			
			System.out.print("Numero de alturas piramide? ");
			int num = Integer.parseInt(teclado.nextLine().trim());
			
			piramide(num);
			
			System.out.print("Desea calcular otra piramide? SI ");
			String respuesta = teclado.nextLine().trim();
			
			if(respuesta.equalsIgnoreCase("SI")==false) {
				System.out.println("FIN DEL PROGRAMA");
				return;
			}
			
		}while(true);
		
	}
	
	public static void piramide(int num) {
		
		for(int i=1; i<=num; i++) {
			
			for(int j=0; j<num-i; j++) {	
				System.out.print(" ");
			}
			
			for(int j=0; j<i+(i-1); j++) {	
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}
	
}