/* 
 * 
 * Ejercicio01.java
 *
 * Escribe un método llamado fibonacci() utilizando programación por contrato que reciba un entero y devuelva el
 * valor que le corresponde en la sucesión de Fibonacci.
 *
 * El método fibonacci() calcula su valor de la siguiente manera:
 * Si el número recibido es un 1, la sucesión vale 1; si es un 2, la sucesión vale 2.
 * Para los sucesivos términos, se obtienen sumando los dos términos anteriores.
 * Por ejemplo, para el término 5 el valor es la suma del término para n=4 más el término para n=3.
 * Prueba el método pedido desde main(). Hay que tener en cuenta que en la programación por responsabilidades
 * main() es la responsable de llamar a fibonacci() con valores válidos.
 *
 * Adrián Peñalver Fernández
 *
 * 01/01/2024
 *
 */

package TRES3;

import java.util.Scanner;

public class zejercicio01{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean check = true;
		int num=0;
		
		do {
			System.out.print("Inserte un numero para saber fibonacci: ");
			
			do {
				
				try {
					num=Integer.parseInt(teclado.nextLine().trim());
					check=false;
				}catch(Exception e) {
					System.out.println("ERROR: INSERTE UN ENTERO");
				}
				
			}while(check);
			
			if(num<0) {
				System.out.println("El número deber ser igual o superior a 0.");
			}
			
		}while(num<0);
		
		System.out.println(fibonacci(num));
		
	}
	// 1 1 2 3 5
	// 0 1 2 3 4
	public static int fibonacci(int num) {
		
		int n1=1,n2=1, sum=0;
		
		if(num==0) {
			return 1;
		}else if(num==1) {
			return 1;
		}else {
			
			for(int i=2; i<=num; i++) {
				sum=n1+n2;
				n1=n2;
				n2=sum;			
			}
		
			return sum;
		}
		
	}
	
	
}