package RepasoGlobalArrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		String[] web = separarUrl(url);
		
		for (int i = 0; i < web.length; i++) {
			System.out.println(web[i]);
		}
		
	}
	
	public static String[] separarUrl(String url) {
		
		String[] salida = url.split("(://|/)",3);
		
		if(salida.length==3) {
			
			salida[2]="/"+salida[2];
			
		}
		
		return salida;
		
	}

}