package RepasoGlobalArrays;

/* Array01.java
 * 
 * Escribe un método que se llame invertirTexto() que recibe una cadena de caracteres cualquiera y la devuelve invertida.
 * 
 * Por ejemplo:
 * "Introducción" -> "nóiccudortnI"
 * 
 * Se recomienda utilizar internamente un StringBuilder y un bucle do-while
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array01{
	
	public static void main(String[] args) {
		
		String texto = "Introducción";
		
		reverse(texto);
		
	}
	
	public static void reverse(String texto) {
		
		StringBuilder salida = new StringBuilder();
		salida.append(texto);
		salida.reverse();
		
		System.out.println(salida);
		
	}
	
	
	
}