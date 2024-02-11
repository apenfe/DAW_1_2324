/* 
 * Ejercicio03.java
 *
 * Escribe un método llamado muestraCuadrado() que muestra un cuadrado en modo texto.
 *
 * Hay que tener en cuenta que:
 * El método recibe un número para el tamaño del lado y un carácter para utilizarlo en el contorno del cuadrado.
 * El algoritmo utilizado debe formatear todo sobre una sola cadena de texto que será devuelta.
 * Prueba exhaustivamente el método pedido desde main().
 *
 * Adrián Peñalver Fernández
 *
 * 01/01/2024
 *
 */

package TRES3;

import java.util.Scanner;

public class zejercicio03{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean check = true;
		int num=0;
		char simbolo=' ';
		
		do {
			
			System.out.print("Inserte un numero: ");
			
			do {
				
				try {
					num=Integer.parseInt(teclado.nextLine().trim());
					check=false;
				}catch(Exception e) {
					System.out.println("ERROR: INSERTE UN TEXTO");
				}
				
			}while(check);
			
			if(num<=0) {
				System.out.println("El número debe ser superior a 0.");
			}
			
		}while(num<=0);
		
		do {
			
			System.out.print("Inserte un char: ");
			
			do {
				
				try {
					simbolo=teclado.next().charAt(0);
					check=false;
				}catch(Exception e) {
					System.out.println("ERROR: INSERTE UN SIMBOLO");
				}
				
			}while(check);
			
			if(simbolo=='\n'||simbolo==' '||simbolo=='\t') {
				System.out.println("El simbolo no puede ser vacio \\n o \\t");
			}
			
		}while(simbolo=='\n'||simbolo==' '||simbolo=='\t');
		
		
		System.out.println(muestraCuadrado(num,simbolo));
		
	}
	
	public static String muestraCuadrado(int num, char simbolo) {
		
		String salida="";
		
		for(int i=1; i<=num ;i++) {
			for(int j=1; j<=num ;j++) {
				
				if(i==1||j==1||i==num||j==num) {
					salida+=simbolo+" ";
				}else {
					salida+="  ";
				}
			}
			salida+="\n";
		}
		
		return salida;
	}
}