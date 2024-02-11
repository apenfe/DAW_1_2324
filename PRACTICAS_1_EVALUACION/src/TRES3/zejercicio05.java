/* OK
 * 
 * Ejercicio05.java
 *
 * Escribe un método llamado contarCaracteresPalabrasLineas() que reciba un texto como parámetro y devuelva como
 * resultado un código que codifique, de alguna manera, la siguiente información:
 *      El número de caracteres.
 *      El número de palabras.
 *      El número de líneas.
 *
 * El diseño y estructura del código es libre a condición de que sirva para el fin requerido. A modo de 
 * sugerencia se puede utilizar un String con el formato: cccc-pppp-llll Para el texto de ejemplo:
 * "Hoy es   lunes\n y mañana \tmartes" produciría el código: "0023-0006-0002"
 *
 * Se supone que una palabra está separada de otra por uno o más espacios en blanco, caracteres de tabulación o
 * caracteres de nueva línea.
 * Prueba el método pedido desde main() utilizando un método llamado interpretarCodigo() para mostrar el resultado
 * del método anterior.
 * El método interpretarCodigo() recibe dos argumentos: un código producido por contarCaracteresPalabrasLineas()
 * y un número que indica qué información se quiere extraer:
 *      1 para el total de caracteres
 *      2 para el total de palabras
 *      3 para el total de líneas
 * Prueba exhaustivamente los métodos pedidos desde main().
 *
 * Adrián Peñalver Fernández
 *
 * 01/01/2024
 *
 */

package TRES3;

import java.util.Scanner;

public class zejercicio05{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String cadena ="Hoy es   lunes\n y mañana \tmartes";
		int opcion = 3;
		
		String codigo=contarCaracteresPalabrasLineas(cadena);
		
		if(opcion==1) {
			System.out.print("Las letras son: "+interpretarCodigo(codigo,opcion-1));
		}else if(opcion==2) {
			System.out.print("Las palabras son: "+interpretarCodigo(codigo,opcion-1));
		}else {
			System.out.print("Las lineas son: "+interpretarCodigo(codigo,opcion-1));
		}
		
	}
	
	public static String contarCaracteresPalabrasLineas(String texto) {
		
		int lineas=0, palabras=0, letras=0;
		
		String[] lines = new String[0];
		String[] words = new String[0];
		
		lines=texto.split("\\n");
		lineas=lines.length;
		
		words=texto.split("\\s+");
		palabras=words.length;
		
		for(int i=0;i<words.length;i++) {
			letras+=words[i].length();
		}
		
		return ""+letras+"-"+palabras+"-"+lineas;
		
	}
	
	public static int interpretarCodigo(String codigo, int opcion) {
		
		String[] code = new String[0];
		
		code=codigo.split("-");
		
		return Integer.parseInt(code[opcion]);
		
	}
}