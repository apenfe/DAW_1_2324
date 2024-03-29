package RepasoGlobalArrays;

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
		
		padRight("Introduccion",'*',20);
		
	}
	
	public static void padRight(String texto, char caracter, int numero) {
		
		String salida = "";
		
		if(texto.length()>=numero) {
			
			System.out.println("No es posible formatear, el texto debe ser inferior al numero.");
			
		}else {
			
			salida = texto;
			
			for (int i = 0; i < numero-texto.length(); i++) {		
				
					salida+=caracter;
	
			}
			
		}
		
		System.out.println(salida);
		
	}
	
}