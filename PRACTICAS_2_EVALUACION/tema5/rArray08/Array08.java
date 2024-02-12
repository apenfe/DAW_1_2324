package rArray08;

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
		
		String[] datos = separarUrlV2(url);
		
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
	
	public static String[] separarUrlV2(String texto) {

		String[] salida = new String[3];
		// String url = "http://www.devbg.org/forum/index.php";
		Pattern protocolo = Pattern.compile(".{3,6}://");
		Pattern servidor = Pattern.compile("w{3}\\..+?\\.[a-z]+");
		Pattern recurso = Pattern.compile("/{1}[a-z0-9 &&[^w{3}]]+[/a-z0-9+]*\\.[a-z]+");

		Matcher coincidencias1 = protocolo.matcher(texto);
		Matcher coincidencias2 = servidor.matcher(texto);
		Matcher coincidencias3 = recurso.matcher(texto);

		if (coincidencias1.find()) {
			salida[0] = coincidencias1.group().replaceAll("://", "");
		}

		if (coincidencias2.find()) {
			salida[1] = coincidencias2.group();
		}

		if (coincidencias3.find()) {
			salida[2] = coincidencias3.group();
		}

		return salida;

	}
	
	public static String[] separarUrlV3(String texto) {

		String regex = "://|/";
		String[] trozos = texto.split(regex,3);
		
		if (trozos.length==3) {
			
			trozos[2]="/"+trozos[2];
			
		}

		return trozos;

	}

}