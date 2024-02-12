package Array04;

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
		
		int sol = obtenerNumeroVecesSubCadena2(texto,busqueda);
		
		System.out.println("Solucion: "+sol);
		
	}
	
	public static int obtenerNumeroVecesSubCadena2(String texto, String busqueda) {
		
		texto=texto.toLowerCase();
		int coincidencias=0;
		int inicio=0;
		
		do {
			
			inicio = texto.indexOf(busqueda,inicio);
			
			if(inicio>=0) {
				coincidencias++;
				texto=texto.substring(inicio+busqueda.length());
				inicio=0;
			}
			
		}while(inicio>=0);
		
		return coincidencias;
		
	}
	
}