/*
 * Dado un texto, devolver cuantas y vocales y cuantas consonantes tiene
 */

package UDEMY;

public class Ejemplo36{
	public static void main (String[] args) {
		
		String texto = "victorroblesweb.es";
		
		int[] array2 = new int[2];
		array2=consonantesVocales(texto);
		
		System.out.println("La cantidad de vocales es: "+array2[0]);
		System.out.println("La cantidad de consonantes es: "+array2[1]);		
	}
	
	public static int[] consonantesVocales(String texto){
		
		int[] devuelvo = new int[2];
		int vocal=0, consonante=0;
		
		texto=texto.trim().toLowerCase();
		
		texto=texto.replaceAll("[^a-záéíóú]","");
		
		for (int i = 0; i < texto.length(); i++) {
			
			if(texto.charAt(i)=='a'||texto.charAt(i)=='e'||texto.charAt(i)=='i'||texto.charAt(i)=='o'||texto.charAt(i)=='u') {
				vocal++;
			}else {
				consonante++;
			}
			
		}
		
		devuelvo[0]=vocal;
		devuelvo[1]=consonante;
		
		return devuelvo;
	}
	
}