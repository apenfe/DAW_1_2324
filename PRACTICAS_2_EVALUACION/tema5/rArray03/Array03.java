package rArray03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Array03.java
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

public class Array03{
	
	public static void main(String[] args) {
		
		String texto ="Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino"
				+ " se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días";
		String regex = "en";
		
		int sol = obtenerNumeroVecesSubCadena(texto,regex);
		
		System.out.println("Solucion: " + sol);
		
	}
	
	public static int obtenerNumeroVecesSubCadena(String texto, String regex) {
		
		int salida = 0, index = 0, newIndex=0;
		
		while(newIndex>=0) {
			
			newIndex=texto.indexOf(regex, index);
			
			index=newIndex+regex.length();
			System.out.println(newIndex);
			
			if(newIndex>=0) {
				salida++;
			}
		
		}
		
		return salida;
		
	}
	
	public static int obtenerNumeroVecesSubCadenaV2(String texto, String regex) {
		
		int salida=0;
		Pattern patron = Pattern.compile(regex);
		Matcher coincidencias = patron.matcher(texto);
		
		while(coincidencias.find()) {
			
			salida++;
			
		}	
		
		return salida;
		
	}
	
	public static int obtenerNumeroVecesSubCadenaV3(String texto, String regex) {
		
		return texto.split(regex).length-1;
		
	}
	
}