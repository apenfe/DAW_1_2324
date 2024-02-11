/*
 * Dadas dos cadenas de texto, crear un algoritmo que compruebe si son anagramas
 * entre si
 * 
 * Ejemplo:
 * riesgo y sergio si
 * 
 * adrian y david no
 */

package UDEMY;
import java.util.Arrays;

public class Ejemplo20{
	
	public static void main(String[] args) {
		
		String texto1 = "Riesgo.";
		String texto2 = "!Sergio!";
		
		if(anagramas(texto1, texto2)) {
			System.out.println(texto1+" y "+texto2+" son anagramas.");
		}else {
			System.out.println(texto1+" y "+texto2+" NO son anagramas.");
		}
	}
	
	public static boolean anagramas(String texto1, String texto2) {
		
		texto1=texto1.replaceAll("[^A-Za-záéíóúÁÉÍÓÚ]", "");
		texto2=texto2.replaceAll("[^A-Za-záéíóúÁÉÍÓÚ]", "");
		
		texto1=texto1.trim().toLowerCase();
		texto2=texto2.trim().toLowerCase();
		
		if(texto1.length()!=texto2.length()) {
			return false;
		}
		
			char[] chars1 = texto1.toCharArray();
			char[] chars2 = texto2.toCharArray();
			
			Arrays.sort(chars1);
			Arrays.sort(chars2);
			
			texto1= new String(chars1);
			texto2= new String(chars2);
		
		for (int i = 0; i < texto1.length(); i++) {
			if(texto1.charAt(i)!=texto2.charAt(i)) {
				return false;
			}
		}

		return true;
	}
}