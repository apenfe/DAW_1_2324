/*
 * Dado un string ponerlo completo en mayusculas o minusculas dependiendo
 * de si si hay mas mayusculas inicialmente o no, si hay mas mayusculas,
 * se pone todo en mayusculas, en caso contrario en minusculas
 */

package UDEMY;

public class Ejemplo25{
	
	public static void main(String[] args) {
		
		String texto = " Este Es El Texto De prueba";
		
		System.out.println(mayusOminus(texto));
	}
	
	public static String mayusOminus(String texto) {
		
		int mayus=0;
		int minus=0;
		
		for(int i=0; i<texto.length();i++) {
			
			char check = texto.charAt(i);
			
			if(Character.toUpperCase(check)==check) {
				mayus++;
			}else {
				minus++;
			}
		}
		
		if(mayus>minus) {
			texto=texto.toUpperCase();
		}else {
			texto=texto.toLowerCase();
		}

		return texto;
	}
}