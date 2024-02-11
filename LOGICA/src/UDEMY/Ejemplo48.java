/*
 * Dado un string devolver las letras que aparecen una solo vez e indicar cual es la primera
 */

package UDEMY;

public class Ejemplo48{
	
	public static void main (String[] args) {
		
		String palabra = "frase frase HOY";
		
		System.out.println(soloUnaVez(palabra));
		
	}
	
	public static String soloUnaVez(String palabra){
		
		boolean check = false;
		String resultado ="";
		palabra=palabra.trim();
		palabra=palabra.replaceAll(" ", "");
	
		for(int i=0; i<palabra.length();i++) {
			
			char letra = palabra.charAt(i);
			
			for(int j=0; j<palabra.length();j++) {
				
				if(palabra.charAt(j)==letra&&i!=j) {
					check=true;
					break;
				}
				
			}
			
			if(check) {
				check=false;
			}else {
				resultado+=letra+", ";
			}
		}
		
		return resultado;
	}
	
}