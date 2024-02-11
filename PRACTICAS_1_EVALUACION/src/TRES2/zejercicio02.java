package TRES2;

import java.util.Scanner;

/* 
 * Ejercicio02.java
 *
 * Escribe un programa que muestre las tablas de multiplicar. Para la visualización utiliza un método llamado
 * calcularMostrarTabla().
 * El método calcularMostrarTabla() recibe el número del que calculará la tabla y la visualiza por pantalla con el
 * formato adecuado.
 * La tabla mostrará productos hasta el 15. 
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/01/2024
 *
 */

public class zejercicio02{
	
	public static Scanner teclado = new Scanner(System.in);
	public static final int HORA_NORMAL= 15;
	public static final int HORA_EXTRA= 22;
	public static final int LIMITE_NORMAL= 35;
	
	public static void main(String[] args) {
		
		do {
			
			System.out.print("Tabla de multiplicar? ");
			int tabla = Integer.parseInt(teclado.nextLine().trim());
			
			calcularMostrarTabla(tabla);
			
			System.out.print("Desea calcular otra tabla? SI ");
			String respuesta = teclado.nextLine().trim();
			
			if(respuesta.equalsIgnoreCase("SI")==false) {
				System.out.println("FIN DEL PROGRAMA");
				return;
			}
			
		}while(true);
		
	}
	
	public static void calcularMostrarTabla(int num) {
		
		for(int i=0; i<=15; i++) {
			System.out.println(i+" x "+num+" = "+(i*num));
		}
		
	}
	
}