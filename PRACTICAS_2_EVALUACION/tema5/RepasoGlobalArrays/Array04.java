package RepasoGlobalArrays;

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
 *  Daría: 6
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
		
		String texto = "Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado."
				+ " Así que estamos leyendo todo el día. Vamos a salir en 5 días";
		String coincidencia = "en";
		
		int resultado = numeroVecesSubCadena(texto,coincidencia);
		
		System.out.println("Coincide un total de "+resultado+" veces.");
		
	}
	
	public static int numeroVecesSubCadena(String texto, String coincidencia) {
		
		int contador =0;
		texto=texto.toLowerCase();
		
		Pattern patron = Pattern.compile(coincidencia);
		Matcher busqueda = patron.matcher(texto);
		
		while (busqueda.find()) {
			
			contador++;
			
		}
		
		return contador;
		
	}
	
	
	
}