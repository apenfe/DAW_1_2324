/*
 * Dada una cadena de texto, poner en matuscula la primera letra de cada palabra
 * en la cadena y luego devolver la cadena
 */

package UDEMY;

public class Ejemplo23{
	
	public static void main(String[] args) {
		
		System.out.println(ponMayusculas("Este texto se va a poner con mayusculas"));
	}
	
	public static String ponMayusculas(String texto) {
		
		String text="";
		String[] palabras = new String[0];
		
		palabras=texto.split(" ");
		
		for(int i=0; i<palabras.length;i++) {
			for(int j=0; j<palabras[i].length();j++) {
				
				if(j==0) {
					text+= Character.toUpperCase(palabras[i].charAt(j));

				}else {
					text+= palabras[i].charAt(j);

				}
				
			}
			
			text+=" ";
		}

		return text;
	}
}