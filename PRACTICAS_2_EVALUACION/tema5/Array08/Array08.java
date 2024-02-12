package Array08;

/* Array08.java
 * 
 * Escribe un método que se llame separarURL() que recibe una cadena de caracteres de una URL
 * y devuelva un array de tres String conteniendo el protocolo, el servidor y el recurso de 
 * la URL recibida.
 * 
 * Ejemplo:
 * 
 * Proporcionando:  http://www.devbg.org/forum/index.php
 * 
 * El resultado es:
 * 
 * resultado[0] : "http" 
 * 
 * resultado[1]: "www.devbg.org" 
 * 
 * resultado[2]: "/forum/index.php"
 * 
 * Prueba el método pedido desde main().
 * 
 * Utiliza expresiones regulares o busca los respectivos separadores: dos barras diagonales para
 * poner fin protocolo y una barra diagonal como separador entre el servidor y el recurso.
 * 
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array08{
	
	public static void main(String[] args) {
		
		String url = "http://www.devbg.org/forum/index.php";
		
		String[] datos = separarUrl(url);
		
		System.out.println("Protocolo: " + datos[0]);
		System.out.println("Servidor: " + datos[1]);
		System.out.println("Recurso: " + datos[2]);
		
	}
	
	public static String[] separarUrl(String texto) {
		
		String[] salida = new String[3];
		String[] nuevo = new String[0];
		
		nuevo = texto.split("://");
		
		salida[0]=nuevo[0];
		
		nuevo= nuevo[1].split("/");
		
		salida[1]= nuevo[0];
		
		salida[2]="";
		
		for (int i = 1; i < nuevo.length; i++) {
			
			salida[2]+="/"+nuevo[i];
					
		}
		
		return salida;
		
	}

}