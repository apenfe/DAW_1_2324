package RepasoGlobalArrays;

/* Array07.java
 * 
 * Escribe un método que se llame reemplazaPalabras() que recibe una cadena con un texto
 * y otra con una serie de términos separados por comas que deben ser sustituidos por
 * asteriscos. Devuelve el texto con el correspondiente cambio.
 * 
 * Ejemplo:
 * 
 * Con el texto:
 * 
 * “Oracle ha anunciado hoy su nueva generación de compilador Java hoy. Utiliza analizador
 * avanzado y optimizador especial para la JVM de Oracle”
 * 
 * Términos: “JVM,Java,Oracle”
 * 
 * Produce:
 * 
 * “****** ha anunciado hoy su nueva generación de compilador ****. Utiliza analizador
 *  avanzado y optimizador especial para la *** de ******”
 *  
 *  Prueba el método pedido desde main().
 *  Se recomienda utilizar StringBuilder y el método split() de String para separar cada
 *  término a rastrear. Al encontrar una palabra a sustituir por asteriscos se deben respetar
 *  la longitud de cada término .
 *  
 *  Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array07{
	
	public static void main(String[] args) {
	
		String texto = "Oracle ha anunciado hoy su nueva generación de compilador Java hoy. "
				+ "Utiliza analizador avanzado y optimizador especial para la JVM de Oracle";
		
		String coincidencias = "JVM,Java,Oracle";
		
		reemplazaPalabras(texto,coincidencias);
		
	}
	
	public static void reemplazaPalabras(String texto, String coincidencias) {
		
		String[] censura = coincidencias.split(",");
		
		for (int i = 0; i < censura.length; i++) {
			
			String simbolos = "";
			
			for (int j = 0; j < censura[i].length(); j++) {
				simbolos+="*";
			}
			
			texto=texto.replaceAll(censura[i], simbolos);
			
		}
		
		System.out.println(texto);
		
	}

}