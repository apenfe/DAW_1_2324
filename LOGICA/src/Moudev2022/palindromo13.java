package Moudev2022;

/*
 * Escribe una función que reciba un texto y retorne verdadero o
 * falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee
  * de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */

public class palindromo13{
	
	public static void main(String[] args) {
		
		String str1 = "ana";
		
		if(palindromo(str1)) {
			System.out.println("Es un palindromo.");
		}else {
			System.out.println("NO es un palindromo.");
		}
		
	}
	
	public static boolean palindromo(String cadena1) {
		
		String inversa="";
		cadena1=cadena1.toLowerCase();
		
		for(int i=cadena1.length()-1; i>=0; i--) {
			
			inversa+=cadena1.charAt(i);
			
		}
		
		if(cadena1.equals(inversa)) {
			return true;
		}
		
		return false;
		
	}

}