package TRES2;

import java.util.Scanner;

/* 
 * Ejercicio10.java
 * 	
 * Escribe un método que se llame rombo2() que reciba un número entero como parámetro y devuelva una cadena de
 * caracteres con el texto formateado de un rombo de asteríscos.
 * Prueba el método pedido desde main().
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/01/2024
 *
 */

public class zejercicio10{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num = 0;
		
		do {
			
			do {
				
				System.out.print("Numero de alturas rombo? IMPAR ");
				num = Integer.parseInt(teclado.nextLine().trim());
			
			}while(num%2==0);
			
			System.out.println(rombo2(num));
			
			System.out.print("Desea calcular otro rombo? SI ");
			String respuesta = teclado.nextLine().trim();
			
			if(respuesta.equalsIgnoreCase("SI")==false) {
				System.out.println("FIN DEL PROGRAMA");
				return;
			}
			
		}while(true);
		
	}
	
	public static String rombo2(int num) {
		
		String rombo="";
		
		for(int i=1; i<=(num/2)+1; i++) {
			
			for(int j=0; j<num-i; j++) {	
				rombo+=" ";
			}
			
			for(int j=0; j<i+(i-1); j++) {	
				rombo+="*";
			}
			
			rombo+="\n";
		
		}
		
		for(int i=num/2; i>=1; i--) {
			
			for(int j=0; j<num-i; j++) {	
				rombo+=" ";
			}
			
			for(int j=0; j<i+(i-1); j++) {	
				rombo+="*";
			}
			
			rombo+="\n";
		
		}
		
		return rombo;
		
	}
	
}