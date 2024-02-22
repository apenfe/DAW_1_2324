package RepasoGlobalArrays;

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
		
		String texto = "Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer";
		
		pasarMayusculaSubCadena(texto);
		
	}
	
	public static void pasarMayusculaSubCadena(String texto) {
		
		Pattern patron = Pattern.compile("(<mayus>)(.+?)(</mayus>)");
		Matcher busqueda = patron.matcher(texto);
		
		while (busqueda.find()) {
			
			String bloque = busqueda.group().toString().toUpperCase().replaceAll("<MAYUS>|</MAYUS>", "");
			texto=texto.replaceAll(busqueda.group(), bloque);
			
		}
		
		System.out.println(texto);
			
	}
	
}