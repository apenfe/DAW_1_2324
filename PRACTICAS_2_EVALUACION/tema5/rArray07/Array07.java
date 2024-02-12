package rArray07;

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
		
		String texto ="Oracle ha anunciado hoy su nueva generación de compilador Java hoy. Utiliza analizador\n"
				+ "avanzado y optimizador especial para la JVM de Oracle";
		
		String terminos = "JVM,Java,Oracle";
		
		System.out.println("Solucion: " + reemplazaPalabras(texto,terminos));
		
	}
	
	public static String reemplazaPalabras(String texto, String terminos) {
		
		String reemplazar = "";
		String[] termino = terminos.split(",");
		
		for (int i = 0; i < termino.length; i++) {
			
			for (int j = 0; j < termino[i].length(); j++) {
				reemplazar+="*";
			}
			
			texto=texto.replaceAll(termino[i],reemplazar);
			reemplazar="";
		}
		
		return texto;
		
	}

}