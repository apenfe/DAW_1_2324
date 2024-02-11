/* 
 * Ejercicio06.java
 *
 * Escribe un método que se llame bannerLetra() que recibe un carácter como parámetro y devuelve una cadena de
 * caracteres con el texto, formateado sobre una matriz de 7x7, de la letra correspondiente al carácter recibido.
 * Por ejemplo si se introduce la H, la cadena devuelta, al imprimirla, daría:
 *
 *      H     H
 *      H     H
 *      H     H
 *      HHHHHHH
 *      H     H     
 *      H     H
 *      H     H
 *
 * Opcionalmente se pueden utilizar métodos adicionales especializados en generar cada letra. Estos métodos
 * devuelven un texto formateado adecuadamente según el diseño elegido.
 * A fin de hacer menos extenso el ejercicio, no es necesario hacer todas las letras del abecedario; con cuatro 
 * o cinco letras es suficiente. 
 * En el caso de mostrar varias letras, se presentarán en vertical; a fin de hacer más sencillo el ejercicio.
 * Sólo se admiten letras en mayúsculas.
 * Prueba exhaustivamente el métodos pedido desde main().
 *
 * Adrián Peñalver Fernández
 *
 * 02/01/2024
 *
 */

package TRES3;

import java.util.Scanner;

public class zejercicio06{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Inserte una palabra a representar: ");
		String palabra = teclado.nextLine().trim().toLowerCase();	
		
		for(int i=0; i<palabra.length(); i++) {
			System.out.println(bannerLetra(palabra.charAt(i)));
		}
		
	}
	
	public static String bannerLetra(char letra) {
		
	        String salida="";

	        System.out.println();


	            if(letra=='a'){

	                String fila1="  AAA  ";
	                String fila2=" A   A ";
	                String fila3="A     A";
	                String fila4="A     A";
	                String fila5="AAAAAAA";
	                String fila6="A     A";
	                String fila7="A     A";

	                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";
	                
	            }else if(letra=='b'){
	                
	                String fila1="BBBBBB ";
	                String fila2="B     B";
	                String fila3="B     B";
	                String fila4="BBBBBB ";
	                String fila5="B     B";
	                String fila6="B     B";
	                String fila7="BBBBBB ";
	                
	               
	                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

	            }else if(letra=='c'){

	                String fila1=" cccccc";
	                String fila2="c      ";
	                String fila3="c      ";
	                String fila4="c      ";
	                String fila5="c      ";
	                String fila6="c      ";
	                String fila7=" cccccc";
	                
	                return salida +"\t"+ fila1 + "\n\t" + fila2 + "\n\t" + fila3 + "\n\t"+ fila4 + "\n\t"+ fila5 + "\n\t"+ fila6 + "\n\t"+ fila7 + "\n";

	            }else {
	            	return "ERROR";
	            }
		
	}
	
	
}