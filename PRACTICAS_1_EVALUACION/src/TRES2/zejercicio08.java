package TRES2;

import java.util.Scanner;

/* 
 * Ejercicio08.java
 *
 * Escribe un método que se llame trianguloTexto() que reciba un número entero como parámetro y devuelva una 
 * cadena de caracteres con el texto formateado de una pirámide de asteriscos.
 * Por ejemplo si se introduce el 6, la cadena devuelta, al imprimirla, daría:
 *                     *
 *
 *                    ***
 *
 *                   *****
 *
 *                  *******
 *
 *                 *********
 *
 *                ***********
 *
 * Prueba el método pedido desde main().
 * 
 * Adrián Peñalver Fernández
 * 
 * 07/01/2024
 *
 */

public class zejercicio08{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num = 0;
		
		do {
			
			
				
				System.out.print("Numero de alturas piramide? ");
				num = Integer.parseInt(teclado.nextLine().trim());
				
			
			System.out.println(piramide(num));
			
			System.out.print("Desea calcular otra piramide? SI ");
			String respuesta = teclado.nextLine().trim();
			
			if(respuesta.equalsIgnoreCase("SI")==false) {
				System.out.println("FIN DEL PROGRAMA");
				return;
			}
			
		}while(true);
		
	}
	
	public static String piramide(int num) {
		
		String piramide="";
		
		for(int i=1; i<=num; i++) {
			
			for(int j=0; j<num-i; j++) {	
				piramide+=" ";
			}
			
			for(int j=0; j<i+(i-1); j++) {	
				piramide+="*";
			}
			
			piramide+="\n";
		
		}
		
		return piramide;
		
	}
	
}