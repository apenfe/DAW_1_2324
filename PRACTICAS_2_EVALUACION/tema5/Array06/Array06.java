package Array06;

/* Array06.java
 * 
 * Escribe un método que se llame padRight() que recibe una cadena de caracteres, un carácter y un número.
 * Devuelve una cadena formateada con el texto recibido completado por la derecha con el carácter proporcionado
 * hasta la longitud indicada con el número.
 * 
 * Ejemplo:
 * 
 * padRight("Introducción", '*', 20);
 * 
 * produce: "Introducción********"
 * 
 * Prueba el método pedido desde main().
 * Se recomienda utilizar StringBuilder.
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array06{
	
	public static void main(String[] args) {
		
		String texto ="Introducción";
		
		char caracter = '*';
		
		System.out.println("Solucion: "+ padRight(texto,caracter,20));
		
	}
	
	public static String padRight(String texto, char caracter, int numero) {
		
		if(texto.length()>=numero) {
			
			return texto;
			
		}else {
			
			for (int i = texto.length(); i < numero; i++) {
				
				texto+=caracter;
				
			}
			
		}
		
		return texto;
		
	}

}