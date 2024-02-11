/*
 * Dada una cadena de texto devolver el caracter más usado
 */

package UDEMY;

public class Ejemplo15{
	public static void main(String[]atgs) {
		
		String texto = "Este es el texto de muestra, sin lugar a dudas la letra mas comun es e";
		
		System.out.println(masComun(texto));
	}
	
	public static String masComun(String texto) {
	
		char comun=' ';
		int cont=0;
		int max =0;
		
		for (int i = 0; i < texto.length(); i++) {
			for(int j=0; j<texto.length();j++) {
				if((texto.charAt(i)==texto.charAt(j))&&texto.charAt(i)!=' ') {
					cont++;
				}
			}
			
			if(cont>max) {
				max=cont;
				comun=texto.charAt(i);
			}
			cont=0;
		}
		
		return "El caracter mas repetido en la cadena es: "+comun+".";
	}
	
}
