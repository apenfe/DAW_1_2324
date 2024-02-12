package rArray04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Array04.java
 * 
 * Escribe un método que se llame obtenerNumeroVecesSubCadena() que recibe dos cadenas y devuelve el
 * número de veces que la segunda cadena está contenida en el texto de la primera. Se debe utilizar un algoritmo propio.
 * 
 * Ejemplo:
 * 
 * Si se busca la subcadena "en" en el texto:
 * 
 * “Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado.
 *  Así que estamos leyendo todo el día. Vamos a salir en 5 días".
 *  
 *  Daría: 5
 *  
 *  Prueba el método pedido desde main().
 *  
 *  Se recomienda probar el texto del ejemplo y utilizar un bucle de búsqueda que utilice la versión adecuada de indexOf() con un contador.
 *  Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array04{
	
	public static void main(String[] args) {
		
		String texto ="Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino"
				+ " se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días";
		String busqueda = "en";
		
		int sol = obtenerNumeroVecesSubCadena2V3(texto,busqueda);
		
		System.out.println("Solucion: "+sol);
		
	}
	
	public static int obtenerNumeroVecesSubCadena2(String texto, String busqueda) {
		
		texto=texto.toLowerCase();
		int salida = 0, index = 0, newIndex=0;
		
		while(newIndex>=0) {
			
			newIndex=texto.indexOf(busqueda, index);
			
			index=newIndex+busqueda.length();
			System.out.println(newIndex);
			
			if(newIndex>=0) {
				salida++;
			}
		
		}
		
		return salida;
		
	}
	
	public static int obtenerNumeroVecesSubCadena2V2(String texto, String busqueda) {
		
		texto=texto.toLowerCase();
		int salida=0;
		Pattern patron = Pattern.compile(busqueda);
		Matcher coincidencias = patron.matcher(texto);
		
		while(coincidencias.find()) {
			
			salida++;
			
		}	
		
		return salida;
		
	}
	
	public static int obtenerNumeroVecesSubCadena2V3(String texto, String regex) {
		
		return texto.toLowerCase().split(regex.toLowerCase()).length-1;
		
	}
	
}