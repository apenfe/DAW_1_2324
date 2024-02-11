/*
 * Dado un string devolver todos los posibles substring
 */

package UDEMY;

public class Ejemplo46{
	
	public static void main (String[] args) {
		
		String palabra = "Hola";
		
		// h o l a
		// ho ol la
		// hol ola
		// hola
		
		//4+3+2+1
		
		substrings(palabra);
		
	}
	
	public static void substrings(String palabra){
		
		 int length = palabra.length();

	     for (int i = 0; i < length; i++) {
	    	 
	    	 for (int j = i + 1; j <= length; j++) {
	    		 
		         String substring = palabra.substring(i, j);
	             System.out.println(substring);
	             
	         }
	     }	
	}
	
}