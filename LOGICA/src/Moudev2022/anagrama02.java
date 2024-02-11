package Moudev2022;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

public class anagrama02{
	
	public static void main(String[] args) {
		
		if(anagrama("adios","iodad")) {
			System.out.println("Son anagramas.");
		}else {
			System.out.println("NO son anagramas.");
		}
	}
	
	public static boolean anagrama(String palabra1, String palabra2) {
		
		palabra1=palabra1.toLowerCase().trim();
		palabra2=palabra2.toLowerCase().trim();
		
		if(palabra1.equals(palabra2)) {
			return false;
		}
		
		if(palabra1.length()!=palabra2.length()) {
			return false;
		}else {
			
			for(int i=0; i<palabra1.length(); i++) {
				
				char letra = palabra1.charAt(i);
				int cont1=0, cont2=0;
				
				for(int j=0; j<palabra1.length(); j++) {
					
					if(palabra1.charAt(j)==letra) {
						cont2 ++;
					}
					
				}
				
				for(int k=0; k<palabra2.length(); k++) {
					
					if(palabra2.charAt(k)==letra) {
						cont1 ++;
					}
					
				}
				
				if(cont1!=cont2) {
					return false;
				}
				
			}
			
			return true;
			
		}
	}

}