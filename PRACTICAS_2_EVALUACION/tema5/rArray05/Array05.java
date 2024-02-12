package rArray05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Array05.java
 * 
 * Escribe un método que se llame pasarMayusculaSubCadena() que recibe un texto etiquetado y devuelve
 * otra cadena en la que se han cambiado a mayúsculas todos los caracteres en el texto entre las etiquetas <mayus></mayus>
 * 
 * Las etiquetas no se pueden anidar y deben ser limpiadas del texto resultante.
 * 
 * Ejemplo:
 * 
 * “Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer"
 * 
 * Daría: “Estamos viviendo en un SUBMARINO AMARILLO. No tenemos NADA qué hacer”
 * 
 * Prueba el método pedido desde main().
 * Se recomienda utilizar expresiones regulares o IndexOf() para abrir y cerrar la etiqueta. Una vez 
 * calculado el índice de inicio y final del texto afectado por una etiqueta se extrae, se pasa a mayúscula
 *  se reemplaza toda la subcadena <mayus>texto</mayus>.
 *  
 *  Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array05{
	
	public static void main(String[] args) {
		
		String texto ="Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer";
		String sol = pasarMayusculaSubCadena(texto);
		
		System.out.println("Solucion: "+sol);
		
	}
	
	public static String pasarMayusculaSubCadena(String texto) {
		
		Pattern patron = Pattern.compile("<mayus>.+?</mayus>");
		Matcher coincidencias = patron.matcher(texto);
	
		while(coincidencias.find()) {
			
			String actual = coincidencias.group().toUpperCase().replaceAll("<MAYUS>|</MAYUS>", "");
			texto=texto.replaceAll(coincidencias.group(),actual );
			
		}
		
		return texto;
		
	}
	
	public static String pasarMayusculaSubCadenaV2(String texto) {
		
		String regex ="<mayus>|</mayus>";
		String[] trozos = texto.split(regex);
		
		for (int i = 0; i < trozos.length; i++) {
			
			if(i%2==1) {
				texto+= trozos[i].toUpperCase();
			}
			texto+= trozos[i];
		}
		
		return texto;
		
	}
	
}