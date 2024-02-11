package Moudev2022;

/*
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 *   o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */

public class codigoMorse10{
	
	public static void main(String[] args) {
		
		String natural = "Hola que tal";
		String morse = ".... --- .-.. .-  --.- ..- .  - .- .-..";
		System.out.println(codigoMorse(natural));
		System.out.println(codigoMorse(morse));
		
	}
	
	public static String codigoMorse(String mensaje) {
		
		mensaje=mensaje.trim().toLowerCase();
		
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String salida = "";
		
		if(mensaje.charAt(0)=='.'||mensaje.charAt(0)=='-') {
			
			String[] letras = new String[0];
			mensaje=mensaje.replaceAll("\\s{2}"," * ");
			letras = mensaje.split("\\s");
			
			for(int i=0; i<letras.length;i++) {
				
				if(letras[i].equals("*")) {
					salida+=" ";
				}else {
					
					for(int j=0; j<morse.length;j++) {
						if(letras[i].equals(morse[j])) {
							salida+=(char)(j+97);
							break;
						}
					}
				}
			}
			
		}else {
			
			for(int i=0; i<mensaje.length();i++) {
				
				if(mensaje.charAt(i)==' ') {
					salida+="  ";
				}else {
					salida+=morse[mensaje.charAt(i)-'a'];
					salida+=" ";
				}
			}
		}
		
		return salida;
		
	}

}