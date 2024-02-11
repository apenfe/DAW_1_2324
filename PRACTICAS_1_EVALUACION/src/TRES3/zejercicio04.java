/* 
 * Ejercicio04.java
 *
 * Escribe un método llamado tipoTriangulo() que recibe tres valores como parámetros, comprueba si forman un
 * triangulo.
 * Hay que tener en cuenta que:
 * Devuelve el nombre del tipo de triángulo que formarían (isósceles, equilátero, escaleno) o la palabra ERROR.
 * Para comprobar si forman un triangulo se utiliza el método esTriangulo().
 * El método esTriangulo() comprueba si tres valores recibidos como argumentos formarían un triangulo.
 * Devuelve true o false.
 * Prueba exhaustivamente los métodos pedidos desde main().
 *
 * Adrián Peñalver Fernández
 *
 * 01/01/2024
 *
 */

package TRES3;

import java.util.Scanner;

public class zejercicio04{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean check = true;
		double[] lados=new double[3];
		
		for(int i=1;i<=3;i++) {
				
				System.out.print("Inserte un numero: ");
				
				do {
					
					try {
						lados[i-1]=Double.parseDouble(teclado.nextLine().trim());
						check=false;
					}catch(Exception e) {
						System.out.println("ERROR: INSERTE UN NUMERO");
					}
					
				}while(check);
		}
		
		System.out.println(tipoTriangulo(lados[0],lados[1],lados[2]));
		
	}
	
	public static String tipoTriangulo(double a, double b, double c) {
		
		if(esTriangulo(a,b,c)) {
			
			if(a==b&&b==c) {
				return "equilatero";
			}else if(a!=b&&b!=c) {
				return "escaleno";
			}else {
				return "isosceles";
			}
			
		}else {
			return "ERROR";
		}
		
	}
	
	public static boolean esTriangulo(double a, double b, double c) {
		
		if(a>=(b+c)||b>=(a+c)||c>=(b+a)) {
			return false;
		}else {
			if(a<=0||b<=0||c<=0) {
				return false;
			}else {
				return true;
			}
		}
	}
}