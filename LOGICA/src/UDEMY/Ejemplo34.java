/*
 * Dados dos números haz una calculadora sencilla de 4 operaciones
 */

package UDEMY;
import java.util.Scanner;

public class Ejemplo34{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double a=0, b=0;
		boolean check=true;
		int opcion = 0;
		
		System.out.print("Inserte el primer número: ");
		
		while(check) {
			
			try {
				
				a = Double.parseDouble( teclado.nextLine().trim());
				check=false;
				
			}catch(Exception e) {
				System.out.println("Error, inserte un numero.");
			}	
			
		}
		
		check = true;
		
		System.out.print("Inserte el segundo número: ");
		
		while(check) {
			
			try {
				
				b = Double.parseDouble( teclado.nextLine().trim());
				check=false;
				
			}catch(Exception e) {
				System.out.println("Error, inserte un numero.");
			}	
			
		}
		
		check = true;
		
		System.out.print("Que opcion desea:\n 1 - SUMA\n 2 - RESTA\n 3 - MULTIPLICACION\n 4 - DIVISION\n");
		
		while(check) {
			
			try {
				
				opcion = Integer.parseInt(teclado.nextLine().trim());
				check=false;
				
			}catch(Exception e) {
				System.out.println("Error, inserte un numero entero.");
			}	
			
		}
		
		switch(opcion) {
		
		case 1:
			
			System.out.println("La suma es: "+suma(a,b));
			
		break;
		
		case 2:
			
			System.out.println("La resta es: "+resta(a,b));
			
		break;
			
		case 3:
			
			System.out.println("La multiplicacion es: "+multiplicacion(a,b));
			
		break;
			
		case 4:
			
			System.out.println("La division es: "+division(a,b));
			
			break;
			
			default:
				
				System.out.println("OPCION NO VALIDA");

		}
		

	}
    
	public static double suma(double a, double b) {
		
		return a+b;
	}
	
	public static double resta(double a, double b) {
		
		
		return a-b;
	}

	public static double multiplicacion(double a, double b) {
	
	
		return a*b;
	}

	public static double division(double a, double b) {
		
		if(b==0) {
			return -1;
		}
	
		return a/b;
	}
	
}